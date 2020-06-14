public class threading {

    public static void main(String args[]) {
        runnablEx R1 = new runnablEx("Calzone");
        R1.start();

        runnablEx R2 = new runnablEx("Pizza");
        R2.start();

        runnablEx R3 = new runnablEx("Stromboli");
        R3.start();

    }

}