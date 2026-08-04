package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;

/* JADX INFO: renamed from: lؙؖۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6260l extends AbstractC3371l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public C2777l f13218l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public C13509l f13219l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public C5669l f13220l;

    @Override // defpackage.AbstractC3371l
    public final boolean amazon(boolean z, boolean z2, boolean z3) {
        ObjectAnimator objectAnimator;
        C5669l c5669l;
        boolean zAmazon = super.amazon(z, z2, z3);
        if (this.f7177l != null && Settings.Global.getFloat(this.f7181l.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f && (c5669l = this.f13220l) != null) {
            return c5669l.setVisible(z, z2);
        }
        if (!isRunning() && (objectAnimator = this.f13218l.crashlytics) != null) {
            objectAnimator.cancel();
        }
        if (z && z3) {
            this.f13218l.yandex();
        }
        return zAmazon;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        C5669l c5669l;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            C2442l c2442l = this.f7177l;
            int i2 = 0;
            C6361l c6361l = this.f7180l;
            if (c2442l != null && Settings.Global.getFloat(this.f7181l.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f && (c5669l = this.f13220l) != null) {
                c5669l.setBounds(getBounds());
                this.f13220l.setTint(c6361l.crashlytics[0]);
                this.f13220l.draw(canvas);
                return;
            }
            canvas.save();
            C13509l c13509l = this.f13219l;
            Rect bounds = getBounds();
            float fLoadAd = loadAd();
            ObjectAnimator objectAnimator = this.f7184l;
            boolean z = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.f7183l;
            c13509l.yandex(canvas, bounds, fLoadAd, z, objectAnimator2 != null && objectAnimator2.isRunning());
            int i3 = c6361l.mopub;
            int i4 = this.f7182l;
            Paint paint = this.f7185l;
            if (i3 == 0) {
                C13509l c13509l2 = this.f13219l;
                int i5 = c6361l.amazon;
                c13509l2.getClass();
                c13509l2.loadAd(canvas, paint, 0.0f, 1.0f, AbstractC6689l.amazon(i5, i4), 0, 0);
            } else {
                C13855l c13855l = (C13855l) this.f13218l.loadAd.get(0);
                C13855l c13855l2 = (C13855l) AbstractC14814l.firebase(1, this.f13218l.loadAd);
                C13509l c13509l3 = this.f13219l;
                float f = c13855l2.loadAd;
                float f2 = c13855l.yandex + 1.0f;
                int i6 = c6361l.amazon;
                c13509l3.getClass();
                c13509l3.loadAd(canvas, paint, f, f2, AbstractC6689l.amazon(i6, 0), i3, i3);
                i4 = 0;
            }
            while (i2 < this.f13218l.loadAd.size()) {
                C13855l c13855l3 = (C13855l) this.f13218l.loadAd.get(i2);
                C13509l c13509l4 = this.f13219l;
                int i7 = this.f7182l;
                c13509l4.getClass();
                c13509l4.loadAd(canvas, paint, c13855l3.yandex, c13855l3.loadAd, AbstractC6689l.amazon(c13855l3.crashlytics, i7), 0, 0);
                if (i2 <= 0 || i3 <= 0) {
                    i = i3;
                } else {
                    C13855l c13855l4 = (C13855l) this.f13218l.loadAd.get(i2 - 1);
                    C13509l c13509l5 = this.f13219l;
                    float f3 = c13855l4.loadAd;
                    float f4 = c13855l3.yandex;
                    int i8 = c6361l.amazon;
                    c13509l5.getClass();
                    i = i3;
                    c13509l5.loadAd(canvas, paint, f3, f4, AbstractC6689l.amazon(i8, i4), i, i3);
                }
                i2++;
                i3 = i;
            }
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f13219l.amazon();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f13219l.amazon();
    }
}
