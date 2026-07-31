package defpackage;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayDeque;
import java.util.TimerTask;

/* JADX INFO: renamed from: lٜؑؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0446l extends TimerTask {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C13985l f1624l;

    public C0446l(C13985l c13985l) {
        this.f1624l = c13985l;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        BasePendingResult basePendingResultStartapp;
        C13985l c13985l = this.f1624l;
        ArrayDeque arrayDeque = c13985l.admob;
        if (arrayDeque.isEmpty() || c13985l.firebase != null || c13985l.loadAd == 0) {
            return;
        }
        C17186l c17186l = c13985l.crashlytics;
        int[] iArrAmazon = AbstractC15091l.amazon(arrayDeque);
        c17186l.getClass();
        AbstractC1051l.purchase("Must be called from the main thread.");
        if (c17186l.adcel()) {
            C9162l c9162l = new C9162l(c17186l, iArrAmazon);
            C17186l.ads(c9162l);
            basePendingResultStartapp = c9162l;
        } else {
            basePendingResultStartapp = C17186l.startapp();
        }
        c13985l.firebase = basePendingResultStartapp;
        basePendingResultStartapp.mopub(new C3988l(c13985l, 0));
        arrayDeque.clear();
    }
}
