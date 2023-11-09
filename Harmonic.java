public class Harmonic {
    public static void main(String[] args) {
        int[] list={1,2,4};
        double harmonic=0;
        for (int i=0;i< list.length;i++){
            harmonic=harmonic+(1.0/list[i]);
        }
        System.out.println(harmonic);
    }
}
