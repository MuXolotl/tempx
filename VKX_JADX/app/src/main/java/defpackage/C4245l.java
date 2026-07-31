package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lٜؖؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llٜؖؗ;", "Llَّؓ;", "Llًؓؖ;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class C4245l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f8713l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC6347l f8714l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final float f8715l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final long f8716l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final long f8717l;

    public C4245l(float f, InterfaceC6347l interfaceC6347l, boolean z, long j, long j2) {
        this.f8715l = f;
        this.f8714l = interfaceC6347l;
        this.f8713l = z;
        this.f8717l = j;
        this.f8716l = j2;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C1622l c1622l = (C1622l) abstractC14971l;
        C10065l c10065l = new C10065l(1, this);
        c1622l.f3956l = c10065l;
        AbstractC4047l.remoteconfig(c1622l, c10065l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4245l)) {
            return false;
        }
        C4245l c4245l = (C4245l) obj;
        return C14467l.loadAd(this.f8715l, c4245l.f8715l) && AbstractC8576l.yandex(this.f8714l, c4245l.f8714l) && this.f8713l == c4245l.f8713l && C9735l.crashlytics(this.f8717l, c4245l.f8717l) && C9735l.crashlytics(this.f8716l, c4245l.f8716l);
    }

    public final int hashCode() {
        int iIsPro = (AbstractC2812l.isPro(this.f8714l, Float.floatToIntBits(this.f8715l) * 31, 31) + (this.f8713l ? 1231 : 1237)) * 31;
        int i = C9735l.smaato;
        return C10882l.yandex(this.f8716l) + AbstractC1757l.m1038strictfp(iIsPro, this.f8717l, 31);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        return new C1622l(new C10065l(1, this));
    }

    public final String toString() {
        String strCrashlytics = C14467l.crashlytics(this.f8715l);
        String strSubs = C9735l.subs(this.f8717l);
        String strSubs2 = C9735l.subs(this.f8716l);
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append(strCrashlytics);
        sb.append(", shape=");
        sb.append(this.f8714l);
        sb.append(", clip=");
        sb.append(this.f8713l);
        sb.append(", ambientColor=");
        sb.append(strSubs);
        sb.append(", spotColor=");
        return AbstractC0653l.ads(sb, strSubs2, ")");
    }
}
