# RenditionsApi

All URIs are relative to *https://localhost/alfresco/api/-default-/public/alfresco/versions/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRendition**](RenditionsApi.md#createRendition) | **POST** /nodes/{nodeId}/renditions | Create rendition
[**getRendition**](RenditionsApi.md#getRendition) | **GET** /nodes/{nodeId}/renditions/{renditionId} | Get rendition information
[**getRenditionContent**](RenditionsApi.md#getRenditionContent) | **GET** /nodes/{nodeId}/renditions/{renditionId}/content | Get rendition content
[**listRenditions**](RenditionsApi.md#listRenditions) | **GET** /nodes/{nodeId}/renditions | List renditions


<a name="createRendition"></a>
# **createRendition**
> createRendition(nodeId, renditionBodyCreate)

Create rendition

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  An asynchronous request to create a rendition for file **nodeId**.  The rendition is specified by name **id** in the request body: &#x60;&#x60;&#x60;JSON {   \&quot;id\&quot;:\&quot;doclib\&quot; } &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
//import org.alfresco.repository.remote.client.ApiException;
//import org.alfresco.repository.remote.client.api.RenditionsApi;


RenditionsApi apiInstance = new RenditionsApi();
String nodeId = "nodeId_example"; // String | The identifier of a node.
RenditionBodyCreate renditionBodyCreate = new RenditionBodyCreate(); // RenditionBodyCreate | The rendition \"id\".
try {
    apiInstance.createRendition(nodeId, renditionBodyCreate);
} catch (ApiException e) {
    System.err.println("Exception when calling RenditionsApi#createRendition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **renditionBodyCreate** | [**RenditionBodyCreate**](RenditionBodyCreate.md)| The rendition \&quot;id\&quot;. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRendition"></a>
# **getRendition**
> RenditionEntry getRendition(nodeId, renditionId)

Get rendition information

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets the rendition information for **renditionId** of file **nodeId**. 

### Example
```java
// Import classes:
//import org.alfresco.repository.remote.client.ApiException;
//import org.alfresco.repository.remote.client.api.RenditionsApi;


RenditionsApi apiInstance = new RenditionsApi();
String nodeId = "nodeId_example"; // String | The identifier of a node.
String renditionId = "renditionId_example"; // String | The name of a thumbnail rendition, for example *doclib*, or *pdf*.
try {
    RenditionEntry result = apiInstance.getRendition(nodeId, renditionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RenditionsApi#getRendition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **renditionId** | **String**| The name of a thumbnail rendition, for example *doclib*, or *pdf*. |

### Return type

[**RenditionEntry**](RenditionEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRenditionContent"></a>
# **getRenditionContent**
> getRenditionContent(nodeId, renditionId, attachment, ifModifiedSince, placeholder)

Get rendition content

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets the rendition content for **renditionId** of file **nodeId**. 

### Example
```java
// Import classes:
//import org.alfresco.repository.remote.client.ApiException;
//import org.alfresco.repository.remote.client.api.RenditionsApi;


RenditionsApi apiInstance = new RenditionsApi();
String nodeId = "nodeId_example"; // String | The identifier of a node.
String renditionId = "renditionId_example"; // String | The name of a thumbnail rendition, for example *doclib*, or *pdf*.
Boolean attachment = true; // Boolean | **true** enables a web browser to download the file as an attachment. **false** means a web browser may preview the file in a new tab or window, but not download the file.  You can only set this parameter to **false** if the content type of the file is in the supported list; for example, certain image files and PDF files.  If the content type is not supported for preview, then a value of **false**  is ignored, and the attachment will be returned in the response. 
OffsetDateTime ifModifiedSince = new OffsetDateTime(); // OffsetDateTime | Only returns the content if it has been modified since the date provided. Use the date format defined by HTTP. For example, `Wed, 09 Mar 2016 16:56:34 GMT`. 
Boolean placeholder = false; // Boolean | If **true** and there is no rendition for this **nodeId** and **renditionId**,  then the placeholder image for the mime type of this rendition is returned, rather  than a 404 response. 
try {
    apiInstance.getRenditionContent(nodeId, renditionId, attachment, ifModifiedSince, placeholder);
} catch (ApiException e) {
    System.err.println("Exception when calling RenditionsApi#getRenditionContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **renditionId** | **String**| The name of a thumbnail rendition, for example *doclib*, or *pdf*. |
 **attachment** | **Boolean**| **true** enables a web browser to download the file as an attachment. **false** means a web browser may preview the file in a new tab or window, but not download the file.  You can only set this parameter to **false** if the content type of the file is in the supported list; for example, certain image files and PDF files.  If the content type is not supported for preview, then a value of **false**  is ignored, and the attachment will be returned in the response.  | [optional] [default to true]
 **ifModifiedSince** | **OffsetDateTime**| Only returns the content if it has been modified since the date provided. Use the date format defined by HTTP. For example, &#x60;Wed, 09 Mar 2016 16:56:34 GMT&#x60;.  | [optional]
 **placeholder** | **Boolean**| If **true** and there is no rendition for this **nodeId** and **renditionId**,  then the placeholder image for the mime type of this rendition is returned, rather  than a 404 response.  | [optional] [default to false]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listRenditions"></a>
# **listRenditions**
> RenditionPaging listRenditions(nodeId, where)

List renditions

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets a list of the rendition information for each rendition of the the file **nodeId**, including the rendition id.  Each rendition returned has a **status**: CREATED means it is available to view or download, NOT_CREATED means the rendition can be requested.  You can use the **where** parameter to filter the returned renditions by **status**. For example, the following **where**  clause will return just the CREATED renditions:    &#x60;&#x60;&#x60; (status&#x3D;&#39;CREATED&#39;) &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
//import org.alfresco.repository.remote.client.ApiException;
//import org.alfresco.repository.remote.client.api.RenditionsApi;


RenditionsApi apiInstance = new RenditionsApi();
String nodeId = "nodeId_example"; // String | The identifier of a node.
String where = "where_example"; // String | A string to restrict the returned objects by using a predicate.
try {
    RenditionPaging result = apiInstance.listRenditions(nodeId, where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RenditionsApi#listRenditions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **where** | **String**| A string to restrict the returned objects by using a predicate. | [optional]

### Return type

[**RenditionPaging**](RenditionPaging.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

