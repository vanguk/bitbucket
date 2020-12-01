package com.main;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class MyIntegerCollection {
    private Integer[] mas;
    private int capacity;
    private int size = 0;


    public double arithmeticAverage() {
        Integer arf = 0;
        for (Integer item : mas) {
            if (item != null) arf += item;
        }

        return (double) arf / (double) size;

    }

    public void add(Integer integer) {
        if (integer != null) {
            increaseCapacity();
            mas[size] = integer;
            size++;
        }
    }

    public int indexOf(Integer integer) {
        for (int i = 0; i < capacity; i++) {
            if (mas[i] != null && mas[i].equals(integer)) return i;
        }
        return -1;
    }

    public Integer valueOf(int index) {
        return mas[index];
    }

    public Integer maxElement() {
        int temp = mas[0];
        int maxElem = 0;
        for (int i = 1; i < capacity; i++) {
            if (mas[i] != null) {
                if (temp < this.mas[i]) {
                    temp = mas[i];
                    maxElem = temp;
                }
            }
        }
        return maxElem;
    }

    public Integer minElement() {
        int temp = mas[0];
        int maxElem = 0;
        for (int i = 1; i < capacity; i++) {
            if (mas[i] != null) {
                if (temp > this.mas[i]) {
                    temp = mas[i];
                    maxElem = temp;
                }
            }
        }
        return maxElem;
    }

    public void addAndPlusAll(Integer integer) {
        if (integer != null) {
            for (int i = 0; i < size; i++) {
                mas[i] += integer;
            }
            add(integer);
        }
    }

    public void remove() {
        mas[size - 1] = null;
        size--;
    }

    public void removeAndMinusAll() {
        for (int i = 0; i < size; i++) {
            mas[i] -= mas[size - 1];
        }
        remove();
    }

    private void increaseCapacity() {
        if (isFull()) {
            this.mas = Arrays.copyOf(mas, (int) (capacity * 1.5));
            this.capacity = mas.length;
        }
    }

    public boolean isFull() {
        if (capacity == size) return true;
        else return false;
    }

    private MyIntegerCollection(Integer[] mas, int capacity) {

    }

    public MyIntegerCollection() {
        this.mas = new Integer[16];
        this.capacity = mas.length;
    }

    public MyIntegerCollection(int capacity) {
        this.mas = new Integer[capacity];
        this.capacity = mas.length;
    }

    public MyIntegerCollection(@NotNull MyIntegerCollection mas) {
        this.mas = mas.getMas();
        this.capacity = mas.getCapacity();
        this.size = mas.getSize();
    }

    public void setMas(Integer[] mas) {
        this.mas = mas;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Integer[] getMas() {
        return mas;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }
}
