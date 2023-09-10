
import java.util.Scanner;

class Student {
    String name;
    int age;
    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + age);
    }
    public void getInformation() {
        Scanner sc = new Scanner(System.in);
        this.name = sc.nextLine();
        this.age = Integer.parseInt(sc.nextLine());
    }
}


public class bai02 {
	public static void main(String[]args) {
		Student s1 = new Student();
		s1.getInformation();
		s1.display();
	}
}
