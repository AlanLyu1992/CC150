package Chap3;
import java.util.*;
public class PetsQueue {
    Map<Class<? extends Animal>, Deque<? extends Animal>> map;
    int order;
    public PetsQueue() {
        map = new HashMap<>();
        order = 0;
    }
    public <T extends Animal> void enqueue(T pet) {
        Class<?> c = pet.getClass();
        pet.order = order;
        order++;
        map.putIfAbsent(c, new ArrayDeque<>());
        map.get(c).push(pet);
    }
    public Animal dequeueAny() {
        Class<?> minClass = null;
        int min = Integer.MAX_VALUE;
        for(Map.Entry entry : map.entrySet()) {
            int ord = entry.getValue().peek().order;
            if(ord < min) {
                min = ord;
                minClass = entry.getKey();
            }
        }
        return map.get(minClass).pop();
    }
    public <T extends Animal> T dequeue(Class<T> pet) {
        return map.get(pet).pop();
    }
}
abstract class Animal {
    int order;
    Animal(int ord) {
        order = ord;
    }
}
class Cat extends Animal {
    Cat(int ord) {
        super(ord);
    }
}
class Dog extends Animal {
    Dog(int ord) {
        super(ord);
    }
}
    

