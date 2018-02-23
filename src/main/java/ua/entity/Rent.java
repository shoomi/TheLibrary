package ua.entity;

import ua.entity.AbstractEntityId;
import ua.entity.Client;
import ua.entity.CopyOfBook;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "rent")
public class Rent extends AbstractEntityId {

    @OneToOne
    private CopyOfBook copyOfBook;

    @ManyToOne(fetch = FetchType.LAZY)
    private Client user;

    @Column(name = "borrowing_time")
    private LocalDateTime borrowingTime;

    @Column(name = "return_time", length = 20)
    private LocalDateTime returnTime;

    public LocalDateTime getBorrowingTime() {
        return borrowingTime;
    }

    public void setBorrowingTime(LocalDateTime borrowingTime) {
        this.borrowingTime = borrowingTime;
    }

    public LocalDateTime getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(LocalDateTime returnTime) {
        this.returnTime = returnTime;
    }

    public Client getUser() {
        return user;
    }

    public void setUser(Client user) {
        this.user = user;
    }

    public CopyOfBook getCopyOfBook() {
        return copyOfBook;
    }

    public void setCopyOfBook(CopyOfBook copyOfBook) {
        this.copyOfBook = copyOfBook;
    }


}
