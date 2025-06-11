package Problem2;

import java.util.Objects;

public class SetNode {

    private Integer value;
    private SetNode next;
    private Integer currentValue;

    public SetNode(Integer value, SetNode next) {
        this.value = value;
        this.next = next;
    }

    public SetNode getNext() {
        return next;
    }

    public Integer getValue() {
        return value;
    }

    public void setNext(SetNode next) {
        this.next = next;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SetNode setNode = (SetNode) o;
        return Objects.equals(value, setNode.value) && Objects.equals(next, setNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, next);
    }
}
