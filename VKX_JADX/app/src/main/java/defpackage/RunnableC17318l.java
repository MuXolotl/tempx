package defpackage;

import android.os.SystemClock;

/* JADX INFO: renamed from: lٟٗۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC17318l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC8412l f33624l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33625l;

    public /* synthetic */ RunnableC17318l(AbstractC8412l abstractC8412l, int i) {
        this.f33625l = i;
        this.f33624l = abstractC8412l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f33625l;
        AbstractC8412l abstractC8412l = this.f33624l;
        switch (i) {
            case 0:
                if (abstractC8412l.f17414l > 0) {
                    SystemClock.uptimeMillis();
                }
                abstractC8412l.setVisibility(0);
                break;
            default:
                ((AbstractC3371l) abstractC8412l.getCurrentDrawable()).crashlytics(false, false, true);
                if (abstractC8412l.getProgressDrawable() == null || !abstractC8412l.getProgressDrawable().isVisible()) {
                    if (abstractC8412l.getIndeterminateDrawable() == null || !abstractC8412l.getIndeterminateDrawable().isVisible()) {
                        abstractC8412l.setVisibility(4);
                    }
                }
                break;
        }
    }
}
