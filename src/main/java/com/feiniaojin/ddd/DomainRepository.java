package com.feiniaojin.ddd;

/**
 * 
 * @param <E>   实体的具体类型
 * @param <E_ID_RAW_TYPE> 实体对应的EntityId的实际类型，例如Integer/Long/String
 */
public interface DomainRepository<E, E_ID_RAW_TYPE> {

    E load(EntityId<E_ID_RAW_TYPE> entityId);

    void save(E e);
}
