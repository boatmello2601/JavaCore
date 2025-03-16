package access_modifier.Private_Exam.mypackage1;

public class SamePackageTest {

    public static void main(String[] args) {
        Private obj = new Private();
        // System.out.println(obj.name); // เข้าถึงไม่ได้เพราะ เป็น Private
        // System.out.println(obj.age); // เข้าถึงไม่ได้
    }
}
