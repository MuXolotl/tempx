package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lًۗۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8212l implements InterfaceC15871l, InterfaceC3012l, InterfaceC15345l {
    public final float[] admob;
    public final AbstractC10437l billing;
    public final C10017l firebase;
    public final C10017l isPro;
    public float metrica;
    public final C9950l purchase;
    public final C10017l remoteconfig;
    public final ArrayList smaato;
    public final C13957l subs;
    public final C10017l vip;
    public final PathMeasure yandex = new PathMeasure();
    public final Path loadAd = new Path();
    public final Path crashlytics = new Path();
    public final RectF amazon = new RectF();
    public final ArrayList mopub = new ArrayList();

    public AbstractC8212l(C9950l c9950l, AbstractC10437l abstractC10437l, Paint.Cap cap, Paint.Join join, float f, C2536l c2536l, C2982l c2982l, ArrayList arrayList, C2982l c2982l2) {
        C13957l c13957l = new C13957l(1, 0);
        this.subs = c13957l;
        this.metrica = 0.0f;
        this.purchase = c9950l;
        this.billing = abstractC10437l;
        c13957l.setStyle(Paint.Style.STROKE);
        c13957l.setStrokeCap(cap);
        c13957l.setStrokeJoin(join);
        c13957l.setStrokeMiter(f);
        this.firebase = (C10017l) c2536l.mo1225l();
        this.isPro = c2982l.mo1225l();
        if (c2982l2 == null) {
            this.remoteconfig = null;
        } else {
            this.remoteconfig = c2982l2.mo1225l();
        }
        this.smaato = new ArrayList(arrayList.size());
        this.admob = new float[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            this.smaato.add(((C2982l) arrayList.get(i)).mo1225l());
        }
        abstractC10437l.amazon(this.firebase);
        abstractC10437l.amazon(this.isPro);
        for (int i2 = 0; i2 < this.smaato.size(); i2++) {
            abstractC10437l.amazon((AbstractC4383l) this.smaato.get(i2));
        }
        AbstractC4383l abstractC4383l = this.remoteconfig;
        if (abstractC4383l != null) {
            abstractC10437l.amazon(abstractC4383l);
        }
        this.firebase.yandex(this);
        this.isPro.yandex(this);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((AbstractC4383l) this.smaato.get(i3)).yandex(this);
        }
        C10017l c10017l = this.remoteconfig;
        if (c10017l != null) {
            c10017l.yandex(this);
        }
        if (abstractC10437l.isPro() != null) {
            C10017l c10017lMo1225l = ((C2982l) abstractC10437l.isPro().f11181l).mo1225l();
            this.vip = c10017lMo1225l;
            c10017lMo1225l.yandex(this);
            abstractC10437l.amazon(c10017lMo1225l);
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x01e3  */
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
    @Override // defpackage.InterfaceC15345l
    public void billing(Canvas canvas, Matrix matrix, int i, C15480l c15480l) {
        int i2;
        float f;
        MaskFilter maskFilter;
        float[] fArr;
        AbstractC8212l abstractC8212l = this;
        float[] fArr2 = (float[]) AbstractC4218l.purchase.get();
        boolean z = false;
        fArr2[0] = 0.0f;
        int i3 = 1;
        fArr2[1] = 0.0f;
        fArr2[2] = 37394.73f;
        fArr2[3] = 39575.234f;
        matrix.mapPoints(fArr2);
        if (fArr2[0] == fArr2[2] || fArr2[1] == fArr2[3]) {
            return;
        }
        float f2 = 100.0f;
        float fIntValue = ((Integer) abstractC8212l.firebase.amazon()).intValue() / 100.0f;
        int iCrashlytics = AbstractC7484l.crashlytics((int) (i * fIntValue));
        C13957l c13957l = abstractC8212l.subs;
        c13957l.setAlpha(iCrashlytics);
        c13957l.setStrokeWidth(abstractC8212l.isPro.subs());
        if (c13957l.getStrokeWidth() <= 0.0f) {
            return;
        }
        ArrayList arrayList = abstractC8212l.smaato;
        if (!arrayList.isEmpty()) {
            int i4 = 0;
            while (true) {
                int size = arrayList.size();
                fArr = abstractC8212l.admob;
                if (i4 >= size) {
                    break;
                }
                float fFloatValue = ((Float) ((AbstractC4383l) arrayList.get(i4)).amazon()).floatValue();
                fArr[i4] = fFloatValue;
                if (i4 % 2 == 0) {
                    if (fFloatValue < 1.0f) {
                        fArr[i4] = 1.0f;
                    }
                } else if (fFloatValue < 0.1f) {
                    fArr[i4] = 0.1f;
                }
                i4++;
            }
            C10017l c10017l = abstractC8212l.remoteconfig;
            c13957l.setPathEffect(new DashPathEffect(fArr, c10017l == null ? 0.0f : ((Float) c10017l.amazon()).floatValue()));
        }
        C10017l c10017l2 = abstractC8212l.vip;
        if (c10017l2 != null) {
            float fFloatValue2 = ((Float) c10017l2.amazon()).floatValue();
            if (fFloatValue2 == 0.0f) {
                c13957l.setMaskFilter(null);
            } else if (fFloatValue2 != abstractC8212l.metrica) {
                AbstractC10437l abstractC10437l = abstractC8212l.billing;
                if (abstractC10437l.advert == fFloatValue2) {
                    maskFilter = abstractC10437l.isVip;
                } else {
                    BlurMaskFilter blurMaskFilter = new BlurMaskFilter(fFloatValue2 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    abstractC10437l.isVip = blurMaskFilter;
                    abstractC10437l.advert = fFloatValue2;
                    maskFilter = blurMaskFilter;
                }
                c13957l.setMaskFilter(maskFilter);
            }
            abstractC8212l.metrica = fFloatValue2;
        }
        if (c15480l != null) {
            c15480l.yandex((int) (fIntValue * 255.0f), c13957l);
        }
        canvas.save();
        canvas.concat(matrix);
        int i5 = 0;
        while (true) {
            ArrayList arrayList2 = abstractC8212l.mopub;
            if (i5 >= arrayList2.size()) {
                canvas.restore();
                return;
            }
            C2946l c2946l = (C2946l) arrayList2.get(i5);
            C18251l c18251l = c2946l.loadAd;
            ArrayList arrayList3 = c2946l.yandex;
            Path path = abstractC8212l.loadAd;
            if (c18251l != null) {
                path.reset();
                for (int size2 = arrayList3.size() - i3; size2 >= 0; size2--) {
                    path.addPath(((InterfaceC11309l) arrayList3.get(size2)).purchase());
                }
                float fFloatValue3 = ((Float) c18251l.amazon.amazon()).floatValue() / f2;
                float fFloatValue4 = ((Float) c18251l.purchase.amazon()).floatValue() / f2;
                float fFloatValue5 = ((Float) c18251l.billing.amazon()).floatValue() / 360.0f;
                if (fFloatValue3 >= 0.01f || fFloatValue4 <= 0.99f) {
                    PathMeasure pathMeasure = abstractC8212l.yandex;
                    pathMeasure.setPath(path, z);
                    float length = pathMeasure.getLength();
                    while (pathMeasure.nextContour()) {
                        length += pathMeasure.getLength();
                    }
                    float f3 = fFloatValue5 * length;
                    float f4 = (fFloatValue3 * length) + f3;
                    float fMin = Math.min((fFloatValue4 * length) + f3, (f4 + length) - 1.0f);
                    int size3 = arrayList3.size() - i3;
                    float f5 = 0.0f;
                    while (size3 >= 0) {
                        int i6 = i3;
                        Path pathPurchase = ((InterfaceC11309l) arrayList3.get(size3)).purchase();
                        Path path2 = abstractC8212l.crashlytics;
                        path2.set(pathPurchase);
                        pathMeasure.setPath(path2, z);
                        float length2 = pathMeasure.getLength();
                        if (fMin > length) {
                            float f6 = fMin - length;
                            if (f6 >= f5 + length2 || f5 >= f6) {
                                f = f5 + length2;
                                if (f < f4 && f5 <= fMin) {
                                    if (f > fMin || f4 >= f5) {
                                        AbstractC4218l.yandex(path2, f4 < f5 ? 0.0f : (f4 - f5) / length2, fMin > f ? 1.0f : (fMin - f5) / length2, 0.0f);
                                        canvas.drawPath(path2, c13957l);
                                    } else {
                                        canvas.drawPath(path2, c13957l);
                                    }
                                }
                            } else {
                                AbstractC4218l.yandex(path2, f4 > length ? (f4 - length) / length2 : 0.0f, Math.min(f6 / length2, 1.0f), 0.0f);
                                canvas.drawPath(path2, c13957l);
                            }
                        } else {
                            f = f5 + length2;
                            if (f < f4) {
                            }
                        }
                        f5 += length2;
                        size3--;
                        abstractC8212l = this;
                        i3 = i6;
                        z = false;
                    }
                } else {
                    canvas.drawPath(path, c13957l);
                }
                i2 = i3;
            } else {
                i2 = i3;
                path.reset();
                for (int size4 = arrayList3.size() - 1; size4 >= 0; size4--) {
                    path.addPath(((InterfaceC11309l) arrayList3.get(size4)).purchase());
                }
                canvas.drawPath(path, c13957l);
            }
            i5++;
            abstractC8212l = this;
            i3 = i2;
            z = false;
            f2 = 100.0f;
        }
    }

    @Override // defpackage.InterfaceC15345l
    public final void crashlytics(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.loadAd;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.mopub;
            if (i >= arrayList.size()) {
                RectF rectF2 = this.amazon;
                path.computeBounds(rectF2, false);
                float fSubs = this.isPro.subs() / 2.0f;
                rectF2.set(rectF2.left - fSubs, rectF2.top - fSubs, rectF2.right + fSubs, rectF2.bottom + fSubs);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
            C2946l c2946l = (C2946l) arrayList.get(i);
            for (int i2 = 0; i2 < c2946l.yandex.size(); i2++) {
                path.addPath(((InterfaceC11309l) c2946l.yandex.get(i2)).purchase(), matrix);
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:39:0x0062 A[SYNTHETIC] */
    @Override // defpackage.InterfaceC3012l
    public final void loadAd(List list, List list2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        C2946l c2946l = null;
        C18251l c18251l = null;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            InterfaceC3012l interfaceC3012l = (InterfaceC3012l) arrayList2.get(size);
            if (interfaceC3012l instanceof C18251l) {
                C18251l c18251l2 = (C18251l) interfaceC3012l;
                if (c18251l2.crashlytics == 2) {
                    c18251l = c18251l2;
                }
            }
        }
        if (c18251l != null) {
            c18251l.amazon(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.mopub;
            if (size2 < 0) {
                break;
            }
            InterfaceC3012l interfaceC3012l2 = (InterfaceC3012l) list2.get(size2);
            if (interfaceC3012l2 instanceof C18251l) {
                C18251l c18251l3 = (C18251l) interfaceC3012l2;
                if (c18251l3.crashlytics == 2) {
                    if (c2946l != null) {
                        arrayList.add(c2946l);
                    }
                    C2946l c2946l2 = new C2946l(c18251l3);
                    c18251l3.amazon(this);
                    c2946l = c2946l2;
                } else if (!(interfaceC3012l2 instanceof InterfaceC11309l)) {
                    if (c2946l == null) {
                        c2946l = new C2946l(c18251l);
                    }
                    c2946l.yandex.add((InterfaceC11309l) interfaceC3012l2);
                }
            } else if (!(interfaceC3012l2 instanceof InterfaceC11309l)) {
                if (c2946l == null) {
                    c2946l = new C2946l(c18251l);
                }
                c2946l.yandex.add((InterfaceC11309l) interfaceC3012l2);
            }
        }
        if (c2946l != null) {
            arrayList.add(c2946l);
        }
    }

    @Override // defpackage.InterfaceC15871l
    public final void yandex() {
        this.purchase.invalidateSelf();
    }
}
