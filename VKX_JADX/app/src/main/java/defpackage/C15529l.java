package defpackage;

/* JADX INFO: renamed from: lؙٕۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15529l extends Cnative {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f30335l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f30336l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f30337l = 0;

    public C15529l(Cfor cfor, C11327l c11327l) {
        if (cfor == null) {
            C6541l.subs("'algorithm' cannot be null");
            throw null;
        }
        if (c11327l == null) {
            C6541l.subs("'counter' cannot be null");
            throw null;
        }
        this.f30336l = cfor;
        this.f30335l = c11327l;
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        switch (this.f30337l) {
            case 0:
                return new C11138l((Cfor) this.f30336l, (Cthrow) this.f30335l);
            default:
                appmetrica appmetricaVar = new appmetrica(3, 0);
                appmetricaVar.purchase(Cstrictfp.f36573l);
                appmetricaVar.purchase(new C11327l((byte[]) this.f30336l));
                appmetricaVar.purchase(new C11327l((byte[]) this.f30335l));
                C11138l c11138l = new C11138l(appmetricaVar);
                c11138l.f22357l = -1;
                return c11138l;
        }
    }

    public C15529l(byte[] bArr, byte[] bArr2) {
        this.f30336l = AbstractC14024l.crashlytics(bArr);
        this.f30335l = AbstractC14024l.crashlytics(bArr2);
    }
}
