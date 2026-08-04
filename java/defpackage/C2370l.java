package defpackage;

import android.graphics.Canvas;

/* JADX INFO: renamed from: lؔؔۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2370l extends AbstractC14165l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final InterfaceC1286l f5129l;

    public C2370l(InterfaceC1286l interfaceC1286l) {
        this.f5129l = interfaceC1286l;
    }

    @Override // defpackage.AbstractC14165l
    public final void isPro(InterfaceC13349l interfaceC13349l) {
        InterfaceC1286l interfaceC1286l = this.f5129l;
        int iPurchase = interfaceC1286l.purchase();
        float fIntBitsToFloat = iPurchase > 0 ? Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32)) / iPurchase : 1.0f;
        int iLoadAd = interfaceC1286l.loadAd();
        float fIntBitsToFloat2 = iLoadAd > 0 ? Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L)) / iLoadAd : 1.0f;
        C18449l c18449lMo2065break = interfaceC13349l.mo2065break();
        long jM4551private = c18449lMo2065break.m4551private();
        c18449lMo2065break.m4555synchronized().mopub();
        try {
            ((C16543l) c18449lMo2065break.f36010l).isVip(fIntBitsToFloat, fIntBitsToFloat2, 0L);
            InterfaceC14859l interfaceC14859lM4555synchronized = interfaceC13349l.mo2065break().m4555synchronized();
            Canvas canvas = AbstractC10071l.yandex;
            interfaceC1286l.subs(((C2151l) interfaceC14859lM4555synchronized).yandex);
        } finally {
            AbstractC0653l.license(c18449lMo2065break, jM4551private);
        }
    }

    @Override // defpackage.AbstractC14165l
    public final long subs() {
        InterfaceC1286l interfaceC1286l = this.f5129l;
        int iPurchase = interfaceC1286l.purchase();
        float f = iPurchase > 0 ? iPurchase : Float.NaN;
        int iLoadAd = interfaceC1286l.loadAd();
        return (((long) Float.floatToRawIntBits(iLoadAd > 0 ? iLoadAd : Float.NaN)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
    }
}
