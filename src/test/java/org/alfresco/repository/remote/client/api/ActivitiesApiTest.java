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
import org.alfresco.repository.remote.client.model.ActivityPaging;
import org.alfresco.repository.remote.client.model.Error;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ActivitiesApi
 */
@Ignore
public class ActivitiesApiTest {

    private final ActivitiesApi api = new ActivitiesApi();

    
    /**
     * List activities
     *
     * Gets a list of activities for person **personId**.  You can use the &#x60;-me-&#x60; string in place of &#x60;&lt;personId&gt;&#x60; to specify the currently authenticated user. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listActivitiesForPersonTest() throws ApiException {
        String personId = null;
        Integer skipCount = null;
        Integer maxItems = null;
        String who = null;
        String siteId = null;
        List<String> fields = null;
        ActivityPaging response = api.listActivitiesForPerson(personId, skipCount, maxItems, who, siteId, fields);

        // TODO: test validations
    }
    
}
