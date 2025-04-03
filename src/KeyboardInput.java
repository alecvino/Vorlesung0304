public class KeyboardInput {
    public static void main(String[] args) throws Exception {
        int i = System.in.read();
        System.out.print((char) i);
        while (i != '\n') {
            i = System.in.read();
            System.out.print((char) i);
        }

    }
}