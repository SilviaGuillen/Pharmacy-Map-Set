package org.example;

public class Main {
    public static void main(String[] args) {

        Pharmacy pharmacy = new Pharmacy();

        Medication med1 = new Medication("Paracetamol", 5.99, true);
        Medication med2 = new Medication("Amoxicillin", 10.99, false);
        Medication med3 = new Medication("Ibuprofen",9.95,true);

        pharmacy.save(med1);
        pharmacy.save(med2);
        pharmacy.save(med3);

        System.out.println("Number of medications in the pharmacy: " + pharmacy.getCount());
        System.out.println("Finding Paracetamol:");
        Medication foundMedication = pharmacy.find("Paracetamol");
        if (foundMedication != null) {
            System.out.println("Name: " + foundMedication.getName());
            System.out.println("Price: " + foundMedication.getPrice());
            System.out.println("Availability: " + (foundMedication.getAvailability() ? "Available" : "Not Available"));
        } else {
            System.out.println("Medication not found.");
        }

        System.out.println("\nPrinting all medications:");
        pharmacy.printAllMedications();

        System.out.println("Deleting Paracetamol.");
        pharmacy.delete("Paracetamol");

        System.out.println("\nPrinting all medications after deletion:");
        pharmacy.printAllMedications();
    }

}