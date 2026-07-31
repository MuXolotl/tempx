package defpackage;

/* JADX INFO: renamed from: lؙٟ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6653l extends Cgoto implements InterfaceC16011l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f13989l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Object f13990l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C3498l f13991l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6653l(Object obj, AbstractC18041l abstractC18041l, C3498l c3498l, int i) {
        super(abstractC18041l);
        this.f13989l = i;
        this.f13990l = obj;
        this.f13991l = c3498l;
    }

    /* JADX INFO: renamed from: lٕؖؔ, reason: contains not printable characters */
    public final C3498l m2061l() {
        switch (this.f13989l) {
            case 0:
                break;
        }
        return this.f13991l;
    }

    @Override // defpackage.Cgoto
    public final String toString() {
        int i = this.f13989l;
        Object obj = this.f13990l;
        switch (i) {
            case 0:
                return yandex() + ": Ctx { " + ((InterfaceC17477l) obj) + " }";
            default:
                return "Cxt { " + ((InterfaceC11661l) obj) + " }";
        }
    }
}
