package com.feiniaojin.ddd;

import java.util.List;

/**
 * 实体
 */
public interface Entity {

    /**
     * 抽取已发生的领域事件
     * @return
     */
    List<DomainEvent> domainEvents();
}
