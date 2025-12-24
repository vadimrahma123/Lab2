import java.util.Scanner;
public class nomer1 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        int a0 = in.nextInt(); // нулевой эл последовательности
        int n = in.nextInt();  // кол-во элементов последовательности
        int [] l = new int[n]; // массив, куда сохраняет последовательность

        if (n<1){
            System.out.println("длинна последовательности должна быть более 1");
            return;
        }

        for (int i = 1; i < n+1; i++) {
            if (i % 2 == 0){
                a0 += 3;
            }else {
                a0 *= -2;
            }
            l[i-1] = a0;    // ставим на i-1 позицию, т.к
        }

        for (int i = 0; i < n; i++) {       // выводим на экран
            System.out.print(l[i] + " ");
        }
    }
}