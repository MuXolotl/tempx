package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٕؓؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1644l implements InterfaceC17792l {
    public final int adcel;
    public final InterfaceC2262l admob;
    public final float amazon;
    public final float billing;
    public final boolean crashlytics;
    public final List firebase;
    public final long isPro;
    public final int loadAd;
    public final EnumC7283l metrica;
    public final boolean mopub;
    public final InterfaceC17792l purchase;
    public final int remoteconfig;
    public final int smaato;
    public final int startapp;
    public final InterfaceC13490l subs;
    public final int vip;
    public final C15237l yandex;

    public C1644l(C15237l c15237l, int i, boolean z, float f, InterfaceC17792l interfaceC17792l, float f2, boolean z2, InterfaceC2262l interfaceC2262l, InterfaceC13490l interfaceC13490l, long j, List list, int i2, int i3, int i4, EnumC7283l enumC7283l, int i5, int i6) {
        this.yandex = c15237l;
        this.loadAd = i;
        this.crashlytics = z;
        this.amazon = f;
        this.purchase = interfaceC17792l;
        this.billing = f2;
        this.mopub = z2;
        this.admob = interfaceC2262l;
        this.subs = interfaceC13490l;
        this.isPro = j;
        this.firebase = list;
        this.smaato = i2;
        this.remoteconfig = i3;
        this.vip = i4;
        this.metrica = enumC7283l;
        this.startapp = i5;
        this.adcel = i6;
    }

    public final C1644l admob(int i, boolean z) {
        C15237l c15237l;
        int i2;
        int i3;
        if (this.mopub) {
            return null;
        }
        List list = this.firebase;
        if (list.isEmpty() || (c15237l = this.yandex) == null) {
            return null;
        }
        int iLoadAd = c15237l.loadAd();
        int i4 = this.loadAd - i;
        if (i4 < 0 || i4 >= iLoadAd) {
            return null;
        }
        C15237l c15237l2 = (C15237l) AbstractC16901l.m4231native(list);
        C15237l c15237l3 = (C15237l) AbstractC16901l.m4214continue(list);
        if (c15237l2.license || c15237l3.license) {
            return null;
        }
        int i5 = c15237l2.metrica;
        int i6 = this.remoteconfig;
        int i7 = this.smaato;
        if (i < 0) {
            if (Math.min((c15237l2.loadAd() + i5) - i7, (c15237l3.loadAd() + c15237l3.metrica) - i6) <= (-i)) {
                return null;
            }
        } else if (Math.min(i7 - i5, i6 - c15237l3.metrica) <= i) {
            return null;
        }
        int size = list.size();
        int i8 = 0;
        while (i8 < size) {
            C15237l c15237l4 = (C15237l) list.get(i8);
            boolean z2 = c15237l4.crashlytics;
            int[] iArr = c15237l4.isVip;
            if (!c15237l4.license) {
                c15237l4.metrica += i;
                int length = iArr.length;
                for (int i9 = 0; i9 < length; i9++) {
                    int i10 = i9 & 1;
                    if ((z2 && i10 != 0) || (!z2 && i10 == 0)) {
                        iArr[i9] = iArr[i9] + i;
                    }
                }
                if (z) {
                    int size2 = c15237l4.loadAd.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        C7136l c7136lYandex = c15237l4.remoteconfig.yandex(i11, c15237l4.firebase);
                        if (c7136lYandex != null) {
                            long j = c7136lYandex.smaato;
                            if (z2) {
                                i2 = (int) (j >> 32);
                                i3 = ((int) (j & 4294967295L)) + i;
                            } else {
                                i2 = ((int) (j >> 32)) + i;
                                i3 = (int) (j & 4294967295L);
                            }
                            c7136lYandex.smaato = (((long) i3) & 4294967295L) | (((long) i2) << 32);
                        } else {
                            i8 = i8;
                        }
                        i11++;
                        i8 = i8;
                    }
                }
            }
            i8++;
        }
        return new C1644l(this.yandex, i4, this.crashlytics || i > 0, i, this.purchase, this.billing, this.mopub, this.admob, this.subs, this.isPro, list, this.smaato, this.remoteconfig, this.vip, this.metrica, this.startapp, this.adcel);
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
