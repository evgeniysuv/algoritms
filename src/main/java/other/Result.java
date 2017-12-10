package other;

import com.sun.tools.javac.util.Pair;
import lombok.ToString;

@ToString
class Result {
    private double x1;
    private double x2;

    private boolean hasDecision = true;

    public Result(boolean hasDecision) {
        this.hasDecision = hasDecision;
    }

    public Result(double x) {
        x1 = x;
    }

    public Result(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public boolean isHasDecision() {
        return hasDecision;
    }

    public Pair<Double, Double> getResult() {
        if (hasDecision)
            return new Pair<>(x1, x2);
        return null;
    }
}
