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
import io.swagger.client.model.CardiacRehabilitationProgressHealthAndFitnessAssessmentSessionenergyExpenditureSubSubSection;
import java.util.*;
import io.swagger.client.model.CardiacRehabilitationProgressHealthAndFitnessAssessmentSessionHealthAndFitnessAssessmentPreScreeningInfoSubSubsection;
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class CardiacRehabilitationProgressHealthAndFitnessAssessmentSessionSubsection   {
  
  private Integer minute1HR = null;
  private Integer minute2HR = null;
  private Integer minute3HR = null;
  private Integer minute4HR = null;
  private List<String> symptoms = new ArrayList<String>();
  private Integer difficultyLevel = null;
  private Date date = null;
  private String hrFile = null;
  private CardiacRehabilitationProgressHealthAndFitnessAssessmentSessionHealthAndFitnessAssessmentPreScreeningInfoSubSubsection healthAndFitnessAssessmentPreScreeningInfo = null;
  private CardiacRehabilitationProgressHealthAndFitnessAssessmentSessionenergyExpenditureSubSubSection energyExpenditure = null;

  
  /**
   * minute1HR
   **/
  @ApiModelProperty(value = "minute1HR")
  @JsonProperty("minute1HR")
  public Integer getMinute1HR() {
    return minute1HR;
  }
  public void setMinute1HR(Integer minute1HR) {
    this.minute1HR = minute1HR;
  }

  
  /**
   * minute2HR
   **/
  @ApiModelProperty(value = "minute2HR")
  @JsonProperty("minute2HR")
  public Integer getMinute2HR() {
    return minute2HR;
  }
  public void setMinute2HR(Integer minute2HR) {
    this.minute2HR = minute2HR;
  }

  
  /**
   * minute3HR
   **/
  @ApiModelProperty(value = "minute3HR")
  @JsonProperty("minute3HR")
  public Integer getMinute3HR() {
    return minute3HR;
  }
  public void setMinute3HR(Integer minute3HR) {
    this.minute3HR = minute3HR;
  }

  
  /**
   * minute4HR
   **/
  @ApiModelProperty(value = "minute4HR")
  @JsonProperty("minute4HR")
  public Integer getMinute4HR() {
    return minute4HR;
  }
  public void setMinute4HR(Integer minute4HR) {
    this.minute4HR = minute4HR;
  }

  
  /**
   * symptoms
   **/
  @ApiModelProperty(value = "symptoms")
  @JsonProperty("symptoms")
  public List<String> getSymptoms() {
    return symptoms;
  }
  public void setSymptoms(List<String> symptoms) {
    this.symptoms = symptoms;
  }

  
  /**
   * difficultyLevel
   **/
  @ApiModelProperty(value = "difficultyLevel")
  @JsonProperty("difficultyLevel")
  public Integer getDifficultyLevel() {
    return difficultyLevel;
  }
  public void setDifficultyLevel(Integer difficultyLevel) {
    this.difficultyLevel = difficultyLevel;
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

  
  /**
   * file
   **/
  @ApiModelProperty(value = "file")
  @JsonProperty("hr_file")
  public String getHrFile() {
    return hrFile;
  }
  public void setHrFile(String hrFile) {
    this.hrFile = hrFile;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("healthAndFitnessAssessmentPreScreeningInfo")
  public CardiacRehabilitationProgressHealthAndFitnessAssessmentSessionHealthAndFitnessAssessmentPreScreeningInfoSubSubsection getHealthAndFitnessAssessmentPreScreeningInfo() {
    return healthAndFitnessAssessmentPreScreeningInfo;
  }
  public void setHealthAndFitnessAssessmentPreScreeningInfo(CardiacRehabilitationProgressHealthAndFitnessAssessmentSessionHealthAndFitnessAssessmentPreScreeningInfoSubSubsection healthAndFitnessAssessmentPreScreeningInfo) {
    this.healthAndFitnessAssessmentPreScreeningInfo = healthAndFitnessAssessmentPreScreeningInfo;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("energyExpenditure")
  public CardiacRehabilitationProgressHealthAndFitnessAssessmentSessionenergyExpenditureSubSubSection getEnergyExpenditure() {
    return energyExpenditure;
  }
  public void setEnergyExpenditure(CardiacRehabilitationProgressHealthAndFitnessAssessmentSessionenergyExpenditureSubSubSection energyExpenditure) {
    this.energyExpenditure = energyExpenditure;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardiacRehabilitationProgressHealthAndFitnessAssessmentSessionSubsection {\n");
    
    sb.append("    minute1HR: ").append(StringUtil.toIndentedString(minute1HR)).append("\n");
    sb.append("    minute2HR: ").append(StringUtil.toIndentedString(minute2HR)).append("\n");
    sb.append("    minute3HR: ").append(StringUtil.toIndentedString(minute3HR)).append("\n");
    sb.append("    minute4HR: ").append(StringUtil.toIndentedString(minute4HR)).append("\n");
    sb.append("    symptoms: ").append(StringUtil.toIndentedString(symptoms)).append("\n");
    sb.append("    difficultyLevel: ").append(StringUtil.toIndentedString(difficultyLevel)).append("\n");
    sb.append("    date: ").append(StringUtil.toIndentedString(date)).append("\n");
    sb.append("    hrFile: ").append(StringUtil.toIndentedString(hrFile)).append("\n");
    sb.append("    healthAndFitnessAssessmentPreScreeningInfo: ").append(StringUtil.toIndentedString(healthAndFitnessAssessmentPreScreeningInfo)).append("\n");
    sb.append("    energyExpenditure: ").append(StringUtil.toIndentedString(energyExpenditure)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
