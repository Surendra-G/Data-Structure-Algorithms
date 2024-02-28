public class qn5 {
    public static void main(String[] args) {
        /*
         *      Goal is to print
         *           *
         *          **
         *         ***
         *        ****
         *       *****
         */
        int n = 5; //number of rows
        //outer loop
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int k=1;k<=i;k++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
