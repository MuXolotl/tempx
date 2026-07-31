package defpackage;

/* JADX INFO: renamed from: lٖۤٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16751l implements InterfaceC5066l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C16751l f32753l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C16751l f32754l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C16751l f32755l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f32756l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f32757l;

    static {
        int i = 0;
        f32753l = new C16751l("TINK", i);
        f32755l = new C16751l("CRUNCHY", i);
        f32754l = new C16751l("NO_PREFIX", i);
    }

    public /* synthetic */ C16751l(String str, int i) {
        this.f32757l = i;
        this.f32756l = str;
    }

    @Override // defpackage.InterfaceC5066l
    public String isPro() {
        return AbstractC2812l.tapsense(new StringBuilder("expected '"), this.f32756l, '\'');
    }

    public String toString() {
        switch (this.f32757l) {
            case 0:
                return this.f32756l;
            default:
                return super.toString();
        }
    }
}
