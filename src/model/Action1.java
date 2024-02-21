package model;

@FunctionalInterface
public interface Action1<T>
{
    void invoke(T param);
}
