package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؗؗۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4685l implements InterfaceC17792l {
    public final long Signature;
    public final List adcel;
    public final int admob;
    public final List ads;
    public final int amazon;
    public final int billing;
    public final int crashlytics;
    public final float firebase;
    public final C10824l isPro;
    public final int loadAd;
    public final InterfaceC17792l metrica;
    public final int mopub;
    public final EnumC7283l purchase;
    public final boolean remoteconfig;
    public final int smaato;
    public final boolean startapp;
    public final C10824l subs;
    public final InterfaceC2262l subscription;
    public final InterfaceC13490l tapsense;
    public final InterfaceC0993l vip;
    public final List yandex;

    public C4685l(List list, int i, int i2, int i3, EnumC7283l enumC7283l, int i4, int i5, int i6, C10824l c10824l, C10824l c10824l2, float f, int i7, boolean z, InterfaceC0993l interfaceC0993l, InterfaceC17792l interfaceC17792l, boolean z2, List list2, List list3, InterfaceC2262l interfaceC2262l, InterfaceC13490l interfaceC13490l, long j) {
        this.yandex = list;
        this.loadAd = i;
        this.crashlytics = i2;
        this.amazon = i3;
        this.purchase = enumC7283l;
        this.billing = i4;
        this.mopub = i5;
        this.admob = i6;
        this.subs = c10824l;
        this.isPro = c10824l2;
        this.firebase = f;
        this.smaato = i7;
        this.remoteconfig = z;
        this.vip = interfaceC0993l;
        this.metrica = interfaceC17792l;
        this.startapp = z2;
        this.adcel = list2;
        this.ads = list3;
        this.subscription = interfaceC2262l;
        this.tapsense = interfaceC13490l;
        this.Signature = j;
    }

    public final C4685l admob(int i) {
        int i2;
        int i3 = this.loadAd + this.crashlytics;
        if (this.startapp) {
            return null;
        }
        List list = this.yandex;
        if (list.isEmpty() || this.subs == null || (i2 = this.smaato - i) < 0 || i2 >= i3) {
            return null;
        }
        float f = this.firebase - (i3 != 0 ? i / i3 : 0.0f);
        if (this.isPro == null || f >= 0.5f || f <= -0.5f) {
            return null;
        }
        C10824l c10824l = (C10824l) AbstractC16901l.m4231native(list);
        C10824l c10824l2 = (C10824l) AbstractC16901l.m4214continue(list);
        int i4 = this.mopub;
        int i5 = this.billing;
        if (i < 0) {
            if (Math.min((c10824l.firebase + i3) - i5, (c10824l2.firebase + i3) - i4) <= (-i)) {
                return null;
            }
        } else if (Math.min(i5 - c10824l.firebase, i4 - c10824l2.firebase) <= i) {
            return null;
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((C10824l) list.get(i6)).yandex(i);
        }
        List list2 = this.adcel;
        int size2 = list2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            ((C10824l) list2.get(i7)).yandex(i);
        }
        List list3 = this.ads;
        int size3 = list3.size();
        for (int i8 = 0; i8 < size3; i8++) {
            ((C10824l) list3.get(i8)).yandex(i);
        }
        return new C4685l(this.yandex, this.loadAd, this.crashlytics, this.amazon, this.purchase, this.billing, this.mopub, this.admob, this.subs, this.isPro, f, i2, this.remoteconfig || i > 0, this.vip, this.metrica, this.startapp, this.adcel, this.ads, this.subscription, this.tapsense, this.Signature);
    }

    @Override // defpackage.InterfaceC17792l
    public final Function1 amazon() {
        return this.metrica.amazon();
    }

    @Override // defpackage.InterfaceC17792l
    public final Function2 billing() {
        return this.metrica.billing();
    }

    @Override // defpackage.InterfaceC17792l
    public final void crashlytics() {
        this.metrica.crashlytics();
    }

    @Override // defpackage.InterfaceC17792l
    public final int loadAd() {
        return this.metrica.loadAd();
    }

    @Override // defpackage.InterfaceC17792l
    public final Function1 mopub() {
        return this.metrica.mopub();
    }

    @Override // defpackage.InterfaceC17792l
    public final int purchase() {
        return this.metrica.purchase();
    }

    public final long subs() {
        InterfaceC17792l interfaceC17792l = this.metrica;
        return (((long) interfaceC17792l.purchase()) << 32) | (((long) interfaceC17792l.loadAd()) & 4294967295L);
    }

    @Override // defpackage.InterfaceC17792l
    public final Map yandex() {
        return this.metrica.yandex();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C4685l(int i, int i2, int i3, EnumC7283l enumC7283l, int i4, int i5, int i6, InterfaceC0993l interfaceC0993l, InterfaceC17792l interfaceC17792l, InterfaceC2262l interfaceC2262l, InterfaceC13490l interfaceC13490l, long j) {
        C2580l c2580l = C2580l.f5619l;
        this(c2580l, i, i2, i3, enumC7283l, i4, i5, i6, null, null, 0.0f, 0, false, interfaceC0993l, interfaceC17792l, false, c2580l, c2580l, interfaceC2262l, interfaceC13490l, j);
    }
}
