package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-09-02T12:13:07.143+02:00")
public class NameSection   {
  
  private String givenName = null;
  private String familyName = null;

  
  /**
   * Given name
   **/
  @ApiModelProperty(value = "Given name")
  @JsonProperty("givenName")
  public String getGivenName() {
    return givenName;
  }
  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  
  /**
   * Family name / Surname
   **/
  @ApiModelProperty(value = "Family name / Surname")
  @JsonProperty("familyName")
  public String getFamilyName() {
    return familyName;
  }
  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NameSection {\n");
    
    sb.append("    givenName: ").append(StringUtil.toIndentedString(givenName)).append("\n");
    sb.append("    familyName: ").append(StringUtil.toIndentedString(familyName)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
