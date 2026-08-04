package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;

/* JADX INFO: renamed from: lُ٘ۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18270l implements InterfaceC0285l {
    public float Signature;
    public boolean ad;
    public float adcel;
    public boolean admob;
    public long ads;
    public int advert;
    public final RenderNode amazon;
    public boolean applovin;
    public boolean appmetrica;
    public Paint billing;
    public final C13601l crashlytics;
    public AbstractC8939l firebase;
    public int inmobi;
    public int isPro;
    public int isVip;
    public float license;
    public final C10383l loadAd;
    public float metrica;
    public Matrix mopub;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public C6312l f35769package;
    public int premium;
    public float pro;
    public long purchase;
    public float remoteconfig;
    public int signatures;
    public long smaato;
    public float startapp;
    public float subs;
    public long subscription;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public int f35770synchronized;
    public float tapsense;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public int f35771throws;
    public float vip;

    public C18270l() {
        C10383l c10383l = new C10383l();
        C13601l c13601l = new C13601l();
        this.loadAd = c10383l;
        this.crashlytics = c13601l;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.amazon = renderNode;
        this.purchase = 0L;
        renderNode.setClipToBounds(false);
        m4502case(renderNode, 0);
        this.subs = 1.0f;
        this.isPro = 3;
        this.smaato = 9205357640488583168L;
        this.remoteconfig = 1.0f;
        this.vip = 1.0f;
        long j = C9735l.loadAd;
        this.ads = j;
        this.subscription = j;
        this.pro = 8.0f;
        this.f35770synchronized = 0;
    }

    @Override // defpackage.InterfaceC0285l
    public final void Signature(float f) {
        this.subs = f;
        this.amazon.setAlpha(f);
    }

    @Override // defpackage.InterfaceC0285l
    public final float ad() {
        return this.startapp;
    }

    @Override // defpackage.InterfaceC0285l
    public final boolean adcel() {
        return this.amazon.hasDisplayList();
    }

    @Override // defpackage.InterfaceC0285l
    public final void admob(Outline outline, long j) {
        this.amazon.setOutline(outline);
        this.admob = outline != null;
        m4505else();
    }

    @Override // defpackage.InterfaceC0285l
    public final float ads() {
        return this.license;
    }

    @Override // defpackage.InterfaceC0285l
    public final long advert() {
        return this.subscription;
    }

    @Override // defpackage.InterfaceC0285l
    public final void amazon(float f) {
        this.adcel = f;
        this.amazon.setElevation(f);
    }

    @Override // defpackage.InterfaceC0285l
    public final void applovin(C6312l c6312l) {
        this.f35769package = c6312l;
        if (Build.VERSION.SDK_INT >= 31) {
            AbstractC12148l.m3368volatile(this.amazon, c6312l);
        }
    }

    @Override // defpackage.InterfaceC0285l
    public final float appmetrica() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC0285l
    public final void billing(float f) {
        this.license = f;
        this.amazon.setRotationZ(f);
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public final void m4502case(RenderNode renderNode, int i) {
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, this.billing);
            renderNode.setHasOverlappingRendering(true);
            return;
        }
        Paint paint = this.billing;
        if (i == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // defpackage.InterfaceC0285l
    /* JADX INFO: renamed from: catch */
    public final int mo393catch() {
        return this.isPro;
    }

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public final void m4503class() {
        RenderNode renderNode = this.amazon;
        int i = this.inmobi;
        renderNode.setPosition(i - this.advert, this.f35771throws - this.isVip, i + ((int) Float.intBitsToFloat((int) (this.purchase >> 32))) + this.signatures, this.f35771throws + ((int) Float.intBitsToFloat((int) (this.purchase & 4294967295L))) + this.premium);
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public final void m4504continue() {
        long j = this.smaato;
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.amazon;
        if (j2 == 9205357640488583168L) {
            renderNode.setPivotX((Float.intBitsToFloat((int) (this.purchase >> 32)) / 2.0f) + this.advert);
            this.amazon.setPivotY((Float.intBitsToFloat((int) (this.purchase & 4294967295L)) / 2.0f) + this.isVip);
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)) + this.advert);
            this.amazon.setPivotY(Float.intBitsToFloat((int) (this.smaato & 4294967295L)) + this.isVip);
        }
    }

    @Override // defpackage.InterfaceC0285l
    public final float crashlytics() {
        return this.remoteconfig;
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public final void m4505else() {
        boolean z = this.ad;
        boolean z2 = false;
        boolean z3 = z && !this.admob;
        if (z && this.admob) {
            z2 = true;
        }
        if (z3 != this.applovin) {
            this.applovin = z3;
            this.amazon.setClipToBounds(z3);
        }
        if (z2 != this.appmetrica) {
            this.appmetrica = z2;
            this.amazon.setClipToOutline(z2);
        }
    }

    @Override // defpackage.InterfaceC0285l
    /* JADX INFO: renamed from: extends */
    public final float mo394extends() {
        return this.adcel;
    }

    @Override // defpackage.InterfaceC0285l
    public final void firebase(int i, long j, int i2) {
        this.inmobi = i;
        this.f35771throws = i2;
        boolean zLoadAd = C14174l.loadAd(this.purchase, AbstractC14707l.mopub(j));
        this.purchase = AbstractC14707l.mopub(j);
        m4503class();
        if (zLoadAd || !C1187l.loadAd(this.smaato, 9205357640488583168L)) {
            return;
        }
        this.amazon.setPivotX((((int) (j >> 32)) / 2.0f) + this.advert);
        this.amazon.setPivotY((((int) (j & 4294967295L)) / 2.0f) + this.isVip);
    }

    @Override // defpackage.InterfaceC0285l
    /* JADX INFO: renamed from: for */
    public final float mo395for() {
        return this.vip;
    }

    @Override // defpackage.InterfaceC0285l
    public final void inmobi(boolean z) {
        this.ad = z;
        m4505else();
    }

    @Override // defpackage.InterfaceC0285l
    public final void isPro() {
        this.amazon.discardDisplayList();
    }

    @Override // defpackage.InterfaceC0285l
    public final void isVip(long j) {
        this.ads = j;
        this.amazon.setAmbientShadowColor(AbstractC12953l.startapp(j));
    }

    @Override // defpackage.InterfaceC0285l
    public final void license(AbstractC8939l abstractC8939l) {
        this.firebase = abstractC8939l;
        Paint paint = this.billing;
        if (paint == null) {
            paint = new Paint();
            this.billing = paint;
        }
        paint.setColorFilter(abstractC8939l != null ? abstractC8939l.yandex : null);
        m4506switch();
    }

    @Override // defpackage.InterfaceC0285l
    public final void loadAd(float f) {
        this.Signature = f;
        this.amazon.setRotationY(f);
    }

    @Override // defpackage.InterfaceC0285l
    public final void metrica(float f) {
        this.vip = f;
        this.amazon.setScaleY(f);
    }

    @Override // defpackage.InterfaceC0285l
    public final void mopub(float f) {
        this.startapp = f;
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

    @Override // defpackage.InterfaceC0285l
    /* JADX INFO: renamed from: package */
    public final void mo397package(InterfaceC13490l interfaceC13490l, EnumC9931l enumC9931l, C11925l c11925l, C3006l c3006l) {
        C13601l c13601l = this.crashlytics;
        RecordingCanvas recordingCanvasBeginRecording = this.amazon.beginRecording();
        float f = this.advert;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.isVip)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        try {
            C10383l c10383l = this.loadAd;
            C2151l c2151l = c10383l.yandex;
            Canvas canvas = c2151l.yandex;
            c2151l.yandex = recordingCanvasBeginRecording;
            C18449l c18449l = c13601l.f26629l;
            c18449l.m4554super(interfaceC13490l);
            c18449l.m4545import(enumC9931l);
            c18449l.f36009l = c11925l;
            c18449l.m4534abstract(this.purchase);
            c18449l.m4544goto(c2151l);
            if (this.advert > 0.0f || this.isVip > 0.0f) {
                int i = (int) (jFloatToRawIntBits >> 32);
                int i2 = (int) (jFloatToRawIntBits & 4294967295L);
                c2151l.startapp(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                c3006l.invoke(c13601l);
                c2151l.startapp(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
            } else {
                c3006l.invoke(c13601l);
            }
            c10383l.yandex.yandex = canvas;
        } finally {
            this.amazon.endRecording();
        }
    }

    @Override // defpackage.InterfaceC0285l
    public final float premium() {
        return this.pro;
    }

    @Override // defpackage.InterfaceC0285l
    /* JADX INFO: renamed from: private */
    public final void mo398private(float f) {
        this.pro = f;
        this.amazon.setCameraDistance(f);
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
        int i5 = this.advert;
        if (i == i5 && i2 == this.isVip && i3 == this.signatures && i4 == this.premium) {
            return;
        }
        boolean z = (i == i5 && i2 == this.isVip) ? false : true;
        this.advert = i;
        this.isVip = i2;
        this.signatures = i3;
        this.premium = i4;
        m4503class();
        if (z) {
            m4504continue();
        }
    }

    @Override // defpackage.InterfaceC0285l
    public final C6312l purchase() {
        return this.f35769package;
    }

    @Override // defpackage.InterfaceC0285l
    public final int remoteconfig() {
        return this.f35770synchronized;
    }

    @Override // defpackage.InterfaceC0285l
    public final void signatures(float f) {
        this.remoteconfig = f;
        this.amazon.setScaleX(f);
    }

    @Override // defpackage.InterfaceC0285l
    public final void smaato(InterfaceC14859l interfaceC14859l) {
        Canvas canvas = AbstractC10071l.yandex;
        ((C2151l) interfaceC14859l).yandex.drawRenderNode(this.amazon);
    }

    @Override // defpackage.InterfaceC0285l
    public final float startapp() {
        return this.Signature;
    }

    @Override // defpackage.InterfaceC0285l
    /* JADX INFO: renamed from: strictfp */
    public final void mo399strictfp(float f) {
        this.metrica = f;
        this.amazon.setTranslationX(f);
    }

    @Override // defpackage.InterfaceC0285l
    public final void subs(int i) {
        this.isPro = i;
        Paint paint = this.billing;
        if (paint == null) {
            paint = new Paint();
            this.billing = paint;
        }
        paint.setBlendMode(AbstractC11880l.m3270case(i));
        m4506switch();
    }

    @Override // defpackage.InterfaceC0285l
    public final void subscription(long j) {
        this.smaato = j;
        m4504continue();
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final void m4506switch() {
        int i = this.f35770synchronized;
        if (i != 1 && this.isPro == 3 && this.firebase == null && this.f35769package == null) {
            m4502case(this.amazon, i);
        } else {
            m4502case(this.amazon, 1);
        }
    }

    @Override // defpackage.InterfaceC0285l
    /* JADX INFO: renamed from: synchronized */
    public final void mo400synchronized(int i) {
        this.f35770synchronized = i;
        m4506switch();
    }

    @Override // defpackage.InterfaceC0285l
    public final long tapsense() {
        return this.ads;
    }

    @Override // defpackage.InterfaceC0285l
    /* JADX INFO: renamed from: throw */
    public final void mo401throw(float f) {
        this.tapsense = f;
        this.amazon.setRotationX(f);
    }

    @Override // defpackage.InterfaceC0285l
    /* JADX INFO: renamed from: throws */
    public final float mo402throws() {
        return this.tapsense;
    }

    @Override // defpackage.InterfaceC0285l
    public final AbstractC8939l vip() {
        return this.firebase;
    }

    @Override // defpackage.InterfaceC0285l
    /* JADX INFO: renamed from: volatile */
    public final void mo403volatile(long j) {
        this.subscription = j;
        this.amazon.setSpotShadowColor(AbstractC12953l.startapp(j));
    }

    @Override // defpackage.InterfaceC0285l
    public final float yandex() {
        return this.subs;
    }
}
