// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ContactFolder;
import com.microsoft.graph.requests.extensions.ContactFolderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ContactFolderRequestBuilder;
import com.microsoft.graph.requests.extensions.ContactCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ContactRequestBuilder;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Contact Folder Request Builder.
 */
public class ContactFolderRequestBuilder extends BaseRequestBuilder<ContactFolder> {

    /**
     * The request builder for the ContactFolder
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ContactFolderRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ContactFolderRequest instance
     */
    public ContactFolderRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ContactFolderRequest instance
     */
    public ContactFolderRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.ContactFolderRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public ContactFolderCollectionRequestBuilder childFolders() {
        return new ContactFolderCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("childFolders"), getClient(), null);
    }

    public ContactFolderRequestBuilder childFolders(final String id) {
        return new ContactFolderRequestBuilder(getRequestUrlWithAdditionalSegment("childFolders") + "/" + id, getClient(), null);
    }
    public ContactCollectionRequestBuilder contacts() {
        return new ContactCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("contacts"), getClient(), null);
    }

    public ContactRequestBuilder contacts(final String id) {
        return new ContactRequestBuilder(getRequestUrlWithAdditionalSegment("contacts") + "/" + id, getClient(), null);
    }
    public MultiValueLegacyExtendedPropertyCollectionRequestBuilder multiValueExtendedProperties() {
        return new MultiValueLegacyExtendedPropertyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("multiValueExtendedProperties"), getClient(), null);
    }

    public MultiValueLegacyExtendedPropertyRequestBuilder multiValueExtendedProperties(final String id) {
        return new MultiValueLegacyExtendedPropertyRequestBuilder(getRequestUrlWithAdditionalSegment("multiValueExtendedProperties") + "/" + id, getClient(), null);
    }
    public SingleValueLegacyExtendedPropertyCollectionRequestBuilder singleValueExtendedProperties() {
        return new SingleValueLegacyExtendedPropertyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("singleValueExtendedProperties"), getClient(), null);
    }

    public SingleValueLegacyExtendedPropertyRequestBuilder singleValueExtendedProperties(final String id) {
        return new SingleValueLegacyExtendedPropertyRequestBuilder(getRequestUrlWithAdditionalSegment("singleValueExtendedProperties") + "/" + id, getClient(), null);
    }
}
