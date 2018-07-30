package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class BehavioralChangeProgressGoalAssessmentQuantitativeAnswerSubSubsection   {
  
  private String questionId = null;
  private Integer value = null;

  
  /**
   * questionId
   **/
  @ApiModelProperty(value = "questionId")
  @JsonProperty("questionId")
  public String getQuestionId() {
    return questionId;
  }
  public void setQuestionId(String questionId) {
    this.questionId = questionId;
  }

  
  /**
   * Value
   **/
  @ApiModelProperty(value = "Value")
  @JsonProperty("value")
  public Integer getValue() {
    return value;
  }
  public void setValue(Integer value) {
    this.value = value;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BehavioralChangeProgressGoalAssessmentQuantitativeAnswerSubSubsection {\n");
    
    sb.append("    questionId: ").append(StringUtil.toIndentedString(questionId)).append("\n");
    sb.append("    value: ").append(StringUtil.toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
