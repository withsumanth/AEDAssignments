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
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
                        flight.setSerNo(valuesOfArray[3]);
                        flightSchedule.setDateOfSch(valuesOfArray[4]);
                        flight.setCostOfSeat(travelAgency.seatType.seatType(valuesOfArray[5]));
                        flight.setSeatNo(valuesOfArray[6]);
                    }
	            bufferedReader.close();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
                }
                ArrayList<Flight> flightDetails=  travelAgency.getAirlinesDet().getAirLinesDet();
                flightDetails.sort(Comparator.comparing((Flight p)->p.getAirPlaneName()).thenComparing(p->p.getSerNo()));
                List serialNo = new ArrayList();
                for(int i=0;i<flightDetails.size();i++){
                    serialNo.add(i, flightDetails.get(i).getSerNo());
                }
                ArrayList<Integer> getFrequencyDetailsForSerNo = new ArrayList<Integer>();
                int freqCountForSer = 0;
                Set<String> mySetForSer = new HashSet<String>(serialNo);
	        for(String s: mySetForSer){
                    getFrequencyDetailsForSerNo.add(freqCountForSer, Collections.frequency(serialNo,s)) ;
                    freqCountForSer++;
	        }
                Map eachDetailsForSer = new HashMap();
                int countArray = 0;
                for(int i = 0;i<getFrequencyDetailsForSerNo.size();i++){
                    int count = 0;
                    ArrayList<Flight> flightDetailsNew = new ArrayList<Flight>(); 
                    for(int j=0;j<getFrequencyDetailsForSerNo.get(i);j++){
                        flightDetailsNew.add(count,flightDetails.get(countArray));
                        countArray++;
                        count++;
                    }
                    eachDetailsForSer.put(i, flightDetailsNew);
                } 
                List airLine = new ArrayList();
                for(int i=0;i<flightDetails.size();i++){
                    airLine.add(i, flightDetails.get(i).getAirPlaneName());
                }
                ArrayList<Integer> getFrequencyDetailsForAirline = new ArrayList<Integer>();
                int freqCountForAirline = 0;
                Set<String> mySetForAirline = new HashSet<String>(airLine);
	        for(String s: mySetForAirline){
                    getFrequencyDetailsForAirline.add(freqCountForAirline, Collections.frequency(airLine,s)) ;
                    freqCountForAirline++;
	        }
                Map eachDetailsForAirline = new HashMap();
                int countArrayForAirline = 0;
                for(int i = 0;i<getFrequencyDetailsForAirline.size();i++){
                    int count = 0;
                    ArrayList<Flight> flightDetailsNew = new ArrayList<Flight>(); 
                    for(int j=0;j<getFrequencyDetailsForAirline.get(i);j++){
                        flightDetailsNew.add(count,flightDetails.get(countArrayForAirline));
                        countArrayForAirline++;
                        count++;
                    }
                    eachDetailsForAirline.put(i, flightDetailsNew);
                } 
                for(int i=0;i<eachDetailsForSer.size();i++){
                   ArrayList<Flight> revenueOfSingleFlight =  (ArrayList<Flight>) eachDetailsForSer.get(i);
                   int costOfSingleFlight = 0;
                   String flightName;
                   String serialNumber;
                   flightName = revenueOfSingleFlight.get(0).getAirPlaneName();
                   serialNumber = revenueOfSingleFlight.get(0).getSerNo();
                   for(int j=0;j<revenueOfSingleFlight.size();j++){
                       costOfSingleFlight = costOfSingleFlight + revenueOfSingleFlight.get(j).getCostOfSeat();
                   }
                    System.out.println("Revenue of " + flightName +" with Serial Number "+serialNumber+" = "+ costOfSingleFlight);
                }
    }
}
