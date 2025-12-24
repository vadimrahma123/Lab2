import java.util.Scanner;
public class nomer4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();       // колво элементов в массиве
        int[] arr = new int[n];     // масив

        for (int i = 0; i < n; i++) {       // заполняем масив
            int a_n = in.nextInt();
            arr[i] = a_n;
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            boolean bigger = true;      // флаг является ли эл больше всех справа

            for (int j = i + 1; j < n; j++) {       //  все элементы справа от текущего
                if (arr[i] <= arr[j]) {         // Если эл справа, который не меньше текущего
                    bigger = false;
                    break;
                }
            }
            if (bigger) {        // Если после проверки всех правых элементов isGreater остался true
                cnt++;
            }
        }
        System.out.println(cnt-1);
    }
}