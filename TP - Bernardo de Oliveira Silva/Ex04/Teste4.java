public class Teste4 {

    public static void main(String[] args){

        PilhaSincronizada pilha = new PilhaSincronizada();

        Consumer consumidor = new Consumer(pilha);
        Producer produtor = new Producer(pilha);
        
        Thread t1 = new Thread(produtor);
        Thread t2 = new Thread(consumidor);

        t1.start();
        t2.start();

    }

}