package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: lؔۗ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2846l extends AbstractC14615l {
    public final C13618l admob;
    public final Integer firebase;
    public final C0346l isPro;
    public final C7972l subs;

    public C2846l(C13618l c13618l, C7972l c7972l, C0346l c0346l, Integer num) {
        this.admob = c13618l;
        this.subs = c7972l;
        this.isPro = c0346l;
        this.firebase = num;
    }

    public static C2846l isPro(C13618l c13618l, C7972l c7972l, Integer num) throws GeneralSecurityException {
        C0346l c0346lLoadAd;
        C0346l c0346l = (C0346l) c7972l.f16631l;
        C1693l c1693l = c13618l.yandex;
        C1693l c1693l2 = C1693l.f4076l;
        if (c1693l != c1693l2 && num == null) {
            throw new GeneralSecurityException(AbstractC15560l.Signature("For given Variant ", String.valueOf(c1693l), " the value of idRequirement must be non-null"));
        }
        if (c1693l == c1693l2 && num != null) {
            C18262l.ads("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (c0346l.yandex.length != 32) {
            throw new GeneralSecurityException(AbstractC0653l.vip(c0346l.yandex.length, "XAesGcmKey key must be constructed with key of length 32 bytes, not "));
        }
        if (c1693l == c1693l2) {
            c0346lLoadAd = AbstractC17168l.yandex;
        } else {
            if (c1693l != C1693l.f4071l) {
                C8339l.smaato("Unknown Variant: ".concat(String.valueOf(c1693l)));
                return null;
            }
            c0346lLoadAd = AbstractC17168l.loadAd(num.intValue());
        }
        return new C2846l(c13618l, c7972l, c0346lLoadAd, num);
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
