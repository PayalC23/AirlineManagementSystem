package AirlineSystem;

import java.util.Arrays;

public class Passenger {
		private String name;
		private String passportNumber;
		private Flight[] bookedFlights;
		private int bookedFlightCount;

		 public Passenger(String name, String passportNumber) {
		        this.name = name;
		        this.passportNumber = passportNumber;
		        this.bookedFlights = new Flight[10]; // assuming a maximum of 10 booked flights
		        this.bookedFlightCount = 0;
		    }

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPassportNumber() {
			return passportNumber;
		}

		public void setPassportNumber(String passportNumber) {
			this.passportNumber = passportNumber;
		}

		public Flight[] getBookedFlights() {
			return bookedFlights;
		}

		public void setBookedFlights(Flight[] bookedFlights) {
			this.bookedFlights = bookedFlights;
		}

		public int getBookedFlightCount() {
			return bookedFlightCount;
		}

		public void setBookedFlightCount(int bookedFlightCount) {
			this.bookedFlightCount = bookedFlightCount;
		}
		 public void bookFlight(Flight flight) {
		        if (bookedFlightCount < bookedFlights.length) {
		            bookedFlights[bookedFlightCount] = flight;
		            bookedFlightCount++;
		            flight.bookFlight();
		            System.out.println("Flight booked successfully for passenger " + name);
		        } else {
		            System.out.println("Maximum number of flights booked for passenger " + name);
		        }
		    }

		    public void cancelBooking(Flight flight) {
		        for (int i = 0; i < bookedFlightCount; i++) {
		            if (bookedFlights[i].equals(flight)) {
		                bookedFlights[i] = null;
		                bookedFlightCount--;
		                flight.cancelBooking();
		                System.out.println("Booking cancelled successfully for passenger " + name);
		                return;
		            }
		        }
		        System.out.println("Flight not found in passenger's bookings.");
		    }

			@Override
			public String toString() {
				return "Passenger [name=" + name + ", passportNumber=" + passportNumber + ", bookedFlights="
						+ Arrays.toString(bookedFlights) + ", bookedFlightCount=" + bookedFlightCount + "]";
			}
}
