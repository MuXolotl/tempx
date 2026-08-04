package defpackage;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* JADX INFO: renamed from: lؔۤٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3018l extends ContentFrameLayout {

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C14405l f6535l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3018l(LayoutInflaterFactory2C14405l layoutInflaterFactory2C14405l, C8288l c8288l) {
        super(c8288l);
        this.f6535l = layoutInflaterFactory2C14405l;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f6535l.pro(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                LayoutInflaterFactory2C14405l layoutInflaterFactory2C14405l = this.f6535l;
                layoutInflaterFactory2C14405l.Signature(layoutInflaterFactory2C14405l.applovin(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(AbstractC13273l.loadAd(getContext(), i));
    }
}
