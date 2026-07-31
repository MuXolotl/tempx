package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: renamed from: lٟ٘ۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC18223l implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0435l f35691l;

    public DialogInterfaceOnCancelListenerC18223l(DialogInterfaceOnCancelListenerC0435l dialogInterfaceOnCancelListenerC0435l) {
        this.f35691l = dialogInterfaceOnCancelListenerC0435l;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0435l dialogInterfaceOnCancelListenerC0435l = this.f35691l;
        Dialog dialog = dialogInterfaceOnCancelListenerC0435l.f1606l;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0435l.onCancel(dialog);
        }
    }
}
