package defpackage;

/* JADX INFO: renamed from: lٍٔۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9566l implements InterfaceC9719l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f19498l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final int f19499l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f19500l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f19501l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f19502l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f19503l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final AbstractC1821l f19504l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C9566l f19493l = new C9566l(3, 1);

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C9566l f19496l = new C9566l(3, 2);

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C9566l f19494l = new C9566l(3, 3);

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C9566l f19497l = new C9566l(5, 1);

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C9566l f19495l = new C9566l(5, 2);

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final C9566l f19492l = new C9566l(5, 3);

    public C9566l(int i, int i2) {
        AbstractC1821l c5153l;
        if (i == 3) {
            this.f19501l = 68;
            this.f19500l = 32;
            this.f19498l = 48;
            c5153l = new C5153l();
        } else {
            if (i != 5) {
                C8339l.metrica("No valid version. Please choose one of the following: 3, 5");
                throw null;
            }
            this.f19501l = 96;
            this.f19500l = 36;
            this.f19498l = 64;
            c5153l = new C17711l();
        }
        this.f19504l = c5153l;
        int i3 = this.f19501l;
        int i4 = this.f19500l;
        int i5 = this.f19498l;
        this.f19503l = i3 + i4 + i5;
        this.f19502l = i4 + i5;
        this.f19499l = i2;
    }
}
