package defpackage;

import android.animation.ObjectAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;

/* JADX INFO: renamed from: lٕٗؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15728l extends AbstractC3371l {

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public static final C14367l f30895l = new C14367l();

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final C10427l f30896l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public boolean f30897l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final C13855l f30898l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C13509l f30899l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final C15976l f30900l;

    public C15728l(Context context, C6361l c6361l, C13509l c13509l) {
        super(context, c6361l);
        this.f30897l = false;
        this.f30899l = c13509l;
        this.f30898l = new C13855l();
        C10427l c10427l = new C10427l();
        this.f30896l = c10427l;
        c10427l.yandex(1.0f);
        c10427l.loadAd(50.0f);
        C15976l c15976l = new C15976l(this);
        this.f30900l = c15976l;
        c15976l.remoteconfig = c10427l;
        if (this.f7179l != 1.0f) {
            this.f7179l = 1.0f;
            invalidateSelf();
        }
    }

    @Override // defpackage.AbstractC3371l
    public final boolean amazon(boolean z, boolean z2, boolean z3) {
        boolean zAmazon = super.amazon(z, z2, z3);
        C2442l c2442l = this.f7177l;
        ContentResolver contentResolver = this.f7181l.getContentResolver();
        c2442l.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f == 0.0f) {
            this.f30897l = true;
            return zAmazon;
        }
        this.f30897l = false;
        this.f30896l.loadAd(50.0f / f);
        return zAmazon;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            Rect bounds = getBounds();
            float fLoadAd = loadAd();
            ObjectAnimator objectAnimator = this.f7184l;
            boolean z = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.f7183l;
            this.f30899l.yandex(canvas, bounds, fLoadAd, z, objectAnimator2 != null && objectAnimator2.isRunning());
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.f7185l;
            paint.setStyle(style);
            paint.setAntiAlias(true);
            C6361l c6361l = this.f7180l;
            int i = c6361l.crashlytics[0];
            C13855l c13855l = this.f30898l;
            c13855l.crashlytics = i;
            int i2 = c6361l.mopub;
            if (i2 > 0) {
                int iLoadAd = (int) ((AbstractC12704l.loadAd(c13855l.loadAd, 0.0f, 0.01f) * i2) / 0.01f);
                float f = c13855l.loadAd;
                int i3 = c6361l.amazon;
                int i4 = this.f7182l;
                C13509l c13509l = this.f30899l;
                c13509l.getClass();
                c13509l.loadAd(canvas, paint, f, 1.0f, AbstractC6689l.amazon(i3, i4), iLoadAd, iLoadAd);
            } else {
                int i5 = c6361l.amazon;
                int i6 = this.f7182l;
                C13509l c13509l2 = this.f30899l;
                c13509l2.getClass();
                c13509l2.loadAd(canvas, paint, 0.0f, 1.0f, AbstractC6689l.amazon(i5, i6), 0, 0);
            }
            int i7 = this.f7182l;
            C13509l c13509l3 = this.f30899l;
            c13509l3.getClass();
            c13509l3.loadAd(canvas, paint, c13855l.yandex, c13855l.loadAd, AbstractC6689l.amazon(c13855l.crashlytics, i7), 0, 0);
            int i8 = c6361l.crashlytics[0];
            this.f30899l.getClass();
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f30899l.amazon();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f30899l.amazon();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f30900l.crashlytics();
        this.f30898l.loadAd = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean z = this.f30897l;
        C13855l c13855l = this.f30898l;
        C15976l c15976l = this.f30900l;
        if (z) {
            c15976l.crashlytics();
            c13855l.loadAd = i / 10000.0f;
            invalidateSelf();
        } else {
            c15976l.loadAd = c13855l.loadAd * 10000.0f;
            c15976l.crashlytics = true;
            float f = i;
            if (c15976l.billing) {
                c15976l.vip = f;
            } else {
                if (c15976l.remoteconfig == null) {
                    c15976l.remoteconfig = new C10427l(f);
                }
                c15976l.remoteconfig.subs = f;
                c15976l.amazon();
            }
        }
        return true;
    }
}
