public class Solution {
    public int[] decode(int[] encoded) {
        int n = encoded.length + 1;
        int[] perm = new int[n];
        
        // Step 1: Calculate total_xor, which is the XOR of all numbers from 1 to n
        int total_xor = 0;
        for (int i = 1; i <= n; i++) {
            total_xor ^= i;
        }
        
        // Step 2: Calculate odd_encoded_xor, which is XOR of all odd-indexed elements in encoded array
        int odd_encoded_xor = 0;
        for (int i = 1; i < encoded.length; i += 2) {  // odd indexed elements are at positions 1, 3, 5, ...
            odd_encoded_xor ^= encoded[i];
        }
        
        // Step 3: Calculate perm[0]
        perm[0] = total_xor ^ odd_encoded_xor;
        
        // Step 4: Reconstruct the perm array
        for (int i = 0; i < encoded.length; i++) {
            perm[i + 1] = perm[i] ^ encoded[i];
        }
        
        return perm;
    }
}
