package defpackage;

/* JADX INFO: renamed from: lۥۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18691l extends AbstractC9654l {
    public final /* synthetic */ C11860l billing;
    public final /* synthetic */ int purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18691l(C11860l c11860l, C17417l c17417l, int i) {
        super(c17417l);
        this.purchase = i;
        this.billing = c11860l;
    }

    @Override // defpackage.AbstractC9654l
    public final void yandex() {
        int i = this.purchase;
        C11860l c11860l = this.billing;
        switch (i) {
            case 0:
                c11860l.mo211l();
                if (c11860l.m3262l()) {
                    C8118l c8118l = ((C17417l) c11860l.f833l).f33950l;
                    C17417l.admob(c8118l);
                    c8118l.f16911l.yandex("Inactivity, disconnecting from the service");
                    c11860l.m3255l();
                    break;
                }
                break;
            default:
                C8118l c8118l2 = ((C17417l) c11860l.f833l).f33950l;
                C17417l.admob(c8118l2);
                c8118l2.f16910l.yandex("Tasks have been queued for a long time");
                break;
        }
    }
}
