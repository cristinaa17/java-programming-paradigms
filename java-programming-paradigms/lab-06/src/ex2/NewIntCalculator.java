package ex2;

class NewIntCalculator extends ACalculator {
    public NewIntCalculator(int state) {
        this.state = state;
    }

    @Override
    protected void init() {
        this.state = 0;
    }

    public NewIntCalculator add(int value) {
        this.state = (Integer) this.state + value;
        return this;
    }

    public NewIntCalculator subtract(int value) {
        this.state = (Integer) this.state - value;
        return this;
    }

    public NewIntCalculator multiply(int value) {
        this.state = (Integer) this.state * value;
        return this;
    }
    public NewIntCalculator divide(int value) {
        if (value == 0) {
            throw new ArithmeticException("Division by zero");
        }
        this.state = (Integer) this.state / value;
        return this;
    }
}

