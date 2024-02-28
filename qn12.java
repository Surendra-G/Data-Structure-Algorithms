public class qn12 {
    public static void main(String[] args) {
        /*
         * goal is to print
         *         *
         *        ***
         *       *****
         *      *******
         *      *******
         *       *****
         *        ***
         *         *
         */

        //for the upper part
        int n=4;
        for(int i=1; i<=n; i++){
            //for the spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //for lower part
        for(int i=n; i>=1; i--){
            //for the spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
