package viikko1;

import java.util.Arrays;

public class BinarySearch {
    private final int[] items;
    
    public BinarySearch(int[] items){
        this.items = items;
        
        Arrays.sort(this.items);
    }
    
    public boolean search(int num){
        return false; // Toteuta haku
    }
}
