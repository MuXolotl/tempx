package defpackage;

/* JADX INFO: renamed from: lًۥؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8389l extends Cnative implements InterfaceC0543l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C14148l f17344l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Cinterface f17345l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Cstrictfp f17346l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Cinterface f17347l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Cinterface f17348l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Cinterface f17349l;

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        appmetrica appmetricaVar = new appmetrica(6, 0);
        appmetricaVar.purchase(this.f17346l);
        appmetricaVar.purchase(this.f17345l);
        appmetricaVar.purchase(this.f17344l);
        Cinterface cinterface = this.f17348l;
        if (cinterface != null) {
            appmetricaVar.purchase(new C9320l(false, 0, cinterface));
        }
        Cinterface cinterface2 = this.f17347l;
        if (cinterface2 != null) {
            appmetricaVar.purchase(new C9320l(false, 1, cinterface2));
        }
        appmetricaVar.purchase(this.f17349l);
        return new C16472l(appmetricaVar);
    }
}
