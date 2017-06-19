

public class Employee {
    public String name;
    private String position; //должность
    public int id;
    static int employeeID = 1;
    private int grade; // уровень

    public String getDetails(){
        return "Name: " + getName() + "\n" + "Position: " + getJobTitle() + "\n" + "ID: " + id + "\n" + "Grade: " + getLevel();
    }


    public void setName(String Name) {
        if(!Name.matches("[^0-9]+")){
            name = "Были заданы не верные данные";
        } else name = Name;
    }

    public String getName () {
        return name;
    }

    public void setJobTitle(String Position) {
        if(!Position.matches("[^0-9]+")){
            position = "Были заданы не верные данные";
        } else position = Position;
    }
    public String getJobTitle(){
        return position;
    }

    public void calculateEmployeeID() {
        id = employeeID++;
        }


    public void setLevel(int Grade) {
        grade = Grade;
    }
    public int getLevel(){
        return grade;
    }

}
