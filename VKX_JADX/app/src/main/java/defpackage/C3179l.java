package defpackage;

/* JADX INFO: renamed from: lؕؕۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3179l implements InterfaceC15464l, InterfaceC8396l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C3179l f6837l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C3179l f6838l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C3179l f6839l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C3179l f6840l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f6841l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6842l;

    static {
        int i = 0;
        f6837l = new C3179l("TINK", i);
        f6839l = new C3179l("CRUNCHY", i);
        f6838l = new C3179l("LEGACY", i);
        f6840l = new C3179l("NO_PREFIX", i);
    }

    public /* synthetic */ C3179l(String str, int i) {
        this.f6842l = i;
        this.f6841l = str;
    }

    @Override // defpackage.InterfaceC15464l
    public String getServiceName() {
        return this.f6841l;
    }

    public String toString() {
        int i = this.f6842l;
        String str = this.f6841l;
        switch (i) {
            case 0:
                return str;
            case 1:
            default:
                return super.toString();
            case 2:
                return AbstractC1833l.firebase("\n            Args." + str + "\n        ");
        }
    }
}
