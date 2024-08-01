/*
     How we take input from a user's in java
     we can manage input from user using four different ways
     1) java provide "System.in"  referrence to take input from keyboards,
     where "System" is the class and ".in" is refference of inputStream class.

     "System.in" will be managed by three different ways:
     1) System.in.read();--> it throw checked exception,and we can only input single char
                               beacause it will return data in byte pattern.
     2) Using Scanner object
        Scanner sc = new Scanner(System.in);
        input will be assigned in scanner object.
        int a = ref.nextInt();
        float b = ref.nextFloat();
        double d = ref.nextDouble();
        String s = ref.next(); --> read only single word
        String s = ref.nextLine();--> read  multiple word
        char ch = ref.next().charAt(); --> it will split character from String
                             charAt() is the  function String class,it is not defined in scanner class.
        Scanner is the input manager class which is exists under java.util package

        3) using InputStreamReader class by System.in
            InputStreamReader ir =  new InputStreamReader(System.in);

        4) Using command line input by command prompt with parametrised string array under main
            public static void main(String args[]){
                int a =  Integer.parseInt(args[0]);  for int
                Strint s =  args[0];     for string
                Strint s =  args[1];
                Strint s =  args[2];
            }
 */
package aptitude;
public class Input_user {
    public static void main(String[] args) {

    }
}
