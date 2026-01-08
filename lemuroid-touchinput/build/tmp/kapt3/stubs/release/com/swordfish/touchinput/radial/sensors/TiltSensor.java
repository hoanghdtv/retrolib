package com.swordfish.touchinput.radial.sensors;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0001?B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0002J\u0018\u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0006H\u0002J\u0010\u0010\'\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0002J\u0014\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*0)H\u0002J\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00110,J\u0006\u0010-\u001a\u00020\bJ\u001a\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\u0006\u00102\u001a\u00020*H\u0016J\u0010\u00103\u001a\u00020/2\u0006\u00104\u001a\u00020\u0011H\u0002J\b\u00105\u001a\u00020/H\u0002J\u0010\u00106\u001a\u00020/2\u0006\u00107\u001a\u000208H\u0016J\b\u00109\u001a\u00020/H\u0002J\b\u0010:\u001a\u00020/H\u0002J\u000e\u0010;\u001a\u00020/2\u0006\u0010<\u001a\u00020\u0006J\b\u0010=\u001a\u00020/H\u0002J\b\u0010>\u001a\u00020/H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0014*\u0004\u0018\u00010\u00130\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001f\u0010\u000e\u001a\u0004\b\u001d\u0010\n\"\u0004\b\u001e\u0010\fR\u0016\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110!X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006@"}, d2 = {"Lcom/swordfish/touchinput/radial/sensors/TiltSensor;", "Landroid/hardware/SensorEventListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "deadZone", "", "<set-?>", "", "isAllowedToRun", "()Z", "setAllowedToRun", "(Z)V", "isAllowedToRun$delegate", "Lkotlin/properties/ReadWriteProperty;", "maxRotation", "orientationAngles", "", "primaryDisplay", "Landroid/view/Display;", "kotlin.jvm.PlatformType", "remappedRotationMatrix", "restOrientation", "restOrientationsBuffer", "", "rotationMatrix", "sensorManager", "Landroid/hardware/SensorManager;", "shouldRun", "getShouldRun", "setShouldRun", "shouldRun$delegate", "tiltEvents", "Lkotlinx/coroutines/flow/MutableStateFlow;", "applyDeadZone", "x", "deadzone", "chooseBestAngleRepresentation", "offset", "clamp", "getAxisRemapForDisplayRotation", "Lkotlin/Pair;", "", "getTiltEvents", "Lkotlinx/coroutines/flow/Flow;", "isAvailable", "onAccuracyChanged", "", "sensor", "Landroid/hardware/Sensor;", "accuracy", "onNewRotationVector", "rotationVector", "onRunStateChanged", "onSensorChanged", "event", "Landroid/hardware/SensorEvent;", "pause", "sendRestPosition", "setSensitivity", "sensitivity", "start", "stop", "Companion", "lemuroid-touchinput_release"})
public final class TiltSensor implements android.hardware.SensorEventListener {
    @org.jetbrains.annotations.NotNull()
    private final android.hardware.SensorManager sensorManager = null;
    private final android.view.Display primaryDisplay = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<float[]> restOrientationsBuffer = null;
    @org.jetbrains.annotations.Nullable()
    private float[] restOrientation;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<float[]> tiltEvents = null;
    @org.jetbrains.annotations.NotNull()
    private final float[] rotationMatrix = null;
    @org.jetbrains.annotations.NotNull()
    private final float[] remappedRotationMatrix = null;
    @org.jetbrains.annotations.NotNull()
    private final float[] orientationAngles = null;
    private float maxRotation;
    private float deadZone;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty shouldRun$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty isAllowedToRun$delegate = null;
    public static final int SKIPPED_MEASUREMENTS = 1;
    public static final int MEASUREMENTS_BUFFER_SIZE = 5;
    private static final float MAX_MAX_ROTATION = 0.0F;
    private static final float MIN_MAX_ROTATION = 0.0F;
    private static final float PI = 3.1415927F;
    @org.jetbrains.annotations.NotNull()
    public static final com.swordfish.touchinput.radial.sensors.TiltSensor.Companion Companion = null;
    
    public TiltSensor(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    public final boolean getShouldRun() {
        return false;
    }
    
    public final void setShouldRun(boolean p0) {
    }
    
    public final boolean isAllowedToRun() {
        return false;
    }
    
    public final void setAllowedToRun(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<float[]> getTiltEvents() {
        return null;
    }
    
    private final void onRunStateChanged() {
    }
    
    private final void start() {
    }
    
    private final void pause() {
    }
    
    private final void stop() {
    }
    
    public final void setSensitivity(float sensitivity) {
    }
    
    public final boolean isAvailable() {
        return false;
    }
    
    @java.lang.Override()
    public void onAccuracyChanged(@org.jetbrains.annotations.Nullable()
    android.hardware.Sensor sensor, int accuracy) {
    }
    
    @java.lang.Override()
    public void onSensorChanged(@org.jetbrains.annotations.NotNull()
    android.hardware.SensorEvent event) {
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.DelicateCoroutinesApi.class})
    private final void sendRestPosition() {
    }
    
    private final void onNewRotationVector(float[] rotationVector) {
    }
    
    private final kotlin.Pair<java.lang.Integer, java.lang.Integer> getAxisRemapForDisplayRotation() {
        return null;
    }
    
    private final float chooseBestAngleRepresentation(float x, float offset) {
        return 0.0F;
    }
    
    private final float applyDeadZone(float x, float deadzone) {
        return 0.0F;
    }
    
    private final float clamp(float x) {
        return 0.0F;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u000e\u0010\r\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/swordfish/touchinput/radial/sensors/TiltSensor$Companion;", "", "()V", "MAX_MAX_ROTATION", "", "getMAX_MAX_ROTATION", "()F", "MEASUREMENTS_BUFFER_SIZE", "", "MIN_MAX_ROTATION", "getMIN_MAX_ROTATION", "PI", "getPI", "SKIPPED_MEASUREMENTS", "lemuroid-touchinput_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final float getMAX_MAX_ROTATION() {
            return 0.0F;
        }
        
        public final float getMIN_MAX_ROTATION() {
            return 0.0F;
        }
        
        public final float getPI() {
            return 0.0F;
        }
    }
}