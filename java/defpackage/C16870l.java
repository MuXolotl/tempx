package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: renamed from: lٗؔؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16870l extends AbstractC6725l {
    public final C12906l billing;
    public boolean mopub = true;
    public final TextView purchase;

    public C16870l(TextView textView) {
        this.purchase = textView;
        this.billing = new C12906l(textView);
    }

    @Override // defpackage.AbstractC6725l
    public final boolean amazon() {
        return this.mopub;
    }

    @Override // defpackage.AbstractC6725l
    public final void billing(boolean z) {
        if (z) {
            TextView textView = this.purchase;
            textView.setTransformationMethod(isPro(textView.getTransformationMethod()));
        }
    }

    @Override // defpackage.AbstractC6725l
    public final InputFilter[] crashlytics(InputFilter[] inputFilterArr) {
        if (!this.mopub) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof C12906l) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            C12906l c12906l = this.billing;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c12906l;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == c12906l) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // defpackage.AbstractC6725l
    public final TransformationMethod isPro(TransformationMethod transformationMethod) {
        if (this.mopub) {
            return ((transformationMethod instanceof C5412l) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new C5412l(transformationMethod);
        }
        return transformationMethod instanceof C5412l ? ((C5412l) transformationMethod).f11603l : transformationMethod;
    }

    @Override // defpackage.AbstractC6725l
    public final void mopub(boolean z) {
        this.mopub = z;
        TextView textView = this.purchase;
        textView.setTransformationMethod(isPro(textView.getTransformationMethod()));
        textView.setFilters(crashlytics(textView.getFilters()));
    }
}
