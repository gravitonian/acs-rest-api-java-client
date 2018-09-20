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
import org.alfresco.repository.remote.client.model.CommentBody;
import org.alfresco.repository.remote.client.model.CommentEntry;
import org.alfresco.repository.remote.client.model.CommentPaging;
import org.alfresco.repository.remote.client.model.Error;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CommentsApi
 */
@Ignore
public class CommentsApiTest {

    private final CommentsApi api = new CommentsApi();

    
    /**
     * Create a comment
     *
     * Creates a comment on node **nodeId**. You specify the comment in a JSON body like this:  &#x60;&#x60;&#x60;JSON {   \&quot;content\&quot;: \&quot;This is a comment\&quot; } &#x60;&#x60;&#x60;  **Note:** You can create more than one comment by  specifying a list of comments in the JSON body like this:  &#x60;&#x60;&#x60;JSON [   {     \&quot;content\&quot;: \&quot;This is a comment\&quot;   },   {     \&quot;content\&quot;: \&quot;This is another comment\&quot;   } ] &#x60;&#x60;&#x60; If you specify a list as input, then a paginated list rather than an entry is returned in the response body. For example:  &#x60;&#x60;&#x60;JSON {   \&quot;list\&quot;: {     \&quot;pagination\&quot;: {       \&quot;count\&quot;: 2,       \&quot;hasMoreItems\&quot;: false,       \&quot;totalItems\&quot;: 2,       \&quot;skipCount\&quot;: 0,       \&quot;maxItems\&quot;: 100     },     \&quot;entries\&quot;: [       {         \&quot;entry\&quot;: {           ...         }       },       {         \&quot;entry\&quot;: {           ...         }       }     ]   } } &#x60;&#x60;&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCommentTest() throws ApiException {
        String nodeId = null;
        CommentBody commentBodyCreate = null;
        List<String> fields = null;
        CommentEntry response = api.createComment(nodeId, commentBodyCreate, fields);

        // TODO: test validations
    }
    
    /**
     * Delete a comment
     *
     * Deletes the comment **commentId** from node **nodeId**.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCommentTest() throws ApiException {
        String nodeId = null;
        String commentId = null;
        api.deleteComment(nodeId, commentId);

        // TODO: test validations
    }
    
    /**
     * List comments
     *
     * Gets a list of comments for the node **nodeId**, sorted chronologically with the newest comment first.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCommentsTest() throws ApiException {
        String nodeId = null;
        Integer skipCount = null;
        Integer maxItems = null;
        List<String> fields = null;
        CommentPaging response = api.listComments(nodeId, skipCount, maxItems, fields);

        // TODO: test validations
    }
    
    /**
     * Update a comment
     *
     * Updates an existing comment **commentId** on node **nodeId**.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCommentTest() throws ApiException {
        String nodeId = null;
        String commentId = null;
        CommentBody commentBodyUpdate = null;
        List<String> fields = null;
        CommentEntry response = api.updateComment(nodeId, commentId, commentBodyUpdate, fields);

        // TODO: test validations
    }
    
}
