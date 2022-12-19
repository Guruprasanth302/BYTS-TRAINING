class Solution {
    public boolean isPowerOfTwo(int n) {
        Scanner sc=new Scanner(System.in);
       
        if(n>0 &&(n &(n-1))==0){
            return true;
        }else{
            return false;
        }
    }
}
