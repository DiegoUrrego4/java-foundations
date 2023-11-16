public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = "c";

        StringBuilder sb = new StringBuilder(a);
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            c = c.concat(a).concat(b).concat("\n"); // 2ms
//            c += a + b + "\n"; // 8ms
//            sb.append(a).append(b).append("\n"); // 0 ms
        }

        long fin = System.currentTimeMillis();
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
        System.out.println(fin - inicio + " ms");


    }
}
