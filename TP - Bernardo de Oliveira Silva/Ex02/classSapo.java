class Sapo extends Thread{

    private String nomeSapinho;
    private double distanciaPulo;
    private double distanciaCorrida;
    private double distanciaPercorrida = 0.0;

    public Sapo(String nome, double pulo){

        this.nomeSapinho = nome;
        this.distanciaPulo = pulo;

    }
    
    
    public double getPulo(){

        return this.distanciaPulo;

    }

    public void setPulo(double pulo){

        this.distanciaPulo = pulo;

    }

    public String getNome(){

        return this.nomeSapinho;

    }

    public void setNome(String nome){

        this.nomeSapinho = nome;

    }

    public void setCorrida(double correSapinho){

        this.distanciaCorrida = correSapinho;

    }

    public double getCorrida(){

        return this.distanciaCorrida;

    }

    public void run(){

        while(this.distanciaPercorrida < this.distanciaCorrida){

            this.distanciaPercorrida += this.distanciaPulo;

            System.out.println(this.nomeSapinho + " já percorreu " + this.distanciaPercorrida + "km!");

        }

        System.out.println(this.nomeSapinho + " chegou no fim!!");
        

    }

}