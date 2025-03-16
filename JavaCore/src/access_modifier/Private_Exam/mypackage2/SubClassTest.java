package access_modifier.Private_Exam.mypackage2;

import access_modifier.Private_Exam.mypackage1.Private;

public class SubClassTest extends Private {

    public void accessPrivateClass() {
        // System.out.println(name); // เข้าถึงไม่ได้
        // System.out.println(age); // เข้าถึงไม่ได้
    }
}
