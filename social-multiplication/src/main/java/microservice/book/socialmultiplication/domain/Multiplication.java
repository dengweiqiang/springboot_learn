package microservice.book.socialmultiplication.domain;

import java.util.StringJoiner;

/**
 * Created by dengweiqiang on 2021/3/5
 */
public class Multiplication {
    // Both factors
    private int factorA;
    private int factorB;
    // The result of the operation A * B
    private int result;

    public Multiplication(int factorA, int factorB) {
        this.factorA = factorA;
        this.factorB = factorB;
        this.result = factorA * factorB;
    }

    public int getFactorA() {
        return factorA;
    }

    public void setFactorA(int factorA) {
        this.factorA = factorA;
    }

    public int getFactorB() {
        return factorB;
    }

    public void setFactorB(int factorB) {
        this.factorB = factorB;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Multiplication.class.getSimpleName() + "[", "]")
                .add("factorA=" + factorA)
                .add("factorB=" + factorB)
                .add("result=" + result)
                .toString();
    }
}
