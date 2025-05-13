package com.mycompany.hospitale;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Hospital Management");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new FlowLayout());

            JButton addDoctorBtn = new JButton("Add Doctor");
            JButton addPatientBtn = new JButton("Add Patient");
            JButton showHospitalBtn = new JButton("Show Hospital Info");

            addDoctorBtn.addActionListener(e -> {
                JTextField id = new JTextField(5);
                JTextField name = new JTextField(10);
                JTextField tele = new JTextField(10);
                JTextField spec = new JTextField(10);

                JPanel panel = new JPanel(new GridLayout(0, 1));
                panel.add(new JLabel("ID:"));
                panel.add(id);
                panel.add(new JLabel("Name:"));
                panel.add(name);
                panel.add(new JLabel("Telephone:"));
                panel.add(tele);
                panel.add(new JLabel("Specialization:"));
                panel.add(spec);

                int result = JOptionPane.showConfirmDialog(null, panel, 
                         "Enter Doctor Details", JOptionPane.OK_CANCEL_OPTION);
                if (result == JOptionPane.OK_OPTION) {
                    Doctor doctor = new Doctor(id.getText(), name.getText(), tele.getText(), spec.getText());
                    JOptionPane.showMessageDialog(null, "Doctor Added:\\n" + doctor.Name + " - " + doctor.Specialization);
                }
            });

            addPatientBtn.addActionListener(e -> {
                JTextField id = new JTextField(5);
                JTextField name = new JTextField(10);
                JTextField tele = new JTextField(10);
                JTextField age = new JTextField(5);

                JPanel panel = new JPanel(new GridLayout(0, 1));
                panel.add(new JLabel("ID:"));
                panel.add(id);
                panel.add(new JLabel("Name:"));
                panel.add(name);
                panel.add(new JLabel("Telephone:"));
                panel.add(tele);
                panel.add(new JLabel("Age:"));
                panel.add(age);

                int result = JOptionPane.showConfirmDialog(null, panel, 
                         "Enter Patient Details", JOptionPane.OK_CANCEL_OPTION);
                if (result == JOptionPane.OK_OPTION) {
                    try {
                        int patientAge = Integer.parseInt(age.getText());
                        Patient patient = new Patient(id.getText(), name.getText(), tele.getText(), patientAge);
                        JOptionPane.showMessageDialog(null, "Patient Added:\\n" + patient.Name + " - Age " + patient.Age);
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Invalid age format!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

            showHospitalBtn.addActionListener(e -> {
                Hospital hospital = new Hospital("City Hospital", "Cairo");
                JOptionPane.showMessageDialog(null, "Hospital: " + hospital.Name + "\\nLocation: " + hospital.Location);
            });

            frame.add(addDoctorBtn);
            frame.add(addPatientBtn);
            frame.add(showHospitalBtn);

            frame.setVisible(true);
        });
    }
}
