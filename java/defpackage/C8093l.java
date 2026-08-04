package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: renamed from: lًّٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8093l extends AbstractC0895l implements InterfaceC0591l {
    @Override // defpackage.InterfaceC0591l
    public final void beginAdUnitExposure(String str, long j) {
        Parcel parcelM743l = m743l();
        parcelM743l.writeString(str);
        parcelM743l.writeLong(j);
        m741l(parcelM743l, 23);
    }

    @Override // defpackage.InterfaceC0591l
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelM743l = m743l();
        parcelM743l.writeString(str);
        parcelM743l.writeString(str2);
        AbstractC15425l.loadAd(parcelM743l, bundle);
        m741l(parcelM743l, 9);
    }

    @Override // defpackage.InterfaceC0591l
    public final void endAdUnitExposure(String str, long j) {
        Parcel parcelM743l = m743l();
        parcelM743l.writeString(str);
        parcelM743l.writeLong(j);
        m741l(parcelM743l, 24);
    }

    @Override // defpackage.InterfaceC0591l
    public final void generateEventId(InterfaceC6989l interfaceC6989l) {
        Parcel parcelM743l = m743l();
        AbstractC15425l.crashlytics(parcelM743l, interfaceC6989l);
        m741l(parcelM743l, 22);
    }

    @Override // defpackage.InterfaceC0591l
    public final void getCachedAppInstanceId(InterfaceC6989l interfaceC6989l) {
        Parcel parcelM743l = m743l();
        AbstractC15425l.crashlytics(parcelM743l, interfaceC6989l);
        m741l(parcelM743l, 19);
    }

    @Override // defpackage.InterfaceC0591l
    public final void getConditionalUserProperties(String str, String str2, InterfaceC6989l interfaceC6989l) {
        Parcel parcelM743l = m743l();
        parcelM743l.writeString(str);
        parcelM743l.writeString(str2);
        AbstractC15425l.crashlytics(parcelM743l, interfaceC6989l);
        m741l(parcelM743l, 10);
    }

    @Override // defpackage.InterfaceC0591l
    public final void getCurrentScreenClass(InterfaceC6989l interfaceC6989l) {
        Parcel parcelM743l = m743l();
        AbstractC15425l.crashlytics(parcelM743l, interfaceC6989l);
        m741l(parcelM743l, 17);
    }

    @Override // defpackage.InterfaceC0591l
    public final void getCurrentScreenName(InterfaceC6989l interfaceC6989l) {
        Parcel parcelM743l = m743l();
        AbstractC15425l.crashlytics(parcelM743l, interfaceC6989l);
        m741l(parcelM743l, 16);
    }

    @Override // defpackage.InterfaceC0591l
    public final void getGmpAppId(InterfaceC6989l interfaceC6989l) {
        Parcel parcelM743l = m743l();
        AbstractC15425l.crashlytics(parcelM743l, interfaceC6989l);
        m741l(parcelM743l, 21);
    }

    @Override // defpackage.InterfaceC0591l
    public final void getMaxUserProperties(String str, InterfaceC6989l interfaceC6989l) {
        Parcel parcelM743l = m743l();
        parcelM743l.writeString(str);
        AbstractC15425l.crashlytics(parcelM743l, interfaceC6989l);
        m741l(parcelM743l, 6);
    }

    @Override // defpackage.InterfaceC0591l
    public final void getUserProperties(String str, String str2, boolean z, InterfaceC6989l interfaceC6989l) {
        Parcel parcelM743l = m743l();
        parcelM743l.writeString(str);
        parcelM743l.writeString(str2);
        ClassLoader classLoader = AbstractC15425l.yandex;
        parcelM743l.writeInt(z ? 1 : 0);
        AbstractC15425l.crashlytics(parcelM743l, interfaceC6989l);
        m741l(parcelM743l, 5);
    }

    @Override // defpackage.InterfaceC0591l
    public final void initialize(InterfaceC3396l interfaceC3396l, C16351l c16351l, long j) {
        Parcel parcelM743l = m743l();
        AbstractC15425l.crashlytics(parcelM743l, interfaceC3396l);
        AbstractC15425l.loadAd(parcelM743l, c16351l);
        parcelM743l.writeLong(j);
        m741l(parcelM743l, 1);
    }

    @Override // defpackage.InterfaceC0591l
    public final void initializeWithElapsedTime(InterfaceC3396l interfaceC3396l, C16351l c16351l, long j, long j2) {
        Parcel parcelM743l = m743l();
        AbstractC15425l.crashlytics(parcelM743l, interfaceC3396l);
        AbstractC15425l.loadAd(parcelM743l, c16351l);
        parcelM743l.writeLong(j);
        parcelM743l.writeLong(j2);
        m741l(parcelM743l, 60);
    }

    @Override // defpackage.InterfaceC0591l
    public final void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2) {
        Parcel parcelM743l = m743l();
        parcelM743l.writeString(str);
        parcelM743l.writeString(str2);
        AbstractC15425l.loadAd(parcelM743l, bundle);
        parcelM743l.writeInt(1);
        parcelM743l.writeInt(1);
        parcelM743l.writeLong(j);
        parcelM743l.writeLong(j2);
        m741l(parcelM743l, 59);
    }

    @Override // defpackage.InterfaceC0591l
    public final void logHealthData(int i, String str, InterfaceC3396l interfaceC3396l, InterfaceC3396l interfaceC3396l2, InterfaceC3396l interfaceC3396l3) {
        Parcel parcelM743l = m743l();
        parcelM743l.writeInt(5);
        parcelM743l.writeString("Error with data collection. Data lost.");
        AbstractC15425l.crashlytics(parcelM743l, interfaceC3396l);
        AbstractC15425l.crashlytics(parcelM743l, interfaceC3396l2);
        AbstractC15425l.crashlytics(parcelM743l, interfaceC3396l3);
        m741l(parcelM743l, 33);
    }

    @Override // defpackage.InterfaceC0591l
    public final void onActivityCreatedByScionActivityInfo(C8066l c8066l, Bundle bundle, long j) {
        Parcel parcelM743l = m743l();
        AbstractC15425l.loadAd(parcelM743l, c8066l);
        AbstractC15425l.loadAd(parcelM743l, bundle);
        parcelM743l.writeLong(j);
        m741l(parcelM743l, 53);
    }

    @Override // defpackage.InterfaceC0591l
    public final void onActivityDestroyedByScionActivityInfo(C8066l c8066l, long j) {
        Parcel parcelM743l = m743l();
        AbstractC15425l.loadAd(parcelM743l, c8066l);
        parcelM743l.writeLong(j);
        m741l(parcelM743l, 54);
    }

    @Override // defpackage.InterfaceC0591l
    public final void onActivityPausedByScionActivityInfo(C8066l c8066l, long j) {
        Parcel parcelM743l = m743l();
        AbstractC15425l.loadAd(parcelM743l, c8066l);
        parcelM743l.writeLong(j);
        m741l(parcelM743l, 55);
    }

    @Override // defpackage.InterfaceC0591l
    public final void onActivityResumedByScionActivityInfo(C8066l c8066l, long j) {
        Parcel parcelM743l = m743l();
        AbstractC15425l.loadAd(parcelM743l, c8066l);
        parcelM743l.writeLong(j);
        m741l(parcelM743l, 56);
    }

    @Override // defpackage.InterfaceC0591l
    public final void onActivitySaveInstanceStateByScionActivityInfo(C8066l c8066l, InterfaceC6989l interfaceC6989l, long j) {
        Parcel parcelM743l = m743l();
        AbstractC15425l.loadAd(parcelM743l, c8066l);
        AbstractC15425l.crashlytics(parcelM743l, interfaceC6989l);
        parcelM743l.writeLong(j);
        m741l(parcelM743l, 57);
    }

    @Override // defpackage.InterfaceC0591l
    public final void onActivityStartedByScionActivityInfo(C8066l c8066l, long j) {
        Parcel parcelM743l = m743l();
        AbstractC15425l.loadAd(parcelM743l, c8066l);
        parcelM743l.writeLong(j);
        m741l(parcelM743l, 51);
    }

    @Override // defpackage.InterfaceC0591l
    public final void onActivityStoppedByScionActivityInfo(C8066l c8066l, long j) {
        Parcel parcelM743l = m743l();
        AbstractC15425l.loadAd(parcelM743l, c8066l);
        parcelM743l.writeLong(j);
        m741l(parcelM743l, 52);
    }

    @Override // defpackage.InterfaceC0591l
    public final void registerOnMeasurementEventListener(InterfaceC11939l interfaceC11939l) {
        Parcel parcelM743l = m743l();
        AbstractC15425l.crashlytics(parcelM743l, interfaceC11939l);
        m741l(parcelM743l, 35);
    }

    @Override // defpackage.InterfaceC0591l
    public final void retrieveAndUploadBatches(InterfaceC12695l interfaceC12695l) {
        Parcel parcelM743l = m743l();
        AbstractC15425l.crashlytics(parcelM743l, interfaceC12695l);
        m741l(parcelM743l, 58);
    }

    @Override // defpackage.InterfaceC0591l
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel parcelM743l = m743l();
        AbstractC15425l.loadAd(parcelM743l, bundle);
        parcelM743l.writeLong(j);
        m741l(parcelM743l, 8);
    }

    @Override // defpackage.InterfaceC0591l
    public final void setCurrentScreenByScionActivityInfo(C8066l c8066l, String str, String str2, long j) {
        Parcel parcelM743l = m743l();
        AbstractC15425l.loadAd(parcelM743l, c8066l);
        parcelM743l.writeString(str);
        parcelM743l.writeString(str2);
        parcelM743l.writeLong(j);
        m741l(parcelM743l, 50);
    }

    @Override // defpackage.InterfaceC0591l
    public final void setDataCollectionEnabled(boolean z) {
        throw null;
    }

    @Override // defpackage.InterfaceC0591l
    public final void setUserProperty(String str, String str2, InterfaceC3396l interfaceC3396l, boolean z, long j) {
        Parcel parcelM743l = m743l();
        parcelM743l.writeString("fcm");
        parcelM743l.writeString("_ln");
        AbstractC15425l.crashlytics(parcelM743l, interfaceC3396l);
        parcelM743l.writeInt(1);
        parcelM743l.writeLong(j);
        m741l(parcelM743l, 4);
    }
}
