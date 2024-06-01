import java.util.Scanner;

public class Cart {

    static float r1 = 20.0f;
    static float r2 = 20.0f;
    static float r3 = 20.0f;

    public static void main(String[] args) {
        float a = 0.2f;
        float b = 0.3f;
        float c = 0.5f;
        Scanner in = new Scanner(System.in);
        System.out.print("Requirement: ");
        int req = in.nextInt();

        float a1 = req * a;
        float a2 = req * b;
        float a3 = req * c;

        if (r1>=a1 && r2>=a2 && r3>=a3){
            System.out.println("data is sufficient");
            System.out.println("req of r1 is "+a1);
            System.out.println("req of r2 is "+a2);
            System.out.println("req of r3 is "+a3);
        } else{
            System.out.println("data is insufficient");
        }
    }
}

