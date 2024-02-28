public class qn10 {
    public static void main(String[] args) {
        /*
         * goal is to print
         *              * * * * *
         *            * * * * *
         *          * * * * *
         *        * * * * *  
         *      * * * * *
         */
        int n= 5;
        //for spaces
        for(int i=1;i<=n;i++){
            for(int j=1; j<=(n-i);j++){
                System.out.print(" ");
            }

            for(int j=1; j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
