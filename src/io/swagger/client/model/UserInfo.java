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
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class UserInfo   {
  
  private String caption = null;
  private List<Integer> roles = new ArrayList<Integer>();

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("Caption")
  public String getCaption() {
    return caption;
  }
  public void setCaption(String caption) {
    this.caption = caption;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("roles")
  public List<Integer> getRoles() {
    return roles;
  }
  public void setRoles(List<Integer> roles) {
    this.roles = roles;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInfo {\n");
    
    sb.append("    caption: ").append(StringUtil.toIndentedString(caption)).append("\n");
    sb.append("    roles: ").append(StringUtil.toIndentedString(roles)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
