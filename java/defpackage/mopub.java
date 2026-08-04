package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class mopub implements InterfaceC9215l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Integer f36532l;

    @Override // defpackage.InterfaceC9215l
    public final boolean crashlytics() {
        return false;
    }

    @Override // defpackage.InterfaceC9215l
    public final void loadAd(C9967l c9967l, View view, int i, float f) {
        float f2 = 1.0f - f;
        if (view != null) {
            float fIntValue = yandex(view.getContext()).intValue();
            if (i == 2) {
                view.setTranslationX(fIntValue * f2);
                view.setAlpha(1.0f - f2);
            } else {
                view.setTranslationX((1.0f - f2) * (-fIntValue));
                view.setAlpha(f2);
            }
        }
    }

    public final Integer yandex(Context context) {
        if (this.f36532l == null) {
            this.f36532l = Integer.valueOf((int) TypedValue.applyDimension(1, 54.0f, context.getResources().getDisplayMetrics()));
        }
        return this.f36532l;
    }
}
