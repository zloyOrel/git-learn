package App;

import java.time.LocalDate;

public class BankTransaction {
    private LocalDate date;
    private Double amount;
    private String description;

    public BankTransaction(LocalDate date, Double amount, String description) {
        this.date = date;
        this.amount = amount;
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public Double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

}
