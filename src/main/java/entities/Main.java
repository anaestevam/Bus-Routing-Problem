package entities;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        new BusRoutingProblem(200, 25);
        long end = System.currentTimeMillis();
        float duration = (end - start) / 1000F;
        System.out.println();
        System.out.print("Execução do algoritmo em segundos: ");
        System.out.printf("%.3f", duration);
    }
}
