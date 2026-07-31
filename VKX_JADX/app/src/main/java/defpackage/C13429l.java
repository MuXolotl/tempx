package defpackage;

/* JADX INFO: renamed from: lٌْٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13429l extends AbstractC6107l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final C13429l f26340l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C13429l f26341l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C13429l f26342l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C13429l f26344l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final C13429l f26345l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C13429l f26347l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C13429l f26348l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C13429l f26349l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C13429l f26350l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final C13429l f26351l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f26352l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C13429l f26346l = new C13429l("package", false, 0);

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public static final C13429l f26343l = new C13429l("unknown", false, 11);

    static {
        boolean z = true;
        f26349l = new C13429l("protected_and_package", z, 1);
        f26341l = new C13429l("protected_static", z, 2);
        boolean z2 = false;
        f26342l = new C13429l("inherited", z2, 3);
        f26348l = new C13429l("internal", z2, 4);
        f26344l = new C13429l("invisible_fake", z2, 5);
        f26350l = new C13429l("local", z2, 6);
        f26347l = new C13429l("private", z2, 7);
        f26340l = new C13429l("private_to_this", z2, 8);
        boolean z3 = true;
        f26351l = new C13429l("protected", z3, 9);
        f26345l = new C13429l("public", z3, 10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13429l(String str, boolean z, int i) {
        super(str, z);
        this.f26352l = i;
    }

    @Override // defpackage.AbstractC6107l
    public Integer loadAd(AbstractC6107l abstractC6107l) {
        int i = this.f26352l;
        C13429l c13429l = f26340l;
        C13429l c13429l2 = f26347l;
        switch (i) {
            case 0:
                if (this == abstractC6107l) {
                    return 0;
                }
                C17963l c17963l = AbstractC16157l.yandex;
                return (abstractC6107l == c13429l2 || abstractC6107l == c13429l) ? 1 : -1;
            case 1:
                if (this == abstractC6107l) {
                    return 0;
                }
                if (abstractC6107l == f26348l) {
                    return null;
                }
                C17963l c17963l2 = AbstractC16157l.yandex;
                return (abstractC6107l == c13429l2 || abstractC6107l == c13429l) ? 1 : -1;
            default:
                return super.loadAd(abstractC6107l);
        }
    }

    @Override // defpackage.AbstractC6107l
    public String mopub() {
        switch (this.f26352l) {
            case 0:
                return "public/*package*/";
            case 1:
                return "protected/*protected and package*/";
            case 2:
                return "protected/*protected static*/";
            case 8:
                return "private/*private to this*/";
            default:
                return super.mopub();
        }
    }

    @Override // defpackage.AbstractC6107l
    public AbstractC6107l subscription() {
        int i = this.f26352l;
        C13429l c13429l = f26351l;
        switch (i) {
            case 0:
            case 1:
            case 2:
                return c13429l;
            default:
                return this;
        }
    }
}
