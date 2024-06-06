/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author USER
 */
public class Member {
    private final String memberID;
    private String memberName;
    private String memberTel;


    public Member(String memberID, String memberName, String memberTel) {
        this.memberID = memberID;
        this.memberName = memberName;
        this.memberTel = memberTel;
    }

    public String getMemberID() {
        return memberID;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getMemberTel() {
        return memberTel;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setMemberTel(String memberTel) {
        this.memberTel = memberTel;
    }






//    public Vehicle findLoan(String loanID);
//    public Vehicle deleteLoan();
//    public Vehicle updateLoan(String loanID);
//    public Collection<Vehicle> getAllVehicle();

    @Override
    public String toString() {
        return "Member{" + "memberID=" + memberID + ", memberName=" + memberName + ", memberTel=" + memberTel + '}';
    }
    
    
}
