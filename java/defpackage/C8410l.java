package defpackage;

import java.net.Proxy;

/* JADX INFO: renamed from: lًۦٍ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8410l {
    public boolean amazon;
    public final C6121l billing;
    public C8195l crashlytics;
    public Proxy loadAd;
    public final C10685l mopub;
    public final C11409l purchase;
    public final C0614l yandex;

    public C8410l() {
        C0614l c0614l = new C0614l();
        this.yandex = c0614l;
        this.purchase = new C11409l(new C18200l(0, 0, C8410l.class, this, "vkProxyEnabled", "getVkProxyEnabled$core()Z"), c0614l);
        this.billing = new C6121l(this);
        this.mopub = new C10685l(this);
    }
}
