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

public class program547 
{ 
    public static void main(String[] args) 
    {
        StudyLog sobj1 = new StudyLog("C",2.5 , "pointer and Array");
        StudyLog sobj2 = new StudyLog("C++",2 , "polymorshism");
        StudyLog sobj3 = new StudyLog("Java",3.5 , "Inheritance");
        StudyLog sobj4 = new StudyLog("C",1.5 , "pointer and Array");
        StudyLog sobj5 = new StudyLog("C",1.0 , "pointer and Array");


        ArrayList <StudyLog> aobj = new ArrayList <StudyLog>();

        aobj.add(sobj1);
        aobj.add(sobj2);
        aobj.add(sobj3);
        aobj.add(sobj4);
        aobj.add(sobj5);

        for(StudyLog sobj : aobj)
        {
            System.out.println(sobj);
        }
    }   
}
