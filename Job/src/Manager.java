
public class Manager extends Employee {

    private Editor employees1[] = new Editor[0];
    private TechnicalWriter employees2[] = new TechnicalWriter [0];
    private GraphicIllustrator employees3[] = new GraphicIllustrator [0];

    public void  displayManagerInformation() {
        System.out.println(super.getDetails()  + "\nDepartment: " + getEmployees());
    }


    public void setEmployee(Editor emp1) {
        Editor[] newEmployees = new Editor[employees1.length + 1];
        for (int i = 0; i < employees1.length; i++){
            newEmployees[i] = employees1[i];
        }
        newEmployees[newEmployees.length - 1] = emp1;
        employees1 = newEmployees;
    }
    public void setEmployee(TechnicalWriter emp1) {
        TechnicalWriter[] newEmployees = new TechnicalWriter[employees2.length + 1];
        for (int i = 0; i < employees2.length; i++){
            newEmployees[i] = employees2[i];
        }
        newEmployees[newEmployees.length - 1] = emp1;
        employees2 = newEmployees;
    }
    public void setEmployee(GraphicIllustrator emp1) {
        GraphicIllustrator[] newEmployees = new GraphicIllustrator[employees3.length + 1];
        for (int i = 0; i < employees3.length; i++){
            newEmployees[i] = employees3[i];
        }
        newEmployees[newEmployees.length - 1] = emp1;
        employees3 = newEmployees;
    }


    public String getEmployees() {
        String result = "";
        for (int i = 0; i < employees1.length; i++){
            result += employees1[i].displayEditorInformation();
        }
        for (int i = 0; i < employees2.length; i++){
            result += employees2[i].displayTechnicalWriterInformation();
        }
        for (int i = 0; i < employees3.length; i++){
            result += employees3[i].displayGraphicsIllustratorInformation();
        }
        return result;
    }
}
