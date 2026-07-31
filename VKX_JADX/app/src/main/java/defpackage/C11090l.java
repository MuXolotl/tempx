package defpackage;

/* JADX INFO: renamed from: lُٜٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11090l {
    public static final C11090l amazon = new C11090l(0, 0, null, null, 0, 0, 0, 0, 0, 16777215);
    public final C10891l crashlytics;
    public final C9077l loadAd;
    public final C14264l yandex;

    public C11090l(long j, long j2, C6886l c6886l, C2122l c2122l, long j3, long j4, int i, int i2, long j5, int i3) {
        this(new C14264l((i3 & 1) != 0 ? C9735l.firebase : j, (i3 & 2) != 0 ? C1794l.crashlytics : j2, (i3 & 4) != 0 ? null : c6886l, (C11617l) null, (C8689l) null, (i3 & 32) != 0 ? null : c2122l, (String) null, (i3 & 128) != 0 ? C1794l.crashlytics : j3, (C10524l) null, (C16810l) null, (C10537l) null, (i3 & 2048) != 0 ? C9735l.firebase : j4, (C9867l) null, (C0387l) null, (C1354l) null, (AbstractC3239l) null), new C9077l((32768 & i3) != 0 ? 0 : i, (65536 & i3) != 0 ? 0 : i2, (i3 & 131072) != 0 ? C1794l.crashlytics : j5, null, null, null, 0, 0, null), null);
    }

    public static C11090l billing(C11090l c11090l, long j, long j2, C6886l c6886l, C11617l c11617l, AbstractC17569l abstractC17569l, long j3, int i, long j4, int i2) {
        long j5 = (i2 & 2) != 0 ? C1794l.crashlytics : j2;
        C6886l c6886l2 = (i2 & 4) != 0 ? null : c6886l;
        C11617l c11617l2 = (i2 & 8) != 0 ? null : c11617l;
        AbstractC17569l abstractC17569l2 = (i2 & 32) != 0 ? null : abstractC17569l;
        long j6 = (i2 & 128) != 0 ? C1794l.crashlytics : j3;
        long j7 = C9735l.firebase;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        long j8 = (i2 & 131072) != 0 ? C1794l.crashlytics : j4;
        C14264l c14264lYandex = AbstractC2828l.yandex(c11090l.yandex, j, null, Float.NaN, j5, c6886l2, c11617l2, null, abstractC17569l2, null, j6, null, null, null, j7, null, null, null, null);
        C9077l c9077lYandex = AbstractC6992l.yandex(c11090l.loadAd, i3, 0, j8, null, null, null, 0, 0, null);
        return (c11090l.yandex == c14264lYandex && c11090l.loadAd == c9077lYandex) ? c11090l : new C11090l(c14264lYandex, c9077lYandex);
    }

    public static C11090l yandex(C11090l c11090l, long j, long j2, C6886l c6886l, AbstractC17569l abstractC17569l, long j3, long j4, C10891l c10891l, C3183l c3183l, int i) {
        InterfaceC12750l c8245l;
        long jLoadAd = (i & 1) != 0 ? c11090l.yandex.yandex.loadAd() : j;
        long j5 = (i & 2) != 0 ? c11090l.yandex.loadAd : j2;
        C6886l c6886l2 = (i & 4) != 0 ? c11090l.yandex.crashlytics : c6886l;
        C14264l c14264l = c11090l.yandex;
        C11617l c11617l = c14264l.amazon;
        C8689l c8689l = c14264l.purchase;
        AbstractC17569l abstractC17569l2 = (i & 32) != 0 ? c14264l.billing : abstractC17569l;
        String str = c14264l.mopub;
        long j6 = (i & 128) != 0 ? c14264l.admob : j3;
        C10524l c10524l = c14264l.subs;
        C16810l c16810l = c14264l.isPro;
        C10537l c10537l = c14264l.firebase;
        long j7 = c14264l.smaato;
        C9867l c9867l = c14264l.remoteconfig;
        C0387l c0387l = c14264l.vip;
        AbstractC3239l abstractC3239l = c14264l.startapp;
        int i2 = (i & 32768) != 0 ? c11090l.loadAd.yandex : 3;
        int i3 = (i & 65536) != 0 ? c11090l.loadAd.loadAd : 1;
        long j8 = (i & 131072) != 0 ? c11090l.loadAd.crashlytics : j4;
        C9077l c9077l = c11090l.loadAd;
        C13299l c13299l = c9077l.amazon;
        C10891l c10891l2 = (i & 524288) != 0 ? c11090l.crashlytics : c10891l;
        C3183l c3183l2 = (i & 1048576) != 0 ? c9077l.billing : c3183l;
        int i4 = c9077l.mopub;
        int i5 = c9077l.admob;
        C10068l c10068l = c9077l.subs;
        if (C9735l.crashlytics(jLoadAd, c14264l.yandex.loadAd())) {
            c8245l = c14264l.yandex;
        } else {
            c8245l = jLoadAd != 16 ? new C8245l(jLoadAd) : C15368l.yandex;
        }
        return new C11090l(new C14264l(c8245l, j5, c6886l2, c11617l, c8689l, abstractC17569l2, str, j6, c10524l, c16810l, c10537l, j7, c9867l, c0387l, c10891l2 != null ? c10891l2.yandex : null, abstractC3239l), new C9077l(i2, i3, j8, c13299l, c10891l2 != null ? c10891l2.loadAd : null, c3183l2, i4, i5, c10068l), c10891l2);
    }

    public final boolean amazon(C11090l c11090l) {
        if (this != c11090l) {
            return AbstractC8576l.yandex(this.loadAd, c11090l.loadAd) && this.yandex.yandex(c11090l.yandex);
        }
        return true;
    }

    public final long crashlytics() {
        return this.yandex.yandex.loadAd();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11090l)) {
            return false;
        }
        C11090l c11090l = (C11090l) obj;
        return AbstractC8576l.yandex(this.yandex, c11090l.yandex) && AbstractC8576l.yandex(this.loadAd, c11090l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c11090l.crashlytics);
    }

    public final int hashCode() {
        int iHashCode = (this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31;
        C10891l c10891l = this.crashlytics;
        return iHashCode + (c10891l != null ? c10891l.hashCode() : 0);
    }

    public final AbstractC9544l loadAd() {
        return this.yandex.yandex.purchase();
    }

    public final C11090l purchase(C11090l c11090l) {
        return (c11090l == null || c11090l.equals(amazon)) ? this : new C11090l(this.yandex.crashlytics(c11090l.yandex), this.loadAd.yandex(c11090l.loadAd));
    }

    public final String toString() {
        String strSubs = C9735l.subs(crashlytics());
        AbstractC9544l abstractC9544lLoadAd = loadAd();
        C14264l c14264l = this.yandex;
        float fYandex = c14264l.yandex.yandex();
        String strPurchase = C1794l.purchase(c14264l.loadAd);
        C6886l c6886l = c14264l.crashlytics;
        C11617l c11617l = c14264l.amazon;
        C8689l c8689l = c14264l.purchase;
        AbstractC17569l abstractC17569l = c14264l.billing;
        String str = c14264l.mopub;
        String strPurchase2 = C1794l.purchase(c14264l.admob);
        C10524l c10524l = c14264l.subs;
        C16810l c16810l = c14264l.isPro;
        C10537l c10537l = c14264l.firebase;
        String strSubs2 = C9735l.subs(c14264l.smaato);
        C9867l c9867l = c14264l.remoteconfig;
        C0387l c0387l = c14264l.vip;
        AbstractC3239l abstractC3239l = c14264l.startapp;
        C9077l c9077l = this.loadAd;
        String strYandex = C10258l.yandex(c9077l.yandex);
        String strYandex2 = C16546l.yandex(c9077l.loadAd);
        String strPurchase3 = C1794l.purchase(c9077l.crashlytics);
        C13299l c13299l = c9077l.amazon;
        C3183l c3183l = c9077l.billing;
        String strYandex3 = C17427l.yandex(c9077l.mopub);
        String strYandex4 = C0106l.yandex(c9077l.admob);
        C10068l c10068l = c9077l.subs;
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append(strSubs);
        sb.append(", brush=");
        sb.append(abstractC9544lLoadAd);
        sb.append(", alpha=");
        sb.append(fYandex);
        sb.append(", fontSize=");
        sb.append(strPurchase);
        sb.append(", fontWeight=");
        sb.append(c6886l);
        sb.append(", fontStyle=");
        sb.append(c11617l);
        sb.append(", fontSynthesis=");
        sb.append(c8689l);
        sb.append(", fontFamily=");
        sb.append(abstractC17569l);
        sb.append(", fontFeatureSettings=");
        AbstractC9361l.appmetrica(sb, str, ", letterSpacing=", strPurchase2, ", baselineShift=");
        sb.append(c10524l);
        sb.append(", textGeometricTransform=");
        sb.append(c16810l);
        sb.append(", localeList=");
        sb.append(c10537l);
        sb.append(", background=");
        sb.append(strSubs2);
        sb.append(", textDecoration=");
        sb.append(c9867l);
        sb.append(", shadow=");
        sb.append(c0387l);
        sb.append(", drawStyle=");
        sb.append(abstractC3239l);
        sb.append(", textAlign=");
        sb.append(strYandex);
        sb.append(", textDirection=");
        AbstractC9361l.appmetrica(sb, strYandex2, ", lineHeight=", strPurchase3, ", textIndent=");
        sb.append(c13299l);
        sb.append(", platformStyle=");
        sb.append(this.crashlytics);
        sb.append(", lineHeightStyle=");
        sb.append(c3183l);
        sb.append(", lineBreak=");
        sb.append(strYandex3);
        sb.append(", hyphens=");
        sb.append(strYandex4);
        sb.append(", textMotion=");
        sb.append(c10068l);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C11090l(C14264l c14264l, C9077l c9077l) {
        C1354l c1354l = c14264l.metrica;
        C4361l c4361l = c9077l.purchase;
        this(c14264l, c9077l, (c1354l == null && c4361l == null) ? null : new C10891l(c1354l, c4361l));
    }

    public C11090l(C14264l c14264l, C9077l c9077l, C10891l c10891l) {
        this.yandex = c14264l;
        this.loadAd = c9077l;
        this.crashlytics = c10891l;
    }
}
