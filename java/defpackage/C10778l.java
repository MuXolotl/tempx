package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lُؑۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10778l implements InterfaceC15345l, InterfaceC15871l, InterfaceC3012l {
    public final int admob;
    public final Path amazon;
    public final RectF billing;
    public final C14720l firebase;
    public final C10017l isPro;
    public final C10017l metrica;
    public final ArrayList mopub;
    public final C13957l purchase;
    public final C9950l remoteconfig;
    public final C14720l smaato;
    public float startapp;
    public final C14720l subs;
    public final int vip;
    public final boolean yandex;
    public final C3994l loadAd = new C3994l((Object) null);
    public final C3994l crashlytics = new C3994l((Object) null);

    public C10778l(C9950l c9950l, C10712l c10712l, AbstractC10437l abstractC10437l, C3391l c3391l) {
        Path path = new Path();
        this.amazon = path;
        this.purchase = new C13957l(1, 0);
        this.billing = new RectF();
        this.mopub = new ArrayList();
        this.startapp = 0.0f;
        this.yandex = c3391l.mopub;
        this.remoteconfig = c9950l;
        this.admob = c3391l.yandex;
        path.setFillType(c3391l.loadAd);
        this.vip = (int) (c10712l.loadAd() / 32.0f);
        AbstractC4383l abstractC4383lMo1225l = c3391l.crashlytics.mo1225l();
        this.subs = (C14720l) abstractC4383lMo1225l;
        abstractC4383lMo1225l.yandex(this);
        abstractC10437l.amazon(abstractC4383lMo1225l);
        AbstractC4383l abstractC4383lMo1225l2 = c3391l.amazon.mo1225l();
        this.isPro = (C10017l) abstractC4383lMo1225l2;
        abstractC4383lMo1225l2.yandex(this);
        abstractC10437l.amazon(abstractC4383lMo1225l2);
        AbstractC4383l abstractC4383lMo1225l3 = c3391l.purchase.mo1225l();
        this.firebase = (C14720l) abstractC4383lMo1225l3;
        abstractC4383lMo1225l3.yandex(this);
        abstractC10437l.amazon(abstractC4383lMo1225l3);
        AbstractC4383l abstractC4383lMo1225l4 = c3391l.billing.mo1225l();
        this.smaato = (C14720l) abstractC4383lMo1225l4;
        abstractC4383lMo1225l4.yandex(this);
        abstractC10437l.amazon(abstractC4383lMo1225l4);
        if (abstractC10437l.isPro() != null) {
            C10017l c10017lMo1225l = ((C2982l) abstractC10437l.isPro().f11181l).mo1225l();
            this.metrica = c10017lMo1225l;
            c10017lMo1225l.yandex(this);
            abstractC10437l.amazon(c10017lMo1225l);
        }
    }

    public final int amazon() {
        float f = this.firebase.amazon;
        float f2 = this.vip;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.smaato.amazon * f2);
        int iRound3 = Math.round(this.subs.amazon * f2);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    @Override // defpackage.InterfaceC15345l
    public final void billing(Canvas canvas, Matrix matrix, int i, C15480l c15480l) {
        float[] fArr;
        int[] iArr;
        Shader linearGradient;
        int[] iArr2;
        if (this.yandex) {
            return;
        }
        Path path = this.amazon;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.mopub;
            if (i2 >= arrayList.size()) {
                break;
            }
            path.addPath(((InterfaceC11309l) arrayList.get(i2)).purchase(), matrix);
            i2++;
        }
        path.computeBounds(this.billing, false);
        int i3 = this.admob;
        C14720l c14720l = this.subs;
        C14720l c14720l2 = this.smaato;
        C14720l c14720l3 = this.firebase;
        if (i3 == 1) {
            long jAmazon = amazon();
            C3994l c3994l = this.loadAd;
            linearGradient = (LinearGradient) c3994l.amazon(jAmazon);
            if (linearGradient == null) {
                PointF pointF = (PointF) c14720l3.amazon();
                PointF pointF2 = (PointF) c14720l2.amazon();
                C14360l c14360l = (C14360l) c14720l.amazon();
                int[] iArr3 = c14360l.loadAd;
                float[] fArr2 = c14360l.yandex;
                if (iArr3.length < 2) {
                    fArr2 = new float[]{0.0f, 1.0f};
                    iArr2 = new int[]{iArr3[0], iArr3[0]};
                } else {
                    iArr2 = iArr3;
                }
                linearGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, iArr2, fArr2, Shader.TileMode.CLAMP);
                c3994l.subs(jAmazon, linearGradient);
            }
        } else {
            long jAmazon2 = amazon();
            C3994l c3994l2 = this.crashlytics;
            RadialGradient radialGradient = (RadialGradient) c3994l2.amazon(jAmazon2);
            if (radialGradient != null) {
                linearGradient = radialGradient;
            } else {
                PointF pointF3 = (PointF) c14720l3.amazon();
                PointF pointF4 = (PointF) c14720l2.amazon();
                C14360l c14360l2 = (C14360l) c14720l.amazon();
                int[] iArr4 = c14360l2.loadAd;
                float[] fArr3 = c14360l2.yandex;
                if (iArr4.length < 2) {
                    iArr = new int[]{iArr4[0], iArr4[0]};
                    fArr = new float[]{0.0f, 1.0f};
                } else {
                    fArr = fArr3;
                    iArr = iArr4;
                }
                float f = pointF3.x;
                float f2 = pointF3.y;
                float fHypot = (float) Math.hypot(pointF4.x - f, pointF4.y - f2);
                if (fHypot <= 0.0f) {
                    fHypot = 0.001f;
                }
                RadialGradient radialGradient2 = new RadialGradient(f, f2, fHypot, iArr, fArr, Shader.TileMode.CLAMP);
                c3994l2.subs(jAmazon2, radialGradient2);
                linearGradient = radialGradient2;
            }
        }
        linearGradient.setLocalMatrix(matrix);
        C13957l c13957l = this.purchase;
        c13957l.setShader(linearGradient);
        C10017l c10017l = this.metrica;
        if (c10017l != null) {
            float fFloatValue = ((Float) c10017l.amazon()).floatValue();
            if (fFloatValue == 0.0f) {
                c13957l.setMaskFilter(null);
            } else if (fFloatValue != this.startapp) {
                c13957l.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.startapp = fFloatValue;
        }
        float fIntValue = ((Integer) this.isPro.amazon()).intValue() / 100.0f;
        c13957l.setAlpha(AbstractC7484l.crashlytics((int) (i * fIntValue)));
        if (c15480l != null) {
            c15480l.yandex((int) (fIntValue * 255.0f), c13957l);
        }
        canvas.drawPath(path, c13957l);
    }

    @Override // defpackage.InterfaceC15345l
    public final void crashlytics(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.amazon;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.mopub;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((InterfaceC11309l) arrayList.get(i)).purchase(), matrix);
                i++;
            }
        }
    }

    @Override // defpackage.InterfaceC3012l
    public final void loadAd(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            InterfaceC3012l interfaceC3012l = (InterfaceC3012l) list2.get(i);
            if (interfaceC3012l instanceof InterfaceC11309l) {
                this.mopub.add((InterfaceC11309l) interfaceC3012l);
            }
        }
    }

    @Override // defpackage.InterfaceC15871l
    public final void yandex() {
        this.remoteconfig.invalidateSelf();
    }
}
