package defpackage;

import android.view.View;

/* JADX INFO: renamed from: lؙۘ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC6704l implements View.OnClickListener {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C12375l f14056l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f14057l;

    public /* synthetic */ ViewOnClickListenerC6704l(C12375l c12375l, int i) {
        this.f14057l = i;
        this.f14056l = c12375l;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f14057l;
        int i2 = 28;
        C12375l c12375l = this.f14056l;
        switch (i) {
            case 0:
                new C10038l(view, new C3005l(c12375l, view, i2)).m2854l();
                break;
            default:
                c12375l.getClass();
                new C10038l(view, new C3005l(c12375l, view, i2)).m2854l();
                break;
        }
    }
}
