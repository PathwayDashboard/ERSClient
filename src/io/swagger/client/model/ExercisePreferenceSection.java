package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class ExercisePreferenceSection   {
  
  private List<Integer> preferredCategories = new ArrayList<Integer>();
  private List<Integer> preferredBodyParts = new ArrayList<Integer>();

  
  /**
   * Preferred Categories
   **/
  @ApiModelProperty(value = "Preferred Categories")
  @JsonProperty("preferredCategories")
  public List<Integer> getPreferredCategories() {
    return preferredCategories;
  }
  public void setPreferredCategories(List<Integer> preferredCategories) {
    this.preferredCategories = preferredCategories;
  }

  
  /**
   * Preferred BodyParts
   **/
  @ApiModelProperty(value = "Preferred BodyParts")
  @JsonProperty("preferredBodyParts")
  public List<Integer> getPreferredBodyParts() {
    return preferredBodyParts;
  }
  public void setPreferredBodyParts(List<Integer> preferredBodyParts) {
    this.preferredBodyParts = preferredBodyParts;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExercisePreferenceSection {\n");
    
    sb.append("    preferredCategories: ").append(StringUtil.toIndentedString(preferredCategories)).append("\n");
    sb.append("    preferredBodyParts: ").append(StringUtil.toIndentedString(preferredBodyParts)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
