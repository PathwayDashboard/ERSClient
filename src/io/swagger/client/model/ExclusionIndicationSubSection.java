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
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-09-14T09:51:50.944+02:00")
public class ExclusionIndicationSubSection   {
  
  private Integer exerclassExerciseDescriptionID = null;
  private Boolean value = null;
  private Date dateOfFirstExclusion = null;

  
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
   * Value
   **/
  @ApiModelProperty(value = "Value")
  @JsonProperty("value")
  public Boolean getValue() {
    return value;
  }
  public void setValue(Boolean value) {
    this.value = value;
  }

  
  /**
   * dateOfFirstExclusion
   **/
  @ApiModelProperty(value = "dateOfFirstExclusion")
  @JsonProperty("dateOfFirstExclusion")
  public Date getDateOfFirstExclusion() {
    return dateOfFirstExclusion;
  }
  public void setDateOfFirstExclusion(Date dateOfFirstExclusion) {
    this.dateOfFirstExclusion = dateOfFirstExclusion;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExclusionIndicationSubSection {\n");
    
    sb.append("    exerclassExerciseDescriptionID: ").append(StringUtil.toIndentedString(exerclassExerciseDescriptionID)).append("\n");
    sb.append("    value: ").append(StringUtil.toIndentedString(value)).append("\n");
    sb.append("    dateOfFirstExclusion: ").append(StringUtil.toIndentedString(dateOfFirstExclusion)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
