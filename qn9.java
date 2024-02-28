public class qn9 {
    public static void main(String[] args) {
        /*
         *   *             *
         *   * *         * *
         *   * * *     * * *
         *   * * * * * * * *
         *   * * * * * * * *
         *   * * *     * * *
         *   * *         * *
         *   *             *
         */

         // three loops needed 
         //two loops for the *
         // one loop for the Spaces

        int n = 4;
        // for the upper part

        //for left side star
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

         //for spaces
            for(int j=1;j<=(2*(n-i));j++){
                System.out.print(" ");
            }

            //for right side stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        //for the lower part
        //for left side star
        for(int i=4;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

         //for spaces
            for(int j=1;j<=(2*(n-i));j++){
                System.out.print(" ");
            }

            //for right side stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
