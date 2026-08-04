package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: lٍؓۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1745l extends Animation {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C12656l f4155l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f4156l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4157l;

    public C1745l(C12656l c12656l, int i, int i2) {
        this.f4155l = c12656l;
        this.f4157l = i;
        this.f4156l = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        C12709l c12709l = this.f4155l.f24912l;
        int i = this.f4157l;
        c12709l.setAlpha((int) (((this.f4156l - i) * f) + i));
    }
}
