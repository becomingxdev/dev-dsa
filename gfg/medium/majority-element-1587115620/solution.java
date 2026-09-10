class Solution {
    int majorityElement(int arr[]) {
        // code here
        
        int n = arr.length;
        int element = -1;
        int count = 0;
        
        for(int i = 0; i < n; i++) {
            
            if(count == 0) {
                element = arr[i];
                count = 1;
            } else if(arr[i] == element) {
                count++;
            } else {
                count--;
            }
            
        }
        
        int temp = 0;
        
        for(int i = 0; i < n; i++) {
            if(arr[i] == element) {
                temp++;
            }
        }
        
        if(temp > (n / 2)) {
            return element;
        }
        
        return -1;
    }
}