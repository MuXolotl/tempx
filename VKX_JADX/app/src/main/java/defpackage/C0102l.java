package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؑؖؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0102l implements InterfaceC8145l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C10775l f1010l;

    @Override // defpackage.InterfaceC8145l
    public final C18595l purchase() {
        C10775l c10775l = this.f1010l;
        C0277l c0277l = c10775l.f21798l;
        SecureRandom secureRandom = (SecureRandom) c10775l.f28907l;
        BigInteger bigInteger = c0277l.f1276l;
        BigInteger bigInteger2 = c0277l.f1277l;
        BigInteger bigInteger3 = c0277l.f1275l;
        while (true) {
            BigInteger bigIntegerCrashlytics = AbstractC16784l.crashlytics(PSKKeyManager.MAX_KEY_LENGTH_BYTES, secureRandom);
            if (bigIntegerCrashlytics.signum() >= 1 && bigIntegerCrashlytics.compareTo(bigInteger) < 0 && AbstractC6660l.billing(bigIntegerCrashlytics) >= 64) {
                return new C18595l(new C9669l(bigInteger3.modPow(bigIntegerCrashlytics, bigInteger2), c0277l), new C4598l(bigIntegerCrashlytics, c0277l), 7);
            }
        }
    }

    @Override // defpackage.InterfaceC8145l
    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final void mo274throws(C14785l c14785l) {
        C10775l c10775l = (C10775l) c14785l;
        this.f1010l = c10775l;
        AbstractC16336l.purchase(c10775l.f21798l.f1277l);
        C0277l c0277l = this.f1010l.f21798l;
        ((C5911l) AbstractC8776l.purchase.get()).getClass();
    }
}
