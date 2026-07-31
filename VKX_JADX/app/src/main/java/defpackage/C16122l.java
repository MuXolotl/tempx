package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٖؑٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16122l implements InterfaceC17792l {
    public final boolean Signature;
    public final int adcel;
    public final boolean admob;
    public final int ads;
    public final InterfaceC17792l amazon;
    public final boolean billing;
    public final float crashlytics;
    public final InterfaceC13490l firebase;
    public final C10975l isPro;
    public final EnumC7283l license;
    public final int[] loadAd;
    public final int metrica;
    public final boolean mopub;
    public final float purchase;
    public final List remoteconfig;
    public final int smaato;
    public final int startapp;
    public final C12507l subs;
    public final int subscription;
    public final InterfaceC2262l tapsense;
    public final long vip;
    public final int[] yandex;

    public C16122l(int[] iArr, int[] iArr2, float f, InterfaceC17792l interfaceC17792l, float f2, boolean z, boolean z2, boolean z3, C12507l c12507l, C10975l c10975l, InterfaceC13490l interfaceC13490l, int i, List list, long j, int i2, int i3, int i4, int i5, int i6, InterfaceC2262l interfaceC2262l, boolean z4) {
        this.yandex = iArr;
        this.loadAd = iArr2;
        this.crashlytics = f;
        this.amazon = interfaceC17792l;
        this.purchase = f2;
        this.billing = z;
        this.mopub = z2;
        this.admob = z3;
        this.subs = c12507l;
        this.isPro = c10975l;
        this.firebase = interfaceC13490l;
        this.smaato = i;
        this.remoteconfig = list;
        this.vip = j;
        this.metrica = i2;
        this.startapp = i3;
        this.adcel = i4;
        this.ads = i5;
        this.subscription = i6;
        this.tapsense = interfaceC2262l;
        this.Signature = z4;
        this.license = z2 ? EnumC7283l.f15126l : EnumC7283l.f15125l;
    }

    public final C16122l admob(int i, boolean z) {
        char c;
        long j;
        long j2;
        int i2;
        if (this.admob) {
            return null;
        }
        List list = this.remoteconfig;
        if (list.isEmpty()) {
            return null;
        }
        int[] iArr = this.yandex;
        if (iArr.length == 0) {
            return null;
        }
        int[] iArr2 = this.loadAd;
        if (iArr2.length == 0) {
            return null;
        }
        int i3 = this.ads;
        int i4 = this.startapp;
        int i5 = i4 - i3;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            C15724l c15724l = (C15724l) list.get(i6);
            if (c15724l.Signature) {
                return null;
            }
            if ((c15724l.loadAd() <= 0) != (c15724l.loadAd() + i <= 0)) {
                return null;
            }
            int iLoadAd = c15724l.loadAd();
            int i7 = this.metrica;
            if (iLoadAd <= i7) {
                if (i < 0) {
                    if ((c15724l.crashlytics() + c15724l.loadAd()) - i7 <= (-i)) {
                        return null;
                    }
                } else if (i7 - c15724l.loadAd() <= i) {
                    return null;
                }
            }
            if (c15724l.crashlytics() + c15724l.loadAd() >= i5) {
                if (i < 0) {
                    if ((c15724l.crashlytics() + c15724l.loadAd()) - i4 <= (-i)) {
                        return null;
                    }
                } else if (i4 - c15724l.loadAd() <= i) {
                    return null;
                }
            }
        }
        int size2 = list.size();
        for (int i8 = 0; i8 < size2; i8++) {
            C15724l c15724l2 = (C15724l) list.get(i8);
            boolean z2 = c15724l2.amazon;
            if (!c15724l2.Signature) {
                long j3 = c15724l2.pro;
                char c2 = ' ';
                long j4 = 4294967295L;
                c15724l2.pro = (((long) (z2 ? (int) (j3 >> 32) : ((int) (j3 >> 32)) + i)) << 32) | (((long) (z2 ? ((int) (j3 & 4294967295L)) + i : (int) (j3 & 4294967295L))) & 4294967295L);
                if (z) {
                    int size3 = c15724l2.crashlytics.size();
                    int i9 = 0;
                    while (i9 < size3) {
                        C7136l c7136lYandex = c15724l2.isPro.yandex(i9, c15724l2.loadAd);
                        if (c7136lYandex != null) {
                            char c3 = c2;
                            long j5 = c7136lYandex.smaato;
                            if (z2) {
                                c = c3;
                                j2 = j5;
                                i2 = (int) (j2 >> c);
                            } else {
                                c = c3;
                                j2 = j5;
                                i2 = ((int) (j2 >> c)) + i;
                            }
                            int i10 = z2 ? ((int) (j2 & j4)) + i : (int) (j2 & j4);
                            j = j4;
                            c7136lYandex.smaato = (((long) i10) & j) | (((long) i2) << c);
                        } else {
                            c = c2;
                            j = j4;
                        }
                        i9++;
                        c2 = c;
                        j4 = j;
                    }
                }
            }
        }
        int length = iArr2.length;
        int[] iArr3 = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr3[i11] = iArr2[i11] - i;
        }
        return new C16122l(iArr, iArr3, i, this.amazon, this.purchase, this.billing || i > 0, this.mopub, this.admob, this.subs, this.isPro, this.firebase, this.smaato, list, this.vip, this.metrica, this.startapp, this.adcel, this.ads, this.subscription, this.tapsense, this.Signature);
    }

    @Override // defpackage.InterfaceC17792l
    public final Function1 amazon() {
        return this.amazon.amazon();
    }

    @Override // defpackage.InterfaceC17792l
    public final Function2 billing() {
        return this.amazon.billing();
    }

    @Override // defpackage.InterfaceC17792l
    public final void crashlytics() {
        this.amazon.crashlytics();
    }

    @Override // defpackage.InterfaceC17792l
    public final int loadAd() {
        return this.amazon.loadAd();
    }

    @Override // defpackage.InterfaceC17792l
    public final Function1 mopub() {
        return this.amazon.mopub();
    }

    @Override // defpackage.InterfaceC17792l
    public final int purchase() {
        return this.amazon.purchase();
    }

    @Override // defpackage.InterfaceC17792l
    public final Map yandex() {
        return this.amazon.yandex();
    }
}
