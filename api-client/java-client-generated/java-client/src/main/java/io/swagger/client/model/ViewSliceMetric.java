/*
 * Huawei Network Slice Management NBI
 * Author: Kevin McDonnell kwx420965
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ViewSliceMetric
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-16T14:45:21.709Z")
public class ViewSliceMetric {
  @SerializedName("value")
  private String value = null;

  @SerializedName("time")
  private Integer time = null;

  public ViewSliceMetric value(String value) {
    this.value = value;
    return this;
  }

   /**
   * 
   * @return value
  **/
  @ApiModelProperty(example = "45", required = true, value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public ViewSliceMetric time(Integer time) {
    this.time = time;
    return this;
  }

   /**
   * 
   * @return time
  **/
  @ApiModelProperty(example = "215415155", required = true, value = "")
  public Integer getTime() {
    return time;
  }

  public void setTime(Integer time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewSliceMetric viewSliceMetric = (ViewSliceMetric) o;
    return Objects.equals(this.value, viewSliceMetric.value) &&
        Objects.equals(this.time, viewSliceMetric.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, time);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewSliceMetric {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

