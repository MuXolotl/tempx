package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: lؘٔٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5690l extends AbstractC14615l {
    public final C15840l admob;
    public final Integer firebase;
    public final C0346l isPro;
    public final C7972l subs;

    public C5690l(C15840l c15840l, C7972l c7972l, C0346l c0346l, Integer num) {
        this.admob = c15840l;
        this.subs = c7972l;
        this.isPro = c0346l;
        this.firebase = num;
    }

    public static C5690l isPro(C7396l c7396l, C7972l c7972l, Integer num) throws GeneralSecurityException {
        C0346l c0346lLoadAd;
        C0346l c0346l = (C0346l) c7972l.f16631l;
        C7396l c7396l2 = C7396l.f15323l;
        if (c7396l != c7396l2 && num == null) {
            throw new GeneralSecurityException(AbstractC15560l.Signature("For given Variant ", String.valueOf(c7396l), " the value of idRequirement must be non-null"));
        }
        if (c7396l == c7396l2 && num != null) {
            C18262l.ads("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (c0346l.yandex.length != 32) {
            throw new GeneralSecurityException(AbstractC0653l.vip(c0346l.yandex.length, "ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "));
        }
        C15840l c15840l = new C15840l(c7396l);
        if (c7396l == c7396l2) {
            c0346lLoadAd = AbstractC17168l.yandex;
        } else if (c7396l == C7396l.f15324l) {
            c0346lLoadAd = AbstractC17168l.yandex(num.intValue());
        } else {
            if (c7396l != C7396l.f15322l) {
                C8339l.smaato("Unknown Variant: ".concat(String.valueOf(c7396l)));
                return null;
            }
            c0346lLoadAd = AbstractC17168l.loadAd(num.intValue());
        }
        return new C5690l(c15840l, c7972l, c0346lLoadAd, num);
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
