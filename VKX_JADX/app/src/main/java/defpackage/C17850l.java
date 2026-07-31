package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lُ٘ۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17850l extends C9189l {
    @Override // defpackage.C9189l, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (AbstractC17463l.admob(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, AbstractC4548l.ads);
            Context context2 = getContext();
            int[] iArr = {1, 2};
            int iIsPro = -1;
            for (int i2 = 0; i2 < 2 && iIsPro < 0; i2++) {
                iIsPro = AbstractC4927l.isPro(context2, typedArrayObtainStyledAttributes, iArr[i2], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iIsPro >= 0) {
                setLineHeight(iIsPro);
            }
        }
    }
}
