package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: renamed from: lّٜۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12806l extends AbstractC8212l {
    public final int Signature;
    public final C14720l ad;
    public final C3994l adcel;
    public final C3994l ads;
    public final C14720l license;
    public final C14720l pro;
    public final boolean startapp;
    public final RectF subscription;
    public final int tapsense;

    /* JADX WARN: Illegal instructions before constructor call */
    public C12806l(C9950l c9950l, AbstractC10437l abstractC10437l, C7677l c7677l) {
        Paint.Join join;
        Paint.Join join2;
        int iInmobi = AbstractC5020l.inmobi(c7677l.mopub);
        Paint.Cap cap = iInmobi != 0 ? iInmobi != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iInmobi2 = AbstractC5020l.inmobi(c7677l.admob);
        if (iInmobi2 == 0) {
            join = Paint.Join.MITER;
        } else {
            if (iInmobi2 != 1) {
                if (iInmobi2 != 2) {
                    join2 = null;
                } else {
                    join = Paint.Join.BEVEL;
                }
                super(c9950l, abstractC10437l, cap, join2, c7677l.subs, c7677l.crashlytics, c7677l.billing, c7677l.isPro, c7677l.firebase);
                this.adcel = new C3994l((Object) null);
                this.ads = new C3994l((Object) null);
                this.subscription = new RectF();
                this.tapsense = c7677l.yandex;
                this.startapp = c7677l.smaato;
                this.Signature = (int) (c9950l.f20287l.loadAd() / 32.0f);
                AbstractC4383l abstractC4383lMo1225l = c7677l.loadAd.mo1225l();
                this.license = (C14720l) abstractC4383lMo1225l;
                abstractC4383lMo1225l.yandex(this);
                abstractC10437l.amazon(abstractC4383lMo1225l);
                AbstractC4383l abstractC4383lMo1225l2 = c7677l.amazon.mo1225l();
                this.pro = (C14720l) abstractC4383lMo1225l2;
                abstractC4383lMo1225l2.yandex(this);
                abstractC10437l.amazon(abstractC4383lMo1225l2);
                AbstractC4383l abstractC4383lMo1225l3 = c7677l.purchase.mo1225l();
                this.ad = (C14720l) abstractC4383lMo1225l3;
                abstractC4383lMo1225l3.yandex(this);
                abstractC10437l.amazon(abstractC4383lMo1225l3);
            }
            join = Paint.Join.ROUND;
        }
        join2 = join;
        super(c9950l, abstractC10437l, cap, join2, c7677l.subs, c7677l.crashlytics, c7677l.billing, c7677l.isPro, c7677l.firebase);
        this.adcel = new C3994l((Object) null);
        this.ads = new C3994l((Object) null);
        this.subscription = new RectF();
        this.tapsense = c7677l.yandex;
        this.startapp = c7677l.smaato;
        this.Signature = (int) (c9950l.f20287l.loadAd() / 32.0f);
        AbstractC4383l abstractC4383lMo1225l4 = c7677l.loadAd.mo1225l();
        this.license = (C14720l) abstractC4383lMo1225l4;
        abstractC4383lMo1225l4.yandex(this);
        abstractC10437l.amazon(abstractC4383lMo1225l4);
        AbstractC4383l abstractC4383lMo1225l5 = c7677l.amazon.mo1225l();
        this.pro = (C14720l) abstractC4383lMo1225l5;
        abstractC4383lMo1225l5.yandex(this);
        abstractC10437l.amazon(abstractC4383lMo1225l5);
        AbstractC4383l abstractC4383lMo1225l6 = c7677l.purchase.mo1225l();
        this.ad = (C14720l) abstractC4383lMo1225l6;
        abstractC4383lMo1225l6.yandex(this);
        abstractC10437l.amazon(abstractC4383lMo1225l6);
    }

    public final int amazon() {
        float f = this.pro.amazon;
        float f2 = this.Signature;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.ad.amazon * f2);
        int iRound3 = Math.round(this.license.amazon * f2);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
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
    @Override // defpackage.AbstractC8212l, defpackage.InterfaceC15345l
    public final void billing(Canvas canvas, Matrix matrix, int i, C15480l c15480l) {
        Shader radialGradient;
        if (this.startapp) {
            return;
        }
        crashlytics(this.subscription, matrix, false);
        int i2 = this.tapsense;
        C14720l c14720l = this.license;
        C14720l c14720l2 = this.ad;
        C14720l c14720l3 = this.pro;
        if (i2 == 1) {
            long jAmazon = amazon();
            C3994l c3994l = this.adcel;
            radialGradient = (LinearGradient) c3994l.amazon(jAmazon);
            if (radialGradient == null) {
                PointF pointF = (PointF) c14720l3.amazon();
                PointF pointF2 = (PointF) c14720l2.amazon();
                C14360l c14360l = (C14360l) c14720l.amazon();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, c14360l.loadAd, c14360l.yandex, Shader.TileMode.CLAMP);
                c3994l.subs(jAmazon, radialGradient);
            }
        } else {
            long jAmazon2 = amazon();
            C3994l c3994l2 = this.ads;
            radialGradient = (RadialGradient) c3994l2.amazon(jAmazon2);
            if (radialGradient == null) {
                PointF pointF3 = (PointF) c14720l3.amazon();
                PointF pointF4 = (PointF) c14720l2.amazon();
                C14360l c14360l2 = (C14360l) c14720l.amazon();
                int[] iArr = c14360l2.loadAd;
                float[] fArr = c14360l2.yandex;
                float f = pointF3.x;
                float f2 = pointF3.y;
                radialGradient = new RadialGradient(f, f2, (float) Math.hypot(pointF4.x - f, pointF4.y - f2), iArr, fArr, Shader.TileMode.CLAMP);
                c3994l2.subs(jAmazon2, radialGradient);
            }
        }
        this.subs.setShader(radialGradient);
        super.billing(canvas, matrix, i, c15480l);
    }
}
