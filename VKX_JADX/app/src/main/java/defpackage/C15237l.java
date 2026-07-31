package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: renamed from: lَٔۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15237l implements InterfaceC9146l {
    public final int Signature;
    public int ad;
    public final int adcel;
    public final int admob;
    public final int ads;
    public int advert;
    public final InterfaceC6947l amazon;
    public final EnumC9931l billing;
    public final boolean crashlytics;
    public final Object firebase;
    public final long isPro;
    public final int[] isVip;
    public boolean license;
    public final List loadAd;
    public int metrica;
    public final int mopub;
    public int pro = RecyclerView.UNDEFINED_DURATION;
    public final C0086l purchase;
    public final C12660l remoteconfig;
    public final Object smaato;
    public final int startapp;
    public final int subs;
    public final int subscription;
    public final int tapsense;
    public final long vip;
    public final int yandex;

    public C15237l(int i, List list, boolean z, InterfaceC6947l interfaceC6947l, C0086l c0086l, EnumC9931l enumC9931l, int i2, int i3, int i4, long j, Object obj, Object obj2, C12660l c12660l, long j2) {
        this.yandex = i;
        this.loadAd = list;
        this.crashlytics = z;
        this.amazon = interfaceC6947l;
        this.purchase = c0086l;
        this.billing = enumC9931l;
        this.mopub = i2;
        this.admob = i3;
        this.subs = i4;
        this.isPro = j;
        this.firebase = obj;
        this.smaato = obj2;
        this.remoteconfig = c12660l;
        this.vip = j2;
        int size = list.size();
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            AbstractC10113l abstractC10113l = (AbstractC10113l) list.get(i6);
            boolean z2 = this.crashlytics;
            i5 += z2 ? abstractC10113l.f20591l : abstractC10113l.f20592l;
            iMax = Math.max(iMax, !z2 ? abstractC10113l.f20591l : abstractC10113l.f20592l);
        }
        this.startapp = i5;
        this.Signature = iMax;
        this.isVip = new int[this.loadAd.size() * 2];
        if (this.crashlytics) {
            this.tapsense = this.subs;
            this.ads = i5;
            this.adcel = iMax;
            this.subscription = 0;
            return;
        }
        this.tapsense = 0;
        this.ads = iMax;
        this.adcel = i5;
        this.subscription = this.subs;
    }

    @Override // defpackage.InterfaceC9146l
    public final int admob() {
        return this.ads;
    }

    public final void amazon(int i, int i2, int i3) {
        int i4;
        this.metrica = i;
        boolean z = this.crashlytics;
        this.pro = z ? i3 : i2;
        List list = this.loadAd;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            AbstractC10113l abstractC10113l = (AbstractC10113l) list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.isVip;
            if (z) {
                InterfaceC6947l interfaceC6947l = this.amazon;
                if (interfaceC6947l == null) {
                    throw AbstractC1757l.m1043volatile("null horizontalAlignment when isVertical == true");
                }
                iArr[i6] = interfaceC6947l.yandex(abstractC10113l.f20592l, i2, this.billing);
                iArr[i6 + 1] = i;
                i4 = abstractC10113l.f20591l;
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                C0086l c0086l = this.purchase;
                if (c0086l == null) {
                    throw AbstractC1757l.m1043volatile("null verticalAlignment when isVertical == false");
                }
                iArr[i7] = c0086l.yandex(abstractC10113l.f20591l, i3);
                i4 = abstractC10113l.f20592l;
            }
            i += i4;
        }
        this.ad = -this.mopub;
        this.advert = this.pro + this.admob;
    }

    @Override // defpackage.InterfaceC9146l
    public final int billing() {
        return this.subscription;
    }

    public final void crashlytics(AbstractC9601l abstractC9601l, boolean z) {
        C11925l c11925l;
        if (this.pro == Integer.MIN_VALUE) {
            AbstractC14825l.yandex("position() should be called first");
        }
        List list = this.loadAd;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractC10113l abstractC10113l = (AbstractC10113l) list.get(i);
            int i2 = this.ad;
            boolean z2 = this.crashlytics;
            int i3 = i2 - (z2 ? abstractC10113l.f20591l : abstractC10113l.f20592l);
            int i4 = this.advert;
            long jSmaato = smaato(i);
            C7136l c7136lYandex = this.remoteconfig.yandex(i, this.firebase);
            if (c7136lYandex != null) {
                if (z) {
                    c7136lYandex.vip = jSmaato;
                } else {
                    if (!C5177l.loadAd(c7136lYandex.vip, 9223372034707292159L)) {
                        jSmaato = c7136lYandex.vip;
                    }
                    long jAmazon = C5177l.amazon(jSmaato, ((C5177l) c7136lYandex.ads.getValue()).yandex);
                    if ((yandex(jSmaato) <= i3 && yandex(jAmazon) <= i3) || (yandex(jSmaato) >= i4 && yandex(jAmazon) >= i4)) {
                        c7136lYandex.loadAd();
                    }
                    jSmaato = jAmazon;
                }
                c11925l = c7136lYandex.metrica;
            } else {
                c11925l = null;
            }
            long jAmazon2 = C5177l.amazon(jSmaato, this.isPro);
            if (!z && c7136lYandex != null) {
                c7136lYandex.remoteconfig = jAmazon2;
            }
            if (z2) {
                if (c11925l != null) {
                    abstractC9601l.getClass();
                    AbstractC9601l.yandex(abstractC9601l, abstractC10113l);
                    abstractC10113l.mo1459class(C5177l.amazon(jAmazon2, abstractC10113l.f20593l), 0.0f, c11925l);
                } else {
                    AbstractC9601l.adcel(abstractC9601l, abstractC10113l, jAmazon2);
                }
            } else if (c11925l != null) {
                AbstractC9601l.metrica(abstractC9601l, abstractC10113l, jAmazon2, c11925l);
            } else {
                AbstractC9601l.vip(abstractC9601l, abstractC10113l, jAmazon2);
            }
        }
    }

    @Override // defpackage.InterfaceC9146l
    public final int firebase() {
        return this.tapsense;
    }

    @Override // defpackage.InterfaceC9146l
    public final int getIndex() {
        return this.yandex;
    }

    @Override // defpackage.InterfaceC9146l
    public final Object getKey() {
        return this.firebase;
    }

    @Override // defpackage.InterfaceC9146l
    public final List isPro() {
        return this.loadAd;
    }

    public final int loadAd() {
        int i;
        int i2;
        if (this.crashlytics) {
            i = this.ads;
            i2 = this.tapsense;
        } else {
            i = this.adcel;
            i2 = this.subscription;
        }
        int i3 = i + i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    @Override // defpackage.InterfaceC9146l
    public final void metrica() {
        this.license = true;
    }

    @Override // defpackage.InterfaceC9146l
    public final int mopub() {
        return 1;
    }

    @Override // defpackage.InterfaceC9146l
    public final void purchase(int i, int i2, int i3, int i4) {
        amazon(i, i3, i4);
    }

    @Override // defpackage.InterfaceC9146l
    public final int remoteconfig() {
        return 0;
    }

    @Override // defpackage.InterfaceC9146l
    public final long smaato(int i) {
        if (i == 0 && this.loadAd.size() == 0) {
            int i2 = this.metrica;
            return this.crashlytics ? ((long) i2) & 4294967295L : ((long) i2) << 32;
        }
        int i3 = i * 2;
        int[] iArr = this.isVip;
        return (((long) iArr[i3 + 1]) & 4294967295L) | (((long) iArr[i3]) << 32);
    }

    @Override // defpackage.InterfaceC9146l
    public final long subs() {
        return this.vip;
    }

    @Override // defpackage.InterfaceC9146l
    public final int vip() {
        return this.adcel;
    }

    public final int yandex(long j) {
        return this.crashlytics ? (int) (j & 4294967295L) : (int) (j >> 32);
    }
}
