package com.swordfish.lemuroid.lib.controller;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\u0002\u0010\u0011J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0005H\u00c6\u0003J\t\u0010$\u001a\u00020\u0007H\u00c6\u0003J\t\u0010%\u001a\u00020\tH\u00c6\u0003J\t\u0010&\u001a\u00020\tH\u00c6\u0003J\t\u0010\'\u001a\u00020\tH\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u00c6\u0003Jr\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u00c6\u0001\u00a2\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010/H\u00d6\u0003J\u0006\u00100\u001a\u000201J\t\u00102\u001a\u00020\u0005H\u00d6\u0001J\t\u00103\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!\u00a8\u00064"}, d2 = {"Lcom/swordfish/lemuroid/lib/controller/ControllerConfig;", "Ljava/io/Serializable;", "name", "", "displayName", "", "touchControllerID", "Lcom/swordfish/touchinput/radial/settings/TouchControllerID;", "allowTouchRotation", "", "allowTouchOverlay", "mergeDPADAndLeftStickEvents", "libretroDescriptor", "libretroId", "tiltConfigurations", "", "Lcom/swordfish/touchinput/radial/sensors/TiltConfiguration;", "(Ljava/lang/String;ILcom/swordfish/touchinput/radial/settings/TouchControllerID;ZZZLjava/lang/String;Ljava/lang/Integer;Ljava/util/List;)V", "getAllowTouchOverlay", "()Z", "getAllowTouchRotation", "getDisplayName", "()I", "getLibretroDescriptor", "()Ljava/lang/String;", "getLibretroId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMergeDPADAndLeftStickEvents", "getName", "getTiltConfigurations", "()Ljava/util/List;", "getTouchControllerID", "()Lcom/swordfish/touchinput/radial/settings/TouchControllerID;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;ILcom/swordfish/touchinput/radial/settings/TouchControllerID;ZZZLjava/lang/String;Ljava/lang/Integer;Ljava/util/List;)Lcom/swordfish/lemuroid/lib/controller/ControllerConfig;", "equals", "other", "", "getTouchControllerConfig", "Lcom/swordfish/touchinput/radial/settings/TouchControllerID$Config;", "hashCode", "toString", "retrograde-app-shared_debug"})
public final class ControllerConfig implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    private final int displayName = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.swordfish.touchinput.radial.settings.TouchControllerID touchControllerID = null;
    private final boolean allowTouchRotation = false;
    private final boolean allowTouchOverlay = false;
    private final boolean mergeDPADAndLeftStickEvents = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String libretroDescriptor = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer libretroId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.swordfish.touchinput.radial.sensors.TiltConfiguration> tiltConfigurations = null;
    
    public ControllerConfig(@org.jetbrains.annotations.NotNull()
    java.lang.String name, int displayName, @org.jetbrains.annotations.NotNull()
    com.swordfish.touchinput.radial.settings.TouchControllerID touchControllerID, boolean allowTouchRotation, boolean allowTouchOverlay, boolean mergeDPADAndLeftStickEvents, @org.jetbrains.annotations.Nullable()
    java.lang.String libretroDescriptor, @org.jetbrains.annotations.Nullable()
    java.lang.Integer libretroId, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.swordfish.touchinput.radial.sensors.TiltConfiguration> tiltConfigurations) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final int getDisplayName() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.swordfish.touchinput.radial.settings.TouchControllerID getTouchControllerID() {
        return null;
    }
    
    public final boolean getAllowTouchRotation() {
        return false;
    }
    
    public final boolean getAllowTouchOverlay() {
        return false;
    }
    
    public final boolean getMergeDPADAndLeftStickEvents() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLibretroDescriptor() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getLibretroId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.swordfish.touchinput.radial.sensors.TiltConfiguration> getTiltConfigurations() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.swordfish.touchinput.radial.settings.TouchControllerID.Config getTouchControllerConfig() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.swordfish.touchinput.radial.settings.TouchControllerID component3() {
        return null;
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean component6() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.swordfish.touchinput.radial.sensors.TiltConfiguration> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.swordfish.lemuroid.lib.controller.ControllerConfig copy(@org.jetbrains.annotations.NotNull()
    java.lang.String name, int displayName, @org.jetbrains.annotations.NotNull()
    com.swordfish.touchinput.radial.settings.TouchControllerID touchControllerID, boolean allowTouchRotation, boolean allowTouchOverlay, boolean mergeDPADAndLeftStickEvents, @org.jetbrains.annotations.Nullable()
    java.lang.String libretroDescriptor, @org.jetbrains.annotations.Nullable()
    java.lang.Integer libretroId, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.swordfish.touchinput.radial.sensors.TiltConfiguration> tiltConfigurations) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}