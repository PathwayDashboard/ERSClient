package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class CardiacRehabilitationProgressHealthAndFitnessAssessmentSessionHealthAndFitnessAssessmentPreScreeningInforestingHRSubSubSection   {
  
  private Double bpm = null;

  
  /**
   * bpm
   **/
  @ApiModelProperty(value = "bpm")
  @JsonProperty("bpm")
  public Double getBpm() {
    return bpm;
  }
  public void setBpm(Double bpm) {
    this.bpm = bpm;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardiacRehabilitationProgressHealthAndFitnessAssessmentSessionHealthAndFitnessAssessmentPreScreeningInforestingHRSubSubSection {\n");
    
    sb.append("    bpm: ").append(StringUtil.toIndentedString(bpm)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
