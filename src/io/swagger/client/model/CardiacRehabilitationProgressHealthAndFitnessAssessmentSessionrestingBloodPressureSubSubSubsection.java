package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class CardiacRehabilitationProgressHealthAndFitnessAssessmentSessionrestingBloodPressureSubSubSubsection   {
  
  private Integer systolic = null;
  private Integer diastolic = null;

  
  /**
   * Systolic
   **/
  @ApiModelProperty(value = "Systolic")
  @JsonProperty("systolic")
  public Integer getSystolic() {
    return systolic;
  }
  public void setSystolic(Integer systolic) {
    this.systolic = systolic;
  }

  
  /**
   * Diastolic
   **/
  @ApiModelProperty(value = "Diastolic")
  @JsonProperty("diastolic")
  public Integer getDiastolic() {
    return diastolic;
  }
  public void setDiastolic(Integer diastolic) {
    this.diastolic = diastolic;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardiacRehabilitationProgressHealthAndFitnessAssessmentSessionrestingBloodPressureSubSubSubsection {\n");
    
    sb.append("    systolic: ").append(StringUtil.toIndentedString(systolic)).append("\n");
    sb.append("    diastolic: ").append(StringUtil.toIndentedString(diastolic)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
