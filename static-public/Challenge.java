public class Challenge{
    static double convertPoundsToOunces(double pounds) {
        return (pounds * 16);
    }

    static double convertInchesToFeet(double inches){
        return (inches * 12);
    }

    public double convertOuncesToPounds(double ounces){
        return (ounces / 16);
    }

    public double convertFeetToInches(double feet){
        return (feet / 12);
    }

    public static void main(String[] args){
    
        double poundsInOunces = convertPoundsToOunces(10);
        System.out.println("10 pounds in ounces: " + poundsInOunces);

        double inchesToFeet = convertInchesToFeet(120);
        System.out.println("120 inches to feet: "+ inchesToFeet);


        Converter myConverter = new Converter();

        double ouncesInPounds = myConverter.convertOuncesToPounds(32);
        System.out.println("32 ounces in pounds: " + oncesInPounds);

        double feetToInches = myConverter.convertFeetToInches(15);
        System.out.println("15 feet in inches: " + feetToInches);
    }
}

