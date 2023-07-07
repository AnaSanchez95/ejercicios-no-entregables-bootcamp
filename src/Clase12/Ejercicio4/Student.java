package Clase12.Ejercicio4;

public class Student {
private String name;
private String lastName;
private double[] grades;

    public Student(){

    }
    public Student(String name, String lastName, double[] grades) {
        this.name = name;
        this.lastName = lastName;
        this.grades = grades;
    }
       public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }
    public Double gradesAverage(){
        double average = 0;
        for (int i = 0; i < getGrades().length; i++) {
            average += getGrades()[i];
        }
        average /= getGrades().length;
        return average;
    }
}
