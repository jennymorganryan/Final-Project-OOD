package Problem1;

public interface PriorityQueueInterface {
    boolean isEmpty();
    PriorityQueue add(Integer priority,String value);
    PriorityQueue pop() throws InvalidException;

    static PriorityQueue createEmpty() {
        return new PriorityQueue();
    }
}
