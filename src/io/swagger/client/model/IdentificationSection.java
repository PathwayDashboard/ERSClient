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
public class IdentificationSection   {
  
  private String pATIENTID = null;
  private String healthID = null;
  private String insuranceNumber = null;
  private String eADNumber = null;
  private String iEMDNumber = null;
  private Integer supervisor = null;

  
  /**
   * Patient ID
   **/
  @ApiModelProperty(value = "Patient ID")
  @JsonProperty("pATIENTID")
  public String getPATIENTID() {
    return pATIENTID;
  }
  public void setPATIENTID(String pATIENTID) {
    this.pATIENTID = pATIENTID;
  }

  
  /**
   * Health ID / PIC
   **/
  @ApiModelProperty(value = "Health ID / PIC")
  @JsonProperty("healthID")
  public String getHealthID() {
    return healthID;
  }
  public void setHealthID(String healthID) {
    this.healthID = healthID;
  }

  
  /**
   * Insurance number
   **/
  @ApiModelProperty(value = "Insurance number")
  @JsonProperty("insuranceNumber")
  public String getInsuranceNumber() {
    return insuranceNumber;
  }
  public void setInsuranceNumber(String insuranceNumber) {
    this.insuranceNumber = insuranceNumber;
  }

  
  /**
   * EAD number
   **/
  @ApiModelProperty(value = "EAD number")
  @JsonProperty("eADNumber")
  public String getEADNumber() {
    return eADNumber;
  }
  public void setEADNumber(String eADNumber) {
    this.eADNumber = eADNumber;
  }

  
  /**
   * EMD number
   **/
  @ApiModelProperty(value = "EMD number")
  @JsonProperty("iEMDNumber")
  public String getIEMDNumber() {
    return iEMDNumber;
  }
  public void setIEMDNumber(String iEMDNumber) {
    this.iEMDNumber = iEMDNumber;
  }

  
  /**
   * Supervisor
   **/
  @ApiModelProperty(value = "Supervisor")
  @JsonProperty("supervisor")
  public Integer getSupervisor() {
    return supervisor;
  }
  public void setSupervisor(Integer supervisor) {
    this.supervisor = supervisor;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentificationSection {\n");
    
    sb.append("    pATIENTID: ").append(StringUtil.toIndentedString(pATIENTID)).append("\n");
    sb.append("    healthID: ").append(StringUtil.toIndentedString(healthID)).append("\n");
    sb.append("    insuranceNumber: ").append(StringUtil.toIndentedString(insuranceNumber)).append("\n");
    sb.append("    eADNumber: ").append(StringUtil.toIndentedString(eADNumber)).append("\n");
    sb.append("    iEMDNumber: ").append(StringUtil.toIndentedString(iEMDNumber)).append("\n");
    sb.append("    supervisor: ").append(StringUtil.toIndentedString(supervisor)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
