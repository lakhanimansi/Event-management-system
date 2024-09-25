import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.io.*;

class Hotel {
    String name;
    double ratings;
    int rentPerNight;

    Hotel(String name, double ratings, int rentPerNight, String location) {
        this.name = name;
        this.ratings = ratings;
        this.rentPerNight = rentPerNight;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Hotel [name=" + name + ", ratings=" + ratings + ", rentPerNight=" + rentPerNight + "]";
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRatings() {
        return ratings;
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }

    public int getRentPerNight() {
        return rentPerNight;
    }

    public void setRentPerNight(int rentPerNight) {
        this.rentPerNight = rentPerNight;
    }

}

class PartyPlot {
    String name, address;
    double ratings;
    int perPlateCharge;

    PartyPlot(String name, double ratings, int perPlateCharge, String address) {
        this.name = name;
        this.ratings = ratings;
        this.perPlateCharge = perPlateCharge;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRatings() {
        return ratings;
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }

    public int getPerPlateCharge() {
        return perPlateCharge;
    }

    public void setPerPlateCharge(int perPlateCharge) {
        this.perPlateCharge = perPlateCharge;
    }

}

class Event_management {
    Map<Integer, Hotel> hotelMap = new HashMap<>();
    Map<Integer, PartyPlot> partyPlotMap = new HashMap<>();

    Event_management() {
         // Initialize hotels and party plots
         hotelMap.put(1, new Hotel("Hotel Hyatt", 8.3, 40000, "17/A, Ashram Rd, Usmanpura, Ahmedabad, Gujarat 380014"));
         hotelMap.put(2, new Hotel("Artilla In", 8.2, 31020,
                 "Artilla Inn , Opposite TownHall , At, Swami Vivekanand Bridge, Ellisbridge, Ahmedabad, Gujarat 380006"));
 
         partyPlotMap.put(1, new PartyPlot("Arose Foods Banquet", 4.7, 379,
                 "2F5P+92W, Arose Foods, Karnavati Club Road YMCA to Bopal, Mohamadpura, Ahmedabad, Gujarat 380058"));
         partyPlotMap.put(2, new PartyPlot("Under The Neem Trees", 4.6, 2250,
                 "opp. Mahila Municipal Garden, Rajpath Rangoli Rd, Bodakdev, Ahmedabad, Gujarat 380054"));
 
         hotelMap.put(3, new Hotel("Novotel Ahmedabad", 8.1, 40770,
                 "Iscon Cross Roads, Sarkhej - Gandhinagar Hwy, next to Wide Angle Cinema,Ahmedabad, Gujarat 380015"));
         hotelMap.put(4,
                 new Hotel("DoubleTree by Hilton", 8.2, 52270, "Ambli Rd,VikramNagar, Ahmedabad, Gujarat 380058"));
         hotelMap.put(5,
                 new Hotel("Hotel Crown Plaza", 8.2, 59999,
                         "Sarkhej - Gandhinagar, near Shapath V, Prahlad Nagar, Ahmedabad, Gujarat 380015"));
         hotelMap.put(6, new Hotel("Hotel Ummed", 6.9, 62490,
                 "The Ummed, Airport Cir,Sardarnagar, Hansol, Ahmedabad, Gujarat 382475"));
         hotelMap.put(7, new Hotel("Courtyard by Marriott", 8.5, 60010,
                 "Ramdev Nagar Cross Road, Satellite Rd,Ahmedabad, Gujarat 380015"));
         hotelMap.put(8, new Hotel("Hotel Elysian residency", 8.0, 39999,
                 "Hotel Elysian Residency, Opp Reliance Mall Near Namaste Circle(BAPS Circle, Road, Shahibag, Ahmedabad, Gujarat 380004"));
         hotelMap.put(9, new Hotel("Four Points by Sheraton", 8.2, 42999,
                 "opposite Gujarat College, Ellisbridge, Ahmedabad, Gujarat 380006"));
         partyPlotMap.put(3, new PartyPlot("Suramya Abode Resort", 3, 850,
                 "Suramya Abode Club, Sanand - Nalsarovar Rd, Rethal, Gujarat 382220"));
         partyPlotMap.put(4, new PartyPlot("Arose Foods Banquet", 4.7, 379,
                 "2F5P+92W, Arose Foods, Karnavati Club Road YMCA to Bopal, Mohamadpura,Ahmedabad, Gujarat 380058"));
         partyPlotMap.put(5, new PartyPlot("Under The Neem Trees", 4.6, 2250,
                 "opp. Mahila Municipal Garden, Rajpath Rangoli Rd, Bodakdev, Ahmedabad,Gujarat 380054"));
         partyPlotMap.put(6, new PartyPlot("Suramya Abode Resort", 3, 850,
                 "Suramya Abode Club, Sanand - Nalsarovar Rd, Rethal, Gujarat 382220"));
         partyPlotMap.put(7, new PartyPlot("Club Babylon", 5.0, 950,
                 "Near, Babylon Club Road, S P Road, Science City Cir, Bhadaj, Gujarat380060"));
         partyPlotMap.put(8, new PartyPlot("Maple 99 Resort and Banquet", 5.0, 600,
                 "Sardar Patel Ring Rd, NEAR TAPOVAN CIRCLE, Chandkheda, Ahmedabad, Gujarat382424"));
 
        Scanner sc = new Scanner(System.in);
        int add = 0;
        boolean retry = true;
        while (retry) {
            try {
                System.out.println("What You want to add type 1 for hotel 2 for partploy");
                add = sc.nextInt();
                retry = false;

            } catch (Exception e) {
                System.out.println("Plz enter from given numbers");
            }

        }
        switch (add) {

            case 1:
                System.out.println("Do you want to add more hotels? (yes/no):");
                String userInput = sc.next();

                while (userInput.equalsIgnoreCase("yes")) {
                    System.out.println("Enter hotel details:");

                    // Read hotel details from the user
                    System.out.print("Hotel Name: ");
                    String hotelName = sc.next();

                    System.out.print("Rating: ");
                    double rating = sc.nextDouble();

                    System.out.print("Price: ");
                    int price = sc.nextInt();

                    sc.nextLine(); // Consume the newline character

                    System.out.print("Address: ");
                    String address = sc.nextLine();

                    // Generate a unique key for the hotel (you can use a counter for this)
                    int hotelId = hotelMap.size() + 1;

                    // Create a new Hotel object and add it to the map
                    hotelMap.put(hotelId, new Hotel(hotelName, rating, price, address));

                    System.out.println("Hotel added successfully!");

                    System.out.print("Do you want to add more hotels? (yes/no): ");
                    userInput = sc.next();
                }
                break;

            case 2:
                System.out.println("Do you want to add more PartyPlot? (yes/no):");
                String userInput1 = sc.next();

                while (userInput1.equalsIgnoreCase("yes")) {
                    System.out.println("Enter hotel details:");

                    // Read hotel details from the user
                    System.out.print("PartyPlot Name: ");
                    String PlotName = sc.next();

                    System.out.print("Rating: ");
                    double rating = sc.nextDouble();

                    System.out.print("Price: ");
                    int price = sc.nextInt();

                    sc.nextLine(); // Consume the newline character

                    System.out.print("Address: ");
                    String address = sc.nextLine();

                    // Generate a unique key for the hotel (you can use a counter for this)
                    int plotId = partyPlotMap.size() + 1;

                    // Create a new Hotel object and add it to the map
                    partyPlotMap.put(plotId, new PartyPlot(PlotName, rating, price, address));

                    System.out.println("Hotel added successfully!");

                    System.out.print("Do you want to add more PartyPlot? (yes/no): ");
                    userInput = sc.next();
                }
                break;
            default:
                System.out.println("Invalid Input");
        }

    }

    
       
    

    boolean isValidDate(String inputDate) {
        String[] dateParts = inputDate.split("/");

        // Check if day and date are of length 2
        if (dateParts.length != 3 || dateParts[0].length() != 2 || dateParts[1].length() != 2) {
            System.out.println("Invalid date format. It should be in the format of dd/mm/yyyy");
            return false;
        }

        int day = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int year = Integer.parseInt(dateParts[2]);

        // Check if year is between 2023 and 9999
        if (year < 2023 || year > 9999) {
            System.out.println("Year should be between 2023 and 9999");
            return false;
        }
        // Check if day is valid according to month and year
        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                if (day <= 31) {
                    return true;
                } else {
                    System.out.println("There are only 31 days in this month");
                    return false;
                }

            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                if (day <= 30) {
                    return true;
                } else {
                    System.out.println("There are only 30 days in this month");
                    return false;
                }
            case 2: // February
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    if (day <= 29) {
                        return true;
                    } else {
                        System.out.println("February has only 29 days in a leap year");
                        return false;
                    }
                } else {
                    if (day <= 28) {
                        return true;
                    } else {
                        System.out.println("February has only 28 days in a non-leap year");
                        return false;
                    }
                }
            default:
                System.out.println("Invalid month entered");
                return false;
        }
    }

    void addEvent() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your event name:");
        String eventName = sc.nextLine();

        System.out.println("Enter Date of your Event (dd/mm/yyyy):");

        // validating date format
        boolean validDate = false;
        String date = "";
        while (!validDate) {
            date = sc.nextLine();
            validDate = isValidDate(date);
            System.out.println(validDate ? "" : "\nPlease enter valid date in format(dd/mm/yyyy):");
        }
        String choice = "";
        boolean retry11 = true;
        while (retry11.get(userInput).equalsIgnoreCase()) {
            System.out.println("Would you like to choose hotel or party plot? (Enter H for hotel, P for party plot)");
            try {
                choice = sc.next();
                retry11 = false;
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        double totalCost = 0;
        boolean flag = false;
        int i = 0;
        int partyPlotChoice = 0;
        int hotelChoice = 0;
        int i1 = 0;
        int days = 0, plates = 0;
        boolean f1 = false, again = false;

        // try {

        switch (choice.toUpperCase()) {
            case "H":
                do {
                    f1 = false;
                    boolean retry = false;
                    while (!retry) {
                        try {
                            System.out.println("How many days? ");
                            days = sc.nextInt();
                            retry = true;

                        } catch (Exception e) {
                            System.out.println("Plz Enter Valid Number");
                            sc.nextLine();
                        }
                    }
                    for (i = 1; i <= hotelMap.size(); i++) {
                        System.out.println((i) + "." + hotelMap.get(i).getName() + " - "
                                + hotelMap.get(i).getRentPerNight() + " per night");
                    }
                    System.out.println("Which hotel would you like to choose (Please select a number): ");
                    boolean retry1 = false;
                    while (!retry1) {
                        try {
                            hotelChoice = sc.nextInt();
                            retry1 = true;
                        } catch (Exception e) {
                            System.out.println("Plz Enter Valid Number");
                            sc.nextLine();
                            // TODO: handle exception
                        }
                    }
                    try (BufferedReader reader = new BufferedReader(new FileReader("abc.txt"))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            String[] parts = line.trim().split(":");
                            if ("Date".equals(parts[0]) && date.equals(parts[1])) {
                                flag = true;
                            }
                            if (flag && "Venue".equals(parts[0])
                                    && hotelMap.get(hotelChoice).getName().equals(parts[1])) {
                                System.out.println("Sorry to inform but this slot is already booked");
                                System.out.println("Do you want to check other hotel? Write Y for yes, N for no");
                                String c = sc.next();
                                if ("Y".equalsIgnoreCase(c)) {
                                    f1 = true;
                                    break;
                                } else {
                                    System.exit(0);
                                }
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } while (f1);

                totalCost = hotelMap.get(hotelChoice).getRentPerNight() * days;
                if (totalCost > 0) {
                    again = true;
                }
                System.out
                        .println("Total cost for " + eventName + " event in " + hotelMap.get(hotelChoice).getName()
                                + " hotel for " + days + " days is: " + totalCost + " Rs");

                break;

            case "P":
                boolean f2 = false;
                do {
                    f2 = false;
                    boolean retry = false;
                    while (!retry) {
                        try {
                            System.out.println("How many plates for catering? ");
                            plates = sc.nextInt();
                            retry = true;
                        } catch (Exception e) {
                            System.out.println("Plz Enter Valid Number");
                            sc.nextLine();

                            // TODO: handle exception
                        }
                    }
                    System.out.println(
                            "Which party plot would you like to choose (Please select a number between Number): ");
                    for (i1 = 1; i1 <= partyPlotMap.size(); i1++) {
                        System.out.println(
                                (i1) + "." + partyPlotMap.get(i1).getName() + " - "
                                        + partyPlotMap.get(i1).getPerPlateCharge() + " per plate");
                    }
                    boolean retry1 = false;
                    while (!retry1) {
                        try {
                            partyPlotChoice = sc.nextInt();
                            retry1 = true;

                        } catch (Exception e) {
                            System.out.println("Plz Enter Valid Number");
                            sc.nextLine();
                            // TODO: handle exception
                        }
                    }
                    try (BufferedReader reader = new BufferedReader(new FileReader("abc.txt"))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            String[] parts = line.trim().split(":");
                            if ("Date".equals(parts[0]) && date.equals(parts[1])) {
                                flag = true;
                            }
                            if (flag && "Venue".equals(parts[0])
                                    && partyPlotMap.get(partyPlotChoice).getName().equals(parts[1])) {
                                System.out.println("Sorry to inform but this slot is already booked");
                                System.out.println("Do you want to check other hotel? Write Y for yes, N for no");
                                String c = sc.next();
                                if ("Y".equalsIgnoreCase(c)) {
                                    f2 = true;
                                } else {
                                    System.exit(0);
                                }
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } while (f2);

                totalCost = partyPlotMap.get(partyPlotChoice).getPerPlateCharge() * plates;
                if (totalCost > 0) {
                    again = true;
                }
                System.out.println(
                        "Total cost for " + eventName + " event in " + partyPlotMap.get(partyPlotChoice).getName()
                                + " for " + plates + " plates is: " + totalCost + " Rs");

                break;

            default:
                System.out.println("Invalid input");
                System.out.println("Type Y to try again other wise N to quit");
                String c = sc.next();
                if (c.equalsIgnoreCase("y")) {
                    Event_management event1 = new Event_management();
                    event1.addEvent();
                }

        }

        if (again) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("abc.txt", true))) {
                writer.write("-----------------------------------------");
                writer.newLine();
                writer.write("Event Name:" + eventName);
                writer.newLine();
                writer.write("Date:" + date);
                writer.newLine();
                if (hotelChoice != 0) {

                    writer.write("Venue:" + hotelMap.get(hotelChoice).getName());
                    writer.newLine();
                }
                if (partyPlotChoice != 0) {
                    writer.write("Venue:" + partyPlotMap.get(partyPlotChoice).getName());
                    writer.newLine();
                }
                writer.write("Total Cost: " + totalCost + " Rs");
                writer.newLine();
                writer.write("-----------------------------------------");
                writer.newLine();
                writer.flush();
                writer.close();
            } catch (IOException e) {
                System.out.println("An error occurred while saving event details: " + e.getMessage());
            }
        }
    }
}

class Main {
    public static void main(String[] args) {

        Event_management event = new Event_management();
        event.addEvent();
       
    }
}