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
public class ContactpersonSection   {
  
  private Integer personRole = null;
  private String givenName = null;
  private String familyName = null;
  private String telephoneNumber = null;
  private String mailAddress = null;
  private Integer status = null;

  
  /**
   * Role of that person
   **/
  @ApiModelProperty(value = "Role of that person")
  @JsonProperty("personRole")
  public Integer getPersonRole() {
    return personRole;
  }
  public void setPersonRole(Integer personRole) {
    this.personRole = personRole;
  }

  
  /**
   * Given name
   **/
  @ApiModelProperty(value = "Given name")
  @JsonProperty("givenName")
  public String getGivenName() {
    return givenName;
  }
  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  
  /**
   * Family name / Surname
   **/
  @ApiModelProperty(value = "Family name / Surname")
  @JsonProperty("familyName")
  public String getFamilyName() {
    return familyName;
  }
  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  
  /**
   * Telephone no.
   **/
  @ApiModelProperty(value = "Telephone no.")
  @JsonProperty("telephoneNumber")
  public String getTelephoneNumber() {
    return telephoneNumber;
  }
  public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }

  
  /**
   * e_Mail
   **/
  @ApiModelProperty(value = "e_Mail")
  @JsonProperty("mailAddress")
  public String getMailAddress() {
    return mailAddress;
  }
  public void setMailAddress(String mailAddress) {
    this.mailAddress = mailAddress;
  }

  
  /**
   * Nature of the contact
   **/
  @ApiModelProperty(value = "Nature of the contact")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactpersonSection {\n");
    
    sb.append("    personRole: ").append(StringUtil.toIndentedString(personRole)).append("\n");
    sb.append("    givenName: ").append(StringUtil.toIndentedString(givenName)).append("\n");
    sb.append("    familyName: ").append(StringUtil.toIndentedString(familyName)).append("\n");
    sb.append("    telephoneNumber: ").append(StringUtil.toIndentedString(telephoneNumber)).append("\n");
    sb.append("    mailAddress: ").append(StringUtil.toIndentedString(mailAddress)).append("\n");
    sb.append("    status: ").append(StringUtil.toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
