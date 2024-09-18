import java.util.ArrayList;

public class Question6 {

    public static void main(String[] args) {
        ArrayList<Integer> square = new ArrayList<>();
        int  sums =0;
        int  sumn =0;

        for (int i = 0; i < 101; i++) {
            int multi = i * i;
            sums += multi;
            square.add(multi);
            sumn += i;
        }
        System.out.println(square);
        System.out.println(sums);
        System.out.println(sumn*sumn);
        System.out.println(sums-(sumn*sumn));
    }
    
}
