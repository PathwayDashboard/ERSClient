/*******************************************************************************
 * Copyright 2018 Engineering Ing. Inf. S.p.A.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class MessageTemplateIDType   {
  
  private Integer category = null;
  private Integer type = null;
  private Integer templateID = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("Category")
  public Integer getCategory() {
    return category;
  }
  public void setCategory(Integer category) {
    this.category = category;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("Type")
  public Integer getType() {
    return type;
  }
  public void setType(Integer type) {
    this.type = type;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("TemplateID")
  public Integer getTemplateID() {
    return templateID;
  }
  public void setTemplateID(Integer templateID) {
    this.templateID = templateID;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageTemplateIDType {\n");
    
    sb.append("    category: ").append(StringUtil.toIndentedString(category)).append("\n");
    sb.append("    type: ").append(StringUtil.toIndentedString(type)).append("\n");
    sb.append("    templateID: ").append(StringUtil.toIndentedString(templateID)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
