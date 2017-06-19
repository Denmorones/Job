
public class TechnicalStaff extends Employee {
    public String[] skills = new String [0]; // умения

    public String getDetails() {
        return super.getDetails() + "\nSkills: " + getSkill();
    }


    public void setSkill(String Skills) {
        String[] newSkills = new String[skills.length + 1];
        for (int i = 0; i < skills.length; i++){
            newSkills[i] = skills[i];
        }
        newSkills[newSkills.length - 1] = Skills;
        skills = newSkills;
    }

    public String getSkill() {
        String skill = "";
        for (int i = 0; i < skills.length; i++){
            skill += skills[i];
            if(i != (skills.length-1)){
                skill += ", ";
            }
        }
        return skill;
    }
}
