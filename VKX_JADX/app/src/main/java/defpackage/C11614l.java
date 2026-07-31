package defpackage;

/* JADX INFO: renamed from: lِؕٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11614l implements InterfaceC14255l {
    public final /* synthetic */ Object crashlytics;
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex = 0;

    public C11614l(C2814l c2814l, Ctry ctry) {
        this.loadAd = c2814l;
        this.crashlytics = ctry;
    }

    @Override // defpackage.InterfaceC14255l
    public final /* synthetic */ void loadAd() {
        int i = this.yandex;
    }

    @Override // defpackage.InterfaceC14255l
    public final void yandex(C1796l c1796l) {
        int i = this.yandex;
        Object obj = this.loadAd;
        Object obj2 = this.crashlytics;
        switch (i) {
            case 0:
                c1796l.loadAd();
                C2814l c2814l = (C2814l) obj;
                if (c1796l.equals(c2814l.billing)) {
                    c2814l.billing = null;
                    ((Ctry) obj2).invoke();
                }
                break;
            default:
                C9967l c9967l = (C9967l) obj2;
                c9967l.f20350l = 1.0f;
                c9967l.admob();
                ((RunnableC12388l) obj).run();
                break;
        }
    }

    public C11614l(C9967l c9967l, RunnableC12388l runnableC12388l) {
        this.crashlytics = c9967l;
        this.loadAd = runnableC12388l;
    }

    private final /* synthetic */ void amazon() {
    }

    private final /* synthetic */ void crashlytics() {
    }
}
