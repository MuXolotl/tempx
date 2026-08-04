package defpackage;

/* JADX INFO: renamed from: lٍۦۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9958l implements InterfaceC14029l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f20316l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C9958l f20315l = new C9958l(0);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C9958l f20314l = new C9958l(1);

    public /* synthetic */ C9958l(int i) {
        this.f20316l = i;
    }

    @Override // defpackage.InterfaceC14029l
    public final InterfaceC12932l metrica() {
        int i = this.f20316l;
        C17218l c17218l = C17218l.f33421l;
        switch (i) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            case 1:
            default:
                return c17218l;
        }
    }

    @Override // defpackage.InterfaceC14029l
    public final void subs(Object obj) {
        switch (this.f20316l) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            case 1:
            default:
                return;
        }
    }

    public String toString() {
        switch (this.f20316l) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    private final void crashlytics(Object obj) {
    }

    private final void loadAd(Object obj) {
    }
}
