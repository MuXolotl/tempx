package defpackage;

import android.graphics.Paint;

/* JADX INFO: renamed from: lٕٞۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15841l extends AbstractC14971l implements InterfaceC16388l {

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public C18338l f31091l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public float f31092l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public Paint f31093l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public long f31094l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public InterfaceC6347l f31095l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public C4480l f31096l;

    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    public final void m4122l() {
        int iStartapp = AbstractC12953l.startapp(C9735l.loadAd(0.0f, this.f31094l));
        int iStartapp2 = AbstractC12953l.startapp(this.f31094l);
        this.f31093l.setColor(iStartapp);
        this.f31093l.setShadowLayer(this.f31092l, 0.0f, 0.0f, iStartapp2);
    }

    @Override // defpackage.InterfaceC16388l
    /* JADX INFO: renamed from: lؚۦ۠ */
    public final void mo536l(C6742l c6742l) {
        C6742l c6742l2;
        C13601l c13601l = c6742l.f14144l;
        InterfaceC14859l interfaceC14859lM4555synchronized = c13601l.f26629l.m4555synchronized();
        if (this.f31096l == null) {
            C4480l c4480lYandex = AbstractC4311l.yandex();
            this.f31096l = c4480lYandex;
            this.f31093l = c4480lYandex.yandex;
            m4122l();
        }
        if (this.f31091l == null) {
            this.f31091l = new C18338l(this.f31095l, c13601l.f26629l.m4551private(), c6742l.getLayoutDirection(), c6742l);
            c6742l2 = c6742l;
        } else {
            c6742l2 = c6742l;
        }
        AbstractC15342l abstractC15342lAppmetrica = this.f31091l.appmetrica(this.f31095l, c13601l.f26629l.m4551private(), c6742l2.getLayoutDirection(), c6742l2);
        if (abstractC15342lAppmetrica instanceof C13080l) {
            interfaceC14859lM4555synchronized.subs(((C13080l) abstractC15342lAppmetrica).amazon, this.f31096l);
        } else if (abstractC15342lAppmetrica instanceof C18521l) {
            long j = ((C18521l) abstractC15342lAppmetrica).amazon.purchase;
            interfaceC14859lM4555synchronized.billing(0.0f, 0.0f, Float.intBitsToFloat((int) (c13601l.f26629l.m4551private() >> 32)), Float.intBitsToFloat((int) (c13601l.f26629l.m4551private() & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), this.f31096l);
        } else {
            if (!(abstractC15342lAppmetrica instanceof C13616l)) {
                C18725l.billing();
                return;
            }
            interfaceC14859lM4555synchronized.purchase(((C13616l) abstractC15342lAppmetrica).amazon, this.f31096l);
        }
        c6742l2.yandex();
    }

    @Override // defpackage.InterfaceC16388l
    /* JADX INFO: renamed from: continue */
    public final /* synthetic */ void mo533continue() {
    }
}
