public class palindrome {
    public static void main(String[] args) {
        /*
         * Goal to print palindrome Numbers
         *              1
         *            2 1 2
         *          3 2 1 2 3
         *        4 3 2 1 2 3 4
         *      5 4 3 2 1 2 3 4 5
         * 
         *     
         */
        int n=5;  //number of the rows
        
        for(int i=1;i<=n;i++){
            //for the spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            for(int j=2;j<=i;j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
