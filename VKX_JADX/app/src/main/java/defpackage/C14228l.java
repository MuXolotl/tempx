package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: renamed from: lٜٓٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14228l extends AbstractC5287l {
    public final /* synthetic */ View crashlytics;
    public final /* synthetic */ int loadAd;

    public /* synthetic */ C14228l(View view, int i) {
        this.loadAd = i;
        this.crashlytics = view;
    }

    @Override // defpackage.AbstractC5287l
    public void loadAd(Drawable drawable) {
        switch (this.loadAd) {
            case 2:
                C5997l c5997l = (C5997l) this.crashlytics;
                ColorStateList colorStateList = c5997l.f12740l;
                if (colorStateList != null) {
                    drawable.setTint(colorStateList.getColorForState(c5997l.f12737l, colorStateList.getDefaultColor()));
                }
                break;
        }
    }

    @Override // defpackage.AbstractC5287l
    public final void yandex(Drawable drawable) {
        int i = this.loadAd;
        View view = this.crashlytics;
        switch (i) {
            case 0:
                AbstractC8412l abstractC8412l = (AbstractC8412l) view;
                abstractC8412l.setIndeterminate(false);
                abstractC8412l.yandex(abstractC8412l.f17411l, abstractC8412l.f17408l);
                break;
            case 1:
                AbstractC8412l abstractC8412l2 = (AbstractC8412l) view;
                if (!abstractC8412l2.f17409l) {
                    abstractC8412l2.setVisibility(abstractC8412l2.f17410l);
                }
                break;
            default:
                ColorStateList colorStateList = ((C5997l) view).f12740l;
                if (colorStateList != null) {
                    drawable.setTintList(colorStateList);
                }
                break;
        }
    }
}
