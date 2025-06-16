package Problem2;
import Problem2.Polynomial;

public interface PolynomialInterface {
    int getDegree() throws ZeroException;
    int getCoefficient(int power) throws ZeroException;
    void addTerm(int coefficient, char variable,  int degree) throws ZeroException;
    void removeTerm(int power);
    Polynomial add(Polynomial other) throws ZeroException;
    String printPolynomial();
}


