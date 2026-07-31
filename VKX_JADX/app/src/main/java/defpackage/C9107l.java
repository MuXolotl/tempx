package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: lٌ۠ۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9107l extends C18309l {
    public final RectF adcel;

    public C9107l(C9107l c9107l) {
        super(c9107l);
        this.adcel = c9107l.adcel;
    }

    @Override // defpackage.C18309l, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C11354l c11354l = new C11354l(this);
        c11354l.f11408l = this;
        c11354l.invalidateSelf();
        return c11354l;
    }

    public C9107l(C12564l c12564l, RectF rectF) {
        super(c12564l);
        this.adcel = rectF;
    }
}
