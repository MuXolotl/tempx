package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lؖ۟ؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4422l implements InterfaceC3481l {
    public C8374l yandex;

    @Override // defpackage.InterfaceC3481l
    public final int getFieldSize() {
        return this.yandex.f4542l.f16360l.firebase();
    }

    @Override // defpackage.InterfaceC3481l
    public final void init(InterfaceC9719l interfaceC9719l) {
        C8374l c8374l = (C8374l) interfaceC9719l;
        this.yandex = c8374l;
        AbstractC4918l.amazon("ECCDH", c8374l);
        AbstractC8776l.yandex();
    }

    @Override // defpackage.InterfaceC3481l
    public final BigInteger yandex(InterfaceC9719l interfaceC9719l) {
        String str;
        C4148l c4148l = (C4148l) interfaceC9719l;
        C7838l c7838l = this.yandex.f4542l;
        if (c7838l.equals(c4148l.f4542l)) {
            BigInteger bigIntegerMod = c7838l.f16361l.multiply(this.yandex.f17335l).mod(c7838l.f16362l);
            AbstractC8859l abstractC8859lCrashlytics = AbstractC6974l.crashlytics(c7838l.f16360l, c4148l.f8515l);
            if (abstractC8859lCrashlytics.smaato()) {
                str = "Infinity is not a valid public key for ECDHC";
            } else {
                AbstractC8859l abstractC8859lStartapp = abstractC8859lCrashlytics.vip(bigIntegerMod).startapp();
                if (!abstractC8859lStartapp.smaato()) {
                    abstractC8859lStartapp.loadAd();
                    return abstractC8859lStartapp.loadAd.signatures();
                }
                str = "Infinity is not a valid agreement value for ECDHC";
            }
        } else {
            str = "ECDHC public key has wrong domain parameters";
        }
        C8339l.smaato(str);
        return null;
    }
}
