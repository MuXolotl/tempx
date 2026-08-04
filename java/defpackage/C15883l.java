package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: lٕۗۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15883l extends ArrayAdapter {
    public final /* synthetic */ C15664l crashlytics;
    public ColorStateList loadAd;
    public ColorStateList yandex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15883l(C15664l c15664l, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.crashlytics = c15664l;
        yandex();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            C15664l c15664l = this.crashlytics;
            Drawable rippleDrawable = null;
            if (c15664l.getText().toString().contentEquals(textView.getText()) && c15664l.f30621l != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(c15664l.f30621l);
                if (this.loadAd != null) {
                    colorDrawable.setTintList(this.yandex);
                    rippleDrawable = new RippleDrawable(this.loadAd, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }

    public final void yandex() {
        ColorStateList colorStateList;
        C15664l c15664l = this.crashlytics;
        ColorStateList colorStateList2 = c15664l.f30618l;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.loadAd = colorStateList;
        if (c15664l.f30621l != 0 && c15664l.f30618l != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{AbstractC14093l.mopub(c15664l.f30618l.getColorForState(iArr3, 0), c15664l.f30621l), AbstractC14093l.mopub(c15664l.f30618l.getColorForState(iArr2, 0), c15664l.f30621l), c15664l.f30621l});
        }
        this.yandex = colorStateList3;
    }
}
