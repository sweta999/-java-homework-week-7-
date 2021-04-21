package stringmethods;

/** String Methods
 * Practice Session
 * by Sweta Jani
 */

public class StringMethodsPractice {

    public static void main(String[] args) {

        //Defining two String Variables
        String phrase = "Good Morning";   //String Variable 1
        String phrase1 = "Hello Everyone";  //String Variable 2
        String phrase2 = ("         How are you all?");  //String Variable 3 for trim method only

        //print statements
        //1.String Method - String length()
        System.out.println("The Length of the String for Phrase is :" + phrase.length());
        System.out.println("The Length of the String for Phrase1 is :" + phrase1.length());

        //2.String Method - String charAt()
        System.out.println(" ");
        System.out.println(phrase.charAt(6)); //returns char value at Index 6 i.e alphabet o
        System.out.println(phrase1.charAt(12)); //returns char value at Index 12 i.e alphabet n

        //3.String Method - String concat()
        System.out.println(" ");
        //combines specified string in the end of defined string 'phrase' and 'phrase1'
        System.out.println(phrase.concat(" Sweta"));
        System.out.println(phrase1.concat(", How are you all?"));

        //4.String Method - contains()
        System.out.println(" ");
        //returns reply in boolean
        System.out.println("Does String variable 'phrase' have word 'All' :" + phrase.contains("All")); //false
        System.out.println("Does String variable 'phrase1' have alphabet 'e' :" + phrase1.contains("e")); //true

        //5.String Method - startsWith()
        System.out.println(" ");
        //returns reply in boolean
        System.out.println("Does String phrase have prefix 'Hi':" + phrase.startsWith("Hi")); //false
        System.out.println("Does String phrase have prefix 'Hello':" + phrase1.startsWith("Hello")); //true

        //6.String Method - endsWith()
        System.out.println(" ");
        //checks if this string(phrase/phrase1) ends with given suffix, returns reply in boolean
        System.out.println(phrase.endsWith("Sweta")); //false
        System.out.println(phrase1.endsWith("Everyone")); //true

        //7.String Method - equals()
        System.out.println(" ");
        //compares the contents of two given strings. Reply is in boolean.
        System.out.println(phrase.equals(phrase1)); //false
        System.out.println(phrase1.equals(phrase)); //false

        //8.String Method - indexOf()
        System.out.println(" ");
        //returns index of given character value or substring starting from Index 3.
        System.out.println("What is the index of alphabet 'o', if starting from index 3 :" + phrase.indexOf("o", 3));
        System.out.println(phrase1.indexOf("r", 2));  //Ans:index is 9

        //9.String Method - isEmpty()
        System.out.println(" ");
        //Checks if the String is empty. Reply received in boolean
        System.out.println("Is the String 'phrase' empty:" + phrase.isEmpty()); //false

        //10.String Method - replace()
        System.out.println(" ");
        //returns a string replacing all the old char to new char
        System.out.println("Replace Good with Happy in String 1 : " + phrase.replace("Good", "Happy"));
        System.out.println("Replace Hello with Hi in String 2 : " + phrase1.replace("Hello", "Hi"));

        //11.String Method - substring()
        System.out.println(" ");
        //returns a part of the string, beginning at a specified start position for substring.
        System.out.println(phrase.substring(7));  //Ans : rning
        System.out.println("What is the substring for string 'phrase1' after index 3 : " + phrase1.substring(3)); //Ans: lo Everyone

        //12.String Method - toCharArray()
        System.out.println(" ");
        //converts the string into character array
        //System.out.println(phrase.toCharArray());
        //System.out.println(phrase1.toCharArray());

        //13.String Method - toLowerCase()
        System.out.println(" ");
        //returns the string in lowercase letter
        System.out.println(phrase.toLowerCase());
        System.out.println(phrase1.toLowerCase());

        //14.String Method - toUpperCase()
        System.out.println(" ");
        //returns the string in uppercase letter
        System.out.println(phrase.toUpperCase());
        System.out.println(phrase1.toUpperCase());

        //15.String Method - trim()
        System.out.println(" ");
        //eliminates leading and trailing spaces,brackets before the string
        System.out.println("String before trim: " + phrase2);
        System.out.println("String after trim: " + phrase2.trim());


    }

}
