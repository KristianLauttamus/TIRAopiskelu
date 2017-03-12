package viikko1;

public class Queue {
    private final int[] items;
    private int minIndex;
    private int maxIndex;
    
    public Queue(int size){
        this.items = new int[size];
        this.minIndex = 0;
        this.maxIndex = 0;
    }
    
    public int dequeue(){
        int get = this.items[minIndex];
        minIndex++;
        checkQueue();
        return get;
    }
    
    public void enqueue(int number){
        // Toteuta lisäys
        checkQueue();
        
        checkQueue();
    }
    
    public int getSize(){
        return 0; // Toteuta koko
    }
    
    private void checkQueue(){
        if(maxIndex >= this.items.length){
            maxIndex = 0;
            minIndex = 0;
        }
    }
}
