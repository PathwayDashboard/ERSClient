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
import io.swagger.client.model.CardiacRehabilitationProgressExerGameSessionSubsection;
import io.swagger.client.model.CardiacRehabilitationProgressHealthAndFitnessAssessmentSessionSubsection;
import java.util.*;
import io.swagger.client.model.CardiacRehabilitationProgressActiveLifestylePASessionSubsection;
import io.swagger.client.model.CardiacRehabilitationProgressExerClassSessionSubsection;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class CardiacRehabilitationProgressSection   {
  
  private List<CardiacRehabilitationProgressHealthAndFitnessAssessmentSessionSubsection> healthAndFitnessAssessmentSessions = new ArrayList<CardiacRehabilitationProgressHealthAndFitnessAssessmentSessionSubsection>();
  private List<CardiacRehabilitationProgressExerClassSessionSubsection> exerClassSessions = new ArrayList<CardiacRehabilitationProgressExerClassSessionSubsection>();
  private List<CardiacRehabilitationProgressExerGameSessionSubsection> exerGameSessions = new ArrayList<CardiacRehabilitationProgressExerGameSessionSubsection>();
  private List<CardiacRehabilitationProgressActiveLifestylePASessionSubsection> activeLifestylePASessions = new ArrayList<CardiacRehabilitationProgressActiveLifestylePASessionSubsection>();

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("healthAndFitnessAssessmentSessions")
  public List<CardiacRehabilitationProgressHealthAndFitnessAssessmentSessionSubsection> getHealthAndFitnessAssessmentSessions() {
    return healthAndFitnessAssessmentSessions;
  }
  public void setHealthAndFitnessAssessmentSessions(List<CardiacRehabilitationProgressHealthAndFitnessAssessmentSessionSubsection> healthAndFitnessAssessmentSessions) {
    this.healthAndFitnessAssessmentSessions = healthAndFitnessAssessmentSessions;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("exerClassSessions")
  public List<CardiacRehabilitationProgressExerClassSessionSubsection> getExerClassSessions() {
    return exerClassSessions;
  }
  public void setExerClassSessions(List<CardiacRehabilitationProgressExerClassSessionSubsection> exerClassSessions) {
    this.exerClassSessions = exerClassSessions;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("exerGameSessions")
  public List<CardiacRehabilitationProgressExerGameSessionSubsection> getExerGameSessions() {
    return exerGameSessions;
  }
  public void setExerGameSessions(List<CardiacRehabilitationProgressExerGameSessionSubsection> exerGameSessions) {
    this.exerGameSessions = exerGameSessions;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("activeLifestylePASessions")
  public List<CardiacRehabilitationProgressActiveLifestylePASessionSubsection> getActiveLifestylePASessions() {
    return activeLifestylePASessions;
  }
  public void setActiveLifestylePASessions(List<CardiacRehabilitationProgressActiveLifestylePASessionSubsection> activeLifestylePASessions) {
    this.activeLifestylePASessions = activeLifestylePASessions;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardiacRehabilitationProgressSection {\n");
    
    sb.append("    healthAndFitnessAssessmentSessions: ").append(StringUtil.toIndentedString(healthAndFitnessAssessmentSessions)).append("\n");
    sb.append("    exerClassSessions: ").append(StringUtil.toIndentedString(exerClassSessions)).append("\n");
    sb.append("    exerGameSessions: ").append(StringUtil.toIndentedString(exerGameSessions)).append("\n");
    sb.append("    activeLifestylePASessions: ").append(StringUtil.toIndentedString(activeLifestylePASessions)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
