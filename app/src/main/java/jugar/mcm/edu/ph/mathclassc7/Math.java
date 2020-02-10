package jugar.mcm.edu.ph.mathclassc7;

public class Math {
    double firstDouble, secondDouble;
    int firstInt, secondInt;
    String firstString;

    public Math(String firstString, double firstDouble, double secondDouble) {
        this.firstString = firstString;
        this.firstDouble = firstDouble;
        this.secondDouble = secondDouble;
    }

    public Math(int firstInt, int secondInt) {
        this.firstInt = firstInt;
        this.secondInt = secondInt;
    }

    public Math(String firstString) {
        this.firstString = firstString;
    }
}
