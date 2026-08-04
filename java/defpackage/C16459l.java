package defpackage;

import android.os.SystemClock;
import j$.util.Objects;

/* JADX INFO: renamed from: lٖٙ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16459l {
    public int amazon;
    public long billing;
    public int crashlytics;
    public Object loadAd;
    public final /* synthetic */ C18289l mopub;
    public boolean purchase;
    public final int yandex;

    public C16459l(C18289l c18289l, int i) {
        this.mopub = c18289l;
        this.yandex = i;
    }

    public final void yandex() {
        long duration;
        C18289l c18289l = this.mopub;
        C3904l c3904l = (C3904l) c18289l.billing;
        C14500l c14500l = (C14500l) c18289l.mopub;
        C17804l c17804l = (C17804l) c18289l.loadAd;
        AbstractC10759l abstractC10759lMo2791l = c17804l.mo2791l();
        Object objSmaato = abstractC10759lMo2791l.startapp() ? null : abstractC10759lMo2791l.smaato(c17804l.ad());
        int iMo2815while = c17804l.mo2815while();
        int iMo2805strictfp = c17804l.mo2805strictfp();
        long jMo2771l = c17804l.mo2771l();
        if (objSmaato == null || iMo2815while != -1) {
            duration = iMo2815while != -1 ? c17804l.getDuration() : -9223372036854775807L;
        } else {
            abstractC10759lMo2791l.mopub(objSmaato, c3904l);
            jMo2771l -= AbstractC15323l.m3986try(c3904l.purchase);
            duration = AbstractC15323l.m3986try(c3904l.amazon);
        }
        boolean zMo2758finally = c17804l.mo2758finally();
        if (!zMo2758finally || duration == -9223372036854775807L || jMo2771l < duration) {
            c14500l.billing(3);
            if (zMo2758finally && duration != -9223372036854775807L) {
                c14500l.admob(3, (int) Math.ceil((duration - jMo2771l) / c17804l.billing().yandex));
            }
            this.purchase = false;
            return;
        }
        ((C18527l) c18289l.purchase).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.purchase;
        int i = this.yandex;
        if (z && Objects.equals(objSmaato, this.loadAd) && iMo2815while == this.crashlytics && iMo2805strictfp == this.amazon) {
            if (jElapsedRealtime - this.billing >= i) {
                ((SurfaceHolderCallbackC18330l) c18289l.amazon).yandex.m4418l(new C17361l(2, new C6240l(3, i), 1003));
                return;
            }
            return;
        }
        this.purchase = true;
        this.billing = jElapsedRealtime;
        this.loadAd = objSmaato;
        this.crashlytics = iMo2815while;
        this.amazon = iMo2805strictfp;
        c14500l.billing(3);
        c14500l.admob(3, i);
    }
}
