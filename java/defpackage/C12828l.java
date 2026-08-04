package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: lّۙ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12828l implements InterfaceC0285l {

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public static final C18593l f25222strictfp = new C18593l();
    public float Signature;
    public float ad;
    public float adcel;
    public int admob;
    public boolean ads;
    public long advert;
    public final C6535l amazon;
    public float applovin;
    public int appmetrica;
    public final Rect billing;
    public final C10383l crashlytics;
    public boolean firebase;
    public int inmobi;
    public long isPro;
    public long isVip;
    public float license;
    public final AbstractC3059l loadAd;
    public AbstractC8939l metrica;
    public Paint mopub;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public int f25223package;
    public float premium;
    public float pro;
    public final Resources purchase;
    public boolean remoteconfig;
    public float signatures;
    public boolean smaato;
    public int startapp;
    public int subs;
    public long subscription;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public C6312l f25224synchronized;
    public float tapsense;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public int f25225throws;
    public int vip;

    public C12828l(AbstractC3059l abstractC3059l) {
        C10383l c10383l = new C10383l();
        C13601l c13601l = new C13601l();
        this.loadAd = abstractC3059l;
        this.crashlytics = c10383l;
        C6535l c6535l = new C6535l(abstractC3059l, c10383l, c13601l);
        this.amazon = c6535l;
        this.purchase = abstractC3059l.getResources();
        this.billing = new Rect();
        abstractC3059l.addView(c6535l);
        c6535l.setClipBounds(null);
        this.isPro = 0L;
        View.generateViewId();
        this.vip = 3;
        this.startapp = 0;
        this.adcel = 1.0f;
        this.subscription = 9205357640488583168L;
        this.tapsense = 1.0f;
        this.Signature = 1.0f;
        long j = C9735l.loadAd;
        this.advert = j;
        this.isVip = j;
    }

    @Override // defpackage.InterfaceC0285l
    public final void Signature(float f) {
        this.adcel = f;
        this.amazon.setAlpha(f);
    }

    @Override // defpackage.InterfaceC0285l
    public final float ad() {
        return this.pro;
    }

    @Override // defpackage.InterfaceC0285l
    public final /* synthetic */ boolean adcel() {
        return true;
    }

    @Override // defpackage.InterfaceC0285l
    public final void admob(Outline outline, long j) {
        C6535l c6535l = this.amazon;
        c6535l.f13614l = outline;
        c6535l.invalidateOutline();
        if ((this.remoteconfig || c6535l.getClipToOutline()) && outline != null) {
            c6535l.setClipToOutline(true);
            if (this.remoteconfig) {
                this.remoteconfig = false;
                this.firebase = true;
            }
        }
        this.smaato = outline != null;
    }

    @Override // defpackage.InterfaceC0285l
    public final float ads() {
        return this.applovin;
    }

    @Override // defpackage.InterfaceC0285l
    public final long advert() {
        return this.isVip;
    }

    @Override // defpackage.InterfaceC0285l
    public final void amazon(float f) {
        this.ad = f;
        this.amazon.setElevation(f);
    }

    @Override // defpackage.InterfaceC0285l
    public final void applovin(C6312l c6312l) {
        this.f25224synchronized = c6312l;
        if (Build.VERSION.SDK_INT >= 31) {
            AbstractC12148l.m3362native(this.amazon, c6312l);
        }
    }

    @Override // defpackage.InterfaceC0285l
    public final float appmetrica() {
        return this.license;
    }

    @Override // defpackage.InterfaceC0285l
    public final void billing(float f) {
        this.applovin = f;
        this.amazon.setRotation(f);
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public final void m3507case() {
        boolean z = this.remoteconfig;
        C6535l c6535l = this.amazon;
        if (z || c6535l.getClipToOutline()) {
            this.firebase = true;
        }
        int i = this.admob;
        int i2 = i - this.appmetrica;
        int i3 = this.subs;
        int i4 = i3 - this.inmobi;
        long j = this.isPro;
        c6535l.layout(i2, i4, i + ((int) (j >> 32)) + this.f25225throws, i3 + ((int) (j & 4294967295L)) + this.f25223package);
    }

    @Override // defpackage.InterfaceC0285l
    /* JADX INFO: renamed from: catch */
    public final int mo393catch() {
        return this.vip;
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public final void m3508continue() {
        boolean z = this.ads;
        C6535l c6535l = this.amazon;
        if (z || C1187l.loadAd(this.subscription, 9205357640488583168L)) {
            c6535l.setPivotX((((int) (this.isPro >> 32)) / 2.0f) + this.appmetrica);
            c6535l.setPivotY((((int) (4294967295L & this.isPro)) / 2.0f) + this.inmobi);
        } else {
            c6535l.setPivotX(Float.intBitsToFloat((int) (this.subscription >> 32)) + this.appmetrica);
            c6535l.setPivotY(Float.intBitsToFloat((int) (4294967295L & this.subscription)) + this.inmobi);
        }
    }

    @Override // defpackage.InterfaceC0285l
    public final float crashlytics() {
        return this.tapsense;
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public final void m3509else(int i) {
        C6535l c6535l = this.amazon;
        boolean z = true;
        if (i == 1) {
            c6535l.setLayerType(2, this.mopub);
        } else {
            Paint paint = this.mopub;
            if (i == 2) {
                c6535l.setLayerType(0, paint);
                z = false;
            } else {
                c6535l.setLayerType(0, paint);
            }
        }
        c6535l.setCanUseCompositingLayer$ui_graphics(z);
    }

    @Override // defpackage.InterfaceC0285l
    /* JADX INFO: renamed from: extends */
    public final float mo394extends() {
        return this.ad;
    }

    @Override // defpackage.InterfaceC0285l
    public final void firebase(int i, long j, int i2) {
        if (!C4999l.loadAd(this.isPro, j)) {
            this.admob = i;
            this.subs = i2;
            this.isPro = j;
            m3507case();
            return;
        }
        int i3 = this.admob;
        C6535l c6535l = this.amazon;
        if (i3 != i) {
            c6535l.offsetLeftAndRight(i - i3);
        }
        int i4 = this.subs;
        if (i4 != i2) {
            c6535l.offsetTopAndBottom(i2 - i4);
        }
        this.admob = i;
        this.subs = i2;
    }

    @Override // defpackage.InterfaceC0285l
    /* JADX INFO: renamed from: for */
    public final float mo395for() {
        return this.Signature;
    }

    @Override // defpackage.InterfaceC0285l
    public final void inmobi(boolean z) {
        boolean z2 = false;
        this.remoteconfig = z && !this.smaato;
        this.firebase = true;
        if (z && this.smaato) {
            z2 = true;
        }
        this.amazon.setClipToOutline(z2);
    }

    @Override // defpackage.InterfaceC0285l
    public final void isPro() {
        this.loadAd.removeViewInLayout(this.amazon);
    }

    @Override // defpackage.InterfaceC0285l
    public final void isVip(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.advert = j;
            AbstractC13950l.m3812goto(this.amazon, AbstractC12953l.startapp(j));
        }
    }

    @Override // defpackage.InterfaceC0285l
    public final void license(AbstractC8939l abstractC8939l) {
        this.metrica = abstractC8939l;
        Paint paint = this.mopub;
        if (paint == null) {
            paint = new Paint();
            this.mopub = paint;
        }
        paint.setColorFilter(abstractC8939l != null ? abstractC8939l.yandex : null);
        m3510switch();
    }

    @Override // defpackage.InterfaceC0285l
    public final void loadAd(float f) {
        this.premium = f;
        this.amazon.setRotationY(f);
    }

    @Override // defpackage.InterfaceC0285l
    public final void metrica(float f) {
        this.Signature = f;
        this.amazon.setScaleY(f);
    }

    @Override // defpackage.InterfaceC0285l
    public final void mopub(float f) {
        this.pro = f;
        this.amazon.setTranslationY(f);
    }

    @Override // defpackage.InterfaceC0285l
    /* JADX INFO: renamed from: native */
    public final Matrix mo396native() {
        return this.amazon.getMatrix();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.InterfaceC0285l
    /* JADX INFO: renamed from: package */
    public final void mo397package(InterfaceC13490l interfaceC13490l, EnumC9931l enumC9931l, C11925l c11925l, C3006l c3006l) {
        C6535l c6535l = this.amazon;
        ViewParent parent = c6535l.getParent();
        AbstractC3059l abstractC3059l = this.loadAd;
        if (parent == null) {
            abstractC3059l.addView(c6535l);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.appmetrica)) << 32) | (((long) Float.floatToRawIntBits(this.inmobi)) & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
        c6535l.f13609l = interfaceC13490l;
        c6535l.f13610l = enumC9931l;
        c6535l.f13617l = c3006l;
        c6535l.f13613l = c11925l;
        c6535l.f13619l = fIntBitsToFloat;
        c6535l.f13616l = fIntBitsToFloat2;
        if (c6535l.isAttachedToWindow()) {
            c6535l.setVisibility(4);
            c6535l.setVisibility(0);
            try {
                C10383l c10383l = this.crashlytics;
                C18593l c18593l = f25222strictfp;
                C2151l c2151l = c10383l.yandex;
                Canvas canvas = c2151l.yandex;
                c2151l.yandex = c18593l;
                abstractC3059l.yandex(c2151l, c6535l, c6535l.getDrawingTime());
                c10383l.yandex.yandex = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // defpackage.InterfaceC0285l
    public final float premium() {
        return this.amazon.getCameraDistance() / this.purchase.getDisplayMetrics().densityDpi;
    }

    @Override // defpackage.InterfaceC0285l
    /* JADX INFO: renamed from: private */
    public final void mo398private(float f) {
        this.amazon.setCameraDistance(f * this.purchase.getDisplayMetrics().densityDpi);
    }

    @Override // defpackage.InterfaceC0285l
    public final void pro(int i, int i2, int i3, int i4) {
        if (!(i >= 0 && i2 >= 0 && i3 >= 0 && i4 >= 0)) {
            StringBuilder sbSubscription = AbstractC14814l.subscription(i, i2, "Outsets cannot be negative! Left: ", ", Top: ", ", Right: ");
            sbSubscription.append(i3);
            sbSubscription.append(", Bottom: ");
            sbSubscription.append(i4);
            AbstractC11597l.yandex(sbSubscription.toString());
        }
        int i5 = this.appmetrica;
        if (i == i5 && i2 == this.inmobi && i3 == this.f25225throws && i4 == this.f25223package) {
            return;
        }
        boolean z = (i == i5 && i2 == this.inmobi) ? false : true;
        this.appmetrica = i;
        this.inmobi = i2;
        this.f25225throws = i3;
        this.f25223package = i4;
        m3507case();
        if (z) {
            m3508continue();
        }
    }

    @Override // defpackage.InterfaceC0285l
    public final C6312l purchase() {
        return this.f25224synchronized;
    }

    @Override // defpackage.InterfaceC0285l
    public final int remoteconfig() {
        return this.startapp;
    }

    @Override // defpackage.InterfaceC0285l
    public final void signatures(float f) {
        this.tapsense = f;
        this.amazon.setScaleX(f);
    }

    @Override // defpackage.InterfaceC0285l
    public final void smaato(InterfaceC14859l interfaceC14859l) {
        Rect rect;
        boolean z = this.firebase;
        C6535l c6535l = this.amazon;
        if (z) {
            if ((this.remoteconfig || c6535l.getClipToOutline()) && !this.smaato) {
                rect = this.billing;
                rect.left = 0;
                rect.top = 0;
                rect.right = c6535l.getWidth();
                rect.bottom = c6535l.getHeight();
            } else {
                rect = null;
            }
            c6535l.setClipBounds(rect);
        }
        Canvas canvas = AbstractC10071l.yandex;
        if (((C2151l) interfaceC14859l).yandex.isHardwareAccelerated()) {
            this.loadAd.yandex(interfaceC14859l, c6535l, c6535l.getDrawingTime());
        }
    }

    @Override // defpackage.InterfaceC0285l
    public final float startapp() {
        return this.premium;
    }

    @Override // defpackage.InterfaceC0285l
    /* JADX INFO: renamed from: strictfp */
    public final void mo399strictfp(float f) {
        this.license = f;
        this.amazon.setTranslationX(f);
    }

    @Override // defpackage.InterfaceC0285l
    public final void subs(int i) {
        this.vip = i;
        Paint paint = this.mopub;
        if (paint == null) {
            paint = new Paint();
            this.mopub = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(AbstractC11880l.m3272class(i)));
        m3510switch();
    }

    @Override // defpackage.InterfaceC0285l
    public final void subscription(long j) {
        this.subscription = j;
        this.ads = (j & 9223372034707292159L) == 9205357640488583168L;
        m3508continue();
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final void m3510switch() {
        int i = this.startapp;
        if (i != 1 && this.vip == 3 && this.metrica == null) {
            m3509else(i);
        } else {
            m3509else(1);
        }
    }

    @Override // defpackage.InterfaceC0285l
    /* JADX INFO: renamed from: synchronized */
    public final void mo400synchronized(int i) {
        this.startapp = i;
        m3510switch();
    }

    @Override // defpackage.InterfaceC0285l
    public final long tapsense() {
        return this.advert;
    }

    @Override // defpackage.InterfaceC0285l
    /* JADX INFO: renamed from: throw */
    public final void mo401throw(float f) {
        this.signatures = f;
        this.amazon.setRotationX(f);
    }

    @Override // defpackage.InterfaceC0285l
    /* JADX INFO: renamed from: throws */
    public final float mo402throws() {
        return this.signatures;
    }

    @Override // defpackage.InterfaceC0285l
    public final AbstractC8939l vip() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC0285l
    /* JADX INFO: renamed from: volatile */
    public final void mo403volatile(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.isVip = j;
            AbstractC13950l.m3823super(this.amazon, AbstractC12953l.startapp(j));
        }
    }

    @Override // defpackage.InterfaceC0285l
    public final float yandex() {
        return this.adcel;
    }
}
