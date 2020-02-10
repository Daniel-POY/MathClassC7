package jugar.mcm.edu.ph.mathclassc7;

public class Math {
    double firstDouble, secondDouble, answerDouble;
    int firstInt, secondInt, answerInt;
    String firstString;

    public Math(String firstString, double firstDouble, double secondDouble) {
        this.firstString = firstString;
        this.firstDouble = firstDouble;
        this.secondDouble = secondDouble;

        if (firstString.equals("a")) {
            this.answerDouble = firstDouble/secondDouble;
        } else if (firstString.equals("b")) {
            this.answerDouble = firstDouble*secondDouble;
        }
    }

    public Math(int firstInt, int secondInt) {
        this.firstInt = firstInt;
        this.secondInt = secondInt;
        this.answerInt = firstInt + secondInt;
    }

    public Math(String firstString) {
        this.firstString = firstString;
    }
}
