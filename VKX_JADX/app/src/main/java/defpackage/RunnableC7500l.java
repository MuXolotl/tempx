package defpackage;

/* JADX INFO: renamed from: lَؚۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC7500l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f15506l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f15507l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C3716l f15508l;

    public /* synthetic */ RunnableC7500l(C3716l c3716l, int i, int i2) {
        this.f15508l = c3716l;
        this.f15507l = i;
        this.f15506l = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        C3716l c3716l = this.f15508l;
        int i = c3716l.subs;
        int i2 = this.f15507l;
        boolean z2 = true;
        if (i != i2) {
            c3716l.subs = i2;
            z = true;
        } else {
            z = false;
        }
        int i3 = c3716l.admob;
        int i4 = this.f15506l;
        if (i3 != i4) {
            c3716l.admob = i4;
        } else {
            z2 = z;
        }
        if (z2) {
            c3716l.billing();
        }
    }
}
