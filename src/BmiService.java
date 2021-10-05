public class BmiService {

    public double calculate(int mass, double height){
        double BodyMassIndex = mass / ( height * height / 10000);
        return BodyMassIndex;
    }
}
