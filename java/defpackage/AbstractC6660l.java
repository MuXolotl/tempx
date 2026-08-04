package defpackage;

import android.net.Uri;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: lؙۖؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6660l implements InterfaceC0643l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final C4733l f14007l = new C4733l(C16816l.class, new C14377l(11));

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C8873l f14006l = new C8873l("type.googleapis.com/google.crypto.tink.AesGcmKey", new C14377l(12));

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C5773l f14003l = new C5773l(C18441l.class, new C14377l(13));

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C9439l f14009l = new C9439l("type.googleapis.com/google.crypto.tink.AesGcmKey", new C14377l(14));

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final int[] f14008l = {13, 41, 121, 337, 897, 2305};

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final byte[] f14010l = new byte[0];

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final int[] f14004l = new int[0];

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final AbstractC8859l[] f14005l = new AbstractC8859l[0];

    public static C16556l admob(AbstractC8859l abstractC8859l, int i) {
        AbstractC11918l abstractC11918l = abstractC8859l.yandex;
        return (C16556l) abstractC11918l.adcel(abstractC8859l, "bc_wnaf", new C13698l(i, abstractC8859l, abstractC11918l));
    }

    public static void amazon(AbstractC8859l abstractC8859l) {
        AbstractC11918l abstractC11918l = abstractC8859l.yandex;
        if (abstractC11918l == null) {
            return;
        }
        BigInteger bigInteger = abstractC11918l.amazon;
        abstractC11918l.adcel(abstractC8859l, "bc_wnaf", new C14513l(Math.min(16, mopub(bigInteger == null ? abstractC11918l.smaato() + 1 : bigInteger.bitLength(), 16, f14008l) + 3), 23, (byte) 0));
    }

    public static int billing(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return 0;
        }
        return bigInteger.shiftLeft(1).add(bigInteger).xor(bigInteger).bitCount();
    }

    public static int crashlytics(long j, long j2) {
        long j3 = j - Long.MIN_VALUE;
        long j4 = j2 - Long.MIN_VALUE;
        if (j3 < j4) {
            return -1;
        }
        return j3 == j4 ? 0 : 1;
    }

    public static C5138l firebase(C9358l c9358l) throws GeneralSecurityException {
        C5138l c5138l = C5138l.f11179l;
        if (c9358l == C9358l.crashlytics) {
            return C5138l.f11176l;
        }
        if (c9358l == C9358l.billing || c9358l == C9358l.amazon) {
            return c5138l;
        }
        if (c9358l == C9358l.purchase) {
            return C5138l.f11178l;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(c9358l)));
    }

    public static C9358l isPro(C5138l c5138l) {
        if (c5138l.equals(C5138l.f11176l)) {
            return C9358l.crashlytics;
        }
        if (c5138l == C5138l.f11179l) {
            return C9358l.billing;
        }
        if (c5138l == C5138l.f11178l) {
            return C9358l.purchase;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c5138l)));
    }

    public static int mopub(int i, int i2, int[] iArr) {
        int i3 = 0;
        while (i3 < iArr.length && i >= iArr[i3]) {
            i3++;
        }
        return Math.max(2, Math.min(i2, i3 + 2));
    }

    public static byte[] purchase(int i, BigInteger bigInteger) {
        if (i == 2) {
            if (bigInteger.signum() != 0) {
                BigInteger bigIntegerAdd = bigInteger.shiftLeft(1).add(bigInteger);
                int iBitLength = bigIntegerAdd.bitLength();
                int i2 = iBitLength - 1;
                byte[] bArr = new byte[i2];
                BigInteger bigIntegerXor = bigIntegerAdd.xor(bigInteger);
                int i3 = 1;
                while (i3 < i2) {
                    if (bigIntegerXor.testBit(i3)) {
                        bArr[i3 - 1] = (byte) (bigInteger.testBit(i3) ? -1 : 1);
                        i3++;
                    }
                    i3++;
                }
                bArr[iBitLength - 2] = 1;
                return bArr;
            }
        } else {
            if (i < 2 || i > 8) {
                C8339l.metrica("'width' must be in the range [2, 8]");
                return null;
            }
            if (bigInteger.signum() != 0) {
                int iBitLength2 = bigInteger.bitLength() + 1;
                byte[] bArr2 = new byte[iBitLength2];
                int i4 = 1 << i;
                int i5 = i4 - 1;
                int i6 = i4 >>> 1;
                int i7 = 0;
                int i8 = 0;
                boolean z = false;
                while (i7 <= bigInteger.bitLength()) {
                    if (bigInteger.testBit(i7) == z) {
                        i7++;
                    } else {
                        bigInteger = bigInteger.shiftRight(i7);
                        int iIntValue = bigInteger.intValue() & i5;
                        if (z) {
                            iIntValue++;
                        }
                        z = (iIntValue & i6) != 0;
                        if (z) {
                            iIntValue -= i4;
                        }
                        if (i8 > 0) {
                            i7--;
                        }
                        int i9 = i8 + i7;
                        bArr2[i9] = (byte) iIntValue;
                        i8 = i9 + 1;
                        i7 = i;
                    }
                }
                if (iBitLength2 <= i8) {
                    return bArr2;
                }
                byte[] bArr3 = new byte[i8];
                System.arraycopy(bArr2, 0, bArr3, 0, i8);
                return bArr3;
            }
        }
        return f14010l;
    }

    public static final InputStream remoteconfig(C1381l c1381l) {
        C2279l c2279lYandex = ((InterfaceC14033l) c1381l.f3513l).yandex((Uri) c1381l.f3514l);
        ArrayList arrayList = new ArrayList();
        arrayList.add(c2279lYandex);
        ArrayList arrayList2 = (ArrayList) c1381l.f3511l;
        if (!arrayList2.isEmpty()) {
            int i = C15737l.f30907l;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                throw AbstractC15560l.adcel(it);
            }
            C15737l c15737l = !arrayList3.isEmpty() ? new C15737l(c2279lYandex, arrayList3) : null;
            if (c15737l != null) {
                arrayList.add(c15737l);
            }
        }
        Iterator it2 = ((AbstractC1186l) c1381l.f3512l).iterator();
        if (!it2.hasNext()) {
            Collections.reverse(arrayList);
            return (InputStream) arrayList.get(0);
        }
        if (it2.next() != null) {
            C18725l.loadAd();
            return null;
        }
        throw null;
    }

    public static void smaato(C16816l c16816l) {
        int i = c16816l.crashlytics;
        int i2 = c16816l.loadAd;
        if (i != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", Integer.valueOf(c16816l.crashlytics)));
        }
        if (i2 != 12) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", Integer.valueOf(i2)));
        }
    }

    public static InterfaceC17242l subs(InterfaceC17242l interfaceC17242l, float f, InterfaceC6347l interfaceC6347l, boolean z, int i) {
        if ((i & 2) != 0) {
            interfaceC6347l = AbstractC16837l.yandex;
        }
        InterfaceC6347l interfaceC6347l2 = interfaceC6347l;
        if ((i & 4) != 0) {
            z = C14467l.yandex(f, 0.0f) > 0;
        }
        boolean z2 = z;
        long j = AbstractC4239l.yandex;
        return (C14467l.yandex(f, 0.0f) > 0 || z2) ? interfaceC17242l.premium(new C4245l(f, interfaceC6347l2, z2, j, j)) : interfaceC17242l;
    }

    public static final float yandex(C17308l c17308l, float f, float f2) {
        InterfaceC18080l interfaceC18080l = c17308l.yandex;
        C11951l c11951l = new C11951l(0.0f);
        int iLoadAd = c11951l.loadAd();
        int i = 0;
        while (i < iLoadAd) {
            c11951l.purchase(i, interfaceC18080l.adcel(i == 0 ? f : 0.0f, i == 0 ? f2 : 0.0f));
            i++;
        }
        return c11951l.yandex;
    }
}
