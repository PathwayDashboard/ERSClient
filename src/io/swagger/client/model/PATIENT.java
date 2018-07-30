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
import io.swagger.client.model.SocialStatusSection;
import io.swagger.client.model.BirthDeathSection;
import io.swagger.client.model.ContactpersonSection;
import io.swagger.client.model.EnvironmentSection;
import io.swagger.client.model.IdentificationSection;
import io.swagger.client.model.PreferredHPHPOContactSection;
import io.swagger.client.model.DemographicsSection;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class PATIENT   {
  
  private IdentificationSection identification = null;
  private DemographicsSection demographics = null;
  private BirthDeathSection birthDeath = null;
  private PreferredHPHPOContactSection preferredHPHPOContact = null;
  private ContactpersonSection contactperson = null;
  private SocialStatusSection socialStatus = null;
  private EnvironmentSection environment = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("identification")
  public IdentificationSection getIdentification() {
    return identification;
  }
  public void setIdentification(IdentificationSection identification) {
    this.identification = identification;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("demographics")
  public DemographicsSection getDemographics() {
    return demographics;
  }
  public void setDemographics(DemographicsSection demographics) {
    this.demographics = demographics;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("birthDeath")
  public BirthDeathSection getBirthDeath() {
    return birthDeath;
  }
  public void setBirthDeath(BirthDeathSection birthDeath) {
    this.birthDeath = birthDeath;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("preferredHP_HPOContact")
  public PreferredHPHPOContactSection getPreferredHPHPOContact() {
    return preferredHPHPOContact;
  }
  public void setPreferredHPHPOContact(PreferredHPHPOContactSection preferredHPHPOContact) {
    this.preferredHPHPOContact = preferredHPHPOContact;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("contactperson")
  public ContactpersonSection getContactperson() {
    return contactperson;
  }
  public void setContactperson(ContactpersonSection contactperson) {
    this.contactperson = contactperson;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("socialStatus")
  public SocialStatusSection getSocialStatus() {
    return socialStatus;
  }
  public void setSocialStatus(SocialStatusSection socialStatus) {
    this.socialStatus = socialStatus;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("environment")
  public EnvironmentSection getEnvironment() {
    return environment;
  }
  public void setEnvironment(EnvironmentSection environment) {
    this.environment = environment;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PATIENT {\n");
    
    sb.append("    identification: ").append(StringUtil.toIndentedString(identification)).append("\n");
    sb.append("    demographics: ").append(StringUtil.toIndentedString(demographics)).append("\n");
    sb.append("    birthDeath: ").append(StringUtil.toIndentedString(birthDeath)).append("\n");
    sb.append("    preferredHPHPOContact: ").append(StringUtil.toIndentedString(preferredHPHPOContact)).append("\n");
    sb.append("    contactperson: ").append(StringUtil.toIndentedString(contactperson)).append("\n");
    sb.append("    socialStatus: ").append(StringUtil.toIndentedString(socialStatus)).append("\n");
    sb.append("    environment: ").append(StringUtil.toIndentedString(environment)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
