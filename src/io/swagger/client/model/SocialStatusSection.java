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
public class SocialStatusSection   {
  
  private Integer socialStatus = null;
  private Integer profession = null;
  private Integer cohabitation = null;
  private Integer education = null;

  
  /**
   * Social status
   **/
  @ApiModelProperty(value = "Social status")
  @JsonProperty("socialStatus")
  public Integer getSocialStatus() {
    return socialStatus;
  }
  public void setSocialStatus(Integer socialStatus) {
    this.socialStatus = socialStatus;
  }

  
  /**
   * Profession
   **/
  @ApiModelProperty(value = "Profession")
  @JsonProperty("profession")
  public Integer getProfession() {
    return profession;
  }
  public void setProfession(Integer profession) {
    this.profession = profession;
  }

  
  /**
   * Cohabitation
   **/
  @ApiModelProperty(value = "Cohabitation")
  @JsonProperty("cohabitation")
  public Integer getCohabitation() {
    return cohabitation;
  }
  public void setCohabitation(Integer cohabitation) {
    this.cohabitation = cohabitation;
  }

  
  /**
   * Education
   **/
  @ApiModelProperty(value = "Education")
  @JsonProperty("education")
  public Integer getEducation() {
    return education;
  }
  public void setEducation(Integer education) {
    this.education = education;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SocialStatusSection {\n");
    
    sb.append("    socialStatus: ").append(StringUtil.toIndentedString(socialStatus)).append("\n");
    sb.append("    profession: ").append(StringUtil.toIndentedString(profession)).append("\n");
    sb.append("    cohabitation: ").append(StringUtil.toIndentedString(cohabitation)).append("\n");
    sb.append("    education: ").append(StringUtil.toIndentedString(education)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
