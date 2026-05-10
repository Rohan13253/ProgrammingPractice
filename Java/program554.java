import java.util.*;
import java.time.Duration;
import java.time.LocalDate;

// Done
class StudyLog
{
    public LocalDate Date;
    public String Subject;
    public double Duration;
    public String Descrption;
    

    public StudyLog(LocalDate A,String B ,double C ,String D)
    {
        this.Date = A;
        this.Subject = B;
        this.Duration =C;
        this.Descrption = D;
    }

    @Override
    public String toString()
    {
        return Date+" | "+Subject +" | "+Duration+" | "+Descrption;
    }

    public LocalDate getDate()
    {
        return Date;
    }
    public String getSubject()
    {
        return Subject;
    }
    public double getDuration()
    {
        return Duration;
    }
    public String getDescription()
    {
        return Descrption;
    }

}

class StudyTracker
{
    // Data Structure to hold the data about study 
    private ArrayList <StudyLog> Database = new ArrayList <StudyLog> ();


    public void InsertLog()
    {
        Scanner Scannerobj = new Scanner(System.in);
        System.err.println("------------------------------------------------------------");
        System.out.println("---------Please enter the valid details of your study-------");
        System.err.println("------------------------------------------------------------");

        LocalDate DateObj = LocalDate.now();

        System.out.println("Please provide the name of subject like C/C++/OS/DS");
        String sub = Scannerobj.nextLine();

        System.out.println("Enter the time period of your study in hours");
        double dur = Scannerobj.nextDouble();
        Scannerobj.nextLine();

        System.out.println("Please provide the description of study for future refrence");
        String desc = Scannerobj.nextLine();

        StudyLog StudyObj = new StudyLog(DateObj, sub, dur, desc);

        Database.add(StudyObj);

        System.err.println("------------------------------------------------------------");
        System.out.println("-----------Study log gets stored succesfully----------------");
        System.err.println("------------------------------------------------------------");
    }

    public void DisplayLog()
    {
        System.err.println("------------------------------------------------------------");

        if(Database.isEmpty())
        {
            System.out.println("Nothing to display as database in empty");
            System.err.println("------------------------------------------------------------");
            return;
        }

        System.err.println("------------------------------------------------------------");

        System.out.println("---------Log report from Marvellous study tracker-----------");

        for(StudyLog sobj : Database)
        {
            System.out.println(sobj);
        }

        System.err.println("------------------------------------------------------------");

    }
}

public class program554  // StudyTrackerStarter
{ 
    public static void main(String[] args) 
    {
        StudyTracker stobj = new StudyTracker();

        stobj.DisplayLog();
        
        stobj.InsertLog();
        stobj.InsertLog();
        stobj.InsertLog();

        stobj.DisplayLog();
    }   
}
