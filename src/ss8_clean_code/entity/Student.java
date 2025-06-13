package ss8_clean_code.entity;

import mvc.entity.Person;
public class Student extends Person {
    private Float point;
    private String className;

    public Student() {
        super();
    }

    public Student(long code, String name, String address, Float point, String className) {
        super(code, name, address);
        this.point = point;
        this.className = className;t
    }

    public Float getPoint() {
        return point;
    }

    public void setPoint(Float point) {
        this.point = point;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() + ", " +
                "point=" + point +
                ", className='" + className + '\'' +
                '}';
    }
}


