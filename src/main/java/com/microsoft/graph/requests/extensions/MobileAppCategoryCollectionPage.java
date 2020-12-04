// Template Source: Templates\Java\requests_extensions\BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MobileAppCategory;
import com.microsoft.graph.requests.extensions.MobileAppCategoryCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.MobileAppCategoryCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Category Collection Page.
 */
public class MobileAppCategoryCollectionPage extends BaseCollectionPage<MobileAppCategory, MobileAppCategoryCollectionRequestBuilder> {

    /**
     * A collection page for MobileAppCategory
     *
     * @param response the serialized MobileAppCategoryCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MobileAppCategoryCollectionPage(@Nonnull final MobileAppCategoryCollectionResponse response, @Nonnull final MobileAppCategoryCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for MobileAppCategory
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public MobileAppCategoryCollectionPage(@Nonnull final java.util.List<MobileAppCategory> pageContents, @Nullable final MobileAppCategoryCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
