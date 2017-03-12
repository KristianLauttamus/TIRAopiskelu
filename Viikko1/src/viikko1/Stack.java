package viikko1;

public class Stack {
    private final int[] items;
    private int index;
    
    public Stack(int size){
        this.items = new int[size];
        this.index = 0;
    }
    
    public int pop(){
        if(index >= 0){
            this.index--;
            return this.items[this.index+1];
        }
        
        return -1; // Toteuta poisto
    }
    
    public void push(int number){
        if(index < this.items.length-1){
            this.index++;
            this.items[this.index] = number;
        }
    }
    
    public int getSize(){
        return index; // Toteuta koko
    }
}
