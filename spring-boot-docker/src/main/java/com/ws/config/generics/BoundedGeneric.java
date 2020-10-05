package com.ws.config.generics;

import com.ws.config.generics.model.Animal;

/**
 * Created by vikas on 13-06-2019.
 */
public abstract  class BoundedGeneric<T extends Animal & Comparable> {
    abstract void addAnimal(T animal);
}
