public class Chancekort {

    String cardText;
    int payExpense;
    int receiveExpense;

    public String getCardText() {
        return cardText;
    }

    public int getPayExpense() {
        return payExpense;
    }

    public int getReceiveExpense() {
        return receiveExpense;
    }

    public Chancekort(String cardText, int payExpense, int receiveExpense) {
        this.cardText = cardText;
        this.payExpense = payExpense;
        this.receiveExpense = receiveExpense;


    }
}
