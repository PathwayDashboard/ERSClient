/*******************************************************************************
 * Copyright 2018 Engineering Ing. Inf. S.p.A.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class PreferredHPHPOContactSection   {
  
  private String familyName = null;
  private String telephoneNumber = null;
  private String mobileNumber = null;
  private String eMailAddress = null;
  private String streetname = null;
  private String houseNumber = null;
  private String city = null;
  private String postalCode = null;
  private String stateOrProvince = null;
  private String country = null;

  
  /**
   * Name of GP
   **/
  @ApiModelProperty(value = "Name of GP")
  @JsonProperty("familyName")
  public String getFamilyName() {
    return familyName;
  }
  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  
  /**
   * Telephone number
   **/
  @ApiModelProperty(value = "Telephone number")
  @JsonProperty("telephoneNumber")
  public String getTelephoneNumber() {
    return telephoneNumber;
  }
  public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }

  
  /**
   * Mobile telephone number
   **/
  @ApiModelProperty(value = "Mobile telephone number")
  @JsonProperty("mobileNumber")
  public String getMobileNumber() {
    return mobileNumber;
  }
  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  
  /**
   * e_Mail
   **/
  @ApiModelProperty(value = "e_Mail")
  @JsonProperty("eMailAddress")
  public String getEMailAddress() {
    return eMailAddress;
  }
  public void setEMailAddress(String eMailAddress) {
    this.eMailAddress = eMailAddress;
  }

  
  /**
   * Street
   **/
  @ApiModelProperty(value = "Street")
  @JsonProperty("streetname")
  public String getStreetname() {
    return streetname;
  }
  public void setStreetname(String streetname) {
    this.streetname = streetname;
  }

  
  /**
   * House number
   **/
  @ApiModelProperty(value = "House number")
  @JsonProperty("houseNumber")
  public String getHouseNumber() {
    return houseNumber;
  }
  public void setHouseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
  }

  
  /**
   * City
   **/
  @ApiModelProperty(value = "City")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  
  /**
   * Postal code
   **/
  @ApiModelProperty(value = "Postal code")
  @JsonProperty("postalCode")
  public String getPostalCode() {
    return postalCode;
  }
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  
  /**
   * State or Provence
   **/
  @ApiModelProperty(value = "State or Provence")
  @JsonProperty("stateOrProvince")
  public String getStateOrProvince() {
    return stateOrProvince;
  }
  public void setStateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
  }

  
  /**
   * Country
   **/
  @ApiModelProperty(value = "Country")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreferredHPHPOContactSection {\n");
    
    sb.append("    familyName: ").append(StringUtil.toIndentedString(familyName)).append("\n");
    sb.append("    telephoneNumber: ").append(StringUtil.toIndentedString(telephoneNumber)).append("\n");
    sb.append("    mobileNumber: ").append(StringUtil.toIndentedString(mobileNumber)).append("\n");
    sb.append("    eMailAddress: ").append(StringUtil.toIndentedString(eMailAddress)).append("\n");
    sb.append("    streetname: ").append(StringUtil.toIndentedString(streetname)).append("\n");
    sb.append("    houseNumber: ").append(StringUtil.toIndentedString(houseNumber)).append("\n");
    sb.append("    city: ").append(StringUtil.toIndentedString(city)).append("\n");
    sb.append("    postalCode: ").append(StringUtil.toIndentedString(postalCode)).append("\n");
    sb.append("    stateOrProvince: ").append(StringUtil.toIndentedString(stateOrProvince)).append("\n");
    sb.append("    country: ").append(StringUtil.toIndentedString(country)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
