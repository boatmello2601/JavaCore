package access_modifier.Public_Exam.mypackage1;

public class SamePackageTest {
    public static void main(String[] args) {
        Public obj = new Public();
        System.out.println(obj.name); // เข้าถึงได้เพราะอยู่ใน แพ็คเก็จเดียวกัน
        System.out.println(obj.age); // เข้าถึงได้
        obj.disPlayNameAndAge();
    }
}
