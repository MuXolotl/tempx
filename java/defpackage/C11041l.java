package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: lُٔٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11041l extends AbstractC14615l {
    public final C10441l admob;
    public final Integer firebase;
    public final C0346l isPro;
    public final C7972l subs;

    public C11041l(C10441l c10441l, C7972l c7972l, C0346l c0346l, Integer num) {
        this.admob = c10441l;
        this.subs = c7972l;
        this.isPro = c0346l;
        this.firebase = num;
    }

    public static C11041l isPro(C11534l c11534l, C7972l c7972l, Integer num) throws GeneralSecurityException {
        C0346l c0346lLoadAd;
        C0346l c0346l = (C0346l) c7972l.f16631l;
        C11534l c11534l2 = C11534l.f23196l;
        if (c11534l != c11534l2 && num == null) {
            throw new GeneralSecurityException(AbstractC15560l.Signature("For given Variant ", String.valueOf(c11534l), " the value of idRequirement must be non-null"));
        }
        if (c11534l == c11534l2 && num != null) {
            C18262l.ads("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (c0346l.yandex.length != 32) {
            throw new GeneralSecurityException(AbstractC0653l.vip(c0346l.yandex.length, "XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "));
        }
        C10441l c10441l = new C10441l(c11534l);
        if (c11534l == c11534l2) {
            c0346lLoadAd = AbstractC17168l.yandex;
        } else if (c11534l == C11534l.f23199l) {
            c0346lLoadAd = AbstractC17168l.yandex(num.intValue());
        } else {
            if (c11534l != C11534l.f23193l) {
                C8339l.smaato("Unknown Variant: ".concat(String.valueOf(c11534l)));
                return null;
            }
            c0346lLoadAd = AbstractC17168l.loadAd(num.intValue());
        }
        return new C11041l(c10441l, c7972l, c0346lLoadAd, num);
    }

    @Override // defpackage.AbstractC6968l
    public final Integer amazon() {
        return this.firebase;
    }

    @Override // defpackage.AbstractC6968l
    public final AbstractC3302l purchase() {
        return this.admob;
    }

    @Override // defpackage.AbstractC14615l
    public final C0346l subs() {
        return this.isPro;
    }
}
