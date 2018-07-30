package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class TargetAccuracyZoneSubSubsection   {
  
  private Double minAccuracy = null;
  private Double maxAccuracy = null;

  
  /**
   * target Accuracy Zonemin
   **/
  @ApiModelProperty(value = "target Accuracy Zonemin")
  @JsonProperty("minAccuracy")
  public Double getMinAccuracy() {
    return minAccuracy;
  }
  public void setMinAccuracy(Double minAccuracy) {
    this.minAccuracy = minAccuracy;
  }

  
  /**
   * target Accuracy Zone max
   **/
  @ApiModelProperty(value = "target Accuracy Zone max")
  @JsonProperty("maxAccuracy")
  public Double getMaxAccuracy() {
    return maxAccuracy;
  }
  public void setMaxAccuracy(Double maxAccuracy) {
    this.maxAccuracy = maxAccuracy;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetAccuracyZoneSubSubsection {\n");
    
    sb.append("    minAccuracy: ").append(StringUtil.toIndentedString(minAccuracy)).append("\n");
    sb.append("    maxAccuracy: ").append(StringUtil.toIndentedString(maxAccuracy)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
