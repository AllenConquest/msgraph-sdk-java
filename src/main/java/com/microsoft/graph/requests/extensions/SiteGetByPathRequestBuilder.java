// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.SiteGetByPathRequest;
import com.microsoft.graph.models.extensions.Site;
import com.microsoft.graph.http.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Site Get By Path Request Builder.
 */
public class SiteGetByPathRequestBuilder extends BaseFunctionRequestBuilder<Site> {

    /**
     * The request builder for this SiteGetByPath
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param path the path
     */
    public SiteGetByPathRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String path) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new com.microsoft.graph.options.FunctionOption("path", path));
    }

    /**
     * Creates the SiteGetByPathRequest
     *
     * @param requestOptions the options for the request
     * @return the SiteGetByPathRequest instance
     */
    public SiteGetByPathRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the SiteGetByPathRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the SiteGetByPathRequest instance
     */
    public SiteGetByPathRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        SiteGetByPathRequest request = new SiteGetByPathRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }

    /**
     * Gets the request builder for User
     *
     * @return the UserWithReferenceRequestBuilder instance
     */
    public UserWithReferenceRequestBuilder createdByUser() {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("createdByUser"), getClient(), null);
    }

    /**
     * Gets the request builder for User
     *
     * @return the UserWithReferenceRequestBuilder instance
     */
    public UserWithReferenceRequestBuilder lastModifiedByUser() {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("lastModifiedByUser"), getClient(), null);
    }

    /**
     * Gets the request builder for ItemAnalytics
     *
     * @return the ItemAnalyticsWithReferenceRequestBuilder instance
     */
    public ItemAnalyticsWithReferenceRequestBuilder analytics() {
        return new ItemAnalyticsWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("analytics"), getClient(), null);
    }
    public ColumnDefinitionCollectionRequestBuilder columns() {
        return new ColumnDefinitionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("columns"), getClient(), null);
    }

    public ColumnDefinitionRequestBuilder columns(final String id) {
        return new ColumnDefinitionRequestBuilder(getRequestUrlWithAdditionalSegment("columns") + "/" + id, getClient(), null);
    }
    public ContentTypeCollectionRequestBuilder contentTypes() {
        return new ContentTypeCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("contentTypes"), getClient(), null);
    }

    public ContentTypeRequestBuilder contentTypes(final String id) {
        return new ContentTypeRequestBuilder(getRequestUrlWithAdditionalSegment("contentTypes") + "/" + id, getClient(), null);
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
    public BaseItemCollectionRequestBuilder items() {
        return new BaseItemCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("items"), getClient(), null);
    }

    public BaseItemRequestBuilder items(final String id) {
        return new BaseItemRequestBuilder(getRequestUrlWithAdditionalSegment("items") + "/" + id, getClient(), null);
    }
    public ListCollectionRequestBuilder lists() {
        return new ListCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("lists"), getClient(), null);
    }

    public ListRequestBuilder lists(final String id) {
        return new ListRequestBuilder(getRequestUrlWithAdditionalSegment("lists") + "/" + id, getClient(), null);
    }
    public SiteCollectionRequestBuilder sites() {
        return new SiteCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("sites"), getClient(), null);
    }

    public SiteRequestBuilder sites(final String id) {
        return new SiteRequestBuilder(getRequestUrlWithAdditionalSegment("sites") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for Onenote
     *
     * @return the OnenoteRequestBuilder instance
     */
    public OnenoteRequestBuilder onenote() {
        return new OnenoteRequestBuilder(getRequestUrlWithAdditionalSegment("onenote"), getClient(), null);
    }
}
