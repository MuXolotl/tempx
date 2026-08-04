package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: renamed from: lٍٜٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9696l implements InterfaceC9146l {
    public int Signature;
    public long ad;
    public final int adcel;
    public final List admob;
    public final int ads;
    public int advert;
    public final int amazon;
    public final int billing;
    public final boolean crashlytics;
    public final C12660l firebase;
    public final Object isPro;
    public int isVip;
    public int license;
    public final Object loadAd;
    public final int metrica;
    public final int mopub;
    public final long pro;
    public final EnumC9931l purchase;
    public final int remoteconfig;
    public boolean signatures;
    public final long smaato;
    public final int startapp;
    public final long subs;
    public final int subscription;
    public int tapsense = RecyclerView.UNDEFINED_DURATION;
    public final int vip;
    public final int yandex;

    public C9696l(int i, Object obj, boolean z, int i2, int i3, EnumC9931l enumC9931l, int i4, int i5, List list, long j, Object obj2, C12660l c12660l, long j2, int i6, int i7) {
        this.yandex = i;
        this.loadAd = obj;
        this.crashlytics = z;
        this.amazon = i2;
        this.purchase = enumC9931l;
        this.billing = i4;
        this.mopub = i5;
        this.admob = list;
        this.subs = j;
        this.isPro = obj2;
        this.firebase = c12660l;
        this.smaato = j2;
        this.remoteconfig = i6;
        this.vip = i7;
        int size = list.size();
        int iMax = 0;
        for (int i8 = 0; i8 < size; i8++) {
            AbstractC10113l abstractC10113l = (AbstractC10113l) list.get(i8);
            iMax = Math.max(iMax, this.crashlytics ? abstractC10113l.f20591l : abstractC10113l.f20592l);
        }
        this.metrica = iMax;
        boolean z2 = this.crashlytics;
        if (z2) {
            this.subscription = i3;
            this.adcel = iMax;
            this.startapp = this.amazon;
            this.ads = 0;
        } else {
            this.subscription = 0;
            this.adcel = this.amazon;
            this.startapp = iMax;
            this.ads = i3;
        }
        int i9 = this.amazon;
        this.pro = z2 ? (((long) i9) << 32) | (((long) iMax) & 4294967295L) : (((long) i9) & 4294967295L) | (((long) iMax) << 32);
        this.ad = 0L;
        this.advert = -1;
        this.isVip = -1;
    }

    @Override // defpackage.InterfaceC9146l
    public final int admob() {
        return this.adcel;
    }

    public final void amazon(int i, int i2, int i3, int i4, int i5, int i6) {
        long j;
        long j2;
        boolean z = this.crashlytics;
        int i7 = z ? i4 : i3;
        this.tapsense = i7;
        if (!z) {
            i3 = i4;
        }
        if (z && this.purchase == EnumC9931l.f20222l) {
            i2 = (i3 - i2) - this.amazon;
        }
        if (z) {
            j = ((long) i2) << 32;
            j2 = i;
        } else {
            j = ((long) i) << 32;
            j2 = i2;
        }
        this.ad = (j2 & 4294967295L) | j;
        this.advert = i5;
        this.isVip = i6;
        this.Signature = -this.billing;
        this.license = i7 + this.mopub;
    }

    @Override // defpackage.InterfaceC9146l
    public final int billing() {
        return this.ads;
    }

    public final void crashlytics(AbstractC9601l abstractC9601l, boolean z) {
        C11925l c11925l;
        if (this.tapsense == Integer.MIN_VALUE) {
            AbstractC14825l.yandex("position() should be called first");
        }
        List list = this.admob;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractC10113l abstractC10113l = (AbstractC10113l) list.get(i);
            int i2 = this.Signature;
            boolean z2 = this.crashlytics;
            int i3 = i2 - (z2 ? abstractC10113l.f20591l : abstractC10113l.f20592l);
            int i4 = this.license;
            long j = this.ad;
            C7136l c7136lYandex = this.firebase.yandex(i, this.loadAd);
            if (c7136lYandex != null) {
                if (z) {
                    c7136lYandex.vip = j;
                } else {
                    long jAmazon = C5177l.amazon(!C5177l.loadAd(c7136lYandex.vip, 9223372034707292159L) ? c7136lYandex.vip : j, ((C5177l) c7136lYandex.ads.getValue()).yandex);
                    if ((yandex(j) <= i3 && yandex(jAmazon) <= i3) || (yandex(j) >= i4 && yandex(jAmazon) >= i4)) {
                        c7136lYandex.loadAd();
                    }
                    j = jAmazon;
                }
                c11925l = c7136lYandex.metrica;
            } else {
                c11925l = null;
            }
            long jAmazon2 = C5177l.amazon(j, this.subs);
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
        return this.subscription;
    }

    @Override // defpackage.InterfaceC9146l
    public final int getIndex() {
        return this.yandex;
    }

    @Override // defpackage.InterfaceC9146l
    public final Object getKey() {
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC9146l
    public final List isPro() {
        return this.admob;
    }

    public final int loadAd() {
        int i;
        int i2;
        if (this.crashlytics) {
            i = this.adcel;
            i2 = this.subscription;
        } else {
            i = this.startapp;
            i2 = this.ads;
        }
        return i + i2;
    }

    @Override // defpackage.InterfaceC9146l
    public final void metrica() {
        this.signatures = true;
    }

    @Override // defpackage.InterfaceC9146l
    public final int mopub() {
        return this.vip;
    }

    @Override // defpackage.InterfaceC9146l
    public final void purchase(int i, int i2, int i3, int i4) {
        amazon(i, i2, i3, i4, -1, -1);
    }

    @Override // defpackage.InterfaceC9146l
    public final int remoteconfig() {
        return this.remoteconfig;
    }

    @Override // defpackage.InterfaceC9146l
    public final long smaato(int i) {
        return this.ad;
    }

    @Override // defpackage.InterfaceC9146l
    public final long subs() {
        return this.smaato;
    }

    @Override // defpackage.InterfaceC9146l
    public final int vip() {
        return this.startapp;
    }

    public final int yandex(long j) {
        return this.crashlytics ? (int) (j & 4294967295L) : (int) (j >> 32);
    }
}
