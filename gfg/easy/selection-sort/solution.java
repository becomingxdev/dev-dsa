class Solution {
    void selectionSort(int[] arr) {
        // code here
        int n = arr.length;
        
        for(int i = 0; i < n; i++) {
            
            int min = arr[i];
            int key = i;
            
            for(int j = i; j < n; j++) {
                
                if(arr[j] < min) {
                    min = arr[j];
                    key = j;
                }
                
            }
            
            int temp = arr[i];
            arr[i] = min;
            arr[key] = temp;
            
        }
    }
}