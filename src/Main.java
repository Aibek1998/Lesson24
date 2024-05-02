import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList <Integer>list= new ArrayList<>();
        ArrayList <Integer> taksan = new ArrayList<>();
        ArrayList <Integer> jupsan = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int r = random.nextInt(50);
            list.add(r);
        }
        System.out.println(list);
        System.out.println();
        System.out.println();
        for (int a : list){
            if (a%2==0){
                jupsan.add(a);
            }else
                taksan.add(a);
        }
        System.out.print("Так сан : "+taksan);
        System.out.println();
        System.out.println();
        System.out.println("Жуп сан : "+jupsan);
    }
}