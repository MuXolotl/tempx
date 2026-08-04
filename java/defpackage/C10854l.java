package defpackage;

import android.os.Handler;

/* JADX INFO: renamed from: lُؖۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10854l implements InterfaceC3177l {

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C10854l f21938l = new C10854l();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f21942l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f21943l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Handler f21944l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f21939l = true;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f21945l = true;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C5268l f21946l = new C5268l(this, true);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final RunnableC11297l f21940l = new RunnableC11297l(26, this);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C14965l f21941l = new C14965l(this);

    public final void crashlytics() {
        int i = this.f21942l + 1;
        this.f21942l = i;
        if (i == 1) {
            if (!this.f21939l) {
                this.f21944l.removeCallbacks(this.f21940l);
            } else {
                this.f21946l.purchase(EnumC14812l.ON_RESUME);
                this.f21939l = false;
            }
        }
    }

    @Override // defpackage.InterfaceC3177l
    public final AbstractC6475l loadAd() {
        return this.f21946l;
    }
}
