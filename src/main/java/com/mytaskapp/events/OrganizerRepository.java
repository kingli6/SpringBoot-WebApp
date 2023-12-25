package com.mytaskapp.events;

import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class OrganizerRepository {

    private final List<Organizer> organizers = List.of(
            new Organizer(101, "Organizer kommun", "Kommun of Övik"),
            new Organizer(102, "Organizer City", "Kommun of Stockholm"));

    public List<Organizer> findAll() {
        return organizers;
    }
}

// For other repos
// https://app.pluralsight.com/ilx/video-courses/a9b638e4-bb07-4cee-82f4-a2b93d5b8866/3e9835d1-6e6d-4384-891f-b513a7d19147/2166387c-7247-464f-b31e-edcdd0c3f06b