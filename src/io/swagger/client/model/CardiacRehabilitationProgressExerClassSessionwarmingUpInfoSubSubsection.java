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
import io.swagger.client.model.CardiacRehabilitationProgressExerClassSessionwarmingUpInfohrRangeSubSubSubsection;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class CardiacRehabilitationProgressExerClassSessionwarmingUpInfoSubSubsection   {
  
  private Integer duration = null;
  private Double averageHRBpm = null;
  private CardiacRehabilitationProgressExerClassSessionwarmingUpInfohrRangeSubSubSubsection hrRange = null;

  
  /**
   * Duration
   **/
  @ApiModelProperty(value = "Duration")
  @JsonProperty("duration")
  public Integer getDuration() {
    return duration;
  }
  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  
  /**
   * averageHRBpm
   **/
  @ApiModelProperty(value = "averageHRBpm")
  @JsonProperty("averageHRBpm")
  public Double getAverageHRBpm() {
    return averageHRBpm;
  }
  public void setAverageHRBpm(Double averageHRBpm) {
    this.averageHRBpm = averageHRBpm;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("hrRange")
  public CardiacRehabilitationProgressExerClassSessionwarmingUpInfohrRangeSubSubSubsection getHrRange() {
    return hrRange;
  }
  public void setHrRange(CardiacRehabilitationProgressExerClassSessionwarmingUpInfohrRangeSubSubSubsection hrRange) {
    this.hrRange = hrRange;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardiacRehabilitationProgressExerClassSessionwarmingUpInfoSubSubsection {\n");
    
    sb.append("    duration: ").append(StringUtil.toIndentedString(duration)).append("\n");
    sb.append("    averageHRBpm: ").append(StringUtil.toIndentedString(averageHRBpm)).append("\n");
    sb.append("    hrRange: ").append(StringUtil.toIndentedString(hrRange)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
