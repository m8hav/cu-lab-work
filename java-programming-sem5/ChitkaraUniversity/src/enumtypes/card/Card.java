package enumtypes.card;

public enum Card {
//    CARD_TYPE (annualFee, cardLimit, annualSalary)
    DEBIT_CARD (100, 00.00, 50_000.00),
    CREDIT_CARD (100_000, 1000, 200_000.0),
    SHOPPING (150_000, 1500, 300_000),
    BUSINESS (250_000, 2500, 500_000),
    INTERNATIONAL (500_000, 5000, 1_000_000);

    private final int annualFee;
    private final double cardLimit;
    private final double annualSalary;


//    No public constructor allowed in enum type
//    Enum constructor private by default
    Card(int annualFee, double cardLimit, double annualSalary) {
        this.annualFee = annualFee;
        this.cardLimit = cardLimit;
        this.annualSalary = annualSalary;
    }

//    If enums are final by default and cannot be inherited (property of final)
//    then why did Kaushal Sir make its methods protected and constructor private??
//    it's completely redundant

//    protected int getAnnualFee() {
    int getAnnualFee() {
        return annualFee;
    }

//    protected double getCardLimit() {
    double getCardLimit() {
        return cardLimit;
    }

//    protected double getAnnualSalary() {
    double getAnnualSalary() {
        return annualSalary;
    }

}
