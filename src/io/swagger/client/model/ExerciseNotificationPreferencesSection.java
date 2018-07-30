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
public class ExerciseNotificationPreferencesSection   {
  
  private Integer progressNotificationPeriod = null;
  private Integer progressNotificationChannel = null;
  private Integer nextSessionNotificationChannel = null;
  private Integer inactiveStatusNotificationChannel = null;

  
  /**
   * progressNotificationPeriod
   **/
  @ApiModelProperty(value = "progressNotificationPeriod")
  @JsonProperty("progressNotificationPeriod")
  public Integer getProgressNotificationPeriod() {
    return progressNotificationPeriod;
  }
  public void setProgressNotificationPeriod(Integer progressNotificationPeriod) {
    this.progressNotificationPeriod = progressNotificationPeriod;
  }

  
  /**
   * progressNotificationChannel
   **/
  @ApiModelProperty(value = "progressNotificationChannel")
  @JsonProperty("progressNotificationChannel")
  public Integer getProgressNotificationChannel() {
    return progressNotificationChannel;
  }
  public void setProgressNotificationChannel(Integer progressNotificationChannel) {
    this.progressNotificationChannel = progressNotificationChannel;
  }

  
  /**
   * nextSessionNotificationChannel
   **/
  @ApiModelProperty(value = "nextSessionNotificationChannel")
  @JsonProperty("nextSessionNotificationChannel")
  public Integer getNextSessionNotificationChannel() {
    return nextSessionNotificationChannel;
  }
  public void setNextSessionNotificationChannel(Integer nextSessionNotificationChannel) {
    this.nextSessionNotificationChannel = nextSessionNotificationChannel;
  }

  
  /**
   * inactiveStatusNotificationChannel
   **/
  @ApiModelProperty(value = "inactiveStatusNotificationChannel")
  @JsonProperty("inactiveStatusNotificationChannel")
  public Integer getInactiveStatusNotificationChannel() {
    return inactiveStatusNotificationChannel;
  }
  public void setInactiveStatusNotificationChannel(Integer inactiveStatusNotificationChannel) {
    this.inactiveStatusNotificationChannel = inactiveStatusNotificationChannel;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExerciseNotificationPreferencesSection {\n");
    
    sb.append("    progressNotificationPeriod: ").append(StringUtil.toIndentedString(progressNotificationPeriod)).append("\n");
    sb.append("    progressNotificationChannel: ").append(StringUtil.toIndentedString(progressNotificationChannel)).append("\n");
    sb.append("    nextSessionNotificationChannel: ").append(StringUtil.toIndentedString(nextSessionNotificationChannel)).append("\n");
    sb.append("    inactiveStatusNotificationChannel: ").append(StringUtil.toIndentedString(inactiveStatusNotificationChannel)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
