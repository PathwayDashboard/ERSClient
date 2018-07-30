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
import io.swagger.client.model.DeliveredMessageproposedBehaviouralChangeGoalSubSubsection;
import io.swagger.client.model.DeliveredMessageproposedExerciseProgrammeSubSubsection;
import java.util.*;
import io.swagger.client.model.DeliveredMessageBehaviouralMessageSubSubsection;
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class DeliveredMessageSubSection   {
  
  private Boolean managed = null;
  private Date deliveryTimestamp = null;
  private List<DeliveredMessageproposedBehaviouralChangeGoalSubSubsection> proposedBehaviouralChangeGoals = new ArrayList<DeliveredMessageproposedBehaviouralChangeGoalSubSubsection>();
  private DeliveredMessageBehaviouralMessageSubSubsection behaviouralMessage = null;
  private DeliveredMessageproposedExerciseProgrammeSubSubsection proposedExerciseProgramme = null;

  
  /**
   * Managed
   **/
  @ApiModelProperty(value = "Managed")
  @JsonProperty("managed")
  public Boolean getManaged() {
    return managed;
  }
  public void setManaged(Boolean managed) {
    this.managed = managed;
  }

  
  /**
   * deliveryTimestamp
   **/
  @ApiModelProperty(value = "deliveryTimestamp")
  @JsonProperty("deliveryTimestamp")
  public Date getDeliveryTimestamp() {
    return deliveryTimestamp;
  }
  public void setDeliveryTimestamp(Date deliveryTimestamp) {
    this.deliveryTimestamp = deliveryTimestamp;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("proposedBehaviouralChangeGoals")
  public List<DeliveredMessageproposedBehaviouralChangeGoalSubSubsection> getProposedBehaviouralChangeGoals() {
    return proposedBehaviouralChangeGoals;
  }
  public void setProposedBehaviouralChangeGoals(List<DeliveredMessageproposedBehaviouralChangeGoalSubSubsection> proposedBehaviouralChangeGoals) {
    this.proposedBehaviouralChangeGoals = proposedBehaviouralChangeGoals;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("behaviouralMessage")
  public DeliveredMessageBehaviouralMessageSubSubsection getBehaviouralMessage() {
    return behaviouralMessage;
  }
  public void setBehaviouralMessage(DeliveredMessageBehaviouralMessageSubSubsection behaviouralMessage) {
    this.behaviouralMessage = behaviouralMessage;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("proposedExerciseProgramme")
  public DeliveredMessageproposedExerciseProgrammeSubSubsection getProposedExerciseProgramme() {
    return proposedExerciseProgramme;
  }
  public void setProposedExerciseProgramme(DeliveredMessageproposedExerciseProgrammeSubSubsection proposedExerciseProgramme) {
    this.proposedExerciseProgramme = proposedExerciseProgramme;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveredMessageSubSection {\n");
    
    sb.append("    managed: ").append(StringUtil.toIndentedString(managed)).append("\n");
    sb.append("    deliveryTimestamp: ").append(StringUtil.toIndentedString(deliveryTimestamp)).append("\n");
    sb.append("    proposedBehaviouralChangeGoals: ").append(StringUtil.toIndentedString(proposedBehaviouralChangeGoals)).append("\n");
    sb.append("    behaviouralMessage: ").append(StringUtil.toIndentedString(behaviouralMessage)).append("\n");
    sb.append("    proposedExerciseProgramme: ").append(StringUtil.toIndentedString(proposedExerciseProgramme)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
