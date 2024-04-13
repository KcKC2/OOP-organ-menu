import java.util.Scanner;

public class Heart extends Fields{

    Scanner scanner=new Scanner(System.in);
    private int heartRate;

    public Heart(String name, String condition, int heartRate) {
        super(name, condition);
        this.heartRate = heartRate;
    }

    @Override
    public void description() {
        super.description();
        System.out.println("Heart Rate: "+this.getHeartRate()+" BPM");
        System.out.println("\t\t1. Change the heart rate");
        System.out.print(">> ");
        int num=scanner.nextInt();
        if(num==1){
            System.out.print("Enter the new Heart rate: ");
             int newHeartRate=scanner.nextInt();
             this.setHeartRate(newHeartRate);


        }
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }
}
