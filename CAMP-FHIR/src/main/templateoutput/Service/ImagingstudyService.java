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
import main.java.com.campfhir.dao.ImagingstudyDao;
import main.java.com.campfhir.service.conversion.ImagingstudyConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Imagingstudy.
 * @see .Imagingstudy
 * @author Paul Kovach
 */

public class ImagingstudyService {

	private static ImagingstudyDao ImagingstudyDao;
	private static ImagingstudyConversion ImagingstudyConversion;

	public ImagingstudyService() 
	{
		ImagingstudyDao = new ImagingstudyDao();
		ImagingstudyConversion = new ImagingstudyConversion();
	}

	public void persist(main.java.com.campfhir.model.Imagingstudy entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ImagingstudyDao.openCurrentSessionwithTransaction();
		 ImagingstudyDao.persist(entity);
		 ImagingstudyDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Imagingstudy entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ImagingstudyDao.openCurrentSessionwithTransaction();
		 ImagingstudyDao.update(entity);
		 ImagingstudyDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Imagingstudy findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ImagingstudyDao.openCurrentSession();
		main.java.com.campfhir.model.Imagingstudy resource = ImagingstudyDao.findById(id);
		ImagingstudyDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Imagingstudy> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ImagingstudyDao.openCurrentSession();
		List<main.java.com.campfhir.model.Imagingstudy> resource =  ImagingstudyDao.findByPatientId(id);
		ImagingstudyDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ImagingstudyDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Imagingstudy resource =  ImagingstudyDao.findById(id);
		ImagingstudyDao.delete(resource);
		ImagingstudyDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  ImagingstudyDao.openCurrentSession();
		ScrollableResults resources =  ImagingstudyDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Imagingstudy.html")  			   
			   .setResource(ImagingstudyConversion.Imagingstudys((main.java.com.campfhir.model.Imagingstudy) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  ImagingstudyDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Imagingstudy> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  ImagingstudyDao.findAll();
		List<main.java.com.campfhir.model.Imagingstudy> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Imagingstudy) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 ImagingstudyDao.openCurrentSessionwithTransaction();
		 ImagingstudyDao.deleteAll();
		 ImagingstudyDao.closeCurrentSessionwithTransaction();
	}

	public ImagingstudyDao  ImagingstudyDao() 
	{
		return  ImagingstudyDao;
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

