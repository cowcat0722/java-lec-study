class Model {
    // 싱글톤
    private static Model instance = new Model();
    // getter
    public static Model getInstance() {
        return instance;
    }
    // 생성자
    private Model() {
    }
    // 오브젝트 사용
    private Object data;

    public void setData(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }
}

class User {
    public int id = 1;
    public String name = "홍길동";
    public String email = "ssar@nate.com";

    public void hello() {
        System.out.println("안녕하세요");
    }
}

public class GenericMethodTest {
    public static void main(String[] args) {
        Model m = Model.getInstance();
        User u = new User();
        m.setData(u);
        // 다운캐스팅
        User ob = (User) m.getData();
        ob.hello();

    }
}