package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;

/* JADX INFO: renamed from: lؙٝۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6618l implements Drawable.Callback {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f13855l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13856l;

    public /* synthetic */ C6618l(int i, Object obj) {
        this.f13856l = i;
        this.f13855l = obj;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f13856l) {
            case 0:
                ((C9437l) this.f13855l).invalidateSelf();
                break;
            case 1:
                break;
            default:
                C13466l c13466l = (C13466l) this.f13855l;
                C10086l c10086l = c13466l.f26404l;
                c10086l.setValue(Integer.valueOf(((Number) c10086l.getValue()).intValue() + 1));
                Drawable drawable2 = c13466l.f26407l;
                InterfaceC1220l interfaceC1220l = AbstractC7041l.yandex;
                c13466l.f26405l.setValue(new C14174l((drawable2.getIntrinsicWidth() < 0 || drawable2.getIntrinsicHeight() < 0) ? 9205357640488583168L : AbstractC8532l.yandex(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight())));
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.f13856l) {
            case 0:
                ((C9437l) this.f13855l).scheduleSelf(runnable, j);
                break;
            case 1:
                Drawable.Callback callback = (Drawable.Callback) this.f13855l;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j);
                }
                break;
            default:
                ((Handler) AbstractC7041l.yandex.getValue()).postAtTime(runnable, j);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f13856l) {
            case 0:
                ((C9437l) this.f13855l).unscheduleSelf(runnable);
                break;
            case 1:
                Drawable.Callback callback = (Drawable.Callback) this.f13855l;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                }
                break;
            default:
                ((Handler) AbstractC7041l.yandex.getValue()).removeCallbacks(runnable);
                break;
        }
    }

    private final void yandex(Drawable drawable) {
    }
}
