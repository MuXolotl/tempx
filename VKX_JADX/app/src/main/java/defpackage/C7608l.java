package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: renamed from: lؚۣۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C7608l extends DialogInterfaceOnCancelListenerC0435l {

    /* JADX INFO: renamed from: lؑۚؓ, reason: contains not printable characters */
    public AlertDialog f15651l;

    /* JADX INFO: renamed from: lّؔ۟, reason: contains not printable characters */
    public DialogInterface.OnCancelListener f15652l;

    /* JADX INFO: renamed from: lۣؕ٘, reason: contains not printable characters */
    public Dialog f15653l;

    @Override // defpackage.DialogInterfaceOnCancelListenerC0435l, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f15652l;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC0435l
    public final Dialog premium() {
        Dialog dialog = this.f15653l;
        if (dialog != null) {
            return dialog;
        }
        this.f1599l = false;
        if (this.f15651l == null) {
            C6239l c6239l = this.f8954l;
            AbstractActivityC16046l abstractActivityC16046l = c6239l == null ? null : c6239l.f13181l;
            AbstractC1051l.subs(abstractActivityC16046l);
            this.f15651l = new AlertDialog.Builder(abstractActivityC16046l).create();
        }
        return this.f15651l;
    }
}
