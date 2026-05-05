import java.util.*;
import java.time.LocalDate;

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

public class program550
{ 
    public static void main(String[] args) 
    {
        LocalDate lobj = LocalDate.now();

        System.out.println("Date: "+lobj);
    }   
}
