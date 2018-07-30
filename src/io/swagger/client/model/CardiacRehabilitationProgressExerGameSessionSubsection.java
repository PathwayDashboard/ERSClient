package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.CardiacRehabilitationProgressExerGameSessionexerciseRulesMappingSubSubSection;
import io.swagger.client.model.CardiacRehabilitationProgressExerGameSessionPreScreeningInfoSubSubsection;
import io.swagger.client.model.CardiacRehabilitationProgressExerGameSessionenergyExpenditureSubSubSection;
import io.swagger.client.model.CardiacRehabilitationProgressExerGameSessionExecutedExerciselinkedTrainingProfileSubSubsection;
import io.swagger.client.model.CardiacRehabilitationProgressExerGameSessionwarmingUpInfoSubSubsection;
import io.swagger.client.model.CardiacRehabilitationProgressExerGameSessioncoolDownInfoSubSubsection;
import java.util.*;
import io.swagger.client.model.CardiacRehabilitationProgressExerGameSessionExecutedExerciseSubSubsection;
import io.swagger.client.model.CardiacRehabilitationProgressExerGameSessionmainInfoSubSubsection;
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class CardiacRehabilitationProgressExerGameSessionSubsection   {
  
  private Integer id = null;
  private Integer score = null;
  private Date date = null;
  private Date startTime = null;
  private Date endTime = null;
  private Integer duration = null;
  private String hrFile = null;
  private Boolean acceptable = null;
  private Integer status = null;
  private Integer sessionSatisfactionLevel = null;
  private Integer rpe = null;
  private List<CardiacRehabilitationProgressExerGameSessionexerciseRulesMappingSubSubSection> exerciseRulesMappings = new ArrayList<CardiacRehabilitationProgressExerGameSessionexerciseRulesMappingSubSubSection>();
  private CardiacRehabilitationProgressExerGameSessionenergyExpenditureSubSubSection energyExpenditure = null;
  private CardiacRehabilitationProgressExerGameSessionwarmingUpInfoSubSubsection warmingUpInfo = null;
  private CardiacRehabilitationProgressExerGameSessionmainInfoSubSubsection mainInfo = null;
  private CardiacRehabilitationProgressExerGameSessioncoolDownInfoSubSubsection coolDownInfo = null;
  private CardiacRehabilitationProgressExerGameSessionPreScreeningInfoSubSubsection preScreeningInfo = null;
  private List<CardiacRehabilitationProgressExerGameSessionExecutedExerciseSubSubsection> executedExercises = new ArrayList<CardiacRehabilitationProgressExerGameSessionExecutedExerciseSubSubsection>();
  private CardiacRehabilitationProgressExerGameSessionExecutedExerciselinkedTrainingProfileSubSubsection linkedTrainingProfile = null;

  
  /**
   * id
   **/
  @ApiModelProperty(value = "id")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   * score
   **/
  @ApiModelProperty(value = "score")
  @JsonProperty("score")
  public Integer getScore() {
    return score;
  }
  public void setScore(Integer score) {
    this.score = score;
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
   * startTime
   **/
  @ApiModelProperty(value = "startTime")
  @JsonProperty("startTime")
  public Date getStartTime() {
    return startTime;
  }
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  
  /**
   * endTime
   **/
  @ApiModelProperty(value = "endTime")
  @JsonProperty("endTime")
  public Date getEndTime() {
    return endTime;
  }
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
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
   * hrFile
   **/
  @ApiModelProperty(value = "hrFile")
  @JsonProperty("hrFile")
  public String getHrFile() {
    return hrFile;
  }
  public void setHrFile(String hrFile) {
    this.hrFile = hrFile;
  }

  
  /**
   * acceptable
   **/
  @ApiModelProperty(value = "acceptable")
  @JsonProperty("acceptable")
  public Boolean getAcceptable() {
    return acceptable;
  }
  public void setAcceptable(Boolean acceptable) {
    this.acceptable = acceptable;
  }

  
  /**
   * status
   **/
  @ApiModelProperty(value = "status")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * sessionSatisfactionLevel
   **/
  @ApiModelProperty(value = "sessionSatisfactionLevel")
  @JsonProperty("sessionSatisfactionLevel")
  public Integer getSessionSatisfactionLevel() {
    return sessionSatisfactionLevel;
  }
  public void setSessionSatisfactionLevel(Integer sessionSatisfactionLevel) {
    this.sessionSatisfactionLevel = sessionSatisfactionLevel;
  }

  
  /**
   * rpe
   **/
  @ApiModelProperty(value = "rpe")
  @JsonProperty("rpe")
  public Integer getRpe() {
    return rpe;
  }
  public void setRpe(Integer rpe) {
    this.rpe = rpe;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("exerciseRulesMappings")
  public List<CardiacRehabilitationProgressExerGameSessionexerciseRulesMappingSubSubSection> getExerciseRulesMappings() {
    return exerciseRulesMappings;
  }
  public void setExerciseRulesMappings(List<CardiacRehabilitationProgressExerGameSessionexerciseRulesMappingSubSubSection> exerciseRulesMappings) {
    this.exerciseRulesMappings = exerciseRulesMappings;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("energyExpenditure")
  public CardiacRehabilitationProgressExerGameSessionenergyExpenditureSubSubSection getEnergyExpenditure() {
    return energyExpenditure;
  }
  public void setEnergyExpenditure(CardiacRehabilitationProgressExerGameSessionenergyExpenditureSubSubSection energyExpenditure) {
    this.energyExpenditure = energyExpenditure;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("warmingUpInfo")
  public CardiacRehabilitationProgressExerGameSessionwarmingUpInfoSubSubsection getWarmingUpInfo() {
    return warmingUpInfo;
  }
  public void setWarmingUpInfo(CardiacRehabilitationProgressExerGameSessionwarmingUpInfoSubSubsection warmingUpInfo) {
    this.warmingUpInfo = warmingUpInfo;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("mainInfo")
  public CardiacRehabilitationProgressExerGameSessionmainInfoSubSubsection getMainInfo() {
    return mainInfo;
  }
  public void setMainInfo(CardiacRehabilitationProgressExerGameSessionmainInfoSubSubsection mainInfo) {
    this.mainInfo = mainInfo;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("coolDownInfo")
  public CardiacRehabilitationProgressExerGameSessioncoolDownInfoSubSubsection getCoolDownInfo() {
    return coolDownInfo;
  }
  public void setCoolDownInfo(CardiacRehabilitationProgressExerGameSessioncoolDownInfoSubSubsection coolDownInfo) {
    this.coolDownInfo = coolDownInfo;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("preScreeningInfo")
  public CardiacRehabilitationProgressExerGameSessionPreScreeningInfoSubSubsection getPreScreeningInfo() {
    return preScreeningInfo;
  }
  public void setPreScreeningInfo(CardiacRehabilitationProgressExerGameSessionPreScreeningInfoSubSubsection preScreeningInfo) {
    this.preScreeningInfo = preScreeningInfo;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("executedExercises")
  public List<CardiacRehabilitationProgressExerGameSessionExecutedExerciseSubSubsection> getExecutedExercises() {
    return executedExercises;
  }
  public void setExecutedExercises(List<CardiacRehabilitationProgressExerGameSessionExecutedExerciseSubSubsection> executedExercises) {
    this.executedExercises = executedExercises;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("linkedTrainingProfile")
  public CardiacRehabilitationProgressExerGameSessionExecutedExerciselinkedTrainingProfileSubSubsection getLinkedTrainingProfile() {
    return linkedTrainingProfile;
  }
  public void setLinkedTrainingProfile(CardiacRehabilitationProgressExerGameSessionExecutedExerciselinkedTrainingProfileSubSubsection linkedTrainingProfile) {
    this.linkedTrainingProfile = linkedTrainingProfile;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardiacRehabilitationProgressExerGameSessionSubsection {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    score: ").append(StringUtil.toIndentedString(score)).append("\n");
    sb.append("    date: ").append(StringUtil.toIndentedString(date)).append("\n");
    sb.append("    startTime: ").append(StringUtil.toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(StringUtil.toIndentedString(endTime)).append("\n");
    sb.append("    duration: ").append(StringUtil.toIndentedString(duration)).append("\n");
    sb.append("    hrFile: ").append(StringUtil.toIndentedString(hrFile)).append("\n");
    sb.append("    acceptable: ").append(StringUtil.toIndentedString(acceptable)).append("\n");
    sb.append("    status: ").append(StringUtil.toIndentedString(status)).append("\n");
    sb.append("    sessionSatisfactionLevel: ").append(StringUtil.toIndentedString(sessionSatisfactionLevel)).append("\n");
    sb.append("    rpe: ").append(StringUtil.toIndentedString(rpe)).append("\n");
    sb.append("    exerciseRulesMappings: ").append(StringUtil.toIndentedString(exerciseRulesMappings)).append("\n");
    sb.append("    energyExpenditure: ").append(StringUtil.toIndentedString(energyExpenditure)).append("\n");
    sb.append("    warmingUpInfo: ").append(StringUtil.toIndentedString(warmingUpInfo)).append("\n");
    sb.append("    mainInfo: ").append(StringUtil.toIndentedString(mainInfo)).append("\n");
    sb.append("    coolDownInfo: ").append(StringUtil.toIndentedString(coolDownInfo)).append("\n");
    sb.append("    preScreeningInfo: ").append(StringUtil.toIndentedString(preScreeningInfo)).append("\n");
    sb.append("    executedExercises: ").append(StringUtil.toIndentedString(executedExercises)).append("\n");
    sb.append("    linkedTrainingProfile: ").append(StringUtil.toIndentedString(linkedTrainingProfile)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
