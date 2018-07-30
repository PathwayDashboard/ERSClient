package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class PersonalisedParameterExclusionIndicationSubSubsection   {
  
  private Boolean value = null;
  private Date dateOfFirstExclusion = null;

  
  /**
   * Value
   **/
  @ApiModelProperty(value = "Value")
  @JsonProperty("value")
  public Boolean getValue() {
    return value;
  }
  public void setValue(Boolean value) {
    this.value = value;
  }

  
  /**
   * dateOfFirstExclusion
   **/
  @ApiModelProperty(value = "dateOfFirstExclusion")
  @JsonProperty("dateOfFirstExclusion")
  public Date getDateOfFirstExclusion() {
    return dateOfFirstExclusion;
  }
  public void setDateOfFirstExclusion(Date dateOfFirstExclusion) {
    this.dateOfFirstExclusion = dateOfFirstExclusion;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalisedParameterExclusionIndicationSubSubsection {\n");
    
    sb.append("    value: ").append(StringUtil.toIndentedString(value)).append("\n");
    sb.append("    dateOfFirstExclusion: ").append(StringUtil.toIndentedString(dateOfFirstExclusion)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
