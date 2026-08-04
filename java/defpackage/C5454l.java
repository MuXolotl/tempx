package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* JADX INFO: renamed from: lؘٜؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5454l extends AbstractC7490l {
    public final C5416l admob;
    public final C0346l firebase;
    public final C0346l isPro;
    public final Integer smaato;
    public final ECPoint subs;

    public C5454l(C5416l c5416l, ECPoint eCPoint, C0346l c0346l, C0346l c0346l2, Integer num) {
        this.admob = c5416l;
        this.subs = eCPoint;
        this.isPro = c0346l;
        this.firebase = c0346l2;
        this.smaato = num;
    }

    public static C5454l firebase(C5416l c5416l, ECPoint eCPoint, Integer num) {
        EllipticCurve curve;
        C15059l c15059l = c5416l.yandex;
        C10828l c10828l = c5416l.amazon;
        if (c15059l.equals(C15059l.purchase)) {
            C18262l.ads("createForNistCurve may only be called with parameters for NIST curve");
            return null;
        }
        remoteconfig(c10828l, num);
        if (c15059l == C15059l.loadAd) {
            curve = AbstractC12312l.yandex.getCurve();
        } else if (c15059l == C15059l.crashlytics) {
            curve = AbstractC12312l.loadAd.getCurve();
        } else {
            if (c15059l != C15059l.amazon) {
                C8339l.metrica("Unable to determine NIST curve type for ".concat(String.valueOf(c15059l)));
                return null;
            }
            curve = AbstractC12312l.crashlytics.getCurve();
        }
        AbstractC12312l.loadAd(eCPoint, curve);
        return new C5454l(c5416l, eCPoint, null, smaato(c10828l, num), num);
    }

    public static C5454l isPro(C5416l c5416l, C0346l c0346l, Integer num) throws GeneralSecurityException {
        C15059l c15059l = c5416l.yandex;
        C10828l c10828l = c5416l.amazon;
        if (!c15059l.equals(C15059l.purchase)) {
            C18262l.ads("createForCurveX25519 may only be called with parameters for curve X25519");
            return null;
        }
        remoteconfig(c10828l, num);
        if (c0346l.yandex.length == 32) {
            return new C5454l(c5416l, null, c0346l, smaato(c10828l, num), num);
        }
        C18262l.ads("Encoded public point byte length for X25519 curve must be 32");
        return null;
    }

    public static void remoteconfig(C10828l c10828l, Integer num) throws GeneralSecurityException {
        C10828l c10828l2 = C10828l.f21887l;
        if (!c10828l.equals(c10828l2) && num == null) {
            throw new GeneralSecurityException(AbstractC15560l.Signature("'idRequirement' must be non-null for ", String.valueOf(c10828l), " variant."));
        }
        if (c10828l == c10828l2 && num != null) {
            C18262l.ads("'idRequirement' must be null for NO_PREFIX variant.");
        }
    }

    public static C0346l smaato(C10828l c10828l, Integer num) {
        if (c10828l == C10828l.f21887l) {
            return AbstractC17168l.yandex;
        }
        if (num == null) {
            C8339l.smaato("idRequirement must be non-null for EciesParameters.Variant: ".concat(String.valueOf(c10828l)));
            return null;
        }
        if (c10828l == C10828l.f21888l) {
            return AbstractC17168l.yandex(num.intValue());
        }
        if (c10828l == C10828l.f21886l) {
            return AbstractC17168l.loadAd(num.intValue());
        }
        C8339l.smaato("Unknown EciesParameters.Variant: ".concat(String.valueOf(c10828l)));
        return null;
    }

    @Override // defpackage.AbstractC6968l
    public final Integer amazon() {
        return this.smaato;
    }

    @Override // defpackage.AbstractC6968l
    public final AbstractC3302l purchase() {
        return this.admob;
    }

    @Override // defpackage.AbstractC7490l
    public final C0346l subs() {
        return this.firebase;
    }
}
