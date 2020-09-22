// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Team;
import com.microsoft.graph.models.generated.TeamVisibilityType;
import com.microsoft.graph.models.generated.ClonableTeamParts;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ChatMessage;
import com.microsoft.graph.requests.extensions.IChannelCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IChannelRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsAppInstallationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsAppInstallationRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationMemberCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationMemberRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsAsyncOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsAsyncOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.IScheduleRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsTemplateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Team Request Builder.
 */
public interface ITeamRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ITeamRequest instance
     */
    ITeamRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the ITeamRequest instance
     */
    ITeamRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    /**
     * Gets the request builder for Schedule
     *
     * @return the IScheduleRequestBuilder instance
     */
    IScheduleRequestBuilder schedule();

    IChannelCollectionRequestBuilder channels();

    IChannelRequestBuilder channels(final String id);

    /**
     * Gets the request builder for Group
     *
     * @return the IGroupWithReferenceRequestBuilder instance
     */
    IGroupWithReferenceRequestBuilder group();

    ITeamsAppInstallationCollectionRequestBuilder installedApps();

    ITeamsAppInstallationRequestBuilder installedApps(final String id);

    IConversationMemberCollectionRequestBuilder members();

    IConversationMemberRequestBuilder members(final String id);

    ITeamsAsyncOperationCollectionRequestBuilder operations();

    ITeamsAsyncOperationRequestBuilder operations(final String id);

    /**
     * Gets the request builder for Channel
     *
     * @return the IChannelRequestBuilder instance
     */
    IChannelRequestBuilder primaryChannel();

    /**
     * Gets the request builder for TeamsTemplate
     *
     * @return the ITeamsTemplateWithReferenceRequestBuilder instance
     */
    ITeamsTemplateWithReferenceRequestBuilder template();
    ITeamArchiveRequestBuilder archive(final Boolean shouldSetSpoSiteReadOnlyForMembers);
    ITeamCloneRequestBuilder clone(final String displayName, final String description, final String mailNickname, final String classification, final TeamVisibilityType visibility, final EnumSet<ClonableTeamParts> partsToClone);
    ITeamUnarchiveRequestBuilder unarchive();

}