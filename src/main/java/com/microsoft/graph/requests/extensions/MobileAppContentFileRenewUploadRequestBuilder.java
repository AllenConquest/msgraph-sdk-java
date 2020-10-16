// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.MobileAppContentFileRenewUploadRequest;
import com.microsoft.graph.models.extensions.MobileAppContentFile;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Content File Renew Upload Request Builder.
 */
public class MobileAppContentFileRenewUploadRequestBuilder extends BaseActionRequestBuilder<MobileAppContentFile> {

    /**
     * The request builder for this MobileAppContentFileRenewUpload
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileAppContentFileRenewUploadRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the MobileAppContentFileRenewUploadRequest
     *
     * @param requestOptions the options for the request
     * @return the MobileAppContentFileRenewUploadRequest instance
     */
    public MobileAppContentFileRenewUploadRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the MobileAppContentFileRenewUploadRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the MobileAppContentFileRenewUploadRequest instance
     */
    public MobileAppContentFileRenewUploadRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        MobileAppContentFileRenewUploadRequest request = new MobileAppContentFileRenewUploadRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
