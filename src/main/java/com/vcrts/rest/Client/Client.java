  package com.vcrts.rest.Client;

  public class Client {

    private long ID;
    private String name;

    private String email;
    private int jobID;

    public Client(){}

    public Client(long ID, String name, String email, int jobID) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.jobID = jobID;
    }


    public Client(String name,  String email, int jobID) {

    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getJobID() {
        return jobID;
    }

    public void setJobID(int jobID) {
        this.jobID = jobID;
    }

    @Override
    public String toString() {
        return "Client{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", jobID=" + jobID +
                '}';
    }
}
