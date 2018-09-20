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
 * RevertBody
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-20T09:14:31.122Z")
public class RevertBody {
  @SerializedName("majorVersion")
  private Boolean majorVersion = null;

  @SerializedName("comment")
  private String comment = null;

  public RevertBody majorVersion(Boolean majorVersion) {
    this.majorVersion = majorVersion;
    return this;
  }

   /**
   * Get majorVersion
   * @return majorVersion
  **/
  @ApiModelProperty(value = "")
  public Boolean isMajorVersion() {
    return majorVersion;
  }

  public void setMajorVersion(Boolean majorVersion) {
    this.majorVersion = majorVersion;
  }

  public RevertBody comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @ApiModelProperty(value = "")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevertBody revertBody = (RevertBody) o;
    return Objects.equals(this.majorVersion, revertBody.majorVersion) &&
        Objects.equals(this.comment, revertBody.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(majorVersion, comment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevertBody {\n");
    
    sb.append("    majorVersion: ").append(toIndentedString(majorVersion)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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

