public class Trabalhador extends Thread {
    
    private String produto;
    private int tempo;
    private int i = 0;
    private boolean rodando = true;

    public Trabalhador(String produto, int tempo){
        
        this.produto = produto;
        this.tempo = tempo;

    }   

    public void run(){
        
        while(this.rodando == true){

            this.i++;

            System.out.println(this.i + " " + this.produto);
            try {
                
                sleep((long)(Math.random() * this.tempo));
            
            } catch(InterruptedException e) {}

            if(this.i == 30){

                this.parar();

            }
        
        }
        
    }

    public void parar(){
        
        this.rodando = false;
        System.out.println ("Fiz "+ this.i + " unidades de " + this.produto);

    }

}