package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: renamed from: lٕٖ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15724l implements InterfaceC9146l {
    public boolean Signature;
    public final int adcel;
    public final int admob;
    public int ads;
    public final boolean amazon;
    public final int billing;
    public final List crashlytics;
    public final long firebase;
    public final C12660l isPro;
    public final long license;
    public final Object loadAd;
    public final int metrica;
    public final int mopub;
    public long pro;
    public final int purchase;
    public final int remoteconfig;
    public boolean smaato = true;
    public final int startapp;
    public final Object subs;
    public int subscription;
    public int tapsense;
    public final int vip;
    public final int yandex;

    public C15724l(int i, Object obj, List list, boolean z, int i2, int i3, int i4, int i5, int i6, Object obj2, C12660l c12660l, long j) {
        int i7;
        int i8;
        this.yandex = i;
        this.loadAd = obj;
        this.crashlytics = list;
        this.amazon = z;
        this.purchase = i3;
        this.billing = i4;
        this.mopub = i5;
        this.admob = i6;
        this.subs = obj2;
        this.isPro = c12660l;
        this.firebase = j;
        int i9 = 1;
        if (!list.isEmpty()) {
            AbstractC10113l abstractC10113l = (AbstractC10113l) list.get(0);
            i7 = z ? abstractC10113l.f20591l : abstractC10113l.f20592l;
            int iSmaato = AbstractC14055l.smaato(list);
            if (1 <= iSmaato) {
                int i10 = 1;
                while (true) {
                    AbstractC10113l abstractC10113l2 = (AbstractC10113l) list.get(i10);
                    int i11 = this.amazon ? abstractC10113l2.f20591l : abstractC10113l2.f20592l;
                    i7 = i11 > i7 ? i11 : i7;
                    if (i10 == iSmaato) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        } else {
            i7 = 0;
        }
        this.remoteconfig = i7;
        List list2 = this.crashlytics;
        if (!list2.isEmpty()) {
            AbstractC10113l abstractC10113l3 = (AbstractC10113l) list2.get(0);
            i8 = this.amazon ? abstractC10113l3.f20592l : abstractC10113l3.f20591l;
            int iSmaato2 = AbstractC14055l.smaato(list2);
            if (1 <= iSmaato2) {
                while (true) {
                    AbstractC10113l abstractC10113l4 = (AbstractC10113l) list2.get(i9);
                    int i12 = this.amazon ? abstractC10113l4.f20592l : abstractC10113l4.f20591l;
                    i8 = i12 > i8 ? i12 : i8;
                    if (i9 == iSmaato2) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
        } else {
            i8 = 0;
        }
        this.ads = RecyclerView.UNDEFINED_DURATION;
        boolean z2 = this.amazon;
        if (z2) {
            this.adcel = i2;
            this.metrica = this.remoteconfig;
            this.vip = i8;
            this.startapp = 0;
        } else {
            this.adcel = 0;
            this.metrica = i8;
            this.vip = this.remoteconfig;
            this.startapp = i2;
        }
        int i13 = this.remoteconfig;
        this.license = z2 ? (((long) i13) & 4294967295L) | (((long) i8) << 32) : (((long) i13) << 32) | (4294967295L & ((long) i8));
        this.pro = 0L;
    }

    @Override // defpackage.InterfaceC9146l
    public final int admob() {
        return this.metrica;
    }

    public final void amazon(int i, int i2, int i3) {
        long j;
        this.ads = i3;
        this.subscription = -this.mopub;
        this.tapsense = i3 + this.admob;
        if (this.amazon) {
            j = (((long) i2) << 32) | (4294967295L & ((long) i));
        } else {
            j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        }
        this.pro = j;
    }

    @Override // defpackage.InterfaceC9146l
    public final int billing() {
        return this.startapp;
    }

    public final int crashlytics() {
        int i;
        int i2;
        if (this.amazon) {
            i = this.metrica;
            i2 = this.adcel;
        } else {
            i = this.vip;
            i2 = this.startapp;
        }
        int i3 = i + i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    @Override // defpackage.InterfaceC9146l
    public final int firebase() {
        return this.adcel;
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
        return this.crashlytics;
    }

    public final int loadAd() {
        long j = this.pro;
        return (int) (!this.amazon ? j >> 32 : j & 4294967295L);
    }

    @Override // defpackage.InterfaceC9146l
    public final void metrica() {
        this.Signature = true;
    }

    @Override // defpackage.InterfaceC9146l
    public final int mopub() {
        return this.billing;
    }

    @Override // defpackage.InterfaceC9146l
    public final void purchase(int i, int i2, int i3, int i4) {
        if (this.amazon) {
            i3 = i4;
        }
        amazon(i, i2, i3);
    }

    @Override // defpackage.InterfaceC9146l
    public final int remoteconfig() {
        return this.purchase;
    }

    @Override // defpackage.InterfaceC9146l
    public final long smaato(int i) {
        return this.pro;
    }

    @Override // defpackage.InterfaceC9146l
    public final long subs() {
        return this.firebase;
    }

    @Override // defpackage.InterfaceC9146l
    public final int vip() {
        return this.vip;
    }

    public final int yandex(long j) {
        return this.amazon ? (int) (j & 4294967295L) : (int) (j >> 32);
    }
}
