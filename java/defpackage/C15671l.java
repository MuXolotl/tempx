package defpackage;

/* JADX INFO: renamed from: lٕٓۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15671l implements InterfaceC2232l, InterfaceC0363l, InterfaceC11512l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final byte[] f30638l = new byte[100];

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f30639l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f30640l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C9053l f30641l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f30642l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public byte[] f30643l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public boolean f30644l;

    public C15671l(C15671l c15671l) {
        this.f30641l = new C9053l(c15671l.f30641l);
        this.f30640l = c15671l.f30640l;
        this.f30639l = c15671l.f30639l;
        this.f30643l = c15671l.f30643l;
        this.f30642l = c15671l.f30642l;
        this.f30644l = c15671l.f30644l;
    }

    public final void amazon(int i, byte[] bArr) {
        byte[] bArrMopub = AbstractC13766l.mopub(i);
        update(bArrMopub, 0, bArrMopub.length);
        byte[] bArrMopub2 = AbstractC14024l.mopub(AbstractC13766l.mopub(bArr.length * 8), bArr);
        update(bArrMopub2, 0, bArrMopub2.length);
        int length = i - ((bArrMopub.length + bArrMopub2.length) % i);
        if (length <= 0 || length == i) {
            return;
        }
        while (true) {
            byte[] bArr2 = f30638l;
            if (length <= 100) {
                update(bArr2, 0, length);
                return;
            } else {
                update(bArr2, 0, 100);
                length -= 100;
            }
        }
    }

    @Override // defpackage.InterfaceC0363l
    public final int crashlytics(int i, int i2, byte[] bArr) {
        boolean z = this.f30644l;
        C9053l c9053l = this.f30641l;
        if (z) {
            if (!this.f30642l) {
                C8339l.smaato("KMAC not initialized");
                return 0;
            }
            byte[] bArrAdmob = AbstractC13766l.admob(i2 * 8);
            c9053l.billing(0, bArrAdmob.length, bArrAdmob);
        }
        int iCrashlytics = c9053l.crashlytics(0, i2, bArr);
        reset();
        return iCrashlytics;
    }

    @Override // defpackage.InterfaceC2232l
    public final int doFinal(byte[] bArr, int i) {
        boolean z = this.f30644l;
        C9053l c9053l = this.f30641l;
        if (z) {
            if (!this.f30642l) {
                C8339l.smaato("KMAC not initialized");
                return 0;
            }
            byte[] bArrAdmob = AbstractC13766l.admob(this.f30639l * 8);
            c9053l.billing(0, bArrAdmob.length, bArrAdmob);
        }
        int iCrashlytics = c9053l.crashlytics(i, this.f30639l, bArr);
        reset();
        return iCrashlytics;
    }

    @Override // defpackage.InterfaceC2232l
    public final String getAlgorithmName() {
        return "KMAC".concat(this.f30641l.getAlgorithmName().substring(6));
    }

    @Override // defpackage.InterfaceC9273l
    public final int getByteLength() {
        return this.f30641l.getByteLength();
    }

    @Override // defpackage.InterfaceC16922l
    public final int getDigestSize() {
        return this.f30639l;
    }

    @Override // defpackage.InterfaceC2232l
    public final int getMacSize() {
        return this.f30639l;
    }

    @Override // defpackage.InterfaceC2232l
    public final void init(InterfaceC9719l interfaceC9719l) {
        byte[] bArrCrashlytics = AbstractC14024l.crashlytics(((C13886l) interfaceC9719l).f27156l);
        this.f30643l = bArrCrashlytics;
        if (bArrCrashlytics.length > 255) {
            C8339l.metrica("key length must be between 0 and 2040 bits");
        } else {
            this.f30642l = true;
            reset();
        }
    }

    @Override // defpackage.InterfaceC11512l
    public final void loadAd(InterfaceC11512l interfaceC11512l) {
        C15671l c15671l = (C15671l) interfaceC11512l;
        this.f30641l.loadAd(c15671l.f30641l);
        this.f30640l = c15671l.f30640l;
        this.f30639l = c15671l.f30639l;
        this.f30642l = c15671l.f30642l;
        this.f30644l = c15671l.f30644l;
    }

    @Override // defpackage.InterfaceC2232l
    public final void reset() {
        this.f30641l.reset();
        byte[] bArr = this.f30643l;
        if (bArr != null) {
            amazon(this.f30640l == 128 ? 168 : 136, bArr);
        }
        this.f30644l = true;
    }

    @Override // defpackage.InterfaceC2232l
    public final void update(byte b) {
        if (this.f30642l) {
            this.f30641l.update(b);
        } else {
            C8339l.smaato("KMAC not initialized");
        }
    }

    @Override // defpackage.InterfaceC11512l
    public final InterfaceC11512l yandex() {
        return new C15671l(this);
    }

    @Override // defpackage.InterfaceC2232l
    public final void update(byte[] bArr, int i, int i2) {
        if (this.f30642l) {
            this.f30641l.billing(i, i2, bArr);
        } else {
            C8339l.smaato("KMAC not initialized");
        }
    }

    public C15671l(int i, byte[] bArr) {
        this.f30641l = new C9053l(AbstractC9008l.crashlytics("KMAC"), i, bArr);
        this.f30640l = i;
        this.f30639l = (i * 2) / 8;
    }
}
