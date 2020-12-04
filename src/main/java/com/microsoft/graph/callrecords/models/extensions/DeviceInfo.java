// Template Source: Templates\Java\models_extensions\BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.callrecords.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Info.
 */
public class DeviceInfo implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Capture Device Driver.
     * Name of the capture device driver used by the media endpoint.
     */
    @SerializedName(value = "captureDeviceDriver", alternate = {"CaptureDeviceDriver"})
    @Expose
	@Nullable
    public String captureDeviceDriver;

    /**
     * The Capture Device Name.
     * Name of the capture device used by the media endpoint.
     */
    @SerializedName(value = "captureDeviceName", alternate = {"CaptureDeviceName"})
    @Expose
	@Nullable
    public String captureDeviceName;

    /**
     * The Capture Not Functioning Event Ratio.
     * Fraction of the call that the media endpoint detected the capture device was not working properly.
     */
    @SerializedName(value = "captureNotFunctioningEventRatio", alternate = {"CaptureNotFunctioningEventRatio"})
    @Expose
	@Nullable
    public Float captureNotFunctioningEventRatio;

    /**
     * The Cpu Insufficent Event Ratio.
     * Fraction of the call that the media endpoint detected the CPU resources available were insufficient and caused poor quality of the audio sent and received.
     */
    @SerializedName(value = "cpuInsufficentEventRatio", alternate = {"CpuInsufficentEventRatio"})
    @Expose
	@Nullable
    public Float cpuInsufficentEventRatio;

    /**
     * The Device Clipping Event Ratio.
     * Fraction of the call that the media endpoint detected clipping in the captured audio that caused poor quality of the audio being sent.
     */
    @SerializedName(value = "deviceClippingEventRatio", alternate = {"DeviceClippingEventRatio"})
    @Expose
	@Nullable
    public Float deviceClippingEventRatio;

    /**
     * The Device Glitch Event Ratio.
     * Fraction of the call that the media endpoint detected glitches or gaps in the audio played or captured that caused poor quality of the audio being sent or received.
     */
    @SerializedName(value = "deviceGlitchEventRatio", alternate = {"DeviceGlitchEventRatio"})
    @Expose
	@Nullable
    public Float deviceGlitchEventRatio;

    /**
     * The Howling Event Count.
     * Number of times during the call that the media endpoint detected howling or screeching audio.
     */
    @SerializedName(value = "howlingEventCount", alternate = {"HowlingEventCount"})
    @Expose
	@Nullable
    public Integer howlingEventCount;

    /**
     * The Initial Signal Level Root Mean Square.
     * The root mean square (RMS) of the incoming signal of up to the first 30 seconds of the call.
     */
    @SerializedName(value = "initialSignalLevelRootMeanSquare", alternate = {"InitialSignalLevelRootMeanSquare"})
    @Expose
	@Nullable
    public Float initialSignalLevelRootMeanSquare;

    /**
     * The Low Speech Level Event Ratio.
     * Fraction of the call that the media endpoint detected low speech level that caused poor quality of the audio being sent.
     */
    @SerializedName(value = "lowSpeechLevelEventRatio", alternate = {"LowSpeechLevelEventRatio"})
    @Expose
	@Nullable
    public Float lowSpeechLevelEventRatio;

    /**
     * The Low Speech To Noise Event Ratio.
     * Fraction of the call that the media endpoint detected low speech to noise level that caused poor quality of the audio being sent.
     */
    @SerializedName(value = "lowSpeechToNoiseEventRatio", alternate = {"LowSpeechToNoiseEventRatio"})
    @Expose
	@Nullable
    public Float lowSpeechToNoiseEventRatio;

    /**
     * The Mic Glitch Rate.
     * Glitches per 5 minute interval for the media endpoint's microphone.
     */
    @SerializedName(value = "micGlitchRate", alternate = {"MicGlitchRate"})
    @Expose
	@Nullable
    public Float micGlitchRate;

    /**
     * The Received Noise Level.
     * Average energy level of received audio for audio classified as mono noise or left channel of stereo noise by the media endpoint.
     */
    @SerializedName(value = "receivedNoiseLevel", alternate = {"ReceivedNoiseLevel"})
    @Expose
	@Nullable
    public Integer receivedNoiseLevel;

    /**
     * The Received Signal Level.
     * Average energy level of received audio for audio classified as mono speech, or left channel of stereo speech by the media endpoint.
     */
    @SerializedName(value = "receivedSignalLevel", alternate = {"ReceivedSignalLevel"})
    @Expose
	@Nullable
    public Integer receivedSignalLevel;

    /**
     * The Render Device Driver.
     * Name of the render device driver used by the media endpoint.
     */
    @SerializedName(value = "renderDeviceDriver", alternate = {"RenderDeviceDriver"})
    @Expose
	@Nullable
    public String renderDeviceDriver;

    /**
     * The Render Device Name.
     * Name of the render device used by the media endpoint.
     */
    @SerializedName(value = "renderDeviceName", alternate = {"RenderDeviceName"})
    @Expose
	@Nullable
    public String renderDeviceName;

    /**
     * The Render Mute Event Ratio.
     * Fraction of the call that media endpoint detected device render is muted.
     */
    @SerializedName(value = "renderMuteEventRatio", alternate = {"RenderMuteEventRatio"})
    @Expose
	@Nullable
    public Float renderMuteEventRatio;

    /**
     * The Render Not Functioning Event Ratio.
     * Fraction of the call that the media endpoint detected the render device was not working properly.
     */
    @SerializedName(value = "renderNotFunctioningEventRatio", alternate = {"RenderNotFunctioningEventRatio"})
    @Expose
	@Nullable
    public Float renderNotFunctioningEventRatio;

    /**
     * The Render Zero Volume Event Ratio.
     * Fraction of the call that media endpoint detected device render volume is set to 0.
     */
    @SerializedName(value = "renderZeroVolumeEventRatio", alternate = {"RenderZeroVolumeEventRatio"})
    @Expose
	@Nullable
    public Float renderZeroVolumeEventRatio;

    /**
     * The Sent Noise Level.
     * Average energy level of sent audio for audio classified as mono noise or left channel of stereo noise by the media endpoint.
     */
    @SerializedName(value = "sentNoiseLevel", alternate = {"SentNoiseLevel"})
    @Expose
	@Nullable
    public Integer sentNoiseLevel;

    /**
     * The Sent Signal Level.
     * Average energy level of sent audio for audio classified as mono speech, or left channel of stereo speech by the media endpoint.
     */
    @SerializedName(value = "sentSignalLevel", alternate = {"SentSignalLevel"})
    @Expose
	@Nullable
    public Integer sentSignalLevel;

    /**
     * The Speaker Glitch Rate.
     * Glitches per 5 minute internal for the media endpoint's loudspeaker.
     */
    @SerializedName(value = "speakerGlitchRate", alternate = {"SpeakerGlitchRate"})
    @Expose
	@Nullable
    public Float speakerGlitchRate;


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
