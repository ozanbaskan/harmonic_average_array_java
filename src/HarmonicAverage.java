public class HarmonicAverage {

    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        double sum = 0;
        for (int i = 0; i <array.length;i++)
        {
            sum += 1.0 / array[i];
        }

        System.out.printf("Harmonic average of the list: %.4f\n", array.length / sum);
    }
}
