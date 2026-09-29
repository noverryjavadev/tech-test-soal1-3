import java.util.Arrays;
import java.util.List;

public class Soal2 {

    public static int cariAngkaKeduaTerbesar(List<Integer> var0) {
        if (var0 != null && var0.size() >= 2) {
            Integer var1 = null;
            Integer var2 = null;

            for(Integer var4 : var0) {
                if (var4 != null) {
                    if (var1 != null && var4 <= var1) {
                        if (var4 < var1 && (var2 == null || var4 > var2)) {
                            var2 = var4;
                        }
                    } else {
                        var2 = var1;
                        var1 = var4;
                    }
                }
            }

            if (var2 == null) {
                throw new IllegalArgumentException("List harus memiliki minimal dua angka berbeda.");
            } else {
                return var2;
            }
        } else {
            throw new IllegalArgumentException("List harus memiliki minimal dua angka berbeda.");
        }
    }

    public static void main(String[] var0) {
        List var1 = Arrays.asList(10, 5, 20, 8, 20, 15);
        int var2 = cariAngkaKeduaTerbesar(var1);
        System.out.println(var2);
    }
}
