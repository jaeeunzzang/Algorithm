package programmers.Level1;

public class 요일체크 {
    public String solution(int a, int b) {
        String answer = "";
        int cnt = 0;
        int mon = 1;
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
        cnt += b;
        // 364 일
        switch (cnt % 7) {
            case 1:
                answer = "FRI";
                break;
            case 2:
                answer = "SAT";
                break;
            case 3:
                answer = "SUN";
                break;
            case 4:
                answer = "MON";
                break;
            case 5:
                answer = "TUE";
                break;
            case 6:
                answer = "WED";
                break;
            default:
                answer = "TUR";
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
