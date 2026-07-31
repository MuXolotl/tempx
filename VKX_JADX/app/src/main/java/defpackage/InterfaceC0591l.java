package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* JADX INFO: renamed from: lؑۛۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC0591l extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(InterfaceC6989l interfaceC6989l);

    void getAppInstanceId(InterfaceC6989l interfaceC6989l);

    void getCachedAppInstanceId(InterfaceC6989l interfaceC6989l);

    void getConditionalUserProperties(String str, String str2, InterfaceC6989l interfaceC6989l);

    void getCurrentScreenClass(InterfaceC6989l interfaceC6989l);

    void getCurrentScreenName(InterfaceC6989l interfaceC6989l);

    void getGmpAppId(InterfaceC6989l interfaceC6989l);

    void getMaxUserProperties(String str, InterfaceC6989l interfaceC6989l);

    void getSessionId(InterfaceC6989l interfaceC6989l);

    void getTestFlag(InterfaceC6989l interfaceC6989l, int i);

    void getUserProperties(String str, String str2, boolean z, InterfaceC6989l interfaceC6989l);

    void initForTests(Map map);

    void initialize(InterfaceC3396l interfaceC3396l, C16351l c16351l, long j);

    void initializeWithElapsedTime(InterfaceC3396l interfaceC3396l, C16351l c16351l, long j, long j2);

    void isDataCollectionEnabled(InterfaceC6989l interfaceC6989l);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC6989l interfaceC6989l, long j);

    void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2);

    void logHealthData(int i, String str, InterfaceC3396l interfaceC3396l, InterfaceC3396l interfaceC3396l2, InterfaceC3396l interfaceC3396l3);

    void onActivityCreated(InterfaceC3396l interfaceC3396l, Bundle bundle, long j);

    void onActivityCreatedByScionActivityInfo(C8066l c8066l, Bundle bundle, long j);

    void onActivityDestroyed(InterfaceC3396l interfaceC3396l, long j);

    void onActivityDestroyedByScionActivityInfo(C8066l c8066l, long j);

    void onActivityPaused(InterfaceC3396l interfaceC3396l, long j);

    void onActivityPausedByScionActivityInfo(C8066l c8066l, long j);

    void onActivityResumed(InterfaceC3396l interfaceC3396l, long j);

    void onActivityResumedByScionActivityInfo(C8066l c8066l, long j);

    void onActivitySaveInstanceState(InterfaceC3396l interfaceC3396l, InterfaceC6989l interfaceC6989l, long j);

    void onActivitySaveInstanceStateByScionActivityInfo(C8066l c8066l, InterfaceC6989l interfaceC6989l, long j);

    void onActivityStarted(InterfaceC3396l interfaceC3396l, long j);

    void onActivityStartedByScionActivityInfo(C8066l c8066l, long j);

    void onActivityStopped(InterfaceC3396l interfaceC3396l, long j);

    void onActivityStoppedByScionActivityInfo(C8066l c8066l, long j);

    void performAction(Bundle bundle, InterfaceC6989l interfaceC6989l, long j);

    void registerOnMeasurementEventListener(InterfaceC11939l interfaceC11939l);

    void resetAnalyticsData(long j);

    void resetAnalyticsDataWithElapsedTime(long j, long j2);

    void retrieveAndUploadBatches(InterfaceC12695l interfaceC12695l);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(InterfaceC3396l interfaceC3396l, String str, String str2, long j);

    void setCurrentScreenByScionActivityInfo(C8066l c8066l, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(InterfaceC11939l interfaceC11939l);

    void setInstanceIdProvider(InterfaceC6914l interfaceC6914l);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, InterfaceC3396l interfaceC3396l, boolean z, long j);

    void unregisterOnMeasurementEventListener(InterfaceC11939l interfaceC11939l);
}
