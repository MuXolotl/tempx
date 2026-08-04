package defpackage;

import android.os.SystemClock;
import j$.util.Objects;

/* JADX INFO: renamed from: lؖ۠ؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4440l {
    public long admob;
    public int amazon;
    public long billing;
    public int crashlytics;
    public Object loadAd;
    public boolean mopub;
    public long purchase;
    public final /* synthetic */ C18289l subs;
    public final int yandex;

    public C4440l(C18289l c18289l, int i) {
        this.subs = c18289l;
        this.yandex = i;
    }

    public final void yandex() {
        Object obj;
        C18289l c18289l = this.subs;
        C14500l c14500l = (C14500l) c18289l.mopub;
        C17804l c17804l = (C17804l) c18289l.loadAd;
        if (c17804l.purchase() != 2 || !c17804l.startapp() || c17804l.mo2770l() != 0) {
            if (this.mopub) {
                c14500l.billing(1);
            }
            this.mopub = false;
            return;
        }
        AbstractC10759l abstractC10759lMo2791l = c17804l.mo2791l();
        Object objSmaato = abstractC10759lMo2791l.startapp() ? null : abstractC10759lMo2791l.smaato(c17804l.ad());
        int iMo2815while = c17804l.mo2815while();
        int iMo2805strictfp = c17804l.mo2805strictfp();
        long jMo2798new = c17804l.mo2798new();
        long jMax = Math.max(0L, c17804l.firebase() - Math.max(0L, jMo2798new - c17804l.mo2771l()));
        if (objSmaato != null && iMo2815while == -1) {
            jMo2798new -= AbstractC15323l.m3986try(abstractC10759lMo2791l.mopub(objSmaato, (C3904l) c18289l.billing).purchase);
        }
        ((C18527l) c18289l.purchase).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.mopub;
        int i = this.yandex;
        if (z && Objects.equals(objSmaato, this.loadAd) && iMo2815while == this.crashlytics && iMo2805strictfp == this.amazon) {
            obj = objSmaato;
            if (jMo2798new == this.purchase && jMax == this.billing) {
                if (jElapsedRealtime - this.admob >= i) {
                    ((SurfaceHolderCallbackC18330l) c18289l.amazon).yandex.m4418l(new C17361l(2, new C6240l(1, i), 1003));
                    return;
                }
                return;
            }
        } else {
            obj = objSmaato;
        }
        this.mopub = true;
        this.admob = jElapsedRealtime;
        this.loadAd = obj;
        this.crashlytics = iMo2815while;
        this.amazon = iMo2805strictfp;
        this.purchase = jMo2798new;
        this.billing = jMax;
        c14500l.billing(1);
        c14500l.admob(1, i);
    }
}
