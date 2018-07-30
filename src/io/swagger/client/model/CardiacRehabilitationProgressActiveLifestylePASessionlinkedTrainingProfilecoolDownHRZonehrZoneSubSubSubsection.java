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
public class CardiacRehabilitationProgressActiveLifestylePASessionlinkedTrainingProfilecoolDownHRZonehrZoneSubSubSubsection   {
  
  private Integer minBpm = null;
  private Integer maxBpm = null;

  
  /**
   * minBpm
   **/
  @ApiModelProperty(value = "minBpm")
  @JsonProperty("minBpm")
  public Integer getMinBpm() {
    return minBpm;
  }
  public void setMinBpm(Integer minBpm) {
    this.minBpm = minBpm;
  }

  
  /**
   * maxBpm
   **/
  @ApiModelProperty(value = "maxBpm")
  @JsonProperty("maxBpm")
  public Integer getMaxBpm() {
    return maxBpm;
  }
  public void setMaxBpm(Integer maxBpm) {
    this.maxBpm = maxBpm;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardiacRehabilitationProgressActiveLifestylePASessionlinkedTrainingProfilecoolDownHRZonehrZoneSubSubSubsection {\n");
    
    sb.append("    minBpm: ").append(StringUtil.toIndentedString(minBpm)).append("\n");
    sb.append("    maxBpm: ").append(StringUtil.toIndentedString(maxBpm)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
