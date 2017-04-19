package bank;

import java.math.BigDecimal;

/**
 * Created by Ania on 19.04.2017.
 */
public class Account {
    private Long accountId;
    private Customer customer;
    private BigDecimal balance;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;

    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", customer=" + customer +
                ", balance=" + balance +
                '}';
    }

    public Account(Long accountId, Customer customer) {
        this.accountId = accountId;
        this.customer = customer;
    }
}
