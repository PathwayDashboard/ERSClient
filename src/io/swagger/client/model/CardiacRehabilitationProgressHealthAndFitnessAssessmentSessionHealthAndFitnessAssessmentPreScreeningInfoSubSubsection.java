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
import io.swagger.client.model.CardiacRehabilitationProgressHealthAndFitnessAssessmentSessionHealthAndFitnessAssessmentPreScreeningInforestingHRSubSubSection;
import io.swagger.client.model.CardiacRehabilitationProgressHealthAndFitnessAssessmentSessionrestingBloodPressureSubSubSubsection;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class CardiacRehabilitationProgressHealthAndFitnessAssessmentSessionHealthAndFitnessAssessmentPreScreeningInfoSubSubsection   {
  
  private List<String> healthAssessments = new ArrayList<String>();
  private String restingECG = null;
  private CardiacRehabilitationProgressHealthAndFitnessAssessmentSessionHealthAndFitnessAssessmentPreScreeningInforestingHRSubSubSection restingHR = null;
  private CardiacRehabilitationProgressHealthAndFitnessAssessmentSessionrestingBloodPressureSubSubSubsection restingBloodPressure = null;

  
  /**
   * healthAssessments
   **/
  @ApiModelProperty(value = "healthAssessments")
  @JsonProperty("healthAssessments")
  public List<String> getHealthAssessments() {
    return healthAssessments;
  }
  public void setHealthAssessments(List<String> healthAssessments) {
    this.healthAssessments = healthAssessments;
  }

  
  /**
   * restingECG
   **/
  @ApiModelProperty(value = "restingECG")
  @JsonProperty("restingECG")
  public String getRestingECG() {
    return restingECG;
  }
  public void setRestingECG(String restingECG) {
    this.restingECG = restingECG;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("restingHR")
  public CardiacRehabilitationProgressHealthAndFitnessAssessmentSessionHealthAndFitnessAssessmentPreScreeningInforestingHRSubSubSection getRestingHR() {
    return restingHR;
  }
  public void setRestingHR(CardiacRehabilitationProgressHealthAndFitnessAssessmentSessionHealthAndFitnessAssessmentPreScreeningInforestingHRSubSubSection restingHR) {
    this.restingHR = restingHR;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("restingBloodPressure")
  public CardiacRehabilitationProgressHealthAndFitnessAssessmentSessionrestingBloodPressureSubSubSubsection getRestingBloodPressure() {
    return restingBloodPressure;
  }
  public void setRestingBloodPressure(CardiacRehabilitationProgressHealthAndFitnessAssessmentSessionrestingBloodPressureSubSubSubsection restingBloodPressure) {
    this.restingBloodPressure = restingBloodPressure;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardiacRehabilitationProgressHealthAndFitnessAssessmentSessionHealthAndFitnessAssessmentPreScreeningInfoSubSubsection {\n");
    
    sb.append("    healthAssessments: ").append(StringUtil.toIndentedString(healthAssessments)).append("\n");
    sb.append("    restingECG: ").append(StringUtil.toIndentedString(restingECG)).append("\n");
    sb.append("    restingHR: ").append(StringUtil.toIndentedString(restingHR)).append("\n");
    sb.append("    restingBloodPressure: ").append(StringUtil.toIndentedString(restingBloodPressure)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
