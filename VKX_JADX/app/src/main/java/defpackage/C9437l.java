package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: lٍٍِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9437l extends AbstractC14278l implements Animatable {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final /* synthetic */ int f19297l = 0;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Context f19298l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C7538l f19301l = null;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public ArrayList f19300l = null;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C6618l f19302l = new C6618l(0, this);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C5525l f19299l = new C5525l();

    public C9437l(Context context, int i) {
        this.f19298l = context;
    }

    @Override // defpackage.AbstractC14278l, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f27961l;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f27961l;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f27961l;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C5525l c5525l = this.f19299l;
        c5525l.yandex.draw(canvas);
        if (c5525l.loadAd.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f27961l;
        return drawable != null ? drawable.getAlpha() : this.f19299l.yandex.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f27961l;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f19299l.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f27961l;
        return drawable != null ? drawable.getColorFilter() : this.f19299l.yandex.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f27961l == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C12751l(this.f27961l.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f27961l;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f19299l.yandex.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f27961l;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f19299l.yandex.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f27961l;
        return drawable != null ? drawable.getOpacity() : this.f19299l.yandex.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
        C5525l c5525l;
        Animator animatorAmazon;
        Drawable drawable = this.f27961l;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int i = 1;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            c5525l = this.f19299l;
            if (eventType == i || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                XmlResourceParser xmlResourceParser = null;
                if ("animated-vector".equals(name)) {
                    TypedArray typedArraySignature = AbstractC10310l.Signature(resources, theme, attributeSet, AbstractC14760l.purchase);
                    int resourceId = typedArraySignature.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C5669l c5669lYandex = C5669l.yandex(resources, resourceId, theme);
                        AbstractC5646l.metrica(c5669lYandex, "Failed to load drawable");
                        c5669lYandex.f12071l = false;
                        c5669lYandex.setCallback(this.f19302l);
                        C5669l c5669l = c5525l.yandex;
                        if (c5669l != null) {
                            c5669l.setCallback(null);
                        }
                        c5525l.yandex = c5669lYandex;
                    }
                    typedArraySignature.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, AbstractC14760l.billing);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(i, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f19298l;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            C8339l.smaato("Context can't be null when inflating animators");
                            return;
                        }
                        if (Build.VERSION.SDK_INT >= 24) {
                            animatorAmazon = AnimatorInflater.loadAnimator(context, resourceId2);
                        } else {
                            Resources resources2 = context.getResources();
                            Resources.Theme theme2 = context.getTheme();
                            try {
                                try {
                                    XmlResourceParser animation = resources2.getAnimation(resourceId2);
                                    try {
                                        animatorAmazon = AbstractC14775l.amazon(context, resources2, theme2, animation, Xml.asAttributeSet(animation), null, 0);
                                        animation.close();
                                    } catch (IOException e) {
                                        e = e;
                                        Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                        notFoundException.initCause(e);
                                        throw notFoundException;
                                    } catch (XmlPullParserException e2) {
                                        e = e2;
                                        Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                        notFoundException2.initCause(e);
                                        throw notFoundException2;
                                    } catch (Throwable th) {
                                        th = th;
                                        xmlResourceParser = animation;
                                        if (xmlResourceParser != null) {
                                            xmlResourceParser.close();
                                        }
                                        throw th;
                                    }
                                } catch (IOException e3) {
                                    e = e3;
                                } catch (XmlPullParserException e4) {
                                    e = e4;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        animatorAmazon.setTarget(c5525l.yandex.f12067l.loadAd.metrica.get(string));
                        if (c5525l.crashlytics == null) {
                            c5525l.crashlytics = new ArrayList();
                            c5525l.amazon = new C11154l(0);
                        }
                        c5525l.crashlytics.add(animatorAmazon);
                        c5525l.amazon.put(animatorAmazon, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
            i = 1;
        }
        if (c5525l.loadAd == null) {
            c5525l.loadAd = new AnimatorSet();
        }
        c5525l.loadAd.playTogether(c5525l.crashlytics);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f27961l;
        return drawable != null ? drawable.isAutoMirrored() : this.f19299l.yandex.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f27961l;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f19299l.loadAd.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f27961l;
        return drawable != null ? drawable.isStateful() : this.f19299l.yandex.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f27961l;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f27961l;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f19299l.yandex.setBounds(rect);
        }
    }

    @Override // defpackage.AbstractC14278l, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f27961l;
        return drawable != null ? drawable.setLevel(i) : this.f19299l.yandex.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f27961l;
        return drawable != null ? drawable.setState(iArr) : this.f19299l.yandex.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f27961l;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f19299l.yandex.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f27961l;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f19299l.yandex.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f27961l;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f19299l.yandex.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f27961l;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            this.f19299l.yandex.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f27961l;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f19299l.yandex.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f27961l;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f19299l.yandex.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f27961l;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f19299l.yandex.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f27961l;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C5525l c5525l = this.f19299l;
        if (c5525l.loadAd.isStarted()) {
            return;
        }
        c5525l.loadAd.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f27961l;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f19299l.loadAd.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws Throwable {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
