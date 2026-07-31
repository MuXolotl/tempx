package defpackage;

import j$.util.Objects;
import java.util.List;

/* JADX INFO: renamed from: lؙّٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12431l implements InterfaceC0838l {
    public final String admob;
    public final C14179l amazon;
    public final String billing;
    public final List crashlytics;
    public final int loadAd;
    public final String mopub;
    public final float purchase;
    public final String subs;
    public final int yandex;

    public C12431l(int i, int i2, List list, C14179l c14179l, float f, String str, String str2, String str3, String str4) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = list;
        this.amazon = c14179l;
        this.purchase = f;
        this.billing = str;
        this.mopub = str2;
        this.admob = str3;
        this.subs = str4;
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
        if (!(obj instanceof C12431l)) {
            return false;
        }
        C12431l c12431l = (C12431l) obj;
        return this.yandex == c12431l.yandex && this.loadAd == c12431l.loadAd && Objects.equals(this.crashlytics, c12431l.crashlytics) && Objects.equals(this.amazon, c12431l.amazon) && Float.valueOf(this.purchase).equals(Float.valueOf(c12431l.purchase)) && Objects.equals(this.billing, c12431l.billing) && Objects.equals(this.mopub, c12431l.mopub) && Objects.equals(this.admob, c12431l.admob) && Objects.equals(this.subs, c12431l.subs);
    }

    @Override // defpackage.InterfaceC0838l
    public final String firebase() {
        return this.mopub;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.yandex), Integer.valueOf(this.loadAd), this.crashlytics, this.amazon, Float.valueOf(this.purchase), this.billing, this.mopub, this.admob, this.subs);
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
        return this.mopub != null;
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
