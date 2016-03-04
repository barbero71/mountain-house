package org.barberini.dev.java.controllers;


import java.sql.Timestamp;
import java.time.LocalDateTime;
import org.barberini.dev.java.entities.Command;
import org.barberini.dev.java.entities.Record;
import org.barberini.dev.java.repositories.CommandRepository;
import org.barberini.dev.java.repositories.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class RestRecordController {
    @Autowired
    private RecordRepository recordRepository;
    @Autowired
    private CommandRepository commandRepository;

    @RequestMapping(value={"/record"}, method={RequestMethod.POST})
    public String item(@RequestParam(value="temp", defaultValue="0") double temp, @RequestParam(value="humid", defaultValue="0") double humid) {
        Record record = null;
        try {
            LocalDateTime localDateTime = LocalDateTime.now();
            Timestamp timestamp = Timestamp.valueOf(localDateTime);
            record = new Record(1, temp, humid, timestamp);
            System.out.println(localDateTime + " --- " + timestamp);
            this.recordRepository.save(record);
        }
        catch (Exception ex) {
            return "Error creating record";
        }
        return "Record succesfully created!";
    }

    @RequestMapping(value={"/command"}, method={RequestMethod.GET})
    public Iterable<Command> readCommand() {
        return this.commandRepository.getById();
    }

    @RequestMapping(value={"/command/{id}"}, method={RequestMethod.DELETE})
    public String commandExecuted(@PathVariable(value="id") int itemId) {
        Command command = null;
        command = new Command(itemId);
        this.commandRepository.delete(command);
        return "Record successfully deleted!";
    }
}
