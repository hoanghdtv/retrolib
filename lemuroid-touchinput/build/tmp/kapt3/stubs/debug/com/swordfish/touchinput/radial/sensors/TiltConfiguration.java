package com.swordfish.touchinput.radial.sensors;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\t\n\u000b\fJ\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&\u0082\u0001\u0004\r\u000e\u000f\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/swordfish/touchinput/radial/sensors/TiltConfiguration;", "Ljava/io/Serializable;", "controlIds", "", "Lgg/padkit/ids/Id;", "process", "Lgg/padkit/inputstate/InputState;", "values", "", "Analog", "ButtonPair", "Cross", "Disabled", "Lcom/swordfish/touchinput/radial/sensors/TiltConfiguration$Analog;", "Lcom/swordfish/touchinput/radial/sensors/TiltConfiguration$ButtonPair;", "Lcom/swordfish/touchinput/radial/sensors/TiltConfiguration$Cross;", "Lcom/swordfish/touchinput/radial/sensors/TiltConfiguration$Disabled;", "lemuroid-touchinput_debug"})
public abstract interface TiltConfiguration extends java.io.Serializable {
    
    @org.jetbrains.annotations.NotNull()
    public abstract gg.padkit.inputstate.InputState process(@org.jetbrains.annotations.NotNull()
    float[] values);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Set<gg.padkit.ids.Id> controlIds();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00d6\u0001J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/swordfish/touchinput/radial/sensors/TiltConfiguration$Analog;", "Lcom/swordfish/touchinput/radial/sensors/TiltConfiguration;", "directionId", "", "(I)V", "getDirectionId", "()I", "component1", "controlIds", "", "Lgg/padkit/ids/Id;", "copy", "equals", "", "other", "", "hashCode", "process", "Lgg/padkit/inputstate/InputState;", "values", "", "toString", "", "lemuroid-touchinput_debug"})
    public static final class Analog implements com.swordfish.touchinput.radial.sensors.TiltConfiguration {
        private final int directionId = 0;
        
        public Analog(int directionId) {
            super();
        }
        
        public final int getDirectionId() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public gg.padkit.inputstate.InputState process(@org.jetbrains.annotations.NotNull()
        float[] values) {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.util.Set<gg.padkit.ids.Id> controlIds() {
            return null;
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.swordfish.touchinput.radial.sensors.TiltConfiguration.Analog copy(int directionId) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u001a"}, d2 = {"Lcom/swordfish/touchinput/radial/sensors/TiltConfiguration$ButtonPair;", "Lcom/swordfish/touchinput/radial/sensors/TiltConfiguration;", "leftButtonId", "", "rightButtonId", "(II)V", "getLeftButtonId", "()I", "getRightButtonId", "component1", "component2", "controlIds", "", "Lgg/padkit/ids/Id;", "copy", "equals", "", "other", "", "hashCode", "process", "Lgg/padkit/inputstate/InputState;", "values", "", "toString", "", "lemuroid-touchinput_debug"})
    public static final class ButtonPair implements com.swordfish.touchinput.radial.sensors.TiltConfiguration {
        private final int leftButtonId = 0;
        private final int rightButtonId = 0;
        
        public ButtonPair(int leftButtonId, int rightButtonId) {
            super();
        }
        
        public final int getLeftButtonId() {
            return 0;
        }
        
        public final int getRightButtonId() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public gg.padkit.inputstate.InputState process(@org.jetbrains.annotations.NotNull()
        float[] values) {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.util.Set<gg.padkit.ids.Id> controlIds() {
            return null;
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.swordfish.touchinput.radial.sensors.TiltConfiguration.ButtonPair copy(int leftButtonId, int rightButtonId) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00d6\u0001J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/swordfish/touchinput/radial/sensors/TiltConfiguration$Cross;", "Lcom/swordfish/touchinput/radial/sensors/TiltConfiguration;", "directionId", "", "(I)V", "getDirectionId", "()I", "component1", "controlIds", "", "Lgg/padkit/ids/Id;", "copy", "equals", "", "other", "", "hashCode", "process", "Lgg/padkit/inputstate/InputState;", "values", "", "toString", "", "lemuroid-touchinput_debug"})
    public static final class Cross implements com.swordfish.touchinput.radial.sensors.TiltConfiguration {
        private final int directionId = 0;
        
        public Cross(int directionId) {
            super();
        }
        
        public final int getDirectionId() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public gg.padkit.inputstate.InputState process(@org.jetbrains.annotations.NotNull()
        float[] values) {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.util.Set<gg.padkit.ids.Id> controlIds() {
            return null;
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.swordfish.touchinput.radial.sensors.TiltConfiguration.Cross copy(int directionId) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c7\n\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u00d6\u0003J\t\u0010\n\u001a\u00020\u000bH\u00d6\u0001J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001\u00a8\u0006\u0012"}, d2 = {"Lcom/swordfish/touchinput/radial/sensors/TiltConfiguration$Disabled;", "Lcom/swordfish/touchinput/radial/sensors/TiltConfiguration;", "()V", "controlIds", "", "Lgg/padkit/ids/Id;", "equals", "", "other", "", "hashCode", "", "process", "Lgg/padkit/inputstate/InputState;", "values", "", "toString", "", "lemuroid-touchinput_debug"})
    public static final class Disabled implements com.swordfish.touchinput.radial.sensors.TiltConfiguration {
        @org.jetbrains.annotations.NotNull()
        public static final com.swordfish.touchinput.radial.sensors.TiltConfiguration.Disabled INSTANCE = null;
        
        private Disabled() {
            super();
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public gg.padkit.inputstate.InputState process(@org.jetbrains.annotations.NotNull()
        float[] values) {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.util.Set<gg.padkit.ids.Id> controlIds() {
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
}