package defpackage;

/* JADX INFO: renamed from: l٘ۙۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18176l implements InterfaceC15464l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C18176l f35611l = new C18176l("sans-serif", 0);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C18176l f35612l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C18176l f35613l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C18176l f35614l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C18176l f35615l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C18176l f35616l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f35617l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f35618l;

    static {
        int i = 1;
        f35615l = new C18176l("UNKNOWN_KEYMATERIAL", i);
        f35614l = new C18176l("SYMMETRIC", i);
        f35616l = new C18176l("ASYMMETRIC_PRIVATE", i);
        f35612l = new C18176l("ASYMMETRIC_PUBLIC", i);
        f35613l = new C18176l("REMOTE", i);
    }

    public /* synthetic */ C18176l(String str, int i) {
        this.f35618l = i;
        this.f35617l = str;
    }

    public static C18176l yandex(C13143l c13143l) {
        String str;
        int i = 2;
        c13143l.m3568throw(2);
        int iSignatures = c13143l.signatures();
        int i2 = iSignatures >> 1;
        int iSignatures2 = ((c13143l.signatures() >> 3) & 31) | ((iSignatures & 1) << 5);
        if (i2 == 4 || i2 == 5 || i2 == 7 || i2 == 8) {
            str = "dvhe";
        } else if (i2 == 9) {
            str = "dvav";
        } else {
            if (i2 != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sbAd = AbstractC5020l.ad(str);
        sbAd.append(i2 < 10 ? ".0" : ".");
        sbAd.append(i2);
        return new C18176l(AbstractC9361l.Signature(iSignatures2, iSignatures2 < 10 ? ".0" : ".", sbAd), i);
    }

    @Override // defpackage.InterfaceC15464l
    public String getServiceName() {
        return this.f35617l;
    }

    public String toString() {
        int i = this.f35618l;
        String str = this.f35617l;
        switch (i) {
            case 0:
            case 1:
                return str;
            default:
                return super.toString();
        }
    }
}
