package org.cap.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "User_Profiles")
public class User_Profiles implements Serializable {

    @Id
    @GeneratedValue
    private Integer user_profile_id;
    
    private int aadhar_no;
    private String f_name;
    private String l_name;
    private String m_name;
    private String fathers_name;
    private int mobile_no;
    private String email_id;
    private String dob;
    private String res_addr;
    private String per_addr;
    private String occ_details;
   
    //getter and setter methods
    
    public Integer getUser_profile_id() {
		return user_profile_id;
	}

	public void setUser_profile_id(Integer user_profile_id) {
		this.user_profile_id = user_profile_id;
	}

	public int getAadhar_no() {
		return aadhar_no;
	}

	public void setAadhar_no(int aadhar_no) {
		this.aadhar_no = aadhar_no;
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getFathers_name() {
		return fathers_name;
	}

	public void setFathers_name(String fathers_name) {
		this.fathers_name = fathers_name;
	}

	public int getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(int mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getRes_addr() {
		return res_addr;
	}

	public void setRes_addr(String res_addr) {
		this.res_addr = res_addr;
	}

	public String getPer_addr() {
		return per_addr;
	}

	public void setPer_addr(String per_addr) {
		this.per_addr = per_addr;
	}

	public String getOcc_details() {
		return occ_details;
	}

	public void setOcc_details(String occ_details) {
		this.occ_details = occ_details;
	}

	public User_Profiles(){

    }

    @Override
    public boolean equals(Object obj) {
      if(obj==this){
          return true;
      }
      if(obj==null || !(obj instanceof User_Profiles)){
          return false;
      }
      User_Profiles up=(User_Profiles)obj;
      return up.user_profile_id.equals(this.user_profile_id);
    }


    @Override
    public int hashCode() {
        if(user_profile_id==null){
            return 0;
        }
        return user_profile_id.hashCode();
    }
}

   