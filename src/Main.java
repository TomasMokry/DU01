import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String fullName = "Tomas Mokry"; //Seller's name
        LocalDate birthdate = LocalDate.of(1984, 3, 4); //Seller's birthday
        int allContractNumber = 5; //Number of contracts
        double carrotWeight = 24.64; //Total weight of sold carrot
        String sellerAddress = "Oburky 8, Brno, 62100"; //Seller's address
        String SPZ = "1BA2300"; //Car SPZ
        double carKmPerLiter = 5.6; //Car consumption
        String IPAddress = "192.168.48.39"; //IP Address

        double avgCarrotWeightPerContract = carrotWeight / allContractNumber;
        double avgWeightRounded = Math.round(avgCarrotWeightPerContract * 100.0)/100.0;

        System.out.println("Seller's name: "+fullName);
        System.out.println("Seller's birthday: "+birthdate);
        System.out.println("Number of contracts: "+allContractNumber);
        System.out.println("Total weight of sold carrot: "+carrotWeight+" Tons.");
        System.out.println("Seller's address: "+sellerAddress);
        System.out.println("Car SPZ: "+SPZ);
        System.out.println("Car consumption is: "+carKmPerLiter+" l/100 Km");
        System.out.println("IP Address: "+IPAddress);
        System.out.println("Average weight of sold carrot is: "+avgWeightRounded+ " Tons.");
    }
}
