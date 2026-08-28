public class Fila {

    static int[] fila = new int[5];
    static int quantidade = 0;


    static void enfileirar(int valor) {
        if (estaCheia()) {
            System.out.println("A fila está cheia!");
        } else {
            fila[quantidade] = valor;
            quantidade++;
            System.out.println(valor + " foi enfileirado.");
        }
    }
    static boolean estaVazia() {
        return quantidade == 0;
    }
    static boolean estaCheia() {
        return quantidade == fila.length;
    }
    static int primeiro() {
        if (estaVazia()) {
            System.out.println("A fila está vazia!");
            return -1;
        }
        return fila[0];
    }
    static void desenfileirar() {
        if (estaVazia()) {
            System.out.println("Não é possível desenfileirar. A fila está vazia!");
            return;
        }
        System.out.println(fila[0] + " foi desenfileirado.");

        for (int i = 0; i < quantidade - 1; i++) {
            fila[i] = fila[i + 1];
        }
        quantidade--;
    }
    static int quantidade() {
        return quantidade;
    }
    static void listar() {
        if (estaVazia()) {
            System.out.println("A fila está vazia!");
            return;
        }
        System.out.println("Elementos da fila:");
        for (int i = 0; i < quantidade; i++) {
            System.out.println(fila[i]);
        }
    }
    public static void main(String[] args) {

        enfileirar(10);
        enfileirar(20);
        enfileirar(30);
        enfileirar(40);
        enfileirar(50);

        System.out.println();

        listar();

        System.out.println();

        System.out.println("Quantidade: " + quantidade());

        System.out.println();

        System.out.println("Primeiro elemento: " + primeiro());

        System.out.println();

        desenfileirar();
        desenfileirar();
        desenfileirar();

        System.out.println();

        System.out.println("Depois de desenfileirar 3 elementos:");
        System.out.println("Primeiro elemento: " + primeiro());

        System.out.println();

        listar();

        System.out.println();

        System.out.println("Testando fila cheia:");

        enfileirar(60);
        enfileirar(70);
        enfileirar(80);
        enfileirar(90);

        System.out.println();

        enfileirar(100);

        System.out.println();

        System.out.println("Esvaziando a fila:");

        desenfileirar();
        desenfileirar();
        desenfileirar();
        desenfileirar();
        desenfileirar();

        desenfileirar();
    }
}