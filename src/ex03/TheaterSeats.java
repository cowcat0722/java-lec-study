package ex03;

public class TheaterSeats {
    public static void main(String[] args) {

        int[][] seats = {
                {0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 1, 1, 0}
        };
        int sum = 0;
        int count;

        for (int row = 0; row < seats.length ; row++) {

            count = 0;

            for (int i = 0; i < seats[row].length; i++) {
                count = count + seats[row][i];
            }

            System.out.println(row+1 + " 행의 관객수는 : " + count);
            sum = sum + count;
        }
        System.out.println("총 관객수 : "+sum);

//        row ++;
//        count = 0;
//        for (int i = 0; i < seats[row].length; i++) {
//
//            count = count + seats[row][i];
//        }
//        System.out.println(row+" 행의 관객수는 : " + count);
//        sum = sum + count;
//
//
//        row ++;
//        count = 0;
//        for (int i = 0; i < seats[row].length; i++) {
//
//            count = count + seats[row][i];
//        }
//        System.out.println(row+" 행의 관객수는 : " + count);
//        sum = sum + count;
//
//        System.out.println("총 관객 수는 : "+ sum );

    }
}
