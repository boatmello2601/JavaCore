package access_modifier.Public_Exam.mypackage3;

import access_modifier.Public_Exam.mypackage1.Public;
import access_modifier.Public_Exam.mypackage2.SubClassTest;

public class OutsideTest {

    public static void main(String[] args) {
        Public obj = new Public();
        System.out.println(obj.name); // เข้าถึงได้
        System.out.println(obj.age); // เข้าถึงได้

        SubClassTest subClassTest = new SubClassTest();
        subClassTest.disPlayNameAndAge(); // เข้าถึงได้
    }
}
