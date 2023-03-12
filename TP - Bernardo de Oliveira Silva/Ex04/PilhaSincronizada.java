public class PilhaSincronizada {
    
    private int index = 0;
    private int[] buffer = new int[10];
    
    public synchronized int pop(){
    
        while(this.index == 0){
            
            try { 
                
                this.wait();

            } catch(InterruptedException e) {}
        }

        this.notify(); // So e feita ao fim do bloco
        
        this.index--;

        return this.buffer[this.index];
    }

    public synchronized void push (int i) {
    
        while(this.index == buffer.length){
        
            try { 

                this.wait();
            
            } catch (InterruptedException e) {}
        }
    
        this.notify();
    
        this.buffer[this.index] = i;
    
        this.index++;
 
    }

}