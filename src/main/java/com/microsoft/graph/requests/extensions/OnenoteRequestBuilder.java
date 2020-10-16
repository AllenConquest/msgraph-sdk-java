// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Onenote;
import com.microsoft.graph.requests.extensions.NotebookCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.NotebookRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenotePageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenotePageRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.SectionGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SectionGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteSectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteSectionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote Request Builder.
 */
public class OnenoteRequestBuilder extends BaseRequestBuilder<Onenote> {

    /**
     * The request builder for the Onenote
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OnenoteRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the OnenoteRequest instance
     */
    public OnenoteRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the OnenoteRequest instance
     */
    public OnenoteRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.OnenoteRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public NotebookCollectionRequestBuilder notebooks() {
        return new NotebookCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("notebooks"), getClient(), null);
    }

    public NotebookRequestBuilder notebooks(final String id) {
        return new NotebookRequestBuilder(getRequestUrlWithAdditionalSegment("notebooks") + "/" + id, getClient(), null);
    }
    public OnenoteOperationCollectionRequestBuilder operations() {
        return new OnenoteOperationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("operations"), getClient(), null);
    }

    public OnenoteOperationRequestBuilder operations(final String id) {
        return new OnenoteOperationRequestBuilder(getRequestUrlWithAdditionalSegment("operations") + "/" + id, getClient(), null);
    }
    public OnenotePageCollectionRequestBuilder pages() {
        return new OnenotePageCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("pages"), getClient(), null);
    }

    public OnenotePageRequestBuilder pages(final String id) {
        return new OnenotePageRequestBuilder(getRequestUrlWithAdditionalSegment("pages") + "/" + id, getClient(), null);
    }
    public OnenoteResourceCollectionRequestBuilder resources() {
        return new OnenoteResourceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("resources"), getClient(), null);
    }

    public OnenoteResourceRequestBuilder resources(final String id) {
        return new OnenoteResourceRequestBuilder(getRequestUrlWithAdditionalSegment("resources") + "/" + id, getClient(), null);
    }
    public SectionGroupCollectionRequestBuilder sectionGroups() {
        return new SectionGroupCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("sectionGroups"), getClient(), null);
    }

    public SectionGroupRequestBuilder sectionGroups(final String id) {
        return new SectionGroupRequestBuilder(getRequestUrlWithAdditionalSegment("sectionGroups") + "/" + id, getClient(), null);
    }
    public OnenoteSectionCollectionRequestBuilder sections() {
        return new OnenoteSectionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("sections"), getClient(), null);
    }

    public OnenoteSectionRequestBuilder sections(final String id) {
        return new OnenoteSectionRequestBuilder(getRequestUrlWithAdditionalSegment("sections") + "/" + id, getClient(), null);
    }
}
