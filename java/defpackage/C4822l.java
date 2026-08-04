package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.EllipticCurve;

/* JADX INFO: renamed from: lُؗۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4822l extends AbstractC7490l {
    public final C11232l admob;
    public final Integer firebase;
    public final C0346l isPro;
    public final C0346l subs;

    public C4822l(C11232l c11232l, C0346l c0346l, C0346l c0346l2, Integer num) {
        this.admob = c11232l;
        this.subs = c0346l;
        this.isPro = c0346l2;
        this.firebase = num;
    }

    public static C4822l isPro(C11232l c11232l, C0346l c0346l, Integer num) {
        EllipticCurve curve;
        C0346l c0346lLoadAd;
        C9676l c9676l = c11232l.amazon;
        C9676l c9676l2 = C9676l.f19755l;
        if (!c9676l.equals(c9676l2) && num == null) {
            throw new GeneralSecurityException(AbstractC15560l.Signature("'idRequirement' must be non-null for ", String.valueOf(c9676l), " variant."));
        }
        if (c9676l == c9676l2 && num != null) {
            C18262l.ads("'idRequirement' must be null for NO_PREFIX variant.");
            return null;
        }
        C15026l c15026l = c11232l.yandex;
        int length = c0346l.yandex.length;
        String str = "Encoded public key byte length for " + String.valueOf(c15026l) + " must be %d, not " + length;
        C15026l c15026l2 = C15026l.billing;
        C15026l c15026l3 = C15026l.purchase;
        C15026l c15026l4 = C15026l.amazon;
        if (c15026l == c15026l4) {
            if (length != 65) {
                throw new GeneralSecurityException(String.format(str, 65));
            }
        } else if (c15026l == c15026l3) {
            if (length != 97) {
                throw new GeneralSecurityException(String.format(str, 97));
            }
        } else if (c15026l == c15026l2) {
            if (length != 133) {
                throw new GeneralSecurityException(String.format(str, 133));
            }
        } else if (c15026l == C15026l.mopub) {
            if (length != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        } else {
            if (c15026l != C15026l.admob) {
                throw new GeneralSecurityException("Unable to validate public key length for ".concat(String.valueOf(c15026l)));
            }
            if (length != 1216) {
                throw new GeneralSecurityException(String.format(str, 1216));
            }
        }
        if (c15026l == c15026l4 || c15026l == c15026l3 || c15026l == c15026l2) {
            if (c15026l == c15026l4) {
                curve = AbstractC12312l.yandex.getCurve();
            } else if (c15026l == c15026l3) {
                curve = AbstractC12312l.loadAd.getCurve();
            } else {
                if (c15026l != c15026l2) {
                    C8339l.metrica("Unable to determine NIST curve type for ".concat(String.valueOf(c15026l)));
                    return null;
                }
                curve = AbstractC12312l.crashlytics.getCurve();
            }
            AbstractC12312l.loadAd(C17423l.subs(curve, EnumC5521l.f11790l, c0346l.loadAd()), curve);
        }
        if (c9676l == c9676l2) {
            c0346lLoadAd = AbstractC17168l.yandex;
        } else {
            if (num == null) {
                C8339l.smaato("idRequirement must be non-null for HpkeParameters.Variant ".concat(String.valueOf(c9676l)));
                return null;
            }
            if (c9676l == C9676l.f19756l) {
                c0346lLoadAd = AbstractC17168l.yandex(num.intValue());
            } else {
                if (c9676l != C9676l.f19754l) {
                    C8339l.smaato("Unknown HpkeParameters.Variant: ".concat(String.valueOf(c9676l)));
                    return null;
                }
                c0346lLoadAd = AbstractC17168l.loadAd(num.intValue());
            }
        }
        return new C4822l(c11232l, c0346l, c0346lLoadAd, num);
    }

    @Override // defpackage.AbstractC6968l
    public final Integer amazon() {
        return this.firebase;
    }

    @Override // defpackage.AbstractC6968l
    public final AbstractC3302l purchase() {
        return this.admob;
    }

    @Override // defpackage.AbstractC7490l
    public final C0346l subs() {
        return this.isPro;
    }
}
