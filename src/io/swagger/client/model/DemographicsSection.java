package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class DemographicsSection   {
  
  private String sin = null;
  private Integer gender = null;
  private Integer nationality = null;
  private String street = null;
  private String houseNumber = null;
  private String city = null;
  private String postalCode = null;
  private String stateOrProvince = null;
  private String country = null;
  private String telephoneNumber = null;
  private String mobileNumber = null;
  private String eMailAddress = null;
  private String firstName = null;
  private String lastName = null;
  private String supervisorUserName = null;
  private String supervisorPassword = null;
  private Integer center = null;

  
  /**
   * sin
   **/
  @ApiModelProperty(value = "sin")
  @JsonProperty("sin")
  public String getSin() {
    return sin;
  }
  public void setSin(String sin) {
    this.sin = sin;
  }

  
  /**
   * gender
   **/
  @ApiModelProperty(value = "gender")
  @JsonProperty("gender")
  public Integer getGender() {
    return gender;
  }
  public void setGender(Integer gender) {
    this.gender = gender;
  }

  
  /**
   * nationality
   **/
  @ApiModelProperty(value = "nationality")
  @JsonProperty("nationality")
  public Integer getNationality() {
    return nationality;
  }
  public void setNationality(Integer nationality) {
    this.nationality = nationality;
  }

  
  /**
   * street
   **/
  @ApiModelProperty(value = "street")
  @JsonProperty("street")
  public String getStreet() {
    return street;
  }
  public void setStreet(String street) {
    this.street = street;
  }

  
  /**
   * houseNumber
   **/
  @ApiModelProperty(value = "houseNumber")
  @JsonProperty("houseNumber")
  public String getHouseNumber() {
    return houseNumber;
  }
  public void setHouseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
  }

  
  /**
   * city
   **/
  @ApiModelProperty(value = "city")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  
  /**
   * postalCode
   **/
  @ApiModelProperty(value = "postalCode")
  @JsonProperty("postalCode")
  public String getPostalCode() {
    return postalCode;
  }
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  
  /**
   * stateOrProvince
   **/
  @ApiModelProperty(value = "stateOrProvince")
  @JsonProperty("stateOrProvince")
  public String getStateOrProvince() {
    return stateOrProvince;
  }
  public void setStateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
  }

  
  /**
   * country
   **/
  @ApiModelProperty(value = "country")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  
  /**
   * telephoneNumber
   **/
  @ApiModelProperty(value = "telephoneNumber")
  @JsonProperty("telephoneNumber")
  public String getTelephoneNumber() {
    return telephoneNumber;
  }
  public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }

  
  /**
   * mobileNumber
   **/
  @ApiModelProperty(value = "mobileNumber")
  @JsonProperty("mobileNumber")
  public String getMobileNumber() {
    return mobileNumber;
  }
  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  
  /**
   * eMailAddress
   **/
  @ApiModelProperty(value = "eMailAddress")
  @JsonProperty("eMailAddress")
  public String getEMailAddress() {
    return eMailAddress;
  }
  public void setEMailAddress(String eMailAddress) {
    this.eMailAddress = eMailAddress;
  }

  
  /**
   * firstName
   **/
  @ApiModelProperty(value = "firstName")
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  /**
   * lastName
   **/
  @ApiModelProperty(value = "lastName")
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  /**
   * Username
   **/
  @ApiModelProperty(value = "Username")
  @JsonProperty("supervisorUserName")
  public String getSupervisorUserName() {
    return supervisorUserName;
  }
  public void setSupervisorUserName(String supervisorUserName) {
    this.supervisorUserName = supervisorUserName;
  }

  
  /**
   * Password
   **/
  @ApiModelProperty(value = "Password")
  @JsonProperty("supervisorPassword")
  public String getSupervisorPassword() {
    return supervisorPassword;
  }
  public void setSupervisorPassword(String supervisorPassword) {
    this.supervisorPassword = supervisorPassword;
  }

  
  /**
   * Center
   **/
  @ApiModelProperty(value = "Center")
  @JsonProperty("center")
  public Integer getCenter() {
    return center;
  }
  public void setCenter(Integer center) {
    this.center = center;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DemographicsSection {\n");
    
    sb.append("    sin: ").append(StringUtil.toIndentedString(sin)).append("\n");
    sb.append("    gender: ").append(StringUtil.toIndentedString(gender)).append("\n");
    sb.append("    nationality: ").append(StringUtil.toIndentedString(nationality)).append("\n");
    sb.append("    street: ").append(StringUtil.toIndentedString(street)).append("\n");
    sb.append("    houseNumber: ").append(StringUtil.toIndentedString(houseNumber)).append("\n");
    sb.append("    city: ").append(StringUtil.toIndentedString(city)).append("\n");
    sb.append("    postalCode: ").append(StringUtil.toIndentedString(postalCode)).append("\n");
    sb.append("    stateOrProvince: ").append(StringUtil.toIndentedString(stateOrProvince)).append("\n");
    sb.append("    country: ").append(StringUtil.toIndentedString(country)).append("\n");
    sb.append("    telephoneNumber: ").append(StringUtil.toIndentedString(telephoneNumber)).append("\n");
    sb.append("    mobileNumber: ").append(StringUtil.toIndentedString(mobileNumber)).append("\n");
    sb.append("    eMailAddress: ").append(StringUtil.toIndentedString(eMailAddress)).append("\n");
    sb.append("    firstName: ").append(StringUtil.toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(StringUtil.toIndentedString(lastName)).append("\n");
    sb.append("    supervisorUserName: ").append(StringUtil.toIndentedString(supervisorUserName)).append("\n");
    sb.append("    supervisorPassword: ").append(StringUtil.toIndentedString(supervisorPassword)).append("\n");
    sb.append("    center: ").append(StringUtil.toIndentedString(center)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
