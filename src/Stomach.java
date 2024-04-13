import java.util.Scanner;

public class Stomach extends Fields{

    boolean isHungry=true;

    Scanner scanner =new Scanner(System.in);
    public Stomach(String name, String condition) {
        super(name, condition);
    }

    @Override
    public void description() {
        super.description();

        if(isHungry==true) {

            System.out.println("Need to be fed.");
            System.out.println("\t\t1. Digest");
            System.out.print(">> ");
            int num=scanner.nextInt();
            if(num==1){
                System.out.println("Digesting begin...");
                isHungry=false;

            }
        }else{
            System.out.println("Stomach is full.");
        }

    }



}
