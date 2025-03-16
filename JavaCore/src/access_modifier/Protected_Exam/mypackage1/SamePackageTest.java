package access_modifier.Protected_Exam.mypackage1;

public class SamePackageTest {
    public static void main(String[] args) {
        Protected obj = new Protected();
        System.out.println(obj.number); // เข้าถึงได้ เพราะอยู่ในแพ็กเกจเดียวกัน
        System.out.println(obj.message); // เข้าถึงได้
        obj.display(); // เรียกได้
    }
}
