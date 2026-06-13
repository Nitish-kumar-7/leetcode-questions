class Solution {
    public boolean isPalindrome(int x) {

    int reversex = 0;
   
    if(x < 0 ){
        return false;
    }
    int temp = x;

    while(temp >0){
        int last = temp% 10;
        reversex = reversex * 10 + last;
        temp /= 10;
    }

    return x == reversex;
        
        
    }
}