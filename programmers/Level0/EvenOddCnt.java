package programmers.Level0;

public class EvenOddCnt {
    public int[] solution(int[] num_list){
        int[] answer = {0,0};
        for (int i:num_list){
            if(i%2==0){
                answer[0]+=1;
            }else{
                answer[1]+=1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        EvenOddCnt fn = new EvenOddCnt();
        int[] num_list = {1,3,5,7};
        System.out.println(fn.solution(num_list));
    }
}
