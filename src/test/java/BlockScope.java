public class BlockScope {
    public static void main(String[] args) {
        //Code here CANNOT use x
        { //This is  a block
            //Code here CANNOT use x
            int x = 100;
            System.out.println(x);
        } // The block ens here
        //Code here CANNOT use x
    }
}
