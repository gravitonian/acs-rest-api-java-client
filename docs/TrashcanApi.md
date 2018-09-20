# TrashcanApi

All URIs are relative to *https://localhost/alfresco/api/-default-/public/alfresco/versions/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteDeletedNode**](TrashcanApi.md#deleteDeletedNode) | **DELETE** /deleted-nodes/{nodeId} | Permanently delete a deleted node
[**getDeletedNode**](TrashcanApi.md#getDeletedNode) | **GET** /deleted-nodes/{nodeId} | Get a deleted node
[**listDeletedNodes**](TrashcanApi.md#listDeletedNodes) | **GET** /deleted-nodes | List deleted nodes
[**restoreDeletedNode**](TrashcanApi.md#restoreDeletedNode) | **POST** /deleted-nodes/{nodeId}/restore | Restore a deleted node


<a name="deleteDeletedNode"></a>
# **deleteDeletedNode**
> deleteDeletedNode(nodeId)

Permanently delete a deleted node

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Permanently deletes the deleted node **nodeId**. 

### Example
```java
// Import classes:
//import org.alfresco.repository.remote.client.ApiException;
//import org.alfresco.repository.remote.client.api.TrashcanApi;


TrashcanApi apiInstance = new TrashcanApi();
String nodeId = "nodeId_example"; // String | The identifier of a node.
try {
    apiInstance.deleteDeletedNode(nodeId);
} catch (ApiException e) {
    System.err.println("Exception when calling TrashcanApi#deleteDeletedNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDeletedNode"></a>
# **getDeletedNode**
> DeletedNodeEntry getDeletedNode(nodeId, include)

Get a deleted node

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets the specific deleted node **nodeId**. 

### Example
```java
// Import classes:
//import org.alfresco.repository.remote.client.ApiException;
//import org.alfresco.repository.remote.client.api.TrashcanApi;


TrashcanApi apiInstance = new TrashcanApi();
String nodeId = "nodeId_example"; // String | The identifier of a node.
List<String> include = Arrays.asList("include_example"); // List<String> | Returns additional information about the node. The following optional fields can be requested: * allowableOperations * association * isLink * isLocked * path * permissions 
try {
    DeletedNodeEntry result = apiInstance.getDeletedNode(nodeId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrashcanApi#getDeletedNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the node. The following optional fields can be requested: * allowableOperations * association * isLink * isLocked * path * permissions  | [optional]

### Return type

[**DeletedNodeEntry**](DeletedNodeEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listDeletedNodes"></a>
# **listDeletedNodes**
> DeletedNodesPaging listDeletedNodes(skipCount, maxItems, include)

List deleted nodes

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets a list of deleted nodes for the current user.  If the current user is an administrator deleted nodes for all users will be returned.  The list of deleted nodes will be ordered with the most recently deleted node at the top of the list. 

### Example
```java
// Import classes:
//import org.alfresco.repository.remote.client.ApiException;
//import org.alfresco.repository.remote.client.api.TrashcanApi;


TrashcanApi apiInstance = new TrashcanApi();
Integer skipCount = 0; // Integer | The number of entities that exist in the collection before those included in this list.  If not supplied then the default value is 0. 
Integer maxItems = 100; // Integer | The maximum number of items to return in the list.  If not supplied then the default value is 100. 
List<String> include = Arrays.asList("include_example"); // List<String> | Returns additional information about the node. The following optional fields can be requested: * allowableOperations * aspectNames * association * isLink * isLocked * path * properties * permissions 
try {
    DeletedNodesPaging result = apiInstance.listDeletedNodes(skipCount, maxItems, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrashcanApi#listDeletedNodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **skipCount** | **Integer**| The number of entities that exist in the collection before those included in this list.  If not supplied then the default value is 0.  | [optional] [default to 0]
 **maxItems** | **Integer**| The maximum number of items to return in the list.  If not supplied then the default value is 100.  | [optional] [default to 100]
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the node. The following optional fields can be requested: * allowableOperations * aspectNames * association * isLink * isLocked * path * properties * permissions  | [optional]

### Return type

[**DeletedNodesPaging**](DeletedNodesPaging.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="restoreDeletedNode"></a>
# **restoreDeletedNode**
> NodeEntry restoreDeletedNode(nodeId, fields)

Restore a deleted node

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Attempts to restore the deleted node **nodeId** to its original location.  If the node is successfully restored to its former primary parent, then only the  primary child association will be restored, including recursively for any primary  children. It should be noted that no other secondary child associations or peer  associations will be restored, for any of the nodes within the primary parent-child  hierarchy of restored nodes, irrespective of whether these associations were to  nodes within or outside of the restored hierarchy.   Also, any previously shared link will not be restored since it is deleted at the time  of delete of each node. 

### Example
```java
// Import classes:
//import org.alfresco.repository.remote.client.ApiException;
//import org.alfresco.repository.remote.client.api.TrashcanApi;


TrashcanApi apiInstance = new TrashcanApi();
String nodeId = "nodeId_example"; // String | The identifier of a node.
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    NodeEntry result = apiInstance.restoreDeletedNode(nodeId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrashcanApi#restoreDeletedNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**NodeEntry**](NodeEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

