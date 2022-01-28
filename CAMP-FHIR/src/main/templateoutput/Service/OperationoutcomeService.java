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
import main.java.com.campfhir.dao.OperationoutcomeDao;
import main.java.com.campfhir.service.conversion.OperationoutcomeConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Operationoutcome.
 * @see .Operationoutcome
 * @author Paul Kovach
 */

public class OperationoutcomeService {

	private static OperationoutcomeDao OperationoutcomeDao;
	private static OperationoutcomeConversion OperationoutcomeConversion;

	public OperationoutcomeService() 
	{
		OperationoutcomeDao = new OperationoutcomeDao();
		OperationoutcomeConversion = new OperationoutcomeConversion();
	}

	public void persist(main.java.com.campfhir.model.Operationoutcome entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 OperationoutcomeDao.openCurrentSessionwithTransaction();
		 OperationoutcomeDao.persist(entity);
		 OperationoutcomeDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Operationoutcome entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 OperationoutcomeDao.openCurrentSessionwithTransaction();
		 OperationoutcomeDao.update(entity);
		 OperationoutcomeDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Operationoutcome findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		OperationoutcomeDao.openCurrentSession();
		main.java.com.campfhir.model.Operationoutcome resource = OperationoutcomeDao.findById(id);
		OperationoutcomeDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Operationoutcome> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		OperationoutcomeDao.openCurrentSession();
		List<main.java.com.campfhir.model.Operationoutcome> resource =  OperationoutcomeDao.findByPatientId(id);
		OperationoutcomeDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		OperationoutcomeDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Operationoutcome resource =  OperationoutcomeDao.findById(id);
		OperationoutcomeDao.delete(resource);
		OperationoutcomeDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  OperationoutcomeDao.openCurrentSession();
		ScrollableResults resources =  OperationoutcomeDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Operationoutcome.html")  			   
			   .setResource(OperationoutcomeConversion.Operationoutcomes((main.java.com.campfhir.model.Operationoutcome) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  OperationoutcomeDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Operationoutcome> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  OperationoutcomeDao.findAll();
		List<main.java.com.campfhir.model.Operationoutcome> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Operationoutcome) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 OperationoutcomeDao.openCurrentSessionwithTransaction();
		 OperationoutcomeDao.deleteAll();
		 OperationoutcomeDao.closeCurrentSessionwithTransaction();
	}

	public OperationoutcomeDao  OperationoutcomeDao() 
	{
		return  OperationoutcomeDao;
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

