package defpackage;

import android.content.Context;

/* JADX INFO: renamed from: lٔۗ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15106l {
    public final int admob;
    public final int amazon;
    public final AbstractC5921l billing;
    public final int crashlytics;
    public final C3548l isPro;
    public final C9192l loadAd;
    public final int mopub;
    public final String purchase;
    public final int subs;
    public final Context yandex;

    public C15106l(Context context, C9192l c9192l, int i, int i2, String str, AbstractC5921l abstractC5921l, int i3, int i4, int i5, C3548l c3548l) {
        this.yandex = context;
        this.loadAd = c9192l;
        this.crashlytics = i;
        this.amazon = i2;
        this.purchase = str;
        this.billing = abstractC5921l;
        this.mopub = i3;
        this.admob = i4;
        this.subs = i5;
        this.isPro = c3548l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15106l)) {
            return false;
        }
        C15106l c15106l = (C15106l) obj;
        return AbstractC8576l.yandex(this.yandex, c15106l.yandex) && AbstractC8576l.yandex(this.loadAd, c15106l.loadAd) && this.crashlytics == c15106l.crashlytics && this.amazon == c15106l.amazon && AbstractC8576l.yandex(this.purchase, c15106l.purchase) && AbstractC8576l.yandex(this.billing, c15106l.billing) && this.mopub == c15106l.mopub && this.admob == c15106l.admob && this.subs == c15106l.subs && AbstractC8576l.yandex(this.isPro, c15106l.isPro);
    }

    public final int hashCode() {
        int iFirebase = AbstractC0653l.firebase(this.amazon, AbstractC0653l.firebase(this.crashlytics, (this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31, 31), 31);
        String str = this.purchase;
        return this.isPro.yandex.hashCode() + AbstractC0653l.firebase(this.subs, AbstractC0653l.firebase(this.admob, AbstractC0653l.firebase(this.mopub, (this.billing.hashCode() + ((iFirebase + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "Options(context=" + this.yandex + ", size=" + this.loadAd + ", scale=" + AbstractC0653l.ad(this.crashlytics) + ", precision=" + AbstractC15560l.isVip(this.amazon) + ", diskCacheKey=" + this.purchase + ", fileSystem=" + this.billing + ", memoryCachePolicy=" + AbstractC14814l.signatures(this.mopub) + ", diskCachePolicy=" + AbstractC14814l.signatures(this.admob) + ", networkCachePolicy=" + AbstractC14814l.signatures(this.subs) + ", extras=" + this.isPro + ")";
    }
}
