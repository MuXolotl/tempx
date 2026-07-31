package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؑۥۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0704l {
    public final boolean admob;
    public final long amazon;
    public final float billing;
    public final long crashlytics;
    public final float firebase;
    public final long isPro;
    public final long loadAd;
    public final int mopub;
    public final boolean purchase;
    public final long remoteconfig;
    public final long smaato;
    public final ArrayList subs;
    public final long yandex;

    public C0704l(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, float f2, long j6, long j7) {
        this.yandex = j;
        this.loadAd = j2;
        this.crashlytics = j3;
        this.amazon = j4;
        this.purchase = z;
        this.billing = f;
        this.mopub = i;
        this.admob = z2;
        this.subs = arrayList;
        this.isPro = j5;
        this.firebase = f2;
        this.smaato = j6;
        this.remoteconfig = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0704l)) {
            return false;
        }
        C0704l c0704l = (C0704l) obj;
        return AbstractC17265l.purchase(this.yandex, c0704l.yandex) && this.loadAd == c0704l.loadAd && C1187l.loadAd(this.crashlytics, c0704l.crashlytics) && C1187l.loadAd(this.amazon, c0704l.amazon) && this.purchase == c0704l.purchase && Float.compare(this.billing, c0704l.billing) == 0 && this.mopub == c0704l.mopub && this.admob == c0704l.admob && this.subs.equals(c0704l.subs) && C1187l.loadAd(this.isPro, c0704l.isPro) && Float.compare(this.firebase, c0704l.firebase) == 0 && C1187l.loadAd(this.smaato, c0704l.smaato) && C1187l.loadAd(this.remoteconfig, c0704l.remoteconfig);
    }

    public final int hashCode() {
        long j = this.yandex;
        long j2 = this.loadAd;
        return C1187l.mopub(this.remoteconfig) + ((C1187l.mopub(this.smaato) + AbstractC9029l.mopub((C1187l.mopub(this.isPro) + ((this.subs.hashCode() + ((((AbstractC9029l.mopub((((C1187l.mopub(this.amazon) + ((C1187l.mopub(this.crashlytics) + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31)) * 31) + (this.purchase ? 1231 : 1237)) * 31, this.billing, 31) + this.mopub) * 31) + (this.admob ? 1231 : 1237)) * 31)) * 31)) * 31, this.firebase, 31)) * 31);
    }

    public final String toString() {
        String strMopub = AbstractC17265l.mopub(this.yandex);
        String strFirebase = C1187l.firebase(this.crashlytics);
        String strFirebase2 = C1187l.firebase(this.amazon);
        String strYandex = C10829l.yandex(this.mopub);
        String strFirebase3 = C1187l.firebase(this.isPro);
        String strFirebase4 = C1187l.firebase(this.smaato);
        String strFirebase5 = C1187l.firebase(this.remoteconfig);
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append(strMopub);
        sb.append(", uptime=");
        sb.append(this.loadAd);
        AbstractC9361l.appmetrica(sb, ", positionOnScreen=", strFirebase, ", position=", strFirebase2);
        sb.append(", down=");
        sb.append(this.purchase);
        sb.append(", pressure=");
        sb.append(this.billing);
        sb.append(", type=");
        sb.append(strYandex);
        sb.append(", activeHover=");
        sb.append(this.admob);
        sb.append(", historical=");
        sb.append(this.subs);
        sb.append(", scrollDelta=");
        sb.append(strFirebase3);
        sb.append(", scaleGestureFactor=");
        sb.append(this.firebase);
        sb.append(", panGestureOffset=");
        sb.append(strFirebase4);
        return AbstractC9361l.ad(sb, ", originalEventPosition=", strFirebase5, ")");
    }
}
