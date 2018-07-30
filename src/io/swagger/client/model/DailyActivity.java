package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Daily activity
 **/
@ApiModel(description = "Daily activity")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class DailyActivity   {
  
  private Date day = null;
  private Integer steps = null;
  private Integer kcal = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("day")
  public Date getDay() {
    return day;
  }
  public void setDay(Date day) {
    this.day = day;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("steps")
  public Integer getSteps() {
    return steps;
  }
  public void setSteps(Integer steps) {
    this.steps = steps;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("kcal")
  public Integer getKcal() {
    return kcal;
  }
  public void setKcal(Integer kcal) {
    this.kcal = kcal;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DailyActivity {\n");
    
    sb.append("    day: ").append(StringUtil.toIndentedString(day)).append("\n");
    sb.append("    steps: ").append(StringUtil.toIndentedString(steps)).append("\n");
    sb.append("    kcal: ").append(StringUtil.toIndentedString(kcal)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
