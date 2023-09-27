package codingkata.session7;

public class ReverseWordsInAString {

    public static void main(String[] args) {
        String myString = "the sky is blue";
        String[] myList = myString.split(" ");

        StringBuilder reversed = new StringBuilder();

        for (int i = myList.length - 1; i > 0; i--) {
            reversed.append(myList[i]).append(" ");
        }
        reversed.append(myList[0]);
        System.out.println(myString);
        System.out.println(reversed);
    }
}