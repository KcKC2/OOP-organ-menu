public class Fields {

    private String name;
    private String condition;


    public Fields(String name, String condition) {
        this.name = name;
        this.condition = condition;
    }

    public void description(){

        System.out.println("Name: "+this.getName());
        System.out.println("Medical Condition: "+this.getCondition());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
