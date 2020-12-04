// Template Source: Templates\Java\models_extensions\BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.WindowsArchitecture;
import com.microsoft.graph.models.generated.WindowsDeviceType;
import com.microsoft.graph.models.extensions.WindowsMinimumOperatingSystem;
import com.microsoft.graph.models.extensions.MobileLobApp;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Universal App X.
 */
public class WindowsUniversalAppX extends MobileLobApp implements IJsonBackedObject {


    /**
     * The Applicable Architectures.
     * The Windows architecture(s) for which this app can run on. Possible values are: none, x86, x64, arm, neutral.
     */
    @SerializedName(value = "applicableArchitectures", alternate = {"ApplicableArchitectures"})
    @Expose
	@Nullable
    public EnumSet<WindowsArchitecture> applicableArchitectures;

    /**
     * The Applicable Device Types.
     * The Windows device type(s) for which this app can run on. Possible values are: none, desktop, mobile, holographic, team.
     */
    @SerializedName(value = "applicableDeviceTypes", alternate = {"ApplicableDeviceTypes"})
    @Expose
	@Nullable
    public EnumSet<WindowsDeviceType> applicableDeviceTypes;

    /**
     * The Identity Name.
     * The Identity Name.
     */
    @SerializedName(value = "identityName", alternate = {"IdentityName"})
    @Expose
	@Nullable
    public String identityName;

    /**
     * The Identity Publisher Hash.
     * The Identity Publisher Hash.
     */
    @SerializedName(value = "identityPublisherHash", alternate = {"IdentityPublisherHash"})
    @Expose
	@Nullable
    public String identityPublisherHash;

    /**
     * The Identity Resource Identifier.
     * The Identity Resource Identifier.
     */
    @SerializedName(value = "identityResourceIdentifier", alternate = {"IdentityResourceIdentifier"})
    @Expose
	@Nullable
    public String identityResourceIdentifier;

    /**
     * The Identity Version.
     * The identity version.
     */
    @SerializedName(value = "identityVersion", alternate = {"IdentityVersion"})
    @Expose
	@Nullable
    public String identityVersion;

    /**
     * The Is Bundle.
     * Whether or not the app is a bundle.
     */
    @SerializedName(value = "isBundle", alternate = {"IsBundle"})
    @Expose
	@Nullable
    public Boolean isBundle;

    /**
     * The Minimum Supported Operating System.
     * The value for the minimum applicable operating system.
     */
    @SerializedName(value = "minimumSupportedOperatingSystem", alternate = {"MinimumSupportedOperatingSystem"})
    @Expose
	@Nullable
    public WindowsMinimumOperatingSystem minimumSupportedOperatingSystem;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    @Nullable
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
	@Override
    @Nullable
    public ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
