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
import io.swagger.client.model.TargetAccuracyZoneSubSubsection;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class ExerClassExerciseDescriptionSubsection   {
  
  private Integer id = null;
  private Integer motionReferenceID = null;
  private List<Integer> type = new ArrayList<Integer>();
  private List<Integer> involvedBodyParts = new ArrayList<Integer>();
  private Integer difficulty = null;
  private Integer intensity = null;
  private List<Integer> possibleTrainingProfilePhases = new ArrayList<Integer>();
  private String exerciseExplanation = null;
  private String attentionPoints = null;
  private Boolean repetitionsAreExpected = null;
  private Integer category = null;
  private List<Integer> candidateGames = new ArrayList<Integer>();
  private TargetAccuracyZoneSubSubsection targetAccuracyZone = null;

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   * motion Reference ID
   **/
  @ApiModelProperty(value = "motion Reference ID")
  @JsonProperty("motionReferenceID")
  public Integer getMotionReferenceID() {
    return motionReferenceID;
  }
  public void setMotionReferenceID(Integer motionReferenceID) {
    this.motionReferenceID = motionReferenceID;
  }

  
  /**
   * type
   **/
  @ApiModelProperty(value = "type")
  @JsonProperty("type")
  public List<Integer> getType() {
    return type;
  }
  public void setType(List<Integer> type) {
    this.type = type;
  }

  
  /**
   * involved Body Parts
   **/
  @ApiModelProperty(value = "involved Body Parts")
  @JsonProperty("involvedBodyParts")
  public List<Integer> getInvolvedBodyParts() {
    return involvedBodyParts;
  }
  public void setInvolvedBodyParts(List<Integer> involvedBodyParts) {
    this.involvedBodyParts = involvedBodyParts;
  }

  
  /**
   * difficulty
   **/
  @ApiModelProperty(value = "difficulty")
  @JsonProperty("difficulty")
  public Integer getDifficulty() {
    return difficulty;
  }
  public void setDifficulty(Integer difficulty) {
    this.difficulty = difficulty;
  }

  
  /**
   * intensity
   **/
  @ApiModelProperty(value = "intensity")
  @JsonProperty("intensity")
  public Integer getIntensity() {
    return intensity;
  }
  public void setIntensity(Integer intensity) {
    this.intensity = intensity;
  }

  
  /**
   * possible Training Profile Phase
   **/
  @ApiModelProperty(value = "possible Training Profile Phase")
  @JsonProperty("possibleTrainingProfilePhases")
  public List<Integer> getPossibleTrainingProfilePhases() {
    return possibleTrainingProfilePhases;
  }
  public void setPossibleTrainingProfilePhases(List<Integer> possibleTrainingProfilePhases) {
    this.possibleTrainingProfilePhases = possibleTrainingProfilePhases;
  }

  
  /**
   * exercise Explanation
   **/
  @ApiModelProperty(value = "exercise Explanation")
  @JsonProperty("exerciseExplanation")
  public String getExerciseExplanation() {
    return exerciseExplanation;
  }
  public void setExerciseExplanation(String exerciseExplanation) {
    this.exerciseExplanation = exerciseExplanation;
  }

  
  /**
   * attention Points
   **/
  @ApiModelProperty(value = "attention Points")
  @JsonProperty("attentionPoints")
  public String getAttentionPoints() {
    return attentionPoints;
  }
  public void setAttentionPoints(String attentionPoints) {
    this.attentionPoints = attentionPoints;
  }

  
  /**
   * repetitions Are Expected
   **/
  @ApiModelProperty(value = "repetitions Are Expected")
  @JsonProperty("repetitionsAreExpected")
  public Boolean getRepetitionsAreExpected() {
    return repetitionsAreExpected;
  }
  public void setRepetitionsAreExpected(Boolean repetitionsAreExpected) {
    this.repetitionsAreExpected = repetitionsAreExpected;
  }

  
  /**
   * 
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("category")
  public Integer getCategory() {
    return category;
  }
  public void setCategory(Integer category) {
    this.category = category;
  }

  
  /**
   * candidateGames
   **/
  @ApiModelProperty(value = "candidateGames")
  @JsonProperty("candidateGames")
  public List<Integer> getCandidateGames() {
    return candidateGames;
  }
  public void setCandidateGames(List<Integer> candidateGames) {
    this.candidateGames = candidateGames;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("targetAccuracyZone")
  public TargetAccuracyZoneSubSubsection getTargetAccuracyZone() {
    return targetAccuracyZone;
  }
  public void setTargetAccuracyZone(TargetAccuracyZoneSubSubsection targetAccuracyZone) {
    this.targetAccuracyZone = targetAccuracyZone;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExerClassExerciseDescriptionSubsection {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    motionReferenceID: ").append(StringUtil.toIndentedString(motionReferenceID)).append("\n");
    sb.append("    type: ").append(StringUtil.toIndentedString(type)).append("\n");
    sb.append("    involvedBodyParts: ").append(StringUtil.toIndentedString(involvedBodyParts)).append("\n");
    sb.append("    difficulty: ").append(StringUtil.toIndentedString(difficulty)).append("\n");
    sb.append("    intensity: ").append(StringUtil.toIndentedString(intensity)).append("\n");
    sb.append("    possibleTrainingProfilePhases: ").append(StringUtil.toIndentedString(possibleTrainingProfilePhases)).append("\n");
    sb.append("    exerciseExplanation: ").append(StringUtil.toIndentedString(exerciseExplanation)).append("\n");
    sb.append("    attentionPoints: ").append(StringUtil.toIndentedString(attentionPoints)).append("\n");
    sb.append("    repetitionsAreExpected: ").append(StringUtil.toIndentedString(repetitionsAreExpected)).append("\n");
    sb.append("    category: ").append(StringUtil.toIndentedString(category)).append("\n");
    sb.append("    candidateGames: ").append(StringUtil.toIndentedString(candidateGames)).append("\n");
    sb.append("    targetAccuracyZone: ").append(StringUtil.toIndentedString(targetAccuracyZone)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
