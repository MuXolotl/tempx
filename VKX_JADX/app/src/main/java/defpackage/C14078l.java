package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lُٕٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14078l {
    public final C0639l admob;
    public final InterfaceC4005l amazon;
    public long billing;
    public final C0327l crashlytics;
    public final long loadAd;
    public final C3625l mopub;
    public final C4397l purchase;
    public final C11224l subs;
    public final C3625l yandex;

    public C14078l(C0639l c0639l, InterfaceC4005l interfaceC4005l, C11224l c11224l, C4397l c4397l) {
        C3625l c3625l = c0639l.yandex;
        long j = c0639l.loadAd;
        C0327l c0327l = c11224l != null ? c11224l.yandex : null;
        this.yandex = c3625l;
        this.loadAd = j;
        this.crashlytics = c0327l;
        this.amazon = interfaceC4005l;
        this.purchase = c4397l;
        this.billing = j;
        this.mopub = c3625l;
        this.admob = c0639l;
        this.subs = c11224l;
    }

    public final void adcel(int i, int i2) {
        this.billing = AbstractC2296l.loadAd(i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    public final int admob(C11224l c11224l, int i) {
        C8896l c8896lMo2592synchronized;
        InterfaceC18212l interfaceC18212l = c11224l.loadAd;
        C0327l c0327l = c11224l.yandex;
        if (interfaceC18212l == null) {
            c8896lMo2592synchronized = C8896l.purchase;
        } else {
            InterfaceC18212l interfaceC18212l2 = c11224l.crashlytics;
            c8896lMo2592synchronized = interfaceC18212l2 != null ? interfaceC18212l2.mo2592synchronized(interfaceC18212l, true) : null;
            if (c8896lMo2592synchronized == null) {
                c8896lMo2592synchronized = C8896l.purchase;
            }
        }
        long j = this.admob.loadAd;
        int i2 = C12814l.crashlytics;
        InterfaceC4005l interfaceC4005l = this.amazon;
        C8896l c8896lCrashlytics = c0327l.crashlytics(interfaceC4005l.admob((int) (j & 4294967295L)));
        float f = c8896lCrashlytics.yandex;
        return interfaceC4005l.amazon(c0327l.loadAd.mopub((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (c8896lMo2592synchronized.mopub() & 4294967295L)) * i) + c8896lCrashlytics.loadAd)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)));
    }

    public final int ads() {
        long j = this.billing;
        int i = C12814l.crashlytics;
        return this.amazon.admob((int) (j & 4294967295L));
    }

    public final Integer amazon() {
        int length;
        C0327l c0327l = this.crashlytics;
        if (c0327l == null) {
            return null;
        }
        int iAds = ads();
        while (true) {
            C3625l c3625l = this.yandex;
            if (iAds < c3625l.f7563l.length()) {
                int length2 = this.mopub.f7563l.length() - 1;
                if (iAds <= length2) {
                    length2 = iAds;
                }
                long jSmaato = c0327l.smaato(length2);
                int i = C12814l.crashlytics;
                int i2 = (int) (jSmaato & 4294967295L);
                if (i2 > iAds) {
                    length = this.amazon.amazon(i2);
                    break;
                }
                iAds++;
            } else {
                length = c3625l.f7563l.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final boolean billing() {
        C0327l c0327l = this.crashlytics;
        return (c0327l != null ? c0327l.isPro(ads()) : 0) != 2;
    }

    public final Integer crashlytics() {
        C0327l c0327l = this.crashlytics;
        if (c0327l == null) {
            return null;
        }
        int iMopub = C12814l.mopub(this.billing);
        InterfaceC4005l interfaceC4005l = this.amazon;
        return Integer.valueOf(interfaceC4005l.amazon(c0327l.subs(c0327l.loadAd.amazon(interfaceC4005l.admob(iMopub)))));
    }

    public final void firebase() {
        this.purchase.yandex = null;
        C3625l c3625l = this.mopub;
        if (c3625l.f7563l.length() > 0) {
            String str = c3625l.f7563l;
            long j = this.billing;
            int i = C12814l.crashlytics;
            int iLoadAd = AbstractC9679l.loadAd((int) (j & 4294967295L), str);
            if (iLoadAd != -1) {
                adcel(iLoadAd, iLoadAd);
            }
        }
    }

    public final void isPro() {
        this.purchase.yandex = null;
        C3625l c3625l = this.mopub;
        String str = c3625l.f7563l;
        String str2 = c3625l.f7563l;
        if (str.length() > 0) {
            int iAmazon = AbstractC17195l.amazon(str2, C12814l.billing(this.billing));
            if (iAmazon == C12814l.billing(this.billing) && iAmazon != str2.length()) {
                iAmazon = AbstractC17195l.amazon(str2, iAmazon + 1);
            }
            adcel(iAmazon, iAmazon);
        }
    }

    public final Integer loadAd() {
        C0327l c0327l = this.crashlytics;
        if (c0327l == null) {
            return null;
        }
        C6222l c6222l = c0327l.loadAd;
        int iBilling = C12814l.billing(this.billing);
        InterfaceC4005l interfaceC4005l = this.amazon;
        return Integer.valueOf(interfaceC4005l.amazon(c6222l.crashlytics(c6222l.amazon(interfaceC4005l.admob(iBilling)), true)));
    }

    public final void metrica() {
        Integer numCrashlytics;
        this.purchase.yandex = null;
        if (this.mopub.f7563l.length() <= 0 || (numCrashlytics = crashlytics()) == null) {
            return;
        }
        int iIntValue = numCrashlytics.intValue();
        adcel(iIntValue, iIntValue);
    }

    public final int mopub(C0327l c0327l, int i) {
        int iAds = ads();
        C4397l c4397l = this.purchase;
        if (c4397l.yandex == null) {
            c4397l.yandex = Float.valueOf(c0327l.crashlytics(iAds).yandex);
        }
        C6222l c6222l = c0327l.loadAd;
        int iAmazon = c6222l.amazon(iAds) + i;
        if (iAmazon < 0) {
            return 0;
        }
        if (iAmazon >= c6222l.billing) {
            return this.mopub.f7563l.length();
        }
        float fLoadAd = c6222l.loadAd(iAmazon) - 1.0f;
        Float f = c4397l.yandex;
        float fFloatValue = f.floatValue();
        if ((billing() && fFloatValue >= c0327l.admob(iAmazon)) || (!billing() && fFloatValue <= c0327l.mopub(iAmazon))) {
            return c6222l.crashlytics(iAmazon, true);
        }
        return this.amazon.amazon(c6222l.mopub((((long) Float.floatToRawIntBits(fLoadAd)) & 4294967295L) | (Float.floatToRawIntBits(f.floatValue()) << 32)));
    }

    public final Integer purchase() {
        int iAmazon;
        C0327l c0327l = this.crashlytics;
        if (c0327l == null) {
            return null;
        }
        for (int iAds = ads(); iAds > 0; iAds--) {
            int length = this.mopub.f7563l.length() - 1;
            if (iAds <= length) {
                length = iAds;
            }
            long jSmaato = c0327l.smaato(length);
            int i = C12814l.crashlytics;
            int i2 = (int) (jSmaato >> 32);
            if (i2 < iAds) {
                iAmazon = this.amazon.amazon(i2);
                return Integer.valueOf(iAmazon);
            }
        }
        iAmazon = 0;
        return Integer.valueOf(iAmazon);
    }

    public final void remoteconfig() {
        C4397l c4397l = this.purchase;
        c4397l.yandex = null;
        C3625l c3625l = this.mopub;
        if (c3625l.f7563l.length() > 0) {
            if (!billing()) {
                firebase();
                return;
            }
            c4397l.yandex = null;
            if (c3625l.f7563l.length() > 0) {
                String str = c3625l.f7563l;
                long j = this.billing;
                int i = C12814l.crashlytics;
                int iYandex = AbstractC9679l.yandex((int) (j & 4294967295L), str);
                if (iYandex != -1) {
                    adcel(iYandex, iYandex);
                }
            }
        }
    }

    public final void smaato() {
        this.purchase.yandex = null;
        C3625l c3625l = this.mopub;
        String str = c3625l.f7563l;
        String str2 = c3625l.f7563l;
        if (str.length() > 0) {
            int iPurchase = AbstractC17195l.purchase(str2, C12814l.mopub(this.billing));
            if (iPurchase == C12814l.mopub(this.billing) && iPurchase != 0) {
                iPurchase = AbstractC17195l.purchase(str2, iPurchase - 1);
            }
            adcel(iPurchase, iPurchase);
        }
    }

    public final void startapp() {
        if (this.mopub.f7563l.length() > 0) {
            int i = C12814l.crashlytics;
            this.billing = AbstractC2296l.loadAd((int) (this.loadAd >> 32), (int) (this.billing & 4294967295L));
        }
    }

    public final void subs() {
        C4397l c4397l = this.purchase;
        c4397l.yandex = null;
        C3625l c3625l = this.mopub;
        if (c3625l.f7563l.length() > 0) {
            if (billing()) {
                firebase();
                return;
            }
            c4397l.yandex = null;
            if (c3625l.f7563l.length() > 0) {
                String str = c3625l.f7563l;
                long j = this.billing;
                int i = C12814l.crashlytics;
                int iYandex = AbstractC9679l.yandex((int) (j & 4294967295L), str);
                if (iYandex != -1) {
                    adcel(iYandex, iYandex);
                }
            }
        }
    }

    public final void vip() {
        Integer numLoadAd;
        this.purchase.yandex = null;
        if (this.mopub.f7563l.length() <= 0 || (numLoadAd = loadAd()) == null) {
            return;
        }
        int iIntValue = numLoadAd.intValue();
        adcel(iIntValue, iIntValue);
    }

    public final List yandex(Function1 function1) {
        if (!C12814l.amazon(this.billing)) {
            return AbstractC14055l.remoteconfig(new C0597l("", 0), new C3363l(C12814l.mopub(this.billing), C12814l.mopub(this.billing)));
        }
        InterfaceC3442l interfaceC3442l = (InterfaceC3442l) function1.invoke(this);
        if (interfaceC3442l != null) {
            return Collections.singletonList(interfaceC3442l);
        }
        return null;
    }
}
