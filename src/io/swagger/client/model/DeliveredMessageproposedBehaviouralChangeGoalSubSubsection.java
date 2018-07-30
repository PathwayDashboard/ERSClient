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
public class DeliveredMessageproposedBehaviouralChangeGoalSubSubsection   {
  
  private String description = null;
  private Integer category = null;

  
  /**
   * description
   **/
  @ApiModelProperty(value = "description")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * category
   **/
  @ApiModelProperty(value = "category")
  @JsonProperty("category")
  public Integer getCategory() {
    return category;
  }
  public void setCategory(Integer category) {
    this.category = category;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveredMessageproposedBehaviouralChangeGoalSubSubsection {\n");
    
    sb.append("    description: ").append(StringUtil.toIndentedString(description)).append("\n");
    sb.append("    category: ").append(StringUtil.toIndentedString(category)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
