package defpackage;

import java.util.HashSet;
import java.util.UUID;

/* JADX INFO: renamed from: lؖۙٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4365l {
    public final C13152l admob;
    public final C4279l amazon;
    public final int billing;
    public final HashSet crashlytics;
    public final long firebase;
    public final C1364l isPro;
    public final EnumC9176l loadAd;
    public final int mopub;
    public final C4279l purchase;
    public final int smaato;
    public final long subs;
    public final UUID yandex;

    public C4365l(UUID uuid, EnumC9176l enumC9176l, HashSet hashSet, C4279l c4279l, C4279l c4279l2, int i, int i2, C13152l c13152l, long j, C1364l c1364l, long j2, int i3) {
        this.yandex = uuid;
        this.loadAd = enumC9176l;
        this.crashlytics = hashSet;
        this.amazon = c4279l;
        this.purchase = c4279l2;
        this.billing = i;
        this.mopub = i2;
        this.admob = c13152l;
        this.subs = j;
        this.isPro = c1364l;
        this.firebase = j2;
        this.smaato = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C4365l.class.equals(obj.getClass())) {
            return false;
        }
        C4365l c4365l = (C4365l) obj;
        if (this.billing == c4365l.billing && this.mopub == c4365l.mopub && this.yandex.equals(c4365l.yandex) && this.loadAd == c4365l.loadAd && AbstractC8576l.yandex(this.amazon, c4365l.amazon) && this.admob.equals(c4365l.admob) && this.subs == c4365l.subs && AbstractC8576l.yandex(this.isPro, c4365l.isPro) && this.firebase == c4365l.firebase && this.smaato == c4365l.smaato && this.crashlytics.equals(c4365l.crashlytics)) {
            return AbstractC8576l.yandex(this.purchase, c4365l.purchase);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.admob.hashCode() + ((((((this.purchase.hashCode() + ((this.crashlytics.hashCode() + ((this.amazon.hashCode() + ((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.billing) * 31) + this.mopub) * 31)) * 31;
        long j = this.subs;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        C1364l c1364l = this.isPro;
        int iHashCode2 = (i + (c1364l != null ? c1364l.hashCode() : 0)) * 31;
        long j2 = this.firebase;
        return ((iHashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.smaato;
    }

    public final String toString() {
        return "WorkInfo{id='" + this.yandex + "', state=" + this.loadAd + ", outputData=" + this.amazon + ", tags=" + this.crashlytics + ", progress=" + this.purchase + ", runAttemptCount=" + this.billing + ", generation=" + this.mopub + ", constraints=" + this.admob + ", initialDelayMillis=" + this.subs + ", periodicityInfo=" + this.isPro + ", nextScheduleTimeMillis=" + this.firebase + "}, stopReason=" + this.smaato;
    }
}
