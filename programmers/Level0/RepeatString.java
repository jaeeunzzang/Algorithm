package programmers.Level0;

public class RepeatString {
    public String solution(String my_string,int n){
        String answer = "";
        int length = my_string.length();
        for (int i = 0; i<length;i++){
            for(int j =0; j<n;j++){
            answer+= my_string.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        RepeatString fn = new RepeatString();
        String my_string = "hello";
        System.out.println(fn.solution(my_string,3));
    }
}
