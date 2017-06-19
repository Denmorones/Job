

public class Editor extends TechnicalStaff {
    boolean type;

    public String displayEditorInformation() {
        return  "\n**********\n" + super.getDetails() + "\nEdition type: " + getEditType();
    }

    public void setEditType(boolean Type) {
        type = Type;

    }

    public String getEditType() {
        if (type = false) {
            return "Paper editing";
        } else return  "Electronic editing";
    }
}




