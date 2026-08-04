package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lَٕۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10519l extends SeekBar {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C0755l f21411l;

    public C10519l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        AbstractC1035l.yandex(this, getContext());
        C0755l c0755l = new C0755l(this);
        this.f21411l = c0755l;
        c0755l.tapsense(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0755l c0755l = this.f21411l;
        C10519l c10519l = c0755l.f2272l;
        Drawable drawable = c0755l.f2275l;
        if (drawable != null && drawable.isStateful() && drawable.setState(c10519l.getDrawableState())) {
            c10519l.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f21411l.f2275l;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f21411l.premium(canvas);
    }
}
