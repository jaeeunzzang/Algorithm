package programmers.Level0;

public class ReverseString {
    public String solution(String s){
        String answer = "";
        int length = s.length();
       for (int i =length-1; i>=0; i--){
           answer+=s.charAt(i);
       }
        return answer;
    }

    public static void main(String[] args) {
        ReverseString fn = new ReverseString();
        System.out.println(fn.solution("bread"));
    }
}
