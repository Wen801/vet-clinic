package serenitylabs.tutorials.vetclinic.domain;

import java.util.ArrayList;
import java.util.List;

public class ComplaintRegister {

    private final List<String> complaints = new ArrayList<>();
    private String complain;

//    public ComplaintRegister(List<String> complaints) {
//        this.complaints = complaints;
//    }

    public List<String> getComplaints() {
        return new ArrayList<>(complaints);
    }

    public void recordComplaint(String complain){
        complaints.add(complain);
    }
}
