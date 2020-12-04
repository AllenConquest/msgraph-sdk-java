// Template Source: Templates\Java\models_extensions\BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.AssignedPlan;
import com.microsoft.graph.models.extensions.PrivacyProfile;
import com.microsoft.graph.models.extensions.ProvisionedPlan;
import com.microsoft.graph.models.extensions.VerifiedDomain;
import com.microsoft.graph.models.generated.MdmAuthority;
import com.microsoft.graph.models.extensions.CertificateBasedAuthConfiguration;
import com.microsoft.graph.models.extensions.Extension;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.requests.extensions.CertificateBasedAuthConfigurationCollectionPage;
import com.microsoft.graph.requests.extensions.ExtensionCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Organization.
 */
public class Organization extends DirectoryObject implements IJsonBackedObject {


    /**
     * The Assigned Plans.
     * The collection of service plans associated with the tenant. Not nullable.
     */
    @SerializedName(value = "assignedPlans", alternate = {"AssignedPlans"})
    @Expose
	@Nullable
    public java.util.List<AssignedPlan> assignedPlans;

    /**
     * The Business Phones.
     * Telephone number for the organization. NOTE: Although this is a string collection, only one number can be set for this property.
     */
    @SerializedName(value = "businessPhones", alternate = {"BusinessPhones"})
    @Expose
	@Nullable
    public java.util.List<String> businessPhones;

    /**
     * The City.
     * City name of the address for the organization.
     */
    @SerializedName(value = "city", alternate = {"City"})
    @Expose
	@Nullable
    public String city;

    /**
     * The Country.
     * Country/region name of the address for the organization.
     */
    @SerializedName(value = "country", alternate = {"Country"})
    @Expose
	@Nullable
    public String country;

    /**
     * The Country Letter Code.
     * Country/region abbreviation for the organization.
     */
    @SerializedName(value = "countryLetterCode", alternate = {"CountryLetterCode"})
    @Expose
	@Nullable
    public String countryLetterCode;

    /**
     * The Created Date Time.
     * Timestamp of when the organization was created. The value cannot be modified and is automatically populated when the organization is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar createdDateTime;

    /**
     * The Display Name.
     * The display name for the tenant.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Marketing Notification Emails.
     * Not nullable.
     */
    @SerializedName(value = "marketingNotificationEmails", alternate = {"MarketingNotificationEmails"})
    @Expose
	@Nullable
    public java.util.List<String> marketingNotificationEmails;

    /**
     * The On Premises Last Sync Date Time.
     * The time and date at which the tenant was last synced with the on-premise directory. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
     */
    @SerializedName(value = "onPremisesLastSyncDateTime", alternate = {"OnPremisesLastSyncDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar onPremisesLastSyncDateTime;

    /**
     * The On Premises Sync Enabled.
     * true if this object is synced from an on-premises directory; false if this object was originally synced from an on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory (default).
     */
    @SerializedName(value = "onPremisesSyncEnabled", alternate = {"OnPremisesSyncEnabled"})
    @Expose
	@Nullable
    public Boolean onPremisesSyncEnabled;

    /**
     * The Postal Code.
     * Postal code of the address for the organization.
     */
    @SerializedName(value = "postalCode", alternate = {"PostalCode"})
    @Expose
	@Nullable
    public String postalCode;

    /**
     * The Preferred Language.
     * The preferred language for the organization. Should follow ISO 639-1 Code; for example 'en'.
     */
    @SerializedName(value = "preferredLanguage", alternate = {"PreferredLanguage"})
    @Expose
	@Nullable
    public String preferredLanguage;

    /**
     * The Privacy Profile.
     * The privacy profile of an organization.
     */
    @SerializedName(value = "privacyProfile", alternate = {"PrivacyProfile"})
    @Expose
	@Nullable
    public PrivacyProfile privacyProfile;

    /**
     * The Provisioned Plans.
     * Not nullable.
     */
    @SerializedName(value = "provisionedPlans", alternate = {"ProvisionedPlans"})
    @Expose
	@Nullable
    public java.util.List<ProvisionedPlan> provisionedPlans;

    /**
     * The Security Compliance Notification Mails.
     * 
     */
    @SerializedName(value = "securityComplianceNotificationMails", alternate = {"SecurityComplianceNotificationMails"})
    @Expose
	@Nullable
    public java.util.List<String> securityComplianceNotificationMails;

    /**
     * The Security Compliance Notification Phones.
     * 
     */
    @SerializedName(value = "securityComplianceNotificationPhones", alternate = {"SecurityComplianceNotificationPhones"})
    @Expose
	@Nullable
    public java.util.List<String> securityComplianceNotificationPhones;

    /**
     * The State.
     * State name of the address for the organization.
     */
    @SerializedName(value = "state", alternate = {"State"})
    @Expose
	@Nullable
    public String state;

    /**
     * The Street.
     * Street name of the address for organization.
     */
    @SerializedName(value = "street", alternate = {"Street"})
    @Expose
	@Nullable
    public String street;

    /**
     * The Technical Notification Mails.
     * Not nullable.
     */
    @SerializedName(value = "technicalNotificationMails", alternate = {"TechnicalNotificationMails"})
    @Expose
	@Nullable
    public java.util.List<String> technicalNotificationMails;

    /**
     * The Tenant Type.
     * 
     */
    @SerializedName(value = "tenantType", alternate = {"TenantType"})
    @Expose
	@Nullable
    public String tenantType;

    /**
     * The Verified Domains.
     * The collection of domains associated with this tenant. Not nullable.
     */
    @SerializedName(value = "verifiedDomains", alternate = {"VerifiedDomains"})
    @Expose
	@Nullable
    public java.util.List<VerifiedDomain> verifiedDomains;

    /**
     * The Mobile Device Management Authority.
     * Mobile device management authority. Possible values are: unknown, intune, sccm, office365.
     */
    @SerializedName(value = "mobileDeviceManagementAuthority", alternate = {"MobileDeviceManagementAuthority"})
    @Expose
	@Nullable
    public MdmAuthority mobileDeviceManagementAuthority;

    /**
     * The Certificate Based Auth Configuration.
     * Navigation property to manage certificate-based authentication configuration. Only a single instance of certificateBasedAuthConfiguration can be created in the collection.
     */
	@Nullable
    public CertificateBasedAuthConfigurationCollectionPage certificateBasedAuthConfiguration;

    /**
     * The Extensions.
     * The collection of open extensions defined for the organization. Read-only. Nullable.
     */
    @SerializedName(value = "extensions", alternate = {"Extensions"})
    @Expose
	@Nullable
    public ExtensionCollectionPage extensions;


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


        if (json.has("certificateBasedAuthConfiguration")) {
            certificateBasedAuthConfiguration = serializer.deserializeObject(json.get("certificateBasedAuthConfiguration").toString(), CertificateBasedAuthConfigurationCollectionPage.class);
        }

        if (json.has("extensions")) {
            extensions = serializer.deserializeObject(json.get("extensions").toString(), ExtensionCollectionPage.class);
        }
    }
}
