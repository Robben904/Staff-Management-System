package CourseWork2;

public class PartTimeStaffHire extends StaffHire//linking with its parent class
{
    private int workingHour;
    private int wagesPerHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    private boolean joined;
    private boolean terminated;
    public PartTimeStaffHire(int vacancyNumber, String designation, String jobType,
                             int workingHour, int wagesPerHour, String shifts){
        super(vacancyNumber,designation,jobType);//calling variable declared in super class
        this.workingHour=workingHour;
        this.wagesPerHour= wagesPerHour;
        this.shifts= shifts;
        String staffName="";
        String joiningDate="";
        String qualification="";
        String appointedBy="";
        boolean joined= false;
        boolean terminated= false;
    }
    public int getWorkingHour(){
        return workingHour;
    }
    public void setWorkingHour(int workingHour){
        this.workingHour = workingHour;
    }
    public int getWagesPerHour(){
        return wagesPerHour;
    }
    public void setWagesPerHour(int wagesPerHour){
        this.wagesPerHour = wagesPerHour;
    }
    public String getShifts(){
        return shifts;
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
    public void setJoiningDate (String joiningDate){
        this.joiningDate = joiningDate;
    }
    public String getQualification(){
        return qualification;
    }
    public void setQualification(String qualification){
        this.qualification = qualification;
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
    public boolean getTerminated(){
        return terminated;
    }
    public void setTerminated (boolean terminated){
        this.terminated = terminated;
    }
    public void setShifts(String newShifts){
        if (joined == false){ //analysing the condition true or false
            shifts = newShifts;
        }
        else{
            System.out.println("You are already hire");
        }
    }
    public void hirePartTimeStaffHire(String staffName, String joiningDate, String qualification, String appointedBy){
        if(joined==true){
            System.out.println("You are already our staff" +staffName);
            System.out.println("Your joining Date is" +joiningDate);
        }
        else{
            this.staffName= staffName;
            this.joiningDate= joiningDate;
            this.qualification= qualification;
            this.appointedBy= appointedBy;
            boolean joined = true;
            boolean terminated= false;
        }
    }
    public void terminate(){
        if (terminated == true){
            System.out.println("you are already terminated");
        }
        else {
            this.staffName="";
            this.joiningDate="";
            this.qualification="";
            this.appointedBy="";
            joined=false;
            terminated=true;
        }
    }
    public void display(){

        if(joined==true){
            super.display();
            System.out.println("Staff name is" +staffName);
            System.out.println("Your wages per hour is: " +wagesPerHour);
            System.out.println("Your working hour is: " +workingHour);
            System.out.println("You have joined on:" +joiningDate);
            System.out.println("Your qualification is:" +qualification);
            System.out.println("You are appointed by: " +appointedBy);
            System.out.println("your income per day is" +wagesPerHour * +workingHour);
        }
        else {
            super.display();
        }
    }

}




