package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: lّٞۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12751l extends Drawable.ConstantState {
    public final Drawable.ConstantState yandex;

    public C12751l(Drawable.ConstantState constantState) {
        this.yandex = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.yandex.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.yandex.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C9437l c9437l = new C9437l(null, 0);
        Drawable drawableNewDrawable = this.yandex.newDrawable();
        c9437l.f27961l = drawableNewDrawable;
        drawableNewDrawable.setCallback(c9437l.f19302l);
        return c9437l;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C9437l c9437l = new C9437l(null, 0);
        Drawable drawableNewDrawable = this.yandex.newDrawable(resources);
        c9437l.f27961l = drawableNewDrawable;
        drawableNewDrawable.setCallback(c9437l.f19302l);
        return c9437l;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C9437l c9437l = new C9437l(null, 0);
        Drawable drawableNewDrawable = this.yandex.newDrawable(resources, theme);
        c9437l.f27961l = drawableNewDrawable;
        drawableNewDrawable.setCallback(c9437l.f19302l);
        return c9437l;
    }
}
