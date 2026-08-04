package defpackage;

/* JADX INFO: renamed from: lٍَٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9676l implements InterfaceC15464l, InterfaceC8396l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C9676l f19754l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C9676l f19755l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C9676l f19756l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f19757l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f19758l;

    static {
        int i = 0;
        f19754l = new C9676l("TINK", i);
        f19756l = new C9676l("CRUNCHY", i);
        f19755l = new C9676l("NO_PREFIX", i);
    }

    public C9676l(String str, InterfaceC9719l interfaceC9719l) {
        this.f19758l = 1;
        this.f19757l = str;
        if (interfaceC9719l instanceof EnumC2441l) {
            C8339l.metrica("params should not be CryptoServicePurpose");
            throw null;
        }
    }

    @Override // defpackage.InterfaceC15464l
    public String getServiceName() {
        return this.f19757l;
    }

    public String toString() {
        int i = this.f19758l;
        String str = this.f19757l;
        switch (i) {
            case 0:
                return str;
            case 1:
            default:
                return super.toString();
            case 2:
                return AbstractC2812l.tapsense(new StringBuilder("<"), str, '>');
            case 3:
                return str;
        }
    }

    public /* synthetic */ C9676l(String str, int i) {
        this.f19758l = i;
        this.f19757l = str;
    }
}
