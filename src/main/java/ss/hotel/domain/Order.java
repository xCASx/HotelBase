
package ss.hotel.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;


@Entity
@Table(name = "Order")
public class Order implements Serializable{
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //������
    @ManyToOne
    @JoinColumn(name = "ID")
    private Person person;

    @OneToMany(mappedBy="order")
    private Set<AddServiceHistory> addServiceHistory = new HashSet<AddServiceHistory>();

    @OneToOne(optional=false, cascade=CascadeType.ALL)
    private RoomType roomType;


    //��� ����� ��������� ������ ���������� ����� ��� ���������
    //����� ������������� �� ������ roomState � Room
    @Column(nullable = true, name = "Number")
    private int number;

    //���� �������� ���������
    @Column(name = "DateIn")
    @Temporal( value = TemporalType.TIMESTAMP )
    private Date DateIn;

    //���� �������� ���������
    @Column(name = "DateOut")
    @Temporal( value = TemporalType.TIMESTAMP )
    private Date DateOut;

    //����� - �� ������� ��� ��� �����
//    @Column(name = "Booking")
//    private double booking;

     //������ ������ - �����+����� �� AddServiceHistory
    //� AddServiceHistory ����� ����� � ���-�� ���� � �� ����
    //���� � �����
    @Column(name = "Balans")
    private double balans;

    public Date getDateIn() {
        return DateIn;
    }

    public void setDateIn(Date DateIn) {
        this.DateIn = DateIn;
    }

    public Date getDateOut() {
        return DateOut;
    }

    public void setDateOut(Date DateOut) {
        this.DateOut = DateOut;
    }

    public Set<AddServiceHistory> getAddServiceHistory() {
        return addServiceHistory;
    }

    public void setAddServiceHistory(Set<AddServiceHistory> addServiceHistory) {
        this.addServiceHistory = addServiceHistory;
    }

    public double getBalans() {
        return balans;
    }

    public void setBalans(double balans) {
        this.balans = balans;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    
}
