import javax.swing.*;
import java.util.ArrayList;

public class UserInterface {
    ArrayList<Person> data = new ArrayList<>();//the list to store the data

    /**
     * the beginning of the program
     */
    public void begin(){
        while (true){
            int selection = showMenu();
            switch (selection){
                case 1:addStudent();break;
                case 2:addTeacher();break;
                case 3:display();break;
                case 4:JOptionPane.showMessageDialog(null,"******End******");return;
                default:JOptionPane.showMessageDialog(null, "\n*** Invalid Selection ***\n", "ERROR",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    /**
     * user's selection menu
     * @return user's selection
     */
    public int showMenu(){
        String s = JOptionPane.showInputDialog(
                "******MENU******\n\n"+"1.Add a new Student\n"
                +"2.Add a new Teacher\n"+"3.Display all details\n"
                +"4.Exit\n\n"+"Type in the number of your selection and click OK\n"
        );
        return Integer.parseInt(s.trim());
    }

    /**
     * add a student object to the array list
     */
    public void addStudent(){
        String name = JOptionPane.showInputDialog("input the name").trim();
        String sex = JOptionPane.showInputDialog("input the sex").trim();
        int feet = Integer.parseInt(JOptionPane.showInputDialog("input the feet of the height"));
        while (feet <= 0){
            feet = Integer.parseInt(JOptionPane.showInputDialog("invalid input, input again!"));
        }
        int inch = Integer.parseInt(JOptionPane.showInputDialog("input the inch of the height"));
        while (inch <= 0){
            inch = Integer.parseInt(JOptionPane.showInputDialog("invalid input, input again!"));
        }
        int age = Integer.parseInt(JOptionPane.showInputDialog("input the age"));
        while (age <= 0){
            age = Integer.parseInt(JOptionPane.showInputDialog("invalid input, input again!"));
        }
        int studentID = Integer.parseInt(JOptionPane.showInputDialog("input the studentID"));
        String major = JOptionPane.showInputDialog("input the major");
        String department = JOptionPane.showInputDialog("input the department");
        data.add(new Student(name,sex,age,new Height(feet,inch),studentID,major,department));
    }

    /**
     * add a teacher object in the array list
     */
    public void addTeacher(){
        String name = JOptionPane.showInputDialog("input the name").trim();
        String sex = JOptionPane.showInputDialog("input the sex").trim();
        int feet = Integer.parseInt(JOptionPane.showInputDialog("input the feet of the height"));
        while (feet <= 0){
            feet = Integer.parseInt(JOptionPane.showInputDialog("invalid input, input again!"));
        }
        int inch = Integer.parseInt(JOptionPane.showInputDialog("input the inch of the height"));
        while (inch <= 0){
            inch = Integer.parseInt(JOptionPane.showInputDialog("invalid input, input again!"));
        }
        int age = Integer.parseInt(JOptionPane.showInputDialog("input the age"));
        while (age <= 0){
            age = Integer.parseInt(JOptionPane.showInputDialog("invalid input, input again!"));
        }
        int teacherID = Integer.parseInt(JOptionPane.showInputDialog("input the teacherID"));
        String teachingCourses = JOptionPane.showInputDialog("input the teaching courses");
        int teachingAge = Integer.parseInt(JOptionPane.showInputDialog("input the teaching age"));
        while (teachingAge <= 0){
            teachingAge = Integer.parseInt(JOptionPane.showInputDialog("invalid input, input again!"));
        }
        data.add(new Teacher(name,sex,age,new Height(feet,inch),teacherID,teachingCourses,teachingAge));
    }

    /**
     * display the data from the array list
     */
    public void display(){
        for (int i = 0;i < data.size();i++){
            JOptionPane.showMessageDialog(null,data.get(i).toString(),
                    "Person's information",JOptionPane.PLAIN_MESSAGE);
        }
        JOptionPane.showMessageDialog(null,"There are "+ data.size()+
        " person in the list","total information",JOptionPane.PLAIN_MESSAGE);
    }
}
