
public class app 
{

    public static void main(String[] args)
    {
        Course c1;
        Course c2; 
        
        CourseName ce = new CourseName("Cyber", "1", "h");
             GenEd ge = new GenEd("IL", "Interational Cultures", 3);
        CourseName pr = new CourseName("CMPSC", "101", "");
        
       c1 = new Course();
       c2 = new Course(ce, ge, "Test for 240", 3, 9, 99, pr);
     
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}