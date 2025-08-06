// 3. String Concatenation Performance: String vs StringBuilder vs StringBuffer
public class StringConcatRuntimeAnalysis {
    public static void compareConcat(int n) {
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) arr[i] = "hello";
        long start = System.nanoTime();
        String s = "";
        for (String str : arr) s += str;
        long stringTime = System.nanoTime() - start;
        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (String str : arr) sb.append(str);
        long builderTime = System.nanoTime() - start;
        start = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (String str : arr) sbuf.append(str);
        long bufferTime = System.nanoTime() - start;
        System.out.println("String time: " + stringTime + " ns");
        System.out.println("StringBuilder time: " + builderTime + " ns");
        System.out.println("StringBuffer time: " + bufferTime + " ns");
    }
}
