package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;

/* JADX INFO: renamed from: lؓۛ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2119l extends Surface {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static boolean f4754l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static int f4755l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f4756l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final HandlerThreadC18641l f4757l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final boolean f4758l;

    public C2119l(HandlerThreadC18641l handlerThreadC18641l, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f4757l = handlerThreadC18641l;
        this.f4758l = z;
    }

    public static synchronized boolean loadAd(Context context) {
        try {
            if (!f4754l) {
                f4755l = yandex(context);
                f4754l = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f4755l != 0;
    }

    public static int yandex(Context context) {
        try {
            int i = Build.VERSION.SDK_INT;
            if ((i >= 24 && (i >= 26 || !("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) && (i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance"))) ? AbstractC15235l.amazon("EGL_EXT_protected_content") : false) {
                return AbstractC15235l.amazon("EGL_KHR_surfaceless_context") ? 1 : 2;
            }
            return 0;
        } catch (C9373l e) {
            AbstractC6427l.admob("PlaceholderSurface", "Failed to determine secure mode due to GL error: " + e.getMessage());
            return 0;
        }
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f4757l) {
            try {
                if (!this.f4756l) {
                    HandlerThreadC18641l handlerThreadC18641l = this.f4757l;
                    handlerThreadC18641l.f36428l.getClass();
                    handlerThreadC18641l.f36428l.sendEmptyMessage(2);
                    this.f4756l = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
