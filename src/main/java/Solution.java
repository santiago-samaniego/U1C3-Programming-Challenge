public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    private String calcModel;
    private int idNumber;

    public Solution(String model, int id) {
        calcModel = model;
        idNumber = id;
    }

    public Solution(int id) {
        idNumber = id;
    }

    public String getCalcModel() {
        if (calcModel == null) {
            calcModel = "TI-84";
        }
        return calcModel;
    }

    public void setCalcModel(String newModel) {
        calcModel = newModel;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int newId) {
        idNumber = newId;
    }

    public void incrementId() {
        idNumber++;
    }

    public double add(double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }

    public double subtract(double num1, double num2) {
        double diff = num1 - num2;
        return diff;
    }

    public double multiply(double num1, double num2) {
        double product = num1 * num2;
        return product;
    }

    public int quotient(int num1, int num2) {
        int quo = num1 / num2;
        return quo;
    }

    public int remainder(int num1, int num2) {
        int rem = num1 % num2;
        return rem;
    }

    public String divisionResult(int num1, int num2) {
        int quo = num1 / num2;
        int rem = num1 % num2;
        return quo + " R " + rem;
    }

    public String coordinatePair(int x, int y) {
        //implement code here
        return "(" + x + ", " + y + ")";
    }

    public int average(int num1, int num2) {
        double avrg = ((double) num1 + num2) / 2;
        int rounded = (int) (avrg + 0.5);
        return rounded;
    }

    public String info() {
        //implement code here
        return "This calculator is a model " + calcModel + " with id " + idNumber;
    }

}
