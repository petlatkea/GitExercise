import java.util.Scanner;

public class MyClass {

    public int askAboutAge() {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        return age;
    }


    public static void main(String[] args) {
        System.out.println("Det virker!");
        System.out.println("Det virker stadig");
    }
}
