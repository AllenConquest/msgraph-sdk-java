// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Site;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.SiteRemoveCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteRemoveCollectionRequest;
import com.microsoft.graph.requests.extensions.SiteRemoveCollectionResponse;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseActionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Site Remove Collection Request Builder.
 */
public class SiteRemoveCollectionRequestBuilder extends BaseActionCollectionRequestBuilder<Site, SiteRemoveCollectionRequestBuilder, SiteRemoveCollectionResponse, SiteRemoveCollectionPage, SiteRemoveCollectionRequest> {

    /**
     * The request builder for this collection of Site
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param value the value
     */
    public SiteRemoveCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.List<Site> value) {
        super(requestUrl, client, requestOptions, SiteRemoveCollectionRequestBuilder.class, SiteRemoveCollectionResponse.class, SiteRemoveCollectionPage.class, SiteRemoveCollectionRequest.class);
  	 if(value!=null){
			bodyParams.put("value", value);
		}
      }
    
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the SiteRemoveCollectionRequest instance
     */
     @Override
    public SiteRemoveCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final SiteRemoveCollectionRequest request = super.buildRequest(requestOptions);

        if (hasParameter("value")) {
            request.body.value = getParameter("value");
        }
  
        return request;
    }
}
