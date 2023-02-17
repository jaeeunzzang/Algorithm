package programmers.Level0;

public class ClothDiscount {
    public int solution(int price){
        int answer = price;
        if(price>=500000){
            answer = (int) (answer*0.8);
        }else if(price >=300000){
            answer = (int) (answer*0.9);
        }else if(price >=100000){
            answer = (int) (answer*0.95);
        }
        return answer;
    }

    public static void main(String[] args) {
        ClothDiscount fn = new ClothDiscount();
        int price = 580000;
        System.out.println(fn.solution(price));
    }
}
