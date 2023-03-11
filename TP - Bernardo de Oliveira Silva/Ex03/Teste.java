public class Teste {

    public static void main(String[] args){

        Trabalhador proletarioJorge = new Trabalhador("maçã", 100);
        Trabalhador proletariaMaria = new Trabalhador("banana", 90);

        proletarioJorge.start();
        proletariaMaria.start();

    }

}