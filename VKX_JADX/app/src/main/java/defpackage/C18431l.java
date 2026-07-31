package defpackage;

import android.os.Handler;

/* JADX INFO: renamed from: lٛٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18431l extends AbstractC16682l implements InterfaceC0805l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Handler f35999l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f36000l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ DialogC0230l f36001l;

    /* JADX WARN: Illegal instructions before constructor call */
    public C18431l(Handler handler, DialogC0230l dialogC0230l, int i) {
        this.f36000l = i;
        switch (i) {
            case 1:
                C13772l c13772l = C13772l.f26879l;
                this.f35999l = handler;
                this.f36001l = dialogC0230l;
                super(c13772l);
                break;
            default:
                C13772l c13772l2 = C13772l.f26879l;
                this.f35999l = handler;
                this.f36001l = dialogC0230l;
                super(c13772l2);
                break;
        }
    }

    @Override // defpackage.InterfaceC0805l
    /* JADX INFO: renamed from: continue */
    public final void mo685continue(InterfaceC12932l interfaceC12932l, Throwable th) {
        int i = this.f36000l;
        DialogC0230l dialogC0230l = this.f36001l;
        Handler handler = this.f35999l;
        switch (i) {
            case 0:
                th.printStackTrace();
                handler.removeCallbacksAndMessages(null);
                dialogC0230l.dismiss();
                break;
            default:
                th.printStackTrace();
                handler.removeCallbacksAndMessages(null);
                dialogC0230l.dismiss();
                break;
        }
    }
}
