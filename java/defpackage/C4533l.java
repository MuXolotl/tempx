package defpackage;

import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lْؖۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4533l {
    public long admob;
    public final float amazon;
    public final C5667l billing;
    public final boolean crashlytics;
    public final String isPro;
    public final C0327l loadAd;
    public final C6644l mopub;
    public final C4553l purchase;
    public int subs;
    public final C16328l yandex;

    public C4533l(C16328l c16328l, C0327l c0327l, boolean z, float f, C4553l c4553l) {
        this.yandex = c16328l;
        this.loadAd = c0327l;
        this.crashlytics = z;
        this.amazon = f;
        this.purchase = c4553l;
        AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
        Function1 function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
        AbstractC18620l abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
        try {
            C5667l c5667lAmazon = c16328l.amazon();
            this.billing = c5667lAmazon;
            this.mopub = (C6644l) c16328l.purchase.getValue();
            Unit unit = Unit.INSTANCE;
            AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
            this.admob = c5667lAmazon.f12061l;
            this.isPro = c5667lAmazon.f12057l.toString();
        } catch (Throwable th) {
            AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
            throw th;
        }
    }

    public final void adcel() {
        C0327l c0327l = this.loadAd;
        int iCrashlytics = c0327l != null ? crashlytics(c0327l, -1) : Integer.MIN_VALUE;
        if (iCrashlytics == Integer.MIN_VALUE) {
            this.purchase.yandex = Float.NaN;
        }
        if (this.isPro.length() > 0) {
            long j = this.admob;
            int i = C12814l.crashlytics;
            int i2 = (int) (j & 4294967295L);
            if (iCrashlytics < 0) {
                iCrashlytics = 0;
            }
            long jCrashlytics = AbstractC0622l.crashlytics(iCrashlytics, i2, this.yandex);
            int i3 = (int) (jCrashlytics >> 32);
            int iBilling = AbstractC16814l.billing(jCrashlytics);
            if (i3 != i2 || !C12814l.amazon(this.admob)) {
                this.admob = AbstractC2296l.loadAd(i3, i3);
            }
            if (iBilling != 0) {
                this.subs = iBilling;
            }
        }
    }

    public final void admob() {
        this.purchase.yandex = Float.NaN;
        String str = this.isPro;
        if (str.length() > 0) {
            long j = this.admob;
            int i = (int) (4294967295L & j);
            int iAmazon = AbstractC17195l.amazon(str, C12814l.billing(j));
            if (iAmazon == C12814l.billing(this.admob) && iAmazon != str.length()) {
                iAmazon = AbstractC17195l.amazon(str, iAmazon + 1);
            }
            long jCrashlytics = AbstractC0622l.crashlytics(iAmazon, i, this.yandex);
            int i2 = (int) (jCrashlytics >> 32);
            int iBilling = AbstractC16814l.billing(jCrashlytics);
            if (i2 != i || !C12814l.amazon(this.admob)) {
                this.admob = AbstractC2296l.loadAd(i2, i2);
            }
            if (iBilling != 0) {
                this.subs = iBilling;
            }
        }
    }

    public final void ads() {
        if (this.isPro.length() > 0) {
            long j = this.admob;
            int i = C12814l.crashlytics;
            int i2 = (int) (j & 4294967295L);
            long jCrashlytics = AbstractC0622l.crashlytics(amazon(-1), i2, this.yandex);
            int i3 = (int) (jCrashlytics >> 32);
            int iBilling = AbstractC16814l.billing(jCrashlytics);
            if (i3 != i2 || !C12814l.amazon(this.admob)) {
                this.admob = AbstractC2296l.loadAd(i3, i3);
            }
            if (iBilling != 0) {
                this.subs = iBilling;
            }
        }
    }

    public final int amazon(int i) {
        long j = this.billing.f12061l;
        int i2 = C12814l.crashlytics;
        int i3 = (int) (j & 4294967295L);
        C0327l c0327l = this.loadAd;
        if (c0327l != null) {
            C6222l c6222l = c0327l.loadAd;
            float f = this.amazon;
            if (!Float.isNaN(f)) {
                C8896l c8896lRemoteconfig = c0327l.crashlytics(i3).remoteconfig(0.0f, f * i);
                float f2 = c8896lRemoteconfig.loadAd;
                float fLoadAd = c6222l.loadAd(c6222l.purchase(f2));
                return Math.abs(f2 - fLoadAd) > Math.abs(c8896lRemoteconfig.amazon - fLoadAd) ? c6222l.mopub(c8896lRemoteconfig.admob()) : c6222l.mopub(c8896lRemoteconfig.amazon());
            }
        }
        return i3;
    }

    public final void billing() {
        if (this.isPro.length() > 0) {
            long j = this.admob;
            int i = C12814l.crashlytics;
            int i2 = (int) (j & 4294967295L);
            long jCrashlytics = AbstractC0622l.crashlytics(amazon(1), i2, this.yandex);
            int i3 = (int) (jCrashlytics >> 32);
            int iBilling = AbstractC16814l.billing(jCrashlytics);
            if (i3 != i2 || !C12814l.amazon(this.admob)) {
                this.admob = AbstractC2296l.loadAd(i3, i3);
            }
            if (iBilling != 0) {
                this.subs = iBilling;
            }
        }
    }

    public final int crashlytics(C0327l c0327l, int i) {
        long j = this.admob;
        int i2 = C12814l.crashlytics;
        int i3 = (int) (j & 4294967295L);
        C4553l c4553l = this.purchase;
        if (Float.isNaN(c4553l.yandex)) {
            c4553l.yandex = c0327l.crashlytics(i3).yandex;
        }
        C6222l c6222l = c0327l.loadAd;
        int iAmazon = c6222l.amazon(i3) + i;
        if (iAmazon < 0) {
            return RecyclerView.UNDEFINED_DURATION;
        }
        if (iAmazon >= c6222l.billing) {
            return Alert.DURATION_SHOW_INDEFINITELY;
        }
        float fLoadAd = c6222l.loadAd(iAmazon) - 1.0f;
        float f = c4553l.yandex;
        if ((loadAd() && f >= c0327l.admob(iAmazon)) || (!loadAd() && f <= c0327l.mopub(iAmazon))) {
            return c6222l.crashlytics(iAmazon, true);
        }
        return c6222l.mopub((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fLoadAd)) & 4294967295L));
    }

    public final void firebase() {
        this.purchase.yandex = Float.NaN;
        String str = this.isPro;
        if (str.length() > 0) {
            long j = this.admob;
            int i = (int) (4294967295L & j);
            int iPurchase = AbstractC17195l.purchase(str, C12814l.mopub(j));
            if (iPurchase == C12814l.mopub(this.admob) && iPurchase != 0) {
                iPurchase = AbstractC17195l.purchase(str, iPurchase - 1);
            }
            long jCrashlytics = AbstractC0622l.crashlytics(iPurchase, i, this.yandex);
            int i2 = (int) (jCrashlytics >> 32);
            int iBilling = AbstractC16814l.billing(jCrashlytics);
            if (i2 != i || !C12814l.amazon(this.admob)) {
                this.admob = AbstractC2296l.loadAd(i2, i2);
            }
            if (iBilling != 0) {
                this.subs = iBilling;
            }
        }
    }

    public final void isPro() {
        this.purchase.yandex = Float.NaN;
        String str = this.isPro;
        if (str.length() > 0) {
            long j = this.admob;
            int i = C12814l.crashlytics;
            int i2 = (int) (j & 4294967295L);
            long jCrashlytics = AbstractC0622l.crashlytics(AbstractC9679l.loadAd(i2, str), i2, this.yandex);
            int i3 = (int) (jCrashlytics >> 32);
            int iBilling = AbstractC16814l.billing(jCrashlytics);
            if (i3 != i2 || !C12814l.amazon(this.admob)) {
                this.admob = AbstractC2296l.loadAd(i3, i3);
            }
            if (iBilling != 0) {
                this.subs = iBilling;
            }
        }
    }

    public final boolean loadAd() {
        C0327l c0327l = this.loadAd;
        if (c0327l != null) {
            long j = this.admob;
            int i = C12814l.crashlytics;
            if (c0327l.isPro((int) (j & 4294967295L)) != 1) {
                return false;
            }
        }
        return true;
    }

    public final void metrica() {
        int length;
        this.purchase.yandex = Float.NaN;
        String str = this.isPro;
        if (str.length() > 0) {
            long j = this.admob;
            int i = C12814l.crashlytics;
            int i2 = (int) (4294967295L & j);
            C0327l c0327l = this.loadAd;
            if (c0327l != null) {
                C6222l c6222l = c0327l.loadAd;
                length = c6222l.crashlytics(c6222l.amazon(C12814l.billing(j)), true);
            } else {
                length = str.length();
            }
            long jCrashlytics = AbstractC0622l.crashlytics(length, i2, this.yandex);
            int i3 = (int) (jCrashlytics >> 32);
            int iBilling = AbstractC16814l.billing(jCrashlytics);
            if (i3 != i2 || !C12814l.amazon(this.admob)) {
                this.admob = AbstractC2296l.loadAd(i3, i3);
            }
            if (iBilling != 0) {
                this.subs = iBilling;
            }
        }
    }

    public final void mopub() {
        this.purchase.yandex = Float.NaN;
        String str = this.isPro;
        if (str.length() > 0) {
            long j = this.admob;
            int i = C12814l.crashlytics;
            int i2 = (int) (j & 4294967295L);
            long jCrashlytics = AbstractC0622l.crashlytics(AbstractC9679l.yandex(i2, str), i2, this.yandex);
            int i3 = (int) (jCrashlytics >> 32);
            int iBilling = AbstractC16814l.billing(jCrashlytics);
            if (i3 != i2 || !C12814l.amazon(this.admob)) {
                this.admob = AbstractC2296l.loadAd(i3, i3);
            }
            if (iBilling != 0) {
                this.subs = iBilling;
            }
        }
    }

    public final void purchase() {
        C0327l c0327l = this.loadAd;
        int iCrashlytics = c0327l != null ? crashlytics(c0327l, 1) : Integer.MAX_VALUE;
        if (iCrashlytics == Integer.MAX_VALUE) {
            this.purchase.yandex = Float.NaN;
        }
        String str = this.isPro;
        if (str.length() > 0) {
            long j = this.admob;
            int i = C12814l.crashlytics;
            int i2 = (int) (j & 4294967295L);
            int length = str.length();
            if (iCrashlytics > length) {
                iCrashlytics = length;
            }
            long jCrashlytics = AbstractC0622l.crashlytics(iCrashlytics, i2, this.yandex);
            int i3 = (int) (jCrashlytics >> 32);
            int iBilling = AbstractC16814l.billing(jCrashlytics);
            if (i3 != i2 || !C12814l.amazon(this.admob)) {
                this.admob = AbstractC2296l.loadAd(i3, i3);
            }
            if (iBilling != 0) {
                this.subs = iBilling;
            }
        }
    }

    public final void remoteconfig() {
        this.purchase.yandex = Float.NaN;
        String str = this.isPro;
        if (str.length() > 0) {
            long j = this.admob;
            int i = C12814l.crashlytics;
            int i2 = (int) (j & 4294967295L);
            long jCrashlytics = AbstractC0622l.crashlytics(str.length(), i2, this.yandex);
            int i3 = (int) (jCrashlytics >> 32);
            int iBilling = AbstractC16814l.billing(jCrashlytics);
            if (i3 != i2 || !C12814l.amazon(this.admob)) {
                this.admob = AbstractC2296l.loadAd(i3, i3);
            }
            if (iBilling != 0) {
                this.subs = iBilling;
            }
        }
    }

    public final void smaato() {
        this.purchase.yandex = Float.NaN;
        String str = this.isPro;
        if (str.length() > 0) {
            long j = this.admob;
            int i = C12814l.crashlytics;
            int i2 = (int) (j & 4294967295L);
            int i3 = 0;
            C0327l c0327l = this.loadAd;
            if (c0327l != null) {
                for (int i4 = i2; i4 > 0; i4--) {
                    int length = str.length() - 1;
                    if (i4 <= length) {
                        length = i4;
                    }
                    long jSmaato = c0327l.smaato(length);
                    int i5 = C12814l.crashlytics;
                    int i6 = (int) (jSmaato >> 32);
                    if (i6 < i4) {
                        i3 = i6;
                        break;
                    }
                }
            }
            long jCrashlytics = AbstractC0622l.crashlytics(i3, i2, this.yandex);
            int i7 = (int) (jCrashlytics >> 32);
            int iBilling = AbstractC16814l.billing(jCrashlytics);
            if (i7 != i2 || !C12814l.amazon(this.admob)) {
                this.admob = AbstractC2296l.loadAd(i7, i7);
            }
            if (iBilling != 0) {
                this.subs = iBilling;
            }
        }
    }

    public final void startapp() {
        int iSubs;
        this.purchase.yandex = Float.NaN;
        if (this.isPro.length() > 0) {
            long j = this.admob;
            int i = C12814l.crashlytics;
            int i2 = (int) (4294967295L & j);
            C0327l c0327l = this.loadAd;
            if (c0327l != null) {
                iSubs = c0327l.subs(c0327l.loadAd.amazon(C12814l.mopub(j)));
            } else {
                iSubs = 0;
            }
            long jCrashlytics = AbstractC0622l.crashlytics(iSubs, i2, this.yandex);
            int i3 = (int) (jCrashlytics >> 32);
            int iBilling = AbstractC16814l.billing(jCrashlytics);
            if (i3 != i2 || !C12814l.amazon(this.admob)) {
                this.admob = AbstractC2296l.loadAd(i3, i3);
            }
            if (iBilling != 0) {
                this.subs = iBilling;
            }
        }
    }

    public final void subs() {
        int length;
        this.purchase.yandex = Float.NaN;
        String str = this.isPro;
        if (str.length() > 0) {
            long j = this.admob;
            int i = C12814l.crashlytics;
            int i2 = (int) (j & 4294967295L);
            C0327l c0327l = this.loadAd;
            if (c0327l != null) {
                int i3 = i2;
                while (true) {
                    C5667l c5667l = this.billing;
                    if (i3 < c5667l.f12057l.length()) {
                        int length2 = str.length() - 1;
                        if (i3 <= length2) {
                            length2 = i3;
                        }
                        long jSmaato = c0327l.smaato(length2);
                        int i4 = C12814l.crashlytics;
                        int i5 = (int) (jSmaato & 4294967295L);
                        if (i5 > i3) {
                            length = i5;
                            break;
                        }
                        i3++;
                    } else {
                        length = c5667l.f12057l.length();
                        break;
                    }
                }
            } else {
                length = str.length();
            }
            long jCrashlytics = AbstractC0622l.crashlytics(length, i2, this.yandex);
            int i6 = (int) (jCrashlytics >> 32);
            int iBilling = AbstractC16814l.billing(jCrashlytics);
            if (i6 != i2 || !C12814l.amazon(this.admob)) {
                this.admob = AbstractC2296l.loadAd(i6, i6);
            }
            if (iBilling != 0) {
                this.subs = iBilling;
            }
        }
    }

    public final void subscription() {
        if (this.isPro.length() > 0) {
            long j = this.billing.f12061l;
            int i = C12814l.crashlytics;
            this.admob = AbstractC2296l.loadAd((int) (j >> 32), (int) (this.admob & 4294967295L));
        }
    }

    public final void vip() {
        this.purchase.yandex = Float.NaN;
        if (this.isPro.length() > 0) {
            long j = this.admob;
            int i = C12814l.crashlytics;
            int i2 = (int) (j & 4294967295L);
            long jCrashlytics = AbstractC0622l.crashlytics(0, i2, this.yandex);
            int i3 = (int) (jCrashlytics >> 32);
            int iBilling = AbstractC16814l.billing(jCrashlytics);
            if (i3 != i2 || !C12814l.amazon(this.admob)) {
                this.admob = AbstractC2296l.loadAd(i3, i3);
            }
            if (iBilling != 0) {
                this.subs = iBilling;
            }
        }
    }

    public final void yandex() {
        if (this.isPro.length() > 0) {
            C5667l c5667l = this.billing;
            boolean zAmazon = C12814l.amazon(c5667l.f12061l);
            C16328l c16328l = this.yandex;
            if (zAmazon) {
                C16328l.subs(c16328l, "", AbstractC2296l.loadAd((int) (c5667l.f12061l >> 32), (int) (this.admob & 4294967295L)), !this.crashlytics, 4);
            } else {
                c16328l.crashlytics();
            }
            this.admob = this.yandex.amazon().f12061l;
            this.subs = 1;
        }
    }
}
