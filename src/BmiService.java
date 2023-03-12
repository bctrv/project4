public class BmiService {

    public int calculate(double heightM, int weightKg) {
        int result;
        {
            result = (int) (weightKg / (heightM * heightM));
        }
        return result;
    }
}
