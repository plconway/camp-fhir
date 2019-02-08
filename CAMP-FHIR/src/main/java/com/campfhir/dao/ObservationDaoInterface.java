package com.campfhir.dao;

import java.io.Serializable;
import java.util.List;

import com.campfhir.model.Lab;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-02-08 
*/
public interface ObservationDaoInterface<T, Id extends Serializable> {

	public void persist(T entity);
	
	public void update(T entity);
	
	public T findById(Id id);
	
	public void delete(T entity);
	
	public List<Lab> findAllLab();
	
	public void deleteAll();
	
}
