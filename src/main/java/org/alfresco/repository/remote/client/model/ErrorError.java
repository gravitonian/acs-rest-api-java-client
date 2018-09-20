/*
 * Alfresco Content Services REST API
 * **Core API**  Provides access to the core features of Alfresco Content Services. 
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.alfresco.repository.remote.client.model;

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
 * ErrorError
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-20T09:14:31.122Z")
public class ErrorError {
  @SerializedName("errorKey")
  private String errorKey = null;

  @SerializedName("briefSummary")
  private String briefSummary = null;

  @SerializedName("descriptionURL")
  private String descriptionURL = null;

  @SerializedName("logId")
  private String logId = null;

  @SerializedName("stackTrace")
  private String stackTrace = null;

  @SerializedName("statusCode")
  private Integer statusCode = null;

  public ErrorError errorKey(String errorKey) {
    this.errorKey = errorKey;
    return this;
  }

   /**
   * Get errorKey
   * @return errorKey
  **/
  @ApiModelProperty(value = "")
  public String getErrorKey() {
    return errorKey;
  }

  public void setErrorKey(String errorKey) {
    this.errorKey = errorKey;
  }

  public ErrorError briefSummary(String briefSummary) {
    this.briefSummary = briefSummary;
    return this;
  }

   /**
   * Get briefSummary
   * @return briefSummary
  **/
  @ApiModelProperty(required = true, value = "")
  public String getBriefSummary() {
    return briefSummary;
  }

  public void setBriefSummary(String briefSummary) {
    this.briefSummary = briefSummary;
  }

  public ErrorError descriptionURL(String descriptionURL) {
    this.descriptionURL = descriptionURL;
    return this;
  }

   /**
   * Get descriptionURL
   * @return descriptionURL
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDescriptionURL() {
    return descriptionURL;
  }

  public void setDescriptionURL(String descriptionURL) {
    this.descriptionURL = descriptionURL;
  }

  public ErrorError logId(String logId) {
    this.logId = logId;
    return this;
  }

   /**
   * Get logId
   * @return logId
  **/
  @ApiModelProperty(value = "")
  public String getLogId() {
    return logId;
  }

  public void setLogId(String logId) {
    this.logId = logId;
  }

  public ErrorError stackTrace(String stackTrace) {
    this.stackTrace = stackTrace;
    return this;
  }

   /**
   * Get stackTrace
   * @return stackTrace
  **/
  @ApiModelProperty(required = true, value = "")
  public String getStackTrace() {
    return stackTrace;
  }

  public void setStackTrace(String stackTrace) {
    this.stackTrace = stackTrace;
  }

  public ErrorError statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorError errorError = (ErrorError) o;
    return Objects.equals(this.errorKey, errorError.errorKey) &&
        Objects.equals(this.briefSummary, errorError.briefSummary) &&
        Objects.equals(this.descriptionURL, errorError.descriptionURL) &&
        Objects.equals(this.logId, errorError.logId) &&
        Objects.equals(this.stackTrace, errorError.stackTrace) &&
        Objects.equals(this.statusCode, errorError.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorKey, briefSummary, descriptionURL, logId, stackTrace, statusCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorError {\n");
    
    sb.append("    errorKey: ").append(toIndentedString(errorKey)).append("\n");
    sb.append("    briefSummary: ").append(toIndentedString(briefSummary)).append("\n");
    sb.append("    descriptionURL: ").append(toIndentedString(descriptionURL)).append("\n");
    sb.append("    logId: ").append(toIndentedString(logId)).append("\n");
    sb.append("    stackTrace: ").append(toIndentedString(stackTrace)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

