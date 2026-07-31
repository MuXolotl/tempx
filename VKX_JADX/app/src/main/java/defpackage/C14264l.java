package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٓٛۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14264l implements InterfaceC18302l {
    public final long admob;
    public final C11617l amazon;
    public final AbstractC17569l billing;
    public final C6886l crashlytics;
    public final C10537l firebase;
    public final C16810l isPro;
    public final long loadAd;
    public final C1354l metrica;
    public final String mopub;
    public final C8689l purchase;
    public final C9867l remoteconfig;
    public final long smaato;
    public final AbstractC3239l startapp;
    public final C10524l subs;
    public final C0387l vip;
    public final InterfaceC12750l yandex;

    public C14264l(long j, long j2, C6886l c6886l, C11617l c11617l, C8689l c8689l, AbstractC17569l abstractC17569l, String str, long j3, C10524l c10524l, C16810l c16810l, C10537l c10537l, long j4, C9867l c9867l, C0387l c0387l, int i) {
        this((i & 1) != 0 ? C9735l.firebase : j, (i & 2) != 0 ? C1794l.crashlytics : j2, (i & 4) != 0 ? null : c6886l, (i & 8) != 0 ? null : c11617l, (i & 16) != 0 ? null : c8689l, (i & 32) != 0 ? null : abstractC17569l, (i & 64) != 0 ? null : str, (i & 128) != 0 ? C1794l.crashlytics : j3, (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : c10524l, (i & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? null : c16810l, (i & 1024) != 0 ? null : c10537l, (i & 2048) != 0 ? C9735l.firebase : j4, (i & 4096) != 0 ? null : c9867l, (i & 8192) != 0 ? null : c0387l, (C1354l) null, (AbstractC3239l) null);
    }

    public final C14264l crashlytics(C14264l c14264l) {
        if (c14264l == null) {
            return this;
        }
        InterfaceC12750l interfaceC12750l = c14264l.yandex;
        return AbstractC2828l.yandex(this, interfaceC12750l.loadAd(), interfaceC12750l.purchase(), interfaceC12750l.yandex(), c14264l.loadAd, c14264l.crashlytics, c14264l.amazon, c14264l.purchase, c14264l.billing, c14264l.mopub, c14264l.admob, c14264l.subs, c14264l.isPro, c14264l.firebase, c14264l.smaato, c14264l.remoteconfig, c14264l.vip, c14264l.metrica, c14264l.startapp);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14264l)) {
            return false;
        }
        C14264l c14264l = (C14264l) obj;
        return yandex(c14264l) && loadAd(c14264l);
    }

    public final int hashCode() {
        InterfaceC12750l interfaceC12750l = this.yandex;
        long jLoadAd = interfaceC12750l.loadAd();
        int i = C9735l.smaato;
        int iYandex = C10882l.yandex(jLoadAd) * 31;
        AbstractC9544l abstractC9544lPurchase = interfaceC12750l.purchase();
        int iAmazon = (C1794l.amazon(this.loadAd) + ((Float.floatToIntBits(interfaceC12750l.yandex()) + ((iYandex + (abstractC9544lPurchase != null ? abstractC9544lPurchase.hashCode() : 0)) * 31)) * 31)) * 31;
        C6886l c6886l = this.crashlytics;
        int i2 = (iAmazon + (c6886l != null ? c6886l.f14426l : 0)) * 31;
        C11617l c11617l = this.amazon;
        int i3 = (i2 + (c11617l != null ? c11617l.yandex : 0)) * 31;
        C8689l c8689l = this.purchase;
        int i4 = (i3 + (c8689l != null ? c8689l.yandex : 0)) * 31;
        AbstractC17569l abstractC17569l = this.billing;
        int iHashCode = (i4 + (abstractC17569l != null ? abstractC17569l.hashCode() : 0)) * 31;
        String str = this.mopub;
        int iAmazon2 = (C1794l.amazon(this.admob) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        C10524l c10524l = this.subs;
        int iFloatToIntBits = (iAmazon2 + (c10524l != null ? Float.floatToIntBits(c10524l.yandex) : 0)) * 31;
        C16810l c16810l = this.isPro;
        int iHashCode2 = (iFloatToIntBits + (c16810l != null ? c16810l.hashCode() : 0)) * 31;
        C10537l c10537l = this.firebase;
        int iM1038strictfp = AbstractC1757l.m1038strictfp((iHashCode2 + (c10537l != null ? c10537l.f21449l.hashCode() : 0)) * 31, this.smaato, 31);
        C9867l c9867l = this.remoteconfig;
        int i5 = (iM1038strictfp + (c9867l != null ? c9867l.yandex : 0)) * 31;
        C0387l c0387l = this.vip;
        int iHashCode3 = (i5 + (c0387l != null ? c0387l.hashCode() : 0)) * 31;
        C1354l c1354l = this.metrica;
        int iHashCode4 = (iHashCode3 + (c1354l != null ? c1354l.hashCode() : 0)) * 31;
        AbstractC3239l abstractC3239l = this.startapp;
        return iHashCode4 + (abstractC3239l != null ? abstractC3239l.hashCode() : 0);
    }

    public final boolean loadAd(C14264l c14264l) {
        return AbstractC8576l.yandex(this.yandex, c14264l.yandex) && AbstractC8576l.yandex(this.remoteconfig, c14264l.remoteconfig) && AbstractC8576l.yandex(this.vip, c14264l.vip) && AbstractC8576l.yandex(this.startapp, c14264l.startapp);
    }

    public final String toString() {
        InterfaceC12750l interfaceC12750l = this.yandex;
        String strSubs = C9735l.subs(interfaceC12750l.loadAd());
        AbstractC9544l abstractC9544lPurchase = interfaceC12750l.purchase();
        float fYandex = interfaceC12750l.yandex();
        String strPurchase = C1794l.purchase(this.loadAd);
        String strPurchase2 = C1794l.purchase(this.admob);
        String strSubs2 = C9735l.subs(this.smaato);
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        sb.append(strSubs);
        sb.append(", brush=");
        sb.append(abstractC9544lPurchase);
        sb.append(", alpha=");
        sb.append(fYandex);
        sb.append(", fontSize=");
        sb.append(strPurchase);
        sb.append(", fontWeight=");
        sb.append(this.crashlytics);
        sb.append(", fontStyle=");
        sb.append(this.amazon);
        sb.append(", fontSynthesis=");
        sb.append(this.purchase);
        sb.append(", fontFamily=");
        sb.append(this.billing);
        sb.append(", fontFeatureSettings=");
        AbstractC9361l.appmetrica(sb, this.mopub, ", letterSpacing=", strPurchase2, ", baselineShift=");
        sb.append(this.subs);
        sb.append(", textGeometricTransform=");
        sb.append(this.isPro);
        sb.append(", localeList=");
        sb.append(this.firebase);
        sb.append(", background=");
        sb.append(strSubs2);
        sb.append(", textDecoration=");
        sb.append(this.remoteconfig);
        sb.append(", shadow=");
        sb.append(this.vip);
        sb.append(", platformStyle=");
        sb.append(this.metrica);
        sb.append(", drawStyle=");
        sb.append(this.startapp);
        sb.append(")");
        return sb.toString();
    }

    public final boolean yandex(C14264l c14264l) {
        if (this == c14264l) {
            return true;
        }
        return C1794l.yandex(this.loadAd, c14264l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c14264l.crashlytics) && AbstractC8576l.yandex(this.amazon, c14264l.amazon) && AbstractC8576l.yandex(this.purchase, c14264l.purchase) && AbstractC8576l.yandex(this.billing, c14264l.billing) && AbstractC8576l.yandex(this.mopub, c14264l.mopub) && C1794l.yandex(this.admob, c14264l.admob) && AbstractC8576l.yandex(this.subs, c14264l.subs) && AbstractC8576l.yandex(this.isPro, c14264l.isPro) && AbstractC8576l.yandex(this.firebase, c14264l.firebase) && C9735l.crashlytics(this.smaato, c14264l.smaato) && AbstractC8576l.yandex(this.metrica, c14264l.metrica);
    }

    public C14264l(InterfaceC12750l interfaceC12750l, long j, C6886l c6886l, C11617l c11617l, C8689l c8689l, AbstractC17569l abstractC17569l, String str, long j2, C10524l c10524l, C16810l c16810l, C10537l c10537l, long j3, C9867l c9867l, C0387l c0387l, C1354l c1354l, AbstractC3239l abstractC3239l) {
        this.yandex = interfaceC12750l;
        this.loadAd = j;
        this.crashlytics = c6886l;
        this.amazon = c11617l;
        this.purchase = c8689l;
        this.billing = abstractC17569l;
        this.mopub = str;
        this.admob = j2;
        this.subs = c10524l;
        this.isPro = c16810l;
        this.firebase = c10537l;
        this.smaato = j3;
        this.remoteconfig = c9867l;
        this.vip = c0387l;
        this.metrica = c1354l;
        this.startapp = abstractC3239l;
    }

    public C14264l(long j, long j2, C6886l c6886l, C11617l c11617l, C8689l c8689l, AbstractC17569l abstractC17569l, String str, long j3, C10524l c10524l, C16810l c16810l, C10537l c10537l, long j4, C9867l c9867l, C0387l c0387l, C1354l c1354l, AbstractC3239l abstractC3239l) {
        this(j != 16 ? new C8245l(j) : C15368l.yandex, j2, c6886l, c11617l, c8689l, abstractC17569l, str, j3, c10524l, c16810l, c10537l, j4, c9867l, c0387l, c1354l, abstractC3239l);
    }
}
