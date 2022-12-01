package programmers.Level0;
/*
첫 번째 분수의 분자와 분모를 뜻하는 denum1, num1,
두 번째 분수의 분자와 분모를 뜻하는 denum2, num2가 매개변수로 주어집니다.
두 분수를 더한 값을 기약 분수로 나타냈을 때
분자와 분모를 순서대로 담은 배열을 return 하도록.*/

//처음부터 분모가 같은경우일수도있음.
//최대공약수, 최소공배수 구해서 접근
public class Irreducible_fraction {

    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        int num3 = num1*num2;
        int left_num = denum1 * num2;
        int right_num = denum2 * num1;
        int sum = left_num+right_num;

        for(int i = 2; i<10;i++){
            if(sum % i == 0 && num3 % i == 0){
                answer[0] = sum/num1;
                answer[1] = num3/num1;
                break;
            }else{
               answer[0] =sum;
                answer[1] = num3;
            }
        }

        /*if(sum % num1 == 0 && num3 % num1 == 0){
            answer[0] = sum/num1;
        }else if( sum % num2 == 0 && num3 % num2 == 0){
            answer[0] = sum/num2;
            answer[1] = num3/num2;
        }else{
            answer[0] =sum;
            answer[1] = num3;
        }
        */
        System.out.println(answer[0]);
        System.out.println(answer[1]);
        return answer;
    }

    public static void main(String[] args) {
        Irreducible_fraction fn = new Irreducible_fraction();
        fn.solution(9,2,1,3);
    }
}
