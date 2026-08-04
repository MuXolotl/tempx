package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٍُۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9472l {
    public final C11090l admob;
    public final C11090l amazon;
    public final C11090l billing;
    public final C11090l crashlytics;
    public final C11090l firebase;
    public final C11090l isPro;
    public final C11090l loadAd;
    public final C11090l metrica;
    public final C11090l mopub;
    public final C11090l purchase;
    public final C11090l remoteconfig;
    public final C11090l smaato;
    public final C11090l subs;
    public final C11090l vip;
    public final C11090l yandex;

    public C9472l(C11090l c11090l, C11090l c11090l2, C11090l c11090l3, C11090l c11090l4, C11090l c11090l5, C11090l c11090l6, int i) {
        C11090l c11090l7 = AbstractC3526l.amazon;
        C11090l c11090l8 = AbstractC3526l.purchase;
        C11090l c11090l9 = AbstractC3526l.billing;
        c11090l = (i & 8) != 0 ? AbstractC3526l.mopub : c11090l;
        c11090l2 = (i & 16) != 0 ? AbstractC3526l.admob : c11090l2;
        c11090l3 = (i & 32) != 0 ? AbstractC3526l.subs : c11090l3;
        c11090l4 = (i & 64) != 0 ? AbstractC3526l.remoteconfig : c11090l4;
        c11090l5 = (i & 128) != 0 ? AbstractC3526l.vip : c11090l5;
        c11090l6 = (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? AbstractC3526l.metrica : c11090l6;
        C11090l c11090l10 = AbstractC3526l.yandex;
        C11090l c11090l11 = AbstractC3526l.loadAd;
        C11090l c11090l12 = AbstractC3526l.crashlytics;
        C11090l c11090l13 = AbstractC3526l.isPro;
        C11090l c11090l14 = AbstractC3526l.firebase;
        C11090l c11090l15 = AbstractC3526l.smaato;
        this.yandex = c11090l7;
        this.loadAd = c11090l8;
        this.crashlytics = c11090l9;
        this.amazon = c11090l;
        this.purchase = c11090l2;
        this.billing = c11090l3;
        this.mopub = c11090l4;
        this.admob = c11090l5;
        this.subs = c11090l6;
        this.isPro = c11090l10;
        this.firebase = c11090l11;
        this.smaato = c11090l12;
        this.remoteconfig = c11090l13;
        this.vip = c11090l14;
        this.metrica = c11090l15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9472l)) {
            return false;
        }
        C9472l c9472l = (C9472l) obj;
        return AbstractC8576l.yandex(this.yandex, c9472l.yandex) && AbstractC8576l.yandex(this.loadAd, c9472l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c9472l.crashlytics) && AbstractC8576l.yandex(this.amazon, c9472l.amazon) && AbstractC8576l.yandex(this.purchase, c9472l.purchase) && AbstractC8576l.yandex(this.billing, c9472l.billing) && AbstractC8576l.yandex(this.mopub, c9472l.mopub) && AbstractC8576l.yandex(this.admob, c9472l.admob) && AbstractC8576l.yandex(this.subs, c9472l.subs) && AbstractC8576l.yandex(this.isPro, c9472l.isPro) && AbstractC8576l.yandex(this.firebase, c9472l.firebase) && AbstractC8576l.yandex(this.smaato, c9472l.smaato) && AbstractC8576l.yandex(this.remoteconfig, c9472l.remoteconfig) && AbstractC8576l.yandex(this.vip, c9472l.vip) && AbstractC8576l.yandex(this.metrica, c9472l.metrica);
    }

    public final int hashCode() {
        return this.metrica.hashCode() + AbstractC12589l.isVip(this.vip, AbstractC12589l.isVip(this.remoteconfig, AbstractC12589l.isVip(this.smaato, AbstractC12589l.isVip(this.firebase, AbstractC12589l.isVip(this.isPro, AbstractC12589l.isVip(this.subs, AbstractC12589l.isVip(this.admob, AbstractC12589l.isVip(this.mopub, AbstractC12589l.isVip(this.billing, AbstractC12589l.isVip(this.purchase, AbstractC12589l.isVip(this.amazon, AbstractC12589l.isVip(this.crashlytics, AbstractC12589l.isVip(this.loadAd, this.yandex.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "Typography(displayLarge=" + this.yandex + ", displayMedium=" + this.loadAd + ",displaySmall=" + this.crashlytics + ", headlineLarge=" + this.amazon + ", headlineMedium=" + this.purchase + ", headlineSmall=" + this.billing + ", titleLarge=" + this.mopub + ", titleMedium=" + this.admob + ", titleSmall=" + this.subs + ", bodyLarge=" + this.isPro + ", bodyMedium=" + this.firebase + ", bodySmall=" + this.smaato + ", labelLarge=" + this.remoteconfig + ", labelMedium=" + this.vip + ", labelSmall=" + this.metrica + ')';
    }
}
