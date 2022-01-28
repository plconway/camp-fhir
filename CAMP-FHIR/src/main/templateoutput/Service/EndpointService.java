//// default package
package main.templateoutput.Service;

// Generated on Jan 28, 2022, 7:59:48 AM 


import ca.uhn.fhir.context.FhirContext;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import main.java.com.campfhir.dao.EndpointDao;
import main.java.com.campfhir.service.conversion.EndpointConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Endpoint.
 * @see .Endpoint
 * @author Paul Kovach
 */

public class EndpointService {

	private static EndpointDao EndpointDao;
	private static EndpointConversion EndpointConversion;

	public EndpointService() 
	{
		EndpointDao = new EndpointDao();
		EndpointConversion = new EndpointConversion();
	}

	public void persist(main.java.com.campfhir.model.Endpoint entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 EndpointDao.openCurrentSessionwithTransaction();
		 EndpointDao.persist(entity);
		 EndpointDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Endpoint entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 EndpointDao.openCurrentSessionwithTransaction();
		 EndpointDao.update(entity);
		 EndpointDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Endpoint findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		EndpointDao.openCurrentSession();
		main.java.com.campfhir.model.Endpoint resource = EndpointDao.findById(id);
		EndpointDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Endpoint> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		EndpointDao.openCurrentSession();
		List<main.java.com.campfhir.model.Endpoint> resource =  EndpointDao.findByPatientId(id);
		EndpointDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		EndpointDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Endpoint resource =  EndpointDao.findById(id);
		EndpointDao.delete(resource);
		EndpointDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  EndpointDao.openCurrentSession();
		ScrollableResults resources =  EndpointDao.findAll();
		
	     int i = 0;
	     System.out.println("start");
	     Bundle bundle = new Bundle().setType(BundleType.COLLECTION);
	     

	     while ( resources.next() ) 
	     {	
			if ((i % partition) == 0)
			{
				session.clear();
				
		    	writeFile(path, i, bundle);
			    bundle = new Bundle().setType(BundleType.COLLECTION);
			}
			
			i++;
			
			bundle.addEntry()
			   .setFullUrl("https://www.hl7.org/fhir/Endpoint.html")  			   
			   .setResource(EndpointConversion.Endpoints((main.java.com.campfhir.model.Endpoint) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  EndpointDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Endpoint> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  EndpointDao.findAll();
		List<main.java.com.campfhir.model.Endpoint> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Endpoint) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 EndpointDao.openCurrentSessionwithTransaction();
		 EndpointDao.deleteAll();
		 EndpointDao.closeCurrentSessionwithTransaction();
	}

	public EndpointDao  EndpointDao() 
	{
		return  EndpointDao;
	}
	
	public static void writeFile(String path, int domain, Bundle bundle)
	{			
	    
		
		try 
		{
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path+"/"+domain+".json", true), StandardCharsets.UTF_8));
			
			String file = FhirContext.forR4().newJsonParser().setPrettyPrint(false).encodeResourceToString(bundle);			
			
		    writer.write(file);
		    writer.close();

		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}

	    
	}
}

