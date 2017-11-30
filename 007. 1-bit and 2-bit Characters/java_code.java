class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        if (bits.length == 1)
            return true;
        for ( ; i<bits.length-2; ){
            if (bits[i] == 1 && i+2 <= bits.length-2)
                i += 2;
            else if (bits[i] == 0 && i+1 <= bits.length-2)
                i++;
            else
                break;
        }
        if (bits[bits.length-2] == 1 && bits[bits.length-1] == 0 && i == bits.length-2)
            return false;
        else 
            return true;
    }
}
