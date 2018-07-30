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
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class BirthDeathSection   {
  
  private Date dateOfBirth = null;
  private Integer age = null;
  private String birthPlace = null;
  private Date dateOfDeath = null;
  private String reasonOfDeath = null;

  
  /**
   * Date of birth
   **/
  @ApiModelProperty(value = "Date of birth")
  @JsonProperty("dateOfBirth")
  public Date getDateOfBirth() {
    return dateOfBirth;
  }
  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  
  /**
   * Age
   **/
  @ApiModelProperty(value = "Age")
  @JsonProperty("age")
  public Integer getAge() {
    return age;
  }
  public void setAge(Integer age) {
    this.age = age;
  }

  
  /**
   * Place of birth
   **/
  @ApiModelProperty(value = "Place of birth")
  @JsonProperty("birthPlace")
  public String getBirthPlace() {
    return birthPlace;
  }
  public void setBirthPlace(String birthPlace) {
    this.birthPlace = birthPlace;
  }

  
  /**
   * Date of death
   **/
  @ApiModelProperty(value = "Date of death")
  @JsonProperty("dateOfDeath")
  public Date getDateOfDeath() {
    return dateOfDeath;
  }
  public void setDateOfDeath(Date dateOfDeath) {
    this.dateOfDeath = dateOfDeath;
  }

  
  /**
   * Death reason
   **/
  @ApiModelProperty(value = "Death reason")
  @JsonProperty("reasonOfDeath")
  public String getReasonOfDeath() {
    return reasonOfDeath;
  }
  public void setReasonOfDeath(String reasonOfDeath) {
    this.reasonOfDeath = reasonOfDeath;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BirthDeathSection {\n");
    
    sb.append("    dateOfBirth: ").append(StringUtil.toIndentedString(dateOfBirth)).append("\n");
    sb.append("    age: ").append(StringUtil.toIndentedString(age)).append("\n");
    sb.append("    birthPlace: ").append(StringUtil.toIndentedString(birthPlace)).append("\n");
    sb.append("    dateOfDeath: ").append(StringUtil.toIndentedString(dateOfDeath)).append("\n");
    sb.append("    reasonOfDeath: ").append(StringUtil.toIndentedString(reasonOfDeath)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
