package defpackage;

import android.net.Uri;

/* JADX INFO: renamed from: lًؚۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC7852l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C8384l f16385l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f16386l;

    public /* synthetic */ RunnableC7852l(C8384l c8384l, int i) {
        this.f16386l = i;
        this.f16385l = c8384l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f16386l;
        C8384l c8384l = this.f16385l;
        switch (i) {
            case 0:
                c8384l.yandex.unregisterReceiver(c8384l.amazon);
                break;
            case 1:
                C8384l.yandex(c8384l);
                break;
            default:
                Uri uri = C8384l.mopub;
                c8384l.loadAd();
                break;
        }
    }
}
