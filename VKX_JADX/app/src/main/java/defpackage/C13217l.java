package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًؚْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13217l implements InterfaceC17792l {
    public final EnumC7283l adcel;
    public final InterfaceC2262l admob;
    public final int ads;
    public final float amazon;
    public final float billing;
    public final boolean crashlytics;
    public final Function1 firebase;
    public final int isPro;
    public final int loadAd;
    public final int metrica;
    public final boolean mopub;
    public final InterfaceC17792l purchase;
    public final List remoteconfig;
    public final Function1 smaato;
    public final int startapp;
    public final InterfaceC13490l subs;
    public final int subscription;
    public final int vip;
    public final C2931l yandex;

    public C13217l(C2931l c2931l, int i, boolean z, float f, InterfaceC17792l interfaceC17792l, float f2, boolean z2, InterfaceC2262l interfaceC2262l, InterfaceC13490l interfaceC13490l, int i2, Function1 function1, Function1 function2, List list, int i3, int i4, int i5, EnumC7283l enumC7283l, int i6, int i7) {
        this.yandex = c2931l;
        this.loadAd = i;
        this.crashlytics = z;
        this.amazon = f;
        this.purchase = interfaceC17792l;
        this.billing = f2;
        this.mopub = z2;
        this.admob = interfaceC2262l;
        this.subs = interfaceC13490l;
        this.isPro = i2;
        this.firebase = function1;
        this.smaato = function2;
        this.remoteconfig = list;
        this.vip = i3;
        this.metrica = i4;
        this.startapp = i5;
        this.adcel = enumC7283l;
        this.ads = i6;
        this.subscription = i7;
    }

    public final C13217l admob(int i, boolean z) {
        C2931l c2931l;
        List list;
        int i2;
        if (this.mopub) {
            return null;
        }
        List list2 = this.remoteconfig;
        if (list2.isEmpty() || (c2931l = this.yandex) == null) {
            return null;
        }
        int i3 = c2931l.admob;
        int i4 = this.loadAd - i;
        if (i4 < 0 || i4 >= i3) {
            return null;
        }
        C9696l c9696l = (C9696l) AbstractC16901l.m4231native(list2);
        C9696l c9696l2 = (C9696l) AbstractC16901l.m4214continue(list2);
        if (c9696l.signatures || c9696l2.signatures) {
            return null;
        }
        int i5 = this.metrica;
        int i6 = this.vip;
        EnumC7283l enumC7283l = this.adcel;
        if (i < 0) {
            if (Math.min((c9696l.loadAd() + AbstractC10033l.mopub(c9696l, enumC7283l)) - i6, (c9696l2.loadAd() + AbstractC10033l.mopub(c9696l2, enumC7283l)) - i5) <= (-i)) {
                return null;
            }
        } else if (Math.min(i6 - AbstractC10033l.mopub(c9696l, enumC7283l), i5 - AbstractC10033l.mopub(c9696l2, enumC7283l)) <= i) {
            return null;
        }
        int size = list2.size();
        int i7 = 0;
        while (i7 < size) {
            C9696l c9696l3 = (C9696l) list2.get(i7);
            boolean z2 = c9696l3.crashlytics;
            if (c9696l3.signatures) {
                list = list2;
                i2 = size;
            } else {
                long j = c9696l3.ad;
                long j2 = 4294967295L;
                c9696l3.ad = (((long) (z2 ? (int) (j >> 32) : ((int) (j >> 32)) + i)) << 32) | (((long) (z2 ? ((int) (j & 4294967295L)) + i : (int) (j & 4294967295L))) & 4294967295L);
                if (z) {
                    int size2 = c9696l3.admob.size();
                    int i8 = 0;
                    while (i8 < size2) {
                        C7136l c7136lYandex = c9696l3.firebase.yandex(i8, c9696l3.loadAd);
                        if (c7136lYandex != null) {
                            long j3 = c7136lYandex.smaato;
                            c7136lYandex.smaato = (((long) (z2 ? ((int) (j3 & j2)) + i : (int) (j3 & j2))) & j2) | (((long) (z2 ? (int) (j3 >> 32) : ((int) (j3 >> 32)) + i)) << 32);
                        } else {
                            j2 = j2;
                        }
                        i8++;
                        list2 = list2;
                        j2 = j2;
                        size = size;
                    }
                }
                list = list2;
                i2 = size;
            }
            i7++;
            i4 = i4;
            list2 = list;
            size = i2;
        }
        return new C13217l(this.yandex, i4, this.crashlytics || i > 0, i, this.purchase, this.billing, this.mopub, this.admob, this.subs, this.isPro, this.firebase, this.smaato, list2, this.vip, this.metrica, this.startapp, enumC7283l, this.ads, this.subscription);
    }

    @Override // defpackage.InterfaceC17792l
    public final Function1 amazon() {
        return this.purchase.amazon();
    }

    @Override // defpackage.InterfaceC17792l
    public final Function2 billing() {
        return this.purchase.billing();
    }

    @Override // defpackage.InterfaceC17792l
    public final void crashlytics() {
        this.purchase.crashlytics();
    }

    @Override // defpackage.InterfaceC17792l
    public final int loadAd() {
        return this.purchase.loadAd();
    }

    @Override // defpackage.InterfaceC17792l
    public final Function1 mopub() {
        return this.purchase.mopub();
    }

    @Override // defpackage.InterfaceC17792l
    public final int purchase() {
        return this.purchase.purchase();
    }

    public final long subs() {
        InterfaceC17792l interfaceC17792l = this.purchase;
        return (((long) interfaceC17792l.purchase()) << 32) | (((long) interfaceC17792l.loadAd()) & 4294967295L);
    }

    @Override // defpackage.InterfaceC17792l
    public final Map yandex() {
        return this.purchase.yandex();
    }
}
