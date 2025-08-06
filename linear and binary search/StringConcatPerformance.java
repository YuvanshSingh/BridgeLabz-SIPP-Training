// StringBuffer Problem 2: Compare StringBuffer with StringBuilder for Concatenation
public class StringConcatPerformance {
    public static void comparePerformance() {
        int n = 1000000;
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) arr[i] = "hello";
        long start = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (String s : arr) sbuf.append(s);
        long bufferTime = System.nanoTime() - start;
        start = System.nanoTime();
        StringBuilder sbuilder = new StringBuilder();
        for (String s : arr) sbuilder.append(s);
        long builderTime = System.nanoTime() - start;
        System.out.println("StringBuffer time: " + bufferTime + " ns");
        System.out.println("StringBuilder time: " + builderTime + " ns");
    }
}
