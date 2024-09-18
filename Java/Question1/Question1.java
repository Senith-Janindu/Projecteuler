import java.util.ArrayList;

public class Question1 {

public static void main(String[] args) {
    ArrayList<Integer> divedbythree = new ArrayList<Integer>();

    for (int i = 1; i < 1000 ; i++) {
        if (i % 3 == 0 || i % 5 == 0) {
            divedbythree.add(i);
        }
    }
    System.out.println(divedbythree);

    int sumOfThree = 0;

    for (int numthree : divedbythree) {
        sumOfThree += numthree;
    }
    
    System.out.println("Sum: " + sumOfThree);
    }
}
