package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lُۜۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11353l extends AppCompatImageView implements InterfaceC8072l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C0791l f22898l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11353l(C0791l c0791l, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f22898l = c0791l;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AbstractC10000l.advert(this, getContentDescription());
        setOnTouchListener(new C10694l(this, this));
    }

    @Override // defpackage.InterfaceC8072l
    public final boolean crashlytics() {
        return false;
    }

    @Override // defpackage.InterfaceC8072l
    public final boolean loadAd() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f22898l.smaato();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
