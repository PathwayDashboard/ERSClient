package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class EnvironmentSection   {
  
  private String zensorID = null;
  private String notebookID = null;

  
  /**
   * ZensorID
   **/
  @ApiModelProperty(value = "ZensorID")
  @JsonProperty("zensorID")
  public String getZensorID() {
    return zensorID;
  }
  public void setZensorID(String zensorID) {
    this.zensorID = zensorID;
  }

  
  /**
   * NotebookID
   **/
  @ApiModelProperty(value = "NotebookID")
  @JsonProperty("notebookID")
  public String getNotebookID() {
    return notebookID;
  }
  public void setNotebookID(String notebookID) {
    this.notebookID = notebookID;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentSection {\n");
    
    sb.append("    zensorID: ").append(StringUtil.toIndentedString(zensorID)).append("\n");
    sb.append("    notebookID: ").append(StringUtil.toIndentedString(notebookID)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
