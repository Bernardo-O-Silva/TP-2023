import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Cliente {

    public static void main ( String [] args ) throws UnknownHostException, IOException {
    
        Socket cliente = new Socket ("10.0.0.33", 12345) ;
        System.out.println ("O cliente se conectou ao servidor!");

        Scanner teclado = new Scanner(System.in) ;
        PrintStream saida = new PrintStream (cliente.getOutputStream());

        while(teclado.hasNextLine()) {
            
            saida.println(teclado.nextLine());
        
        }

        saida.close();
        teclado.close();
        cliente.close();
    
    }

}