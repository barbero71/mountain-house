package org.barberini.dev.java.repositories;

import java.util.List;
import javax.transaction.Transactional;
import org.barberini.dev.java.entities.Command;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Transactional
public interface CommandRepository extends JpaRepository <Command, Long> 
{
    @Query(value="select c from Command c where c.id=(select min(c.id) from c where c.ack=0)")
    public List<Command> getById();
}
