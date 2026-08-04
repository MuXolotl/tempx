package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: renamed from: lؙؚؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC4713l implements InterfaceC17192l, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public CharSequence f9571l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C4379l f9572l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public DialogInterfaceC13913l f9573l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C4313l f9574l;

    public DialogInterfaceOnClickListenerC4713l(C4313l c4313l) {
        this.f9574l = c4313l;
    }

    @Override // defpackage.InterfaceC17192l
    public final void adcel(ListAdapter listAdapter) {
        this.f9572l = (C4379l) listAdapter;
    }

    @Override // defpackage.InterfaceC17192l
    public final Drawable admob() {
        return null;
    }

    @Override // defpackage.InterfaceC17192l
    public final void amazon(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.InterfaceC17192l
    public final int crashlytics() {
        return 0;
    }

    @Override // defpackage.InterfaceC17192l
    public final void dismiss() {
        DialogInterfaceC13913l dialogInterfaceC13913l = this.f9573l;
        if (dialogInterfaceC13913l != null) {
            dialogInterfaceC13913l.dismiss();
            this.f9573l = null;
        }
    }

    @Override // defpackage.InterfaceC17192l
    public final void firebase(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.InterfaceC17192l
    public final boolean loadAd() {
        DialogInterfaceC13913l dialogInterfaceC13913l = this.f9573l;
        if (dialogInterfaceC13913l != null) {
            return dialogInterfaceC13913l.isShowing();
        }
        return false;
    }

    @Override // defpackage.InterfaceC17192l
    public final void metrica(int i, int i2) {
        if (this.f9572l == null) {
            return;
        }
        C4313l c4313l = this.f9574l;
        C14785l c14785l = new C14785l(c4313l.getPopupContext());
        C14225l c14225l = (C14225l) c14785l.f28907l;
        CharSequence charSequence = this.f9571l;
        if (charSequence != null) {
            c14225l.amazon = charSequence;
        }
        C4379l c4379l = this.f9572l;
        int selectedItemPosition = c4313l.getSelectedItemPosition();
        c14225l.vip = c4379l;
        c14225l.metrica = this;
        c14225l.ads = selectedItemPosition;
        c14225l.adcel = true;
        DialogInterfaceC13913l dialogInterfaceC13913lIsPro = c14785l.isPro();
        this.f9573l = dialogInterfaceC13913lIsPro;
        AlertController$RecycleListView alertController$RecycleListView = dialogInterfaceC13913lIsPro.f27211l.billing;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.f9573l.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C4313l c4313l = this.f9574l;
        c4313l.setSelection(i);
        if (c4313l.getOnItemClickListener() != null) {
            c4313l.performItemClick(null, i, this.f9572l.getItemId(i));
        }
        dismiss();
    }

    @Override // defpackage.InterfaceC17192l
    public final CharSequence purchase() {
        return this.f9571l;
    }

    @Override // defpackage.InterfaceC17192l
    public final void remoteconfig(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.InterfaceC17192l
    public final void smaato(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.InterfaceC17192l
    public final int startapp() {
        return 0;
    }

    @Override // defpackage.InterfaceC17192l
    public final void subs(CharSequence charSequence) {
        this.f9571l = charSequence;
    }
}
