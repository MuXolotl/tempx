package defpackage;

/* JADX INFO: renamed from: lًٝٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8150l extends AbstractC10759l {
    public final int[] admob;
    public final AbstractC1186l billing;
    public final int[] mopub;
    public final AbstractC1186l purchase;

    public C8150l(C13708l c13708l, C13708l c13708l2, int[] iArr) {
        AbstractC12442l.admob(c13708l.f26765l == iArr.length);
        this.purchase = c13708l;
        this.billing = c13708l2;
        this.mopub = iArr;
        this.admob = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.admob[iArr[i]] = i;
        }
    }

    @Override // defpackage.AbstractC10759l
    public final int admob() {
        return this.billing.size();
    }

    @Override // defpackage.AbstractC10759l
    public final C3904l billing(int i, C3904l c3904l, boolean z) {
        C3904l c3904l2 = (C3904l) this.billing.get(i);
        c3904l.subs(c3904l2.yandex, c3904l2.loadAd, c3904l2.crashlytics, c3904l2.amazon, c3904l2.purchase, c3904l2.mopub, c3904l2.billing);
        return c3904l;
    }

    @Override // defpackage.AbstractC10759l
    public final int crashlytics(boolean z) {
        if (startapp()) {
            return -1;
        }
        AbstractC1186l abstractC1186l = this.purchase;
        if (!z) {
            return abstractC1186l.size() - 1;
        }
        return this.mopub[abstractC1186l.size() - 1];
    }

    @Override // defpackage.AbstractC10759l
    public final int firebase(int i, int i2, boolean z) {
        if (i2 == 1) {
            return i;
        }
        if (i == yandex(z)) {
            if (i2 == 2) {
                return crashlytics(z);
            }
            return -1;
        }
        if (!z) {
            return i - 1;
        }
        return this.mopub[this.admob[i] - 1];
    }

    @Override // defpackage.AbstractC10759l
    public final int loadAd(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.AbstractC10759l
    public final int metrica() {
        return this.purchase.size();
    }

    @Override // defpackage.AbstractC10759l
    public final int purchase(int i, int i2, boolean z) {
        if (i2 == 1) {
            return i;
        }
        if (i == crashlytics(z)) {
            if (i2 == 2) {
                return yandex(z);
            }
            return -1;
        }
        if (!z) {
            return i + 1;
        }
        return this.mopub[this.admob[i] + 1];
    }

    @Override // defpackage.AbstractC10759l
    public final C4322l remoteconfig(int i, C4322l c4322l, long j) {
        C4322l c4322l2 = (C4322l) this.purchase.get(i);
        c4322l.loadAd(c4322l2.yandex, c4322l2.crashlytics, c4322l2.amazon, c4322l2.purchase, c4322l2.billing, c4322l2.mopub, c4322l2.admob, c4322l2.subs, c4322l2.isPro, c4322l2.smaato, c4322l2.remoteconfig, c4322l2.vip, c4322l2.metrica, c4322l2.startapp);
        c4322l.firebase = c4322l2.firebase;
        return c4322l;
    }

    @Override // defpackage.AbstractC10759l
    public final Object smaato(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.AbstractC10759l
    public final int yandex(boolean z) {
        if (startapp()) {
            return -1;
        }
        if (z) {
            return this.mopub[0];
        }
        return 0;
    }
}
