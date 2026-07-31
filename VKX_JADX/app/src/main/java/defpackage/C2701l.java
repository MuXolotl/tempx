package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؔ٘ۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2701l extends AbstractC5392l {

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public final C15155l f5849l;

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public float f5850l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public Function0 f5851l;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public final float[] f5852l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public Function1 f5853l;

    public C2701l(float f, float f2, float f3, float f4, long j, long j2, C0404l c0404l, C0404l c0404l2, Function0 function0, Function1 function1) {
        super(j, j2, c0404l, c0404l2, f2, f3, f4);
        this.f5851l = function0;
        this.f5853l = function1;
        this.f5850l = f;
        this.f5852l = new float[]{0.0f, 0.0f};
        C15155l c15155l = new C15155l(new C3366l(), new C0392l(this, 1));
        m3069l(c15155l);
        this.f5849l = c15155l;
    }

    @Override // defpackage.AbstractC5392l
    /* JADX INFO: renamed from: lًؑٝ, reason: contains not printable characters */
    public final void mo1236l() {
        this.f5849l.m3944l();
    }

    /* JADX INFO: renamed from: lٖۡٓ, reason: contains not printable characters */
    public final float[] m1237l() {
        float[] fArr = this.f5852l;
        fArr[0] = 0.0f;
        float fFloatValue = ((Number) this.f5851l.invoke()).floatValue();
        float f = fFloatValue >= 0.0f ? fFloatValue : 0.0f;
        if (f > 1.0f) {
            f = 1.0f;
        }
        fArr[1] = f;
        return fArr;
    }

    @Override // defpackage.AbstractC5392l
    /* JADX INFO: renamed from: l٘ۦۢ, reason: contains not printable characters */
    public final void mo1238l() {
        AbstractC2697l.firebase(this.f5849l);
    }
}
