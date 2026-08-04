package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٌِٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8718l implements InterfaceC17589l {
    public C14179l amazon;
    public String billing;
    public List crashlytics;
    public int loadAd;
    public String mopub;
    public float purchase;
    public int yandex;

    @Override // defpackage.InterfaceC17589l
    public final InterfaceC17589l amazon(float f) {
        this.purchase = f;
        return this;
    }

    @Override // defpackage.InterfaceC17589l
    public final InterfaceC17589l billing(String str) {
        this.billing = str;
        return this;
    }

    @Override // defpackage.InterfaceC17589l
    public final InterfaceC17589l crashlytics(int i) {
        this.yandex = i;
        return this;
    }

    @Override // defpackage.InterfaceC17589l
    public final InterfaceC17589l loadAd(int i) {
        this.loadAd = i;
        return this;
    }

    @Override // defpackage.InterfaceC17589l
    public final InterfaceC17589l purchase(List list) {
        this.crashlytics = list;
        return this;
    }

    @Override // defpackage.InterfaceC17589l
    public final InterfaceC17589l yandex(C14179l c14179l) {
        this.amazon = c14179l;
        return this;
    }
}
