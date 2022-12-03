package programmers.Level0;
/*
첫 번째 분수의 분자와 분모를 뜻하는 denum1, num1,
두 번째 분수의 분자와 분모를 뜻하는 denum2, num2가 매개변수로 주어집니다.
두 분수를 더한 값을 기약 분수로 나타냈을 때
분자와 분모를 순서대로 담은 배열을 return 하도록.*/


//처음부터 분모가 같은경우일수도있음.
//최대공약수, 최소공배수 구해서 접근
// 최대공약수 : 두 수를 나눠서 나머지가 0 인것중에 젤 큰수...
// 최소공배수 : (num1 * num2) / 최대공약수
public class Irreducible_fraction {
    static Irreducible_fraction fn = new Irreducible_fraction();

    //최대 공약수 구하는 함수
    public int getGcd(int num1, int num2){
        int gcd = 0;
        int min = Math.min(num1, num2); // (num1 < num2) ? num1 : num2

        for(int i = 1; i <= min; i++){
            if(num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        
        int num3 = num1 * num2;
        int left_num = denum1 * num2;
        int right_num = denum2 * num1;
        int sum = left_num+right_num;

        int gcd = fn.getGcd(num3,sum);
        int lcm = num3 / gcd;

        answer[0] = sum/gcd;
        answer[1] = lcm;

        System.out.println(answer[0]);
        System.out.println(answer[1]);
        return answer;
    }

    public static void main(String[] args) {
        fn.solution(9,2,1,3);
    }
}
