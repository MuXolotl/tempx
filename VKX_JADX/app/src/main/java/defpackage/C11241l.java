package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lُِۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11241l extends AbstractC5392l {

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public float f22626l;

    /* JADX INFO: renamed from: lؗٓ٘, reason: contains not printable characters */
    public final C15155l f22627l;

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public Function0 f22628l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public Function0 f22629l;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public Function0 f22630l;

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public final float[] f22631l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public Function0 f22632l;

    public C11241l(float f, float f2, float f3, float f4, long j, long j2, C0404l c0404l, C0404l c0404l2, Function0 function0, Function0 function1, Function0 function2, Function0 function3) {
        super(j, j2, c0404l, c0404l2, f2, f3, f4);
        this.f22629l = function0;
        this.f22632l = function1;
        this.f22628l = function2;
        this.f22630l = function3;
        f = f < 0.0f ? 0.0f : f;
        this.f22626l = f > 1.0f ? 1.0f : f;
        this.f22631l = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        C15155l c15155l = new C15155l(new C3366l(), new C8986l(this, 0));
        m3069l(c15155l);
        this.f22627l = c15155l;
    }

    @Override // defpackage.AbstractC5392l
    /* JADX INFO: renamed from: lًؑٝ */
    public final void mo1236l() {
        this.f22627l.m3944l();
    }

    @Override // defpackage.AbstractC5392l
    /* JADX INFO: renamed from: l٘ۦۢ */
    public final void mo1238l() {
        AbstractC2697l.firebase(this.f22627l);
    }
}
