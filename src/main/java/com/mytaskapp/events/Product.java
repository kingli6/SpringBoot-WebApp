package com.mytaskapp.events;

import java.math.BigDecimal;

// this would be a ticket for people to purchase
public record Product(
        int id,
        int eventId,
        String name,
        String description,
        BigDecimal price) {

}
