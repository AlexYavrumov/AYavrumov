package HW_to_Lesson15;

import static HW_to_Lesson15.LoginUtil.isUserAuthentic;

public class TestLoginUtil {
    public static void main(String[] args) {
        boolean user1 = isUserAuthentic("login1_", "password1_", "password1_");
        System.out.println(user1);
    }
}