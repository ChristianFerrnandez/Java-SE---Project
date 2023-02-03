package org.example;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Flow {
    private String comment;
    private int identifier;
    private double amount;
    private int accountNumber;
    private boolean effect;
    private LocalDate date;


    public Flow(String comment, int identifier, double amount, int accountNumber, boolean effect, LocalDate date) {
        this.comment = comment;
        this.identifier = identifier;
        this.amount = amount;
        this.accountNumber = accountNumber;
        this.effect = effect;
        this.date = date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean isEffect() {
        return effect;
    }

    public void setEffect(boolean effect) {
        this.effect = effect;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flow flow = (Flow) o;
        return identifier == flow.identifier &&
                Double.compare(flow.amount, amount) == 0 &&
                accountNumber == flow.accountNumber &&
                effect == flow.effect &&
                Objects.equals(comment, flow.comment) &&
                Objects.equals(date, flow.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comment, identifier, amount, accountNumber, effect, date);
    }
}
