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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.alfresco.repository.remote.client.model.AssociationBody;
import org.alfresco.repository.remote.client.model.ChildAssociationBody;
import org.alfresco.repository.remote.client.model.NodeBodyCreateAssociation;

/**
 * NodeBodyCreate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-20T09:14:31.122Z")
public class NodeBodyCreate {
  @SerializedName("name")
  private String name = null;

  @SerializedName("nodeType")
  private String nodeType = null;

  @SerializedName("aspectNames")
  private List<String> aspectNames = null;

  @SerializedName("properties")
  private Map<String, String> properties = null;

  @SerializedName("relativePath")
  private String relativePath = null;

  @SerializedName("association")
  private NodeBodyCreateAssociation association = null;

  @SerializedName("secondaryChildren")
  private List<ChildAssociationBody> secondaryChildren = null;

  @SerializedName("targets")
  private List<AssociationBody> targets = null;

  public NodeBodyCreate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name must not contain spaces or the following special characters: * \&quot; &lt; &gt; \\ / ? : and |. The character . must not be used at the end of the name. 
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name must not contain spaces or the following special characters: * \" < > \\ / ? : and |. The character . must not be used at the end of the name. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NodeBodyCreate nodeType(String nodeType) {
    this.nodeType = nodeType;
    return this;
  }

   /**
   * Get nodeType
   * @return nodeType
  **/
  @ApiModelProperty(required = true, value = "")
  public String getNodeType() {
    return nodeType;
  }

  public void setNodeType(String nodeType) {
    this.nodeType = nodeType;
  }

  public NodeBodyCreate aspectNames(List<String> aspectNames) {
    this.aspectNames = aspectNames;
    return this;
  }

  public NodeBodyCreate addAspectNamesItem(String aspectNamesItem) {
    if (this.aspectNames == null) {
      this.aspectNames = new ArrayList<String>();
    }
    this.aspectNames.add(aspectNamesItem);
    return this;
  }

   /**
   * Get aspectNames
   * @return aspectNames
  **/
  @ApiModelProperty(value = "")
  public List<String> getAspectNames() {
    return aspectNames;
  }

  public void setAspectNames(List<String> aspectNames) {
    this.aspectNames = aspectNames;
  }

  public NodeBodyCreate properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public NodeBodyCreate putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<String, String>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  public NodeBodyCreate relativePath(String relativePath) {
    this.relativePath = relativePath;
    return this;
  }

   /**
   * Get relativePath
   * @return relativePath
  **/
  @ApiModelProperty(value = "")
  public String getRelativePath() {
    return relativePath;
  }

  public void setRelativePath(String relativePath) {
    this.relativePath = relativePath;
  }

  public NodeBodyCreate association(NodeBodyCreateAssociation association) {
    this.association = association;
    return this;
  }

   /**
   * Get association
   * @return association
  **/
  @ApiModelProperty(value = "")
  public NodeBodyCreateAssociation getAssociation() {
    return association;
  }

  public void setAssociation(NodeBodyCreateAssociation association) {
    this.association = association;
  }

  public NodeBodyCreate secondaryChildren(List<ChildAssociationBody> secondaryChildren) {
    this.secondaryChildren = secondaryChildren;
    return this;
  }

  public NodeBodyCreate addSecondaryChildrenItem(ChildAssociationBody secondaryChildrenItem) {
    if (this.secondaryChildren == null) {
      this.secondaryChildren = new ArrayList<ChildAssociationBody>();
    }
    this.secondaryChildren.add(secondaryChildrenItem);
    return this;
  }

   /**
   * Get secondaryChildren
   * @return secondaryChildren
  **/
  @ApiModelProperty(value = "")
  public List<ChildAssociationBody> getSecondaryChildren() {
    return secondaryChildren;
  }

  public void setSecondaryChildren(List<ChildAssociationBody> secondaryChildren) {
    this.secondaryChildren = secondaryChildren;
  }

  public NodeBodyCreate targets(List<AssociationBody> targets) {
    this.targets = targets;
    return this;
  }

  public NodeBodyCreate addTargetsItem(AssociationBody targetsItem) {
    if (this.targets == null) {
      this.targets = new ArrayList<AssociationBody>();
    }
    this.targets.add(targetsItem);
    return this;
  }

   /**
   * Get targets
   * @return targets
  **/
  @ApiModelProperty(value = "")
  public List<AssociationBody> getTargets() {
    return targets;
  }

  public void setTargets(List<AssociationBody> targets) {
    this.targets = targets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeBodyCreate nodeBodyCreate = (NodeBodyCreate) o;
    return Objects.equals(this.name, nodeBodyCreate.name) &&
        Objects.equals(this.nodeType, nodeBodyCreate.nodeType) &&
        Objects.equals(this.aspectNames, nodeBodyCreate.aspectNames) &&
        Objects.equals(this.properties, nodeBodyCreate.properties) &&
        Objects.equals(this.relativePath, nodeBodyCreate.relativePath) &&
        Objects.equals(this.association, nodeBodyCreate.association) &&
        Objects.equals(this.secondaryChildren, nodeBodyCreate.secondaryChildren) &&
        Objects.equals(this.targets, nodeBodyCreate.targets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, nodeType, aspectNames, properties, relativePath, association, secondaryChildren, targets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeBodyCreate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    aspectNames: ").append(toIndentedString(aspectNames)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    relativePath: ").append(toIndentedString(relativePath)).append("\n");
    sb.append("    association: ").append(toIndentedString(association)).append("\n");
    sb.append("    secondaryChildren: ").append(toIndentedString(secondaryChildren)).append("\n");
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
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

