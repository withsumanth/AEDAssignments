/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.AirplaneDetails;
import Business.AirplaneDetailsHistory;
import com.sun.glass.events.KeyEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Sumanth
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */ 
    
    private AirplaneDetailsHistory airplaneDetailsHist;
    CreateJPanel(AirplaneDetailsHistory airplaneDetailsHist) {
        initComponents();
        this.airplaneDetailsHist = airplaneDetailsHist;
        if(createPlaneDet.getSelectedItem().equals("From File")){
            jPanelFromData.setVisible(false);
            jPanelFromFile.setVisible(true);
        }else if(createPlaneDet.getSelectedItem().equals("From List of Data")){
           jPanelFromData.setVisible(true);
            jPanelFromFile.setVisible(false);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        createPlaneDet = new javax.swing.JComboBox<>();
        saveJBtn = new javax.swing.JButton();
        jPanelFromData = new javax.swing.JPanel();
        yearOfManLabel = new javax.swing.JLabel();
        numOfSeatsLabel = new javax.swing.JLabel();
        serNoLabel = new javax.swing.JLabel();
        modelNoLabel = new javax.swing.JLabel();
        timeOfFleetCatLabel = new javax.swing.JLabel();
        maintCertExpLabel = new javax.swing.JLabel();
        availablityLabel = new javax.swing.JLabel();
        airportNameLabel = new javax.swing.JLabel();
        airplaneNameTxt = new javax.swing.JTextField();
        yearOfManTxt = new javax.swing.JTextField();
        numOfSeatsTxt = new javax.swing.JTextField();
        serNoTxt = new javax.swing.JTextField();
        modelNoTxt = new javax.swing.JTextField();
        airplaneNameLabel = new javax.swing.JLabel();
        timeOfFleetCatTxt = new javax.swing.JTextField();
        airportNameTxt = new javax.swing.JTextField();
        maintCertExpChkBox = new javax.swing.JCheckBox();
        availablityChkBox = new javax.swing.JCheckBox();
        airportNameLabel1 = new javax.swing.JLabel();
        manuNameTxt = new javax.swing.JTextField();
        airportNameLabel2 = new javax.swing.JLabel();
        dateOfFlyTxt = new javax.swing.JTextField();
        airportNameLabel3 = new javax.swing.JLabel();
        originTxt = new javax.swing.JTextField();
        airportNameLabel4 = new javax.swing.JLabel();
        destinationTxt = new javax.swing.JTextField();
        jPanelFromFile = new javax.swing.JPanel();
        csvLabel = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Create Airplane Details");

        jLabel2.setText("Select way to create Airplane Details");

        createPlaneDet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "From File", "From List of Data" }));
        createPlaneDet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPlaneDetActionPerformed(evt);
            }
        });

        saveJBtn.setText("Save");
        saveJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJBtnActionPerformed(evt);
            }
        });

        yearOfManLabel.setText("  Year of Manufacture: ");

        numOfSeatsLabel.setText("Number of Seats:");

        serNoLabel.setText("Serail Number:");

        modelNoLabel.setText("Model Number:");

        timeOfFleetCatLabel.setText("Fleet Catalog updated Date (dd-mm-yyyy):");

        maintCertExpLabel.setText("Maintainance Certficate Expired:");

        availablityLabel.setText("Availablity of Airplane:");

        airportNameLabel.setText("Airport Name:");

        airplaneNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airplaneNameTxtActionPerformed(evt);
            }
        });

        yearOfManTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                yearOfManTxtKeyPressed(evt);
            }
        });

        numOfSeatsTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                numOfSeatsTxtKeyPressed(evt);
            }
        });

        airplaneNameLabel.setText("Airplane Name:");

        availablityChkBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availablityChkBoxActionPerformed(evt);
            }
        });

        airportNameLabel1.setText("Manufacturer Name:");

        airportNameLabel2.setText("Date of Departure (dd-mm-yyyy):");

        airportNameLabel3.setText("Origin:");

        airportNameLabel4.setText("Destination:");

        javax.swing.GroupLayout jPanelFromDataLayout = new javax.swing.GroupLayout(jPanelFromData);
        jPanelFromData.setLayout(jPanelFromDataLayout);
        jPanelFromDataLayout.setHorizontalGroup(
            jPanelFromDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFromDataLayout.createSequentialGroup()
                .addGroup(jPanelFromDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFromDataLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanelFromDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(airplaneNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numOfSeatsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(serNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modelNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maintCertExpLabel)
                            .addComponent(yearOfManLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFromDataLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(timeOfFleetCatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanelFromDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(timeOfFleetCatTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(modelNoTxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(serNoTxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numOfSeatsTxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yearOfManTxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(maintCertExpChkBox, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(airplaneNameTxt, javax.swing.GroupLayout.Alignment.LEADING))
                .addGroup(jPanelFromDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFromDataLayout.createSequentialGroup()
                        .addGroup(jPanelFromDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFromDataLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanelFromDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(airportNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(availablityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(airportNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(airportNameLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFromDataLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(airportNameLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFromDataLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(airportNameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanelFromDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(originTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(dateOfFlyTxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manuNameTxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(airportNameTxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(availablityChkBox, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(destinationTxt))
                .addGap(181, 181, 181))
        );
        jPanelFromDataLayout.setVerticalGroup(
            jPanelFromDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFromDataLayout.createSequentialGroup()
                .addGroup(jPanelFromDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFromDataLayout.createSequentialGroup()
                        .addGroup(jPanelFromDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(airplaneNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(airplaneNameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFromDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yearOfManLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearOfManTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelFromDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numOfSeatsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numOfSeatsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelFromDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(serNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(serNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelFromDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modelNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modelNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelFromDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(timeOfFleetCatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timeOfFleetCatTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanelFromDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maintCertExpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maintCertExpChkBox)))
                    .addGroup(jPanelFromDataLayout.createSequentialGroup()
                        .addGroup(jPanelFromDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(availablityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(availablityChkBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFromDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(airportNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(airportNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelFromDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(manuNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(airportNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFromDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateOfFlyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(airportNameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFromDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(originTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(airportNameLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFromDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(destinationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(airportNameLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        csvLabel.setText("Please select save inorder to create data from csv file");

        javax.swing.GroupLayout jPanelFromFileLayout = new javax.swing.GroupLayout(jPanelFromFile);
        jPanelFromFile.setLayout(jPanelFromFileLayout);
        jPanelFromFileLayout.setHorizontalGroup(
            jPanelFromFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFromFileLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(csvLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanelFromFileLayout.setVerticalGroup(
            jPanelFromFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(csvLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createPlaneDet, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jPanelFromFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(427, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jPanelFromData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(saveJBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(createPlaneDet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanelFromFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(43, 43, 43)
                .addComponent(jPanelFromData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(saveJBtn)
                .addGap(500, 500, 500))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void createPlaneDetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPlaneDetActionPerformed
        JTextField[] textDet ={airplaneNameTxt,yearOfManTxt,numOfSeatsTxt,serNoTxt,modelNoTxt,timeOfFleetCatTxt,airportNameTxt,manuNameTxt,dateOfFlyTxt,originTxt,destinationTxt};
        if(createPlaneDet.getSelectedItem().equals("From File")){
            jPanelFromData.setVisible(false);
            jPanelFromFile.setVisible(true);
        }else if(createPlaneDet.getSelectedItem().equals("From List of Data")){
            clearTextValues(textDet);
           jPanelFromData.setVisible(true);
            jPanelFromFile.setVisible(false);
        }
    }//GEN-LAST:event_createPlaneDetActionPerformed

    public void clearTextValues(JTextField[] textDet){
        for(JTextField td:textDet){
                td.setText("");
            }
    }
    private void airplaneNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airplaneNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_airplaneNameTxtActionPerformed

    private void saveJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJBtnActionPerformed
       SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        if(createPlaneDet.getSelectedItem().equals("From File")){
           String csvFile = "AirplaneDetails.csv";
	        BufferedReader bufferedReader = null;
	        String line = "";
	        String cvsSplitBy = ",";
	        try {
	            bufferedReader = new BufferedReader(new FileReader(csvFile));
                    ArrayList<String[]> dataCsvArr = new ArrayList();
                    int count = 0;
	            while ((line = bufferedReader.readLine()) != null) {
	                String[] dataFromCsv = line.split(cvsSplitBy);
                        dataCsvArr.add(count,dataFromCsv);
                        count++;
	            }
                    for(int i=1;i<dataCsvArr.size();i++){
                        AirplaneDetails airDet = airplaneDetailsHist.addDetails();
                        String valuesOfArray[] = dataCsvArr.get(i);
                        airDet.setAirplaneName(valuesOfArray[0]);
                        try {
                            airDet.setDateOfFly(formatter.parse(valuesOfArray[1]));
                            airDet.setTimeOfFleetCat(formatter.parse(valuesOfArray[6]));
                        } catch (ParseException ex) {
                             Logger.getLogger(CreateJPanel.class.getName()).log(Level.SEVERE, null, ex);
                         }
                        airDet.setYearOfMan(Integer.parseInt(valuesOfArray[2]));
                        airDet.setNumOfSeats(Integer.parseInt(valuesOfArray[3]));
                        airDet.setSerNo(valuesOfArray[4]);
                        airDet.setModelNo(valuesOfArray[5]);
                        airDet.setMaintCertExp(valuesOfArray[7]); 
                        airDet.setAvailablity(valuesOfArray[8]);
                        airDet.setAirportName(valuesOfArray[9]);
                        airDet.setManuName(valuesOfArray[10]);
                        airDet.setOrigin(valuesOfArray[11]);
                        airDet.setDestination(valuesOfArray[12]);
                    }
	            bufferedReader.close();
                    JOptionPane.showMessageDialog(null, "Data created successfully from CSV file");
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	  } catch (IOException ex) {
               Logger.getLogger(CreateJPanel.class.getName()).log(Level.SEVERE, null, ex);
           }
       }else if(createPlaneDet.getSelectedItem().equals("From List of Data")){
           JTextField[] textDet ={airplaneNameTxt,yearOfManTxt,numOfSeatsTxt,serNoTxt,modelNoTxt,timeOfFleetCatTxt,airportNameTxt,manuNameTxt,dateOfFlyTxt,originTxt,destinationTxt};
           Date dateOfFlyValue;
           Date timeOfFleetCatValue;
           int yearOfManValue;
           int numOfSeats;
           for(JTextField td:textDet){
                if(td.getText().trim().length()==0){
                   JOptionPane.showMessageDialog(null, "Please enter all fields");
                   return;
                }
            }
           try{
               dateOfFlyValue = formatter.parse(dateOfFlyTxt.getText());
               timeOfFleetCatValue = formatter.parse(timeOfFleetCatTxt.getText());
           }catch(ParseException ex){
               JOptionPane.showMessageDialog(null, "Please enter date format in dd-mm-yyyy");
               Logger.getLogger(UpdateJPanel.class.getName()).log(Level.SEVERE, null, ex);
               return;
           }
           try{
               yearOfManValue = Integer.parseInt(yearOfManTxt.getText());
               numOfSeats = Integer.parseInt(numOfSeatsTxt.getText());
           }catch(Exception e){
               JOptionPane.showMessageDialog(null, "Please enter Integer values");
               return;
           }
           AirplaneDetails airDet = airplaneDetailsHist.addDetails();
           airDet.setAirplaneName(airplaneNameTxt.getText());
           airDet.setDateOfFly(dateOfFlyValue);
           airDet.setTimeOfFleetCat(timeOfFleetCatValue);
           airDet.setYearOfMan(yearOfManValue);
           airDet.setNumOfSeats(numOfSeats);
           airDet.setSerNo(serNoTxt.getText());
           airDet.setModelNo(modelNoTxt.getText());
           if(maintCertExpChkBox.isSelected()){
              airDet.setMaintCertExp("Yes"); 
           }else{
               airDet.setMaintCertExp("No"); 
           }
           if(availablityChkBox.isSelected()){
               airDet.setAvailablity("Yes");
           }else{
               airDet.setAvailablity("No");
           }
           airDet.setAirportName(airportNameTxt.getText());
           airDet.setManuName(manuNameTxt.getText());
           airDet.setOrigin(originTxt.getText());
           airDet.setDestination(destinationTxt.getText());
           JOptionPane.showMessageDialog(null, "Data created successfully");
            clearTextValues(textDet);
            availablityChkBox.setSelected(false);
            maintCertExpChkBox.setSelected(false);
       }
    }//GEN-LAST:event_saveJBtnActionPerformed

    private void availablityChkBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availablityChkBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availablityChkBoxActionPerformed

    private void yearOfManTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yearOfManTxtKeyPressed
        textToInteger(evt,yearOfManTxt);
    }//GEN-LAST:event_yearOfManTxtKeyPressed

    private void numOfSeatsTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numOfSeatsTxtKeyPressed
        textToInteger(evt,numOfSeatsTxt);
    }//GEN-LAST:event_numOfSeatsTxtKeyPressed
    
    public void textToInteger(java.awt.event.KeyEvent evt,JTextField txtField){
        int key = evt.getKeyCode();
        if((key>=evt.VK_0 && key<=evt.VK_9) ||(key>=evt.VK_NUMPAD0 && key<=evt.VK_NUMPAD9)|| key==KeyEvent.VK_BACKSPACE ||  (key == KeyEvent.VK_DELETE) || (key == KeyEvent.VK_SLASH)){
            txtField.setEditable(true);
        }else{
            txtField.setEditable(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel airplaneNameLabel;
    private javax.swing.JTextField airplaneNameTxt;
    private javax.swing.JLabel airportNameLabel;
    private javax.swing.JLabel airportNameLabel1;
    private javax.swing.JLabel airportNameLabel2;
    private javax.swing.JLabel airportNameLabel3;
    private javax.swing.JLabel airportNameLabel4;
    private javax.swing.JTextField airportNameTxt;
    private javax.swing.JCheckBox availablityChkBox;
    private javax.swing.JLabel availablityLabel;
    private javax.swing.JComboBox<String> createPlaneDet;
    private javax.swing.JLabel csvLabel;
    private javax.swing.JTextField dateOfFlyTxt;
    private javax.swing.JTextField destinationTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanelFromData;
    private javax.swing.JPanel jPanelFromFile;
    private javax.swing.JCheckBox maintCertExpChkBox;
    private javax.swing.JLabel maintCertExpLabel;
    private javax.swing.JTextField manuNameTxt;
    private javax.swing.JLabel modelNoLabel;
    private javax.swing.JTextField modelNoTxt;
    private javax.swing.JLabel numOfSeatsLabel;
    private javax.swing.JTextField numOfSeatsTxt;
    private javax.swing.JTextField originTxt;
    private javax.swing.JButton saveJBtn;
    private javax.swing.JLabel serNoLabel;
    private javax.swing.JTextField serNoTxt;
    private javax.swing.JLabel timeOfFleetCatLabel;
    private javax.swing.JTextField timeOfFleetCatTxt;
    private javax.swing.JLabel yearOfManLabel;
    private javax.swing.JTextField yearOfManTxt;
    // End of variables declaration//GEN-END:variables
}
