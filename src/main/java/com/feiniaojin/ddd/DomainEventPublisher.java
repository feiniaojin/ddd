package com.feiniaojin.ddd;

import java.util.List;

public interface DomainEventPublisher<T extends DomainEvent> {

    void publish(List<T> list);
}
