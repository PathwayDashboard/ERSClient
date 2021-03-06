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
import io.swagger.client.model.CardiacRehabilitationProgressActiveLifestylePASessionlinkedTrainingProfilecoolDownHRZonehrZoneSubSubSubsection;
import io.swagger.client.model.CardiacRehabilitationProgressActiveLifestylePASessionlinkedTrainingProfilemainHRZonehrZoneSubSubSubsection;
import io.swagger.client.model.CardiacRehabilitationProgressActiveLifestylePASessionlinkedTrainingProfilewarmingUpHRZonehrZoneSubSubSubsection;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class CardiacRehabilitationProgressActiveLifestylePASessionlinkedTrainingProfileSubSubsection   {
  
  private Integer warmingUpDuration = null;
  private Integer mainDuration = null;
  private Integer coolDownDuration = null;
  private CardiacRehabilitationProgressActiveLifestylePASessionlinkedTrainingProfilewarmingUpHRZonehrZoneSubSubSubsection warmingUpHRZone = null;
  private CardiacRehabilitationProgressActiveLifestylePASessionlinkedTrainingProfilemainHRZonehrZoneSubSubSubsection mainHRZone = null;
  private CardiacRehabilitationProgressActiveLifestylePASessionlinkedTrainingProfilecoolDownHRZonehrZoneSubSubSubsection coolDownHRZone = null;

  
  /**
   * warmingUpDuration
   **/
  @ApiModelProperty(value = "warmingUpDuration")
  @JsonProperty("warmingUpDuration")
  public Integer getWarmingUpDuration() {
    return warmingUpDuration;
  }
  public void setWarmingUpDuration(Integer warmingUpDuration) {
    this.warmingUpDuration = warmingUpDuration;
  }

  
  /**
   * mainDuration
   **/
  @ApiModelProperty(value = "mainDuration")
  @JsonProperty("mainDuration")
  public Integer getMainDuration() {
    return mainDuration;
  }
  public void setMainDuration(Integer mainDuration) {
    this.mainDuration = mainDuration;
  }

  
  /**
   * coolDownDuration
   **/
  @ApiModelProperty(value = "coolDownDuration")
  @JsonProperty("coolDownDuration")
  public Integer getCoolDownDuration() {
    return coolDownDuration;
  }
  public void setCoolDownDuration(Integer coolDownDuration) {
    this.coolDownDuration = coolDownDuration;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("warmingUpHRZone")
  public CardiacRehabilitationProgressActiveLifestylePASessionlinkedTrainingProfilewarmingUpHRZonehrZoneSubSubSubsection getWarmingUpHRZone() {
    return warmingUpHRZone;
  }
  public void setWarmingUpHRZone(CardiacRehabilitationProgressActiveLifestylePASessionlinkedTrainingProfilewarmingUpHRZonehrZoneSubSubSubsection warmingUpHRZone) {
    this.warmingUpHRZone = warmingUpHRZone;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("mainHRZone")
  public CardiacRehabilitationProgressActiveLifestylePASessionlinkedTrainingProfilemainHRZonehrZoneSubSubSubsection getMainHRZone() {
    return mainHRZone;
  }
  public void setMainHRZone(CardiacRehabilitationProgressActiveLifestylePASessionlinkedTrainingProfilemainHRZonehrZoneSubSubSubsection mainHRZone) {
    this.mainHRZone = mainHRZone;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("coolDownHRZone")
  public CardiacRehabilitationProgressActiveLifestylePASessionlinkedTrainingProfilecoolDownHRZonehrZoneSubSubSubsection getCoolDownHRZone() {
    return coolDownHRZone;
  }
  public void setCoolDownHRZone(CardiacRehabilitationProgressActiveLifestylePASessionlinkedTrainingProfilecoolDownHRZonehrZoneSubSubSubsection coolDownHRZone) {
    this.coolDownHRZone = coolDownHRZone;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardiacRehabilitationProgressActiveLifestylePASessionlinkedTrainingProfileSubSubsection {\n");
    
    sb.append("    warmingUpDuration: ").append(StringUtil.toIndentedString(warmingUpDuration)).append("\n");
    sb.append("    mainDuration: ").append(StringUtil.toIndentedString(mainDuration)).append("\n");
    sb.append("    coolDownDuration: ").append(StringUtil.toIndentedString(coolDownDuration)).append("\n");
    sb.append("    warmingUpHRZone: ").append(StringUtil.toIndentedString(warmingUpHRZone)).append("\n");
    sb.append("    mainHRZone: ").append(StringUtil.toIndentedString(mainHRZone)).append("\n");
    sb.append("    coolDownHRZone: ").append(StringUtil.toIndentedString(coolDownHRZone)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
