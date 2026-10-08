public class HebraCaracter extends Thread {
    private final char caracter;
    private final int repeticiones;

    public HebraCaracter(char caracter, int repeticiones) {
        this.caracter = caracter;
        this.repeticiones = repeticiones;
    }

    @Override
    public void run() {
        for (int i = 0; i < repeticiones; i++) {
            System.out.print(caracter);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        HebraCaracter h1 = new HebraCaracter('A', 100);
        HebraCaracter h2 = new HebraCaracter('B', 100);
        HebraCaracter h3 = new HebraCaracter('C', 100);

        h1.start();
        h2.start();
        h3.start();

        h1.join();
        h2.join();
        h3.join();
        System.out.println();
    }
}
