package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؚٓؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7242l {
    public final List adcel;
    public final int admob;
    public final long amazon;
    public final long billing;
    public final C4279l crashlytics;
    public final long firebase;
    public final long isPro;
    public final EnumC9176l loadAd;
    public final int metrica;
    public final C13152l mopub;
    public final long purchase;
    public final int remoteconfig;
    public final int smaato;
    public final List startapp;
    public final int subs;
    public final long vip;
    public final String yandex;

    public C7242l(String str, EnumC9176l enumC9176l, C4279l c4279l, long j, long j2, long j3, C13152l c13152l, int i, int i2, long j4, long j5, int i3, int i4, long j6, int i5, List list, List list2) {
        this.yandex = str;
        this.loadAd = enumC9176l;
        this.crashlytics = c4279l;
        this.amazon = j;
        this.purchase = j2;
        this.billing = j3;
        this.mopub = c13152l;
        this.admob = i;
        this.subs = i2;
        this.isPro = j4;
        this.firebase = j5;
        this.smaato = i3;
        this.remoteconfig = i4;
        this.vip = j6;
        this.metrica = i5;
        this.startapp = list;
        this.adcel = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7242l)) {
            return false;
        }
        C7242l c7242l = (C7242l) obj;
        return AbstractC8576l.yandex(this.yandex, c7242l.yandex) && this.loadAd == c7242l.loadAd && AbstractC8576l.yandex(this.crashlytics, c7242l.crashlytics) && this.amazon == c7242l.amazon && this.purchase == c7242l.purchase && this.billing == c7242l.billing && this.mopub.equals(c7242l.mopub) && this.admob == c7242l.admob && this.subs == c7242l.subs && this.isPro == c7242l.isPro && this.firebase == c7242l.firebase && this.smaato == c7242l.smaato && this.remoteconfig == c7242l.remoteconfig && this.vip == c7242l.vip && this.metrica == c7242l.metrica && this.startapp.equals(c7242l.startapp) && this.adcel.equals(c7242l.adcel);
    }

    public final int hashCode() {
        int iHashCode = (this.crashlytics.hashCode() + ((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31)) * 31;
        long j = this.amazon;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.purchase;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.billing;
        int iFirebase = AbstractC0653l.firebase(this.subs, (((this.mopub.hashCode() + ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.admob) * 31, 31);
        long j4 = this.isPro;
        int i3 = (iFirebase + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.firebase;
        int i4 = (((((i3 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.smaato) * 31) + this.remoteconfig) * 31;
        long j6 = this.vip;
        return this.adcel.hashCode() + AbstractC14814l.admob((((i4 + ((int) (j6 ^ (j6 >>> 32)))) * 31) + this.metrica) * 31, 31, this.startapp);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("WorkInfoPojo(id=");
        sb.append(this.yandex);
        sb.append(", state=");
        sb.append(this.loadAd);
        sb.append(", output=");
        sb.append(this.crashlytics);
        sb.append(", initialDelay=");
        sb.append(this.amazon);
        sb.append(", intervalDuration=");
        sb.append(this.purchase);
        sb.append(", flexDuration=");
        sb.append(this.billing);
        sb.append(", constraints=");
        sb.append(this.mopub);
        sb.append(", runAttemptCount=");
        sb.append(this.admob);
        sb.append(", backoffPolicy=");
        int i = this.subs;
        if (i != 1) {
            str = i != 2 ? "null" : "LINEAR";
        } else {
            str = "EXPONENTIAL";
        }
        sb.append(str);
        sb.append(", backoffDelayDuration=");
        sb.append(this.isPro);
        sb.append(", lastEnqueueTime=");
        sb.append(this.firebase);
        sb.append(", periodCount=");
        sb.append(this.smaato);
        sb.append(", generation=");
        sb.append(this.remoteconfig);
        sb.append(", nextScheduleTimeOverride=");
        sb.append(this.vip);
        sb.append(", stopReason=");
        sb.append(this.metrica);
        sb.append(", tags=");
        sb.append(this.startapp);
        sb.append(", progress=");
        return AbstractC0653l.subscription(sb, this.adcel, ')');
    }
}
