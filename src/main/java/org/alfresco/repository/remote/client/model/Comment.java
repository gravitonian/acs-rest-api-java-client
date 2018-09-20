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
import org.alfresco.repository.remote.client.model.Person;
import org.threeten.bp.OffsetDateTime;

/**
 * Comment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-20T09:14:31.122Z")
public class Comment {
  @SerializedName("id")
  private String id = null;

  @SerializedName("content")
  private String content = null;

  @SerializedName("createdBy")
  private Person createdBy = null;

  @SerializedName("createdAt")
  private OffsetDateTime createdAt = null;

  @SerializedName("edited")
  private Boolean edited = null;

  @SerializedName("modifiedBy")
  private Person modifiedBy = null;

  @SerializedName("modifiedAt")
  private OffsetDateTime modifiedAt = null;

  @SerializedName("canEdit")
  private Boolean canEdit = null;

  @SerializedName("canDelete")
  private Boolean canDelete = null;

  public Comment id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Comment content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(required = true, value = "")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Comment createdBy(Person createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(required = true, value = "")
  public Person getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Person createdBy) {
    this.createdBy = createdBy;
  }

  public Comment createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Comment edited(Boolean edited) {
    this.edited = edited;
    return this;
  }

   /**
   * Get edited
   * @return edited
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isEdited() {
    return edited;
  }

  public void setEdited(Boolean edited) {
    this.edited = edited;
  }

  public Comment modifiedBy(Person modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

   /**
   * Get modifiedBy
   * @return modifiedBy
  **/
  @ApiModelProperty(required = true, value = "")
  public Person getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(Person modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public Comment modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

   /**
   * Get modifiedAt
   * @return modifiedAt
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public Comment canEdit(Boolean canEdit) {
    this.canEdit = canEdit;
    return this;
  }

   /**
   * Get canEdit
   * @return canEdit
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isCanEdit() {
    return canEdit;
  }

  public void setCanEdit(Boolean canEdit) {
    this.canEdit = canEdit;
  }

  public Comment canDelete(Boolean canDelete) {
    this.canDelete = canDelete;
    return this;
  }

   /**
   * Get canDelete
   * @return canDelete
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isCanDelete() {
    return canDelete;
  }

  public void setCanDelete(Boolean canDelete) {
    this.canDelete = canDelete;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Comment comment = (Comment) o;
    return Objects.equals(this.id, comment.id) &&
        Objects.equals(this.content, comment.content) &&
        Objects.equals(this.createdBy, comment.createdBy) &&
        Objects.equals(this.createdAt, comment.createdAt) &&
        Objects.equals(this.edited, comment.edited) &&
        Objects.equals(this.modifiedBy, comment.modifiedBy) &&
        Objects.equals(this.modifiedAt, comment.modifiedAt) &&
        Objects.equals(this.canEdit, comment.canEdit) &&
        Objects.equals(this.canDelete, comment.canDelete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, content, createdBy, createdAt, edited, modifiedBy, modifiedAt, canEdit, canDelete);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Comment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    edited: ").append(toIndentedString(edited)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    canEdit: ").append(toIndentedString(canEdit)).append("\n");
    sb.append("    canDelete: ").append(toIndentedString(canDelete)).append("\n");
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
