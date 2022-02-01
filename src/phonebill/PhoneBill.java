package phonebill;



public class PhoneBill {
    /************************************************************/
    //Parameters Fields
    /************************************************************/

    private  int id;
    private double basePlan;
    private double allotedMinutes;
    private double minutesUsed;


    /************************************************************/
    //Constructors
    /************************************************************/
    public PhoneBill() {
        id = 0;
        basePlan = 0;
        allotedMinutes = 0;
        minutesUsed = 0;
    }

    public PhoneBill(int id) {
        setId(id);
        basePlan = 100;
        allotedMinutes = 200;
        minutesUsed = 0;
    }

    public PhoneBill(int id, double basePlan, double allotedMinutes, double minutesUsed) {
        setId(id);
        setBasePlan(basePlan);
        setAllotedMinutes(allotedMinutes);
        setMinutesUsed(minutesUsed);
    }

    /************************************************************/
    //Getters and setters for each parameter
    /************************************************************/
    public  double getBasePlan() {
        return basePlan;
    }

    public void setBasePlan(double basePlan) {
        this.basePlan = basePlan;
    }

    public double getAllotedMinutes() {
        return allotedMinutes;
    }

    public void setAllotedMinutes(double allotedMinutes) {
        this.allotedMinutes = allotedMinutes;

    }

    public double getMinutesUsed() {
        return minutesUsed;
    }

    public void setMinutesUsed(double minutesUsed) {
        this.minutesUsed = minutesUsed;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    /************************************************************/
    //Methods
    /************************************************************/
    public double calculateOverage(){
        return Math.abs(allotedMinutes - minutesUsed) * 0.25;
    }

    public double calculateTax(){
        return (calculateOverage() + basePlan) * 0.15;
    }

    public double calculateTotal(){
        return basePlan + calculateOverage() + calculateTax();
    }

    public void printItemizedBill() {
        System.out.println("Phone Bill Statement");
        System.out.println("ID: " + id);
        System.out.println("Base plan: $" + basePlan);
        System.out.println("Overage: $" + String.format("%.2f", calculateOverage()));
        System.out.println("Tax: $" + String.format("%.2f", calculateTax()));
        System.out.println("Total: $" + String.format("%.2f", calculateTotal()));

    }

}
