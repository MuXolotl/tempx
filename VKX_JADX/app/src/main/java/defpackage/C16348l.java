package defpackage;

/* JADX INFO: renamed from: lّٖؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16348l implements InterfaceC9750l {
    public final boolean amazon;
    public final C2536l crashlytics;
    public final int loadAd;
    public final String yandex;

    public C16348l(String str, int i, C2536l c2536l, boolean z) {
        this.yandex = str;
        this.loadAd = i;
        this.crashlytics = c2536l;
        this.amazon = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(this.yandex);
        sb.append(", index=");
        return AbstractC0653l.adcel(sb, this.loadAd, '}');
    }

    @Override // defpackage.InterfaceC9750l
    public final InterfaceC3012l yandex(C9950l c9950l, C10712l c10712l, AbstractC10437l abstractC10437l) {
        return new C13453l(c9950l, abstractC10437l, this);
    }
}
