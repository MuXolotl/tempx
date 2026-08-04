package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؗۧؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5296l {
    public int admob;
    public Object[] amazon;
    public boolean billing;
    public final int crashlytics;
    public int firebase;
    public final C16535l isPro;
    public final int[] loadAd;
    public int mopub;
    public final int purchase;
    public int remoteconfig;
    public int smaato;
    public int subs;
    public boolean vip;
    public final C2859l yandex;

    public C5296l(C2859l c2859l) {
        this.yandex = c2859l;
        this.loadAd = c2859l.f6221l;
        int i = c2859l.f6220l;
        this.crashlytics = i;
        this.amazon = c2859l.f6217l;
        this.purchase = c2859l.f6224l;
        this.admob = i;
        this.subs = -1;
        this.isPro = new C16535l((byte) 0, 2);
    }

    public final void Signature() {
        if (this.firebase <= 0) {
            int i = this.subs;
            int i2 = this.mopub;
            int i3 = i2 * 5;
            int[] iArr = this.loadAd;
            if (iArr[i3 + 2] != i) {
                AbstractC5363l.yandex("Invalid slot table detected");
            }
            int i4 = this.smaato;
            int i5 = this.remoteconfig;
            C16535l c16535l = this.isPro;
            if (i4 == 0 && i5 == 0) {
                c16535l.purchase(-1);
            } else {
                c16535l.purchase(i4);
            }
            this.subs = i2;
            this.admob = iArr[i3 + 3] + i2;
            int i6 = i2 + 1;
            this.mopub = i6;
            this.smaato = AbstractC0736l.loadAd(iArr, i2);
            this.remoteconfig = i2 >= this.crashlytics + (-1) ? this.purchase : iArr[(i6 * 5) + 4];
        }
    }

    public final int adcel(int i) {
        return this.loadAd[(i * 5) + 2];
    }

    public final Object admob(int i, int i2) {
        int[] iArr = this.loadAd;
        int iLoadAd = AbstractC0736l.loadAd(iArr, i);
        int i3 = i + 1;
        int i4 = iLoadAd + i2;
        return i4 < (i3 < this.crashlytics ? iArr[(i3 * 5) + 4] : this.purchase) ? this.amazon[i4] : C1867l.yandex;
    }

    public final void ads(int i) {
        if (this.firebase != 0) {
            AbstractC2032l.yandex("Cannot reposition while in an empty region");
        }
        this.mopub = i;
        int[] iArr = this.loadAd;
        int i2 = this.crashlytics;
        int i3 = i < i2 ? iArr[(i * 5) + 2] : -1;
        if (i3 != this.subs) {
            this.subs = i3;
            if (i3 < 0) {
                this.admob = i2;
            } else {
                this.admob = iArr[(i3 * 5) + 3] + i3;
            }
            this.smaato = 0;
            this.remoteconfig = 0;
        }
    }

    public final boolean amazon(int i) {
        return (this.loadAd[(i * 5) + 1] & 67108864) != 0;
    }

    public final Object billing() {
        int i = this.mopub;
        if (i < this.admob) {
            return loadAd(this.loadAd, i);
        }
        return 0;
    }

    public final void crashlytics() {
        this.billing = true;
        C2859l c2859l = this.yandex;
        if (c2859l.f6223l <= 0) {
            AbstractC2032l.yandex("Unexpected reader close()");
        }
        c2859l.f6223l--;
        this.amazon = new Object[0];
    }

    public final boolean firebase(int i) {
        return (this.loadAd[(i * 5) + 1] & 536870912) != 0;
    }

    public final boolean isPro(int i) {
        return (this.loadAd[(i * 5) + 1] & 134217728) != 0;
    }

    public final Object loadAd(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) != 0) {
            return this.amazon[i2 >= iArr.length ? iArr.length : iArr[i2 + 4] + Integer.bitCount(i3 >> 29)];
        }
        return C1867l.yandex;
    }

    public final int metrica(int i) {
        return this.loadAd[(i * 5) + 1] & 67108863;
    }

    public final int mopub() {
        int i = this.mopub;
        if (i >= this.admob) {
            return 0;
        }
        return this.loadAd[i * 5];
    }

    public final void purchase() {
        if (this.firebase == 0) {
            if (this.mopub != this.admob) {
                AbstractC2032l.yandex("endGroup() not called at the end of a group");
            }
            int i = (this.subs * 5) + 2;
            int[] iArr = this.loadAd;
            int i2 = iArr[i];
            this.subs = i2;
            int i3 = this.crashlytics;
            this.admob = i2 < 0 ? i3 : iArr[(i2 * 5) + 3] + i2;
            int iAmazon = this.isPro.amazon();
            if (iAmazon < 0) {
                this.smaato = 0;
                this.remoteconfig = 0;
            } else {
                this.smaato = iAmazon;
                this.remoteconfig = i2 >= i3 + (-1) ? this.purchase : iArr[((i2 + 1) * 5) + 4];
            }
        }
    }

    public final Object remoteconfig() {
        int i;
        if (this.firebase > 0 || (i = this.smaato) >= this.remoteconfig) {
            this.vip = false;
            return C1867l.yandex;
        }
        this.vip = true;
        Object[] objArr = this.amazon;
        this.smaato = i + 1;
        return objArr[i];
    }

    public final boolean smaato(int i) {
        return (this.loadAd[(i * 5) + 1] & 1073741824) != 0;
    }

    public final Object startapp(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.amazon[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final int subs(int i) {
        return this.loadAd[i * 5];
    }

    public final int subscription() {
        if (this.firebase != 0) {
            AbstractC2032l.yandex("Cannot skip while in an empty region");
        }
        int i = this.mopub;
        int i2 = i * 5;
        int[] iArr = this.loadAd;
        int i3 = iArr[i2 + 1];
        int i4 = (1073741824 & i3) != 0 ? 1 : i3 & 67108863;
        this.mopub = iArr[i2 + 3] + i;
        return i4;
    }

    public final void tapsense() {
        if (!(this.firebase == 0)) {
            AbstractC2032l.yandex("Cannot skip the enclosing group while in an empty region");
        }
        this.mopub = this.admob;
        this.smaato = 0;
        this.remoteconfig = 0;
    }

    public final String toString() {
        int i = this.mopub;
        int iMopub = mopub();
        int i2 = this.subs;
        int i3 = this.admob;
        StringBuilder sbSubscription = AbstractC14814l.subscription(i, iMopub, "SlotReader(current=", ", key=", ", parent=");
        sbSubscription.append(i2);
        sbSubscription.append(", end=");
        sbSubscription.append(i3);
        sbSubscription.append(")");
        return sbSubscription.toString();
    }

    public final Object vip(int i) {
        int i2 = i * 5;
        int[] iArr = this.loadAd;
        int i3 = iArr[i2 + 1] & 1073741824;
        if (i3 != 0) {
            return i3 != 0 ? this.amazon[iArr[i2 + 4]] : C1867l.yandex;
        }
        return null;
    }

    public final C12317l yandex(int i) {
        ArrayList arrayList = this.yandex.f6225l;
        int iPurchase = AbstractC0736l.purchase(arrayList, i, this.crashlytics);
        if (iPurchase >= 0) {
            return (C12317l) arrayList.get(iPurchase);
        }
        C12317l c12317l = new C12317l(i);
        arrayList.add(-(iPurchase + 1), c12317l);
        return c12317l;
    }
}
