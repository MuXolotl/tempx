package defpackage;

import android.os.Handler;
import android.view.View;

/* JADX INFO: renamed from: lُٕۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC11062l implements View.OnClickListener {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Handler f22266l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C10700l f22267l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f22268l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ DialogC0230l f22269l;

    public /* synthetic */ ViewOnClickListenerC11062l(C10700l c10700l, Handler handler, DialogC0230l dialogC0230l, int i) {
        this.f22268l = i;
        this.f22267l = c10700l;
        this.f22266l = handler;
        this.f22269l = dialogC0230l;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f22268l;
        DialogC0230l dialogC0230l = this.f22269l;
        Handler handler = this.f22266l;
        C10700l c10700l = this.f22267l;
        switch (i) {
            case 0:
                InterfaceC7042l interfaceC7042l = (InterfaceC7042l) c10700l.f21708l;
                if (interfaceC7042l != null) {
                    interfaceC7042l.ads(null);
                }
                handler.removeCallbacksAndMessages(null);
                dialogC0230l.dismiss();
                break;
            default:
                InterfaceC7042l interfaceC7042l2 = (InterfaceC7042l) c10700l.f21708l;
                if (interfaceC7042l2 != null) {
                    interfaceC7042l2.ads(null);
                }
                handler.removeCallbacksAndMessages(null);
                dialogC0230l.dismiss();
                break;
        }
    }
}
