package defpackage;

/* JADX INFO: renamed from: lًؚۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8372l implements InterfaceC2186l {
    public final boolean admob;
    public final InterfaceC6347l amazon;
    public final boolean billing;
    public final long crashlytics;
    public final float loadAd;
    public final boolean mopub;
    public final boolean purchase;
    public final boolean yandex;

    public C8372l(boolean z, float f, long j, InterfaceC6347l interfaceC6347l, boolean z2) {
        if (interfaceC6347l == null) {
            C14467l c14467l = C14467l.loadAd(f, Float.NaN) ? null : new C14467l(f);
            interfaceC6347l = c14467l != null ? AbstractC7497l.yandex(c14467l.f28331l) : null;
            if (interfaceC6347l == null) {
                interfaceC6347l = AbstractC16837l.yandex;
            }
        }
        this.yandex = z;
        this.loadAd = f;
        this.crashlytics = j;
        this.amazon = interfaceC6347l;
        this.purchase = true;
        this.billing = z2;
        this.mopub = true;
        this.admob = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8372l)) {
            return false;
        }
        C8372l c8372l = (C8372l) obj;
        return this.yandex == c8372l.yandex && C14467l.loadAd(this.loadAd, c8372l.loadAd) && C9735l.crashlytics(this.crashlytics, c8372l.crashlytics) && AbstractC8576l.yandex(this.amazon, c8372l.amazon) && this.purchase == c8372l.purchase && this.billing == c8372l.billing && this.mopub == c8372l.mopub && this.admob == c8372l.admob;
    }

    @Override // defpackage.InterfaceC2186l
    public final int hashCode() {
        int iMopub = AbstractC9029l.mopub((this.yandex ? 1231 : 1237) * 31, this.loadAd, 961);
        int i = C9735l.smaato;
        return ((((((AbstractC2812l.isPro(this.amazon, AbstractC1757l.m1038strictfp(iMopub, this.crashlytics, 31), 31) + (this.purchase ? 1231 : 1237)) * 31) + (this.billing ? 1231 : 1237)) * 31) + (this.mopub ? 1231 : 1237)) * 31) + (this.admob ? 1231 : 1237);
    }

    @Override // defpackage.InterfaceC2186l
    public final InterfaceC8605l loadAd(C2403l c2403l) {
        return new C11674l(c2403l, this.yandex, this.loadAd, new C9007l(1, this), this.amazon, this.purchase, this.billing, this.mopub, this.admob);
    }

    @Override // defpackage.InterfaceC2186l
    public final void yandex(C2403l c2403l, C6956l c6956l) {
        c6956l.m2123default(1257603829);
        c6956l.startapp(false);
    }
}
