
  package com.pns.bank.model;
  
  import javax.persistence.Entity; import javax.persistence.Id;
  
  
  @Entity public class Branch {
  
  @Id private int branch_code; private int branch_ifscCode; private String
  branch_name; private int branch_pincode;
  
  
  
  public int getBranch_ifscCode() { return branch_ifscCode; }
  
  public void setBranch_ifscCode(int branch_ifscCode) { this.branch_ifscCode =
  branch_ifscCode; }
  
  public String getBranch_name() { return branch_name; }
  
  public void setBranch_name(String branch_name) { this.branch_name =
  branch_name; }
  
  public int getBranch_pincode() { return branch_pincode; }
  
  public void setBranch_pincode(int branch_pincode) { this.branch_pincode =
  branch_pincode; }
  
  
  
  
  }
 