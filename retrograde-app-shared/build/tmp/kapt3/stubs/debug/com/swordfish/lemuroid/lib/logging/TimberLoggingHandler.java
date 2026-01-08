package com.swordfish.lemuroid.lib.logging;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/swordfish/lemuroid/lib/logging/TimberLoggingHandler;", "Ljava/util/logging/Handler;", "()V", "close", "", "flush", "getAndroidLevel", "", "level", "Ljava/util/logging/Level;", "loggerNameToTag", "", "loggerName", "publish", "record", "Ljava/util/logging/LogRecord;", "retrograde-app-shared_debug"})
public final class TimberLoggingHandler extends java.util.logging.Handler {
    
    public TimberLoggingHandler() {
        super();
    }
    
    @java.lang.Override()
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.SecurityException.class})
    public void close() throws java.lang.SecurityException {
    }
    
    @java.lang.Override()
    public void flush() {
    }
    
    @java.lang.Override()
    public void publish(@org.jetbrains.annotations.NotNull()
    java.util.logging.LogRecord record) {
    }
    
    private final int getAndroidLevel(java.util.logging.Level level) {
        return 0;
    }
    
    private final java.lang.String loggerNameToTag(java.lang.String loggerName) {
        return null;
    }
}