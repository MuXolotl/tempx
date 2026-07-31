package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.Window;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٍؕؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9312l extends C14785l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Rect f19123l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C5022l f19124l;

    /* JADX WARN: Illegal instructions before constructor call */
    public C9312l(Context context) {
        TypedValue typedValueMopub = AbstractC17463l.mopub(context, R.attr.materialAlertDialogTheme);
        int i = typedValueMopub == null ? 0 : typedValueMopub.data;
        Context contextAdcel = AbstractC12953l.adcel(context, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        super(i != 0 ? new C8288l(contextAdcel, i) : contextAdcel, R.style.V2_Dialog2);
        ContextThemeWrapper contextThemeWrapper = ((C14225l) this.f28907l).yandex;
        Resources.Theme theme = contextThemeWrapper.getTheme();
        AbstractC8960l.amazon(contextThemeWrapper, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int[] iArr = AbstractC4548l.firebase;
        AbstractC8960l.purchase(contextThemeWrapper, null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_bottom));
        typedArrayObtainStyledAttributes.recycle();
        if (contextThemeWrapper.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        this.f19123l = new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
        String canonicalName = C9312l.class.getCanonicalName();
        TypedValue typedValueMopub2 = AbstractC17463l.mopub(contextThemeWrapper, R.attr.colorSurface);
        if (typedValueMopub2 == null) {
            C18073l.adcel("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{canonicalName, contextThemeWrapper.getResources().getResourceName(R.attr.colorSurface)});
            throw null;
        }
        int i2 = typedValueMopub2.resourceId;
        int color = i2 != 0 ? contextThemeWrapper.getColor(i2) : typedValueMopub2.data;
        TypedArray typedArrayObtainStyledAttributes2 = contextThemeWrapper.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int color2 = typedArrayObtainStyledAttributes2.getColor(4, color);
        typedArrayObtainStyledAttributes2.recycle();
        C5022l c5022l = new C5022l(contextThemeWrapper, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        c5022l.mopub(contextThemeWrapper);
        c5022l.isPro(ColorStateList.valueOf(color2));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(((C14225l) this.f28907l).yandex.getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                C4968l c4968lPurchase = c5022l.f10262l.yandex.purchase();
                c4968lPurchase.purchase = new C16304l(dimension);
                c4968lPurchase.billing = new C16304l(dimension);
                c4968lPurchase.mopub = new C16304l(dimension);
                c4968lPurchase.admob = new C16304l(dimension);
                c5022l.setShapeAppearanceModel(c4968lPurchase.yandex());
            }
        }
        this.f19124l = c5022l;
    }

    public final void applovin(int i, DialogInterface.OnClickListener onClickListener) {
        C14225l c14225l = (C14225l) this.f28907l;
        c14225l.subs = c14225l.yandex.getText(i);
        c14225l.isPro = onClickListener;
    }

    public final void appmetrica(int i, DialogInterface.OnClickListener onClickListener) {
        C14225l c14225l = (C14225l) this.f28907l;
        c14225l.mopub = c14225l.yandex.getText(i);
        c14225l.admob = onClickListener;
    }

    @Override // defpackage.C14785l
    public final DialogInterfaceC13913l isPro() {
        DialogInterfaceC13913l dialogInterfaceC13913lIsPro = super.isPro();
        Window window = dialogInterfaceC13913lIsPro.getWindow();
        View decorView = window.getDecorView();
        C5022l c5022l = this.f19124l;
        if (c5022l != null) {
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            c5022l.subs(decorView.getElevation());
        }
        Rect rect = this.f19123l;
        window.setBackgroundDrawable(new InsetDrawable((Drawable) c5022l, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new ViewOnTouchListenerC8073l(dialogInterfaceC13913lIsPro, rect));
        return dialogInterfaceC13913lIsPro;
    }
}
