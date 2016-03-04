package org.barberini.dev.java.repositories;

import javax.transaction.Transactional;
import org.barberini.dev.java.entities.Record;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface RecordRepository extends CrudRepository <Record, Long> 
{
	
}