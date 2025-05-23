package ss5_Access.Student;

public class student {
    private String name = "sót";
    private String classes = "C02";

    public student(){
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getInfo() {
        return "Tên: " + name + ", Lớp: " + classes;
    }

}