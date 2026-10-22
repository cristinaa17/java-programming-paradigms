package ex2;

class DoubleCalculator extends ACalculator {
    public DoubleCalculator(double state) {
        this.state = state;
    }

    @Override
    protected void init() {
        this.state = 0.0;
    }

    public DoubleCalculator add(double value) {
        this.state = (Double) this.state + value;
        return this;
    }

    public DoubleCalculator subtract(double value) {
        this.state = (Double) this.state - value;
        return this;
    }

    public DoubleCalculator multiply(double value) {
        this.state = (Double) this.state * value;
        return this;
    }

    public DoubleCalculator divide(double value) {
        if (value == 0.0) {
            throw new ArithmeticException("Division by zero");
        }
        this.state = (Double) this.state / value;
        return this;
    }
}