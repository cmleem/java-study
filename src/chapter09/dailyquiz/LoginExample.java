package chapter09.dailyquiz;

public class LoginExample {
    public static void main(String[] args) {
        try {
            login("white", "12345");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            login("blue", "54321");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void login(String id, String password) throws NotExistIdException, WrongPasswordException{

        if (!id.equals("blue")) {
            throw new NotExistIdException("아이디가 존재하지 않습니다.");
        }

        if (!password.equals("12345")) {
            throw new WrongPasswordException("비밀번호가 틀립니다.");
        }
    }

}
