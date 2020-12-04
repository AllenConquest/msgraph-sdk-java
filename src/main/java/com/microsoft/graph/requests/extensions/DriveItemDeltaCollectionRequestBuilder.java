// Template Source: Templates\Java\requests_extensions\BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DriveItem;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.DriveItemDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemDeltaCollectionRequest;
import com.microsoft.graph.requests.extensions.DriveItemDeltaCollectionResponse;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item Delta Collection Request Builder.
 */
public class DriveItemDeltaCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<DriveItem, DriveItemDeltaCollectionRequestBuilder, DriveItemDeltaCollectionResponse, DriveItemDeltaCollectionPage, DriveItemDeltaCollectionRequest> {

    /**
     * The request builder for this collection of DriveItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DriveItemDeltaCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DriveItemDeltaCollectionRequestBuilder.class, DriveItemDeltaCollectionRequest.class);
    }
    /**
     * The request builder for this collection of DriveItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param token the token
     */
    public DriveItemDeltaCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final String token) {
        super(requestUrl, client, requestOptions, DriveItemDeltaCollectionRequestBuilder.class, DriveItemDeltaCollectionRequest.class);
     	 if(token!=null){
			functionOptions.add(new com.microsoft.graph.options.FunctionOption("token", token));
		}
      }
    
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the DriveItemDeltaCollectionRequest instance
     */
    @Override
    @Nonnull
    public DriveItemDeltaCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final DriveItemDeltaCollectionRequest request = super.buildRequest(requestOptions);

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
