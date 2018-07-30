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
public class Patient4Calendar   {
  
  private String patientID = null;
  private String firstName = null;
  private String lastName = null;
  private Integer age = null;
  private Integer gender = null;
  private String mailAddress = null;

  
  /**
   * Patient given name
   **/
  @ApiModelProperty(value = "Patient given name")
  @JsonProperty("PatientID")
  public String getPatientID() {
    return patientID;
  }
  public void setPatientID(String patientID) {
    this.patientID = patientID;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("FirstName")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("LastName")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("Age")
  public Integer getAge() {
    return age;
  }
  public void setAge(Integer age) {
    this.age = age;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("Gender")
  public Integer getGender() {
    return gender;
  }
  public void setGender(Integer gender) {
    this.gender = gender;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("MailAddress")
  public String getMailAddress() {
    return mailAddress;
  }
  public void setMailAddress(String mailAddress) {
    this.mailAddress = mailAddress;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Patient4Calendar {\n");
    
    sb.append("    patientID: ").append(StringUtil.toIndentedString(patientID)).append("\n");
    sb.append("    firstName: ").append(StringUtil.toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(StringUtil.toIndentedString(lastName)).append("\n");
    sb.append("    age: ").append(StringUtil.toIndentedString(age)).append("\n");
    sb.append("    gender: ").append(StringUtil.toIndentedString(gender)).append("\n");
    sb.append("    mailAddress: ").append(StringUtil.toIndentedString(mailAddress)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
