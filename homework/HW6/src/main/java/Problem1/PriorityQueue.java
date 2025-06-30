package Problem1;

import java.util.Objects;

/**
 * The type Priority queue.
 */
public class PriorityQueue implements PriorityQueueInterface {

    protected Integer priority;
    protected String priorityCode;
    protected PriorityQueueInterface rest;

    /**
     * Instantiates a new Priority queue.
     *
     * @param priority     the priority as an integer number
     * @param priorityCode the priority code as a string statement
     * @param rest         the rest as a PriorityQueueInterface child
     */
//nonempty Queue
    public PriorityQueue(Integer priority, String priorityCode, PriorityQueueInterface rest) {
        this.priority = priority;
        this.priorityCode = priorityCode;
        this.rest = rest;
    }

    /**
     * Instantiates a new Priority queue.
     */
//empty Queue
    public PriorityQueue() {
        this.priority = null;
        this.priorityCode = null;
        this.rest = null;
    }

    /**
     * Pop highest recursive priority queue.
     *
     * @param highestPriority the highest priority
     * @return the priority queue
     */
    PriorityQueue popHighestRecursive(int highestPriority) {
        if (isEmpty()) {
            return new PriorityQueue();
        }
        if (priority == highestPriority) {
            return (PriorityQueue) rest;
        }
        PriorityQueue casted = (PriorityQueue) rest;
        return new PriorityQueue(priority, priorityCode, casted.popHighestRecursive(highestPriority));
    }

    /**
     * Peek string.
     *
     * @return the string
     * @throws InvalidException the invalid exception
     */
    public String peek() throws InvalidException {
        if (isEmpty()) {
            throw new InvalidException("Cannot peek an empty queue");
        }
        String highestValue = priorityCode;
        int highestPriority = priority;
        PriorityQueue current = (PriorityQueue) rest;
        while (current != null && !current.isEmpty()) {
            if (current.priority > highestPriority) {
                highestPriority = current.priority;
                highestValue = current.priorityCode;
            }
            current = (PriorityQueue) current.rest;
        }
        return highestValue;
    }

    @Override
    public boolean isEmpty() {
        return priority == null;
    }

    @Override
    public PriorityQueue add(Integer priority, String value) {
        return new PriorityQueue(priority, value, this);
    }


// Had AI assistance with this method!!
    @Override
    public PriorityQueue pop() throws InvalidException {
        if (isEmpty()) {
            throw new InvalidException("Unable to pop from an empty queue");
        }

        int highestPriority = priority;
        PriorityQueue current = (PriorityQueue) rest;

        while (current != null && !current.isEmpty()) {
            if (current.priority > highestPriority) {
                highestPriority = current.priority;
            }
            current = (PriorityQueue) current.rest;
        }

        if (this.priority == highestPriority) {
            return (PriorityQueue) rest;
        } else {
            PriorityQueue casted = (PriorityQueue) rest;
            return new PriorityQueue(priority, priorityCode, casted.popHighestRecursive(highestPriority));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PriorityQueue that)) return false;
        return Objects.equals(priority, that.priority) && Objects.equals(priorityCode, that.priorityCode) && Objects.equals(rest, that.rest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priority, priorityCode, rest);
    }

    @Override
    public String toString() {
        return "PriorityQueue{" +
                "priority=" + priority +
                ", priorityCode='" + priorityCode + '\'' +
                ", rest=" + rest +
                '}';
    }
}
