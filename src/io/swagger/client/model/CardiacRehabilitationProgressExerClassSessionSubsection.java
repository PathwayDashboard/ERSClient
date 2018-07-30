package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.CardiacRehabilitationProgressExerClassSessionlinkedTrainingProfileSubSubsection;
import io.swagger.client.model.CardiacRehabilitationProgressExerClassSessionPreScreeningInfoSubSubsection;
import io.swagger.client.model.CardiacRehabilitationProgressExerClassSessionExecutedExerciseSubSubsection;
import io.swagger.client.model.CardiacRehabilitationProgressExerClassSessionmainInfoSubSubsection;
import java.util.*;
import io.swagger.client.model.CardiacRehabilitationProgressExerClassSessionexerciseRulesMappingSubSubSection;
import io.swagger.client.model.CardiacRehabilitationProgressExerClassSessionenergyExpenditureSubSubSection;
import io.swagger.client.model.CardiacRehabilitationProgressExerClassSessionwarmingUpInfoSubSubsection;
import java.util.Date;
import io.swagger.client.model.CardiacRehabilitationProgressExerClassSessioncoolDownInfoSubSubsection;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class CardiacRehabilitationProgressExerClassSessionSubsection   {
  
  private Integer id = null;
  private Date date = null;
  private Date startTime = null;
  private Date endTime = null;
  private Integer duration = null;
  private String hrFile = null;
  private Boolean acceptable = null;
  private Integer status = null;
  private Integer sessionSatisfactionLevel = null;
  private Integer rpe = null;
  private List<CardiacRehabilitationProgressExerClassSessionexerciseRulesMappingSubSubSection> exerciseRulesMappings = new ArrayList<CardiacRehabilitationProgressExerClassSessionexerciseRulesMappingSubSubSection>();
  private CardiacRehabilitationProgressExerClassSessionenergyExpenditureSubSubSection energyExpenditure = null;
  private CardiacRehabilitationProgressExerClassSessionwarmingUpInfoSubSubsection warmingUpInfo = null;
  private CardiacRehabilitationProgressExerClassSessionmainInfoSubSubsection mainInfo = null;
  private CardiacRehabilitationProgressExerClassSessioncoolDownInfoSubSubsection coolDownInfo = null;
  private CardiacRehabilitationProgressExerClassSessionPreScreeningInfoSubSubsection preScreeningInfo = null;
  private List<CardiacRehabilitationProgressExerClassSessionExecutedExerciseSubSubsection> executedExercises = new ArrayList<CardiacRehabilitationProgressExerClassSessionExecutedExerciseSubSubsection>();
  private CardiacRehabilitationProgressExerClassSessionlinkedTrainingProfileSubSubsection linkedTrainingProfile = null;

  
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
  public List<CardiacRehabilitationProgressExerClassSessionexerciseRulesMappingSubSubSection> getExerciseRulesMappings() {
    return exerciseRulesMappings;
  }
  public void setExerciseRulesMappings(List<CardiacRehabilitationProgressExerClassSessionexerciseRulesMappingSubSubSection> exerciseRulesMappings) {
    this.exerciseRulesMappings = exerciseRulesMappings;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("energyExpenditure")
  public CardiacRehabilitationProgressExerClassSessionenergyExpenditureSubSubSection getEnergyExpenditure() {
    return energyExpenditure;
  }
  public void setEnergyExpenditure(CardiacRehabilitationProgressExerClassSessionenergyExpenditureSubSubSection energyExpenditure) {
    this.energyExpenditure = energyExpenditure;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("warmingUpInfo")
  public CardiacRehabilitationProgressExerClassSessionwarmingUpInfoSubSubsection getWarmingUpInfo() {
    return warmingUpInfo;
  }
  public void setWarmingUpInfo(CardiacRehabilitationProgressExerClassSessionwarmingUpInfoSubSubsection warmingUpInfo) {
    this.warmingUpInfo = warmingUpInfo;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("mainInfo")
  public CardiacRehabilitationProgressExerClassSessionmainInfoSubSubsection getMainInfo() {
    return mainInfo;
  }
  public void setMainInfo(CardiacRehabilitationProgressExerClassSessionmainInfoSubSubsection mainInfo) {
    this.mainInfo = mainInfo;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("coolDownInfo")
  public CardiacRehabilitationProgressExerClassSessioncoolDownInfoSubSubsection getCoolDownInfo() {
    return coolDownInfo;
  }
  public void setCoolDownInfo(CardiacRehabilitationProgressExerClassSessioncoolDownInfoSubSubsection coolDownInfo) {
    this.coolDownInfo = coolDownInfo;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("preScreeningInfo")
  public CardiacRehabilitationProgressExerClassSessionPreScreeningInfoSubSubsection getPreScreeningInfo() {
    return preScreeningInfo;
  }
  public void setPreScreeningInfo(CardiacRehabilitationProgressExerClassSessionPreScreeningInfoSubSubsection preScreeningInfo) {
    this.preScreeningInfo = preScreeningInfo;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("executedExercises")
  public List<CardiacRehabilitationProgressExerClassSessionExecutedExerciseSubSubsection> getExecutedExercises() {
    return executedExercises;
  }
  public void setExecutedExercises(List<CardiacRehabilitationProgressExerClassSessionExecutedExerciseSubSubsection> executedExercises) {
    this.executedExercises = executedExercises;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("linkedTrainingProfile")
  public CardiacRehabilitationProgressExerClassSessionlinkedTrainingProfileSubSubsection getLinkedTrainingProfile() {
    return linkedTrainingProfile;
  }
  public void setLinkedTrainingProfile(CardiacRehabilitationProgressExerClassSessionlinkedTrainingProfileSubSubsection linkedTrainingProfile) {
    this.linkedTrainingProfile = linkedTrainingProfile;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardiacRehabilitationProgressExerClassSessionSubsection {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
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
