package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class DeliveredMessageBehaviouralMessageSubSubsection   {
  
  private Integer id = null;
  private Integer type = null;
  private String text = null;

  
  /**
   * id
   **/
  @ApiModelProperty(value = "id")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   * type
   **/
  @ApiModelProperty(value = "type")
  @JsonProperty("type")
  public Integer getType() {
    return type;
  }
  public void setType(Integer type) {
    this.type = type;
  }

  
  /**
   * text
   **/
  @ApiModelProperty(value = "text")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveredMessageBehaviouralMessageSubSubsection {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    type: ").append(StringUtil.toIndentedString(type)).append("\n");
    sb.append("    text: ").append(StringUtil.toIndentedString(text)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
