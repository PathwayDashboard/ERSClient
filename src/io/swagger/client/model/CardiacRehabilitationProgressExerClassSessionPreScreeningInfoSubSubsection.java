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
import io.swagger.client.model.CardiacRehabilitationProgressExerClassSessionPreScreeningInforestingHRSubSubSubSection;
import io.swagger.client.model.CardiacRehabilitationProgressExerClassSessionPreScreeningInforestingBloodPressureSubSubSubsection;
import java.util.*;
import io.swagger.client.model.CardiacRehabilitationProgressExerClassSessionPreScreeningInfoFinalEvaluationSubSubSubsection;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class CardiacRehabilitationProgressExerClassSessionPreScreeningInfoSubSubsection   {
  
  private List<String> preScreeningAssessments = new ArrayList<String>();
  private CardiacRehabilitationProgressExerClassSessionPreScreeningInforestingHRSubSubSubSection restingHR = null;
  private CardiacRehabilitationProgressExerClassSessionPreScreeningInfoFinalEvaluationSubSubSubsection finalEvaluation = null;
  private CardiacRehabilitationProgressExerClassSessionPreScreeningInforestingBloodPressureSubSubSubsection restingBloodPressure = null;

  
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
  public CardiacRehabilitationProgressExerClassSessionPreScreeningInforestingHRSubSubSubSection getRestingHR() {
    return restingHR;
  }
  public void setRestingHR(CardiacRehabilitationProgressExerClassSessionPreScreeningInforestingHRSubSubSubSection restingHR) {
    this.restingHR = restingHR;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("finalEvaluation")
  public CardiacRehabilitationProgressExerClassSessionPreScreeningInfoFinalEvaluationSubSubSubsection getFinalEvaluation() {
    return finalEvaluation;
  }
  public void setFinalEvaluation(CardiacRehabilitationProgressExerClassSessionPreScreeningInfoFinalEvaluationSubSubSubsection finalEvaluation) {
    this.finalEvaluation = finalEvaluation;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("restingBloodPressure")
  public CardiacRehabilitationProgressExerClassSessionPreScreeningInforestingBloodPressureSubSubSubsection getRestingBloodPressure() {
    return restingBloodPressure;
  }
  public void setRestingBloodPressure(CardiacRehabilitationProgressExerClassSessionPreScreeningInforestingBloodPressureSubSubSubsection restingBloodPressure) {
    this.restingBloodPressure = restingBloodPressure;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardiacRehabilitationProgressExerClassSessionPreScreeningInfoSubSubsection {\n");
    
    sb.append("    preScreeningAssessments: ").append(StringUtil.toIndentedString(preScreeningAssessments)).append("\n");
    sb.append("    restingHR: ").append(StringUtil.toIndentedString(restingHR)).append("\n");
    sb.append("    finalEvaluation: ").append(StringUtil.toIndentedString(finalEvaluation)).append("\n");
    sb.append("    restingBloodPressure: ").append(StringUtil.toIndentedString(restingBloodPressure)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
