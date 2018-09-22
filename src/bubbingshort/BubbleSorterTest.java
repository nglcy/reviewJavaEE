import java.util.Comparator;

/**
 * @author chenyuan
 * @version V1.0
 * @Title: Test
 * @Description: (用一句话描述该文件做什么)
 * @date 2018/8/29 23:53
 */
public class BubbleSorterTest {

    public static void main(String[] args) {
        Integer[] arr = {33, 1, 23, 11, 22, 211, 5, 11, 27, 45};
        BubbleSorter bubbleSorter = new BubbleSorter();
        bubbleSorter.sort(arr);
        System.out.println("-----------------------------");
        for (Integer i : arr) {
            System.out.print(i+"\t");
        }
       // Student stu = new Student();
        Student[] stu = {new Student(3,"admin",23),new Student(5,"tom",12),new Student(1,"user" ,8)};
        bubbleSorter.sort(stu, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int i =o1.age-o2.age;
                return i;
            }
        });

        System.out.println("-------------------------------------------------------");
        for (Student student: stu
             ) {
            System.out.println(student.getId()+","+student.getAge()+","+student.getName());
        }


    }

    private static class Student {
        private Integer id;
        private String name;
        private Integer age;
        public Student(Integer id, String name, Integer age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        public Student() {
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }
}
