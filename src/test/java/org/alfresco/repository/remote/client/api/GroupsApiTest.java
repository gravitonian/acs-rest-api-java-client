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
import org.alfresco.repository.remote.client.model.GroupBodyCreate;
import org.alfresco.repository.remote.client.model.GroupBodyUpdate;
import org.alfresco.repository.remote.client.model.GroupEntry;
import org.alfresco.repository.remote.client.model.GroupMemberEntry;
import org.alfresco.repository.remote.client.model.GroupMemberPaging;
import org.alfresco.repository.remote.client.model.GroupMembershipBodyCreate;
import org.alfresco.repository.remote.client.model.GroupPaging;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GroupsApi
 */
@Ignore
public class GroupsApiTest {

    private final GroupsApi api = new GroupsApi();

    
    /**
     * Create a group
     *
     * **Note:** this endpoint is available in Alfresco 5.2.1 and newer versions.  Create a group.  The group id must start with \&quot;GROUP\\_\&quot;. If this is omitted it will be added automatically. This format is also returned when listing groups or group memberships. It should be noted that the other group-related operations also expect the id to start with \&quot;GROUP\\_\&quot;.  If one or more parentIds are specified then the group will be created and become a member of each of the specified parent groups.  If no parentIds are specified then the group will be created as a root group.  The group will be created in the **APP.DEFAULT** and **AUTH.ALF** zones.  You must have admin rights to create a group.  
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createGroupTest() throws ApiException {
        GroupBodyCreate groupBodyCreate = null;
        List<String> include = null;
        List<String> fields = null;
        GroupEntry response = api.createGroup(groupBodyCreate, include, fields);

        // TODO: test validations
    }
    
    /**
     * Create a group membership
     *
     * **Note:** this endpoint is available in Alfresco 5.2.1 and newer versions.  Create a group membership (for an existing person or group) within a group **groupId**.  If the added group was previously a root group then it becomes a non-root group since it now has a parent.  It is an error to specify an **id** that does not exist.  You must have admin rights to create a group membership. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createGroupMembershipTest() throws ApiException {
        String groupId = null;
        GroupMembershipBodyCreate groupMembershipBodyCreate = null;
        List<String> fields = null;
        GroupMemberEntry response = api.createGroupMembership(groupId, groupMembershipBodyCreate, fields);

        // TODO: test validations
    }
    
    /**
     * Delete a group
     *
     * **Note:** this endpoint is available in Alfresco 5.2.1 and newer versions.  Delete group **groupId**.   The option to cascade delete applies this recursively to any hierarchy of group members. In this case, removing a group member does not delete the person or sub-group itself. If a removed sub-group no longer has any parent groups then it becomes a root group.  You must have admin rights to delete a group. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteGroupTest() throws ApiException {
        String groupId = null;
        Boolean cascade = null;
        api.deleteGroup(groupId, cascade);

        // TODO: test validations
    }
    
    /**
     * Delete a group membership
     *
     * **Note:** this endpoint is available in Alfresco 5.2.1 and newer versions.  Delete group member **groupMemberId** (person or sub-group) from group **groupId**.  Removing a group member does not delete the person or sub-group itself.  If a removed sub-group no longer has any parent groups then it becomes a root group.  You must have admin rights to delete a group membership. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteGroupMembershipTest() throws ApiException {
        String groupId = null;
        String groupMemberId = null;
        api.deleteGroupMembership(groupId, groupMemberId);

        // TODO: test validations
    }
    
    /**
     * Get group details
     *
     * **Note:** this endpoint is available in Alfresco 5.2.1 and newer versions.  Get details for group **groupId**.  You can use the **include** parameter to return additional information. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGroupTest() throws ApiException {
        String groupId = null;
        List<String> include = null;
        List<String> fields = null;
        GroupEntry response = api.getGroup(groupId, include, fields);

        // TODO: test validations
    }
    
    /**
     * List memberships of a group
     *
     * **Note:** this endpoint is available in Alfresco 5.2.1 and newer versions.  Gets a list of the group memberships for the group **groupId**.  You can use the **where** parameter to filter the returned groups by **memberType**.  Example to filter by **memberType**, use any one of:  &#x60;&#x60;&#x60; (memberType&#x3D;&#39;GROUP&#39;) (memberType&#x3D;&#39;PERSON&#39;) &#x60;&#x60;&#x60;  The default sort order for the returned list is for group members to be sorted by ascending displayName. You can override the default by using the **orderBy** parameter. You can specify one of the following fields in the **orderBy** parameter: * id * displayName 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listGroupMembershipsTest() throws ApiException {
        String groupId = null;
        Integer skipCount = null;
        Integer maxItems = null;
        List<String> orderBy = null;
        String where = null;
        List<String> fields = null;
        GroupMemberPaging response = api.listGroupMemberships(groupId, skipCount, maxItems, orderBy, where, fields);

        // TODO: test validations
    }
    
    /**
     * List group memberships
     *
     * **Note:** this endpoint is available in Alfresco 5.2.1 and newer versions.            Gets a list of group membership information for person **personId**.    You can use the &#x60;-me-&#x60; string in place of &#x60;&lt;personId&gt;&#x60; to specify the currently authenticated user.   You can use the **include** parameter to return additional information.   You can use the **where** parameter to filter the returned groups by **isRoot**. For example, the following **where**  clause will return just the root groups:   &#x60;&#x60;&#x60;  (isRoot&#x3D;true)  &#x60;&#x60;&#x60;   The **where** parameter can also be used to filter by ***zone***. This may be combined with isRoot to narrow  a result set even further. For example, the following where clause will only return groups belonging to the  &#x60;MY.ZONE&#x60; zone.   &#x60;&#x60;&#x60;  where&#x3D;(zones in (&#39;MY.ZONE&#39;))  &#x60;&#x60;&#x60;   This may be combined with the isRoot filter, as shown below:   &#x60;&#x60;&#x60;  where&#x3D;(isRoot&#x3D;false AND zones in (&#39;MY.ZONE&#39;))  &#x60;&#x60;&#x60;   ***Note:*** restrictions include  * &#x60;AND&#x60; is the only supported operator when combining &#x60;isRoot&#x60; and &#x60;zones&#x60; filters  * Only one zone is supported by the filter  * The quoted zone name must be placed in parenthesis — a 400 error will result if these are omitted.    The default sort order for the returned list is for groups to be sorted by ascending displayName.  You can override the default by using the **orderBy** parameter. You can specify one or more of the following fields in the **orderBy** parameter:  * id  * displayName 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listGroupMembershipsForPersonTest() throws ApiException {
        String personId = null;
        Integer skipCount = null;
        Integer maxItems = null;
        List<String> orderBy = null;
        List<String> include = null;
        String where = null;
        List<String> fields = null;
        GroupPaging response = api.listGroupMembershipsForPerson(personId, skipCount, maxItems, orderBy, include, where, fields);

        // TODO: test validations
    }
    
    /**
     * List groups
     *
     * **Note:** this endpoint is available in Alfresco 5.2.1 and newer versions.  Gets a list of groups.   You can use the **include** parameter to return additional information.  You can use the **where** parameter to filter the returned groups by **isRoot**. For example, the following **where**  clause will return just the root groups:    &#x60;&#x60;&#x60; (isRoot&#x3D;true) &#x60;&#x60;&#x60;  The **where** parameter can also be used to filter by ***zone***. This may be combined with isRoot to narrow a result set even further. For example, the following where clause will only return groups belonging to the &#x60;MY.ZONE&#x60; zone.  &#x60;&#x60;&#x60; where&#x3D;(zones in (&#39;MY.ZONE&#39;)) &#x60;&#x60;&#x60;  This may be combined with the isRoot filter, as shown below:  &#x60;&#x60;&#x60; where&#x3D;(isRoot&#x3D;false AND zones in (&#39;MY.ZONE&#39;)) &#x60;&#x60;&#x60;  ***Note:*** restrictions include * &#x60;AND&#x60; is the only supported operator when combining &#x60;isRoot&#x60; and &#x60;zones&#x60; filters * Only one zone is supported by the filter * The quoted zone name must be placed in parenthesis — a 400 error will result if these are omitted.  The default sort order for the returned list is for groups to be sorted by ascending displayName. You can override the default by using the **orderBy** parameter. You can specify one of the following fields in the **orderBy** parameter: * id * displayName 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listGroupsTest() throws ApiException {
        Integer skipCount = null;
        Integer maxItems = null;
        List<String> orderBy = null;
        List<String> include = null;
        String where = null;
        List<String> fields = null;
        GroupPaging response = api.listGroups(skipCount, maxItems, orderBy, include, where, fields);

        // TODO: test validations
    }
    
    /**
     * Update group details
     *
     * **Note:** this endpoint is available in Alfresco 5.2.1 and newer versions.  Update details (displayName) for group **groupId**.  You must have admin rights to update a group. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateGroupTest() throws ApiException {
        String groupId = null;
        GroupBodyUpdate groupBodyUpdate = null;
        List<String> include = null;
        List<String> fields = null;
        GroupEntry response = api.updateGroup(groupId, groupBodyUpdate, include, fields);

        // TODO: test validations
    }
    
}
