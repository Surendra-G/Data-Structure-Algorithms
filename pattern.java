public class pattern {
    public static void main(String[] args) {
        int n = 4; //for the rows
        int m = 5; //for the columns

        /* 
         *          goal is to print 
         *          * * * * *
         *          *       *
         *          *       *
         *          * * * * *
         */
        //outer loop for the rows
        for (int i=1; i<=n;i++){
            //inner loops for the columns
            for(int j=1;j<=m;j++){
                if(i==1||j==1||i==n||j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    
}
