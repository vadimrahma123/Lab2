public class nomer2 {
    public static void main(String[] args) {
        int cnt = 0;
        for (int len = 0; len <= 5; len++) {     // len - сколько цифр между 3 и 5
            long max = (long) Math.pow(10, len);    // всего вар. для блока длинны len

            for (long a = 0; a < max; a++) {        // перебор всех чисел из блока
                for (int q = 0; q < 10; q++) {      // перебор цирф 0-9

                    String block;
                    if (len == 0){      // если len == 0, то к строке нелья применить String format
                        block = "";
                    }else {
                        block = String.format("%0" + len + "d", a);
                    }
                    String numstr = "3" + block + "5" + q + "1";   // Собираем число
                    long num = Long.parseLong(numstr);      // преобразуем строку в число типа long

                    if (num > 1_000_000_000L) continue;     // провека ограничеия

                    if (num % 11 != 0) continue;  // первое условие

                    int sumch = 0;
                    int sumnch = 0;
                    for (int i = 0; i < numstr.length(); i++) {     // считаем разность сумм цифр
                        int d = numstr.charAt(i) - '0';
                        if (i % 2 == 0){        //проверка на чет и нечет
                            sumch += d;
                        } else{
                            sumnch += d;
                        }
                    }

                    int diff = sumch - sumnch;      // разница
                    int lnum = (int)(num % 10);
                    int ldiff = diff % 10;
                    if (ldiff < 0) ldiff += 10;

                    if (ldiff == lnum) cnt+= 1;
                }
            }
        }

        System.out.println(cnt);
    }
}
