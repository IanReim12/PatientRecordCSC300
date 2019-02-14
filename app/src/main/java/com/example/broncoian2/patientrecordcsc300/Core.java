package com.example.broncoian2.patientrecordcsc300;

public class Core
{

    private static PatientRecord [] thePatients = new PatientRecord [1000];
    public static String[] bballplayerStrings = new String [1000];

    private static int numberOfPatients = 0;

    public static void addPatientRecord(PatientRecord pr)
    {
        Core.thePatients[Core.numberOfPatients] = pr;
        Core.bballplayerStrings [Core.numberOfPatients] = pr.toString();
        Core.numberOfPatients++;
    }

}
