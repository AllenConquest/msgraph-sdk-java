// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Team;
import com.microsoft.graph.requests.extensions.TeamCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.TeamCollectionPage;
import com.microsoft.graph.requests.extensions.TeamCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Team Collection Page.
 */
public class TeamCollectionPage extends BaseCollectionPage<Team, TeamCollectionRequestBuilder> {

    /**
     * A collection page for Team
     *
     * @param response the serialized TeamCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public TeamCollectionPage(@Nonnull final TeamCollectionResponse response, @Nonnull final TeamCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
