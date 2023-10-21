package com.feiniaojin.ddd;

/**
 * 
 * @param <E>   实体的具体类型
 * @param <E_ID> 实体对应的EntityId的实际类型
 */
public interface DomainRepository<E, E_ID extends EntityId> {

    E load(E_ID entityId);

    void save(E e);
}
