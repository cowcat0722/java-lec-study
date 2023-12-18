package ex03;

public class BinarySearch {
    public static void main(String[] args) {
        // N = 21
        // 시간복잡도 log2(N) -> log2(17) -> 4.x -> 최악은 5번
        // 이진 검색 => 반드시 정렬이 되어 있어야 한다.
        // 32 / 2*2*2*2*2 -> logn -> log17
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,16,17,18,19,20};
        int N = arr.length;
        final int target = 3;
        int start = 0;
        int end = N - 1;
        int mid;

        int round = 1;
        while (true) {
            // 1 회전
            mid = start + ((end - start) / 2); // 기대값 7
            System.out.println("mid: "+mid);

            if (arr[mid] == target) {
                System.out.println(round + "회전 : " + target + "값은 " + mid + "번지에 있습니다");
                break;
            }

            if (arr[mid] < target) { // 기대값 start 5, end 8
                start = mid + 1;
            }

            if (arr[mid] > target) {
                end = mid - 1;
            }

            System.out.println(round + "회전 start : " + start);
            System.out.println(round + "회전 end : " + end);

            round++;
        }

        System.out.println("시간복잡도 : " + (Math.log(N) / Math.log(2)));
    }
}
