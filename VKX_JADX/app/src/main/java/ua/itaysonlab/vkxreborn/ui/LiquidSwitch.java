package ua.itaysonlab.vkxreborn.ui;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.AbstractC13113l;
import defpackage.AbstractC1753l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class LiquidSwitch extends AbstractC13113l {
    public /* synthetic */ LiquidSwitch(Context context, AttributeSet attributeSet, int i, AbstractC1753l abstractC1753l) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        setAlpha(z ? 1.0f : 0.5f);
        super.setEnabled(z);
    }

    public LiquidSwitch(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public LiquidSwitch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
