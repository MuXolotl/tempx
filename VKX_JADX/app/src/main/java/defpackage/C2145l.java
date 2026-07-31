package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؚؓ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2145l extends AbstractC13799l {
    public EditText billing;
    public final ViewOnClickListenerC9657l mopub;
    public final int purchase;

    public C2145l(C12124l c12124l, int i) {
        super(c12124l);
        this.purchase = R.drawable.design_password_eye;
        this.mopub = new ViewOnClickListenerC9657l(6, this);
        if (i != 0) {
            this.purchase = i;
        }
    }

    @Override // defpackage.AbstractC13799l
    public final void adcel() {
        EditText editText = this.billing;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.billing.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // defpackage.AbstractC13799l
    public final void ads() {
        EditText editText = this.billing;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // defpackage.AbstractC13799l
    public final int amazon() {
        return this.purchase;
    }

    @Override // defpackage.AbstractC13799l
    public final View.OnClickListener billing() {
        return this.mopub;
    }

    @Override // defpackage.AbstractC13799l
    public final int crashlytics() {
        return R.string.password_toggle_content_description;
    }

    @Override // defpackage.AbstractC13799l
    public final boolean firebase() {
        EditText editText = this.billing;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // defpackage.AbstractC13799l
    public final boolean isPro() {
        return true;
    }

    @Override // defpackage.AbstractC13799l
    public final void loadAd() {
        startapp();
    }

    @Override // defpackage.AbstractC13799l
    public final void smaato(EditText editText) {
        this.billing = editText;
        startapp();
    }
}
