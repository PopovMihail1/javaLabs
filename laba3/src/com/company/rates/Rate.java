package com.company.rates;

public class Rate implements java.io.Serializable, Comparable<Rate> {
    int subscriptionFee;
    int smsPrice;
    int megaBaitsCount;
    int megaBaitPrice;
    int peoplesCount;
    public Rate(){};

    public int getMegaBaitPrice() {
        return megaBaitPrice;
    }

    public int getMegaBaitsCount() {
        return megaBaitsCount;
    }

    public int getSmsPrice() {
        return smsPrice;
    }

    public int getSubscriptionFee() {
        return subscriptionFee;
    }

    public int getPeoplesCount() {
        return peoplesCount;
    }

    public void addPeople(){
        peoplesCount+=1;
    }
    public void deletePeople(){
        peoplesCount-=1;
    }

    @Override
    public String toString() {
        return "Rate{" + "\n" +
                "subscriptionFee='" + subscriptionFee + '\'' +
                ", smsPrice='" + smsPrice + '\'' +
                ", megaBaitsCount='" + megaBaitsCount + '\'' +
                ", megaBaitPrice='" + megaBaitPrice + '\'' +
                ", peoplesCount='" + peoplesCount + '\'' +
                "\n" + '}';
    }

    @Override
    public int compareTo(Rate o) {
        if(this.subscriptionFee == o.subscriptionFee){
            return 0;
        }else if(this.subscriptionFee > o.subscriptionFee){
            return -1;
        }
        else{
            return +1;
        }

    }
}
