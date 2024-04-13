import java.util.Scanner;

public class LeftEye extends Fields {

   Scanner scanner =new Scanner(System.in);

   private String color;

   String isClose="Close";

    public LeftEye(String name, String condition, String color) {
        super(name, condition);
        this.color = color;


    }


    @Override
    public void description() {//intially the eye will be closed
        super.description();
        System.out.println("Color: "+this.getColor());
        System.out.println("\t\t1. "+ isClose +" the Eye");
        System.out.print(">> ");
        int num=scanner.nextInt();
        if(isClose.equalsIgnoreCase("close") && num==1){
            System.out.println(this.getName()+ " Closed.");
            isClose="Open";
        }
        else if(isClose.equalsIgnoreCase("open") && num==1){
            System.out.println(this.getName()+ " Opened.");
            isClose="Close";
        }


    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
