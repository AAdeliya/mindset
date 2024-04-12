public class StaticMethod {
    public static int[] nums= initNums();
    static{
        nums = new int[5];
        nums[0]=3;
        nums[1]=3;
        nums[2]=3;
        nums[3]=3;
        //less obvios to understand

    }
    public static int[] initNums(){
        int[] nums= new int[5];
        nums[0]=3;
        nums[1]=3;
        nums[2]=3;
        nums[3]=3;
        return nums;
//move obvious 
//the same meaning

    }

    public static void main(String[] args) {
        StaticMethod variable1= new StaticMethod(); //instance of the class

    }
    
}
