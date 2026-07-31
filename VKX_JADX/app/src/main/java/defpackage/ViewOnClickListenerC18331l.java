package defpackage;

import android.view.View;

/* JADX INFO: renamed from: l٘ۥَ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC18331l implements View.OnClickListener {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C3497l f35838l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f35839l;

    public /* synthetic */ ViewOnClickListenerC18331l(C3497l c3497l, int i) {
        this.f35839l = i;
        this.f35838l = c3497l;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f35839l;
        C3497l c3497l = this.f35838l;
        switch (i) {
            case 0:
                c3497l.crashlytics.mo1143default();
                break;
            default:
                AbstractC2484l abstractC2484l = c3497l.crashlytics;
                AbstractC11519l abstractC11519l = abstractC2484l instanceof AbstractC11519l ? (AbstractC11519l) abstractC2484l : null;
                if (abstractC11519l != null) {
                    abstractC11519l.pro();
                }
                break;
        }
    }
}
