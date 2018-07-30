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
