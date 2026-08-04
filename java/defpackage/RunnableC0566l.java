package defpackage;

/* JADX INFO: renamed from: lؑۚؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0566l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f1962l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final EnumC14812l f1963l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C5268l f1964l;

    public RunnableC0566l(C5268l c5268l, EnumC14812l enumC14812l) {
        this.f1964l = c5268l;
        this.f1963l = enumC14812l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1962l) {
            return;
        }
        this.f1964l.purchase(this.f1963l);
        this.f1962l = true;
    }
}
