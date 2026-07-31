package defpackage;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: renamed from: lُؐؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10749l {
    public static final C5019l Signature = new C5019l(new Object());
    public volatile long adcel;
    public final C8750l admob;
    public volatile long ads;
    public final long amazon;
    public final C17361l billing;
    public final long crashlytics;
    public final C5019l firebase;
    public final List isPro;
    public final C5019l loadAd;
    public final C1372l metrica;
    public final boolean mopub;
    public final int purchase;
    public final int remoteconfig;
    public final boolean smaato;
    public final boolean startapp;
    public final C9598l subs;
    public volatile long subscription;
    public volatile long tapsense;
    public final int vip;
    public final AbstractC10759l yandex;

    public C10749l(AbstractC10759l abstractC10759l, C5019l c5019l, long j, long j2, int i, C17361l c17361l, boolean z, C8750l c8750l, C9598l c9598l, List list, C5019l c5019l2, boolean z2, int i2, int i3, C1372l c1372l, long j3, long j4, long j5, long j6, boolean z3) {
        this.yandex = abstractC10759l;
        this.loadAd = c5019l;
        this.crashlytics = j;
        this.amazon = j2;
        this.purchase = i;
        this.billing = c17361l;
        this.mopub = z;
        this.admob = c8750l;
        this.subs = c9598l;
        this.isPro = list;
        this.firebase = c5019l2;
        this.smaato = z2;
        this.remoteconfig = i2;
        this.vip = i3;
        this.metrica = c1372l;
        this.adcel = j3;
        this.ads = j4;
        this.subscription = j5;
        this.tapsense = j6;
        this.startapp = z3;
    }

    public static C10749l firebase(C9598l c9598l) {
        C6181l c6181l = AbstractC10759l.yandex;
        C8750l c8750l = C8750l.amazon;
        C13708l c13708l = C13708l.f26763l;
        C1372l c1372l = C1372l.amazon;
        C5019l c5019l = Signature;
        return new C10749l(c6181l, c5019l, -9223372036854775807L, 0L, 1, null, false, c8750l, c9598l, c13708l, c5019l, false, 1, 0, c1372l, 0L, 0L, 0L, 0L, false);
    }

    public final C10749l admob(int i) {
        return new C10749l(this.yandex, this.loadAd, this.crashlytics, this.amazon, i, this.billing, this.mopub, this.admob, this.subs, this.isPro, this.firebase, this.smaato, this.remoteconfig, this.vip, this.metrica, this.adcel, this.ads, this.subscription, this.tapsense, this.startapp);
    }

    public final C10749l amazon(C5019l c5019l, long j, long j2, long j3, long j4, C8750l c8750l, C9598l c9598l, List list) {
        return new C10749l(this.yandex, c5019l, j2, j3, this.purchase, this.billing, this.mopub, c8750l, c9598l, list, this.firebase, this.smaato, this.remoteconfig, this.vip, this.metrica, this.adcel, j4, j, SystemClock.elapsedRealtime(), this.startapp);
    }

    public final C10749l billing(C17361l c17361l) {
        return new C10749l(this.yandex, this.loadAd, this.crashlytics, this.amazon, this.purchase, c17361l, this.mopub, this.admob, this.subs, this.isPro, this.firebase, this.smaato, this.remoteconfig, this.vip, this.metrica, this.adcel, this.ads, this.subscription, this.tapsense, this.startapp);
    }

    public final C10749l crashlytics(C5019l c5019l) {
        return new C10749l(this.yandex, this.loadAd, this.crashlytics, this.amazon, this.purchase, this.billing, this.mopub, this.admob, this.subs, this.isPro, c5019l, this.smaato, this.remoteconfig, this.vip, this.metrica, this.adcel, this.ads, this.subscription, this.tapsense, this.startapp);
    }

    public final C10749l isPro(AbstractC10759l abstractC10759l) {
        return new C10749l(abstractC10759l, this.loadAd, this.crashlytics, this.amazon, this.purchase, this.billing, this.mopub, this.admob, this.subs, this.isPro, this.firebase, this.smaato, this.remoteconfig, this.vip, this.metrica, this.adcel, this.ads, this.subscription, this.tapsense, this.startapp);
    }

    public final C10749l loadAd(boolean z) {
        return new C10749l(this.yandex, this.loadAd, this.crashlytics, this.amazon, this.purchase, this.billing, z, this.admob, this.subs, this.isPro, this.firebase, this.smaato, this.remoteconfig, this.vip, this.metrica, this.adcel, this.ads, this.subscription, this.tapsense, this.startapp);
    }

    public final C10749l mopub(C1372l c1372l) {
        return new C10749l(this.yandex, this.loadAd, this.crashlytics, this.amazon, this.purchase, this.billing, this.mopub, this.admob, this.subs, this.isPro, this.firebase, this.smaato, this.remoteconfig, this.vip, c1372l, this.adcel, this.ads, this.subscription, this.tapsense, this.startapp);
    }

    public final C10749l purchase(int i, int i2, boolean z) {
        return new C10749l(this.yandex, this.loadAd, this.crashlytics, this.amazon, this.purchase, this.billing, this.mopub, this.admob, this.subs, this.isPro, this.firebase, z, i, i2, this.metrica, this.adcel, this.ads, this.subscription, this.tapsense, this.startapp);
    }

    public final boolean remoteconfig() {
        return this.purchase == 3 && this.smaato && this.vip == 0;
    }

    public final long smaato() {
        long j;
        long j2;
        if (!remoteconfig()) {
            return this.subscription;
        }
        do {
            j = this.tapsense;
            j2 = this.subscription;
        } while (j != this.tapsense);
        return AbstractC15323l.m3962continue(AbstractC15323l.m3986try(j2) + ((long) ((SystemClock.elapsedRealtime() - j) * this.metrica.yandex)));
    }

    public final C10749l subs(boolean z) {
        return new C10749l(this.yandex, this.loadAd, this.crashlytics, this.amazon, this.purchase, this.billing, this.mopub, this.admob, this.subs, this.isPro, this.firebase, this.smaato, this.remoteconfig, this.vip, this.metrica, this.adcel, this.ads, this.subscription, this.tapsense, z);
    }

    public final C10749l yandex() {
        return new C10749l(this.yandex, this.loadAd, this.crashlytics, this.amazon, this.purchase, this.billing, this.mopub, this.admob, this.subs, this.isPro, this.firebase, this.smaato, this.remoteconfig, this.vip, this.metrica, this.adcel, this.ads, smaato(), SystemClock.elapsedRealtime(), this.startapp);
    }
}
