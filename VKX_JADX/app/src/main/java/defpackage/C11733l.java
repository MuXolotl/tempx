package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lٍِ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C11733l implements InterfaceC3481l {
    public C8374l yandex;

    @Override // defpackage.InterfaceC3481l
    public final int getFieldSize() {
        return this.yandex.f4542l.f16360l.firebase();
    }

    @Override // defpackage.InterfaceC3481l
    public final void init(InterfaceC9719l interfaceC9719l) {
        C8374l c8374l = (C8374l) interfaceC9719l;
        this.yandex = c8374l;
        AbstractC4918l.amazon("ECDH", c8374l);
        AbstractC8776l.yandex();
    }

    @Override // defpackage.InterfaceC3481l
    public final BigInteger yandex(InterfaceC9719l interfaceC9719l) {
        String str;
        BigInteger bigInteger;
        C4148l c4148l = (C4148l) interfaceC9719l;
        C7838l c7838l = this.yandex.f4542l;
        if (c7838l.equals(c4148l.f4542l)) {
            BigInteger bigIntegerMod = this.yandex.f17335l;
            AbstractC8859l abstractC8859lCrashlytics = AbstractC6974l.crashlytics(c7838l.f16360l, c4148l.f8515l);
            if (abstractC8859lCrashlytics.smaato()) {
                str = "Infinity is not a valid public key for ECDH";
            } else {
                BigInteger bigInteger2 = c7838l.f16361l;
                if (!bigInteger2.equals(InterfaceC11695l.startapp)) {
                    synchronized (c7838l) {
                        try {
                            if (c7838l.f16363l == null) {
                                c7838l.f16363l = AbstractC16784l.isPro(c7838l.f16362l, c7838l.f16361l);
                            }
                            bigInteger = c7838l.f16363l;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    bigIntegerMod = bigInteger.multiply(bigIntegerMod).mod(c7838l.f16362l);
                    abstractC8859lCrashlytics = AbstractC6974l.startapp(abstractC8859lCrashlytics, bigInteger2);
                }
                AbstractC8859l abstractC8859lStartapp = abstractC8859lCrashlytics.vip(bigIntegerMod).startapp();
                if (!abstractC8859lStartapp.smaato()) {
                    abstractC8859lStartapp.loadAd();
                    return abstractC8859lStartapp.loadAd.signatures();
                }
                str = "Infinity is not a valid agreement value for ECDH";
            }
        } else {
            str = "ECDH public key has wrong domain parameters";
        }
        C8339l.smaato(str);
        return null;
    }
}
