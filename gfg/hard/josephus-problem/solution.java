class Solution {
    public int josephus(int n, int k) {
        int survivorIndex = 0; 
        for (int i = 2; i <= n; i++) {
            survivorIndex = (survivorIndex + k) % i;
        }
        return survivorIndex + 1;
    }
}
