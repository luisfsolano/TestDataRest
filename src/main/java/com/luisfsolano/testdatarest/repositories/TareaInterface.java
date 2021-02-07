package com.luisfsolano.testdatarest.repositories;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.luisfsolano.testdatarest.beans.Tarea;

@RepositoryRestResource(collectionResourceRel = "tareas", path = "tareas")
public interface TareaInterface extends PagingAndSortingRepository<Tarea, Long> {

	List<Tarea> findByShortNameLike(@Param("name") String name);
	
}
