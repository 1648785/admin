import java.util.Scanner;
public class Demo12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] score = new double[5];
        for(int i = 0; i < 5; i++) {
            score[i] = input.nextDouble();
        }
        for(int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }
    }
}