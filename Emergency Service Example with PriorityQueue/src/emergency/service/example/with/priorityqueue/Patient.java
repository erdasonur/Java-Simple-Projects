package emergency.service.example.with.priorityqueue;

public class Patient implements Comparable<Patient>{
    private String name;
    private String sickness;
    private int priority;
    public Patient(String name, String sickness) {
        this.name = name;
        this.sickness = sickness;
        
        if(sickness.equalsIgnoreCase("Appendicitis")){
            priority = 3;
        }
        else if(sickness.equalsIgnoreCase("Stomaache")){
            priority = 2;
        }
        else if(sickness.equalsIgnoreCase("Headache")){
            priority = 1;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSickness() {
        return sickness;
    }

    public void setSickness(String sickness) {
        this.sickness = sickness;
    }

    @Override
    public String toString() {
        return "Patient{" + "name=" + name + ", sickness=" + sickness + '}';
    }

    @Override
    public int compareTo(Patient patient) {
        if(this.priority > patient.priority)
            return -1;
        else if(this.priority < patient.priority)
            return 1;
        else
            return 0;
    }
    
}
