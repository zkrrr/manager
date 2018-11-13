package com.community.manager.domain;

/*
 * Created by zk on 18-8-26.
 */


import java.math.BigDecimal;
import java.util.Objects;

public class Resident {
    private String id;
    private String name;
    private String sex;
    private int age;
    private String telephoneNumber;
    private String bankCardNumber;
    private BigDecimal balance;
    private String password;
    private String communityName;
    private String buildingNumber;
    private String unitName;
    private String floorNumber;
    private String roomNumber;
    private String hobby;
    private String selfIntroduction;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getBankCardNumber() {
        return bankCardNumber;
    }

    public void setBankCardNumber(String bankCardNumber) {
        this.bankCardNumber = bankCardNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getSelfIntroduction() {
        return selfIntroduction;
    }

    public void setSelfIntroduction(String selfIntroduction) {
        this.selfIntroduction = selfIntroduction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resident resident = (Resident) o;
        return age == resident.age &&
                Objects.equals(id, resident.id) &&
                Objects.equals(name, resident.name) &&
                Objects.equals(sex, resident.sex) &&
                Objects.equals(telephoneNumber, resident.telephoneNumber) &&
                Objects.equals(bankCardNumber, resident.bankCardNumber) &&
                Objects.equals(balance, resident.balance) &&
                Objects.equals(password, resident.password) &&
                Objects.equals(communityName, resident.communityName) &&
                Objects.equals(buildingNumber, resident.buildingNumber) &&
                Objects.equals(unitName, resident.unitName) &&
                Objects.equals(floorNumber, resident.floorNumber) &&
                Objects.equals(roomNumber, resident.roomNumber) &&
                Objects.equals(hobby, resident.hobby) &&
                Objects.equals(selfIntroduction, resident.selfIntroduction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, sex, age, telephoneNumber, bankCardNumber, balance, password, communityName, buildingNumber, unitName, floorNumber, roomNumber, hobby, selfIntroduction);
    }

    @Override
    public String toString() {
        return "Resident{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", bankCardNumber='" + bankCardNumber + '\'' +
                ", balance=" + balance +
                ", password='" + password + '\'' +
                ", communityName='" + communityName + '\'' +
                ", buildingNumber='" + buildingNumber + '\'' +
                ", unitName='" + unitName + '\'' +
                ", floorNumber='" + floorNumber + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", hobby='" + hobby + '\'' +
                ", selfIntroduction='" + selfIntroduction + '\'' +
                '}';
    }
}
