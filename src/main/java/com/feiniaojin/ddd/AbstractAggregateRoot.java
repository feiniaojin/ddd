package com.feiniaojin.ddd;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractAggregateRoot extends AbstractDomainMask {
    private List<DomainEvent> events = new ArrayList<>();

    public List<DomainEvent> getEvents() {
        return events;
    }

    protected void registerDomainEvents(DomainEvent event) {
        this.events.add(event);
    }

    protected void registerDomainEvents(List<DomainEvent> events) {
        this.events.addAll(events);
    }
}
