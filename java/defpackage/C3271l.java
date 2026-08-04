package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* JADX INFO: renamed from: lًؕۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3271l extends Drawable {
    public final Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C3271l(int i, Object obj) {
        this.yandex = i;
        this.loadAd = obj;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                ActionBarContainer actionBarContainer = (ActionBarContainer) obj;
                if (actionBarContainer.f96l) {
                    Drawable drawable = actionBarContainer.f103l;
                    if (drawable != null) {
                        drawable.draw(canvas);
                    }
                    break;
                } else {
                    Drawable drawable2 = actionBarContainer.f101l;
                    if (drawable2 != null) {
                        drawable2.draw(canvas);
                    }
                    Drawable drawable3 = actionBarContainer.f100l;
                    if (drawable3 != null && actionBarContainer.f97l) {
                        drawable3.draw(canvas);
                        break;
                    }
                }
                break;
            default:
                ((InterfaceC1286l) obj).subs(canvas);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.yandex) {
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        switch (this.yandex) {
            case 0:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.loadAd;
                if (!actionBarContainer.f96l) {
                    Drawable drawable = actionBarContainer.f101l;
                    if (drawable != null) {
                        drawable.getOutline(outline);
                    }
                } else if (actionBarContainer.f103l != null) {
                    actionBarContainer.f101l.getOutline(outline);
                }
                break;
            default:
                super.getOutline(outline);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        int i2 = this.yandex;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        int i = this.yandex;
    }

    private final void amazon(ColorFilter colorFilter) {
    }

    private final void crashlytics(ColorFilter colorFilter) {
    }

    private final void loadAd(int i) {
    }

    private final void yandex(int i) {
    }
}
