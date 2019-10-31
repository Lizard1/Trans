package hibernate.model;

import javax.persistence.*;
import java.util.Objects;

/**
 * Класс-модель представляющий самого пользователя
 *
 * @version 2.0
 * @autor Сергей Зверев
 */

@Entity
@Table(name = "account")
public class Account {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "accountNumber")
    private int accountNumber;
    @Column(name = "userId")
    private int userId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Account() {
    }

    public Account(int id, int accountNumber, int userId) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.userId = userId;
    }

    /**Переопределение метода equals().*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id &&
                accountNumber == account.accountNumber &&
                userId == account.userId;
    }

    /**Переопределение метода hashCode().*/
    @Override
    public int hashCode() {
        return Objects.hash(id, accountNumber, userId);
    }
}
