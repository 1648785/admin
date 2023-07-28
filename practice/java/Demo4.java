import java.util.Scanner;
public class Demo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = scanner.next();
        System.out.println("请输入年龄：");
        int age = scanner.nextInt();
        System.out.println("请输入薪水：");
        double salary = scanner.nextDouble();
        System.out.println("姓名\t年龄\t薪水\n" + name + "\t" + age + "\t" + salary);
    }
}