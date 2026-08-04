package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: lؗۧؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5294l extends C5022l {

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public static final /* synthetic */ int f11407l = 0;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public C9107l f11408l;

    @Override // defpackage.C5022l, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f11408l = new C9107l(this.f11408l);
        return this;
    }

    public final void startapp(float f, float f2, float f3, float f4) {
        RectF rectF = this.f11408l.adcel;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}
