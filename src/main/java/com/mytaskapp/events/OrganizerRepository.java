package com.mytaskapp.events;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizerRepository extends JpaRepository<Organizer, Integer> {
}
//// http://localhost:8080/organizers

// For other repos
// https://app.pluralsight.com/ilx/video-courses/a9b638e4-bb07-4cee-82f4-a2b93d5b8866/3e9835d1-6e6d-4384-891f-b513a7d19147/2166387c-7247-464f-b31e-edcdd0c3f06b