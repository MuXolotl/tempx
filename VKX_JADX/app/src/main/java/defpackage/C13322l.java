package defpackage;

/* JADX INFO: renamed from: lٍّْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13322l extends AbstractC13948l {
    public static final C13322l amazon = new C13322l("must be a member function", 0);
    public static final C13322l purchase = new C13322l("must be a member or an extension function", 1);
    public final /* synthetic */ int crashlytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13322l(String str, int i) {
        super(str, 0);
        this.crashlytics = i;
    }

    @Override // defpackage.InterfaceC4121l
    public final boolean loadAd(C12113l c12113l) {
        switch (this.crashlytics) {
            case 0:
                return c12113l.f20729l != null;
            default:
                return (c12113l.f20729l == null && c12113l.f20722l == null) ? false : true;
        }
    }
}
