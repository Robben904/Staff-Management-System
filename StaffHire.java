package CourseWork2;

public class StaffHire //Created a class staffHire
{
    //Created a instance variable
    private int vacancyNumber;
    private String designation;
    private String jobType;
    //initialize the variable objects in a constructor
    public StaffHire(int vacancyNumber, String designation, String jobType){
        this.vacancyNumber= vacancyNumber;
        this.designation = designation;
        this.jobType = jobType;
    }

    //calling a value passed by a constructor
    public int getVacancyNumber(){
        return vacancyNumber;
    }


    public void setVacancyNumber(int vacancyNumber){
        this.vacancyNumber = vacancyNumber;
    }


    public String getDesignation(){
        return designation;
    }


    public void setDesignation(String designation){
        this.designation = designation;
    }


    public String getJobType(){
        return jobType;
    }


    public void setJobType(String jobType){
        this.jobType= jobType;
    }


    public void display(){
        System.out.println("Number of vacancy is: " +vacancyNumber);
        System.out.println("Designation is: " +designation);
        System.out.println("Job type is: " +jobType);
    }

}

