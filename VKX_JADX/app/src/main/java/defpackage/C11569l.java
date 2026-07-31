package defpackage;

import android.os.Looper;

/* JADX INFO: renamed from: lِؒۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11569l extends AbstractC10618l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C16528l f23238l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C0848l f23239l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f23240l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public HandlerC4052l f23241l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C16948l f23242l;

    public C11569l(C17417l c17417l) {
        super(c17417l);
        this.f23240l = true;
        this.f23242l = new C16948l(this);
        this.f23238l = new C16528l(this);
        this.f23239l = new C0848l(12, this);
    }

    /* JADX INFO: renamed from: lؖٙؖ, reason: contains not printable characters */
    public final void m3136l() {
        mo211l();
        if (this.f23241l == null) {
            this.f23241l = new HandlerC4052l(Looper.getMainLooper(), 4);
        }
    }

    @Override // defpackage.AbstractC10618l
    /* JADX INFO: renamed from: lَؙ۠ */
    public final boolean mo1234l() {
        return false;
    }
}
