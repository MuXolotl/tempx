package defpackage;

/* JADX INFO: renamed from: lؙٚۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6570l implements InterfaceC12244l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public AbstractC2249l f13719l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C10086l f13720l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C0010l f13721l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public long f13722l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public long f13723l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public boolean f13724l;

    public C6570l(C0010l c0010l, Object obj, AbstractC2249l abstractC2249l, long j, long j2, boolean z) {
        AbstractC2249l abstractC2249lAmazon;
        this.f13721l = c0010l;
        this.f13720l = AbstractC8020l.smaato(obj);
        if (abstractC2249l != null) {
            abstractC2249lAmazon = AbstractC4959l.amazon(abstractC2249l);
        } else {
            abstractC2249lAmazon = (AbstractC2249l) c0010l.yandex.invoke(obj);
            abstractC2249lAmazon.amazon();
        }
        this.f13719l = abstractC2249lAmazon;
        this.f13723l = j;
        this.f13722l = j2;
        this.f13724l = z;
    }

    public final Object crashlytics() {
        return this.f13721l.loadAd.invoke(this.f13719l);
    }

    @Override // defpackage.InterfaceC12244l
    public final Object getValue() {
        return this.f13720l.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f13720l.getValue() + ", velocity=" + crashlytics() + ", isRunning=" + this.f13724l + ", lastFrameTimeNanos=" + this.f13723l + ", finishedTimeNanos=" + this.f13722l + ")";
    }

    public /* synthetic */ C6570l(C0010l c0010l, Object obj, AbstractC2249l abstractC2249l, int i) {
        this(c0010l, obj, (i & 4) != 0 ? null : abstractC2249l, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
