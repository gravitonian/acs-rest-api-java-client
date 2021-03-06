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


package org.alfresco.repository.remote.client.api;

import org.alfresco.repository.remote.client.ApiException;
import org.alfresco.repository.remote.client.model.Error;
import org.threeten.bp.OffsetDateTime;
import org.alfresco.repository.remote.client.model.RenditionBodyCreate;
import org.alfresco.repository.remote.client.model.RenditionEntry;
import org.alfresco.repository.remote.client.model.RenditionPaging;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RenditionsApi
 */
@Ignore
public class RenditionsApiTest {

    private final RenditionsApi api = new RenditionsApi();

    
    /**
     * Create rendition
     *
     * **Note:** this endpoint is available in Alfresco 5.2 and newer versions.  An asynchronous request to create a rendition for file **nodeId**.  The rendition is specified by name **id** in the request body: &#x60;&#x60;&#x60;JSON {   \&quot;id\&quot;:\&quot;doclib\&quot; } &#x60;&#x60;&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createRenditionTest() throws ApiException {
        String nodeId = null;
        RenditionBodyCreate renditionBodyCreate = null;
        api.createRendition(nodeId, renditionBodyCreate);

        // TODO: test validations
    }
    
    /**
     * Get rendition information
     *
     * **Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets the rendition information for **renditionId** of file **nodeId**. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRenditionTest() throws ApiException {
        String nodeId = null;
        String renditionId = null;
        RenditionEntry response = api.getRendition(nodeId, renditionId);

        // TODO: test validations
    }
    
    /**
     * Get rendition content
     *
     * **Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets the rendition content for **renditionId** of file **nodeId**. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRenditionContentTest() throws ApiException {
        String nodeId = null;
        String renditionId = null;
        Boolean attachment = null;
        OffsetDateTime ifModifiedSince = null;
        Boolean placeholder = null;
        api.getRenditionContent(nodeId, renditionId, attachment, ifModifiedSince, placeholder);

        // TODO: test validations
    }
    
    /**
     * List renditions
     *
     * **Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets a list of the rendition information for each rendition of the the file **nodeId**, including the rendition id.  Each rendition returned has a **status**: CREATED means it is available to view or download, NOT_CREATED means the rendition can be requested.  You can use the **where** parameter to filter the returned renditions by **status**. For example, the following **where**  clause will return just the CREATED renditions:    &#x60;&#x60;&#x60; (status&#x3D;&#39;CREATED&#39;) &#x60;&#x60;&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listRenditionsTest() throws ApiException {
        String nodeId = null;
        String where = null;
        RenditionPaging response = api.listRenditions(nodeId, where);

        // TODO: test validations
    }
    
}
