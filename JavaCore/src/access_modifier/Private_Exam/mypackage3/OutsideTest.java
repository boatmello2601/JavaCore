package access_modifier.Private_Exam.mypackage3;

import access_modifier.Private_Exam.mypackage1.Private;
import access_modifier.Private_Exam.mypackage2.SubClassTest;

public class OutsideTest {

    public static void main(String[] args) {
        Private obj = new Private();
        // System.out.println(obj.name); // เข้าถึงไม่ได้
        // System.out.println(obj.age); // เข้าถึงไมไ่ด้

        // ----- SubClass ------
        SubClassTest subClassTest = new SubClassTest();
        subClassTest.accessPrivateClass(); // เข้าถึงได้ แต่ ไม่แสดงค่าอะไรเลย
    }
}
