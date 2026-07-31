package defpackage;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* JADX INFO: renamed from: lؚِٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13999l extends AbstractC6725l {
    public final C16870l purchase;

    public C13999l(TextView textView) {
        this.purchase = new C16870l(textView);
    }

    @Override // defpackage.AbstractC6725l
    public final boolean amazon() {
        return this.purchase.mopub;
    }

    @Override // defpackage.AbstractC6725l
    public final void billing(boolean z) {
        if (C12304l.amazon()) {
            this.purchase.billing(z);
        }
    }

    @Override // defpackage.AbstractC6725l
    public final InputFilter[] crashlytics(InputFilter[] inputFilterArr) {
        return !C12304l.amazon() ? inputFilterArr : this.purchase.crashlytics(inputFilterArr);
    }

    @Override // defpackage.AbstractC6725l
    public final TransformationMethod isPro(TransformationMethod transformationMethod) {
        return !C12304l.amazon() ? transformationMethod : this.purchase.isPro(transformationMethod);
    }

    @Override // defpackage.AbstractC6725l
    public final void mopub(boolean z) {
        boolean zAmazon = C12304l.amazon();
        C16870l c16870l = this.purchase;
        if (zAmazon) {
            c16870l.mopub(z);
        } else {
            c16870l.mopub = z;
        }
    }
}
