package ex08.example;


public class StringEx01 {

    public static String encoding(String data) {
        String answer = "";
        int count = 1;
        int i;
        for (i = 0; i < data.length()-1; i++) {
            if(data.charAt(i) == data.charAt(i+1)){
                count++;
            }else{
                answer = answer + data.charAt(i) + count;
                count = 1;
            }
        }
        answer = answer + data.charAt(i) + count;
        return answer;
    }

    public static String decoding(String encodingData) {
        String answer = "";
        for (int i = 0; i < encodingData.length(); i++) {
            if (i % 2 == 1) {
                for (int j = 0; j < Character.getNumericValue(encodingData.charAt(i)); j++) {
                   answer = answer + (encodingData.charAt(i - 1));
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String data = "AABBBCCCCDDDDD"; // Byte -> 14Byte
        String encodingData = encoding(data);

        // 인코딩 A2B3C4D5
        System.out.println(encoding(data));

        // 디코딩 AABBBCCCCDDDDD
        System.out.println(decoding(encodingData));
    }
}