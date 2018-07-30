package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class CardiacRehabilitationProgrammeFitnessAssessmentConfSubSection   {
  
  private Integer stepupsPerMinute = null;

  
  /**
   * stepupsPerMinute
   **/
  @ApiModelProperty(value = "stepupsPerMinute")
  @JsonProperty("stepupsPerMinute")
  public Integer getStepupsPerMinute() {
    return stepupsPerMinute;
  }
  public void setStepupsPerMinute(Integer stepupsPerMinute) {
    this.stepupsPerMinute = stepupsPerMinute;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardiacRehabilitationProgrammeFitnessAssessmentConfSubSection {\n");
    
    sb.append("    stepupsPerMinute: ").append(StringUtil.toIndentedString(stepupsPerMinute)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
