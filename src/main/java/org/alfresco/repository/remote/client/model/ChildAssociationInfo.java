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
 * ChildAssociationInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-20T09:14:31.122Z")
public class ChildAssociationInfo {
  @SerializedName("assocType")
  private String assocType = null;

  @SerializedName("isPrimary")
  private Boolean isPrimary = null;

  public ChildAssociationInfo assocType(String assocType) {
    this.assocType = assocType;
    return this;
  }

   /**
   * Get assocType
   * @return assocType
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAssocType() {
    return assocType;
  }

  public void setAssocType(String assocType) {
    this.assocType = assocType;
  }

  public ChildAssociationInfo isPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
    return this;
  }

   /**
   * Get isPrimary
   * @return isPrimary
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsPrimary() {
    return isPrimary;
  }

  public void setIsPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChildAssociationInfo childAssociationInfo = (ChildAssociationInfo) o;
    return Objects.equals(this.assocType, childAssociationInfo.assocType) &&
        Objects.equals(this.isPrimary, childAssociationInfo.isPrimary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assocType, isPrimary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChildAssociationInfo {\n");
    
    sb.append("    assocType: ").append(toIndentedString(assocType)).append("\n");
    sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
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

