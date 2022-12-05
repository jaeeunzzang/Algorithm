package programmers.Level0;

/*
정수 배열 numbers가 매개변수로 주어집니다.
numbers의 각 원소에 두배를 곱한 값의 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.*/
public class MultipleArray {
    static MultipleArray fn = new MultipleArray();

    public int[] solution(int[] numbers){
        int[] answer = new int[numbers.length];
        for(int i=0; i<numbers.length; i++){
           answer[i] = numbers[i]*2;
            System.out.println(answer[i]);
        }
        return answer;
    }
    public static void main(String[] args) {
        int []numbers = new int[]{1, 2, 100, -99, 1, 2, 3};
        System.out.println(fn.solution(numbers));
    }
}
