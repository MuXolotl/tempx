package defpackage;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: renamed from: lؙؒؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0834l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Toolbar f2481l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2482l;

    public /* synthetic */ RunnableC0834l(Toolbar toolbar, int i) {
        this.f2482l = i;
        this.f2481l = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2482l;
        Toolbar toolbar = this.f2481l;
        switch (i) {
            case 0:
                C6236l c6236l = toolbar.f240l;
                C17858l c17858l = c6236l == null ? null : c6236l.f13167l;
                if (c17858l != null) {
                    c17858l.collapseActionView();
                }
                break;
            default:
                toolbar.vip();
                break;
        }
    }
}
