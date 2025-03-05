import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Student
{
    int id;
    String name;
    String clg_name;

    public Student(int id, String name, String clg_name) {
        this.id = id;
        this.name = name;
        this.clg_name = clg_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClg_name() {
        return clg_name;
    }

    public void setClg_name(String clg_name) {
        this.clg_name = clg_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", clg_name='" + clg_name + '\'' +
                '}';
    }

    public static void main(String[] args)
    {
    Student s1 = new Student(1,"Mangesh" ,  "iacsd");
    Student s2 = new Student(2,"abc" ,"xyz");
    Student s3 = new Student(2,"Kunal" ,"xyz");
    Student s4 = new Student(2,"Mayur" ,"xyz");

    Student s[] ={s1 ,s2, s3 , s4};

//        System.out.println(s1.getName());
//        System.out.println(s2.toString());
//        System.out.println(s3.toString());
//        System.out.println(s3);

        for(int i=0 ; i<4 ; i++)
        {
            if(s[i].getName().charAt(0) =='M')
            {
                System.out.println(s[i]);
            }
        }

        System.out.println("\n SORT BY CLG NAME \n");

        List<Student> filterStudent = Arrays.stream(s)
                .filter(i -> i.getClg_name().startsWith("x"))
                .collect(Collectors.toList());

        System.out.println(filterStudent.toString());

        System.out.println("\n\n List of CLgs");
        List<String> clgList = Arrays.stream(s)
                                .map(Student::getClg_name)
                                .filter(i -> i.startsWith("x"))
                                .distinct()
                                .collect(Collectors.toList());
        System.out.println(clgList.toString());
    }

}