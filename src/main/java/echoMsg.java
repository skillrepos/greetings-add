/*  Echo Message Java Program */
/* 8-31-21 */
public class echoMsg  {
    public static void main(String[] args) {
      String value = System.getenv("USERNAME");
      if (value != null) {
          System.out.format("Greetings %s!\n",value);
      } else {
          System.out.println("Greetings!");
      }

      if (args.length > 0) {
         System.out.println("Here are the arguments you passed in.");
         for (String s: args) {
             System.out.println(s);
         }
      }
      else {
         System.out.println("No arguments were passed in.");
      }
   }
}
