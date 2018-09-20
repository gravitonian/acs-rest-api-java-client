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
import org.alfresco.repository.remote.client.model.NodeChildAssociation;

/**
 * NodeChildAssociationEntry
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-20T09:14:31.122Z")
public class NodeChildAssociationEntry {
  @SerializedName("entry")
  private NodeChildAssociation entry = null;

  public NodeChildAssociationEntry entry(NodeChildAssociation entry) {
    this.entry = entry;
    return this;
  }

   /**
   * Get entry
   * @return entry
  **/
  @ApiModelProperty(required = true, value = "")
  public NodeChildAssociation getEntry() {
    return entry;
  }

  public void setEntry(NodeChildAssociation entry) {
    this.entry = entry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeChildAssociationEntry nodeChildAssociationEntry = (NodeChildAssociationEntry) o;
    return Objects.equals(this.entry, nodeChildAssociationEntry.entry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entry);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeChildAssociationEntry {\n");
    
    sb.append("    entry: ").append(toIndentedString(entry)).append("\n");
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

