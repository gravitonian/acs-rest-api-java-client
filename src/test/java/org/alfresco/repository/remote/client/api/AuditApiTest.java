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
import org.alfresco.repository.remote.client.model.AuditApp;
import org.alfresco.repository.remote.client.model.AuditAppPaging;
import org.alfresco.repository.remote.client.model.AuditBodyUpdate;
import org.alfresco.repository.remote.client.model.AuditEntryEntry;
import org.alfresco.repository.remote.client.model.AuditEntryPaging;
import org.alfresco.repository.remote.client.model.Error;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuditApi
 */
@Ignore
public class AuditApiTest {

    private final AuditApi api = new AuditApi();

    
    /**
     * Permanently delete audit entries for an audit application
     *
     * **Note:** this endpoint is available in Alfresco 5.2.2 and newer versions.  Permanently delete audit entries for an audit application **auditApplicationId**.  The **where** clause must be specified, either with an inclusive time period or for  an inclusive range of ids. The delete is within the context of the given audit application.  For example:  *   &#x60;&#x60;&#x60;where&#x3D;(createdAt BETWEEN (&#39;2017-06-02T12:13:51.593+01:00&#39; , &#39;2017-06-04T10:05:16.536+01:00&#39;)&#x60;&#x60;&#x60; *   &#x60;&#x60;&#x60;where&#x3D;(id BETWEEN (&#39;1234&#39;, &#39;4321&#39;)&#x60;&#x60;&#x60;  You must have admin rights to delete audit information. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAuditEntriesForAuditAppTest() throws ApiException {
        String auditApplicationId = null;
        String where = null;
        api.deleteAuditEntriesForAuditApp(auditApplicationId, where);

        // TODO: test validations
    }
    
    /**
     * Permanently delete an audit entry
     *
     * **Note:** this endpoint is available in Alfresco 5.2.2 and newer versions.  Permanently delete a single audit entry **auditEntryId**.  You must have admin rights to delete audit information. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAuditEntryTest() throws ApiException {
        String auditApplicationId = null;
        String auditEntryId = null;
        api.deleteAuditEntry(auditApplicationId, auditEntryId);

        // TODO: test validations
    }
    
    /**
     * Get audit application info
     *
     * **Note:** this endpoint is available in Alfresco 5.2.2 and newer versions.  Get status of an audit application **auditApplicationId**.  You must have admin rights to retrieve audit information. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAuditAppTest() throws ApiException {
        String auditApplicationId = null;
        List<String> fields = null;
        AuditApp response = api.getAuditApp(auditApplicationId, fields);

        // TODO: test validations
    }
    
    /**
     * Get audit entry
     *
     * **Note:** this endpoint is available in Alfresco 5.2.2 and newer versions.  Gets audit entry **auditEntryId**.  You must have admin rights to access audit information. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAuditEntryTest() throws ApiException {
        String auditApplicationId = null;
        String auditEntryId = null;
        List<String> fields = null;
        AuditEntryEntry response = api.getAuditEntry(auditApplicationId, auditEntryId, fields);

        // TODO: test validations
    }
    
    /**
     * List audit applications
     *
     * **Note:** this endpoint is available in Alfresco 5.2.2 and newer versions.  Gets a list of audit applications in this repository.  This list may include pre-configured audit applications, if enabled, such as:  * alfresco-access * CMISChangeLog * Alfresco Tagging Service * Alfresco Sync Service (used by Enterprise Cloud Sync)  You must have admin rights to retrieve audit information. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAuditAppsTest() throws ApiException {
        Integer skipCount = null;
        Integer maxItems = null;
        List<String> fields = null;
        AuditAppPaging response = api.listAuditApps(skipCount, maxItems, fields);

        // TODO: test validations
    }
    
    /**
     * List audit entries for an audit application
     *
     * **Note:** this endpoint is available in Alfresco 5.2.2 and newer versions.  Gets a list of audit entries for audit application **auditApplicationId**.  You can use the **include** parameter to return additional **values** information.  The list can be filtered by one or more of: * **createdByUser** person id * **createdAt** inclusive time period * **id** inclusive range of ids * **valuesKey** audit entry values contains the exact matching key * **valuesValue** audit entry values contains the exact matching value  The default sort order is **createdAt** ascending, but you can use an optional **ASC** or **DESC**  modifier to specify an ascending or descending sort order.   For example, specifying &#x60;&#x60;&#x60;orderBy&#x3D;createdAt DESC&#x60;&#x60;&#x60; returns audit entries in descending **createdAt** order.  You must have admin rights to retrieve audit information. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAuditEntriesForAuditAppTest() throws ApiException {
        String auditApplicationId = null;
        Integer skipCount = null;
        List<String> orderBy = null;
        Integer maxItems = null;
        String where = null;
        List<String> include = null;
        List<String> fields = null;
        AuditEntryPaging response = api.listAuditEntriesForAuditApp(auditApplicationId, skipCount, orderBy, maxItems, where, include, fields);

        // TODO: test validations
    }
    
    /**
     * List audit entries for a node
     *
     * **Note:** this endpoint is available in Alfresco 5.2.2 and newer versions.  Gets a list of audit entries for node **nodeId**.  The list can be filtered by **createdByUser** and for a given inclusive time period.  The default sort order is **createdAt** ascending, but you can use an optional **ASC** or **DESC**  modifier to specify an ascending or descending sort order.       For example, specifying &#x60;&#x60;&#x60;orderBy&#x3D;createdAt DESC&#x60;&#x60;&#x60; returns audit entries in descending **createdAt** order.  This relies on the pre-configured &#39;alfresco-access&#39; audit application. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAuditEntriesForNodeTest() throws ApiException {
        String nodeId = null;
        Integer skipCount = null;
        List<String> orderBy = null;
        Integer maxItems = null;
        String where = null;
        List<String> include = null;
        List<String> fields = null;
        AuditEntryPaging response = api.listAuditEntriesForNode(nodeId, skipCount, orderBy, maxItems, where, include, fields);

        // TODO: test validations
    }
    
    /**
     * Update audit application info
     *
     * **Note:** this endpoint is available in Alfresco 5.2.2 and newer versions.  Disable or re-enable the audit application **auditApplicationId**.  New audit entries will not be created for a disabled audit application until it is re-enabled (and system-wide auditing is also enabled).   Note, it is still possible to query &amp;/or delete any existing audit entries even if auditing is disabled for the audit application.  You must have admin rights to update audit application. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAuditAppTest() throws ApiException {
        String auditApplicationId = null;
        AuditBodyUpdate auditAppBodyUpdate = null;
        List<String> fields = null;
        AuditApp response = api.updateAuditApp(auditApplicationId, auditAppBodyUpdate, fields);

        // TODO: test validations
    }
    
}
