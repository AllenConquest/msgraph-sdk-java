// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Device App Management Request Builder.
 */
public interface IBaseDeviceAppManagementRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IDeviceAppManagementRequest instance
     */
    IDeviceAppManagementRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IDeviceAppManagementRequest instance
     */
    IDeviceAppManagementRequest buildRequest(final java.util.List<? extends Option> requestOptions);

    IMobileAppCollectionRequestBuilder mobileApps();

    IMobileAppRequestBuilder mobileApps(final String id);

    IMobileAppCategoryCollectionRequestBuilder mobileAppCategories();

    IMobileAppCategoryRequestBuilder mobileAppCategories(final String id);

    IManagedDeviceMobileAppConfigurationCollectionRequestBuilder mobileAppConfigurations();

    IManagedDeviceMobileAppConfigurationRequestBuilder mobileAppConfigurations(final String id);

    IManagedAppPolicyCollectionRequestBuilder managedAppPolicies();

    IManagedAppPolicyRequestBuilder managedAppPolicies(final String id);

    IIosManagedAppProtectionCollectionRequestBuilder iosManagedAppProtections();

    IIosManagedAppProtectionRequestBuilder iosManagedAppProtections(final String id);

    IAndroidManagedAppProtectionCollectionRequestBuilder androidManagedAppProtections();

    IAndroidManagedAppProtectionRequestBuilder androidManagedAppProtections(final String id);

    IDefaultManagedAppProtectionCollectionRequestBuilder defaultManagedAppProtections();

    IDefaultManagedAppProtectionRequestBuilder defaultManagedAppProtections(final String id);

    ITargetedManagedAppConfigurationCollectionRequestBuilder targetedManagedAppConfigurations();

    ITargetedManagedAppConfigurationRequestBuilder targetedManagedAppConfigurations(final String id);

    IMdmWindowsInformationProtectionPolicyCollectionRequestBuilder mdmWindowsInformationProtectionPolicies();

    IMdmWindowsInformationProtectionPolicyRequestBuilder mdmWindowsInformationProtectionPolicies(final String id);

    IWindowsInformationProtectionPolicyCollectionRequestBuilder windowsInformationProtectionPolicies();

    IWindowsInformationProtectionPolicyRequestBuilder windowsInformationProtectionPolicies(final String id);

    IManagedAppRegistrationCollectionRequestBuilder managedAppRegistrations();

    IManagedAppRegistrationRequestBuilder managedAppRegistrations(final String id);

    IManagedAppStatusCollectionRequestBuilder managedAppStatuses();

    IManagedAppStatusRequestBuilder managedAppStatuses(final String id);

    IManagedEBookCollectionRequestBuilder managedEBooks();

    IManagedEBookRequestBuilder managedEBooks(final String id);
    IDeviceAppManagementSyncMicrosoftStoreForBusinessAppsRequestBuilder syncMicrosoftStoreForBusinessApps();

}
