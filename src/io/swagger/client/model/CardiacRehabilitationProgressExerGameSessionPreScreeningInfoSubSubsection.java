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
import io.swagger.client.model.CardiacRehabilitationProgressExerGameSessionPreScreeningInforestingHRSubSubSubsection;
import java.util.*;
import io.swagger.client.model.CardiacRehabilitationProgressExerGameSessionPreScreeningInforestingBloodPressureSubSubSubsection;
import io.swagger.client.model.CardiacRehabilitationProgressExerGameSessionPreScreeningInfoFinalEvaluationSubSubSubsection;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class CardiacRehabilitationProgressExerGameSessionPreScreeningInfoSubSubsection   {
  
  private List<String> preScreeningAssessments = new ArrayList<String>();
  private CardiacRehabilitationProgressExerGameSessionPreScreeningInforestingHRSubSubSubsection restingHR = null;
  private CardiacRehabilitationProgressExerGameSessionPreScreeningInfoFinalEvaluationSubSubSubsection finalEvaluation = null;
  private CardiacRehabilitationProgressExerGameSessionPreScreeningInforestingBloodPressureSubSubSubsection restingBloodPressure = null;

  
  /**
   * preScreeningAssessments
   **/
  @ApiModelProperty(value = "preScreeningAssessments")
  @JsonProperty("preScreeningAssessments")
  public List<String> getPreScreeningAssessments() {
    return preScreeningAssessments;
  }
  public void setPreScreeningAssessments(List<String> preScreeningAssessments) {
    this.preScreeningAssessments = preScreeningAssessments;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("restingHR")
  public CardiacRehabilitationProgressExerGameSessionPreScreeningInforestingHRSubSubSubsection getRestingHR() {
    return restingHR;
  }
  public void setRestingHR(CardiacRehabilitationProgressExerGameSessionPreScreeningInforestingHRSubSubSubsection restingHR) {
    this.restingHR = restingHR;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("finalEvaluation")
  public CardiacRehabilitationProgressExerGameSessionPreScreeningInfoFinalEvaluationSubSubSubsection getFinalEvaluation() {
    return finalEvaluation;
  }
  public void setFinalEvaluation(CardiacRehabilitationProgressExerGameSessionPreScreeningInfoFinalEvaluationSubSubSubsection finalEvaluation) {
    this.finalEvaluation = finalEvaluation;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("restingBloodPressure")
  public CardiacRehabilitationProgressExerGameSessionPreScreeningInforestingBloodPressureSubSubSubsection getRestingBloodPressure() {
    return restingBloodPressure;
  }
  public void setRestingBloodPressure(CardiacRehabilitationProgressExerGameSessionPreScreeningInforestingBloodPressureSubSubSubsection restingBloodPressure) {
    this.restingBloodPressure = restingBloodPressure;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardiacRehabilitationProgressExerGameSessionPreScreeningInfoSubSubsection {\n");
    
    sb.append("    preScreeningAssessments: ").append(StringUtil.toIndentedString(preScreeningAssessments)).append("\n");
    sb.append("    restingHR: ").append(StringUtil.toIndentedString(restingHR)).append("\n");
    sb.append("    finalEvaluation: ").append(StringUtil.toIndentedString(finalEvaluation)).append("\n");
    sb.append("    restingBloodPressure: ").append(StringUtil.toIndentedString(restingBloodPressure)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
