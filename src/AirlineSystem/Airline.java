package AirlineSystem;

import java.util.ArrayList;
import java.util.List;

public class Airline {
	private	List<Flight> flights;
	private	List<Passenger> passengers;
	private	int flightCount;
	private	int passengerCount;

	 public Airline() {
	        this.flights = new ArrayList<>();
	        this.passengers = new ArrayList<>();
	        this.flightCount = 0;
	        this.passengerCount = 0;
	    }

	    public void addFlight(Flight flight) {
	        flights.add(flight);
	        flightCount++;
	        System.out.println("Flight added successfully!");
	    }

	    public void removeFlight(String flightNumber) {
	        for (Flight flight : flights) {
	            if (flight.getFlightNumber().equals(flightNumber)) {
	                flights.remove(flight);
	                flightCount--;
	                System.out.println("Flight removed successfully!");
	                return;
	            }
	        }
	        System.out.println("Flight not found.");
	    }

	    public void registerPassenger(Passenger passenger) {
	        passengers.add(passenger);
	        passengerCount++;
	        System.out.println("Passenger registered successfully!");
	    }

	    public void unregisterPassenger(String passportNumber) {
	        for (Passenger passenger : passengers) {
	            if (passenger.getPassportNumber().equals(passportNumber)) {
	                passengers.remove(passenger);
	                passengerCount--;
	                System.out.println("Passenger unregistered successfully!");
	                return;
	            }
	        }
	        System.out.println("Passenger not found.");
	    }

	    public void bookFlight(String passportNumber, String flightNumber) {
	        for (Passenger passenger : passengers) {
	            if (passenger.getPassportNumber().equals(passportNumber)) {
	                for (Flight flight : flights) {
	                    if (flight.getFlightNumber().equals(flightNumber)) {
	                        passenger.bookFlight(flight);
	                        return;
	                    }
	                }
	                System.out.println("Flight not found.");
	                return;
	            }
	        }
	        System.out.println("Passenger not found.");
	    }

	    public void cancelBooking(String passportNumber, String flightNumber) {
	        for (Passenger passenger : passengers) {
	            if (passenger.getPassportNumber().equals(passportNumber)) {
	                for (Flight flight : flights) {
	                    if (flight.getFlightNumber().equals(flightNumber)) {
	                        passenger.cancelBooking(flight);
	                        return;
	                    }
	                }
	                System.out.println("Flight not found.");
	                return;
	            }
	        }
	        System.out.println("Passenger not found.");
	    }

	    public void listAvailableFlights() {
	        for (Flight flight : flights) {
	            if (flight.isAvailable()) {
	                System.out.println(flight.toString());
	            }
	        }
	    }

	    public void listBookedFlights() {
	        for (Flight flight : flights) {
	            if (!flight.isAvailable()) {
	                System.out.println(flight.toString());
	            }
	        }
	    }
	}

