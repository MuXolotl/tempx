package defpackage;

/* JADX INFO: renamed from: lؑؑؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC0016l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ long f870l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C17044l f871l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f872l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ String f873l;

    public /* synthetic */ RunnableC0016l(C17044l c17044l, long j, String str, int i) {
        this.f872l = i;
        this.f871l = c17044l;
        this.f870l = j;
        this.f873l = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f872l) {
            case 0:
                C17044l c17044l = this.f871l;
                ((ExecutorC4850l) c17044l.metrica.f1957l).yandex(new RunnableC0016l(c17044l, this.f870l, this.f873l, 1));
                break;
            default:
                C17503l c17503l = this.f871l.mopub;
                C2858l c2858l = c17503l.vip;
                if (c2858l == null || !c2858l.purchase.get()) {
                    ((InterfaceC12665l) c17503l.subs.f20418l).smaato(this.f870l, this.f873l);
                }
                break;
        }
    }
}
