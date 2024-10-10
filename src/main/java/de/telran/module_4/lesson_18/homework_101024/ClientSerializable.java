package de.telran.module_4.lesson_18.homework_101024;

import java.io.Serializable;
import java.util.Objects;

public class ClientSerializable implements Serializable {
    private Long id;
    private String status;
    private Long taxCode;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phone;

    public ClientSerializable() {
    }

//    public Client(Long id, String status, Long taxCode, String firstName, String lastName, String email, String address, String phone) {
//        this.id = id;
//        this.status = status;
//        this.taxCode = taxCode;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;
//        this.address = address;
//        this.phone = phone;
//    }


    public Long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public Long getTaxCode() {
        return taxCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTaxCode(Long taxCode) {
        this.taxCode = taxCode;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Клиент{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", taxCode=" + taxCode +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientSerializable client = (ClientSerializable) o;
        return Objects.equals(id, client.id) && Objects.equals(status, client.status) && Objects.equals(taxCode, client.taxCode) && Objects.equals(firstName, client.firstName) && Objects.equals(lastName, client.lastName) && Objects.equals(email, client.email) && Objects.equals(address, client.address) && Objects.equals(phone, client.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, taxCode, firstName, lastName, email, address, phone);
    }
}
