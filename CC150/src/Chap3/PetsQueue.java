package Chap3;
import java.util.*;
public class PetsQueue {
    private Map<Class<? extends Animal>, Deque<Animal>> map;
    private int order;
    public PetsQueue() {
        map = new HashMap<>();
        order = 0;
    }
    public synchronized void enqueue(Animal pet) {
        Class<? extends Animal> c = pet.getClass();
        pet.order = order;
        order++;
        map.putIfAbsent(c, new ArrayDeque<>());
        map.get(c).offer(pet);
    }
    public synchronized Animal dequeueAny() {
        Class<? extends Animal> minClass = null;
        int min = Integer.MAX_VALUE;
        for(Map.Entry<Class<? extends Animal>, Deque<Animal>> entry :
                map.entrySet()) {
            Animal pet = entry.getValue().peek();
            if(pet!= null && pet.order < min) {
                min = pet.order;
                minClass = entry.getKey();
            }
        }
        return map.get(minClass).pop();
    }
    @SuppressWarnings("unchecked")
    public synchronized <T extends Animal> T dequeue(Class<T> pet) {
        return (T)map.get(pet).pop();
    }
}
abstract class Animal {
    int order;
    String name;
}
class Cat extends Animal {
    Cat(String n) {
        name = n;
    }
}
class Dog extends Animal {
    Dog(String n) {
        name = n;
    }
}
    

