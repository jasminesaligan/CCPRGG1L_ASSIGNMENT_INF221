public class App {
    public static void main(String[] args) throws Exception {
    
       // FOR LOOP 
        for (int firstNameCount = 5; firstNameCount != 0; firstNameCount--) {
            System.out.println("I am Jasmine");
        
           if (firstNameCount == 4) {
                System.out.println("Wait! Timeout! AAAAAAAAAAAAAAAAAAAAAAAAAA");
                break;
            }
        }
        //WHILE
        int nicknameCount = 5;
     
        while (nicknameCount != 0) {
            System.out.println("She is Missy");
           nicknameCount--;
          
      if  (nicknameCount == 3) {
          System.out.println("Skip this part");
          continue;
      }
        }
        //DO WHILE
         int lastnameCount = 5;

        do {
            System.out.println("Ms Saligan");
            lastnameCount--;
        } while (lastnameCount != 0);

      
      }
    }        