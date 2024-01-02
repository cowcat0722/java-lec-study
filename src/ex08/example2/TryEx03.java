package ex08.example2;

// 책임 : 데이터베이스 상호작용
class Repository {
    String insert(String id, String pw) {
        System.out.println("레포지토리 insert 호출됨");
        if (id.length() < 4) {
            return "id의 길이가 4자 이상이어야 합니다.";
        }
        return "DB에 정상 insert 되었습니다";
    }

    void select() {
        System.out.println("레포지토리 select 호출됨");
    }
}

// 책임 : 유효성 검사
class Controller {
    String join(String id, String pw) {
        System.out.println("컨트롤러 회원가입 호출됨");
        if (id.length() < 4) {
            return "id의 길이가 4자 이상이어야 합니다.";
        }

        Repository repo = new Repository();
        String message = repo.insert(id, pw);

        if (!message.equals("DB에 정상 insert 되었습니다")) {
            return message;
        }

        return "회원가입이 완료되었습니다";
    }

    void login() {
        System.out.println("컨트롤러 로그인 호출됨");
    }
}

public class TryEx03 {
    public static void main(String[] args) {
        Controller con = new Controller();
        String message = con.join("ssa", "1234");
        System.out.println(message);
    }
}