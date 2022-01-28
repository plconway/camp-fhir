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
import main.java.com.campfhir.dao.TestreportDao;
import main.java.com.campfhir.service.conversion.TestreportConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Testreport.
 * @see .Testreport
 * @author Paul Kovach
 */

public class TestreportService {

	private static TestreportDao TestreportDao;
	private static TestreportConversion TestreportConversion;

	public TestreportService() 
	{
		TestreportDao = new TestreportDao();
		TestreportConversion = new TestreportConversion();
	}

	public void persist(main.java.com.campfhir.model.Testreport entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 TestreportDao.openCurrentSessionwithTransaction();
		 TestreportDao.persist(entity);
		 TestreportDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Testreport entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 TestreportDao.openCurrentSessionwithTransaction();
		 TestreportDao.update(entity);
		 TestreportDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Testreport findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		TestreportDao.openCurrentSession();
		main.java.com.campfhir.model.Testreport resource = TestreportDao.findById(id);
		TestreportDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Testreport> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		TestreportDao.openCurrentSession();
		List<main.java.com.campfhir.model.Testreport> resource =  TestreportDao.findByPatientId(id);
		TestreportDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		TestreportDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Testreport resource =  TestreportDao.findById(id);
		TestreportDao.delete(resource);
		TestreportDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  TestreportDao.openCurrentSession();
		ScrollableResults resources =  TestreportDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Testreport.html")  			   
			   .setResource(TestreportConversion.Testreports((main.java.com.campfhir.model.Testreport) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  TestreportDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Testreport> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  TestreportDao.findAll();
		List<main.java.com.campfhir.model.Testreport> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Testreport) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 TestreportDao.openCurrentSessionwithTransaction();
		 TestreportDao.deleteAll();
		 TestreportDao.closeCurrentSessionwithTransaction();
	}

	public TestreportDao  TestreportDao() 
	{
		return  TestreportDao;
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

