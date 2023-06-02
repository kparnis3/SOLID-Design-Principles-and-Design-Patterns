package com.company.openclose;

import java.util.List;

public class ISPSubscriber extends Subscriber {

    /* Removed common in every class
    private Long subscriberId; //unique

    private String address;

    private Long phoneNumber;

    private int baseRate;
    */

    private long freeUsage; //additional property, such as number of bytes

    public ISPSubscriber() {

    }

    //used for demonstartion to calculate subscriber bill
    //Open for extension
    @Override
    public double calculateBill() {
        List<InternetSessionHistory.InternetSession> sessions = InternetSessionHistory.getCurrentSessions(subscriberId);
        long totalData = sessions.stream().mapToLong(InternetSessionHistory.InternetSession::getDataUsed).sum();
        long chargeableData = totalData - freeUsage;
        return chargeableData*baseRate/100;
    }

    /* Removed common gettors and settors. 
    public Long getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(Long subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(int baseRate) {
        this.baseRate = baseRate;
    }

    public long getFreeUsage() {
        return freeUsage;
    }
    */
    public void setFreeUsage(long freeUsage) {
        this.freeUsage = freeUsage;
    }

    
}