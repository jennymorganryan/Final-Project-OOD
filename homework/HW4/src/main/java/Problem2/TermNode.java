package Problem2;

/**
 * The type Term node.
 */
public class TermNode {
    /**
     * The Coefficient.
     */
    protected int coefficient;
    /**
     * The Degree.
     */
    protected int degree;
    /**
     * The Variable.
     */
    protected char variable;
    /**
     * The Next.
     */
    TermNode next;

    /**
     * Instantiates a new Term node.
     *
     * @param coefficient the coefficient as an integer
     * @param variable    the variable as a char
     * @param degree      the degree as an integer
     * @param next        the next as a Node
     */
    public TermNode(int coefficient,  char variable, int degree,TermNode next) {
        this.coefficient = coefficient;
        this.variable = variable;
        this.degree = degree;
        this.next = next;
    }
}
