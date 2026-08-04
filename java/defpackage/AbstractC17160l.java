package defpackage;

import java.io.IOException;
import java.math.BigInteger;
import java.util.HashSet;

/* JADX INFO: renamed from: lِٖٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17160l {
    public static final HashSet yandex;

    static {
        HashSet hashSet = new HashSet(5);
        yandex = hashSet;
        hashSet.add(InterfaceC11987l.subscription);
        hashSet.add(InterfaceC11987l.tapsense);
        hashSet.add(InterfaceC11987l.Signature);
        hashSet.add(InterfaceC11987l.license);
        hashSet.add(InterfaceC11987l.pro);
    }

    public static C2756l yandex(AbstractC8831l abstractC8831l, Cinterface cinterface) throws IOException {
        C7130l c7130l;
        int iBitLength;
        Cfor cfor;
        if (abstractC8831l instanceof C6963l) {
            C6554l c6554l = (C6554l) abstractC8831l;
            return new C2756l(new C10198l(InterfaceC0543l.f1922throw, C14998l.f29509l), new C15860l(c6554l.f14630l, c6554l.f13683l, c6554l.f14629l, c6554l.f13679l, c6554l.f13680l, c6554l.f13682l, c6554l.f13681l, c6554l.f13684l), cinterface, (byte[]) null);
        }
        if (abstractC8831l instanceof C13649l) {
            C13649l c13649l = (C13649l) abstractC8831l;
            C12933l c12933l = (C12933l) c13649l.f16541l;
            return new C2756l(new C10198l(InterfaceC15427l.f30177l, new C15281l(c12933l.f25380l, c12933l.f25381l, c12933l.f25382l)), new Cstrictfp(c13649l.f26673l), cinterface, (byte[]) null);
        }
        int i = 0;
        if (abstractC8831l instanceof C8374l) {
            C8374l c8374l = (C8374l) abstractC8831l;
            BigInteger bigInteger = c8374l.f17335l;
            C7838l c7838l = c8374l.f4542l;
            if (c7838l == null) {
                c7130l = new C7130l();
                iBitLength = bigInteger.bitLength();
            } else {
                BigInteger bigInteger2 = c7838l.f16362l;
                if (c7838l instanceof C6895l) {
                    C6895l c6895l = (C6895l) c7838l;
                    Cfor cfor2 = c6895l.f14435l;
                    C13777l c13777l = new C13777l(cfor2, c6895l.f14437l, c6895l.f14436l);
                    boolean zContains = yandex.contains(cfor2);
                    int i2 = 32;
                    if (zContains) {
                        cfor = InterfaceC11987l.smaato;
                    } else {
                        boolean z = bigInteger.bitLength() > 256;
                        Cfor cfor3 = z ? InterfaceC18410l.billing : InterfaceC18410l.purchase;
                        i2 = z ? 64 : 32;
                        cfor = cfor3;
                    }
                    byte[] bArr = new byte[i2];
                    byte[] byteArray = bigInteger.toByteArray();
                    if (byteArray.length < i2) {
                        byte[] bArr2 = new byte[i2];
                        System.arraycopy(byteArray, 0, bArr2, i2 - byteArray.length, byteArray.length);
                        byteArray = bArr2;
                    }
                    while (i != i2) {
                        bArr[i] = byteArray[(byteArray.length - 1) - i];
                        i++;
                    }
                    return new C2756l(new C10198l(cfor, c13777l), new C11327l(bArr), (Cinterface) null, (byte[]) null);
                }
                c7130l = c7838l instanceof C2542l ? new C7130l(((C2542l) c7838l).f5539l) : new C7130l(new C7100l(c7838l.f16360l, new C16217l(c7838l.f16358l, false), c7838l.f16362l, c7838l.f16361l, AbstractC14024l.crashlytics(c7838l.f16359l)));
                iBitLength = bigInteger2.bitLength();
            }
            return new C2756l(new C10198l(InterfaceC15427l.f30173l, c7130l), new C7154l(iBitLength, bigInteger, new C13353l(new C16732l(i).loadAd(c7838l.f16358l, bigInteger).admob(false), 0), c7130l), cinterface, (byte[]) null);
        }
        if (abstractC8831l instanceof C8729l) {
            C8729l c8729l = (C8729l) abstractC8831l;
            byte[] bArr3 = c8729l.f17958l;
            C10198l c10198l = new C10198l((Cfor) AbstractC14907l.crashlytics.get((C13812l) c8729l.f16541l));
            int i3 = c8729l.f17963l;
            if (i3 == 1) {
                return new C2756l(c10198l, new C9320l(2, 128, 0, new C11327l(AbstractC14024l.crashlytics(bArr3))), cinterface, (byte[]) null);
            }
            if (i3 == 2) {
                return new C2756l(c10198l, new C11327l(c8729l.getEncoded()), cinterface, (byte[]) null);
            }
            C11138l c11138l = new C11138l(new C11327l(AbstractC14024l.crashlytics(bArr3)), new C11327l(c8729l.getEncoded()));
            c11138l.f22357l = -1;
            return new C2756l(c10198l, c11138l, cinterface, (byte[]) null);
        }
        if (abstractC8831l instanceof C10146l) {
            C10146l c10146l = (C10146l) abstractC8831l;
            byte[] bArr4 = c10146l.f20658l;
            C10198l c10198l2 = new C10198l((Cfor) AbstractC14907l.yandex.get((C18493l) c10146l.f16541l));
            int i4 = c10146l.f20661l;
            if (i4 == 1) {
                return new C2756l(c10198l2, new C9320l(2, 128, 0, new C11327l(AbstractC14024l.crashlytics(bArr4))), cinterface, (byte[]) null);
            }
            if (i4 == 2) {
                return new C2756l(c10198l2, new C11327l(c10146l.getEncoded()), cinterface, (byte[]) null);
            }
            C11138l c11138l2 = new C11138l(new C11327l(AbstractC14024l.crashlytics(bArr4)), new C11327l(c10146l.getEncoded()));
            c11138l2.f22357l = -1;
            return new C2756l(c10198l2, c11138l2, cinterface, (byte[]) null);
        }
        if (abstractC8831l instanceof C1180l) {
            C1180l c1180l = (C1180l) abstractC8831l;
            return new C2756l(new C10198l((Cfor) AbstractC14907l.purchase.get((C18097l) c1180l.f16541l)), c1180l.getEncoded(), cinterface, (byte[]) null);
        }
        if (abstractC8831l instanceof C16638l) {
            C16638l c16638l = (C16638l) abstractC8831l;
            return new C2756l(new C10198l(InterfaceC2716l.loadAd), new C11327l(AbstractC14024l.crashlytics(c16638l.f32614l)), cinterface, AbstractC14024l.crashlytics(c16638l.yandex().f28737l));
        }
        if (abstractC8831l instanceof C16244l) {
            C16244l c16244l = (C16244l) abstractC8831l;
            return new C2756l(new C10198l(InterfaceC2716l.yandex), new C11327l(AbstractC14024l.crashlytics(c16244l.f31795l)), cinterface, AbstractC14024l.crashlytics(c16244l.yandex().f30601l));
        }
        if (!(abstractC8831l instanceof C9298l)) {
            if (abstractC8831l instanceof C1438l) {
                C1438l c1438l = (C1438l) abstractC8831l;
                return new C2756l(new C10198l(InterfaceC2716l.crashlytics), new C11327l(AbstractC14024l.crashlytics(c1438l.f3621l)), cinterface, c1438l.yandex().getEncoded());
            }
            C18262l.metrica("key parameters not recognized");
            return null;
        }
        C9298l c9298l = (C9298l) abstractC8831l;
        C10198l c10198l3 = new C10198l(InterfaceC2716l.amazon);
        C11327l c11327l = new C11327l(AbstractC14024l.crashlytics(c9298l.f19108l));
        byte[] bArr5 = new byte[57];
        AbstractC15960l.billing(c9298l.yandex().f22309l, bArr5, 0);
        return new C2756l(c10198l3, c11327l, cinterface, bArr5);
    }
}
