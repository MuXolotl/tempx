package defpackage;

import android.os.SystemClock;

/* JADX INFO: renamed from: lؙؙ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6308l {
    public long amazon;
    public boolean crashlytics;
    public int loadAd;
    public final /* synthetic */ C18289l purchase;
    public final int yandex;

    public C6308l(C18289l c18289l, int i) {
        this.purchase = c18289l;
        this.yandex = i;
    }

    public final void yandex() {
        C18289l c18289l = this.purchase;
        C14500l c14500l = (C14500l) c18289l.mopub;
        C17804l c17804l = (C17804l) c18289l.loadAd;
        int iMo2770l = c17804l.mo2770l();
        if (!c17804l.startapp() || c17804l.purchase() == 1 || c17804l.purchase() == 4 || iMo2770l == 0 || iMo2770l == 1) {
            if (this.crashlytics) {
                c14500l.billing(4);
            }
            this.crashlytics = false;
            return;
        }
        ((C18527l) c18289l.purchase).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.crashlytics;
        int i = this.yandex;
        if (z && this.loadAd == iMo2770l) {
            if (jElapsedRealtime - this.amazon >= i) {
                ((SurfaceHolderCallbackC18330l) c18289l.amazon).yandex.m4418l(new C17361l(2, new C6240l(4, i), 1003));
                return;
            }
            return;
        }
        this.crashlytics = true;
        this.amazon = jElapsedRealtime;
        this.loadAd = iMo2770l;
        c14500l.billing(4);
        c14500l.admob(4, i);
    }
}
