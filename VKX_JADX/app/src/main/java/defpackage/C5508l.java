package defpackage;

/* JADX INFO: renamed from: lؘؙٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5508l extends AbstractC11737l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C16679l f11772l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public long f11773l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5508l(InterfaceC9473l interfaceC9473l, C16679l c16679l) {
        super(interfaceC9473l);
        this.f11772l = c16679l;
    }

    @Override // defpackage.InterfaceC14991l
    public final long ad(C0869l c0869l, long j) {
        C16679l c16679l = this.f11772l;
        AbstractC6897l abstractC6897l = c16679l.f32700l;
        long jAd = this.f23514l.ad(c0869l, j);
        if (jAd != -1) {
            this.f11773l += jAd;
        }
        C4568l c4568l = c16679l.f32699l;
        long j2 = this.f11773l;
        long jBilling = abstractC6897l.billing();
        float f = this.f11773l;
        long jBilling2 = abstractC6897l.billing();
        if (jBilling2 < 1) {
            jBilling2 = 1;
        }
        float fFloatValue = ((Number) AbstractC8576l.admob(Float.valueOf(f / jBilling2), new C12015l(0.0f, 1.0f))).floatValue();
        ((C9135l) c4568l.f9268l).f18783l.setValue(new C12097l(jBilling, j2, fFloatValue));
        return jAd;
    }
}
