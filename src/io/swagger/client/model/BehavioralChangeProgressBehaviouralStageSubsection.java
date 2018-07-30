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
public class BehavioralChangeProgressBehaviouralStageSubsection   {
  
  private Integer id = null;
  private Date submissionDate = null;
  private Integer category = null;
  private String message = null;
  private Integer stageType = null;

  
  /**
   * id
   **/
  @ApiModelProperty(value = "id")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   * SubmissionDate
   **/
  @ApiModelProperty(value = "SubmissionDate")
  @JsonProperty("submissionDate")
  public Date getSubmissionDate() {
    return submissionDate;
  }
  public void setSubmissionDate(Date submissionDate) {
    this.submissionDate = submissionDate;
  }

  
  /**
   * category
   **/
  @ApiModelProperty(value = "category")
  @JsonProperty("category")
  public Integer getCategory() {
    return category;
  }
  public void setCategory(Integer category) {
    this.category = category;
  }

  
  /**
   * Message
   **/
  @ApiModelProperty(value = "Message")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   * StageType
   **/
  @ApiModelProperty(value = "StageType")
  @JsonProperty("stageType")
  public Integer getStageType() {
    return stageType;
  }
  public void setStageType(Integer stageType) {
    this.stageType = stageType;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BehavioralChangeProgressBehaviouralStageSubsection {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    submissionDate: ").append(StringUtil.toIndentedString(submissionDate)).append("\n");
    sb.append("    category: ").append(StringUtil.toIndentedString(category)).append("\n");
    sb.append("    message: ").append(StringUtil.toIndentedString(message)).append("\n");
    sb.append("    stageType: ").append(StringUtil.toIndentedString(stageType)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
