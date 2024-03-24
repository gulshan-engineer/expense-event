package com.gulshan.expenseevent.repository;

import com.gulshan.expenseevent.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
