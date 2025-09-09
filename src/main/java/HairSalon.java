import java.util.Arrays;

public class HairSalon {
  
   enum Day{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
  
    private int haircutPrice  = 30;


    private Calculator calculator = new Calculator();

    
    // This method should return the openingDays array.

    public Day[] getOpeningDays() {
        return openingDays;
    }

    // This method should return true if the weekday passed in is present in the openingDays array.
    // If not it should return false.
    public boolean isOpen(Day weekDay) {
        if(Arrays.asList(openingDays).contains(weekDay)) {
            return true;
        } else {
            return false;
        }
    }

    public int getHaircutPrice() {
        return haircutPrice;
    }

    public int applyDiscount() {
        return calculator.divide(haircutPrice, 2) + 5;
    }
    
   
    
    private Day[] openingDays = { Day.MONDAY, Day.TUESDAY };
    
    public Day[] getOpeningDays() {
        return openingDays;
    }

    // This method should return true if the weekday passed in is present in the
    // openingDays array.
    // If not it should return false. If the String passed in does not end in the
    // letters "day",
    // it should throw an IllegalArgumentException with a message explaining that
    // only weekdays are valid.
    public boolean isOpen(Day day) {
        if(Arrays.asList(openingDays).contains(day)){
            return true;
        }else{
            return false;
        }
    }

    public int getHaircutPrice(){
        return haircutPrice;
    }

    public int applyDiscount() {
        int halfPrice = calculator.divide(getHaircutPrice(), 2);
        return halfPrice + 5;
    }


}
