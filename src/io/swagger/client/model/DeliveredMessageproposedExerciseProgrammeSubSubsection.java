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
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class DeliveredMessageproposedExerciseProgrammeSubSubsection   {
  
  private Integer weeklyFrequency = null;
  private Integer exerciseIntensity = null;
  private Integer weeklyTime = null;
  private Integer personalWeeklyTime = null;
  private Integer classDuration = null;
  private Integer gameDuration = null;
  private Integer numberOfExerClass = null;
  private Integer numberOfExerGame = null;
  private Integer numberOfActiveLifestyleActivity = null;
  private Double hrrUpperThreshold = null;
  private Date date = null;

  
  /**
   * weeklyFrequency
   **/
  @ApiModelProperty(value = "weeklyFrequency")
  @JsonProperty("weeklyFrequency")
  public Integer getWeeklyFrequency() {
    return weeklyFrequency;
  }
  public void setWeeklyFrequency(Integer weeklyFrequency) {
    this.weeklyFrequency = weeklyFrequency;
  }

  
  /**
   * exerciseIntensity
   **/
  @ApiModelProperty(value = "exerciseIntensity")
  @JsonProperty("exerciseIntensity")
  public Integer getExerciseIntensity() {
    return exerciseIntensity;
  }
  public void setExerciseIntensity(Integer exerciseIntensity) {
    this.exerciseIntensity = exerciseIntensity;
  }

  
  /**
   * weeklyTime
   **/
  @ApiModelProperty(value = "weeklyTime")
  @JsonProperty("weeklyTime")
  public Integer getWeeklyTime() {
    return weeklyTime;
  }
  public void setWeeklyTime(Integer weeklyTime) {
    this.weeklyTime = weeklyTime;
  }

  
  /**
   * personalWeeklyTime
   **/
  @ApiModelProperty(value = "personalWeeklyTime")
  @JsonProperty("personalWeeklyTime")
  public Integer getPersonalWeeklyTime() {
    return personalWeeklyTime;
  }
  public void setPersonalWeeklyTime(Integer personalWeeklyTime) {
    this.personalWeeklyTime = personalWeeklyTime;
  }

  
  /**
   * classDuration
   **/
  @ApiModelProperty(value = "classDuration")
  @JsonProperty("classDuration")
  public Integer getClassDuration() {
    return classDuration;
  }
  public void setClassDuration(Integer classDuration) {
    this.classDuration = classDuration;
  }

  
  /**
   * gameDuration
   **/
  @ApiModelProperty(value = "gameDuration")
  @JsonProperty("gameDuration")
  public Integer getGameDuration() {
    return gameDuration;
  }
  public void setGameDuration(Integer gameDuration) {
    this.gameDuration = gameDuration;
  }

  
  /**
   * numberOfExerClass
   **/
  @ApiModelProperty(value = "numberOfExerClass")
  @JsonProperty("numberOfExerClass")
  public Integer getNumberOfExerClass() {
    return numberOfExerClass;
  }
  public void setNumberOfExerClass(Integer numberOfExerClass) {
    this.numberOfExerClass = numberOfExerClass;
  }

  
  /**
   * numberOfExerGame
   **/
  @ApiModelProperty(value = "numberOfExerGame")
  @JsonProperty("numberOfExerGame")
  public Integer getNumberOfExerGame() {
    return numberOfExerGame;
  }
  public void setNumberOfExerGame(Integer numberOfExerGame) {
    this.numberOfExerGame = numberOfExerGame;
  }

  
  /**
   * numberOfActiveLifestyleActivity
   **/
  @ApiModelProperty(value = "numberOfActiveLifestyleActivity")
  @JsonProperty("numberOfActiveLifestyleActivity")
  public Integer getNumberOfActiveLifestyleActivity() {
    return numberOfActiveLifestyleActivity;
  }
  public void setNumberOfActiveLifestyleActivity(Integer numberOfActiveLifestyleActivity) {
    this.numberOfActiveLifestyleActivity = numberOfActiveLifestyleActivity;
  }

  
  /**
   * hrrUpperThreshold
   **/
  @ApiModelProperty(value = "hrrUpperThreshold")
  @JsonProperty("hrrUpperThreshold")
  public Double getHrrUpperThreshold() {
    return hrrUpperThreshold;
  }
  public void setHrrUpperThreshold(Double hrrUpperThreshold) {
    this.hrrUpperThreshold = hrrUpperThreshold;
  }

  
  /**
   * date
   **/
  @ApiModelProperty(value = "date")
  @JsonProperty("date")
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveredMessageproposedExerciseProgrammeSubSubsection {\n");
    
    sb.append("    weeklyFrequency: ").append(StringUtil.toIndentedString(weeklyFrequency)).append("\n");
    sb.append("    exerciseIntensity: ").append(StringUtil.toIndentedString(exerciseIntensity)).append("\n");
    sb.append("    weeklyTime: ").append(StringUtil.toIndentedString(weeklyTime)).append("\n");
    sb.append("    personalWeeklyTime: ").append(StringUtil.toIndentedString(personalWeeklyTime)).append("\n");
    sb.append("    classDuration: ").append(StringUtil.toIndentedString(classDuration)).append("\n");
    sb.append("    gameDuration: ").append(StringUtil.toIndentedString(gameDuration)).append("\n");
    sb.append("    numberOfExerClass: ").append(StringUtil.toIndentedString(numberOfExerClass)).append("\n");
    sb.append("    numberOfExerGame: ").append(StringUtil.toIndentedString(numberOfExerGame)).append("\n");
    sb.append("    numberOfActiveLifestyleActivity: ").append(StringUtil.toIndentedString(numberOfActiveLifestyleActivity)).append("\n");
    sb.append("    hrrUpperThreshold: ").append(StringUtil.toIndentedString(hrrUpperThreshold)).append("\n");
    sb.append("    date: ").append(StringUtil.toIndentedString(date)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
