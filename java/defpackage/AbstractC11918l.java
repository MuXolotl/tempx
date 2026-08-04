package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Hashtable;

/* JADX INFO: renamed from: lِ٘۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11918l {
    public BigInteger amazon;
    public AbstractC2426l crashlytics;
    public AbstractC2426l loadAd;
    public BigInteger purchase;
    public final InterfaceC3340l yandex;
    public int billing = 0;
    public C2723l mopub = null;
    public AbstractC12754l admob = null;

    public AbstractC11918l(InterfaceC3340l interfaceC3340l) {
        this.yandex = interfaceC3340l;
    }

    public final InterfaceC14356l adcel(AbstractC8859l abstractC8859l, String str, InterfaceC7882l interfaceC7882l) {
        Hashtable hashtable;
        InterfaceC14356l interfaceC14356lAdmob;
        if (abstractC8859l == null || this != abstractC8859l.yandex) {
            C8339l.metrica("'point' must be non-null and on this curve");
            return null;
        }
        synchronized (abstractC8859l) {
            try {
                hashtable = abstractC8859l.purchase;
                if (hashtable == null) {
                    hashtable = new Hashtable(4);
                    abstractC8859l.purchase = hashtable;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (hashtable) {
            try {
                InterfaceC14356l interfaceC14356l = (InterfaceC14356l) hashtable.get(str);
                interfaceC14356lAdmob = interfaceC7882l.admob(interfaceC14356l);
                if (interfaceC14356lAdmob != interfaceC14356l) {
                    hashtable.put(str, interfaceC14356lAdmob);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC14356lAdmob;
    }

    public abstract AbstractC8859l admob(int i, BigInteger bigInteger);

    public abstract AbstractC2426l ads(SecureRandom secureRandom);

    public AbstractC8859l amazon(BigInteger bigInteger, BigInteger bigInteger2) {
        return purchase(isPro(bigInteger), isPro(bigInteger2));
    }

    public abstract AbstractC8859l billing(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2, AbstractC2426l[] abstractC2426lArr);

    public AbstractC12754l crashlytics() {
        C2723l c2723l = this.mopub;
        return c2723l instanceof C2723l ? new C4740l(this, c2723l) : new C16732l(1);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof AbstractC11918l) && subs((AbstractC11918l) obj);
        }
        return true;
    }

    public final int firebase() {
        return (smaato() + 7) / 8;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.crashlytics.signatures().hashCode(), 16) ^ (this.yandex.hashCode() ^ Integer.rotateLeft(this.loadAd.signatures().hashCode(), 8));
    }

    public abstract AbstractC2426l isPro(BigInteger bigInteger);

    public AbstractC17780l loadAd(AbstractC8859l[] abstractC8859lArr, int i) {
        int iFirebase = firebase();
        byte[] bArr = new byte[i * iFirebase * 2];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC8859l abstractC8859l = abstractC8859lArr[i3];
            AbstractC2426l abstractC2426l = abstractC8859l.loadAd;
            BigInteger bigIntegerSignatures = abstractC2426l.signatures();
            int iFirebase2 = abstractC2426l.firebase();
            BigInteger bigInteger = AbstractC16784l.yandex;
            byte[] byteArray = bigIntegerSignatures.toByteArray();
            if (byteArray.length == iFirebase2) {
                System.arraycopy(byteArray, 0, bArr, i2, iFirebase2);
            } else {
                int i4 = (byteArray[0] != 0 || byteArray.length == 1) ? 0 : 1;
                int length = byteArray.length - i4;
                if (length > iFirebase2) {
                    C8339l.metrica("standard length exceeded for value");
                    return null;
                }
                int i5 = (iFirebase2 - length) + i2;
                Arrays.fill(bArr, i2, i5, (byte) 0);
                System.arraycopy(byteArray, i4, bArr, i5, length);
            }
            int i6 = i2 + iFirebase;
            AbstractC2426l abstractC2426l2 = abstractC8859l.crashlytics;
            BigInteger bigIntegerSignatures2 = abstractC2426l2.signatures();
            int iFirebase3 = abstractC2426l2.firebase();
            byte[] byteArray2 = bigIntegerSignatures2.toByteArray();
            if (byteArray2.length == iFirebase3) {
                System.arraycopy(byteArray2, 0, bArr, i6, iFirebase3);
            } else {
                int i7 = (byteArray2[0] != 0 || byteArray2.length == 1) ? 0 : 1;
                int length2 = byteArray2.length - i7;
                if (length2 > iFirebase3) {
                    C8339l.metrica("standard length exceeded for value");
                    return null;
                }
                int i8 = (iFirebase3 - length2) + i6;
                Arrays.fill(bArr, i6, i8, (byte) 0);
                System.arraycopy(byteArray2, i7, bArr, i8, length2);
            }
            i2 = i6 + iFirebase;
        }
        return new C12045l(this, i, iFirebase, bArr);
    }

    public abstract boolean metrica(BigInteger bigInteger);

    public final AbstractC8859l mopub(byte[] bArr) {
        AbstractC8859l abstractC8859lRemoteconfig;
        int iFirebase = firebase();
        byte b = bArr[0];
        if (b != 0) {
            if (b == 2 || b == 3) {
                if (bArr.length != iFirebase + 1) {
                    C8339l.metrica("Incorrect length for compressed encoding");
                    return null;
                }
                abstractC8859lRemoteconfig = admob(b & 1, AbstractC16784l.billing(1, iFirebase, bArr));
                if (!abstractC8859lRemoteconfig.firebase(true, true)) {
                    C8339l.metrica("Invalid point");
                    return null;
                }
            } else if (b != 4) {
                if (b != 6 && b != 7) {
                    C18262l.startapp(Integer.toString(b, 16), "Invalid point encoding 0x");
                    return null;
                }
                if (bArr.length != (iFirebase * 2) + 1) {
                    C8339l.metrica("Incorrect length for hybrid encoding");
                    return null;
                }
                BigInteger bigIntegerBilling = AbstractC16784l.billing(1, iFirebase, bArr);
                BigInteger bigIntegerBilling2 = AbstractC16784l.billing(iFirebase + 1, iFirebase, bArr);
                if (bigIntegerBilling2.testBit(0) != (b == 7)) {
                    C8339l.metrica("Inconsistent Y coordinate in hybrid encoding");
                    return null;
                }
                abstractC8859lRemoteconfig = tapsense(bigIntegerBilling, bigIntegerBilling2);
            } else {
                if (bArr.length != (iFirebase * 2) + 1) {
                    C8339l.metrica("Incorrect length for uncompressed encoding");
                    return null;
                }
                abstractC8859lRemoteconfig = tapsense(AbstractC16784l.billing(1, iFirebase, bArr), AbstractC16784l.billing(iFirebase + 1, iFirebase, bArr));
            }
        } else {
            if (bArr.length != 1) {
                C8339l.metrica("Incorrect length for infinity encoding");
                return null;
            }
            abstractC8859lRemoteconfig = remoteconfig();
        }
        if (b == 0 || !abstractC8859lRemoteconfig.smaato()) {
            return abstractC8859lRemoteconfig;
        }
        C8339l.metrica("Invalid infinity encoding");
        return null;
    }

    public abstract AbstractC8859l purchase(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2);

    public abstract AbstractC8859l remoteconfig();

    public abstract int smaato();

    public final void startapp(AbstractC8859l[] abstractC8859lArr, int i, int i2, AbstractC2426l abstractC2426l) {
        if (i < 0 || i2 < 0 || i > abstractC8859lArr.length - i2) {
            C8339l.metrica("invalid range specified for 'points'");
            return;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            AbstractC8859l abstractC8859l = abstractC8859lArr[i + i3];
            if (abstractC8859l != null && this != abstractC8859l.yandex) {
                C8339l.metrica("'points' entries must be null or on this curve");
                return;
            }
        }
        int i4 = this.billing;
        if (i4 == 0 || i4 == 5) {
            if (abstractC2426l == null) {
                return;
            }
            C8339l.metrica("'iso' not valid for affine coordinates");
            return;
        }
        AbstractC2426l[] abstractC2426lArr = new AbstractC2426l[i2];
        int[] iArr = new int[i2];
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = i + i6;
            AbstractC8859l abstractC8859l2 = abstractC8859lArr[i7];
            if (abstractC8859l2 != null && (abstractC2426l != null || !abstractC8859l2.remoteconfig())) {
                abstractC2426lArr[i5] = abstractC8859l2.isPro();
                iArr[i5] = i7;
                i5++;
            }
        }
        if (i5 == 0) {
            return;
        }
        AbstractC2426l[] abstractC2426lArr2 = new AbstractC2426l[i5];
        abstractC2426lArr2[0] = abstractC2426lArr[0];
        int i8 = 0;
        while (true) {
            int i9 = i8 + 1;
            if (i9 >= i5) {
                break;
            }
            abstractC2426lArr2[i9] = abstractC2426lArr2[i8].startapp(abstractC2426lArr[i9]);
            i8 = i9;
        }
        if (abstractC2426l != null) {
            abstractC2426lArr2[i8] = abstractC2426lArr2[i8].startapp(abstractC2426l);
        }
        AbstractC2426l abstractC2426lRemoteconfig = abstractC2426lArr2[i8].remoteconfig();
        while (i8 > 0) {
            int i10 = i8 - 1;
            AbstractC2426l abstractC2426l2 = abstractC2426lArr[i8];
            abstractC2426lArr[i8] = abstractC2426lArr2[i10].startapp(abstractC2426lRemoteconfig);
            abstractC2426lRemoteconfig = abstractC2426lRemoteconfig.startapp(abstractC2426l2);
            i8 = i10;
        }
        abstractC2426lArr[0] = abstractC2426lRemoteconfig;
        for (int i11 = 0; i11 < i5; i11++) {
            int i12 = iArr[i11];
            abstractC8859lArr[i12] = abstractC8859lArr[i12].adcel(abstractC2426lArr[i11]);
        }
    }

    public final boolean subs(AbstractC11918l abstractC11918l) {
        if (this != abstractC11918l) {
            return abstractC11918l != null && this.yandex.equals(abstractC11918l.yandex) && this.loadAd.signatures().equals(abstractC11918l.loadAd.signatures()) && this.crashlytics.signatures().equals(abstractC11918l.crashlytics.signatures());
        }
        return true;
    }

    public abstract boolean subscription(int i);

    public final AbstractC8859l tapsense(BigInteger bigInteger, BigInteger bigInteger2) {
        AbstractC8859l abstractC8859lAmazon = amazon(bigInteger, bigInteger2);
        if (abstractC8859lAmazon.firebase(false, true)) {
            return abstractC8859lAmazon;
        }
        C8339l.metrica("Invalid point coordinates");
        return null;
    }

    public AbstractC8859l vip(AbstractC8859l abstractC8859l) {
        if (this == abstractC8859l.yandex) {
            return abstractC8859l;
        }
        if (abstractC8859l.smaato()) {
            return remoteconfig();
        }
        AbstractC8859l abstractC8859lStartapp = abstractC8859l.startapp();
        return amazon(abstractC8859lStartapp.loadAd.signatures(), abstractC8859lStartapp.subs().signatures());
    }

    public abstract AbstractC11918l yandex();
}
