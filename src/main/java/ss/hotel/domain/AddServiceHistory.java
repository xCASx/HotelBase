
package ss.hotel.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


@Entity
@Table(name = "AddServiceHistory")
public class AddServiceHistory implements Serializable{
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(optional=false, cascade=CascadeType.ALL)
    private AddService addService;

    //���������� ������ ��� ������
    @Column(nullable=false)
    private double amount;

    //���� �� ������� ��� ������� �� ���� ��������
    //���� �������� ��� ������!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    //������� �� AddService ������ �.�. ��� ������� ����
    @Column(name = "DatePrice")
    private double datePrice;

    //���� �������� ������
    @Column(name = "OpperationDate")
    @Temporal( value = TemporalType.TIMESTAMP )
    private Date opperationDate;

    //������ ������ ��� ���
    @Column(name = "ClientPaid")
    private Boolean ClientPaid;

    //��� ������/��������������� ��� ������
    @ManyToOne
    @JoinColumn(name = "ID")
    private Person person;

    public AddService getAddService() {
        return addService;
    }

    public void setAddService(AddService addService) {
        this.addService = addService;
    }

    public Boolean getClientPaid() {
        return ClientPaid;
    }

    public void setClientPaid(Boolean ClientPaid) {
        this.ClientPaid = ClientPaid;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getDatePrice() {
        return datePrice;
    }

    public void setDatePrice(double datePrice) {
        this.datePrice = datePrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getOpperationDate() {
        return opperationDate;
    }

    public void setOpperationDate(Date opperationDate) {
        this.opperationDate = opperationDate;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }






}
