package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: lؚّۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7527l extends Drawable.ConstantState {
    public final /* synthetic */ C0992l loadAd;
    public int yandex;

    public C7527l(C0992l c0992l) {
        this.loadAd = c0992l;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.yandex;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0992l c0992l = this.loadAd;
        C0992l c0992l2 = new C0992l(c0992l.f2722l.getColor(), c0992l.f2723l, c0992l.f2720l.getDuration(), c0992l.f2718l, c0992l.f2721l, c0992l.f2729l, c0992l.f2716l, c0992l.f2735l, c0992l.f2724l);
        int i = c0992l.f2714l;
        if (i == 0) {
            i = c0992l.f2728l;
        }
        c0992l2.purchase(i);
        c0992l2.f2726l = c0992l.f2726l;
        c0992l2.invalidateSelf();
        c0992l2.invalidateSelf();
        return c0992l2;
    }
}
