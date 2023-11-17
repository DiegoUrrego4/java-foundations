public class OperadoresIncrementales {
    public static void main(String[] args) {
        // Pre-incremento
        int i = 1;
        int j = ++i;
        System.out.println("j = " + j); // 2
        System.out.println("i = " + i); // 2

        // Post incremento
        i = 2;
        j = i++;
        System.out.println("i = " + i); // 3
        System.out.println("j = " + j); // 2

        // pre-decremento
        i = 3;
        j = --i;
        System.out.println("i = " + i); // 2
        System.out.println("j = " + j); // 2

        // post-decremento
        i = 4;
        j = i--;
        System.out.println("i = " + i); // 3
        System.out.println("j = " + j); // 4

        System.out.println("j = " + (++j)); // 5
        System.out.println("j = " + (j++)); // 5 --> acá realmente se incrementa j, pero en el paso siguiente.
        System.out.println("j = " + j); // Acá ya sería 6

    }
}


