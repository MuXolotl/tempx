package defpackage;

import android.os.SystemClock;
import j$.util.Objects;

/* JADX INFO: renamed from: lًٙٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8078l {
    public final /* synthetic */ C18289l admob;
    public int amazon;
    public boolean billing;
    public int crashlytics;
    public Object loadAd;
    public long mopub;
    public long purchase;
    public final int yandex;

    public C8078l(C18289l c18289l, int i) {
        this.admob = c18289l;
        this.yandex = i;
    }

    public final void yandex() {
        C18289l c18289l = this.admob;
        C14500l c14500l = (C14500l) c18289l.mopub;
        C17804l c17804l = (C17804l) c18289l.loadAd;
        if (!c17804l.mo2758finally()) {
            if (this.billing) {
                c14500l.billing(2);
            }
            this.billing = false;
            return;
        }
        AbstractC10759l abstractC10759lMo2791l = c17804l.mo2791l();
        Object objSmaato = abstractC10759lMo2791l.startapp() ? null : abstractC10759lMo2791l.smaato(c17804l.ad());
        int iMo2815while = c17804l.mo2815while();
        int iMo2805strictfp = c17804l.mo2805strictfp();
        long jMo2771l = c17804l.mo2771l();
        if (objSmaato != null && iMo2815while == -1) {
            jMo2771l -= AbstractC15323l.m3986try(abstractC10759lMo2791l.mopub(objSmaato, (C3904l) c18289l.billing).purchase);
        }
        ((C18527l) c18289l.purchase).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.billing;
        int i = this.yandex;
        if (z && Objects.equals(objSmaato, this.loadAd) && iMo2815while == this.crashlytics && iMo2805strictfp == this.amazon && jMo2771l == this.purchase) {
            if (jElapsedRealtime - this.mopub >= i) {
                ((SurfaceHolderCallbackC18330l) c18289l.amazon).yandex.m4418l(new C17361l(2, new C6240l(2, i), 1003));
                return;
            }
            return;
        }
        this.billing = true;
        this.mopub = jElapsedRealtime;
        this.loadAd = objSmaato;
        this.crashlytics = iMo2815while;
        this.amazon = iMo2805strictfp;
        this.purchase = jMo2771l;
        c14500l.billing(2);
        c14500l.admob(2, i);
    }
}
