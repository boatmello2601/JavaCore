package access_modifier.Public_Exam.mypackage2;

import access_modifier.Public_Exam.mypackage1.Public;

public class SubClassTest extends Public {

    public void accessPublic() {
        System.out.println(name); // เข้าถึงได้เพราะ เป็น SubClass หรือ คลาสลูก
        System.out.println(age); // เข้าถึงได้
        disPlayNameAndAge();
    }
}
