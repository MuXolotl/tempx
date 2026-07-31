package defpackage;

import android.content.Context;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: lُِٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16320l extends EdgeEffect {
    public float loadAd;
    public final float yandex;

    public C16320l(Context context) {
        super(context);
        this.yandex = AbstractC5998l.yandex(context).f17430l * 1.0f;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        this.loadAd = 0.0f;
        super.onAbsorb(i);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        this.loadAd = 0.0f;
        super.onPull(f, f2);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.loadAd = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        this.loadAd = 0.0f;
        super.onPull(f);
    }
}
