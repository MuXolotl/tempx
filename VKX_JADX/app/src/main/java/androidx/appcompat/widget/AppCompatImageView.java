package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import defpackage.AbstractC1035l;
import defpackage.AbstractC13273l;
import defpackage.AbstractC2341l;
import defpackage.AbstractC3542l;
import defpackage.C1080l;
import defpackage.C1298l;
import defpackage.C13698l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageView extends ImageView {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f166l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C13698l f167l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C1080l f168l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC3542l.yandex(context);
        this.f166l = false;
        AbstractC1035l.yandex(this, getContext());
        C1080l c1080l = new C1080l(this);
        this.f168l = c1080l;
        c1080l.isVip(attributeSet, i);
        C13698l c13698l = new C13698l(this);
        this.f167l = c13698l;
        c13698l.m3672extends(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1080l c1080l = this.f168l;
        if (c1080l != null) {
            c1080l.purchase();
        }
        C13698l c13698l = this.f167l;
        if (c13698l != null) {
            c13698l.smaato();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1080l c1080l = this.f168l;
        if (c1080l != null) {
            return c1080l.pro();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1080l c1080l = this.f168l;
        if (c1080l != null) {
            return c1080l.advert();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C1298l c1298l;
        C13698l c13698l = this.f167l;
        if (c13698l == null || (c1298l = (C1298l) c13698l.f26746l) == null) {
            return null;
        }
        return (ColorStateList) c1298l.f3346l;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C1298l c1298l;
        C13698l c13698l = this.f167l;
        if (c13698l == null || (c1298l = (C1298l) c13698l.f26746l) == null) {
            return null;
        }
        return (PorterDuff.Mode) c1298l.f3349l;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f167l.f26743l).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1080l c1080l = this.f168l;
        if (c1080l != null) {
            c1080l.signatures();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1080l c1080l = this.f168l;
        if (c1080l != null) {
            c1080l.premium(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C13698l c13698l = this.f167l;
        if (c13698l != null) {
            c13698l.smaato();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C13698l c13698l = this.f167l;
        if (c13698l != null && drawable != null && !this.f166l) {
            c13698l.f26744l = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c13698l != null) {
            c13698l.smaato();
            if (this.f166l) {
                return;
            }
            ImageView imageView = (ImageView) c13698l.f26743l;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c13698l.f26744l);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f166l = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C13698l c13698l = this.f167l;
        if (c13698l != null) {
            ImageView imageView = (ImageView) c13698l.f26743l;
            if (i != 0) {
                Drawable drawableLoadAd = AbstractC13273l.loadAd(imageView.getContext(), i);
                if (drawableLoadAd != null) {
                    AbstractC2341l.yandex(drawableLoadAd);
                }
                imageView.setImageDrawable(drawableLoadAd);
            } else {
                imageView.setImageDrawable(null);
            }
            c13698l.smaato();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C13698l c13698l = this.f167l;
        if (c13698l != null) {
            c13698l.smaato();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1080l c1080l = this.f168l;
        if (c1080l != null) {
            c1080l.m791else(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1080l c1080l = this.f168l;
        if (c1080l != null) {
            c1080l.m786case(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C13698l c13698l = this.f167l;
        if (c13698l != null) {
            if (((C1298l) c13698l.f26746l) == null) {
                c13698l.f26746l = new C1298l();
            }
            C1298l c1298l = (C1298l) c13698l.f26746l;
            c1298l.f3346l = colorStateList;
            c1298l.f3347l = true;
            c13698l.smaato();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C13698l c13698l = this.f167l;
        if (c13698l != null) {
            if (((C1298l) c13698l.f26746l) == null) {
                c13698l.f26746l = new C1298l();
            }
            C1298l c1298l = (C1298l) c13698l.f26746l;
            c1298l.f3349l = mode;
            c1298l.f3348l = true;
            c13698l.smaato();
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context) {
        this(context, null);
    }
}
