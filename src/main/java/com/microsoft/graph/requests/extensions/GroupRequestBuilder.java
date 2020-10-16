// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Group;
import com.microsoft.graph.models.extensions.AssignedLicense;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupSettingRequestBuilder;
import com.microsoft.graph.requests.extensions.EventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EventRequestBuilder;
import com.microsoft.graph.requests.extensions.ConversationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ConversationRequestBuilder;
import com.microsoft.graph.requests.extensions.ProfilePhotoCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ProfilePhotoRequestBuilder;
import com.microsoft.graph.requests.extensions.ConversationThreadCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ConversationThreadRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupLifecyclePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupLifecyclePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.CalendarRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Request Builder.
 */
public class GroupRequestBuilder extends BaseRequestBuilder<Group> {

    /**
     * The request builder for the Group
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the GroupRequest instance
     */
    public GroupRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the GroupRequest instance
     */
    public GroupRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.GroupRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public AppRoleAssignmentCollectionRequestBuilder appRoleAssignments() {
        return new AppRoleAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("appRoleAssignments"), getClient(), null);
    }

    public AppRoleAssignmentRequestBuilder appRoleAssignments(final String id) {
        return new AppRoleAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("appRoleAssignments") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DirectoryObject
     *
     * @return the DirectoryObjectWithReferenceRequestBuilder instance
     */
    public DirectoryObjectWithReferenceRequestBuilder createdOnBehalfOf() {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("createdOnBehalfOf"), getClient(), null);
    }
    public DirectoryObjectCollectionWithReferencesRequestBuilder memberOf() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf"), getClient(), null);
    }

    public DirectoryObjectWithReferenceRequestBuilder memberOf(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id, getClient(), null);
    }
    public UserCollectionWithReferencesRequestBuilder memberOfAsUser() {
        return new UserCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.user", getClient(), null);
    }

    public UserWithReferenceRequestBuilder memberOfAsUser(final String id) {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.user", getClient(), null);
    }
    public GroupCollectionWithReferencesRequestBuilder memberOfAsGroup() {
        return new GroupCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.group", getClient(), null);
    }

    public GroupWithReferenceRequestBuilder memberOfAsGroup(final String id) {
        return new GroupWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.group", getClient(), null);
    }
    public ApplicationCollectionWithReferencesRequestBuilder memberOfAsApplication() {
        return new ApplicationCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.application", getClient(), null);
    }

    public ApplicationWithReferenceRequestBuilder memberOfAsApplication(final String id) {
        return new ApplicationWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.application", getClient(), null);
    }
    public ServicePrincipalCollectionWithReferencesRequestBuilder memberOfAsServicePrincipal() {
        return new ServicePrincipalCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    public ServicePrincipalWithReferenceRequestBuilder memberOfAsServicePrincipal(final String id) {
        return new ServicePrincipalWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    public DeviceCollectionWithReferencesRequestBuilder memberOfAsDevice() {
        return new DeviceCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.device", getClient(), null);
    }

    public DeviceWithReferenceRequestBuilder memberOfAsDevice(final String id) {
        return new DeviceWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.device", getClient(), null);
    }
    public OrgContactCollectionWithReferencesRequestBuilder memberOfAsOrgContact() {
        return new OrgContactCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/microsoft.graph.orgContact", getClient(), null);
    }

    public OrgContactWithReferenceRequestBuilder memberOfAsOrgContact(final String id) {
        return new OrgContactWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("memberOf") + "/" + id + "/microsoft.graph.orgContact", getClient(), null);
    }
    public DirectoryObjectCollectionWithReferencesRequestBuilder members() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("members"), getClient(), null);
    }

    public DirectoryObjectWithReferenceRequestBuilder members(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/" + id, getClient(), null);
    }
    public UserCollectionWithReferencesRequestBuilder membersAsUser() {
        return new UserCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/microsoft.graph.user", getClient(), null);
    }

    public UserWithReferenceRequestBuilder membersAsUser(final String id) {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/" + id + "/microsoft.graph.user", getClient(), null);
    }
    public GroupCollectionWithReferencesRequestBuilder membersAsGroup() {
        return new GroupCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/microsoft.graph.group", getClient(), null);
    }

    public GroupWithReferenceRequestBuilder membersAsGroup(final String id) {
        return new GroupWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/" + id + "/microsoft.graph.group", getClient(), null);
    }
    public ApplicationCollectionWithReferencesRequestBuilder membersAsApplication() {
        return new ApplicationCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/microsoft.graph.application", getClient(), null);
    }

    public ApplicationWithReferenceRequestBuilder membersAsApplication(final String id) {
        return new ApplicationWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/" + id + "/microsoft.graph.application", getClient(), null);
    }
    public ServicePrincipalCollectionWithReferencesRequestBuilder membersAsServicePrincipal() {
        return new ServicePrincipalCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    public ServicePrincipalWithReferenceRequestBuilder membersAsServicePrincipal(final String id) {
        return new ServicePrincipalWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    public DeviceCollectionWithReferencesRequestBuilder membersAsDevice() {
        return new DeviceCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/microsoft.graph.device", getClient(), null);
    }

    public DeviceWithReferenceRequestBuilder membersAsDevice(final String id) {
        return new DeviceWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/" + id + "/microsoft.graph.device", getClient(), null);
    }
    public OrgContactCollectionWithReferencesRequestBuilder membersAsOrgContact() {
        return new OrgContactCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/microsoft.graph.orgContact", getClient(), null);
    }

    public OrgContactWithReferenceRequestBuilder membersAsOrgContact(final String id) {
        return new OrgContactWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/" + id + "/microsoft.graph.orgContact", getClient(), null);
    }
    public DirectoryObjectCollectionWithReferencesRequestBuilder membersWithLicenseErrors() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors"), getClient(), null);
    }

    public DirectoryObjectWithReferenceRequestBuilder membersWithLicenseErrors(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors") + "/" + id, getClient(), null);
    }
    public UserCollectionWithReferencesRequestBuilder membersWithLicenseErrorsAsUser() {
        return new UserCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors") + "/microsoft.graph.user", getClient(), null);
    }

    public UserWithReferenceRequestBuilder membersWithLicenseErrorsAsUser(final String id) {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors") + "/" + id + "/microsoft.graph.user", getClient(), null);
    }
    public GroupCollectionWithReferencesRequestBuilder membersWithLicenseErrorsAsGroup() {
        return new GroupCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors") + "/microsoft.graph.group", getClient(), null);
    }

    public GroupWithReferenceRequestBuilder membersWithLicenseErrorsAsGroup(final String id) {
        return new GroupWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors") + "/" + id + "/microsoft.graph.group", getClient(), null);
    }
    public ApplicationCollectionWithReferencesRequestBuilder membersWithLicenseErrorsAsApplication() {
        return new ApplicationCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors") + "/microsoft.graph.application", getClient(), null);
    }

    public ApplicationWithReferenceRequestBuilder membersWithLicenseErrorsAsApplication(final String id) {
        return new ApplicationWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors") + "/" + id + "/microsoft.graph.application", getClient(), null);
    }
    public ServicePrincipalCollectionWithReferencesRequestBuilder membersWithLicenseErrorsAsServicePrincipal() {
        return new ServicePrincipalCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    public ServicePrincipalWithReferenceRequestBuilder membersWithLicenseErrorsAsServicePrincipal(final String id) {
        return new ServicePrincipalWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    public DeviceCollectionWithReferencesRequestBuilder membersWithLicenseErrorsAsDevice() {
        return new DeviceCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors") + "/microsoft.graph.device", getClient(), null);
    }

    public DeviceWithReferenceRequestBuilder membersWithLicenseErrorsAsDevice(final String id) {
        return new DeviceWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors") + "/" + id + "/microsoft.graph.device", getClient(), null);
    }
    public OrgContactCollectionWithReferencesRequestBuilder membersWithLicenseErrorsAsOrgContact() {
        return new OrgContactCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors") + "/microsoft.graph.orgContact", getClient(), null);
    }

    public OrgContactWithReferenceRequestBuilder membersWithLicenseErrorsAsOrgContact(final String id) {
        return new OrgContactWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("membersWithLicenseErrors") + "/" + id + "/microsoft.graph.orgContact", getClient(), null);
    }
    public DirectoryObjectCollectionWithReferencesRequestBuilder owners() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("owners"), getClient(), null);
    }

    public DirectoryObjectWithReferenceRequestBuilder owners(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id, getClient(), null);
    }
    public UserCollectionWithReferencesRequestBuilder ownersAsUser() {
        return new UserCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/microsoft.graph.user", getClient(), null);
    }

    public UserWithReferenceRequestBuilder ownersAsUser(final String id) {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id + "/microsoft.graph.user", getClient(), null);
    }
    public GroupCollectionWithReferencesRequestBuilder ownersAsGroup() {
        return new GroupCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/microsoft.graph.group", getClient(), null);
    }

    public GroupWithReferenceRequestBuilder ownersAsGroup(final String id) {
        return new GroupWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id + "/microsoft.graph.group", getClient(), null);
    }
    public ApplicationCollectionWithReferencesRequestBuilder ownersAsApplication() {
        return new ApplicationCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/microsoft.graph.application", getClient(), null);
    }

    public ApplicationWithReferenceRequestBuilder ownersAsApplication(final String id) {
        return new ApplicationWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id + "/microsoft.graph.application", getClient(), null);
    }
    public ServicePrincipalCollectionWithReferencesRequestBuilder ownersAsServicePrincipal() {
        return new ServicePrincipalCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    public ServicePrincipalWithReferenceRequestBuilder ownersAsServicePrincipal(final String id) {
        return new ServicePrincipalWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    public DeviceCollectionWithReferencesRequestBuilder ownersAsDevice() {
        return new DeviceCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/microsoft.graph.device", getClient(), null);
    }

    public DeviceWithReferenceRequestBuilder ownersAsDevice(final String id) {
        return new DeviceWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id + "/microsoft.graph.device", getClient(), null);
    }
    public OrgContactCollectionWithReferencesRequestBuilder ownersAsOrgContact() {
        return new OrgContactCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/microsoft.graph.orgContact", getClient(), null);
    }

    public OrgContactWithReferenceRequestBuilder ownersAsOrgContact(final String id) {
        return new OrgContactWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("owners") + "/" + id + "/microsoft.graph.orgContact", getClient(), null);
    }
    public GroupSettingCollectionRequestBuilder settings() {
        return new GroupSettingCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("settings"), getClient(), null);
    }

    public GroupSettingRequestBuilder settings(final String id) {
        return new GroupSettingRequestBuilder(getRequestUrlWithAdditionalSegment("settings") + "/" + id, getClient(), null);
    }
    public DirectoryObjectCollectionWithReferencesRequestBuilder transitiveMemberOf() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf"), getClient(), null);
    }

    public DirectoryObjectWithReferenceRequestBuilder transitiveMemberOf(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id, getClient(), null);
    }
    public UserCollectionWithReferencesRequestBuilder transitiveMemberOfAsUser() {
        return new UserCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.user", getClient(), null);
    }

    public UserWithReferenceRequestBuilder transitiveMemberOfAsUser(final String id) {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.user", getClient(), null);
    }
    public GroupCollectionWithReferencesRequestBuilder transitiveMemberOfAsGroup() {
        return new GroupCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.group", getClient(), null);
    }

    public GroupWithReferenceRequestBuilder transitiveMemberOfAsGroup(final String id) {
        return new GroupWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.group", getClient(), null);
    }
    public ApplicationCollectionWithReferencesRequestBuilder transitiveMemberOfAsApplication() {
        return new ApplicationCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.application", getClient(), null);
    }

    public ApplicationWithReferenceRequestBuilder transitiveMemberOfAsApplication(final String id) {
        return new ApplicationWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.application", getClient(), null);
    }
    public ServicePrincipalCollectionWithReferencesRequestBuilder transitiveMemberOfAsServicePrincipal() {
        return new ServicePrincipalCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    public ServicePrincipalWithReferenceRequestBuilder transitiveMemberOfAsServicePrincipal(final String id) {
        return new ServicePrincipalWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    public DeviceCollectionWithReferencesRequestBuilder transitiveMemberOfAsDevice() {
        return new DeviceCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.device", getClient(), null);
    }

    public DeviceWithReferenceRequestBuilder transitiveMemberOfAsDevice(final String id) {
        return new DeviceWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.device", getClient(), null);
    }
    public OrgContactCollectionWithReferencesRequestBuilder transitiveMemberOfAsOrgContact() {
        return new OrgContactCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/microsoft.graph.orgContact", getClient(), null);
    }

    public OrgContactWithReferenceRequestBuilder transitiveMemberOfAsOrgContact(final String id) {
        return new OrgContactWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMemberOf") + "/" + id + "/microsoft.graph.orgContact", getClient(), null);
    }
    public DirectoryObjectCollectionWithReferencesRequestBuilder transitiveMembers() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers"), getClient(), null);
    }

    public DirectoryObjectWithReferenceRequestBuilder transitiveMembers(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers") + "/" + id, getClient(), null);
    }
    public UserCollectionWithReferencesRequestBuilder transitiveMembersAsUser() {
        return new UserCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers") + "/microsoft.graph.user", getClient(), null);
    }

    public UserWithReferenceRequestBuilder transitiveMembersAsUser(final String id) {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers") + "/" + id + "/microsoft.graph.user", getClient(), null);
    }
    public GroupCollectionWithReferencesRequestBuilder transitiveMembersAsGroup() {
        return new GroupCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers") + "/microsoft.graph.group", getClient(), null);
    }

    public GroupWithReferenceRequestBuilder transitiveMembersAsGroup(final String id) {
        return new GroupWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers") + "/" + id + "/microsoft.graph.group", getClient(), null);
    }
    public ApplicationCollectionWithReferencesRequestBuilder transitiveMembersAsApplication() {
        return new ApplicationCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers") + "/microsoft.graph.application", getClient(), null);
    }

    public ApplicationWithReferenceRequestBuilder transitiveMembersAsApplication(final String id) {
        return new ApplicationWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers") + "/" + id + "/microsoft.graph.application", getClient(), null);
    }
    public ServicePrincipalCollectionWithReferencesRequestBuilder transitiveMembersAsServicePrincipal() {
        return new ServicePrincipalCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    public ServicePrincipalWithReferenceRequestBuilder transitiveMembersAsServicePrincipal(final String id) {
        return new ServicePrincipalWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    public DeviceCollectionWithReferencesRequestBuilder transitiveMembersAsDevice() {
        return new DeviceCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers") + "/microsoft.graph.device", getClient(), null);
    }

    public DeviceWithReferenceRequestBuilder transitiveMembersAsDevice(final String id) {
        return new DeviceWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers") + "/" + id + "/microsoft.graph.device", getClient(), null);
    }
    public OrgContactCollectionWithReferencesRequestBuilder transitiveMembersAsOrgContact() {
        return new OrgContactCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers") + "/microsoft.graph.orgContact", getClient(), null);
    }

    public OrgContactWithReferenceRequestBuilder transitiveMembersAsOrgContact(final String id) {
        return new OrgContactWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("transitiveMembers") + "/" + id + "/microsoft.graph.orgContact", getClient(), null);
    }
    public DirectoryObjectCollectionRequestBuilder acceptedSenders() {
        return new DirectoryObjectCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("acceptedSenders"), getClient(), null);
    }

    public DirectoryObjectRequestBuilder acceptedSenders(final String id) {
        return new DirectoryObjectRequestBuilder(getRequestUrlWithAdditionalSegment("acceptedSenders") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for Calendar
     *
     * @return the CalendarRequestBuilder instance
     */
    public CalendarRequestBuilder calendar() {
        return new CalendarRequestBuilder(getRequestUrlWithAdditionalSegment("calendar"), getClient(), null);
    }
    public EventCollectionRequestBuilder calendarView() {
        return new EventCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("calendarView"), getClient(), null);
    }

    public EventRequestBuilder calendarView(final String id) {
        return new EventRequestBuilder(getRequestUrlWithAdditionalSegment("calendarView") + "/" + id, getClient(), null);
    }
    public ConversationCollectionRequestBuilder conversations() {
        return new ConversationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("conversations"), getClient(), null);
    }

    public ConversationRequestBuilder conversations(final String id) {
        return new ConversationRequestBuilder(getRequestUrlWithAdditionalSegment("conversations") + "/" + id, getClient(), null);
    }
    public EventCollectionRequestBuilder events() {
        return new EventCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("events"), getClient(), null);
    }

    public EventRequestBuilder events(final String id) {
        return new EventRequestBuilder(getRequestUrlWithAdditionalSegment("events") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for ProfilePhoto
     *
     * @return the ProfilePhotoRequestBuilder instance
     */
    public ProfilePhotoRequestBuilder photo() {
        return new ProfilePhotoRequestBuilder(getRequestUrlWithAdditionalSegment("photo"), getClient(), null);
    }
    public ProfilePhotoCollectionRequestBuilder photos() {
        return new ProfilePhotoCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("photos"), getClient(), null);
    }

    public ProfilePhotoRequestBuilder photos(final String id) {
        return new ProfilePhotoRequestBuilder(getRequestUrlWithAdditionalSegment("photos") + "/" + id, getClient(), null);
    }
    public DirectoryObjectCollectionRequestBuilder rejectedSenders() {
        return new DirectoryObjectCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("rejectedSenders"), getClient(), null);
    }

    public DirectoryObjectRequestBuilder rejectedSenders(final String id) {
        return new DirectoryObjectRequestBuilder(getRequestUrlWithAdditionalSegment("rejectedSenders") + "/" + id, getClient(), null);
    }
    public ConversationThreadCollectionRequestBuilder threads() {
        return new ConversationThreadCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("threads"), getClient(), null);
    }

    public ConversationThreadRequestBuilder threads(final String id) {
        return new ConversationThreadRequestBuilder(getRequestUrlWithAdditionalSegment("threads") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for Drive
     *
     * @return the DriveRequestBuilder instance
     */
    public DriveRequestBuilder drive() {
        return new DriveRequestBuilder(getRequestUrlWithAdditionalSegment("drive"), getClient(), null);
    }
    public DriveCollectionRequestBuilder drives() {
        return new DriveCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("drives"), getClient(), null);
    }

    public DriveRequestBuilder drives(final String id) {
        return new DriveRequestBuilder(getRequestUrlWithAdditionalSegment("drives") + "/" + id, getClient(), null);
    }
    public SiteCollectionRequestBuilder sites() {
        return new SiteCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("sites"), getClient(), null);
    }

    public SiteRequestBuilder sites(final String id) {
        return new SiteRequestBuilder(getRequestUrlWithAdditionalSegment("sites") + "/" + id, getClient(), null);
    }
    public ExtensionCollectionRequestBuilder extensions() {
        return new ExtensionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("extensions"), getClient(), null);
    }

    public ExtensionRequestBuilder extensions(final String id) {
        return new ExtensionRequestBuilder(getRequestUrlWithAdditionalSegment("extensions") + "/" + id, getClient(), null);
    }
    public GroupLifecyclePolicyCollectionRequestBuilder groupLifecyclePolicies() {
        return new GroupLifecyclePolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("groupLifecyclePolicies"), getClient(), null);
    }

    public GroupLifecyclePolicyRequestBuilder groupLifecyclePolicies(final String id) {
        return new GroupLifecyclePolicyRequestBuilder(getRequestUrlWithAdditionalSegment("groupLifecyclePolicies") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for PlannerGroup
     *
     * @return the PlannerGroupRequestBuilder instance
     */
    public PlannerGroupRequestBuilder planner() {
        return new PlannerGroupRequestBuilder(getRequestUrlWithAdditionalSegment("planner"), getClient(), null);
    }

    /**
     * Gets the request builder for Onenote
     *
     * @return the OnenoteRequestBuilder instance
     */
    public OnenoteRequestBuilder onenote() {
        return new OnenoteRequestBuilder(getRequestUrlWithAdditionalSegment("onenote"), getClient(), null);
    }

    /**
     * Gets the request builder for Team
     *
     * @return the TeamRequestBuilder instance
     */
    public TeamRequestBuilder team() {
        return new TeamRequestBuilder(getRequestUrlWithAdditionalSegment("team"), getClient(), null);
    }

    public GroupAssignLicenseRequestBuilder assignLicense(final java.util.List<AssignedLicense> addLicenses, final java.util.List<java.util.UUID> removeLicenses) {
        return new GroupAssignLicenseRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assignLicense"), getClient(), null, addLicenses, removeLicenses);
    }

    public GroupValidatePropertiesRequestBuilder validateProperties(final String displayName, final String mailNickname, final java.util.UUID onBehalfOfUserId) {
        return new GroupValidatePropertiesRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.validateProperties"), getClient(), null, displayName, mailNickname, onBehalfOfUserId);
    }

    public GroupAddFavoriteRequestBuilder addFavorite() {
        return new GroupAddFavoriteRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.addFavorite"), getClient(), null);
    }

    public GroupRemoveFavoriteRequestBuilder removeFavorite() {
        return new GroupRemoveFavoriteRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.removeFavorite"), getClient(), null);
    }

    public GroupResetUnseenCountRequestBuilder resetUnseenCount() {
        return new GroupResetUnseenCountRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.resetUnseenCount"), getClient(), null);
    }

    public GroupSubscribeByMailRequestBuilder subscribeByMail() {
        return new GroupSubscribeByMailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.subscribeByMail"), getClient(), null);
    }

    public GroupUnsubscribeByMailRequestBuilder unsubscribeByMail() {
        return new GroupUnsubscribeByMailRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.unsubscribeByMail"), getClient(), null);
    }

    public GroupRenewRequestBuilder renew() {
        return new GroupRenewRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.renew"), getClient(), null);
    }
}
