package programmers.Level1;

public class 요일체크 {
    public String solution(int a, int b) {
        String answer = "";
        int cnt = 0;
        int mon = 1;
        int day = 1;
        String date = "FRI";
        for (mon = 1; mon < a; mon++) {
            switch (mon) {
                case 1, 3, 5, 7, 8, 10, 12:
                    cnt += 31;
                    break;
                case 2:
                    cnt += 29;
                    break;

                default:
                    cnt += 30;
                    break;
            }
        }
        System.out.println(cnt);
        cnt += b;
        System.out.println(cnt);
        // 364 일
        switch (cnt % 7) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
            case 3:
                System.out.println(3);
            case 4:
                System.out.println(4);
            case 5:
                System.out.println(5);
            case 6:
                System.out.println(6);
            default:
                System.out.println(7);
                break;
        }
        return answer;
    }

    public static void main(String[] args) {
        요일체크 fc = new 요일체크();
        int a = 5;
        int b = 24;
        System.out.println(fc.solution(a, b));
    }
}
