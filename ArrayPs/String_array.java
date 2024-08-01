// questions
// 1) program to display element of string array--> done
// 2) WAP to find MAX size string in string array?
// 3) WAP to find Second  max char in string array for particular string?
// {"Hello","Hey","HIII"};
// output --> O y I
// 4) WAP to display palindrome String?
// 5) WAP to reveerse string elemen?
// // {"Hello","Hey","HIII"};
// output-->   {"olleh","yeH","IIIH"};

package ArrayPs;
public class String_array {
    public static void main(String[] args) {
        System.out.println("Fort i visit them 2024! ");
        String arr[]= {"Sihngad","Raygad","Shivnery","Purander"};
        int count[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){        // display elements of array using for loop
            System.out.println(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            String str= arr[i];
            count[i]=str.length();
            System.out.println(count.length);
        }
        for(int i=0;i<arr.length;i++){
            String str= arr[i];
            int c1=0,c2=0;
            for(int j=0;j<str.length();j++){
                switch (str.charAt(j)){
                    case 'A' :
                    case 'B' :
                    case 'C' :
                    case 'D' :
                    case 'E' :
                        c1++;
                        break;
                    default:
                        c2++;
                        break;
                }
            }
            System.out.println(str+"=  vowel "+c1 +" consonent = " +c2);
        }

        System.out.println();
        System.out.println("Fort i visit them 2024! ");
         for(String s : arr){        // display elements of array using for each loop (modified for loop another name)
             System.out.println(s);
        }

    }
}
