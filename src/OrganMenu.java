import java.util.Scanner;

public class OrganMenu {


    private LeftEye leftEye = new LeftEye("Left Eye", "short-sighted", "Blue");
    private RightEye rightEye = new RightEye("Right Eye", "Normal", "Blue");
    private Heart heart = new Heart("Heart", "Normal", 65);
    private Stomach stomach = new Stomach("Stomach", "PUD");
    private Skin skin = new Skin("Skin", "burned");

    public OrganMenu() {
        Scanner scanner=new Scanner(System.in);
        String[] Menu = {leftEye.getName(), rightEye.getName(), heart.getName(), stomach.getName(), skin.getName(), "exit"};
        int i = 0;
        int num=0;
        do{
            System.out.println("Choose an Organ: ");
            for (i = 0; i < Menu.length; i++) {

                System.out.println("\t\t" + (i + 1) + ". " + Menu[i]);
            }
            System.out.print(">> ");
            num=scanner.nextInt();
            if (num == 1) {
                leftEye.description();
            }
            if (num == 2) {
                rightEye.description();
            }
            if (num == 3) {
                heart.description();
            }
            if (num == 4) {
                stomach.description();
            }
            if (num == 5) {
                skin.description();
            }
            if (num== 6) {
                break;
            }
        }while(num<=6);
    }
}
