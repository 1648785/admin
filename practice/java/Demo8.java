public class Demo8 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            for(int k = 1; k <= 5 - i; k++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i - 1;j++){
                if(j == 1 || j == 2 * i - 1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        for(int a = 1; a <= 4; a++){
            for(int b = 1; b <= a; b++) {
                System.out.print(" ");
            }
            for(int c = 1; c <= 2 * (4 - a) + 1; c++) {
                if(c == 1 || c == 2 * (4 - a) + 1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}