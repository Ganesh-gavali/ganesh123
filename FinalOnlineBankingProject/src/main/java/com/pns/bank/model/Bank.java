
  package com.pns.bank.model;
  
  import java.util.List;
  
  import javax.persistence.CascadeType; import javax.persistence.Entity; import
  javax.persistence.Id; import javax.persistence.OneToMany;
  
  
  @Entity public class Bank {
  
  @Id private int bank_code; private String bank_name; private String
  bank_city; private String bank_address;
  
  @OneToMany(cascade = CascadeType.ALL) private List<Branch> branch;
  
  public int getBank_code() { return bank_code; }
  
  public void setBank_code(int bank_code) { this.bank_code = bank_code; }
  
  public String getBank_name() { return bank_name; }
  
  public void setBank_name(String bank_name) { this.bank_name = bank_name; }
  
  public String getBank_city() { return bank_city; }
  
  public void setBank_city(String bank_city) { this.bank_city = bank_city; }
  
  public String getBank_address() { return bank_address; }
  
  public void setBank_address(String bank_address) { this.bank_address =
  bank_address; }
  
  }
 