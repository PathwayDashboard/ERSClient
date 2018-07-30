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
import io.swagger.client.model.CardiacRehabilitationProgressExerGameSessionExecutedExercisehrRangeSubSubSubsection;
import io.swagger.client.model.CardiacRehabilitationProgressExerGameSessionExecutedExerciseenjoymentLevelSubSubSubsection;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class CardiacRehabilitationProgressExerGameSessionExecutedExerciseSubSubsection   {
  
  private Double achievedAccuracy = null;
  private Integer exerciseDescriptionID = null;
  private Double averageHRBpm = null;
  private Integer duration = null;
  private Integer relatedGame = null;
  private CardiacRehabilitationProgressExerGameSessionExecutedExerciseenjoymentLevelSubSubSubsection enjoymentLevel = null;
  private CardiacRehabilitationProgressExerGameSessionExecutedExercisehrRangeSubSubSubsection hrRange = null;

  
  /**
   * achievedAccuracy
   **/
  @ApiModelProperty(value = "achievedAccuracy")
  @JsonProperty("achievedAccuracy")
  public Double getAchievedAccuracy() {
    return achievedAccuracy;
  }
  public void setAchievedAccuracy(Double achievedAccuracy) {
    this.achievedAccuracy = achievedAccuracy;
  }

  
  /**
   * exerciseDescriptionID
   **/
  @ApiModelProperty(value = "exerciseDescriptionID")
  @JsonProperty("exerciseDescriptionID")
  public Integer getExerciseDescriptionID() {
    return exerciseDescriptionID;
  }
  public void setExerciseDescriptionID(Integer exerciseDescriptionID) {
    this.exerciseDescriptionID = exerciseDescriptionID;
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
   * duration
   **/
  @ApiModelProperty(value = "duration")
  @JsonProperty("duration")
  public Integer getDuration() {
    return duration;
  }
  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  
  /**
   * relatedGame
   **/
  @ApiModelProperty(value = "relatedGame")
  @JsonProperty("relatedGame")
  public Integer getRelatedGame() {
    return relatedGame;
  }
  public void setRelatedGame(Integer relatedGame) {
    this.relatedGame = relatedGame;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("enjoymentLevel")
  public CardiacRehabilitationProgressExerGameSessionExecutedExerciseenjoymentLevelSubSubSubsection getEnjoymentLevel() {
    return enjoymentLevel;
  }
  public void setEnjoymentLevel(CardiacRehabilitationProgressExerGameSessionExecutedExerciseenjoymentLevelSubSubSubsection enjoymentLevel) {
    this.enjoymentLevel = enjoymentLevel;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("hrRange")
  public CardiacRehabilitationProgressExerGameSessionExecutedExercisehrRangeSubSubSubsection getHrRange() {
    return hrRange;
  }
  public void setHrRange(CardiacRehabilitationProgressExerGameSessionExecutedExercisehrRangeSubSubSubsection hrRange) {
    this.hrRange = hrRange;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardiacRehabilitationProgressExerGameSessionExecutedExerciseSubSubsection {\n");
    
    sb.append("    achievedAccuracy: ").append(StringUtil.toIndentedString(achievedAccuracy)).append("\n");
    sb.append("    exerciseDescriptionID: ").append(StringUtil.toIndentedString(exerciseDescriptionID)).append("\n");
    sb.append("    averageHRBpm: ").append(StringUtil.toIndentedString(averageHRBpm)).append("\n");
    sb.append("    duration: ").append(StringUtil.toIndentedString(duration)).append("\n");
    sb.append("    relatedGame: ").append(StringUtil.toIndentedString(relatedGame)).append("\n");
    sb.append("    enjoymentLevel: ").append(StringUtil.toIndentedString(enjoymentLevel)).append("\n");
    sb.append("    hrRange: ").append(StringUtil.toIndentedString(hrRange)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
