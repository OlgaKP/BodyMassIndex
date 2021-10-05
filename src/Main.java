public class Main {
    public static void main(String[] args) {

        BmiService BMI = new BmiService();
        double result = BMI.calculate(48, 162);
        System.out.println(result);
    }
}
