package ex08.example;

class UrlInfo {
    private String username;
    private String password;

    public UrlInfo(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "UrlInfo{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
public class StringEx02 {
    public static void main(String[] args) {
        // 문서
        // ? 뒤를 쿼리스트링이라고 한다.
        // 쿼리스트링은 키=값 형태의 데이터의 집합이다.
        // 키=값이 여러개일때는 &로 구분한다.
        String url = "http://www.naver.com?username=ssar&password=1234";
        String parse01[] = url.split("\\?"); //"http://www.naver.com","username=ssar&password=1234"
        String parse02[] = parse01[1].split("&"); // "username=ssar","password=1234"
        String parse03[] = parse02[0].split("="); // "username","ssar"
        String parse04[] = parse02[1].split("="); // "password","1234"
        UrlInfo u1 = new UrlInfo(parse03[1],parse04[1]);
        System.out.println(url);
        System.out.println(u1.getUsername());
        System.out.println(u1.getPassword());

        // username값과, password값 찾아보기
    }
}