package emergency.service.example.with.priorityqueue;

public class Patient {
    private String name;
    private String sickness;
    private int priority;
    public Patient(String name, String sickness) {
        this.name = name;
        this.sickness = sickness;
        
        if(sickness.equalsIgnoreCase("Appendicitis")){
            
        }
        else if(sickness.equalsIgnoreCase("Stomaache")){
            
        }
        else if(sickness.equalsIgnoreCase("Headache")){
            
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
    
}
