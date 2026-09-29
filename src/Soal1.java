import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Soal1 {

    public static List<String> hapusDuplikat(List<String> var0) {
        return new ArrayList(new LinkedHashSet(var0));
    }

    public static void main(String[] var0) {
        List var1 = Arrays.asList("Andi", "Budi", "Andi", "Citra", "Budi", "Dedi");
        List var2 = hapusDuplikat(var1);
        System.out.println(var2);
    }
}
