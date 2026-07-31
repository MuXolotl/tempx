package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: lٔٚۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14993l extends AbstractC14615l {
    public final C10257l admob;
    public final Integer isPro;
    public final C0346l subs;

    public C14993l(C10257l c10257l, C0346l c0346l, Integer num) {
        this.admob = c10257l;
        this.subs = c0346l;
        this.isPro = num;
    }

    public static C14993l isPro(C10257l c10257l, Integer num) throws GeneralSecurityException {
        C0346l c0346lYandex;
        C11534l c11534l = c10257l.loadAd;
        if (c11534l == C11534l.f23192l) {
            if (num == null) {
                C18262l.ads("For given Variant TINK the value of idRequirement must be non-null");
                return null;
            }
            c0346lYandex = C0346l.yandex(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (c11534l != C11534l.f23197l) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(c11534l)));
            }
            if (num != null) {
                C18262l.ads("For given Variant NO_PREFIX the value of idRequirement must be null");
                return null;
            }
            c0346lYandex = C0346l.yandex(new byte[0]);
        }
        return new C14993l(c10257l, c0346lYandex, num);
    }

    @Override // defpackage.AbstractC6968l
    public final Integer amazon() {
        return this.isPro;
    }

    @Override // defpackage.AbstractC6968l
    public final AbstractC3302l purchase() {
        return this.admob;
    }

    @Override // defpackage.AbstractC14615l
    public final C0346l subs() {
        return this.subs;
    }
}
