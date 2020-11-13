// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SoftwareUpdateStatusSummary;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Software Update Status Summary With Reference Request.
 */
public class SoftwareUpdateStatusSummaryWithReferenceRequest extends BaseRequest {

    /**
     * The request for the SoftwareUpdateStatusSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SoftwareUpdateStatusSummaryWithReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SoftwareUpdateStatusSummary.class);
    }

    public void post(@Nonnull final SoftwareUpdateStatusSummary newSoftwareUpdateStatusSummary, @Nullable final IJsonBackedObject payload, @Nonnull final ICallback<? super SoftwareUpdateStatusSummary> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    @Nullable
    public SoftwareUpdateStatusSummary post(@Nonnull final SoftwareUpdateStatusSummary newSoftwareUpdateStatusSummary, @Nullable final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newSoftwareUpdateStatusSummary;
        }
        return null;
    }

    public void get(@Nonnull final ICallback<? super SoftwareUpdateStatusSummary> callback) {
        send(HttpMethod.GET, callback, null);
    }

    @Nullable
    public SoftwareUpdateStatusSummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(@Nonnull final ICallback<? super SoftwareUpdateStatusSummary> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(@Nonnull final SoftwareUpdateStatusSummary sourceSoftwareUpdateStatusSummary, @Nonnull final ICallback<? super SoftwareUpdateStatusSummary> callback) {
		send(HttpMethod.PATCH, callback, sourceSoftwareUpdateStatusSummary);
	}

    @Nullable
	public SoftwareUpdateStatusSummary patch(@Nonnull final SoftwareUpdateStatusSummary sourceSoftwareUpdateStatusSummary) throws ClientException {
		return send(HttpMethod.PATCH, sourceSoftwareUpdateStatusSummary);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public SoftwareUpdateStatusSummaryWithReferenceRequest select(@Nonnull final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (SoftwareUpdateStatusSummaryWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public SoftwareUpdateStatusSummaryWithReferenceRequest expand(@Nonnull final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (SoftwareUpdateStatusSummaryWithReferenceRequest)this;
    }
}
