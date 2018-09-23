package com.demo.ea.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.demo.ea.model.PeopleModel;
@Repository
public interface PeopleRepository extends CrudRepository<PeopleModel,Integer> {

	List<PeopleModel> findPeopleById(Integer Id);
	
}
