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
import java.util.Comparator;
import java.util.List;

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
                        FlightSchedule flightSchedule = travelAgency.masterSch.addDetails();
                        String valuesOfArray[] = dataCsvArr.get(i);
                        customer.setName(valuesOfArray[0]);
                        customer.setAge(Integer.parseInt(valuesOfArray[1])) ;
                        flight.setAirPlaneName(valuesOfArray[2]);
                        flightSchedule.setDateOfSch(valuesOfArray[3]);
                        flight.setCostOfSeat(travelAgency.seatType.seatType(valuesOfArray[4]));
                        flight.setSeatNo(valuesOfArray[5]);
                    }
	            bufferedReader.close();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
                }
                ArrayList<Flight> flightDetails=  travelAgency.getAirlinesDet().getAirLinesDet();
                ArrayList<FlightSchedule> scheduleDetails =  travelAgency.getMasterSch().getMasterSch();
                //List<Flight> players = flightDetails.sort(Comparator.comparing(Flight::getAirPlaneName));

	        	//compare(flightDetails.get(0),flightDetails.get(1));		
	        			    
	        			    
                for(int i=0;i<flightDetails.size();i++){
                    if(flightDetails.get(i).getAirPlaneName().equals("Emirates") && scheduleDetails.get(i).getDateOfSch().equals("30-10-2017'")){
                        System.out.println(flightDetails.get(i).getCostOfSeat());
                    }
                }
    }
    /*public int compare(ArrayList<Flight> o1, ArrayList<Flight> o2) {
    return AirlinesDet.()
      .compare(o1.getProperty1(), o2.getProperty1())
      .compare(o1.getProperty2(), o2.getProperty2())
      .result();*/
 //}
}
