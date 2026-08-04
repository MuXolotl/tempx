package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: lؔؔۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2367l extends Drawable.ConstantState {
    public PorterDuff.Mode admob;
    public PorterDuff.Mode amazon;
    public Bitmap billing;
    public ColorStateList crashlytics;
    public boolean firebase;
    public boolean isPro;
    public C10652l loadAd;
    public ColorStateList mopub;
    public boolean purchase;
    public Paint smaato;
    public int subs;
    public int yandex;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.yandex;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C5669l(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C5669l(this);
    }
}
