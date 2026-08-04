package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lؓۖٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2031l implements InterfaceC15345l, InterfaceC15871l, InterfaceC3012l {
    public final C9950l admob;
    public final boolean amazon;
    public final C10017l billing;
    public final AbstractC10437l crashlytics;
    public float isPro;
    public final C13957l loadAd;
    public final C10017l mopub;
    public final ArrayList purchase;
    public final C10017l subs;
    public final Path yandex;

    public C2031l(C9950l c9950l, AbstractC10437l abstractC10437l, C15570l c15570l) {
        Path path = new Path();
        this.yandex = path;
        this.loadAd = new C13957l(1, 0);
        this.purchase = new ArrayList();
        this.crashlytics = abstractC10437l;
        C2536l c2536l = c15570l.amazon;
        C2536l c2536l2 = c15570l.crashlytics;
        this.amazon = c15570l.purchase;
        this.admob = c9950l;
        if (abstractC10437l.isPro() != null) {
            C10017l c10017lMo1225l = ((C2982l) abstractC10437l.isPro().f11181l).mo1225l();
            this.subs = c10017lMo1225l;
            c10017lMo1225l.yandex(this);
            abstractC10437l.amazon(c10017lMo1225l);
        }
        if (c2536l2 == null) {
            this.billing = null;
            this.mopub = null;
            return;
        }
        path.setFillType(c15570l.loadAd);
        AbstractC4383l abstractC4383lMo1225l = c2536l2.mo1225l();
        this.billing = (C10017l) abstractC4383lMo1225l;
        abstractC4383lMo1225l.yandex(this);
        abstractC10437l.amazon(abstractC4383lMo1225l);
        AbstractC4383l abstractC4383lMo1225l2 = c2536l.mo1225l();
        this.mopub = (C10017l) abstractC4383lMo1225l2;
        abstractC4383lMo1225l2.yandex(this);
        abstractC10437l.amazon(abstractC4383lMo1225l2);
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
    @Override // defpackage.InterfaceC15345l
    public final void billing(Canvas canvas, Matrix matrix, int i, C15480l c15480l) {
        MaskFilter maskFilter;
        if (this.amazon) {
            return;
        }
        C10017l c10017l = this.billing;
        int iFirebase = c10017l.firebase(c10017l.crashlytics.crashlytics(), c10017l.loadAd());
        float fIntValue = ((Integer) this.mopub.amazon()).intValue() / 100.0f;
        int iCrashlytics = (AbstractC7484l.crashlytics((int) (i * fIntValue)) << 24) | (iFirebase & 16777215);
        C13957l c13957l = this.loadAd;
        c13957l.setColor(iCrashlytics);
        C10017l c10017l2 = this.subs;
        if (c10017l2 != null) {
            float fFloatValue = ((Float) c10017l2.amazon()).floatValue();
            if (fFloatValue == 0.0f) {
                c13957l.setMaskFilter(null);
            } else if (fFloatValue != this.isPro) {
                AbstractC10437l abstractC10437l = this.crashlytics;
                if (abstractC10437l.advert == fFloatValue) {
                    maskFilter = abstractC10437l.isVip;
                } else {
                    BlurMaskFilter blurMaskFilter = new BlurMaskFilter(fFloatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    abstractC10437l.isVip = blurMaskFilter;
                    abstractC10437l.advert = fFloatValue;
                    maskFilter = blurMaskFilter;
                }
                c13957l.setMaskFilter(maskFilter);
            }
            this.isPro = fFloatValue;
        }
        if (c15480l != null) {
            c15480l.yandex((int) (fIntValue * 255.0f), c13957l);
        } else {
            c13957l.clearShadowLayer();
        }
        Path path = this.yandex;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.purchase;
            if (i2 >= arrayList.size()) {
                canvas.drawPath(path, c13957l);
                return;
            } else {
                path.addPath(((InterfaceC11309l) arrayList.get(i2)).purchase(), matrix);
                i2++;
            }
        }
    }

    @Override // defpackage.InterfaceC15345l
    public final void crashlytics(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.yandex;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.purchase;
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
                this.purchase.add((InterfaceC11309l) interfaceC3012l);
            }
        }
    }

    @Override // defpackage.InterfaceC15871l
    public final void yandex() {
        this.admob.invalidateSelf();
    }
}
