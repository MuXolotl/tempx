package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: lّٗؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12651l {
    public static final C5773l amazon;
    public static final C8873l crashlytics;
    public static final C4733l loadAd;
    public static final C9439l purchase;
    public static final C3797l yandex;

    static {
        C0458l c0458lPurchase = C3797l.purchase();
        c0458lPurchase.remoteconfig(EnumC7004l.SHA1, C10858l.loadAd);
        c0458lPurchase.remoteconfig(EnumC7004l.SHA224, C10858l.crashlytics);
        c0458lPurchase.remoteconfig(EnumC7004l.SHA256, C10858l.amazon);
        c0458lPurchase.remoteconfig(EnumC7004l.SHA384, C10858l.purchase);
        c0458lPurchase.remoteconfig(EnumC7004l.SHA512, C10858l.billing);
        yandex = c0458lPurchase.isVip();
        loadAd = new C4733l(C0485l.class, new C18262l(19));
        crashlytics = new C8873l("type.googleapis.com/google.crypto.tink.HmacKey", new C18262l(20));
        amazon = new C5773l(C12785l.class, new C18262l(21));
        purchase = new C9439l("type.googleapis.com/google.crypto.tink.HmacKey", new C18262l(22));
    }

    public static C3179l loadAd(C9358l c9358l) throws GeneralSecurityException {
        if (c9358l == C9358l.purchase) {
            return C3179l.f6840l;
        }
        if (c9358l == C9358l.crashlytics) {
            return C3179l.f6837l;
        }
        if (c9358l == C9358l.amazon) {
            return C3179l.f6838l;
        }
        if (c9358l == C9358l.billing) {
            return C3179l.f6839l;
        }
        throw new GeneralSecurityException("unknown OutputPrefixType: ".concat(String.valueOf(c9358l)));
    }

    public static C9358l yandex(C3179l c3179l) {
        if (c3179l == C3179l.f6840l) {
            return C9358l.purchase;
        }
        if (c3179l == C3179l.f6837l) {
            return C9358l.crashlytics;
        }
        if (c3179l == C3179l.f6838l) {
            return C9358l.amazon;
        }
        if (c3179l == C3179l.f6839l) {
            return C9358l.billing;
        }
        throw new GeneralSecurityException("unknown variant: ".concat(String.valueOf(c3179l)));
    }
}
