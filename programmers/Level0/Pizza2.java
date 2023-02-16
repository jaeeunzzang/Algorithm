package programmers.Level0;

public class Pizza2 {
    public int solution(int n){
       int answer = 1;
        int pizza = 6;
        while(true){
        if(pizza%n==0){

            break;
        }else{
            pizza+=6;
            answer+=1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
    Pizza2 fn = new Pizza2();
        System.out.println(fn.solution(6));
    }
}
