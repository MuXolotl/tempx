package defpackage;

/* JADX INFO: renamed from: lؘٖٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16219l extends AbstractC6119l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f31753l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f31754l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C16219l f31749l = new C16219l("CharMatcher.any()", 0);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C16219l f31751l = new C16219l("CharMatcher.ascii()", 1);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C16219l f31750l = new C16219l("CharMatcher.javaIsoControl()", 2);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C16219l f31752l = new C16219l("CharMatcher.none()", 3);

    public C16219l(String str, int i) {
        this.f31753l = i;
        this.f31754l = str;
    }

    @Override // defpackage.AbstractC6119l, defpackage.AbstractC8791l
    public AbstractC8791l amazon() {
        switch (this.f31753l) {
            case 0:
                return f31752l;
            case 3:
                return f31749l;
            default:
                return super.amazon();
        }
    }

    @Override // defpackage.AbstractC8791l
    public final boolean crashlytics(char c) {
        switch (this.f31753l) {
            case 0:
                return true;
            case 1:
                return c <= 127;
            case 2:
                return c <= 31 || (c >= 127 && c <= 159);
            default:
                return false;
        }
    }

    public final String toString() {
        return this.f31754l;
    }
}
