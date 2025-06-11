package Problem2;

import java.util.Arrays;
import java.util.Objects;

public class ArrayBasedSet implements Set{

    private Integer[] set;
    private int setSize;
    private static final int INITIAL_CAPACITY = 10;

    public ArrayBasedSet(Integer[] set, int setSize) {
        this.set = set;
        this.setSize = setSize;
    }
    private boolean checkSize() {
        return (this.set.length <= this.setSize);
    }
    private Integer[] resizeSet() {
        int newSetSize = this.setSize * 2;
        Integer[] newSet = new Integer[newSetSize];
        this.copyArray(this.set, newSetSize);
        return newSet;
    }
//todo
    private void copyArray(Integer[] fromSet, Integer[] toSet) {
        for (int i = 0; i < fromSet.length ; i++) {
            toSet[i] = set[i];
        }
    }
//todo
    @Override
    public Set add(Integer value) {
        //sets dont allow duplicates
        if (this.contains(value)) {
            return this;
        } else {
            if (this.checkSize()) {
                this.set[setSize] = value;
                this.setSize++;
            }
        }
        return null;
    }

    @Override
    public Set emptySet() {
        return new ArrayBasedSet();
    }

    @Override
    public Boolean isEmpty() {
        return null;
    }

    @Override
    public Boolean contains(Integer value) {
        for (int i = 0; i < setSize; i++) {
            if (set[i].equals(value)) {
                return true;
            }
        return false;
        };
    }

    @Override
    public Set remove(Integer value) {
        for (int i = 0; i < setSize; i++) {
            if (set[i].equals(value)) {
                // Remove element
                for (int j = i; j < setSize; j++) {
                    this.set[j] = this.set[j + 1];
                }
            }
        }
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ArrayBasedSet that = (ArrayBasedSet) o;
        return setSize == that.setSize && Objects.deepEquals(set, that.set);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Arrays.hashCode(set), setSize);
    }
//helper copy method
}
