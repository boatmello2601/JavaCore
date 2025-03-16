package access_modifier.Protected_Exam.mypackage2;

import access_modifier.Protected_Exam.mypackage1.Protected;

public class SubclassExample extends Protected {

    public void accessProtected() {
        System.out.println(number); // เข้าถึงได้ เพราะเป็น subclass
        System.out.println(message); // เข้าถึงได้
        display(); // เรียกได้
    }
}
