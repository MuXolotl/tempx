package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: lؘؕۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5437l implements InterfaceC6697l {
    public final /* synthetic */ int crashlytics;

    public /* synthetic */ C5437l(int i) {
        this.crashlytics = i;
    }

    @Override // defpackage.InterfaceC6697l
    public final void yandex(View view, int i) {
        switch (this.crashlytics) {
            case 0:
                if (view instanceof TextView) {
                    AbstractC11452l.amazon((TextView) view, ColorStateList.valueOf(i));
                }
                break;
            case 1:
                if (view instanceof ImageView) {
                    ((ImageView) view).setImageTintList(ColorStateList.valueOf(i));
                }
                break;
            case 2:
                if (view instanceof TextView) {
                    AbstractC11452l.amazon((TextView) view, ColorStateList.valueOf(i));
                }
                break;
            case 3:
            case 4:
                break;
            case 5:
                if (view instanceof MaterialButton) {
                    ((MaterialButton) view).setIconTint(ColorStateList.valueOf(i));
                }
                break;
            case 6:
                if (view instanceof TextInputLayout) {
                    ((TextInputLayout) view).setHintTextColor(ColorStateList.valueOf(i));
                }
                break;
            case 7:
                if (view != null) {
                    ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
                    if (view instanceof MaterialButton) {
                        ((MaterialButton) view).setStrokeColor(colorStateListValueOf);
                    } else if (view instanceof MaterialCardView) {
                        ((MaterialCardView) view).setStrokeColor(colorStateListValueOf);
                    }
                }
                break;
            case 8:
                if (view instanceof AbstractC2568l) {
                    ((AbstractC2568l) view).setCardBackgroundColor(i);
                }
                break;
            case 9:
                break;
            case 10:
                if (view instanceof TextInputLayout) {
                    ((TextInputLayout) view).setBoxBackgroundColor(i);
                }
                break;
            case 11:
                if (view instanceof MaterialButton) {
                    ((MaterialButton) view).setRippleColor(ColorStateList.valueOf(AbstractC14093l.subs(i, 100)));
                }
                break;
            default:
                if (view instanceof CompoundButton) {
                    ((CompoundButton) view).setButtonTintList(new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{R.attr.state_enabled}}, new int[]{i, i}));
                }
                break;
        }
    }

    private final void amazon(View view, int i) {
    }

    private final void crashlytics(View view, int i) {
    }

    private final void loadAd(View view, int i) {
    }
}
