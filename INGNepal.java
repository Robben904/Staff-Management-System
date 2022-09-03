package CourseWork2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class INGNepal {
    private ArrayList <StaffHire> staffDetail;
    JFrame frame = new JFrame("Staff Hire Form"); //creating a JFrame


    public INGNepal(){
        staffDetail = new ArrayList<>();

        JPanel panel1 = new JPanel();//making new JPanel
        JPanel panel2 = new JPanel();//making new JPanel

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//setting close on exit for frame
        frame.setSize(800, 800);//adjusting size of the frame

        panel1.setBorder(BorderFactory.createLineBorder(Color.black));//setting the border color
        panel2.setBorder(BorderFactory.createLineBorder(Color.black));//setting the border color

        GridBagConstraints gbc = new GridBagConstraints();//creating new gridbagconstraint
        gbc.insets = new Insets(3, 3, 3, 3);

        frame = new JFrame();
        frame.setLayout(new BorderLayout()); //setting borderLayout
        staffDetail = new ArrayList<>();
    }

    public void fullTimeStaffHire(){
        //Creating new textfields
        JTextField vacancyNumberTf= new JTextField(15);
        JTextField designationTf = new JTextField(15);
        JTextField jobTypeTf = new JTextField(15);
        JTextField staffNameTf = new JTextField(15);
        JTextField qualificationTf = new JTextField(15);
        JTextField joiningDateTf = new JTextField(15);
        JTextField appointedByTf = new JTextField(15);
        JTextField workingHourTf = new JTextField(15);
        JTextField salaryTf = new JTextField(15);
        JTextField vacancyNumberAddTf = new JTextField(15);

        //adding buttons to perform action
        JButton addFullTimeBtn = new JButton("Add Full Time Staff");
        JButton appointFullTimeBtn = new JButton("Appoint Full Time Staff");
        JButton displayFullTimeBtn = new JButton("Display Full Time Staff");
        JButton clearFullTimeBtn = new JButton("Clear Full Time Staff");

        //Creating JTextArea
        JTextArea displayFullTimeArea = new JTextArea(2,12);        //display area
        //setting panel for FullTimeStaffHire
        JPanel fullTimeStaffHirePanel = new JPanel();
        fullTimeStaffHirePanel.setLayout(new GridBagLayout());
        GridBagConstraints fullTimeGbc = new GridBagConstraints();

        fullTimeGbc.gridy = 0;
        fullTimeGbc.gridx= 1;
        fullTimeStaffHirePanel.add(new JLabel("FUll Time Staff Hire "),fullTimeGbc);

        fullTimeGbc.gridy++;
        fullTimeGbc.gridx = 2;
        fullTimeStaffHirePanel.add(new JLabel("Vacancy Number"), fullTimeGbc);
        fullTimeGbc.gridx = 3;
        fullTimeGbc.insets = new Insets(2,2,2,2);
        fullTimeStaffHirePanel.add(vacancyNumberTf, fullTimeGbc);

        fullTimeGbc.gridy++;
        fullTimeGbc.gridx= 2;
        fullTimeStaffHirePanel.add(new JLabel("Designation"), fullTimeGbc);
        fullTimeGbc.gridx = 3;
        fullTimeStaffHirePanel.add(designationTf, fullTimeGbc);

        fullTimeGbc.gridy++;
        fullTimeGbc.gridx= 2;
        fullTimeStaffHirePanel.add(new JLabel("Job type"), fullTimeGbc);
        fullTimeGbc.gridx = 3;
        fullTimeStaffHirePanel.add(jobTypeTf, fullTimeGbc);

        fullTimeGbc.gridy++;
        fullTimeGbc.gridx= 2;
        fullTimeStaffHirePanel.add(new JLabel("Salary"), fullTimeGbc);
        fullTimeGbc.gridx = 3;
        fullTimeStaffHirePanel.add(salaryTf, fullTimeGbc);

        fullTimeGbc.gridy++;
        fullTimeGbc.gridx= 2;
        fullTimeStaffHirePanel.add(new JLabel("Working Hour"), fullTimeGbc);
        fullTimeGbc.gridx = 3;
        fullTimeStaffHirePanel.add(workingHourTf, fullTimeGbc);

        fullTimeGbc.gridy++;
        fullTimeGbc.gridx= 2;
        fullTimeStaffHirePanel.add(new JLabel("Staff Name"), fullTimeGbc);
        fullTimeGbc.gridx = 3;
        fullTimeStaffHirePanel.add(staffNameTf, fullTimeGbc);

        fullTimeGbc.gridy++;
        fullTimeGbc.gridx= 2;
        fullTimeStaffHirePanel.add(new JLabel("Qualification"), fullTimeGbc);
        fullTimeGbc.gridx = 3;
        fullTimeStaffHirePanel.add(qualificationTf, fullTimeGbc);

        fullTimeGbc.gridy++;
        fullTimeGbc.gridx= 2;
        fullTimeStaffHirePanel.add(new JLabel("Joining Date"), fullTimeGbc);
        fullTimeGbc.gridx = 3;
        fullTimeStaffHirePanel.add(joiningDateTf, fullTimeGbc);

        fullTimeGbc.gridy++;
        fullTimeGbc.gridx= 2;
        fullTimeStaffHirePanel.add(new JLabel("Appointed By"), fullTimeGbc);
        fullTimeGbc.gridx = 3;
        fullTimeStaffHirePanel.add(appointedByTf, fullTimeGbc);

        fullTimeGbc.gridy++;
        fullTimeGbc.gridx= 2;
        fullTimeStaffHirePanel.add(new JLabel("Vacancy Number"), fullTimeGbc);
        fullTimeGbc.gridx = 3;
        fullTimeStaffHirePanel.add(vacancyNumberAddTf, fullTimeGbc);

        fullTimeGbc.gridy++;
        fullTimeGbc.gridx= 2;
        fullTimeStaffHirePanel.add(displayFullTimeArea, fullTimeGbc);

        fullTimeGbc.gridy++;
        fullTimeGbc.gridx = 2;
        fullTimeStaffHirePanel.add(addFullTimeBtn, fullTimeGbc);

        fullTimeGbc.gridy++;
        fullTimeGbc.gridx = 2;
        fullTimeStaffHirePanel.add(appointFullTimeBtn, fullTimeGbc);

        fullTimeGbc.gridy++;
        fullTimeGbc.gridx = 2;
        fullTimeStaffHirePanel.add(displayFullTimeBtn, fullTimeGbc);

        fullTimeGbc.gridy++;
        fullTimeGbc.gridx = 2;
        fullTimeStaffHirePanel.add(clearFullTimeBtn, fullTimeGbc);

        addFullTimeBtn.addActionListener(new ActionListener() {         //action listener button of add
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(designationTf.getText().equals("") || jobTypeTf.getText().equals("")){
                    JOptionPane.showMessageDialog(frame, "Please! fill in the boxes");
                    return;
                }

                try{
                    if (Integer.parseInt(vacancyNumberTf.getText()) < 0 || Integer.parseInt(salaryTf.getText()) < 0
                            || Integer.parseInt(workingHourTf.getText()) < 0 ){
                        JOptionPane.showMessageDialog(frame, "Please! enter valid character");
                        return;
                    }

                }catch (Exception ex){
                    JOptionPane.showMessageDialog(frame, "Please! enter the correct value");
                    return;
                }

                try{
                    int vacancyNumber = Integer.parseInt(vacancyNumberTf.getText());
                    int workingHour = Integer.parseInt(workingHourTf.getText());
                    String designation = designationTf.getText();
                    String jobType = jobTypeTf.getText();
                    int salary = Integer.parseInt(salaryTf.getText());
                    FullTimeStaffHire fullTimeStaffHire = new FullTimeStaffHire(vacancyNumber,designation,
                            jobType, salary, workingHour);
                    staffDetail.add(vacancyNumber, fullTimeStaffHire);
                    JOptionPane.showMessageDialog(frame, "Vacancy Added");
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(frame,"Vacancy number must begin from 0");
                }

            }
        });

        appointFullTimeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {      //checking all the value of text field if it is empty or not
                if(staffNameTf.getText().equals("") || qualificationTf.getText().equals("") || joiningDateTf.getText().equals("")
                        || appointedByTf.getText().equals("") || vacancyNumberAddTf.getText().equals("")){
                    JOptionPane.showMessageDialog(frame, "Please! fill the empty boxes");
                    return;
                }

                try{
                    int vacancyNumberNew = Integer.parseInt(vacancyNumberAddTf.getText());
                    if (vacancyNumberNew>= staffDetail.size()){
                        JOptionPane.showMessageDialog(frame, "Please! enter the same vacancy number");
                        return;
                    }
                    StaffHire staffDetailObj =  staffDetail.get(vacancyNumberNew);
                    if (vacancyNumberNew< staffDetail.size()){
                        if (staffDetailObj instanceof FullTimeStaffHire){
                            FullTimeStaffHire fullTimeStaffHire = (FullTimeStaffHire) staffDetailObj;
                            //calling hireFullTimeStaff form FullTimeHire class
                            fullTimeStaffHire.hireFullTimeStaff(staffNameTf.getText(), joiningDateTf.getText(), qualificationTf.getText(),
                                    appointedByTf.getText());


                        } else{
                            JOptionPane.showMessageDialog(frame, "Please! enter valid input");
                            return;
                        }
                    }
                } catch (Exception ex){
                    JOptionPane.showMessageDialog(frame, "Please! check input character");
                }
            }
        });

        clearFullTimeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                vacancyNumberTf.setText("");
                designationTf.setText("");
                jobTypeTf.setText("");
                staffNameTf.setText("");
                qualificationTf.setText("");
                joiningDateTf.setText("");
                workingHourTf.setText("");
                appointedByTf.setText("");
                salaryTf.setText("");
                vacancyNumberAddTf.setText("");
            }
        });

        displayFullTimeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                StringBuilder builder = new StringBuilder();
                for (StaffHire staff : staffDetail){
                    if(staff instanceof FullTimeStaffHire){
                        FullTimeStaffHire fullTimeStaffHire = (FullTimeStaffHire) staff;
                        builder.append(fullTimeStaffHire.getVacancyNumber());
                        builder.append(",");
                        builder.append(fullTimeStaffHire.getDesignation());
                        builder.append(",");
                        builder.append(fullTimeStaffHire.getJobType());
                        builder.append(",");
                        builder.append(fullTimeStaffHire.getSalary());
                        builder.append(",");
                        builder.append(fullTimeStaffHire.getWorkingHour());
                        builder.append(",");
                        builder.append(fullTimeStaffHire.getStaffName());
                        builder.append(",");
                        builder.append(fullTimeStaffHire.getQualification());
                        builder.append(",");
                        builder.append(fullTimeStaffHire.getJoiningDate());
                        builder.append(",");
                        builder.append(fullTimeStaffHire.getAppointedBy());
                        builder.append("\n");
                    }
                }
                if(builder.toString().isEmpty()){
                    JOptionPane.showMessageDialog(frame, "Please! fill all the empty field");
                }
                else{
                    displayFullTimeArea.setText(builder.toString());
                }
            }
        });


        displayFullTimeArea.setEditable(false);
        frame.add(fullTimeStaffHirePanel, BorderLayout.PAGE_START);
        frame.setSize(500, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }

    public void partTimeStaffHire() {
        //text fields
        JTextField vacancyNumberTf = new JTextField(15);
        JTextField designationTf = new JTextField(15);
        JTextField jobTypeTf = new JTextField(15);
        JTextField staffNameTf = new JTextField(15);
        JTextField qualificationTf = new JTextField(15);
        JTextField joiningDateTf = new JTextField(15);
        JTextField workingShiftsTf = new JTextField(15);
        JTextField appointedByTf = new JTextField(15);
        JTextField workingHourTf = new JTextField(15);
        JTextField wagesPerHourTf = new JTextField(15);
        JTextField vacancyNumberAddTf = new JTextField(15);

        //Adding buttons
        JButton addPartTimeBtn = new JButton("Add Part Time Staff");
        JButton appointPartTimeBtn = new JButton("Appoint Part Time Staff");
        JButton displayPartTimeBtn = new JButton("Display Part Time Staff");
        JButton clearPartTimeBtn = new JButton("Clear Part Time Staff");
        JButton terminatePartTimeBtn = new JButton("Terminate Part time Staff");

        JTextArea displayPartTimeArea = new JTextArea(4, 16);//display area

        //Setting panel
        JPanel partTimeStaffHirePanel = new JPanel();
        partTimeStaffHirePanel.setLayout(new GridBagLayout());
        GridBagConstraints partTimeGbc = new GridBagConstraints();

        partTimeGbc.gridy = 0;
        partTimeGbc.gridx = 0;
        partTimeStaffHirePanel.add(new JLabel("Part Time Staff Hire "), partTimeGbc);

        partTimeGbc.gridy++;
        partTimeGbc.gridx = 22;
        partTimeStaffHirePanel.add(new JLabel("Vacancy Number"), partTimeGbc);
        partTimeGbc.gridx = 23;
        partTimeGbc.insets = new Insets(2, 2, 2, 2);
        partTimeStaffHirePanel.add(vacancyNumberTf, partTimeGbc);

        partTimeGbc.gridy++;
        partTimeGbc.gridx = 22;
        partTimeStaffHirePanel.add(new JLabel("Designation"), partTimeGbc);
        partTimeGbc.gridx = 23;
        partTimeStaffHirePanel.add(designationTf, partTimeGbc);

        partTimeGbc.gridy++;
        partTimeGbc.gridx = 22;
        partTimeStaffHirePanel.add(new JLabel("Job type"), partTimeGbc);
        partTimeGbc.gridx = 23;
        partTimeStaffHirePanel.add(jobTypeTf, partTimeGbc);

        partTimeGbc.gridy++;
        partTimeGbc.gridx = 22;
        partTimeStaffHirePanel.add(new JLabel("Wages per hour"), partTimeGbc);
        partTimeGbc.gridx = 23;
        partTimeStaffHirePanel.add(wagesPerHourTf, partTimeGbc);

        partTimeGbc.gridy++;
        partTimeGbc.gridx = 22;
        partTimeStaffHirePanel.add(new JLabel("Working Hour"), partTimeGbc);
        partTimeGbc.gridx = 23;
        partTimeStaffHirePanel.add(workingHourTf, partTimeGbc);

        partTimeGbc.gridy++;
        partTimeGbc.gridx = 22;
        partTimeStaffHirePanel.add(new JLabel("Shift"), partTimeGbc);
        partTimeGbc.gridx = 23;
        partTimeStaffHirePanel.add(workingShiftsTf, partTimeGbc);

        partTimeGbc.gridy++;
        partTimeGbc.gridx = 22;
        partTimeStaffHirePanel.add(new JLabel("Staff Name"), partTimeGbc);
        partTimeGbc.gridx = 23;
        partTimeStaffHirePanel.add(staffNameTf, partTimeGbc);

        partTimeGbc.gridy++;
        partTimeGbc.gridx = 22;
        partTimeStaffHirePanel.add(new JLabel("Qualification"), partTimeGbc);
        partTimeGbc.gridx = 23;
        partTimeStaffHirePanel.add(qualificationTf, partTimeGbc);

        partTimeGbc.gridy++;
        partTimeGbc.gridx = 22;
        partTimeStaffHirePanel.add(new JLabel("Joining Date"), partTimeGbc);
        partTimeGbc.gridx = 23;
        partTimeStaffHirePanel.add(joiningDateTf, partTimeGbc);

        partTimeGbc.gridy++;
        partTimeGbc.gridx = 22;
        partTimeStaffHirePanel.add(new JLabel("Appointed By"), partTimeGbc);
        partTimeGbc.gridx = 23;
        partTimeStaffHirePanel.add(appointedByTf, partTimeGbc);

        partTimeGbc.gridy++;
        partTimeGbc.gridx = 22;
        partTimeStaffHirePanel.add(new JLabel("Vacancy Number"), partTimeGbc);
        partTimeGbc.gridx = 23;
        partTimeStaffHirePanel.add(vacancyNumberAddTf, partTimeGbc);

        partTimeGbc.gridy++;
        partTimeGbc.gridx = 23;
        partTimeStaffHirePanel.add(displayPartTimeArea, partTimeGbc);

        partTimeGbc.gridy++;
        partTimeGbc.gridx = 23;
        partTimeStaffHirePanel.add(addPartTimeBtn, partTimeGbc);

        partTimeGbc.gridy++;
        partTimeGbc.gridx = 23;
        partTimeStaffHirePanel.add(appointPartTimeBtn, partTimeGbc);

        partTimeGbc.gridy++;
        partTimeGbc.gridx = 23;
        partTimeStaffHirePanel.add(displayPartTimeBtn, partTimeGbc);

        partTimeGbc.gridy++;
        partTimeGbc.gridx = 23;
        partTimeStaffHirePanel.add(clearPartTimeBtn, partTimeGbc);

        partTimeGbc.gridy++;
        partTimeGbc.gridx = 23;
        partTimeStaffHirePanel.add(terminatePartTimeBtn, partTimeGbc);

        addPartTimeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(designationTf.getText().equals("") || jobTypeTf.getText().equals("")){
                    JOptionPane.showMessageDialog(frame, "Please! fill all the text field");
                    return;
                }

                try{
                    if (Integer.parseInt(vacancyNumberTf.getText()) < 0 || Integer.parseInt(wagesPerHourTf.getText()) < 0
                            || Integer.parseInt(workingHourTf.getText()) < 0 ){
                        JOptionPane.showMessageDialog(frame, "Please! enter  valid number");
                        return;
                    }

                }catch (Exception ex){
                    JOptionPane.showMessageDialog(frame, "Please! enter correct value");
                    return;
                }

                try{
                    int vacancyNumber = Integer.parseInt(vacancyNumberTf.getText());
                    int workingHour = Integer.parseInt(workingHourTf.getText());
                    String designation = designationTf.getText();
                    String jobType = jobTypeTf.getText();
                    int wagesPerHour = Integer.parseInt(wagesPerHourTf.getText() );
                    String shifts = workingShiftsTf.getText();
                    PartTimeStaffHire partTimeStaffHire = new PartTimeStaffHire(vacancyNumber,designation, jobType, workingHour, wagesPerHour,shifts);
                    staffDetail.add(vacancyNumber, partTimeStaffHire);
                    JOptionPane.showMessageDialog(frame, "Vacancy added");
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(frame,"Vacancy number should begin with 0");
                }

            }
        });

        appointPartTimeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(staffNameTf.getText().equals("") || qualificationTf.getText().equals("") || joiningDateTf.getText().equals("")
                        || appointedByTf.getText().equals("") || vacancyNumberAddTf.getText().equals("")){
                    JOptionPane.showMessageDialog(frame, "please! fill the empty boxes");
                    return;
                }

                try{
                    int vacancyNumberNew = Integer.parseInt(vacancyNumberAddTf.getText());
                    if (vacancyNumberNew>= staffDetail.size()){
                        JOptionPane.showMessageDialog(frame, "Please! enter the same vacancy number");
                        return;
                    }
                    StaffHire staffDetailObj =  staffDetail.get(vacancyNumberNew);
                    if (vacancyNumberNew< staffDetail.size()){
                        if (staffDetailObj instanceof PartTimeStaffHire){
                            PartTimeStaffHire partTimeStaffHire = (PartTimeStaffHire) staffDetailObj;
                            //calling hirePartTimeStaff form PartTimeHire class
                            partTimeStaffHire.hirePartTimeStaffHire(staffNameTf.getText(), joiningDateTf.getText(), qualificationTf.getText(),
                                    appointedByTf.getText());


                        } else{
                            JOptionPane.showMessageDialog(frame, "Please! enter same vacancy number");
                            return;
                        }
                    }
                } catch (Exception ex){
                    JOptionPane.showMessageDialog(frame, "Please! check the input character");
                }
            }
        });

        displayPartTimeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                StringBuilder builder = new StringBuilder();
                for (StaffHire staff : staffDetail){
                    if(staff instanceof PartTimeStaffHire){
                        PartTimeStaffHire partTimeStaffHire = (PartTimeStaffHire) staff;
                        builder.append(partTimeStaffHire.getVacancyNumber());
                        builder.append(",");
                        builder.append(partTimeStaffHire.getDesignation());
                        builder.append(",");
                        builder.append(partTimeStaffHire.getJobType());
                        builder.append(",");
                        builder.append(partTimeStaffHire.getWorkingHour());
                        builder.append(",");
                        builder.append(partTimeStaffHire.getStaffName());
                        builder.append(",");
                        builder.append(partTimeStaffHire.getQualification());
                        builder.append(",");
                        builder.append(partTimeStaffHire.getJoiningDate());
                        builder.append(",");
                        builder.append(partTimeStaffHire.getAppointedBy());
                        builder.append("\n");
                    }
                }
                if(builder.toString().isEmpty()){
                    JOptionPane.showMessageDialog(frame, "Please! fill all the text field");
                }
                else{
                    displayPartTimeArea.setText(builder.toString());
                }
            }
        });

        clearPartTimeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                vacancyNumberTf.setText("");
                designationTf.setText("");
                jobTypeTf.setText("");
                staffNameTf.setText("");
                qualificationTf.setText("");
                joiningDateTf.setText("");
                workingHourTf.setText("");
                appointedByTf.setText("");
                vacancyNumberAddTf.setText("");
            }
        });

        terminatePartTimeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try{
                    for(StaffHire terminate : staffDetail){
                        try{
                            int newVacancyNumber = Integer.parseInt(vacancyNumberAddTf.getText());
                            StaffHire staffDetailObj = staffDetail.get(newVacancyNumber);
                            if(newVacancyNumber < staffDetail.size()){
                                if(staffDetailObj instanceof PartTimeStaffHire){
                                    PartTimeStaffHire partTimeStaffHire = (PartTimeStaffHire) staffDetailObj;
                                    partTimeStaffHire.terminate();
                                } else{
                                    JOptionPane.showMessageDialog(frame, "Vacancy number did not match!");
                                    return;
                                }
                            }
                        } catch (Exception e){
                            JOptionPane.showMessageDialog(frame, "Please! enter vacancy number");
                            return;
                        }
                    }
                } catch (ConcurrentModificationException e){

                }
                JOptionPane.showMessageDialog(frame, "You are fired!");
            }
        });

        displayPartTimeArea.setEditable(false);
        frame.add(partTimeStaffHirePanel, BorderLayout.PAGE_START);
        frame.setSize(600, 540);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main (String []args){
        INGNepal abc = new INGNepal();
        abc.fullTimeStaffHire();
        abc.partTimeStaffHire();

    }

}
