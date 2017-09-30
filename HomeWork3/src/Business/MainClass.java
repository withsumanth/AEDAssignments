/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Sumanth
 */
public class MainClass {
    private static TravelAgency travelAgency;
    
    public static void main(String[] args) throws IOException {
        travelAgency = new TravelAgency();
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
                        Flight flight = travelAgency.airlinesDet.addDetails();
                        Customer customer = travelAgency.customerDet.addDetails();
                        String valuesOfArray[] = dataCsvArr.get(i);
                        customer.setName(valuesOfArray[0]);
                        flight.setAirPlaneName(valuesOfArray[1]);
                        flight.setCostOfSeat(valuesOfArray[2]);
                        flight.setSeatNo(valuesOfArray[3]);
                    }
	            bufferedReader.close();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
                }
                System.out.println(travelAgency.getAirlinesDet());
    }
}
