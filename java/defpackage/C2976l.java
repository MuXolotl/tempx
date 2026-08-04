package defpackage;

/* JADX INFO: renamed from: lؔۢؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2976l extends Cnative implements InterfaceC15427l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Cfor f6463l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public byte[] f6464l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public AbstractC11918l f6465l;

    /* JADX WARN: Code duplicated, block: B:11:0x0078  */
    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        C11327l c11327l;
        byte[] bArr;
        AbstractC11918l abstractC11918l = this.f6465l;
        appmetrica appmetricaVar = new appmetrica(3, 0);
        if (!this.f6463l.ad(InterfaceC15427l.f30181l)) {
            if (this.f6463l.ad(InterfaceC15427l.f30176l)) {
                AbstractC2426l abstractC2426l = abstractC11918l.loadAd;
                appmetricaVar.purchase(new C11327l(C2193l.yandex(abstractC2426l.firebase(), abstractC2426l.signatures())));
                AbstractC2426l abstractC2426l2 = abstractC11918l.crashlytics;
                c11327l = new C11327l(C2193l.yandex(abstractC2426l2.firebase(), abstractC2426l2.signatures()));
            }
            bArr = this.f6464l;
            if (bArr != null) {
                appmetricaVar.purchase(new C13353l(bArr, 0));
            }
            C11138l c11138l = new C11138l(appmetricaVar);
            c11138l.f22357l = -1;
            return c11138l;
        }
        AbstractC2426l abstractC2426l3 = abstractC11918l.loadAd;
        appmetricaVar.purchase(new C11327l(C2193l.yandex(abstractC2426l3.firebase(), abstractC2426l3.signatures())));
        AbstractC2426l abstractC2426l4 = abstractC11918l.crashlytics;
        c11327l = new C11327l(C2193l.yandex(abstractC2426l4.firebase(), abstractC2426l4.signatures()));
        appmetricaVar.purchase(c11327l);
        bArr = this.f6464l;
        if (bArr != null) {
            appmetricaVar.purchase(new C13353l(bArr, 0));
        }
        C11138l c11138l2 = new C11138l(appmetricaVar);
        c11138l2.f22357l = -1;
        return c11138l2;
    }
}
