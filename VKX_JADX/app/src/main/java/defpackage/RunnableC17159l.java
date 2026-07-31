package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lؚٖٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC17159l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C3148l f33339l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33340l;

    public RunnableC17159l(C3148l c3148l, int i) {
        this.f33340l = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(c3148l);
                this.f33339l = c3148l;
                break;
            default:
                Objects.requireNonNull(c3148l);
                this.f33339l = c3148l;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f33340l;
        C3148l c3148l = this.f33339l;
        switch (i) {
            case 0:
                c3148l.f6771l = c3148l.f6772l;
                break;
            default:
                c3148l.f6772l = null;
                break;
        }
    }
}
