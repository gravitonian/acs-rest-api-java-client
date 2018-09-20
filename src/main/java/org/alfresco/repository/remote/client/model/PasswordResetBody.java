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
 * PasswordResetBody
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-20T09:14:31.122Z")
public class PasswordResetBody {
  @SerializedName("password")
  private String password = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("key")
  private String key = null;

  public PasswordResetBody password(String password) {
    this.password = password;
    return this;
  }

   /**
   * the new password
   * @return password
  **/
  @ApiModelProperty(required = true, value = "the new password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public PasswordResetBody id(String id) {
    this.id = id;
    return this;
  }

   /**
   * the workflow id provided in the reset password email
   * @return id
  **/
  @ApiModelProperty(required = true, value = "the workflow id provided in the reset password email")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PasswordResetBody key(String key) {
    this.key = key;
    return this;
  }

   /**
   * the workflow key provided in the reset password email
   * @return key
  **/
  @ApiModelProperty(required = true, value = "the workflow key provided in the reset password email")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasswordResetBody passwordResetBody = (PasswordResetBody) o;
    return Objects.equals(this.password, passwordResetBody.password) &&
        Objects.equals(this.id, passwordResetBody.id) &&
        Objects.equals(this.key, passwordResetBody.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, id, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordResetBody {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

