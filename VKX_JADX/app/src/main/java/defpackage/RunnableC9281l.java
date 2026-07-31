package defpackage;

import android.util.Log;
import java.io.IOException;

/* JADX INFO: renamed from: lٍؒۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC9281l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C2350l f19080l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f19081l;

    public /* synthetic */ RunnableC9281l(int i, C2350l c2350l) {
        this.f19081l = i;
        this.f19080l = c2350l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f19081l;
        C2350l c2350l = this.f19080l;
        switch (i) {
            case 0:
                if (c2350l.crashlytics(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
                break;
            default:
                C8930l.amazon.loadAd("get checkbox consent timed out", new Object[0]);
                c2350l.amazon(Boolean.FALSE);
                break;
        }
    }
}
