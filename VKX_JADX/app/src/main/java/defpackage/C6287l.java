package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: lؘؙؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6287l implements InterfaceC12499l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final EnumC7283l f13241l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC13264l f13242l;

    public C6287l(AbstractC13264l abstractC13264l, EnumC7283l enumC7283l) {
        this.f13242l = abstractC13264l;
        this.f13241l = enumC7283l;
    }

    @Override // defpackage.InterfaceC12499l
    /* JADX INFO: renamed from: lَٖؕ */
    public final Object mo1110l(long j, InterfaceC14029l interfaceC14029l) {
        return new C12121l(0L);
    }

    @Override // defpackage.InterfaceC12499l
    /* JADX INFO: renamed from: return */
    public final long mo1111return(int i, long j, long j2) {
        if (i != 2) {
            return 0L;
        }
        if (Float.intBitsToFloat((int) (this.f13241l == EnumC7283l.f15125l ? j2 >> 32 : 4294967295L & j2)) == 0.0f) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }

    @Override // defpackage.InterfaceC12499l
    /* JADX INFO: renamed from: switch */
    public final long mo1112switch(int i, long j) {
        if (i != 1) {
            return 0L;
        }
        AbstractC13264l abstractC13264l = this.f13242l;
        C16557l c16557l = abstractC13264l.amazon;
        C16557l c16557l2 = abstractC13264l.amazon;
        if (Math.abs(((C13765l) c16557l.f32505l).admob()) <= 1.0E-6d) {
            return 0L;
        }
        EnumC7283l enumC7283l = this.f13241l;
        EnumC7283l enumC7283l2 = EnumC7283l.f15125l;
        if (Math.abs(Float.intBitsToFloat((int) (enumC7283l == enumC7283l2 ? j >> 32 : j & 4294967295L))) <= 0.0f) {
            return 0L;
        }
        C4685l c4685lFirebase = abstractC13264l.firebase();
        float fAdmob = ((C13765l) c16557l2.f32505l).admob() * abstractC13264l.remoteconfig();
        float f = ((c4685lFirebase.loadAd + c4685lFirebase.crashlytics) * (-Math.signum(((C13765l) c16557l2.f32505l).admob()))) + fAdmob;
        if (((C13765l) c16557l2.f32505l).admob() > 0.0f) {
            fAdmob = f;
            f = fAdmob;
        }
        float fIntBitsToFloat = -abstractC13264l.firebase.purchase(-AbstractC8576l.amazon(Float.intBitsToFloat((int) (enumC7283l == enumC7283l2 ? j >> 32 : j & 4294967295L)), fAdmob, f));
        float fIntBitsToFloat2 = enumC7283l == enumC7283l2 ? fIntBitsToFloat : Float.intBitsToFloat((int) (j >> 32));
        if (enumC7283l != EnumC7283l.f15126l) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32);
    }

    @Override // defpackage.InterfaceC12499l
    /* JADX INFO: renamed from: throws */
    public final Object mo1113throws(long j, long j2, InterfaceC14029l interfaceC14029l) {
        return new C12121l(this.f13241l == EnumC7283l.f15126l ? C12121l.yandex(j2, 0.0f, 0.0f, 2) : C12121l.yandex(j2, 0.0f, 0.0f, 1));
    }
}
