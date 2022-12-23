import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TwelveInts {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<Integer>();
        Random rand = new Random();

        for(int i=0; i<12;++i){
            ints.add(rand.nextInt(100));
        }

        System.out.println("In order:");
        for(int i: ints){
            System.out.print(i + " ");
        }

        System.out.println("\nReverse:");
        for(int i=ints.size();i>0;--i){
            System.out.print(ints.get(i - 1) + " ");
        }
    }
}
