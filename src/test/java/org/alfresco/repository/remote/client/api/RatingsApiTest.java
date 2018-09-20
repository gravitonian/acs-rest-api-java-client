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
import org.alfresco.repository.remote.client.model.RatingBody;
import org.alfresco.repository.remote.client.model.RatingEntry;
import org.alfresco.repository.remote.client.model.RatingPaging;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RatingsApi
 */
@Ignore
public class RatingsApiTest {

    private final RatingsApi api = new RatingsApi();

    
    /**
     * Create a rating
     *
     * Create a rating for the node with identifier **nodeId**
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createRatingTest() throws ApiException {
        String nodeId = null;
        RatingBody ratingBodyCreate = null;
        List<String> fields = null;
        RatingEntry response = api.createRating(nodeId, ratingBodyCreate, fields);

        // TODO: test validations
    }
    
    /**
     * Delete a rating
     *
     * Deletes rating **ratingId** from node **nodeId**.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRatingTest() throws ApiException {
        String nodeId = null;
        String ratingId = null;
        api.deleteRating(nodeId, ratingId);

        // TODO: test validations
    }
    
    /**
     * Get a rating
     *
     * Get the specific rating **ratingId** on node **nodeId**.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRatingTest() throws ApiException {
        String nodeId = null;
        String ratingId = null;
        List<String> fields = null;
        RatingEntry response = api.getRating(nodeId, ratingId, fields);

        // TODO: test validations
    }
    
    /**
     * List ratings
     *
     * Gets a list of ratings for node **nodeId**.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listRatingsTest() throws ApiException {
        String nodeId = null;
        Integer skipCount = null;
        Integer maxItems = null;
        List<String> fields = null;
        RatingPaging response = api.listRatings(nodeId, skipCount, maxItems, fields);

        // TODO: test validations
    }
    
}
