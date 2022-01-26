import java.util.Locale;

public class assignment3 {
    public static void main(String[] args) {
        String srt = "Java String pool refers to collection of Strings which are stored in heap memory";

        System.out.println(srt.toLowerCase(Locale.ROOT));
        System.out.println(srt.toUpperCase(Locale.ROOT));
        System.out.println(srt.replace("a","$"));

        //check if collection is present

        if (srt.contains("collection")) {
            System.out.println("collection is present in the string");
        }

        String srt1 = "java string pool refers to collection of strings which are stored in heap memory";

        //To check new string match old string

        if (srt.matches(srt1)){
            System.out.println("Both String match");
        }
        else
            System.out.println("String does mot match");


      //To check new String to old string by converting both string to upper case
        if (srt.toUpperCase(Locale.ROOT).matches(srt1.toUpperCase(Locale.ROOT))) {
            System.out.println("Both String matches when coverted to uppercase");
        }

    }
}


