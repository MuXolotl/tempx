package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: renamed from: lّۛۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12860l extends Drawable.ConstantState {
    public final Drawable.ConstantState yandex;

    public C12860l(Drawable.ConstantState constantState) {
        this.yandex = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.yandex.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.yandex.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C5669l c5669l = new C5669l();
        c5669l.f27961l = (VectorDrawable) this.yandex.newDrawable();
        return c5669l;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C5669l c5669l = new C5669l();
        c5669l.f27961l = (VectorDrawable) this.yandex.newDrawable(resources);
        return c5669l;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C5669l c5669l = new C5669l();
        c5669l.f27961l = (VectorDrawable) this.yandex.newDrawable(resources, theme);
        return c5669l;
    }
}
