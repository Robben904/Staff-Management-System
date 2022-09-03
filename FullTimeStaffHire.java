package CourseWork2;

public class FullTimeStaffHire extends StaffHire //Linking the class with it
                                                // parent class
{
    public int salary;
    public int workingHour;
    public String staffName;
    public String joiningDate;
    public String qualification;
    public String appointedBy;
    public boolean joined;
    public FullTimeStaffHire(int vacancyNumber, String designation, String jobType, int salary, int workingHour){
        super(vacancyNumber, designation, jobType);//variable from super class had bee called
        this.salary= salary;
        this.workingHour=workingHour;
        this.staffName="";
        this.joiningDate="";
        this.qualification="";
        this.appointedBy="";
        this.joined= false;
    }
    //using getter method
    public int getSalary(){
        return salary;
    }

    public int getWorkingHour(){
        return workingHour;
    }
    public String getStaffName(){
        return staffName;
    }
    public void setStaffName(String staffName){
        this.staffName = staffName;
    }
    public String getJoiningDate(){
        return joiningDate;
    }

    public String getQualification(){
        return qualification;
    }
    public void setJoiningDate (String joiningDate){
        this.joiningDate = joiningDate;
    }
    public String getAppointedBy(){
        return appointedBy;
    }
    public void setAppointedBy(String appointedBy){
        this.appointedBy = appointedBy;
    }
    public boolean getJoined(){
        return joined;
    }
    public void setJoined(boolean joined){
        this.joined = joined;
    }
    public void setSalary(int newSalary){
        if(joined== false){
            salary=newSalary;
        }
        else {
            System.out.println("You are already appointed so your salary can not be changed");
        }
    }
    public void setWorkingHour(int newWorkingHour){
        workingHour= newWorkingHour;
    }
    public void hireFullTimeStaff(String staffName, String joiningDate,
                                  String qualification, String appointedBy){
        if (joined== true){
            System.out.println("You are already in job " +staffName);
            System.out.println("your joining date is:"  +joiningDate);}
        else{
            this.staffName= staffName;
            this.joiningDate= joiningDate;
            this.qualification= qualification;
            this.appointedBy= appointedBy;
            joined= true;
        }
    }
    public void display(){ //calling display method
        if(joined == true){
            super.display();
            System.out.println("Staff name is" +staffName);
            System.out.println("Your salary is: " +salary);
            System.out.println("Your working hour is: " +workingHour);
            System.out.println("You have joined on:" +joiningDate);
            System.out.println("Your qualification is:" +qualification);
            System.out.println("You are appointed by: " +appointedBy);
        }
        else{
            super.display();
        }
    }
}

