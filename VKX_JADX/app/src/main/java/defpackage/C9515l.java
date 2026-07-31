package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: lٍْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9515l implements InterfaceC0285l {

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public static final AtomicBoolean f19400native = new AtomicBoolean(true);
    public long Signature;
    public float ad;
    public float adcel;
    public boolean admob;
    public float ads;
    public float advert;
    public final RenderNode amazon;
    public int applovin;
    public int appmetrica;
    public Paint billing;
    public final C13601l crashlytics;
    public int firebase;
    public int inmobi;
    public int isPro;
    public float isVip;
    public long license;
    public final C10383l loadAd;
    public long metrica;
    public Matrix mopub;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public boolean f19401package;
    public int premium;
    public float pro;
    public long purchase;
    public float remoteconfig;
    public boolean signatures;
    public AbstractC8939l smaato;
    public float startapp;

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public int f19402strictfp;
    public long subs;
    public float subscription;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public int f19403synchronized;
    public float tapsense;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public boolean f19404throws;
    public boolean vip;

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public C6312l f19405volatile;

    public C9515l(ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l, C10383l c10383l, C13601l c13601l) {
        this.loadAd = c10383l;
        this.crashlytics = c13601l;
        RenderNode renderNodeCreate = RenderNode.create("Compose", viewTreeObserverOnGlobalLayoutListenerC13840l);
        this.amazon = renderNodeCreate;
        this.purchase = 0L;
        this.subs = 0L;
        if (f19400native.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                AbstractC2198l.crashlytics(renderNodeCreate, AbstractC2198l.yandex(renderNodeCreate));
                AbstractC2198l.amazon(renderNodeCreate, AbstractC2198l.loadAd(renderNodeCreate));
            }
            if (i >= 24) {
                AbstractC10274l.yandex(renderNodeCreate);
            } else {
                AbstractC10881l.yandex(renderNodeCreate);
            }
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        m2671case(0);
        this.isPro = 0;
        this.firebase = 3;
        this.remoteconfig = 1.0f;
        this.metrica = 9205357640488583168L;
        this.startapp = 1.0f;
        this.adcel = 1.0f;
        long j = C9735l.loadAd;
        this.Signature = j;
        this.license = j;
        this.isVip = 8.0f;
    }

    @Override // defpackage.InterfaceC0285l
    public final void Signature(float f) {
        this.remoteconfig = f;
        this.amazon.setAlpha(f);
    }

    @Override // defpackage.InterfaceC0285l
    public final float ad() {
        return this.subscription;
    }

    @Override // defpackage.InterfaceC0285l
    public final boolean adcel() {
        return this.amazon.isValid();
    }

    @Override // defpackage.InterfaceC0285l
    public final void admob(Outline outline, long j) {
        this.subs = j;
        this.amazon.setOutline(outline);
        this.admob = outline != null;
        m2674else();
    }

    @Override // defpackage.InterfaceC0285l
    public final float ads() {
        return this.advert;
    }

    @Override // defpackage.InterfaceC0285l
    public final long advert() {
        return this.license;
    }

    @Override // defpackage.InterfaceC0285l
    public final void amazon(float f) {
        this.tapsense = f;
        this.amazon.setElevation(f);
    }

    @Override // defpackage.InterfaceC0285l
    public final void applovin(C6312l c6312l) {
        this.f19405volatile = c6312l;
    }

    @Override // defpackage.InterfaceC0285l
    public final float appmetrica() {
        return this.ads;
    }

    @Override // defpackage.InterfaceC0285l
    public final void billing(float f) {
        this.advert = f;
        this.amazon.setRotation(f);
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public final void m2671case(int i) {
        RenderNode renderNode = this.amazon;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.billing);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.billing);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.billing);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // defpackage.InterfaceC0285l
    /* JADX INFO: renamed from: catch */
    public final int mo393catch() {
        return this.firebase;
    }

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public final void m2672class() {
        RenderNode renderNode = this.amazon;
        int i = this.f19403synchronized;
        int i2 = i - this.premium;
        int i3 = this.f19402strictfp;
        int i4 = i3 - this.applovin;
        long j = this.purchase;
        renderNode.setLeftTopRightBottom(i2, i4, i + ((int) (j >> 32)) + this.appmetrica, i3 + ((int) (j & 4294967295L)) + this.inmobi);
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public final void m2673continue() {
        long j = this.metrica;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.vip = true;
            this.amazon.setPivotX((((int) (this.purchase >> 32)) / 2.0f) + this.premium);
            this.amazon.setPivotY((((int) (4294967295L & this.purchase)) / 2.0f) + this.applovin);
        } else {
            this.vip = false;
            this.amazon.setPivotX(Float.intBitsToFloat((int) (j >> 32)) + this.premium);
            this.amazon.setPivotY(Float.intBitsToFloat((int) (this.metrica & 4294967295L)) + this.applovin);
        }
    }

    @Override // defpackage.InterfaceC0285l
    public final float crashlytics() {
        return this.startapp;
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public final void m2674else() {
        boolean z = this.signatures;
        boolean z2 = false;
        boolean z3 = z && !this.admob;
        if (z && this.admob) {
            z2 = true;
        }
        if (z3 != this.f19404throws) {
            this.f19404throws = z3;
            this.amazon.setClipToBounds(z3);
        }
        if (z2 != this.f19401package) {
            this.f19401package = z2;
            this.amazon.setClipToOutline(z2);
        }
    }

    @Override // defpackage.InterfaceC0285l
    /* JADX INFO: renamed from: extends */
    public final float mo394extends() {
        return this.tapsense;
    }

    @Override // defpackage.InterfaceC0285l
    public final void firebase(int i, long j, int i2) {
        this.f19403synchronized = i;
        this.f19402strictfp = i2;
        boolean zLoadAd = C4999l.loadAd(this.purchase, j);
        this.purchase = j;
        m2672class();
        if (zLoadAd) {
            return;
        }
        if (this.vip || C1187l.loadAd(this.metrica, 9205357640488583168L)) {
            this.amazon.setPivotX((((int) (j >> 32)) / 2.0f) + this.premium);
            this.amazon.setPivotY((((int) (j & 4294967295L)) / 2.0f) + this.applovin);
        }
    }

    @Override // defpackage.InterfaceC0285l
    /* JADX INFO: renamed from: for */
    public final float mo395for() {
        return this.adcel;
    }

    @Override // defpackage.InterfaceC0285l
    public final void inmobi(boolean z) {
        this.signatures = z;
        m2674else();
    }

    @Override // defpackage.InterfaceC0285l
    public final void isPro() {
        int i = Build.VERSION.SDK_INT;
        RenderNode renderNode = this.amazon;
        if (i >= 24) {
            AbstractC10274l.yandex(renderNode);
        } else {
            AbstractC10881l.yandex(renderNode);
        }
    }

    @Override // defpackage.InterfaceC0285l
    public final void isVip(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.Signature = j;
            AbstractC2198l.crashlytics(this.amazon, AbstractC12953l.startapp(j));
        }
    }

    @Override // defpackage.InterfaceC0285l
    public final void license(AbstractC8939l abstractC8939l) {
        this.smaato = abstractC8939l;
        if (abstractC8939l == null) {
            m2675switch();
            return;
        }
        m2671case(1);
        RenderNode renderNode = this.amazon;
        Paint paint = this.billing;
        if (paint == null) {
            paint = new Paint();
            this.billing = paint;
        }
        paint.setColorFilter(abstractC8939l.yandex);
        renderNode.setLayerPaint(paint);
    }

    @Override // defpackage.InterfaceC0285l
    public final void loadAd(float f) {
        this.ad = f;
        this.amazon.setRotationY(f);
    }

    @Override // defpackage.InterfaceC0285l
    public final void metrica(float f) {
        this.adcel = f;
        this.amazon.setScaleY(f);
    }

    @Override // defpackage.InterfaceC0285l
    public final void mopub(float f) {
        this.subscription = f;
        this.amazon.setTranslationY(f);
    }

    @Override // defpackage.InterfaceC0285l
    /* JADX INFO: renamed from: native */
    public final Matrix mo396native() {
        Matrix matrix = this.mopub;
        if (matrix == null) {
            matrix = new Matrix();
            this.mopub = matrix;
        }
        this.amazon.getMatrix(matrix);
        return matrix;
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
    public final void mo397package(InterfaceC13490l interfaceC13490l, EnumC9931l enumC9931l, C11925l c11925l, C3006l c3006l) throws Throwable {
        DisplayListCanvas displayListCanvas;
        int i;
        int i2;
        InterfaceC13490l interfaceC13490lM4560volatile;
        EnumC9931l enumC9931lM4548native;
        InterfaceC14859l interfaceC14859lM4555synchronized;
        long jM4551private;
        C11925l c11925l2;
        C13601l c13601l = this.crashlytics;
        C18449l c18449l = c13601l.f26629l;
        DisplayListCanvas displayListCanvasStart = this.amazon.start(Math.max(((int) (this.purchase >> 32)) + this.premium + this.appmetrica, (int) (this.subs >> 32)), Math.max(((int) (this.purchase & 4294967295L)) + this.applovin + this.inmobi, (int) (this.subs & 4294967295L)));
        float f = this.premium;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.applovin)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        try {
            C2151l c2151l = this.loadAd.yandex;
            Canvas canvas = c2151l.yandex;
            c2151l.yandex = (Canvas) displayListCanvasStart;
            try {
                try {
                    if (this.premium <= 0.0f) {
                        try {
                            if (this.applovin <= 0.0f) {
                                long jMopub = AbstractC14707l.mopub(this.purchase);
                                InterfaceC13490l interfaceC13490lM4560volatile2 = c18449l.m4560volatile();
                                EnumC9931l enumC9931lM4548native2 = c18449l.m4548native();
                                InterfaceC14859l interfaceC14859lM4555synchronized2 = c18449l.m4555synchronized();
                                canvas = canvas;
                                long jM4551private2 = c18449l.m4551private();
                                displayListCanvasStart = displayListCanvasStart;
                                C11925l c11925l3 = (C11925l) c18449l.f36009l;
                                c18449l.m4554super(interfaceC13490l);
                                c18449l.m4545import(enumC9931l);
                                c18449l.m4544goto(c2151l);
                                c18449l.m4534abstract(jMopub);
                                c18449l.f36009l = c11925l;
                                c2151l.mopub();
                                try {
                                    c3006l.invoke(c13601l);
                                    c2151l.ads();
                                    c18449l.m4554super(interfaceC13490lM4560volatile2);
                                    c18449l.m4545import(enumC9931lM4548native2);
                                    c18449l.m4544goto(interfaceC14859lM4555synchronized2);
                                    c18449l.m4534abstract(jM4551private2);
                                    c18449l.f36009l = c11925l3;
                                } catch (Throwable th) {
                                    c2151l.ads();
                                    c18449l.m4554super(interfaceC13490lM4560volatile2);
                                    c18449l.m4545import(enumC9931lM4548native2);
                                    c18449l.m4544goto(interfaceC14859lM4555synchronized2);
                                    c18449l.m4534abstract(jM4551private2);
                                    c18449l.f36009l = c11925l3;
                                    throw th;
                                }
                            }
                            c2151l.yandex = canvas;
                            this.amazon.end(displayListCanvasStart);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            displayListCanvasStart = displayListCanvasStart;
                            displayListCanvas = displayListCanvasStart;
                            this.amazon.end(displayListCanvas);
                            throw th;
                        }
                    }
                    c3006l.invoke(c13601l);
                    c2151l.ads();
                    c18449l.m4554super(interfaceC13490lM4560volatile);
                    c18449l.m4545import(enumC9931lM4548native);
                    c18449l.m4544goto(interfaceC14859lM4555synchronized);
                    c18449l.m4534abstract(jM4551private);
                    c18449l.f36009l = c11925l2;
                    c2151l.startapp(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
                    c2151l.yandex = canvas;
                    this.amazon.end(displayListCanvasStart);
                    return;
                } catch (Throwable th3) {
                    displayListCanvas = displayListCanvasStart;
                    try {
                        c2151l.ads();
                        c18449l.m4554super(interfaceC13490lM4560volatile);
                        c18449l.m4545import(enumC9931lM4548native);
                        c18449l.m4544goto(interfaceC14859lM4555synchronized);
                        c18449l.m4534abstract(jM4551private);
                        c18449l.f36009l = c11925l2;
                        throw th3;
                    } catch (Throwable th4) {
                        th = th4;
                        this.amazon.end(displayListCanvas);
                        throw th;
                    }
                }
                i = (int) (jFloatToRawIntBits >> 32);
                i2 = (int) (jFloatToRawIntBits & 4294967295L);
                c2151l.startapp(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                long jMopub2 = AbstractC14707l.mopub(this.purchase);
                interfaceC13490lM4560volatile = c18449l.m4560volatile();
                enumC9931lM4548native = c18449l.m4548native();
                interfaceC14859lM4555synchronized = c18449l.m4555synchronized();
                jM4551private = c18449l.m4551private();
                c11925l2 = (C11925l) c18449l.f36009l;
                c18449l.m4554super(interfaceC13490l);
                c18449l.m4545import(enumC9931l);
                c18449l.m4544goto(c2151l);
                c18449l.m4534abstract(jMopub2);
                c18449l.f36009l = c11925l;
                c2151l.mopub();
            } catch (Throwable th5) {
                th = th5;
                displayListCanvas = displayListCanvasStart;
                this.amazon.end(displayListCanvas);
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            displayListCanvas = displayListCanvasStart;
        }
    }

    @Override // defpackage.InterfaceC0285l
    public final float premium() {
        return this.isVip;
    }

    @Override // defpackage.InterfaceC0285l
    /* JADX INFO: renamed from: private */
    public final void mo398private(float f) {
        this.isVip = f;
        this.amazon.setCameraDistance(-f);
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
        int i5 = this.premium;
        if (i == i5 && i2 == this.applovin && i3 == this.appmetrica && i4 == this.inmobi) {
            return;
        }
        boolean z = (i == i5 && i2 == this.applovin) ? false : true;
        this.premium = i;
        this.applovin = i2;
        this.appmetrica = i3;
        this.inmobi = i4;
        m2672class();
        if (z) {
            m2673continue();
        }
    }

    @Override // defpackage.InterfaceC0285l
    public final C6312l purchase() {
        return this.f19405volatile;
    }

    @Override // defpackage.InterfaceC0285l
    public final int remoteconfig() {
        return this.isPro;
    }

    @Override // defpackage.InterfaceC0285l
    public final void signatures(float f) {
        this.startapp = f;
        this.amazon.setScaleX(f);
    }

    @Override // defpackage.InterfaceC0285l
    public final void smaato(InterfaceC14859l interfaceC14859l) {
        Canvas canvas = AbstractC10071l.yandex;
        ((C2151l) interfaceC14859l).yandex.drawRenderNode(this.amazon);
    }

    @Override // defpackage.InterfaceC0285l
    public final float startapp() {
        return this.ad;
    }

    @Override // defpackage.InterfaceC0285l
    /* JADX INFO: renamed from: strictfp */
    public final void mo399strictfp(float f) {
        this.ads = f;
        this.amazon.setTranslationX(f);
    }

    @Override // defpackage.InterfaceC0285l
    public final void subs(int i) {
        if (this.firebase == i) {
            return;
        }
        this.firebase = i;
        Paint paint = this.billing;
        if (paint == null) {
            paint = new Paint();
            this.billing = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(AbstractC11880l.m3272class(i)));
        m2675switch();
    }

    @Override // defpackage.InterfaceC0285l
    public final void subscription(long j) {
        this.metrica = j;
        m2673continue();
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final void m2675switch() {
        int i = this.isPro;
        if (i != 1 && this.firebase == 3 && this.smaato == null) {
            m2671case(i);
        } else {
            m2671case(1);
        }
    }

    @Override // defpackage.InterfaceC0285l
    /* JADX INFO: renamed from: synchronized */
    public final void mo400synchronized(int i) {
        this.isPro = i;
        m2675switch();
    }

    @Override // defpackage.InterfaceC0285l
    public final long tapsense() {
        return this.Signature;
    }

    @Override // defpackage.InterfaceC0285l
    /* JADX INFO: renamed from: throw */
    public final void mo401throw(float f) {
        this.pro = f;
        this.amazon.setRotationX(f);
    }

    @Override // defpackage.InterfaceC0285l
    /* JADX INFO: renamed from: throws */
    public final float mo402throws() {
        return this.pro;
    }

    @Override // defpackage.InterfaceC0285l
    public final AbstractC8939l vip() {
        return this.smaato;
    }

    @Override // defpackage.InterfaceC0285l
    /* JADX INFO: renamed from: volatile */
    public final void mo403volatile(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.license = j;
            AbstractC2198l.amazon(this.amazon, AbstractC12953l.startapp(j));
        }
    }

    @Override // defpackage.InterfaceC0285l
    public final float yandex() {
        return this.remoteconfig;
    }
}
