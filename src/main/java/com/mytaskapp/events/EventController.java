package com.mytaskapp.events;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {
    private final OrganizerRepository organizerRepository;

    public EventController(OrganizerRepository organizerRepository) {
        this.organizerRepository = organizerRepository;
    }

    // @RequestMapping(method = RequestMethod.GET, path = "/organizers")
    @GetMapping(path = "/organizers")
    public List<Organizer> getOrganizers() {
        return organizerRepository.findAll();
    }
}
