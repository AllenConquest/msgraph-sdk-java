// Template Source: Templates\Java\requests_extensions\BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DirectoryRole;
import com.microsoft.graph.requests.extensions.DirectoryRoleCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.DirectoryRoleCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Role Collection Page.
 */
public class DirectoryRoleCollectionPage extends BaseCollectionPage<DirectoryRole, DirectoryRoleCollectionRequestBuilder> {

    /**
     * A collection page for DirectoryRole
     *
     * @param response the serialized DirectoryRoleCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DirectoryRoleCollectionPage(@Nonnull final DirectoryRoleCollectionResponse response, @Nonnull final DirectoryRoleCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for DirectoryRole
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DirectoryRoleCollectionPage(@Nonnull final java.util.List<DirectoryRole> pageContents, @Nullable final DirectoryRoleCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
