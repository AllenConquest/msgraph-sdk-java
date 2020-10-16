// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.models.extensions.ExtensionProperty;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionRequest;
import com.microsoft.graph.requests.extensions.DirectoryObjectValidatePropertiesRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectGetAvailableExtensionPropertiesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectGetByIdsCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Object Collection Request Builder.
 */
public class DirectoryObjectCollectionRequestBuilder extends BaseCollectionRequestBuilder<DirectoryObject, DirectoryObjectRequestBuilder, DirectoryObjectCollectionResponse, DirectoryObjectCollectionPage, DirectoryObjectCollectionRequest> {

    /**
     * The request builder for this collection of DirectoryObject
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DirectoryObjectCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DirectoryObjectRequestBuilder.class, DirectoryObjectCollectionResponse.class, DirectoryObjectCollectionPage.class, DirectoryObjectCollectionRequest.class);
    }



    public DirectoryObjectValidatePropertiesRequestBuilder validateProperties(final String entityType, final String displayName, final String mailNickname, final java.util.UUID onBehalfOfUserId) {
        return new DirectoryObjectValidatePropertiesRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.validateProperties"), getClient(), null, entityType, displayName, mailNickname, onBehalfOfUserId);
    }

    public DirectoryObjectGetAvailableExtensionPropertiesCollectionRequestBuilder getAvailableExtensionProperties(final Boolean isSyncedFromOnPremises) {
        return new DirectoryObjectGetAvailableExtensionPropertiesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getAvailableExtensionProperties"), getClient(), null, isSyncedFromOnPremises);
    }

    public DirectoryObjectGetByIdsCollectionRequestBuilder getByIds(final java.util.List<String> ids, final java.util.List<String> types) {
        return new DirectoryObjectGetByIdsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getByIds"), getClient(), null, ids, types);
    }
}
