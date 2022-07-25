package com.feiniaojin.ddd;

import java.util.List;

/**
 * 实体
 */
public interface Entity {

    /**
     * 抽取已发生的领域事件，调用之后会将领域模型内的事件清空
     *
     * @return
     */
    List<DomainEvent> domainEvents();
}
