import java.util.Scanner;
public class nomer3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nstr = in.next();

        int len = nstr.length();       // длинна числа
        int[] digits = new int[len];       // массив для цифр
        for (int i = 0; i < len; i++) {     // заполенения масива
            digits[i] = nstr.charAt(i) - '0';
        }

        boolean ok = false;     // флаг уравновешивания
        for (int pos = 0; pos < len; pos++) {
            int left = 0;       //  сумма цифр слева от текущей позиции
            int right = 0;      // сумма цифр справа от текущей позиции

            for (int i = 0; i < pos; i++) {     // сумма цифр слева
                left += digits[i];
            }
            for (int i = pos + 1; i < len; i++) {   // сумма цифр справа
                right += digits[i];
            }

            if (left == right) {        // проверка "уравновешивания"
                System.out.println(digits[pos] + " " + (pos + 1));      // значение и позиция
                ok = true;
                break;
            }
        }

        if (!ok) {      // если не нашлось такой цифры
            System.out.println("NO");
        }
    }
}