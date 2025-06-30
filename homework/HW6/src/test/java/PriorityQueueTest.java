import Problem1.InvalidException;
import Problem1.PriorityQueue;
import Problem1.PriorityQueueInterface;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriorityQueueTest {

    PriorityQueue queue;

    @BeforeEach
    void setUp() {
        queue = PriorityQueueInterface.createEmpty();
        queue = queue.add(5, "Walk Milli");
        queue = queue.add(10, "Submit assignment");
        queue = queue.add(7, "Drive to Boston");
    }

    @Test
    void peek() throws InvalidException {
        assertEquals("Submit assignment", queue.peek());
    }

    @Test
    void isEmpty() {
        assertFalse(queue.isEmpty());
        PriorityQueue emptyQueue = PriorityQueueInterface.createEmpty();
        assertTrue(emptyQueue.isEmpty());
    }

    @Test
    void add() throws InvalidException {
        PriorityQueue newQueue = queue.add(12, "Prepare for internship");
        assertEquals("Prepare for internship", newQueue.peek());
    }

    @Test
    void pop() throws InvalidException {
        PriorityQueue poppedQueue = queue.pop();
        assertEquals("Drive to Boston", poppedQueue.peek());
        poppedQueue = poppedQueue.pop();
        assertEquals("Walk Milli", poppedQueue.peek());
        poppedQueue = poppedQueue.pop();
        assertTrue(poppedQueue.isEmpty());
    }
}
