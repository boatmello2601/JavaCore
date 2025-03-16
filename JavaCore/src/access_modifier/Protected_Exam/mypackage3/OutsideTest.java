package access_modifier.Protected_Exam.mypackage3;

import access_modifier.Protected_Exam.mypackage1.Protected;
import access_modifier.Protected_Exam.mypackage2.SubclassExample;

public class OutsideTest {

    public static void main(String[] args) {
        Protected obj = new Protected();
        //System.out.println(obj.number); // ผิด! ไม่สามารถเข้าถึงได้ เพราะอยู่นอกแพ็กเกจและไม่ใช่ subclass

        SubclassExample sub = new SubclassExample();
        sub.accessProtected(); // ถูกต้อง เพราะ SubclassExample สืบทอดมา
    }
}
