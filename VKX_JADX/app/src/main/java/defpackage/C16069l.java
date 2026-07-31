package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.StateSet;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: lٕۦ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16069l extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public static final /* synthetic */ int f31473l = 0;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public C17451l f31474l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Drawable f31475l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public boolean f31477l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public AbstractC0377l f31478l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Rect f31479l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C17451l f31480l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public boolean f31481l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public long f31483l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public C17451l f31484l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Drawable f31486l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public C6618l f31487l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public RunnableC5360l f31488l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public boolean f31489l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public long f31490l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public boolean f31491l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f31485l = 255;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f31476l = -1;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public int f31482l = -1;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public int f31492l = -1;

    public C16069l(C17451l c17451l, Resources resources) {
        subs(new C17451l(c17451l, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public static C16069l crashlytics(Context context, Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
        int depth;
        int next;
        int next2;
        Context context2 = context;
        Resources resources2 = resources;
        String name = xmlResourceParser.getName();
        if (!name.equals("animated-selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid animated-selector tag " + name);
        }
        C16069l c16069l = new C16069l(null, null);
        TypedArray typedArraySignature = AbstractC10310l.Signature(resources2, theme, attributeSet, AbstractC15584l.yandex);
        int i = 1;
        c16069l.setVisible(typedArraySignature.getBoolean(1, true), true);
        C17451l c17451l = c16069l.f31484l;
        c17451l.amazon |= AbstractC17109l.loadAd(typedArraySignature);
        int i2 = 2;
        c17451l.subs = typedArraySignature.getBoolean(2, c17451l.subs);
        int i3 = 3;
        c17451l.smaato = typedArraySignature.getBoolean(3, c17451l.smaato);
        c17451l.advert = typedArraySignature.getInt(4, c17451l.advert);
        c17451l.isVip = typedArraySignature.getInt(5, c17451l.isVip);
        boolean z = false;
        c16069l.setDither(typedArraySignature.getBoolean(0, c17451l.pro));
        C17451l c17451l2 = c16069l.f31480l;
        if (resources2 != null) {
            c17451l2.loadAd = resources2;
            int i4 = resources2.getDisplayMetrics().densityDpi;
            if (i4 == 0) {
                i4 = 160;
            }
            int i5 = c17451l2.crashlytics;
            c17451l2.crashlytics = i4;
            if (i5 != i4) {
                c17451l2.remoteconfig = false;
                c17451l2.isPro = false;
            }
        } else {
            c17451l2.getClass();
        }
        typedArraySignature.recycle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next3 = xmlResourceParser.next();
            if (next3 == i || ((depth = xmlResourceParser.getDepth()) < depth2 && next3 == i3)) {
                break;
            }
            if (next3 == i2 && depth <= depth2) {
                if (xmlResourceParser.getName().equals("item")) {
                    TypedArray typedArraySignature2 = AbstractC10310l.Signature(resources2, theme, attributeSet, AbstractC15584l.loadAd);
                    int resourceId = typedArraySignature2.getResourceId(z ? 1 : 0, z ? 1 : 0);
                    int resourceId2 = typedArraySignature2.getResourceId(i, -1);
                    Drawable drawableBilling = resourceId2 > 0 ? C7521l.amazon().billing(context2, resourceId2) : null;
                    typedArraySignature2.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr = new int[attributeCount];
                    int i6 = z ? 1 : 0;
                    for (int i7 = i6 == true ? 1 : 0; i7 < attributeCount; i7++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i7);
                        if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                            int i8 = (i6 == true ? 1 : 0) + 1;
                            if (!attributeSet.getAttributeBooleanValue(i7, z)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr[i6 == true ? 1 : 0] = attributeNameResource;
                            i6 = i8;
                        }
                    }
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr, i6 == true ? 1 : 0);
                    if (drawableBilling == null) {
                        do {
                            next2 = xmlResourceParser.next();
                        } while (next2 == 4);
                        if (next2 != 2) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (xmlResourceParser.getName().equals("vector")) {
                            drawableBilling = new C5669l();
                            drawableBilling.inflate(resources2, xmlResourceParser, attributeSet, theme);
                        } else {
                            drawableBilling = AbstractC17109l.yandex(resources, xmlResourceParser, attributeSet, theme);
                        }
                    }
                    if (drawableBilling == null) {
                        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    C17451l c17451l3 = c16069l.f31484l;
                    int iYandex = c17451l3.yandex(drawableBilling);
                    c17451l3.f33999synchronized[iYandex] = iArrTrimStateSet;
                    c17451l3.f34001volatile.purchase(iYandex, Integer.valueOf(resourceId));
                } else {
                    if (xmlResourceParser.getName().equals("transition")) {
                        TypedArray typedArraySignature3 = AbstractC10310l.Signature(resources2, theme, attributeSet, AbstractC15584l.crashlytics);
                        int resourceId3 = typedArraySignature3.getResourceId(2, -1);
                        int resourceId4 = typedArraySignature3.getResourceId(1, -1);
                        int resourceId5 = typedArraySignature3.getResourceId(z ? 1 : 0, -1);
                        Drawable drawableBilling2 = resourceId5 > 0 ? C7521l.amazon().billing(context2, resourceId5) : null;
                        boolean z2 = typedArraySignature3.getBoolean(3, z);
                        typedArraySignature3.recycle();
                        if (drawableBilling2 == null) {
                            do {
                                next = xmlResourceParser.next();
                            } while (next == 4);
                            if (next != 2) {
                                throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                            }
                            if (xmlResourceParser.getName().equals("animated-vector")) {
                                drawableBilling2 = new C9437l(context2, z ? 1 : 0);
                                drawableBilling2.inflate(resources2, xmlResourceParser, attributeSet, theme);
                            } else {
                                drawableBilling2 = AbstractC17109l.yandex(resources, xmlResourceParser, attributeSet, theme);
                            }
                        }
                        if (drawableBilling2 == null) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (resourceId3 == -1 || resourceId4 == -1) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
                        }
                        C17451l c17451l4 = c16069l.f31484l;
                        int iYandex2 = c17451l4.yandex(drawableBilling2);
                        long j = resourceId3;
                        long j2 = resourceId4;
                        long j3 = (j << 32) | j2;
                        long j4 = z2 ? 8589934592L : 0L;
                        long j5 = iYandex2;
                        c17451l4.f33998strictfp.yandex(j3, Long.valueOf(j5 | j4));
                        if (z2) {
                            c17451l4.f33998strictfp.yandex((j2 << 32) | j, Long.valueOf(j5 | 4294967296L | j4));
                        }
                        context2 = context;
                        resources2 = resources;
                        i = 1;
                        z = false;
                    } else {
                        context2 = context;
                        resources2 = resources;
                    }
                    i2 = 2;
                    i3 = 3;
                }
                i = 1;
                i2 = 2;
                i3 = 3;
            }
        }
        c16069l.onStateChange(c16069l.getState());
        return c16069l;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    public final boolean admob(int i) {
        if (i == this.f31476l) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f31480l.isVip > 0) {
            Drawable drawable = this.f31486l;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f31475l;
            if (drawable2 != null) {
                this.f31486l = drawable2;
                this.f31490l = ((long) this.f31480l.isVip) + jUptimeMillis;
            } else {
                this.f31486l = null;
                this.f31490l = 0L;
            }
        } else {
            Drawable drawable3 = this.f31475l;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i >= 0) {
            C17451l c17451l = this.f31480l;
            if (i < c17451l.admob) {
                Drawable drawableAmazon = c17451l.amazon(i);
                this.f31475l = drawableAmazon;
                this.f31476l = i;
                if (drawableAmazon != null) {
                    int i2 = this.f31480l.advert;
                    if (i2 > 0) {
                        this.f31483l = jUptimeMillis + ((long) i2);
                    }
                    amazon(drawableAmazon);
                }
            } else {
                this.f31475l = null;
                this.f31476l = -1;
            }
        } else {
            this.f31475l = null;
            this.f31476l = -1;
        }
        if (this.f31483l != 0 || this.f31490l != 0) {
            RunnableC5360l runnableC5360l = this.f31488l;
            if (runnableC5360l == null) {
                this.f31488l = new RunnableC5360l(5, this);
            } else {
                unscheduleSelf(runnableC5360l);
            }
            yandex(true);
        }
        invalidateSelf();
        return true;
    }

    public final void amazon(Drawable drawable) {
        if (this.f31487l == null) {
            this.f31487l = new C6618l();
        }
        C6618l c6618l = this.f31487l;
        c6618l.f13855l = drawable.getCallback();
        drawable.setCallback(c6618l);
        try {
            if (this.f31480l.advert <= 0 && this.f31489l) {
                drawable.setAlpha(this.f31485l);
            }
            C17451l c17451l = this.f31480l;
            if (c17451l.applovin) {
                drawable.setColorFilter(c17451l.premium);
            } else {
                if (c17451l.f34000throws) {
                    drawable.setTintList(c17451l.appmetrica);
                }
                C17451l c17451l2 = this.f31480l;
                if (c17451l2.f33997package) {
                    drawable.setTintMode(c17451l2.inmobi);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f31480l.pro);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.f31480l.signatures);
            Rect rect = this.f31479l;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            C6618l c6618l2 = this.f31487l;
            Drawable.Callback callback = (Drawable.Callback) c6618l2.f13855l;
            c6618l2.f13855l = null;
            drawable.setCallback(callback);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        loadAd(theme);
        onStateChange(getState());
    }

    public final Drawable billing() {
        if (!this.f31477l && super.mutate() == this) {
            C17451l c17451l = new C17451l(this.f31484l, this, null);
            c17451l.f33998strictfp = c17451l.f33998strictfp.clone();
            c17451l.f34001volatile = c17451l.f34001volatile.clone();
            subs(c17451l);
            this.f31477l = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f31480l.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f31475l;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f31486l;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f31485l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return this.f31480l.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z;
        C17451l c17451l = this.f31480l;
        if (!c17451l.Signature) {
            c17451l.crashlytics();
            c17451l.Signature = true;
            int i = c17451l.admob;
            Drawable[] drawableArr = c17451l.mopub;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    c17451l.license = true;
                    z = true;
                    break;
                }
                if (drawableArr[i2].getConstantState() == null) {
                    c17451l.license = false;
                    z = false;
                    break;
                }
                i2++;
            }
        } else {
            z = c17451l.license;
        }
        if (!z) {
            return null;
        }
        this.f31480l.amazon = getChangingConfigurations();
        return this.f31480l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f31475l;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f31479l;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        C17451l c17451l = this.f31480l;
        if (c17451l.smaato) {
            if (!c17451l.remoteconfig) {
                c17451l.loadAd();
            }
            return c17451l.metrica;
        }
        Drawable drawable = this.f31475l;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        C17451l c17451l = this.f31480l;
        if (c17451l.smaato) {
            if (!c17451l.remoteconfig) {
                c17451l.loadAd();
            }
            return c17451l.vip;
        }
        Drawable drawable = this.f31475l;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        C17451l c17451l = this.f31480l;
        if (c17451l.smaato) {
            if (!c17451l.remoteconfig) {
                c17451l.loadAd();
            }
            return c17451l.adcel;
        }
        Drawable drawable = this.f31475l;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        C17451l c17451l = this.f31480l;
        if (c17451l.smaato) {
            if (!c17451l.remoteconfig) {
                c17451l.loadAd();
            }
            return c17451l.startapp;
        }
        Drawable drawable = this.f31475l;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f31475l;
        int opacity = -2;
        if (drawable != null && drawable.isVisible()) {
            C17451l c17451l = this.f31480l;
            if (c17451l.ads) {
                return c17451l.subscription;
            }
            c17451l.crashlytics();
            int i = c17451l.admob;
            Drawable[] drawableArr = c17451l.mopub;
            opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            c17451l.subscription = opacity;
            c17451l.ads = true;
        }
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f31475l;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        C17451l c17451l = this.f31480l;
        Rect rect2 = null;
        boolean padding = false;
        if (!c17451l.subs) {
            Rect rect3 = c17451l.firebase;
            if (rect3 != null || c17451l.isPro) {
                rect2 = rect3;
            } else {
                c17451l.crashlytics();
                Rect rect4 = new Rect();
                int i = c17451l.admob;
                Drawable[] drawableArr = c17451l.mopub;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i3 = rect4.left;
                        if (i3 > rect2.left) {
                            rect2.left = i3;
                        }
                        int i4 = rect4.top;
                        if (i4 > rect2.top) {
                            rect2.top = i4;
                        }
                        int i5 = rect4.right;
                        if (i5 > rect2.right) {
                            rect2.right = i5;
                        }
                        int i6 = rect4.bottom;
                        if (i6 > rect2.bottom) {
                            rect2.bottom = i6;
                        }
                    }
                }
                c17451l.isPro = true;
                c17451l.firebase = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                padding = true;
            }
        } else {
            Drawable drawable = this.f31475l;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f31480l.signatures && getLayoutDirection() == 1) {
            int i7 = rect.left;
            rect.left = rect.right;
            rect.right = i7;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        C17451l c17451l = this.f31480l;
        if (c17451l != null) {
            c17451l.ads = false;
            c17451l.tapsense = false;
        }
        if (drawable != this.f31475l || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f31480l.signatures;
    }

    public final boolean isPro(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f31486l;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f31475l;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        purchase();
        AbstractC0377l abstractC0377l = this.f31478l;
        if (abstractC0377l != null) {
            abstractC0377l.mopub();
            this.f31478l = null;
            admob(this.f31482l);
            this.f31482l = -1;
            this.f31492l = -1;
        }
    }

    public final void loadAd(Resources.Theme theme) {
        C17451l c17451l = this.f31480l;
        if (theme == null) {
            c17451l.getClass();
            return;
        }
        c17451l.crashlytics();
        int i = c17451l.admob;
        Drawable[] drawableArr = c17451l.mopub;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable != null && drawable.canApplyTheme()) {
                drawableArr[i2].applyTheme(theme);
                c17451l.purchase |= drawableArr[i2].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            c17451l.loadAd = resources;
            int i3 = resources.getDisplayMetrics().densityDpi;
            if (i3 == 0) {
                i3 = 160;
            }
            int i4 = c17451l.crashlytics;
            c17451l.crashlytics = i3;
            if (i4 != i3) {
                c17451l.remoteconfig = false;
                c17451l.isPro = false;
            }
        }
    }

    public final Drawable mopub() {
        if (!this.f31491l) {
            billing();
            C17451l c17451l = this.f31474l;
            c17451l.f33998strictfp = c17451l.f33998strictfp.clone();
            c17451l.f34001volatile = c17451l.f34001volatile.clone();
            this.f31491l = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f31481l) {
            mopub();
            C17451l c17451l = this.f31484l;
            c17451l.f33998strictfp = c17451l.f33998strictfp.clone();
            c17451l.f34001volatile = c17451l.f34001volatile.clone();
            this.f31481l = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f31486l;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f31475l;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        C17451l c17451l = this.f31480l;
        int i2 = this.f31476l;
        int i3 = c17451l.admob;
        Drawable[] drawableArr = c17451l.mopub;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                boolean layoutDirection = drawable.setLayoutDirection(i);
                if (i4 == i2) {
                    z = layoutDirection;
                }
            }
        }
        c17451l.ad = i;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f31486l;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f31475l;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d4  */
    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int i;
        AbstractC0377l c15441l;
        C17451l c17451l = this.f31484l;
        int iBilling = c17451l.billing(iArr);
        if (iBilling < 0) {
            iBilling = c17451l.billing(StateSet.WILD_CARD);
        }
        boolean z = false;
        if (iBilling != this.f31476l) {
            AbstractC0377l abstractC0377l = this.f31478l;
            if (abstractC0377l != null) {
                if (iBilling != this.f31482l) {
                    if (iBilling == this.f31492l && abstractC0377l.yandex()) {
                        abstractC0377l.purchase();
                        this.f31482l = this.f31492l;
                        this.f31492l = iBilling;
                    } else {
                        i = this.f31482l;
                        abstractC0377l.mopub();
                    }
                }
                z = true;
            } else {
                i = this.f31476l;
            }
            this.f31478l = null;
            this.f31492l = -1;
            this.f31482l = -1;
            C17451l c17451l2 = this.f31484l;
            int iPurchase = c17451l2.purchase(i);
            int iPurchase2 = c17451l2.purchase(iBilling);
            if (iPurchase2 != 0 && iPurchase != 0) {
                long j = ((long) iPurchase2) | (((long) iPurchase) << 32);
                int iLongValue = (int) ((Long) c17451l2.f33998strictfp.purchase(j)).longValue();
                if (iLongValue >= 0) {
                    boolean z2 = (((Long) c17451l2.f33998strictfp.purchase(j)).longValue() & 8589934592L) != 0;
                    admob(iLongValue);
                    Object obj = this.f31475l;
                    if (obj instanceof AnimationDrawable) {
                        c15441l = new C16642l((AnimationDrawable) obj, (((Long) c17451l2.f33998strictfp.purchase(j)).longValue() & 4294967296L) != 0, z2);
                    } else if (obj instanceof C9437l) {
                        c15441l = new C15441l((C9437l) obj, 1);
                    } else if (obj instanceof Animatable) {
                        c15441l = new C15441l((Animatable) obj, 0);
                    } else if (admob(iBilling)) {
                        z = true;
                    }
                    c15441l.billing();
                    this.f31478l = c15441l;
                    this.f31492l = i;
                    this.f31482l = iBilling;
                    z = true;
                } else if (admob(iBilling)) {
                    z = true;
                }
            } else if (admob(iBilling)) {
                z = true;
            }
        }
        Drawable drawable = this.f31475l;
        return drawable != null ? drawable.setState(iArr) | z : z;
    }

    public final void purchase() {
        boolean z;
        Drawable drawable = this.f31486l;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f31486l = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f31475l;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f31489l) {
                this.f31475l.setAlpha(this.f31485l);
            }
        }
        if (this.f31490l != 0) {
            this.f31490l = 0L;
            z = true;
        }
        if (this.f31483l != 0) {
            this.f31483l = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.f31475l || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f31489l && this.f31485l == i) {
            return;
        }
        this.f31489l = true;
        this.f31485l = i;
        Drawable drawable = this.f31475l;
        if (drawable != null) {
            if (this.f31483l == 0) {
                drawable.setAlpha(i);
            } else {
                yandex(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        C17451l c17451l = this.f31480l;
        if (c17451l.signatures != z) {
            c17451l.signatures = z;
            Drawable drawable = this.f31475l;
            if (drawable != null) {
                drawable.setAutoMirrored(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C17451l c17451l = this.f31480l;
        c17451l.applovin = true;
        if (c17451l.premium != colorFilter) {
            c17451l.premium = colorFilter;
            Drawable drawable = this.f31475l;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        C17451l c17451l = this.f31480l;
        if (c17451l.pro != z) {
            c17451l.pro = z;
            Drawable drawable = this.f31475l;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.f31475l;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f31479l;
        if (rect == null) {
            this.f31479l = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f31475l;
        if (drawable != null) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        C17451l c17451l = this.f31480l;
        c17451l.f34000throws = true;
        if (c17451l.appmetrica != colorStateList) {
            c17451l.appmetrica = colorStateList;
            this.f31475l.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        C17451l c17451l = this.f31480l;
        c17451l.f33997package = true;
        if (c17451l.inmobi != mode) {
            c17451l.inmobi = mode;
            this.f31475l.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean zIsPro = isPro(z, z2);
        AbstractC0377l abstractC0377l = this.f31478l;
        if (abstractC0377l != null && (zIsPro || z2)) {
            if (z) {
                abstractC0377l.billing();
                return zIsPro;
            }
            jumpToCurrentState();
        }
        return zIsPro;
    }

    public final void subs(C17451l c17451l) {
        this.f31480l = c17451l;
        int i = this.f31476l;
        if (i >= 0) {
            Drawable drawableAmazon = c17451l.amazon(i);
            this.f31475l = drawableAmazon;
            if (drawableAmazon != null) {
                amazon(drawableAmazon);
            }
        }
        this.f31486l = null;
        this.f31474l = c17451l;
        this.f31484l = c17451l;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f31475l || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    /* JADX WARN: Code duplicated, block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    public final void yandex(boolean z) {
        boolean z2;
        Drawable drawable;
        long j;
        boolean z3 = true;
        this.f31489l = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.f31475l;
        if (drawable2 != null) {
            long j2 = this.f31483l;
            if (j2 != 0) {
                if (j2 <= jUptimeMillis) {
                    drawable2.setAlpha(this.f31485l);
                    this.f31483l = 0L;
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j2 - jUptimeMillis) * 255)) / this.f31480l.advert)) * this.f31485l) / 255);
                    z2 = true;
                }
            }
            drawable = this.f31486l;
            if (drawable != null) {
                j = this.f31490l;
                if (j == 0) {
                    if (j <= jUptimeMillis) {
                        drawable.setVisible(false, false);
                        this.f31486l = null;
                        this.f31490l = 0L;
                    } else {
                        drawable.setAlpha(((((int) ((j - jUptimeMillis) * 255)) / this.f31480l.isVip) * this.f31485l) / 255);
                    }
                }
                if (z || !z3) {
                }
                scheduleSelf(this.f31488l, jUptimeMillis + 16);
                return;
            }
            this.f31490l = 0L;
            z3 = z2;
            if (z) {
            }
        }
        this.f31483l = 0L;
        z2 = false;
        drawable = this.f31486l;
        if (drawable != null) {
            j = this.f31490l;
            if (j == 0) {
                if (j <= jUptimeMillis) {
                    drawable.setVisible(false, false);
                    this.f31486l = null;
                    this.f31490l = 0L;
                } else {
                    drawable.setAlpha(((((int) ((j - jUptimeMillis) * 255)) / this.f31480l.isVip) * this.f31485l) / 255);
                }
            }
            if (z) {
            }
        }
        this.f31490l = 0L;
        z3 = z2;
        if (z) {
        }
    }
}
