class FirstClass{
    public static void main(String[] args) {
        /*
         * want to display
         *               * * * *
         *               * * * *
         *               * * * *
         */
        System.out.println("Using Simple Method");
        for (int i= 1;i<=4;i++){
            System.out.println("* * * *");
        }
        System.out.println("--------------------------------------------------");

        System.out.println("Using Nested Loop");
        for (int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                System.out.print('*');
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}