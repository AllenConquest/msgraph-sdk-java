// Template Source: Templates\Java\requests_extensions\BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SwapShiftsChangeRequest;
import com.microsoft.graph.requests.extensions.SwapShiftsChangeRequestCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.SwapShiftsChangeRequestCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Swap Shifts Change Request Collection Page.
 */
public class SwapShiftsChangeRequestCollectionPage extends BaseCollectionPage<SwapShiftsChangeRequest, SwapShiftsChangeRequestCollectionRequestBuilder> {

    /**
     * A collection page for SwapShiftsChangeRequest
     *
     * @param response the serialized SwapShiftsChangeRequestCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public SwapShiftsChangeRequestCollectionPage(@Nonnull final SwapShiftsChangeRequestCollectionResponse response, @Nonnull final SwapShiftsChangeRequestCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for SwapShiftsChangeRequest
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public SwapShiftsChangeRequestCollectionPage(@Nonnull final java.util.List<SwapShiftsChangeRequest> pageContents, @Nullable final SwapShiftsChangeRequestCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
