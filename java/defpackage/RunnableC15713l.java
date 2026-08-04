package defpackage;

/* JADX INFO: renamed from: lٕٖؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC15713l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC10687l f30854l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC4829l f30855l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f30856l;

    public /* synthetic */ RunnableC15713l(AbstractC4829l abstractC4829l, C10035l c10035l, InterfaceC10687l interfaceC10687l, int i) {
        this.f30856l = i;
        this.f30855l = abstractC4829l;
        this.f30854l = interfaceC10687l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30856l) {
            case 0:
                this.f30855l.purchase(C10035l.crashlytics(this.f30854l));
                break;
            default:
                this.f30855l.yandex(C10035l.crashlytics(this.f30854l));
                break;
        }
    }
}
