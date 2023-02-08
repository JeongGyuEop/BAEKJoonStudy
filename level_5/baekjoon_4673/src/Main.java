public class Main {
    public static void main(String[] args) {
        boolean[] check = new boolean[10001]; // 1부터 10000이므로

        for (int i=1; i<10001; i++) {
            int n = d(i);

            if (n < 10001) { // 10000이 넘는 수는 필요 없기 때문
                check[n] = true;
            }
        }

        for (int i=1; i<10001; i++) {
            if (!check[i]) {
                System.out.println(i); // false인 인덱스만 출력
            }
        }
    }

    public static int d(int number) {
        int sum = number;

        while(number != 0) {
            sum = sum + (number % 10); // 1의 자릿수
            number = number / 10; // 10을 나누어 number의 일의 자릿수를 없앤다.
        }

        return sum;
    }
}