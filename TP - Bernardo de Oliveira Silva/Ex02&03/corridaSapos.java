import java.util.Scanner;

class CorridaSapos {

    public static void main(String[] args){

        double distanciaCorrida = 0.0;
        int numSapos = 0;
        Sapo sapinhosAtletas[] = new Sapo[20];
        boolean vaiDeNovo = true;
        Scanner scan = new Scanner(System.in);
        String auxNome;
        double auxPulo = 0.0;

        while (vaiDeNovo == true) {

            System.out.print("Digite o número total de sapos (Obs, o total de participantes é de 20 sapos): ");
            numSapos = scan.nextInt();

            if (numSapos > 0 && numSapos < 20){

                vaiDeNovo = false;

            }
            else {

                System.out.println("Houve um erro :/");

            }

        }

        vaiDeNovo = true;

        while (vaiDeNovo == true) {

            System.out.print("Digite a distância da corrida (em km): ");
            distanciaCorrida = scan.nextDouble();

            if (distanciaCorrida > 0){

                vaiDeNovo = false;

            }
            else {

                System.out.println("Houve um erro :/");

            }

        }


        for(int comparador = 0; comparador < numSapos; comparador++){


            System.out.print("Digite o nome do sapo " + (comparador + 1) + ": ");
            auxNome = scan.nextLine();            

            scan.nextLine();

            vaiDeNovo = true;

            while (vaiDeNovo == true) {

                System.out.print("Digite a distância do pulo do sapo (em km, sim eles pulam muito): ");
                auxPulo = scan.nextDouble();
    
                if (distanciaCorrida > 0){
    
                    vaiDeNovo = false;
    
                }
                else {
    
                    System.out.println("Houve um erro :/");
    
                }
    
            }

            sapinhosAtletas[comparador] = new Sapo(auxNome, auxPulo);
            sapinhosAtletas[comparador].setCorrida(distanciaCorrida);

        }

        for(int comparador = 0; comparador < numSapos; comparador++){

            sapinhosAtletas[comparador].start();

        }


    }



}