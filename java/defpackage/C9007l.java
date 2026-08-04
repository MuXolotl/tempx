package defpackage;

/* JADX INFO: renamed from: lٌۘۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9007l implements InterfaceC13321l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f18568l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f18569l;

    public /* synthetic */ C9007l(int i, Object obj) {
        this.f18569l = i;
        this.f18568l = obj;
    }

    @Override // defpackage.InterfaceC13321l
    public final long yandex() {
        int i = this.f18569l;
        Object obj = this.f18568l;
        switch (i) {
            case 0:
                C2037l c2037l = (C2037l) obj;
                long jYandex = c2037l.f4570l.yandex();
                if (jYandex != 16) {
                    return jYandex;
                }
                C1765l c1765l = (C1765l) AbstractC13402l.loadAd(c2037l, AbstractC13609l.yandex);
                if (c1765l != null) {
                    long j = c1765l.yandex;
                    if (j != 16) {
                        return j;
                    }
                }
                long j2 = ((C9735l) AbstractC13402l.loadAd(c2037l, AbstractC11892l.yandex)).yandex;
                return (((C10236l) AbstractC13402l.loadAd(c2037l, AbstractC17200l.yandex)).yandex() || ((double) AbstractC12953l.vip(j2)) >= 0.5d) ? j2 : C9735l.purchase;
            case 1:
                return ((C8372l) obj).crashlytics;
            default:
                return ((C10210l) obj).crashlytics;
        }
    }
}
