package com.swordfish.touchinput.radial.settings;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0003\u001f !B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J,\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00162\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@\u00a2\u0006\u0002\u0010\u001aJ&\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\tH\u0086@\u00a2\u0006\u0002\u0010\u001dJ\"\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\tH\u0002R\"\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/swordfish/touchinput/radial/settings/TouchControllerSettingsManager;", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "cachedSettings", "", "", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/swordfish/touchinput/radial/settings/TouchControllerSettingsManager$Settings;", "computeInsetsPaddings", "Landroidx/compose/foundation/layout/PaddingValues;", "density", "Landroidx/compose/ui/unit/Density;", "insets", "Landroidx/compose/foundation/layout/WindowInsets;", "getPreferenceString", "controllerID", "Lcom/swordfish/touchinput/radial/settings/TouchControllerID;", "orientation", "Lcom/swordfish/touchinput/radial/settings/TouchControllerSettingsManager$Orientation;", "observeSettings", "Lkotlinx/coroutines/flow/Flow;", "touchControllerID", "resetSettings", "", "(Lcom/swordfish/touchinput/radial/settings/TouchControllerID;Lcom/swordfish/touchinput/radial/settings/TouchControllerSettingsManager$Orientation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storeSettings", "settings", "(Lcom/swordfish/touchinput/radial/settings/TouchControllerID;Lcom/swordfish/touchinput/radial/settings/TouchControllerSettingsManager$Orientation;Lcom/swordfish/touchinput/radial/settings/TouchControllerSettingsManager$Settings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateCachedSettings", "Companion", "Orientation", "Settings", "lemuroid-touchinput_debug"})
public final class TouchControllerSettingsManager {
    @org.jetbrains.annotations.NotNull()
    private final android.content.SharedPreferences sharedPreferences = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, kotlinx.coroutines.flow.MutableStateFlow<com.swordfish.touchinput.radial.settings.TouchControllerSettingsManager.Settings>> cachedSettings = null;
    public static final float DEFAULT_SCALE = 0.5F;
    public static final float DEFAULT_ROTATION = 0.0F;
    public static final float DEFAULT_MARGIN_X = 0.0F;
    public static final float DEFAULT_MARGIN_Y = 0.0F;
    public static final float MAX_ROTATION = 45.0F;
    public static final float MIN_SCALE = 0.75F;
    public static final float MAX_SCALE = 1.5F;
    public static final float MAX_MARGINS = 96.0F;
    @org.jetbrains.annotations.NotNull()
    public static final com.swordfish.touchinput.radial.settings.TouchControllerSettingsManager.Companion Companion = null;
    
    public TouchControllerSettingsManager(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences) {
        super();
    }
    
    private final androidx.compose.foundation.layout.PaddingValues computeInsetsPaddings(androidx.compose.ui.unit.Density density, androidx.compose.foundation.layout.WindowInsets insets) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.swordfish.touchinput.radial.settings.TouchControllerSettingsManager.Settings> observeSettings(@org.jetbrains.annotations.NotNull()
    com.swordfish.touchinput.radial.settings.TouchControllerID touchControllerID, @org.jetbrains.annotations.NotNull()
    com.swordfish.touchinput.radial.settings.TouchControllerSettingsManager.Orientation orientation, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.unit.Density density, @org.jetbrains.annotations.NotNull()
    androidx.compose.foundation.layout.WindowInsets insets) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object storeSettings(@org.jetbrains.annotations.NotNull()
    com.swordfish.touchinput.radial.settings.TouchControllerID touchControllerID, @org.jetbrains.annotations.NotNull()
    com.swordfish.touchinput.radial.settings.TouchControllerSettingsManager.Orientation orientation, @org.jetbrains.annotations.NotNull()
    com.swordfish.touchinput.radial.settings.TouchControllerSettingsManager.Settings settings, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final void updateCachedSettings(com.swordfish.touchinput.radial.settings.TouchControllerID touchControllerID, com.swordfish.touchinput.radial.settings.TouchControllerSettingsManager.Orientation orientation, com.swordfish.touchinput.radial.settings.TouchControllerSettingsManager.Settings settings) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object resetSettings(@org.jetbrains.annotations.NotNull()
    com.swordfish.touchinput.radial.settings.TouchControllerID touchControllerID, @org.jetbrains.annotations.NotNull()
    com.swordfish.touchinput.radial.settings.TouchControllerSettingsManager.Orientation orientation, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.String getPreferenceString(com.swordfish.touchinput.radial.settings.TouchControllerID controllerID, com.swordfish.touchinput.radial.settings.TouchControllerSettingsManager.Orientation orientation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/swordfish/touchinput/radial/settings/TouchControllerSettingsManager$Companion;", "", "()V", "DEFAULT_MARGIN_X", "", "DEFAULT_MARGIN_Y", "DEFAULT_ROTATION", "DEFAULT_SCALE", "MAX_MARGINS", "MAX_ROTATION", "MAX_SCALE", "MIN_SCALE", "lemuroid-touchinput_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/swordfish/touchinput/radial/settings/TouchControllerSettingsManager$Orientation;", "", "(Ljava/lang/String;I)V", "PORTRAIT", "LANDSCAPE", "lemuroid-touchinput_debug"})
    public static enum Orientation {
        /*public static final*/ PORTRAIT /* = new PORTRAIT() */,
        /*public static final*/ LANDSCAPE /* = new LANDSCAPE() */;
        
        Orientation() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.swordfish.touchinput.radial.settings.TouchControllerSettingsManager.Orientation> getEntries() {
            return null;
        }
    }
    
    @kotlinx.serialization.Serializable()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002%&B9\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bB-\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J&\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u00c1\u0001\u00a2\u0006\u0002\b$R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e\u00a8\u0006\'"}, d2 = {"Lcom/swordfish/touchinput/radial/settings/TouchControllerSettingsManager$Settings;", "", "seen1", "", "scale", "", "rotation", "marginX", "marginY", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IFFFFLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(FFFF)V", "getMarginX", "()F", "getMarginY", "getRotation", "getScale", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$lemuroid_touchinput_debug", "$serializer", "Companion", "lemuroid-touchinput_debug"})
    public static final class Settings {
        private final float scale = 0.0F;
        private final float rotation = 0.0F;
        private final float marginX = 0.0F;
        private final float marginY = 0.0F;
        @org.jetbrains.annotations.NotNull()
        public static final com.swordfish.touchinput.radial.settings.TouchControllerSettingsManager.Settings.Companion Companion = null;
        
        public Settings(float scale, float rotation, float marginX, float marginY) {
            super();
        }
        
        public final float getScale() {
            return 0.0F;
        }
        
        public final float getRotation() {
            return 0.0F;
        }
        
        public final float getMarginX() {
            return 0.0F;
        }
        
        public final float getMarginY() {
            return 0.0F;
        }
        
        public Settings() {
            super();
        }
        
        public final float component1() {
            return 0.0F;
        }
        
        public final float component2() {
            return 0.0F;
        }
        
        public final float component3() {
            return 0.0F;
        }
        
        public final float component4() {
            return 0.0F;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.swordfish.touchinput.radial.settings.TouchControllerSettingsManager.Settings copy(float scale, float rotation, float marginX, float marginY) {
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
        
        @kotlin.jvm.JvmStatic()
        public static final void write$Self$lemuroid_touchinput_debug(@org.jetbrains.annotations.NotNull()
        com.swordfish.touchinput.radial.settings.TouchControllerSettingsManager.Settings self, @org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
        kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"com/swordfish/touchinput/radial/settings/TouchControllerSettingsManager.Settings.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/swordfish/touchinput/radial/settings/TouchControllerSettingsManager$Settings;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "lemuroid-touchinput_debug"})
        @java.lang.Deprecated()
        public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.swordfish.touchinput.radial.settings.TouchControllerSettingsManager.Settings> {
            @org.jetbrains.annotations.NotNull()
            public static final com.swordfish.touchinput.radial.settings.TouchControllerSettingsManager.Settings.$serializer INSTANCE = null;
            
            private $serializer() {
                super();
            }
            
            @java.lang.Override()
            @org.jetbrains.annotations.NotNull()
            public kotlinx.serialization.KSerializer<?>[] childSerializers() {
                return null;
            }
            
            @java.lang.Override()
            @org.jetbrains.annotations.NotNull()
            public com.swordfish.touchinput.radial.settings.TouchControllerSettingsManager.Settings deserialize(@org.jetbrains.annotations.NotNull()
            kotlinx.serialization.encoding.Decoder decoder) {
                return null;
            }
            
            @java.lang.Override()
            @org.jetbrains.annotations.NotNull()
            public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
                return null;
            }
            
            @java.lang.Override()
            public void serialize(@org.jetbrains.annotations.NotNull()
            kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
            com.swordfish.touchinput.radial.settings.TouchControllerSettingsManager.Settings value) {
            }
            
            @java.lang.Override()
            @org.jetbrains.annotations.NotNull()
            public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/swordfish/touchinput/radial/settings/TouchControllerSettingsManager$Settings$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/swordfish/touchinput/radial/settings/TouchControllerSettingsManager$Settings;", "lemuroid-touchinput_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final kotlinx.serialization.KSerializer<com.swordfish.touchinput.radial.settings.TouchControllerSettingsManager.Settings> serializer() {
                return null;
            }
        }
    }
}