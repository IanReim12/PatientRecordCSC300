package com.example.broncoian2.patientrecordcsc300;

public class PatientRecord
{
    //fields
    private String first_name;
    private String last_name;
    private char middle_initial;
    private int age;
    private int height_feet;
    private int height_inch;

    //constructor
    public PatientRecord(String first_name, String last_name, char middle_initial, int age,int height_feet, int height_inch)
    {
        this.first_name = first_name;
        this.last_name = last_name;
        this.middle_initial = middle_initial;
        this.age = age;
        this.height_feet = height_feet;
        this.height_inch = height_inch;
    }

    @Override
    public String toString()
    {
        return this.first_name + " " + this.middle_initial + " " + this.last_name + " (" + this.age + ")" + " "  + this.height_feet + "foot" + " " + this.height_inch + "inches";
    }

    public void display()
    {
        System.out.println(this.first_name + " " + this.middle_initial + " " + this.last_name + " (" + this.age + ")" + " "  + this.height_feet + "foot" + " " + this.height_inch + "inches");
        //System.out.format("%s %c %s (%d)", this.first_name, this.middle_initial, this.last_name, this.age);
    }
    public int getAge()
    {
        return this.age;
    }

    public void setAge(int age)
    {
        if(age >= 1)
        {
            this.age = age;
        }
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public char getMiddle_initial() {
        return middle_initial;
    }
}
