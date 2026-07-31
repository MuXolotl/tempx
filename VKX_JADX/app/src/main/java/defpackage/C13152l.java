package defpackage;

import android.net.NetworkRequest;
import android.os.Build;
import java.util.Set;

/* JADX INFO: renamed from: lْؗۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13152l {
    public static final C13152l isPro = new C13152l();
    public final long admob;
    public final boolean amazon;
    public final boolean billing;
    public final boolean crashlytics;
    public final C8891l loadAd;
    public final long mopub;
    public final boolean purchase;
    public final Set subs;
    public final int yandex;

    public C13152l(C13152l c13152l) {
        this.crashlytics = c13152l.crashlytics;
        this.amazon = c13152l.amazon;
        this.loadAd = c13152l.loadAd;
        this.yandex = c13152l.yandex;
        this.purchase = c13152l.purchase;
        this.billing = c13152l.billing;
        this.subs = c13152l.subs;
        this.mopub = c13152l.mopub;
        this.admob = c13152l.admob;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C13152l.class.equals(obj.getClass())) {
            return false;
        }
        C13152l c13152l = (C13152l) obj;
        if (this.crashlytics == c13152l.crashlytics && this.amazon == c13152l.amazon && this.purchase == c13152l.purchase && this.billing == c13152l.billing && this.mopub == c13152l.mopub && this.admob == c13152l.admob && AbstractC8576l.yandex(yandex(), c13152l.yandex()) && this.yandex == c13152l.yandex) {
            return AbstractC8576l.yandex(this.subs, c13152l.subs);
        }
        return false;
    }

    public final int hashCode() {
        int iInmobi = ((((((((AbstractC5020l.inmobi(this.yandex) * 31) + (this.crashlytics ? 1 : 0)) * 31) + (this.amazon ? 1 : 0)) * 31) + (this.purchase ? 1 : 0)) * 31) + (this.billing ? 1 : 0)) * 31;
        long j = this.mopub;
        int i = (iInmobi + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.admob;
        int iHashCode = (this.subs.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31;
        NetworkRequest networkRequestYandex = yandex();
        return iHashCode + (networkRequestYandex != null ? networkRequestYandex.hashCode() : 0);
    }

    public final boolean loadAd() {
        return Build.VERSION.SDK_INT < 24 || !this.subs.isEmpty();
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + AbstractC15560l.advert(this.yandex) + ", requiresCharging=" + this.crashlytics + ", requiresDeviceIdle=" + this.amazon + ", requiresBatteryNotLow=" + this.purchase + ", requiresStorageNotLow=" + this.billing + ", contentTriggerUpdateDelayMillis=" + this.mopub + ", contentTriggerMaxDelayMillis=" + this.admob + ", contentUriTriggers=" + this.subs + ", }";
    }

    public final NetworkRequest yandex() {
        return (NetworkRequest) this.loadAd.yandex;
    }

    public C13152l(C8891l c8891l, int i, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set set) {
        this.loadAd = c8891l;
        this.yandex = i;
        this.crashlytics = z;
        this.amazon = z2;
        this.purchase = z3;
        this.billing = z4;
        this.mopub = j;
        this.admob = j2;
        this.subs = set;
    }

    public C13152l() {
        this.loadAd = new C8891l(null);
        this.yandex = 1;
        this.crashlytics = false;
        this.amazon = false;
        this.purchase = false;
        this.billing = false;
        this.mopub = -1L;
        this.admob = -1L;
        this.subs = C5746l.f12138l;
    }
}
