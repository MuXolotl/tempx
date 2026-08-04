package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٟؑٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0435l extends AbstractComponentCallbacksC4411l implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: lؑٔۦ, reason: contains not printable characters */
    public boolean f1594l;

    /* JADX INFO: renamed from: lؔؕؖ, reason: contains not printable characters */
    public final DialogInterfaceOnCancelListenerC18223l f1595l;

    /* JADX INFO: renamed from: lؚؕؒ, reason: contains not printable characters */
    public boolean f1596l;

    /* JADX INFO: renamed from: lؕۗؗ, reason: contains not printable characters */
    public int f1597l;

    /* JADX INFO: renamed from: lؘٟۛ, reason: contains not printable characters */
    public boolean f1598l;

    /* JADX INFO: renamed from: lؚۦؑ, reason: contains not printable characters */
    public boolean f1599l;

    /* JADX INFO: renamed from: lٍۥ۟, reason: contains not printable characters */
    public boolean f1600l;

    /* JADX INFO: renamed from: lِٟ, reason: contains not printable characters */
    public int f1601l;

    /* JADX INFO: renamed from: lًّۥ, reason: contains not printable characters */
    public final C1589l f1602l;

    /* JADX INFO: renamed from: lٌْؔ, reason: contains not printable characters */
    public boolean f1603l;

    /* JADX INFO: renamed from: lٕٖٙ, reason: contains not printable characters */
    public boolean f1604l;

    /* JADX INFO: renamed from: lٖ٘ۘ, reason: contains not printable characters */
    public final DialogInterfaceOnDismissListenerC9745l f1605l;

    /* JADX INFO: renamed from: lٌؚ٘, reason: contains not printable characters */
    public Dialog f1606l;

    /* JADX INFO: renamed from: l٘ٚؒ, reason: contains not printable characters */
    public int f1607l;

    public DialogInterfaceOnCancelListenerC0435l() {
        new RunnableC5360l(4, this);
        this.f1595l = new DialogInterfaceOnCancelListenerC18223l(this);
        this.f1605l = new DialogInterfaceOnDismissListenerC9745l(this);
        this.f1607l = 0;
        this.f1597l = 0;
        this.f1596l = true;
        this.f1599l = true;
        this.f1601l = -1;
        this.f1602l = new C1589l(this);
        this.f1603l = false;
    }

    @Override // defpackage.AbstractComponentCallbacksC4411l
    public final LayoutInflater Signature(Bundle bundle) {
        LayoutInflater layoutInflaterSignature = super.Signature(bundle);
        boolean z = this.f1599l;
        if (z && !this.f1598l) {
            if (z && !this.f1603l) {
                try {
                    this.f1598l = true;
                    Dialog dialogPremium = premium();
                    this.f1606l = dialogPremium;
                    AbstractActivityC16046l abstractActivityC16046l = null;
                    if (this.f1599l) {
                        int i = this.f1607l;
                        if (i == 1 || i == 2) {
                            dialogPremium.requestWindowFeature(1);
                        } else if (i == 3) {
                            Window window = dialogPremium.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                            dialogPremium.requestWindowFeature(1);
                        }
                        C6239l c6239l = this.f8954l;
                        if (c6239l != null) {
                            abstractActivityC16046l = c6239l.f13181l;
                        }
                        if (AbstractC2812l.advert(abstractActivityC16046l)) {
                            this.f1606l.setOwnerActivity(abstractActivityC16046l);
                        }
                        this.f1606l.setCancelable(this.f1596l);
                        this.f1606l.setOnCancelListener(this.f1595l);
                        this.f1606l.setOnDismissListener(this.f1605l);
                        this.f1603l = true;
                    } else {
                        this.f1606l = null;
                    }
                    this.f1598l = false;
                } catch (Throwable th) {
                    this.f1598l = false;
                    throw th;
                }
            }
            if (C13734l.m3727volatile(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f1606l;
            if (dialog != null) {
                return layoutInflaterSignature.cloneInContext(dialog.getContext());
            }
        } else if (C13734l.m3727volatile(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f1599l) {
                Log.d("FragmentManager", "mShowsDialog = false: ".concat(str));
                return layoutInflaterSignature;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: ".concat(str));
        }
        return layoutInflaterSignature;
    }

    @Override // defpackage.AbstractComponentCallbacksC4411l
    public final void ad() {
        this.f8968l = true;
        Dialog dialog = this.f1606l;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // defpackage.AbstractComponentCallbacksC4411l
    public final void adcel(Context context) {
        super.adcel(context);
        this.f8960l.purchase(this.f1602l);
        if (this.f1604l) {
            return;
        }
        this.f1600l = false;
    }

    @Override // defpackage.AbstractComponentCallbacksC4411l
    public final void ads(Bundle bundle) {
        Bundle bundle2;
        this.f8968l = true;
        Bundle bundle3 = this.f8964l;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.f8949l.m3731class(bundle2);
            C13734l c13734l = this.f8949l;
            c13734l.f26812synchronized = false;
            c13734l.f26811strictfp = false;
            c13734l.f26813throw.mopub = false;
            c13734l.Signature(1);
        }
        C13734l c13734l2 = this.f8949l;
        if (c13734l2.license < 1) {
            c13734l2.f26812synchronized = false;
            c13734l2.f26811strictfp = false;
            c13734l2.f26813throw.mopub = false;
            c13734l2.Signature(1);
        }
        new Handler();
        this.f1599l = this.f8970l == 0;
        if (bundle != null) {
            this.f1607l = bundle.getInt("android:style", 0);
            this.f1597l = bundle.getInt("android:theme", 0);
            this.f1596l = bundle.getBoolean("android:cancelable", true);
            this.f1599l = bundle.getBoolean("android:showsDialog", this.f1599l);
            this.f1601l = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // defpackage.AbstractComponentCallbacksC4411l
    public final void advert(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.advert(layoutInflater, viewGroup, bundle);
        if (this.f1606l == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1606l.onRestoreInstanceState(bundle2);
    }

    @Override // defpackage.AbstractComponentCallbacksC4411l
    public final AbstractC5473l amazon() {
        return new C11336l(this, new C11336l(this));
    }

    @Override // defpackage.AbstractComponentCallbacksC4411l
    public final void license(Bundle bundle) {
        Dialog dialog = this.f1606l;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.f1607l;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f1597l;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f1596l;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f1599l;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f1601l;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.f1594l) {
            return;
        }
        if (C13734l.m3727volatile(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f1600l) {
            return;
        }
        this.f1600l = true;
        this.f1604l = false;
        Dialog dialog = this.f1606l;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f1606l.dismiss();
        }
        this.f1594l = true;
        if (this.f1601l >= 0) {
            C13734l c13734lAdmob = admob();
            int i = this.f1601l;
            if (i < 0) {
                C8339l.metrica(AbstractC0653l.vip(i, "Bad id: "));
                return;
            } else {
                c13734lAdmob.advert(new C8306l(c13734lAdmob, i), true);
                this.f1601l = -1;
                return;
            }
        }
        C6821l c6821l = new C6821l(admob());
        c6821l.metrica = true;
        C13734l c13734l = this.f8955l;
        if (c13734l == null || c13734l == c6821l.adcel) {
            c6821l.loadAd(new C10937l(3, this));
            c6821l.purchase(true, true);
        } else {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
    }

    public Dialog premium() {
        if (C13734l.m3727volatile(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new DialogC0427l(isVip(), this.f1597l);
    }

    @Override // defpackage.AbstractComponentCallbacksC4411l
    public final void pro() {
        this.f8968l = true;
        Dialog dialog = this.f1606l;
        if (dialog != null) {
            this.f1594l = false;
            dialog.show();
            View decorView = this.f1606l.getWindow().getDecorView();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // defpackage.AbstractComponentCallbacksC4411l
    public final void subscription() {
        this.f8968l = true;
        Dialog dialog = this.f1606l;
        if (dialog != null) {
            this.f1594l = true;
            dialog.setOnDismissListener(null);
            this.f1606l.dismiss();
            if (!this.f1600l) {
                onDismiss(this.f1606l);
            }
            this.f1606l = null;
            this.f1603l = false;
        }
    }

    @Override // defpackage.AbstractComponentCallbacksC4411l
    public final void tapsense() {
        this.f8968l = true;
        if (!this.f1604l && !this.f1600l) {
            this.f1600l = true;
        }
        this.f8960l.admob(this.f1602l);
    }

    @Override // defpackage.AbstractComponentCallbacksC4411l
    public final void vip() {
        this.f8968l = true;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
