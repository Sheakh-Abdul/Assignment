class CreditScoreCalculator {
    private int creditHistory;
    private double creditUtilization;
    private boolean paymentHistory;

    
    public CreditScoreCalculator(int creditHistory, double creditUtilization, boolean paymentHistory) {
        this.creditHistory = creditHistory;
        this.creditUtilization = creditUtilization;
        this.paymentHistory = paymentHistory;
    }

    
    public int getCreditHistory() {
        return creditHistory;
    }

    public void setCreditHistory(int creditHistory) {
        this.creditHistory = creditHistory;
    }

    public double getCreditUtilization() {
        return creditUtilization;
    }

    public void setCreditUtilization(double creditUtilization) {
        this.creditUtilization = creditUtilization;
    }

    public boolean hasGoodPaymentHistory() {
        return paymentHistory;
    }

    public void setPaymentHistory(boolean paymentHistory) {
        this.paymentHistory = paymentHistory;
    }

    
    public int calculateCreditScore() {
        int creditScore;
        if (paymentHistory) {
            creditScore = (creditHistory * 15) + (int)(creditUtilization * 30) + 55;
        } else {
            creditScore = (creditHistory * 15) + (int)(creditUtilization * 30) + 35;
        }
        return creditScore;
    }

    
    public static void main(String[] args) {
        CreditScoreCalculator calculator = new CreditScoreCalculator(5, 0.3, true);
        System.out.println("Credit Score: " + calculator.calculateCreditScore());
    }
}
