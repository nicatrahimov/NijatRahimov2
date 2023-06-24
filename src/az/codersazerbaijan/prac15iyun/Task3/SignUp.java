package az.codersazerbaijan.prac15iyun.Task3;

import java.io.IOException;

public class SignUp {
    public static void main(String[] args) throws IOException {
        Login login = new Login();
        login.setUsername("nicatrahimov");
        login.setPassword("1231231231");
        System.out.println(Login.signUp(login));
    }
}
