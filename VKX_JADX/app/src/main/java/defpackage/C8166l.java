package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: lًٞٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8166l extends AbstractC14615l {
    public final C6762l admob;
    public final Integer isPro;
    public final C0346l subs;

    public C8166l(C6762l c6762l, C0346l c0346l, Integer num) {
        this.admob = c6762l;
        this.subs = c0346l;
        this.isPro = num;
    }

    public static C8166l isPro(C6762l c6762l, Integer num) throws GeneralSecurityException {
        C0346l c0346lLoadAd;
        C17927l c17927l = c6762l.yandex;
        if (c17927l == C17927l.mopub) {
            if (num != null) {
                C18262l.ads("For given Variant NO_PREFIX the value of idRequirement must be null");
                return null;
            }
            c0346lLoadAd = AbstractC17168l.yandex;
        } else {
            if (c17927l != C17927l.billing) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(c17927l)));
            }
            if (num == null) {
                C18262l.ads("For given Variant TINK the value of idRequirement must be non-null");
                return null;
            }
            c0346lLoadAd = AbstractC17168l.loadAd(num.intValue());
        }
        return new C8166l(c6762l, c0346lLoadAd, num);
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
