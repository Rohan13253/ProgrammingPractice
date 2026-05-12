import java.util.*;
import java.time.LocalDate;
import java.io.*;

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

        System.out.println("------------------------------------------------------------");
    }

    public void ExportCSV()
    {
        if(Database.isEmpty())
        {
            System.err.println("------------------------------------------------------------");
            System.out.println("Nothing to Export as database in empty");
            System.err.println("------------------------------------------------------------");
            return;
        }

        String FileName = "MarvellousStudy.csv";

        try(FileWriter fwobj = new FileWriter(FileName))
        {
            // Write CSV header
            fwobj.write("Date,Subject,Duration,Description\n");

            // Travel databse
            for(StudyLog sobj : Database)
            {
                //write data
                fwobj.write(sobj.getDate() + ","+
                            sobj.getSubject().replace(",", " ")+ ","+
                            sobj.getDuration()+","+
                            sobj.getDescription().replace(",", " ")+"\n"
                            );
            }

            System.out.println("Log created sucessfully");
        }

        catch(Exception eobj)
        {
            System.out.println("Exception occured while creating the CSV.");
            System.out.println("Report this issue to Marvellous Infosystem");
        }

    }
}

public class program556  // StudyTrackerStarter
{ 
    public static void main(String[] args) 
    {
        StudyTracker stobj = new StudyTracker();

        Scanner Scannerobj = new Scanner(System.in);

        int iChoice = 0;
        

        System.out.println("------------------------------------------------------------");
        System.out.println("------Welcome to Marvellous study tracker Application-------");
        System.out.println("------------------------------------------------------------");

        do{
            System.out.println("Please select the appropriate option from below");
            System.out.println("1 : Insert new log in database");
            System.out.println("2 : View All study log");
            System.out.println("3 : Summary of study log by date");
            System.out.println("4 : Summary of study log by Subject");
            System.out.println("5 : Export study log to CSV file");
            System.out.println("6 : Exit the application");

            System.out.println("Select option:");
            iChoice = Scannerobj.nextInt();
            switch(iChoice)
            {
                case 1: //Insert new log in database
                    stobj.InsertLog();
                    break;
                
                case 2:  // View All study log
                    stobj.DisplayLog();
                    break;

                case 3: //Summary of study log by date

                    break;

                case 4:  //Summary of study log by Subject

                    break;

                case 5: // Export study log to CSV file
                    stobj.ExportCSV();
                    break;
                
                case 6: // Exit the application
                    System.out.println("------------------------------------------------------------");
                    System.out.println("Thank you for using our application");
                    System.out.println("------------------------------------------------------------");
                    break;

                default:
                    System.out.println("Please enter valid input");
            }
        }while(iChoice != 6);
        
        
    }   
}
