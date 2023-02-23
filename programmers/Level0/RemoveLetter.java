package programmers.Level0;

public class RemoveLetter {
    public String solution(String my_string, String letter){
        String answer = "";
       answer= my_string.replaceAll(letter,"");
        return answer;
    }

    public static void main(String[] args) {
        RemoveLetter fn = new RemoveLetter();
        String my_string = "abcdef";
        String letter = "d";
        System.out.println(fn.solution(my_string,letter));
    }
}
