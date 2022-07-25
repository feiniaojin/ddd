package com.feiniaojin.ddd;

public interface DomainRepository<D, DOMAIN_ID_TYPE> {

    D load(EntityId<DOMAIN_ID_TYPE> entityId);

    void save(Entity entity);
}
