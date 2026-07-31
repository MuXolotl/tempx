package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؓۢۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llؓۢۦ;", "Llٕٞؗ;", "Llؔ٘ۤ;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C2202l extends AbstractC15835l<C2701l> {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final long f4858l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final float f4859l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final float f4860l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Function1 f4861l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Function0 f4862l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final float f4863l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C0404l f4864l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final long f4865l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final float f4866l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C0404l f4867l;

    public C2202l(float f, float f2, float f3, float f4, long j, long j2, C0404l c0404l, C0404l c0404l2, Function0 function0, Function1 function1) {
        this.f4862l = function0;
        this.f4861l = function1;
        this.f4858l = j;
        this.f4865l = j2;
        this.f4864l = c0404l;
        this.f4867l = c0404l2;
        this.f4859l = f;
        this.f4860l = f2;
        this.f4866l = f3;
        this.f4863l = f4;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C2701l c2701l = (C2701l) abstractC14971l;
        adcel(c2701l);
        float f = c2701l.f5850l;
        C15155l c15155l = c2701l.f5849l;
        float f2 = this.f4860l;
        if (!C14467l.loadAd(f, f2)) {
            c2701l.f5850l = f2;
            AbstractC2697l.firebase(c15155l);
        }
        Function0 function0 = c2701l.f5851l;
        Function1 function1 = this.f4861l;
        Function0 function2 = this.f4862l;
        if (function0 == function2 && c2701l.f5853l == function1) {
            return;
        }
        c2701l.f5851l = function2;
        c2701l.f5853l = function1;
        c15155l.m3944l();
    }

    @Override // defpackage.AbstractC15835l
    public final boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof C2202l)) {
            return false;
        }
        C2202l c2202l = (C2202l) obj;
        return C14467l.loadAd(this.f4860l, c2202l.f4860l) && this.f4862l == c2202l.f4862l && this.f4861l == c2202l.f4861l;
    }

    @Override // defpackage.AbstractC15835l
    /* JADX INFO: renamed from: firebase, reason: from getter */
    public final float getF4859l() {
        return this.f4859l;
    }

    @Override // defpackage.AbstractC15835l
    public final int hashCode() {
        return this.f4861l.hashCode() + ((this.f4862l.hashCode() + AbstractC9029l.mopub(super.hashCode() * 31, this.f4860l, 31)) * 31);
    }

    @Override // defpackage.AbstractC15835l
    /* JADX INFO: renamed from: isPro, reason: from getter */
    public final long getF4858l() {
        return this.f4858l;
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        return new C2701l(this.f4860l, this.f4859l, this.f4866l, this.f4863l, this.f4858l, this.f4865l, this.f4864l, this.f4867l, this.f4862l, this.f4861l);
    }

    @Override // defpackage.AbstractC15835l
    /* JADX INFO: renamed from: metrica, reason: from getter */
    public final float getF4863l() {
        return this.f4863l;
    }

    @Override // defpackage.AbstractC15835l
    /* JADX INFO: renamed from: remoteconfig, reason: from getter */
    public final long getF4865l() {
        return this.f4865l;
    }

    @Override // defpackage.AbstractC15835l
    /* JADX INFO: renamed from: smaato, reason: from getter */
    public final C0404l getF4864l() {
        return this.f4864l;
    }

    @Override // defpackage.AbstractC15835l
    /* JADX INFO: renamed from: startapp, reason: from getter */
    public final float getF4866l() {
        return this.f4866l;
    }

    @Override // defpackage.AbstractC15835l
    /* JADX INFO: renamed from: vip, reason: from getter */
    public final C0404l getF4867l() {
        return this.f4867l;
    }
}
