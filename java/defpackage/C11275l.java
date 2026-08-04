package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lُۘٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11275l {
    public int billing;
    public boolean crashlytics;
    public C9552l loadAd;
    public int mopub;
    public int smaato;
    public final C6956l yandex;
    public final C16535l amazon = new C16535l((byte) 0, 2);
    public boolean purchase = true;
    public final ArrayList admob = new ArrayList();
    public int subs = -1;
    public int isPro = -1;
    public int firebase = -1;

    public C11275l(C6956l c6956l, C9552l c9552l) {
        this.yandex = c6956l;
        this.loadAd = c9552l;
    }

    public final void amazon(boolean z) {
        C5296l c5296l = this.yandex.f14600package;
        int i = z ? c5296l.subs : c5296l.mopub;
        int i2 = i - this.billing;
        if (i2 < 0) {
            AbstractC2032l.yandex("Tried to seek backward");
        }
        if (i2 > 0) {
            C6323l c6323l = this.loadAd.yandex;
            c6323l.isPro(C14166l.amazon);
            c6323l.isPro[c6323l.firebase - c6323l.admob[c6323l.subs - 1].loadAd] = i2;
            this.billing = i;
        }
    }

    public final void crashlytics() {
        int i = this.smaato;
        if (i > 0) {
            int i2 = this.subs;
            if (i2 >= 0) {
                loadAd();
                C6323l c6323l = this.loadAd.yandex;
                c6323l.isPro(C9204l.amazon);
                int i3 = c6323l.firebase - c6323l.admob[c6323l.subs - 1].loadAd;
                int[] iArr = c6323l.isPro;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.subs = -1;
            } else {
                int i4 = this.firebase;
                int i5 = this.isPro;
                loadAd();
                C6323l c6323l2 = this.loadAd.yandex;
                c6323l2.isPro(C18349l.amazon);
                int i6 = c6323l2.firebase - c6323l2.admob[c6323l2.subs - 1].loadAd;
                int[] iArr2 = c6323l2.isPro;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.isPro = -1;
                this.firebase = -1;
            }
            this.smaato = 0;
        }
    }

    public final void loadAd() {
        int i = this.mopub;
        if (i > 0) {
            C6323l c6323l = this.loadAd.yandex;
            c6323l.isPro(C9682l.amazon);
            c6323l.isPro[c6323l.firebase - c6323l.admob[c6323l.subs - 1].loadAd] = i;
            this.mopub = 0;
        }
        ArrayList arrayList = this.admob;
        if (arrayList.isEmpty()) {
            return;
        }
        C9552l c9552l = this.loadAd;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        c9552l.getClass();
        if (size != 0) {
            C6323l c6323l2 = c9552l.yandex;
            c6323l2.isPro(C7836l.amazon);
            AbstractC12225l.smaato(c6323l2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void purchase(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                AbstractC2032l.yandex("Invalid remove index " + i);
            }
            if (this.subs == i) {
                this.smaato += i2;
                return;
            }
            crashlytics();
            this.subs = i;
            this.smaato = i2;
        }
    }

    public final void yandex() {
        crashlytics();
        ArrayList arrayList = this.admob;
        if (arrayList.isEmpty()) {
            this.mopub++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }
}
