package programmers.Level0;

public class ArrayAvg {
    public double solution(int[] numbers){
        double answer=0;
        int length = numbers.length;
        double sum = 0;
        for (int i:numbers){
            sum=sum+i;
        }
        answer = sum/length;
        return answer;
    }

    public static void main(String[] args) {
        ArrayAvg fn = new ArrayAvg();
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(fn.solution(numbers));
    }
}
