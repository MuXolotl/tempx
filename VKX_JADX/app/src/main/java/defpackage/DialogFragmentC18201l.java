package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: renamed from: l٘ۛٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class DialogFragmentC18201l extends DialogFragment {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public AlertDialog f35646l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public DialogInterface.OnCancelListener f35647l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Dialog f35648l;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f35647l;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f35648l;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f35646l == null) {
            Activity activity = getActivity();
            AbstractC1051l.subs(activity);
            this.f35646l = new AlertDialog.Builder(activity).create();
        }
        return this.f35646l;
    }
}
