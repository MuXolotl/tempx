package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lًُۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10905l implements InterfaceC3481l {
    public static final BigInteger crashlytics = BigInteger.valueOf(1);
    public C2396l loadAd;
    public C12029l yandex;

    @Override // defpackage.InterfaceC3481l
    public final int getFieldSize() {
        return (this.yandex.f23457l.f5158l.bitLength() + 7) / 8;
    }

    @Override // defpackage.InterfaceC3481l
    public final void init(InterfaceC9719l interfaceC9719l) {
        if (interfaceC9719l instanceof C6114l) {
            interfaceC9719l = ((C6114l) interfaceC9719l).f12903l;
        }
        AbstractC8831l abstractC8831l = (AbstractC8831l) interfaceC9719l;
        if (!(abstractC8831l instanceof C12029l)) {
            C8339l.metrica("DHEngine expects DHPrivateKeyParameters");
            return;
        }
        C12029l c12029l = (C12029l) abstractC8831l;
        this.yandex = c12029l;
        C2396l c2396l = c12029l.f23457l;
        this.loadAd = c2396l;
        AbstractC16336l.purchase(c2396l.f5158l);
        AbstractC8776l.yandex();
    }

    @Override // defpackage.InterfaceC3481l
    public final BigInteger yandex(InterfaceC9719l interfaceC9719l) {
        C7438l c7438l = (C7438l) interfaceC9719l;
        if (!c7438l.f23457l.equals(this.loadAd)) {
            C8339l.metrica("Diffie-Hellman public key has wrong parameters.");
            return null;
        }
        BigInteger bigInteger = this.loadAd.f5158l;
        BigInteger bigInteger2 = c7438l.f15399l;
        if (bigInteger2 != null) {
            BigInteger bigInteger3 = crashlytics;
            if (bigInteger2.compareTo(bigInteger3) > 0 && bigInteger2.compareTo(bigInteger.subtract(bigInteger3)) < 0) {
                BigInteger bigIntegerModPow = bigInteger2.modPow(this.yandex.f23959l, bigInteger);
                if (!bigIntegerModPow.equals(bigInteger3)) {
                    return bigIntegerModPow;
                }
                C8339l.smaato("Shared key can't be 1");
                return null;
            }
        }
        C8339l.metrica("Diffie-Hellman public key is weak");
        return null;
    }
}
