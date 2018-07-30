package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class CardiacRehabilitationProgressExerClassSessionPreScreeningInforestingHRSubSubSubSection   {
  
  private Integer bpm = null;

  
  /**
   * bpm
   **/
  @ApiModelProperty(value = "bpm")
  @JsonProperty("bpm")
  public Integer getBpm() {
    return bpm;
  }
  public void setBpm(Integer bpm) {
    this.bpm = bpm;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardiacRehabilitationProgressExerClassSessionPreScreeningInforestingHRSubSubSubSection {\n");
    
    sb.append("    bpm: ").append(StringUtil.toIndentedString(bpm)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
