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



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-03T12:32:06.758+01:00")
public class CardiacRehabilitationProgressActiveLifestylePASessionminutesInZoneSubSubSection   {
  
  private Integer zone050 = null;
  private Integer zone5160 = null;
  private Integer zone6170 = null;
  private Integer zone7180 = null;
  private Integer zone8190 = null;
  private Integer zone91100 = null;
  private Integer zone101 = null;

  
  /**
   * zone050
   **/
  @ApiModelProperty(value = "zone050")
  @JsonProperty("zone050")
  public Integer getZone050() {
    return zone050;
  }
  public void setZone050(Integer zone050) {
    this.zone050 = zone050;
  }

  
  /**
   * zone5160
   **/
  @ApiModelProperty(value = "zone5160")
  @JsonProperty("zone5160")
  public Integer getZone5160() {
    return zone5160;
  }
  public void setZone5160(Integer zone5160) {
    this.zone5160 = zone5160;
  }

  
  /**
   * zone6170
   **/
  @ApiModelProperty(value = "zone6170")
  @JsonProperty("zone6170")
  public Integer getZone6170() {
    return zone6170;
  }
  public void setZone6170(Integer zone6170) {
    this.zone6170 = zone6170;
  }

  
  /**
   * zone7180
   **/
  @ApiModelProperty(value = "zone7180")
  @JsonProperty("zone7180")
  public Integer getZone7180() {
    return zone7180;
  }
  public void setZone7180(Integer zone7180) {
    this.zone7180 = zone7180;
  }

  
  /**
   * zone8190
   **/
  @ApiModelProperty(value = "zone8190")
  @JsonProperty("zone8190")
  public Integer getZone8190() {
    return zone8190;
  }
  public void setZone8190(Integer zone8190) {
    this.zone8190 = zone8190;
  }

  
  /**
   * zone91100
   **/
  @ApiModelProperty(value = "zone91100")
  @JsonProperty("zone91100")
  public Integer getZone91100() {
    return zone91100;
  }
  public void setZone91100(Integer zone91100) {
    this.zone91100 = zone91100;
  }

  
  /**
   * zone101
   **/
  @ApiModelProperty(value = "zone101")
  @JsonProperty("zone101")
  public Integer getZone101() {
    return zone101;
  }
  public void setZone101(Integer zone101) {
    this.zone101 = zone101;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardiacRehabilitationProgressActiveLifestylePASessionminutesInZoneSubSubSection {\n");
    
    sb.append("    zone050: ").append(StringUtil.toIndentedString(zone050)).append("\n");
    sb.append("    zone5160: ").append(StringUtil.toIndentedString(zone5160)).append("\n");
    sb.append("    zone6170: ").append(StringUtil.toIndentedString(zone6170)).append("\n");
    sb.append("    zone7180: ").append(StringUtil.toIndentedString(zone7180)).append("\n");
    sb.append("    zone8190: ").append(StringUtil.toIndentedString(zone8190)).append("\n");
    sb.append("    zone91100: ").append(StringUtil.toIndentedString(zone91100)).append("\n");
    sb.append("    zone101: ").append(StringUtil.toIndentedString(zone101)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
