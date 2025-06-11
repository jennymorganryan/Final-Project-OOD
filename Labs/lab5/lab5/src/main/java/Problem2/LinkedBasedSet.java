package Problem2;

import java.util.Arrays;
import java.util.Objects;

public class LinkedBasedSet implements Set {

    private SetNode headNode;
    private int numsSetElements;

    public LinkedBasedSet(SetNode headNode, int numsSetElements) {
        this.headNode = headNode;
        this.numsSetElements = numsSetElements;
    }

    private Integer[] toSortedArray() {
        Integer[] array = new Integer[this.numsSetElements];
        SetNode currentNode = headNode;
        int i = 0;
        while (currentNode != null) {
            array[i++] = currentNode.getValue();
            currentNode = currentNode.getNext();
        }
        return array;
    }

    public SetNode getHeadNode() {
        return headNode;
    }

    public int getNumsSetElements() {
        return numsSetElements;
    }

    @Override
    public Set add(Integer value) {
        SetNode newNode = new SetNode(value);
        if (headNode == null) {
            headNode = newNode;
        } else {
            SetNode currentNode = headNode;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }
        this.numsSetElements++;
        return this;
    }

    @Override
    public Set emptySet() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public Boolean isEmpty() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public Boolean contains(Integer value) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public Set remove(Integer value) {
        if (headNode == null) {
            return this;
        }

        // Handle removal of head node
        if (headNode.getValue().equals(value)) {
            headNode = headNode.getNext();
            numsSetElements--;
            return this;
        }

        SetNode previousNode = headNode;
        SetNode currentNode = headNode.getNext();

        while (currentNode != null) {
            if (currentNode.getValue().equals(value)) {
                previousNode.setNext(currentNode.getNext());
                numsSetElements--;
                break;
            }
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }

        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LinkedBasedSet that = (LinkedBasedSet) o;
        return numsSetElements == that.numsSetElements
                && Arrays.equals(this.toSortedArray(), that.toSortedArray());
    }

    @Override
    public int hashCode() {
        Integer[] array = toSortedArray();
        return Objects.hash(Arrays.hashCode(array), numsSetElements);
    }
}