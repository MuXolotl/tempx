package defpackage;

import androidx.car.app.model.Alert;
import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: renamed from: lؒۜٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1342l extends AbstractC11861l {
    public static final BigInteger firebase;
    public static final BigInteger isPro = C3515l.f7407l;
    public static final AbstractC2426l[] remoteconfig;
    public static final BigInteger smaato;
    public final C15213l subs;

    static {
        BigInteger bigInteger = new BigInteger(1, AbstractC8535l.crashlytics("2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA984914A144"));
        firebase = bigInteger;
        smaato = new BigInteger(1, AbstractC8535l.crashlytics("7B425ED097B425ED097B425ED097B425ED097B425ED097B4260B5E9C7710C864"));
        remoteconfig = new AbstractC2426l[]{new C3515l(InterfaceC11695l.startapp), new C3515l(bigInteger)};
    }

    public C1342l() {
        super(isPro);
        AbstractC2426l abstractC2426l = null;
        this.subs = new C15213l(this, abstractC2426l, abstractC2426l, 0);
        this.loadAd = new C3515l(firebase);
        this.crashlytics = new C3515l(smaato);
        this.amazon = new BigInteger(1, AbstractC8535l.crashlytics("1000000000000000000000000000000014DEF9DEA2F79CD65812631A5CF5D3ED"));
        this.purchase = BigInteger.valueOf(8L);
        this.billing = 4;
    }

    @Override // defpackage.AbstractC11861l
    public final BigInteger Signature() {
        return isPro;
    }

    @Override // defpackage.AbstractC11861l, defpackage.AbstractC11918l
    public final AbstractC2426l ads(SecureRandom secureRandom) {
        int[] iArr = new int[8];
        do {
            byte[] bArr = new byte[32];
            do {
                secureRandom.nextBytes(bArr);
                AbstractC10000l.adcel(bArr, 0, iArr, 0, 8);
                iArr[7] = iArr[7] & Alert.DURATION_SHOW_INDEFINITELY;
            } while (AbstractC4952l.ad(8, iArr, AbstractC0714l.yandex) == 0);
        } while (AbstractC4952l.smaato(iArr, 8) != 0);
        return new C3515l(iArr);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l billing(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2, AbstractC2426l[] abstractC2426lArr) {
        return new C15213l(this, abstractC2426l, abstractC2426l2, abstractC2426lArr, 0);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC2426l isPro(BigInteger bigInteger) {
        return new C3515l(bigInteger);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC17780l loadAd(AbstractC8859l[] abstractC8859lArr, int i) {
        int[] iArr = new int[i * 16];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            AbstractC8859l abstractC8859l = abstractC8859lArr[i4];
            AbstractC5998l.mopub(i3, ((C3515l) abstractC8859l.loadAd).f7408l, iArr);
            AbstractC5998l.mopub(i3 + 8, ((C3515l) abstractC8859l.crashlytics).f7408l, iArr);
            i3 += 16;
        }
        return new C6345l(this, i, iArr, i2);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l purchase(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2) {
        return new C15213l(this, abstractC2426l, abstractC2426l2, 0);
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC8859l remoteconfig() {
        return this.subs;
    }

    @Override // defpackage.AbstractC11918l
    public final int smaato() {
        return isPro.bitLength();
    }

    @Override // defpackage.AbstractC11918l
    public final boolean subscription(int i) {
        return i == 4;
    }

    @Override // defpackage.AbstractC11918l
    public final AbstractC11918l yandex() {
        return new C1342l();
    }
}
