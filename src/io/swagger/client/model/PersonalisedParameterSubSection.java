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
import io.swagger.client.model.PersonalisedParameterPersonalisedIntensitySubSubsection;
import io.swagger.client.model.PersonalisedParameterPersonalisedDifficultySubSubsection;
import io.swagger.client.model.PersonalisedParameterExclusionIndicationSubSubsection;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class PersonalisedParameterSubSection   {
  
  private Integer exerclassExerciseDescriptionID = null;
  private PersonalisedParameterPersonalisedIntensitySubSubsection personalisedIntensity = null;
  private PersonalisedParameterPersonalisedDifficultySubSubsection personalisedDifficulty = null;
  private PersonalisedParameterExclusionIndicationSubSubsection exclusionIndication = null;

  
  /**
   * exerclassExerciseDescriptionID
   **/
  @ApiModelProperty(value = "exerclassExerciseDescriptionID")
  @JsonProperty("exerclassExerciseDescriptionID")
  public Integer getExerclassExerciseDescriptionID() {
    return exerclassExerciseDescriptionID;
  }
  public void setExerclassExerciseDescriptionID(Integer exerclassExerciseDescriptionID) {
    this.exerclassExerciseDescriptionID = exerclassExerciseDescriptionID;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("personalisedIntensity")
  public PersonalisedParameterPersonalisedIntensitySubSubsection getPersonalisedIntensity() {
    return personalisedIntensity;
  }
  public void setPersonalisedIntensity(PersonalisedParameterPersonalisedIntensitySubSubsection personalisedIntensity) {
    this.personalisedIntensity = personalisedIntensity;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("personalisedDifficulty")
  public PersonalisedParameterPersonalisedDifficultySubSubsection getPersonalisedDifficulty() {
    return personalisedDifficulty;
  }
  public void setPersonalisedDifficulty(PersonalisedParameterPersonalisedDifficultySubSubsection personalisedDifficulty) {
    this.personalisedDifficulty = personalisedDifficulty;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("exclusionIndication")
  public PersonalisedParameterExclusionIndicationSubSubsection getExclusionIndication() {
    return exclusionIndication;
  }
  public void setExclusionIndication(PersonalisedParameterExclusionIndicationSubSubsection exclusionIndication) {
    this.exclusionIndication = exclusionIndication;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalisedParameterSubSection {\n");
    
    sb.append("    exerclassExerciseDescriptionID: ").append(StringUtil.toIndentedString(exerclassExerciseDescriptionID)).append("\n");
    sb.append("    personalisedIntensity: ").append(StringUtil.toIndentedString(personalisedIntensity)).append("\n");
    sb.append("    personalisedDifficulty: ").append(StringUtil.toIndentedString(personalisedDifficulty)).append("\n");
    sb.append("    exclusionIndication: ").append(StringUtil.toIndentedString(exclusionIndication)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
