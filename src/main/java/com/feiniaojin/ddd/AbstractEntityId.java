package com.feiniaojin.ddd;

public abstract class AbstractEntityId<T> implements EntityId<T> {

    private T value;

    public AbstractEntityId() {
    }

    public AbstractEntityId(T value) {
        this.value = value;
    }

    public void setValue(T t) {
        this.value = t;
    }

    @Override
    public T getValue() {
        return this.value;
    }
}
