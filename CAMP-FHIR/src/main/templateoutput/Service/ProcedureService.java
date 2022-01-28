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
import main.java.com.campfhir.dao.ProcedureDao;
import main.java.com.campfhir.service.conversion.ProcedureConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Procedure.
 * @see .Procedure
 * @author Paul Kovach
 */

public class ProcedureService {

	private static ProcedureDao ProcedureDao;
	private static ProcedureConversion ProcedureConversion;

	public ProcedureService() 
	{
		ProcedureDao = new ProcedureDao();
		ProcedureConversion = new ProcedureConversion();
	}

	public void persist(main.java.com.campfhir.model.Procedure entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ProcedureDao.openCurrentSessionwithTransaction();
		 ProcedureDao.persist(entity);
		 ProcedureDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Procedure entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ProcedureDao.openCurrentSessionwithTransaction();
		 ProcedureDao.update(entity);
		 ProcedureDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Procedure findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ProcedureDao.openCurrentSession();
		main.java.com.campfhir.model.Procedure resource = ProcedureDao.findById(id);
		ProcedureDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Procedure> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ProcedureDao.openCurrentSession();
		List<main.java.com.campfhir.model.Procedure> resource =  ProcedureDao.findByPatientId(id);
		ProcedureDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ProcedureDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Procedure resource =  ProcedureDao.findById(id);
		ProcedureDao.delete(resource);
		ProcedureDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  ProcedureDao.openCurrentSession();
		ScrollableResults resources =  ProcedureDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Procedure.html")  			   
			   .setResource(ProcedureConversion.Procedures((main.java.com.campfhir.model.Procedure) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  ProcedureDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Procedure> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  ProcedureDao.findAll();
		List<main.java.com.campfhir.model.Procedure> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Procedure) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 ProcedureDao.openCurrentSessionwithTransaction();
		 ProcedureDao.deleteAll();
		 ProcedureDao.closeCurrentSessionwithTransaction();
	}

	public ProcedureDao  ProcedureDao() 
	{
		return  ProcedureDao;
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

