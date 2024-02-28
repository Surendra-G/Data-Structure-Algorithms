public class qn6 {
    public static void main(String[] args) {
        /*
         * GOal is to print 
         *      1
         *      1 2
         *      1 2 3
         *      1 2 3 4
         *      1 2 3 4 5
         */
        //Outer loop
        int n = 5;  //number of rows
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            // System.out.print(i);
            System.out.println();
        }

        System.out.println();
System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
System.out.println();
        
        //  *      1 2 3 4 5
        //  *      1 2 3 4
        //  *      1 2 3 
        //  *      1 2 
        //         1
        //Outer loop
        for(int i=1;i<=5;i++){
            for (int j=5;j>=i;j--){
                System.out.print(j+" ");
            }
            // System.out.print(i);
            System.out.println();
        }
    }
}
