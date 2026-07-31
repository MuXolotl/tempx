package com.google.android.material.theme;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import defpackage.AbstractC12953l;
import defpackage.AbstractC17463l;
import defpackage.AbstractC4548l;
import defpackage.AbstractC4927l;
import defpackage.AbstractC8960l;
import defpackage.C10637l;
import defpackage.C13798l;
import defpackage.C15664l;
import defpackage.C17850l;
import defpackage.C2282l;
import defpackage.C3667l;
import defpackage.C5367l;
import defpackage.C5997l;
import defpackage.C8347l;
import defpackage.C9189l;
import ua.itaysonlab.vkx.R;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class MaterialComponentsViewInflater extends C2282l {
    @Override // defpackage.C2282l
    public final C10637l amazon(Context context, AttributeSet attributeSet) {
        C3667l c3667l = new C3667l(AbstractC12953l.adcel(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = c3667l.getContext();
        TypedArray typedArraySubs = AbstractC8960l.subs(context2, attributeSet, AbstractC4548l.startapp, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArraySubs.hasValue(0)) {
            c3667l.setButtonTintList(AbstractC4927l.subs(context2, typedArraySubs, 0));
        }
        c3667l.f7729l = typedArraySubs.getBoolean(1, false);
        typedArraySubs.recycle();
        return c3667l;
    }

    @Override // defpackage.C2282l
    public final C13798l crashlytics(Context context, AttributeSet attributeSet) {
        return new C5997l(context, attributeSet);
    }

    @Override // defpackage.C2282l
    public final C8347l loadAd(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // defpackage.C2282l
    public final C9189l purchase(Context context, AttributeSet attributeSet) {
        C17850l c17850l = new C17850l(AbstractC12953l.adcel(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = c17850l.getContext();
        if (AbstractC17463l.admob(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC4548l.subscription;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int[] iArr2 = {1, 2};
            int iIsPro = -1;
            for (int i = 0; i < 2 && iIsPro < 0; i++) {
                iIsPro = AbstractC4927l.isPro(context2, typedArrayObtainStyledAttributes, iArr2[i], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iIsPro == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC4548l.ads);
                    Context context3 = c17850l.getContext();
                    int[] iArr3 = {1, 2};
                    int iIsPro2 = -1;
                    for (int i2 = 0; i2 < 2 && iIsPro2 < 0; i2++) {
                        iIsPro2 = AbstractC4927l.isPro(context3, typedArrayObtainStyledAttributes3, iArr3[i2], -1);
                    }
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iIsPro2 >= 0) {
                        c17850l.setLineHeight(iIsPro2);
                    }
                }
            }
        }
        return c17850l;
    }

    @Override // defpackage.C2282l
    public final C5367l yandex(Context context, AttributeSet attributeSet) {
        return new C15664l(context, attributeSet);
    }
}
