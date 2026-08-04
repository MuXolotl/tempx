package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Movie;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;

/* JADX INFO: renamed from: lٟؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2803l extends Drawable implements Animatable {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public float f6099l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f6100l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public boolean f6102l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Canvas f6103l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public long f6104l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Bitmap.Config f6105l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Movie f6106l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public long f6110l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public float f6113l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public Bitmap f6114l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public boolean f6117l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public Picture f6118l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Paint f6112l = new Paint(3);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final ArrayList f6111l = new ArrayList();

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final Rect f6115l = new Rect();

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final Rect f6101l = new Rect();

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public float f6109l = 1.0f;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public float f6116l = 1.0f;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public int f6108l = -1;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public int f6107l = 1;

    public C2803l(Movie movie, Bitmap.Config config, int i) {
        this.f6106l = movie;
        this.f6105l = config;
        this.f6100l = i;
        if (AbstractC5941l.m1911throws(config)) {
            C8339l.metrica("Bitmap config must not be hardware.");
            throw null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        Movie movie = this.f6106l;
        int iDuration = movie.duration();
        if (iDuration == 0) {
            iDuration = 0;
            z = false;
        } else {
            if (this.f6117l) {
                this.f6104l = SystemClock.uptimeMillis();
            }
            int i = (int) (this.f6104l - this.f6110l);
            int i2 = i / iDuration;
            int i3 = this.f6108l;
            z = i3 == -1 || i2 <= i3;
            if (z) {
                iDuration = i - (i2 * iDuration);
            }
        }
        movie.setTime(iDuration);
        if (this.f6102l) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            Rect rect = this.f6101l;
            rect.set(0, 0, width, height);
            loadAd(rect);
            int iSave = canvas.save();
            try {
                float f = 1.0f / this.f6109l;
                canvas.scale(f, f);
                yandex(canvas);
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave);
                throw th;
            }
        } else {
            loadAd(getBounds());
            yandex(canvas);
        }
        if (this.f6117l && z) {
            invalidateSelf();
        } else {
            stop();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f6106l.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f6106l.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (this.f6112l.getAlpha() != 255) {
            return -3;
        }
        int i = this.f6107l;
        if (i != 3) {
            return (i == 1 && this.f6106l.isOpaque()) ? -1 : -3;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f6117l;
    }

    public final void loadAd(Rect rect) {
        Rect rect2 = this.f6115l;
        if (AbstractC8576l.yandex(rect2, rect)) {
            return;
        }
        rect2.set(rect);
        int iWidth = rect.width();
        int iHeight = rect.height();
        Movie movie = this.f6106l;
        int iWidth2 = movie.width();
        int iHeight2 = movie.height();
        if (iWidth2 <= 0 || iHeight2 <= 0) {
            return;
        }
        C9192l c9192l = C9192l.crashlytics;
        double dAmazon = AbstractC3105l.amazon(iWidth2, iHeight2, iWidth, iHeight, this.f6100l, c9192l);
        if (!this.f6102l && dAmazon > 1.0d) {
            dAmazon = 1.0d;
        }
        float f = (float) dAmazon;
        this.f6109l = f;
        int i = (int) (iWidth2 * f);
        int i2 = (int) (f * iHeight2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, this.f6105l);
        Bitmap bitmap = this.f6114l;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f6114l = bitmapCreateBitmap;
        this.f6103l = new Canvas(bitmapCreateBitmap);
        if (this.f6102l) {
            this.f6116l = 1.0f;
            this.f6113l = 0.0f;
            this.f6099l = 0.0f;
        } else {
            float fAmazon = (float) AbstractC3105l.amazon(i, i2, iWidth, iHeight, this.f6100l, c9192l);
            this.f6116l = fAmazon;
            this.f6113l = ((iWidth - (i * fAmazon)) / 2.0f) + rect.left;
            this.f6099l = ((iHeight - (fAmazon * i2)) / 2.0f) + rect.top;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i < 0 || i >= 256) {
            C10754l.metrica(AbstractC0653l.vip(i, "Invalid alpha: "));
        } else {
            this.f6112l.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f6112l.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.f6117l) {
            return;
        }
        this.f6117l = true;
        this.f6110l = SystemClock.uptimeMillis();
        ArrayList arrayList = this.f6111l;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC5287l) arrayList.get(i)).loadAd(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.f6117l) {
            this.f6117l = false;
            ArrayList arrayList = this.f6111l;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC5287l) arrayList.get(i)).yandex(this);
            }
        }
    }

    public final void yandex(Canvas canvas) {
        Paint paint = this.f6112l;
        Canvas canvas2 = this.f6103l;
        Bitmap bitmap = this.f6114l;
        if (canvas2 == null || bitmap == null) {
            return;
        }
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        int iSave = canvas2.save();
        try {
            float f = this.f6109l;
            canvas2.scale(f, f);
            this.f6106l.draw(canvas2, 0.0f, 0.0f, paint);
            Picture picture = this.f6118l;
            if (picture != null) {
                picture.draw(canvas2);
            }
            canvas2.restoreToCount(iSave);
            int iSave2 = canvas.save();
            try {
                canvas.translate(this.f6113l, this.f6099l);
                float f2 = this.f6116l;
                canvas.scale(f2, f2);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            } finally {
                canvas.restoreToCount(iSave2);
            }
        } catch (Throwable th) {
            canvas2.restoreToCount(iSave);
            throw th;
        }
    }
}
