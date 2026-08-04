package defpackage;

/* JADX INFO: renamed from: lٔؐۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C14599l implements InterfaceC0363l, InterfaceC17898l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final byte[] f28580l = AbstractC9008l.crashlytics("TupleHash");

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f28581l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f28582l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C9053l f28583l;

    public C14599l(int i, int i2) {
        this.f28583l = new C9053l(f28580l, i, null);
        this.f28582l = (i2 + 7) / 8;
        reset();
    }

    @Override // defpackage.InterfaceC0363l
    public final int crashlytics(int i, int i2, byte[] bArr) {
        boolean z = this.f28581l;
        C9053l c9053l = this.f28583l;
        if (z) {
            byte[] bArrAdmob = AbstractC13766l.admob(((long) this.f28582l) * 8);
            c9053l.billing(0, bArrAdmob.length, bArrAdmob);
            this.f28581l = false;
        }
        int iCrashlytics = c9053l.crashlytics(0, i2, bArr);
        reset();
        return iCrashlytics;
    }

    @Override // defpackage.InterfaceC16922l
    public final int doFinal(byte[] bArr, int i) {
        boolean z = this.f28581l;
        C9053l c9053l = this.f28583l;
        if (z) {
            byte[] bArrAdmob = AbstractC13766l.admob(((long) this.f28582l) * 8);
            c9053l.billing(0, bArrAdmob.length, bArrAdmob);
            this.f28581l = false;
        }
        int iCrashlytics = c9053l.crashlytics(i, this.f28582l, bArr);
        reset();
        return iCrashlytics;
    }

    @Override // defpackage.InterfaceC16922l
    public final String getAlgorithmName() {
        return "TupleHash".concat(this.f28583l.getAlgorithmName().substring(6));
    }

    @Override // defpackage.InterfaceC9273l
    public final int getByteLength() {
        return this.f28583l.getByteLength();
    }

    @Override // defpackage.InterfaceC16922l
    public final int getDigestSize() {
        return this.f28582l;
    }

    @Override // defpackage.InterfaceC11512l
    public final void loadAd(InterfaceC11512l interfaceC11512l) {
        C14599l c14599l = (C14599l) interfaceC11512l;
        C9053l c9053l = c14599l.f28583l;
        C9053l c9053l2 = this.f28583l;
        c9053l2.loadAd(c9053l);
        this.f28582l = (c9053l2.f11571l * 2) / 8;
        this.f28581l = c14599l.f28581l;
    }

    @Override // defpackage.InterfaceC16922l
    public final void reset() {
        this.f28583l.reset();
        this.f28581l = true;
    }

    @Override // defpackage.InterfaceC16922l
    public final void update(byte[] bArr, int i, int i2) {
        byte[] bArrMopub = bArr.length == i2 ? AbstractC14024l.mopub(AbstractC13766l.mopub(i2 * 8), bArr) : AbstractC14024l.mopub(AbstractC13766l.mopub(i2 * 8), AbstractC14024l.vip(i, i2 + i, bArr));
        this.f28583l.billing(0, bArrMopub.length, bArrMopub);
    }

    @Override // defpackage.InterfaceC11512l
    public final InterfaceC11512l yandex() {
        return new C14599l(this);
    }

    public C14599l(C14599l c14599l) {
        this.f28583l = new C9053l(c14599l.f28583l);
        this.f28582l = c14599l.f28582l;
        this.f28581l = c14599l.f28581l;
    }

    @Override // defpackage.InterfaceC16922l
    public final void update(byte b) {
        byte[] bArrMopub = AbstractC14024l.mopub(AbstractC13766l.mopub(8L), new byte[]{b});
        this.f28583l.billing(0, bArrMopub.length, bArrMopub);
    }
}
