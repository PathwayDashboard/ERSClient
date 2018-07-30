package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.CardiacRehabilitationProgressExerGameSessionwarmingUpInfohrRangeSubSubSubsection;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class CardiacRehabilitationProgressExerGameSessionwarmingUpInfoSubSubsection   {
  
  private Integer duration = null;
  private Double averageHRBpm = null;
  private CardiacRehabilitationProgressExerGameSessionwarmingUpInfohrRangeSubSubSubsection hrRange = null;

  
  /**
   * Duration
   **/
  @ApiModelProperty(value = "Duration")
  @JsonProperty("duration")
  public Integer getDuration() {
    return duration;
  }
  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  
  /**
   * averageHRBpm
   **/
  @ApiModelProperty(value = "averageHRBpm")
  @JsonProperty("averageHRBpm")
  public Double getAverageHRBpm() {
    return averageHRBpm;
  }
  public void setAverageHRBpm(Double averageHRBpm) {
    this.averageHRBpm = averageHRBpm;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("hrRange")
  public CardiacRehabilitationProgressExerGameSessionwarmingUpInfohrRangeSubSubSubsection getHrRange() {
    return hrRange;
  }
  public void setHrRange(CardiacRehabilitationProgressExerGameSessionwarmingUpInfohrRangeSubSubSubsection hrRange) {
    this.hrRange = hrRange;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardiacRehabilitationProgressExerGameSessionwarmingUpInfoSubSubsection {\n");
    
    sb.append("    duration: ").append(StringUtil.toIndentedString(duration)).append("\n");
    sb.append("    averageHRBpm: ").append(StringUtil.toIndentedString(averageHRBpm)).append("\n");
    sb.append("    hrRange: ").append(StringUtil.toIndentedString(hrRange)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}