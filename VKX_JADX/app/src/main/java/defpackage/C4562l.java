package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؖۨۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llؖۨۧ;", "Llٕٞؗ;", "Llُِۖ;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C4562l extends AbstractC15835l<C11241l> {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Function0 f9237l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C0404l f9238l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C0404l f9239l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Function0 f9240l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Function0 f9241l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final float f9242l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final long f9243l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Function0 f9244l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final float f9245l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final float f9246l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final long f9247l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final float f9248l;

    public C4562l(float f, float f2, float f3, float f4, long j, long j2, C0404l c0404l, C0404l c0404l2, Function0 function0, Function0 function1, Function0 function2, Function0 function3) {
        this.f9241l = function0;
        this.f9240l = function1;
        this.f9237l = function2;
        this.f9244l = function3;
        this.f9243l = j;
        this.f9247l = j2;
        this.f9238l = c0404l;
        this.f9239l = c0404l2;
        this.f9246l = f;
        this.f9242l = f2;
        this.f9248l = f3;
        this.f9245l = f4;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C11241l c11241l = (C11241l) abstractC14971l;
        adcel(c11241l);
        c11241l.f22629l = this.f9241l;
        c11241l.f22632l = this.f9240l;
        c11241l.f22628l = this.f9237l;
        c11241l.f22630l = this.f9244l;
        float f = this.f9245l;
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (c11241l.f22626l == f) {
            return;
        }
        c11241l.f22626l = f;
        c11241l.mo1236l();
    }

    @Override // defpackage.AbstractC15835l
    public final boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof C4562l)) {
            return this.f9245l == ((C4562l) obj).f9245l;
        }
        return false;
    }

    @Override // defpackage.AbstractC15835l
    /* JADX INFO: renamed from: firebase, reason: from getter */
    public final float getF9246l() {
        return this.f9246l;
    }

    @Override // defpackage.AbstractC15835l
    public final int hashCode() {
        return Float.floatToIntBits(this.f9245l) + (super.hashCode() * 31);
    }

    @Override // defpackage.AbstractC15835l
    /* JADX INFO: renamed from: isPro, reason: from getter */
    public final long getF9243l() {
        return this.f9243l;
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        return new C11241l(this.f9245l, this.f9246l, this.f9242l, this.f9248l, this.f9243l, this.f9247l, this.f9238l, this.f9239l, this.f9241l, this.f9240l, this.f9237l, this.f9244l);
    }

    @Override // defpackage.AbstractC15835l
    /* JADX INFO: renamed from: metrica, reason: from getter */
    public final float getF9248l() {
        return this.f9248l;
    }

    @Override // defpackage.AbstractC15835l
    /* JADX INFO: renamed from: remoteconfig, reason: from getter */
    public final long getF9247l() {
        return this.f9247l;
    }

    @Override // defpackage.AbstractC15835l
    /* JADX INFO: renamed from: smaato, reason: from getter */
    public final C0404l getF9238l() {
        return this.f9238l;
    }

    @Override // defpackage.AbstractC15835l
    /* JADX INFO: renamed from: startapp, reason: from getter */
    public final float getF9242l() {
        return this.f9242l;
    }

    @Override // defpackage.AbstractC15835l
    /* JADX INFO: renamed from: vip, reason: from getter */
    public final C0404l getF9239l() {
        return this.f9239l;
    }
}
