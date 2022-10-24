

public class Exercise {
     public static void main(String[] args) throws Exception {

        char [][] mdArray = {{'1','1','1'},{'1','1','1'},{'1','1','1'}, {'1', '1', '1'}};
    
        // PATTERN 1
         System.out.println("1. PATTERN 1");
         for (int rows = 0; rows < mdArray.length; rows++) {
                 System.out.println("");
            for (int column = 0; column < 3; column++) {
                if (rows % 2 != 0) {
                    System.out.print(mdArray [rows][column]);
            }
            
        }
     }      
                
//         // // PATTERN 2
        System.out.println();
        System.out.println("2. PATTERN 2");
         for (int rows = 0; rows < mdArray.length; rows++) {
            System.out.println("");
       for (int column = 0; column < 3; column++) {
           if (rows % 2 == 0) {
               System.out.print(mdArray [rows][column]);
               
       }
       
   }
}      
        // // PATTERN 3
         System.out.println();
         System.out.println("3. PATTERN 3");
         for (int rows = 0; rows < mdArray.length; rows++) {
            System.out.println("");
       for (int column = 0; column < 3; column++) {
        System.out.print("");   

           if (rows == 0|| rows == 3) {
            System.out.print(mdArray [rows][column]);  
           }
              if (rows == 1 || rows == 2) {
                if (column == 0 || column == 2){
              System.out.print(" ");  
                } else { 
                    System.out.print(mdArray [rows][column]);      

                }
          
       }
     } 
       
   }
     
//         // // PATTERN 4
        System.out.println();
         System.out.println("4. PATTERN 4");
         for (int rows = 0; rows < mdArray.length; rows++) {
            System.out.println("");
       for (int column = 0; column < 3; column++) {
        System.out.print("");   

           if (rows == 1|| rows == 3) {
            System.out.print(mdArray [rows][column]);  
           }
              if (rows == 0 || rows == 2) {
                if (column == 0 || column == 2){
              System.out.print(" ");  
                } else { 
                    System.out.print(mdArray [rows][column]);      

                }
          
       }
     } 
       
   }

         
        // // PATTERN 5
        int [][] sumArray = {{1,1,1},{1,1,1},{1,1,1}, {1,1,1}};
        System.out.println();
        System.out.println("5. SUM");
        int sum = 0;      
        for (int rows = 0; rows < mdArray.length; rows++) {
       for (int column = 0; column < 3; column++) {
        sum += sumArray [rows][column];
       }
  }
        System.out.print(sum);

       
        }
    
    }
