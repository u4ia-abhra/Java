public class operations {

    public static int getBit(int n,int i) { //retrieves the ith bit
        int bitMask = 1<<i;
        if ((n & bitMask) == 0) {
            return 0;
        }
        else {
            return 1;
        }        
    }

    public static int setBit(int n,int i) { //sets the ith bit to 1
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int clearBit(int n,int i) {   //sets the ith bit to 0
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int updateBit(int n,int i,int newBit) {   //puts the desired bit in the ith position
        if (newBit == 0) {
            return clearBit(n, i);
        }
        else {
            return setBit(n, i);
        }
    }

    public static int clearLastBits(int n,int i) {     //clears the last i bits 
        int bitMask = (-1)<<i;  //-1 -> 1111 (2's complement me rhta hai)
        return n & bitMask;
    } 

    public static int clearRangeOfBits(int n,int i,int j){
        int bitMask = ((-1)<<i+1) | ((int)Math.pow(2, j)-1);
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearRangeOfBits(31, 3,1));    
    }
    
}