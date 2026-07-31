package defpackage;

import j$.util.Objects;
import java.util.List;

/* JADX INFO: renamed from: lًؘۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8205l implements InterfaceC0838l {
    public final C14179l amazon;
    public final String billing;
    public final List crashlytics;
    public final int loadAd;
    public final String mopub;
    public final float purchase;
    public final int yandex;

    public C8205l(int i, int i2, List list, C14179l c14179l, float f, String str, String str2) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = list;
        this.amazon = c14179l;
        this.purchase = f;
        this.billing = str;
        this.mopub = str2;
    }

    @Override // defpackage.InterfaceC0838l
    public final boolean admob() {
        return this.crashlytics != null;
    }

    @Override // defpackage.InterfaceC0838l
    public final int amazon() {
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC0838l
    public final boolean billing() {
        return this.amazon != null;
    }

    @Override // defpackage.InterfaceC0838l
    public final List crashlytics() {
        return this.crashlytics;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8205l)) {
            return false;
        }
        C8205l c8205l = (C8205l) obj;
        return this.yandex == c8205l.yandex && this.loadAd == c8205l.loadAd && Objects.equals(this.crashlytics, c8205l.crashlytics) && Objects.equals(this.amazon, c8205l.amazon) && Float.valueOf(this.purchase).equals(Float.valueOf(c8205l.purchase)) && Objects.equals(this.billing, c8205l.billing) && Objects.equals(this.mopub, c8205l.mopub);
    }

    @Override // defpackage.InterfaceC0838l
    public final String firebase() {
        return this.billing;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.yandex), Integer.valueOf(this.loadAd), this.crashlytics, this.amazon, Float.valueOf(this.purchase), this.billing, this.mopub);
    }

    @Override // defpackage.InterfaceC0838l
    public final C14179l isPro() {
        return this.amazon;
    }

    @Override // defpackage.InterfaceC0838l
    public final boolean loadAd() {
        return !Float.isNaN(this.purchase);
    }

    @Override // defpackage.InterfaceC0838l
    public final boolean mopub() {
        return this.billing != null;
    }

    @Override // defpackage.InterfaceC0838l
    public final int purchase() {
        return this.yandex;
    }

    @Override // defpackage.InterfaceC0838l
    public final float subs() {
        return this.purchase;
    }

    @Override // defpackage.InterfaceC0838l
    public final boolean yandex() {
        return this.loadAd != -1;
    }
}
