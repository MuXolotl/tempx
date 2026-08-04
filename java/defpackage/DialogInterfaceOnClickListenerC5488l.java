package defpackage;

import android.content.DialogInterface;

/* JADX INFO: renamed from: lؘؘٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC5488l implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f11741l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f11742l;

    public /* synthetic */ DialogInterfaceOnClickListenerC5488l(int i, Object obj) {
        this.f11742l = i;
        this.f11741l = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f11742l;
        Object obj = this.f11741l;
        switch (i2) {
            case 0:
                C17398l c17398l = (C17398l) obj;
                dialogInterface.dismiss();
                AbstractC9033l.loadAd(c17398l, c17398l.isVip(), false, new C13901l(c17398l, null, 1));
                break;
            case 1:
                C17398l c17398l2 = (C17398l) obj;
                dialogInterface.dismiss();
                C17398l.m4321protected(c17398l2, new C4449l(c17398l2, 2));
                break;
            default:
                dialogInterface.dismiss();
                ((C5514l) obj).invoke();
                break;
        }
    }
}
