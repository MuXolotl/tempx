package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.HashSet;

/* JADX INFO: renamed from: lؙْٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6432l {
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

    public static void loadAd(byte[] bArr, int i, int i2, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(byteArray, 0, bArr2, i - byteArray.length, byteArray.length);
            byteArray = bArr2;
        }
        for (int i3 = 0; i3 != i; i3++) {
            bArr[i2 + i3] = byteArray[(byteArray.length - 1) - i3];
        }
    }

    public static C17029l yandex(AbstractC8831l abstractC8831l) throws IOException {
        C7130l c7130l;
        Cfor cfor;
        if (abstractC8831l instanceof C6963l) {
            C6963l c6963l = (C6963l) abstractC8831l;
            return new C17029l(new C10198l(InterfaceC0543l.f1922throw, C14998l.f29509l), new C5199l(c6963l.f14630l, c6963l.f14629l));
        }
        if (abstractC8831l instanceof C4124l) {
            C4124l c4124l = (C4124l) abstractC8831l;
            return new C17029l(new C10198l((Cfor) AbstractC14907l.crashlytics.get((C13812l) c4124l.f16541l)), c4124l.getEncoded());
        }
        if (abstractC8831l instanceof C1658l) {
            C1658l c1658l = (C1658l) abstractC8831l;
            return new C17029l(new C10198l((Cfor) AbstractC14907l.yandex.get((C18493l) c1658l.f16541l)), AbstractC14024l.mopub(c1658l.f4002l, c1658l.f4003l));
        }
        if (abstractC8831l instanceof C9314l) {
            C9314l c9314l = (C9314l) abstractC8831l;
            return new C17029l(new C10198l((Cfor) AbstractC14907l.purchase.get((C18097l) c9314l.f16541l)), c9314l.getEncoded());
        }
        if (abstractC8831l instanceof C4767l) {
            C4767l c4767l = (C4767l) abstractC8831l;
            C12933l c12933l = (C12933l) c4767l.f16541l;
            return new C17029l(new C10198l(InterfaceC15427l.f30177l, c12933l != null ? new C15281l(c12933l.f25380l, c12933l.f25381l, c12933l.f25382l) : null), new Cstrictfp(c4767l.f9785l));
        }
        if (abstractC8831l instanceof C4148l) {
            C4148l c4148l = (C4148l) abstractC8831l;
            AbstractC8859l abstractC8859l = c4148l.f8515l;
            C7838l c7838l = c4148l.f4542l;
            if (c7838l == null) {
                c7130l = new C7130l();
            } else {
                if (c7838l instanceof C6895l) {
                    C6895l c6895l = (C6895l) c7838l;
                    abstractC8859l.loadAd();
                    BigInteger bigIntegerSignatures = abstractC8859l.loadAd.signatures();
                    BigInteger bigIntegerSignatures2 = abstractC8859l.purchase().signatures();
                    Cfor cfor2 = c6895l.f14435l;
                    C13777l c13777l = new C13777l(cfor2, c6895l.f14437l);
                    boolean zContains = yandex.contains(cfor2);
                    int i = 32;
                    int i2 = 64;
                    if (zContains) {
                        cfor = InterfaceC11987l.smaato;
                    } else if (bigIntegerSignatures.bitLength() > 256) {
                        cfor = InterfaceC18410l.billing;
                        i2 = 128;
                        i = 64;
                    } else {
                        cfor = InterfaceC18410l.purchase;
                    }
                    byte[] bArr = new byte[i2];
                    int i3 = i2 / 2;
                    loadAd(bArr, i3, 0, bigIntegerSignatures);
                    loadAd(bArr, i3, i, bigIntegerSignatures2);
                    try {
                        return new C17029l(new C10198l(cfor, c13777l), new C11327l(bArr));
                    } catch (IOException unused) {
                        return null;
                    }
                }
                c7130l = c7838l instanceof C2542l ? new C7130l(((C2542l) c7838l).f5539l) : new C7130l(new C7100l(c7838l.f16360l, new C16217l(c7838l.f16358l, false), c7838l.f16362l, c7838l.f16361l, AbstractC14024l.crashlytics(c7838l.f16359l)));
            }
            return new C17029l(new C10198l(InterfaceC15427l.f30173l, c7130l), abstractC8859l.admob(false));
        }
        if (abstractC8831l instanceof C14685l) {
            return new C17029l(new C10198l(InterfaceC2716l.loadAd), AbstractC14024l.crashlytics(((C14685l) abstractC8831l).f28737l));
        }
        if (abstractC8831l instanceof C15654l) {
            return new C17029l(new C10198l(InterfaceC2716l.yandex), AbstractC14024l.crashlytics(((C15654l) abstractC8831l).f30601l));
        }
        if (abstractC8831l instanceof C11104l) {
            C10198l c10198l = new C10198l(InterfaceC2716l.amazon);
            byte[] bArr2 = new byte[57];
            AbstractC15960l.billing(((C11104l) abstractC8831l).f22309l, bArr2, 0);
            return new C17029l(c10198l, bArr2);
        }
        if (abstractC8831l instanceof C6254l) {
            return new C17029l(new C10198l(InterfaceC2716l.crashlytics), ((C6254l) abstractC8831l).getEncoded());
        }
        if (abstractC8831l instanceof C15082l) {
            C15082l c15082l = (C15082l) abstractC8831l;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i4 = c15082l.f29612l;
            byteArrayOutputStream.write((byte) (i4 >>> 24));
            byteArrayOutputStream.write((byte) (i4 >>> 16));
            byteArrayOutputStream.write((byte) (i4 >>> 8));
            byteArrayOutputStream.write((byte) i4);
            try {
                byteArrayOutputStream.write(c15082l.f29611l.loadAd());
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return new C17029l(new C10198l(InterfaceC0543l.f1892l), AbstractC14024l.mopub(new byte[]{4, (byte) byteArray.length}, byteArray));
            } catch (Exception e) {
                C18073l.Signature(e.getMessage(), e);
                return null;
            }
        }
        if (!(abstractC8831l instanceof C3952l)) {
            C18262l.metrica("key parameters not recognized");
            return null;
        }
        C3952l c3952l = (C3952l) abstractC8831l;
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        byteArrayOutputStream2.write(0);
        byteArrayOutputStream2.write(0);
        byteArrayOutputStream2.write(0);
        byteArrayOutputStream2.write(1);
        try {
            byteArrayOutputStream2.write(c3952l.loadAd());
            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
            return new C17029l(new C10198l(InterfaceC0543l.f1892l), AbstractC14024l.mopub(new byte[]{4, (byte) byteArray2.length}, byteArray2));
        } catch (Exception e2) {
            C18073l.Signature(e2.getMessage(), e2);
            return null;
        }
    }
}
