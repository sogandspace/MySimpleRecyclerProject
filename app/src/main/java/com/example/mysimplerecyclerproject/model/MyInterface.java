package com.example.mysimplerecyclerproject.model;

public interface MyInterface<T> {
    void onSuccessful(T data);

    void onError(String message);
}
