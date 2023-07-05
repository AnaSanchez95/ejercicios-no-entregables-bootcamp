public class Otros {
    public static void main(String[] args) {

        //System.out.println(multiplos2(1000));
        System.out.println(multiplos3o5(1000));
    }
    public static int multiplos2(int max){
        int sum = 0;
        for (int i = 0; i < max; i++) {
            if((i % 2) == 0){
                sum += i;
            }
        }
        return sum;
    }
    public static int multiplos3o5(int max){
        int sum = 0;
        for (int i = 0; i < max; i++) {
            if((i % 3) == 0 || (i % 5) == 0){
                sum += i;
            }
        }
        return sum;
    }
}
