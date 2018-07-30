package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.util.*;
import io.swagger.client.model.CardiacRehabilitationProgrammeExerciseProgrammeSubSection;
import java.util.Date;
import io.swagger.client.model.CardiacRehabilitationProgrammeFitnessAssessmentConfSubSection;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class CardiacRehabilitationProgrammeSection   {
  
  private Date creationDate = null;
  private List<Integer> mandatorySensors = new ArrayList<Integer>();
  private CardiacRehabilitationProgrammeFitnessAssessmentConfSubSection fitnessAssessmentConf = null;
  private List<CardiacRehabilitationProgrammeExerciseProgrammeSubSection> exerciseProgrammes = new ArrayList<CardiacRehabilitationProgrammeExerciseProgrammeSubSection>();

  
  /**
   * creationDate
   **/
  @ApiModelProperty(value = "creationDate")
  @JsonProperty("creationDate")
  public Date getCreationDate() {
    return creationDate;
  }
  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  
  /**
   * mandatorySensors
   **/
  @ApiModelProperty(value = "mandatorySensors")
  @JsonProperty("mandatorySensors")
  public List<Integer> getMandatorySensors() {
    return mandatorySensors;
  }
  public void setMandatorySensors(List<Integer> mandatorySensors) {
    this.mandatorySensors = mandatorySensors;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("fitnessAssessmentConf")
  public CardiacRehabilitationProgrammeFitnessAssessmentConfSubSection getFitnessAssessmentConf() {
    return fitnessAssessmentConf;
  }
  public void setFitnessAssessmentConf(CardiacRehabilitationProgrammeFitnessAssessmentConfSubSection fitnessAssessmentConf) {
    this.fitnessAssessmentConf = fitnessAssessmentConf;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("exerciseProgrammes")
  public List<CardiacRehabilitationProgrammeExerciseProgrammeSubSection> getExerciseProgrammes() {
    return exerciseProgrammes;
  }
  public void setExerciseProgrammes(List<CardiacRehabilitationProgrammeExerciseProgrammeSubSection> exerciseProgrammes) {
    this.exerciseProgrammes = exerciseProgrammes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardiacRehabilitationProgrammeSection {\n");
    
    sb.append("    creationDate: ").append(StringUtil.toIndentedString(creationDate)).append("\n");
    sb.append("    mandatorySensors: ").append(StringUtil.toIndentedString(mandatorySensors)).append("\n");
    sb.append("    fitnessAssessmentConf: ").append(StringUtil.toIndentedString(fitnessAssessmentConf)).append("\n");
    sb.append("    exerciseProgrammes: ").append(StringUtil.toIndentedString(exerciseProgrammes)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
