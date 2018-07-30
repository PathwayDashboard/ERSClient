package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class CardiacRehabilitationProgressExerClassSessionExecutedExercisehrRangeSubSubSubsection   {
  
  private Integer minBpm = null;
  private Integer maxBpm = null;

  
  /**
   * minBpm
   **/
  @ApiModelProperty(value = "minBpm")
  @JsonProperty("minBpm")
  public Integer getMinBpm() {
    return minBpm;
  }
  public void setMinBpm(Integer minBpm) {
    this.minBpm = minBpm;
  }

  
  /**
   * maxBpm
   **/
  @ApiModelProperty(value = "maxBpm")
  @JsonProperty("maxBpm")
  public Integer getMaxBpm() {
    return maxBpm;
  }
  public void setMaxBpm(Integer maxBpm) {
    this.maxBpm = maxBpm;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardiacRehabilitationProgressExerClassSessionExecutedExercisehrRangeSubSubSubsection {\n");
    
    sb.append("    minBpm: ").append(StringUtil.toIndentedString(minBpm)).append("\n");
    sb.append("    maxBpm: ").append(StringUtil.toIndentedString(maxBpm)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
