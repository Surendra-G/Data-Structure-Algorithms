public class qn8 {
    public static void main(String[] args) {
        /*
         * Goal is to print 
         *  1
         *  0 1
         *  1 0 1 
         *  0 1 0 1
         *  1 0 1 0 1
         */

         int number;
         for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                number = i+j;
                if(number%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
                
            }
            System.out.println();
         }
    }
}
