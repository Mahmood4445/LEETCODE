class Solution {
    public int reverse(int x) {
        boolean sign = true;
        if(x<0) 
          sign = false;
        x = Math.abs(x);
        int rev =0;
        int temp= 0;
        while(x>0){
             if (rev > 214748364)
                return 0;
             if(rev == 214748364 && (x%10)>7)
                 return 0;
             temp = x % 10;
             rev = (rev*10)+temp;
             x=x/10;
               
        }
        if(!sign) 
            return -1*(int)rev;
        return (int)rev;

    
    }
}
