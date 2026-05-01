import java.util.*;

class StudyLog
{
    public String subject;
    public double duraton;
    public String descrption;

    public StudyLog(String A ,double B ,String C)
    {
        this.subject = A;
        this.duraton = B;
        this.descrption = C;
    }

    @Override
    public String toString()
    {
        return subject +"|"+duraton+" | "+descrption;
    }
}

public class program546 
{ 
    public static void main(String[] args) 
    {
        StudyLog sobj1 = new StudyLog("C",2.5 , "pointer Array");
        StudyLog sobj2 = new StudyLog("C++",2 , "pointer Array");
        StudyLog sobj3 = new StudyLog("Java",3.5 , "Array");

        System.out.println(sobj1);
        System.out.println(sobj2);
        System.out.println(sobj3);
    }   
}
