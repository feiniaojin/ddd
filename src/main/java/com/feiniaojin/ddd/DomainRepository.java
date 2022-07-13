package com.feiniaojin.ddd;

public interface DomainRepository<D, ID_TYPE> {

    D load(EntityId<ID_TYPE> entityId);

    void save(Entity entity);
}
