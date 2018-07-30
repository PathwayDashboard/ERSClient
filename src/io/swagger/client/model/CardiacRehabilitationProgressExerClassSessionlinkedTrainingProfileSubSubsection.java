package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.CardiacRehabilitationProgressExerClassSessionlinkedTrainingProfilemainHRZonehrZoneSubSubSubsection;
import io.swagger.client.model.CardiacRehabilitationProgressExerClassSessionlinkedTrainingProfilewarmingUpHRZonehrZoneSubSubSubsection;
import io.swagger.client.model.CardiacRehabilitationProgressExerClassSessionlinkedTrainingProfilecoolDownHRZonehrZoneSubSubSubsection;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class CardiacRehabilitationProgressExerClassSessionlinkedTrainingProfileSubSubsection   {
  
  private Integer warmingUpDuration = null;
  private Integer mainDuration = null;
  private Integer coolDownDuration = null;
  private CardiacRehabilitationProgressExerClassSessionlinkedTrainingProfilewarmingUpHRZonehrZoneSubSubSubsection warmingUpHRZone = null;
  private CardiacRehabilitationProgressExerClassSessionlinkedTrainingProfilemainHRZonehrZoneSubSubSubsection mainHRZone = null;
  private CardiacRehabilitationProgressExerClassSessionlinkedTrainingProfilecoolDownHRZonehrZoneSubSubSubsection coolDownHRZone = null;

  
  /**
   * warmingUpDuration
   **/
  @ApiModelProperty(value = "warmingUpDuration")
  @JsonProperty("warmingUpDuration")
  public Integer getWarmingUpDuration() {
    return warmingUpDuration;
  }
  public void setWarmingUpDuration(Integer warmingUpDuration) {
    this.warmingUpDuration = warmingUpDuration;
  }

  
  /**
   * mainDuration
   **/
  @ApiModelProperty(value = "mainDuration")
  @JsonProperty("mainDuration")
  public Integer getMainDuration() {
    return mainDuration;
  }
  public void setMainDuration(Integer mainDuration) {
    this.mainDuration = mainDuration;
  }

  
  /**
   * coolDownDuration
   **/
  @ApiModelProperty(value = "coolDownDuration")
  @JsonProperty("coolDownDuration")
  public Integer getCoolDownDuration() {
    return coolDownDuration;
  }
  public void setCoolDownDuration(Integer coolDownDuration) {
    this.coolDownDuration = coolDownDuration;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("warmingUpHRZone")
  public CardiacRehabilitationProgressExerClassSessionlinkedTrainingProfilewarmingUpHRZonehrZoneSubSubSubsection getWarmingUpHRZone() {
    return warmingUpHRZone;
  }
  public void setWarmingUpHRZone(CardiacRehabilitationProgressExerClassSessionlinkedTrainingProfilewarmingUpHRZonehrZoneSubSubSubsection warmingUpHRZone) {
    this.warmingUpHRZone = warmingUpHRZone;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("mainHRZone")
  public CardiacRehabilitationProgressExerClassSessionlinkedTrainingProfilemainHRZonehrZoneSubSubSubsection getMainHRZone() {
    return mainHRZone;
  }
  public void setMainHRZone(CardiacRehabilitationProgressExerClassSessionlinkedTrainingProfilemainHRZonehrZoneSubSubSubsection mainHRZone) {
    this.mainHRZone = mainHRZone;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("coolDownHRZone")
  public CardiacRehabilitationProgressExerClassSessionlinkedTrainingProfilecoolDownHRZonehrZoneSubSubSubsection getCoolDownHRZone() {
    return coolDownHRZone;
  }
  public void setCoolDownHRZone(CardiacRehabilitationProgressExerClassSessionlinkedTrainingProfilecoolDownHRZonehrZoneSubSubSubsection coolDownHRZone) {
    this.coolDownHRZone = coolDownHRZone;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardiacRehabilitationProgressExerClassSessionlinkedTrainingProfileSubSubsection {\n");
    
    sb.append("    warmingUpDuration: ").append(StringUtil.toIndentedString(warmingUpDuration)).append("\n");
    sb.append("    mainDuration: ").append(StringUtil.toIndentedString(mainDuration)).append("\n");
    sb.append("    coolDownDuration: ").append(StringUtil.toIndentedString(coolDownDuration)).append("\n");
    sb.append("    warmingUpHRZone: ").append(StringUtil.toIndentedString(warmingUpHRZone)).append("\n");
    sb.append("    mainHRZone: ").append(StringUtil.toIndentedString(mainHRZone)).append("\n");
    sb.append("    coolDownHRZone: ").append(StringUtil.toIndentedString(coolDownHRZone)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
