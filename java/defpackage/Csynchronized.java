package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: synchronized, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class Csynchronized extends FilterInputStream {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[][] f36584l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final boolean f36585l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f36586l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f36587l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f36588l;

    public Csynchronized(InputStream inputStream, int i, boolean z) {
        super(inputStream);
        this.f36586l = i;
        this.f36585l = z;
        this.f36584l = new byte[11][];
        this.f36588l = 0;
        this.f36587l = AbstractC8151l.yandex(32, "org.bouncycastle.asn1.max_cons_depth");
    }

    public static int adcel(InputStream inputStream, int i, boolean z) {
        String strPremium;
        int i2 = inputStream.read();
        if ((i2 >>> 7) == 0) {
            return i2;
        }
        if (128 == i2) {
            return -1;
        }
        if (i2 < 0) {
            throw new EOFException("EOF found when length expected");
        }
        if (255 != i2) {
            int i3 = i2 & 127;
            int i4 = 0;
            int i5 = 0;
            do {
                int i6 = inputStream.read();
                if (i6 < 0) {
                    throw new EOFException("EOF found reading length");
                }
                if ((i4 >>> 23) == 0) {
                    i4 = (i4 << 8) + i6;
                    i5++;
                } else {
                    strPremium = "long form definite-length more than 31 bits";
                }
            } while (i5 < i3);
            if (i4 < i || z) {
                return i4;
            }
            strPremium = AbstractC12589l.premium(i4, i, "corrupted stream - out of bounds length found: ", " >= ");
        } else {
            strPremium = "invalid long form definite-length 0xFF";
        }
        C18262l.metrica(strPremium);
        return 0;
    }

    public static Ccase billing(int i, C9774l c9774l, byte[][] bArr) throws IOException {
        int i2 = 0;
        try {
            switch (i) {
                case 1:
                    return signatures.premium(vip(c9774l, bArr));
                case 2:
                    return new Cstrictfp(c9774l.billing());
                case 3:
                    return advert.premium(c9774l.billing());
                case 4:
                    return new C11327l(c9774l.billing());
                case 5:
                    if (c9774l.f19918l == 0) {
                        return C14998l.f29509l;
                    }
                    throw new IllegalStateException("malformed NULL encoding encountered");
                case 6:
                    Cfor.applovin(c9774l.f19918l);
                    return Cfor.appmetrica(true, vip(c9774l, bArr));
                case 7:
                    return new Cprivate(new C3569l(c9774l.billing()));
                case 8:
                case 9:
                case 11:
                case 15:
                case 16:
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                default:
                    throw new IOException("unknown tag " + i + " encountered");
                case 10:
                    return inmobi.premium(true, vip(c9774l, bArr));
                case 12:
                    return new C17283l(c9774l.billing());
                case 13:
                    int i3 = c9774l.f19918l;
                    ad adVar = Cswitch.f36580l;
                    if (i3 <= 4096) {
                        return Cswitch.premium(true, vip(c9774l, bArr));
                    }
                    throw new IllegalArgumentException("exceeded relative OID contents length limit");
                case 14:
                case 31:
                case 32:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    throw new IOException("unsupported tag " + i + " encountered");
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    return new C7793l(c9774l.billing());
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    return new C5876l(c9774l.billing());
                case 20:
                    return new C6057l(c9774l.billing());
                case 21:
                    return new C1929l(c9774l.billing());
                case 22:
                    return new C10604l(c9774l.billing());
                case 23:
                    return new Cnew(c9774l.billing());
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    return new Cpackage(c9774l.billing());
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    return new C3569l(c9774l.billing());
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    return new C10336l(c9774l.billing());
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    return new C15324l(c9774l.billing());
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    return new C2761l(c9774l.billing());
                case 30:
                    return new C11172l(mopub(c9774l));
            }
        } catch (IllegalArgumentException e) {
            throw new Cthrows(e.getMessage(), e, i2);
        } catch (IllegalStateException e2) {
            throw new Cthrows(e2.getMessage(), e2, i2);
        }
    }

    public static int isVip(InputStream inputStream, int i) {
        String str;
        int i2 = i & 31;
        if (i2 != 31) {
            return i2;
        }
        int i3 = inputStream.read();
        if (i3 >= 31) {
            int i4 = i3 & 127;
            if (i4 != 0) {
                while ((i3 & 128) != 0) {
                    if ((i4 >>> 24) == 0) {
                        int i5 = i4 << 7;
                        int i6 = inputStream.read();
                        if (i6 < 0) {
                            throw new EOFException("EOF found inside tag value.");
                        }
                        i4 = i5 | (i6 & 127);
                        i3 = i6;
                    } else {
                        str = "Tag number more than 31 bits";
                    }
                }
                return i4;
            }
            str = "corrupted stream - invalid high tag number found";
        } else {
            if (i3 < 0) {
                throw new EOFException("EOF found inside tag value.");
            }
            str = "corrupted stream - high tag number < 31 found";
        }
        C18262l.metrica(str);
        return 0;
    }

    public static char[] mopub(C9774l c9774l) throws IOException {
        int i = c9774l.f19918l;
        if ((i & 1) != 0) {
            C18262l.metrica("malformed BMPString encoding encountered");
            return null;
        }
        int i2 = i / 2;
        char[] cArr = new char[i2];
        byte[] bArr = new byte[8];
        int i3 = 0;
        int i4 = 0;
        while (i >= 8) {
            if (AbstractC7016l.amazon(c9774l, bArr, 0, 8) != 8) {
                throw new EOFException("EOF encountered in middle of BMPString");
            }
            cArr[i4] = (char) ((bArr[0] << 8) | (bArr[1] & 255));
            cArr[i4 + 1] = (char) ((bArr[2] << 8) | (bArr[3] & 255));
            cArr[i4 + 2] = (char) ((bArr[4] << 8) | (bArr[5] & 255));
            cArr[i4 + 3] = (char) ((bArr[6] << 8) | (bArr[7] & 255));
            i4 += 4;
            i -= 8;
        }
        if (i > 0) {
            if (AbstractC7016l.amazon(c9774l, bArr, 0, i) != i) {
                throw new EOFException("EOF encountered in middle of BMPString");
            }
            do {
                int i5 = i3 + 1;
                int i6 = bArr[i3] << 8;
                i3 += 2;
                cArr[i4] = (char) ((bArr[i5] & 255) | i6);
                i4++;
            } while (i3 < i);
        }
        if (c9774l.f19918l == 0 && i2 == i4) {
            return cArr;
        }
        C18073l.admob();
        return null;
    }

    public static byte[] vip(C9774l c9774l, byte[][] bArr) throws IOException {
        int i = c9774l.f19918l;
        if (i >= bArr.length) {
            return c9774l.billing();
        }
        byte[] bArr2 = bArr[i];
        if (bArr2 == null) {
            bArr2 = new byte[i];
            bArr[i] = bArr2;
        }
        if (i != bArr2.length) {
            C8339l.metrica("buffer length not right for data");
            return null;
        }
        if (i == 0) {
            return bArr2;
        }
        int i2 = c9774l.f21226l;
        if (i >= i2) {
            C3010l.isPro(c9774l.f19918l, i2, " >= ", "corrupted stream - out of bounds length found: ");
            return null;
        }
        int iAmazon = i - AbstractC7016l.amazon(c9774l.f21227l, bArr2, 0, bArr2.length);
        c9774l.f19918l = iAmazon;
        if (iAmazon == 0) {
            c9774l.yandex();
            return bArr2;
        }
        C3010l.subs(c9774l.f19917l, c9774l.f19918l);
        return null;
    }

    public final Ccase ads() {
        int i = read();
        if (i <= 0) {
            if (i != 0) {
                return null;
            }
            C18262l.metrica("unexpected end-of-contents marker");
            return null;
        }
        int iIsVip = isVip(this, i);
        int i2 = this.f36586l;
        int i3 = 0;
        int iAdcel = adcel(this, i2, false);
        if (iAdcel >= 0) {
            try {
                return yandex(i, iIsVip, iAdcel);
            } catch (IllegalArgumentException e) {
                throw new Cthrows("corrupted stream detected", e, i3);
            }
        }
        if ((i & 32) == 0) {
            C18262l.metrica("indefinite-length primitive encoding encountered");
            return null;
        }
        Cstatic cstatic = new Cstatic(new C18147l(this, i2), i2, this.f36584l);
        int i4 = i & 192;
        if (i4 != 0) {
            return cstatic.crashlytics(i4, iIsVip);
        }
        if (iIsVip == 3) {
            return C3027l.yandex(cstatic);
        }
        if (iIsVip == 4) {
            return new C6864l(AbstractC7016l.crashlytics(new C3135l(cstatic)), null);
        }
        if (iIsVip == 8) {
            return C2138l.yandex(cstatic);
        }
        if (iIsVip == 16) {
            return new C16472l(cstatic.purchase());
        }
        if (iIsVip == 17) {
            return new C1894l(cstatic.purchase(), false);
        }
        C18262l.metrica("unknown BER object encountered");
        return null;
    }

    public final appmetrica signatures(C9774l c9774l) throws IOException {
        int i = c9774l.f19918l;
        if (i < 1) {
            return new appmetrica(0, 0);
        }
        int i2 = this.f36588l;
        int i3 = this.f36587l;
        if (i2 == i3) {
            C18262l.metrica(AbstractC14814l.remoteconfig(this.f36587l, ")", new StringBuilder("maximum nested construction level reached - increase org.bouncycastle.asn1.max_cons_depth (currently ")));
            return null;
        }
        Csynchronized csynchronized = new Csynchronized(c9774l, i, this.f36585l, this.f36584l, i2 + 1, i3);
        Ccase ccaseAds = csynchronized.ads();
        if (ccaseAds == null) {
            return new appmetrica(0, 0);
        }
        appmetrica appmetricaVar = new appmetrica((byte) 0, 0);
        do {
            appmetricaVar.purchase(ccaseAds);
            ccaseAds = csynchronized.ads();
        } while (ccaseAds != null);
        return appmetricaVar;
    }

    public final Ccase yandex(int i, int i2, int i3) throws IOException {
        C9774l c9774l = new C9774l(this, i3, this.f36586l);
        if ((i & 224) == 0) {
            return billing(i2, c9774l, this.f36584l);
        }
        int i4 = i & 192;
        int i5 = 0;
        if (i4 != 0) {
            if ((i & 32) == 0) {
                return new C7332l(4, i4, i2, new C11327l(c9774l.billing()));
            }
            appmetrica appmetricaVarSignatures = signatures(c9774l);
            return appmetricaVarSignatures.f489l == 1 ? new C7332l(3, i4, i2, appmetricaVarSignatures.smaato(0)) : new C7332l(4, i4, i2, AbstractC16315l.yandex(appmetricaVarSignatures));
        }
        if (i2 == 3) {
            appmetrica appmetricaVarSignatures2 = signatures(c9774l);
            int i6 = appmetricaVarSignatures2.f489l;
            advert[] advertVarArr = new advert[i6];
            while (i5 != i6) {
                applovin applovinVarSmaato = appmetricaVarSignatures2.smaato(i5);
                if (!(applovinVarSmaato instanceof advert)) {
                    C3010l.firebase(applovinVarSmaato.getClass(), "unknown object encountered in constructed BIT STRING: ");
                    return null;
                }
                advertVarArr[i5] = (advert) applovinVarSmaato;
                i5++;
            }
            return new C3241l(advertVarArr);
        }
        if (i2 == 4) {
            appmetrica appmetricaVarSignatures3 = signatures(c9774l);
            int i7 = appmetricaVarSignatures3.f489l;
            Cthrow[] cthrowArr = new Cthrow[i7];
            while (i5 != i7) {
                applovin applovinVarSmaato2 = appmetricaVarSignatures3.smaato(i5);
                if (!(applovinVarSmaato2 instanceof Cthrow)) {
                    C3010l.firebase(applovinVarSmaato2.getClass(), "unknown object encountered in constructed OCTET STRING: ");
                    return null;
                }
                cthrowArr[i5] = (Cthrow) applovinVarSmaato2;
                i5++;
            }
            return new C6864l(C6864l.applovin(cthrowArr), cthrowArr);
        }
        if (i2 == 8) {
            return new C4848l(AbstractC16315l.yandex(signatures(c9774l)), 1);
        }
        if (i2 == 16) {
            if (c9774l.f19918l < 1) {
                return AbstractC16315l.yandex;
            }
            if (!this.f36585l) {
                return AbstractC16315l.yandex(signatures(c9774l));
            }
            byte[] bArrBilling = c9774l.billing();
            C1516l c1516l = new C1516l();
            c1516l.f3784l = bArrBilling;
            return c1516l;
        }
        if (i2 != 17) {
            C18262l.metrica(AbstractC15560l.tapsense("unknown tag ", i2, " encountered"));
            return null;
        }
        appmetrica appmetricaVarSignatures4 = signatures(c9774l);
        C3884l c3884l = AbstractC16315l.yandex;
        if (appmetricaVarSignatures4.f489l < 1) {
            return AbstractC16315l.loadAd;
        }
        C12609l c12609l = new C12609l(appmetricaVarSignatures4, false);
        c12609l.f24835l = -1;
        return c12609l;
    }

    public Csynchronized(InputStream inputStream) {
        this(inputStream, AbstractC2426l.subs(inputStream), false);
    }

    public Csynchronized(C9774l c9774l, int i, boolean z, byte[][] bArr, int i2, int i3) {
        super(c9774l);
        this.f36586l = i;
        this.f36585l = z;
        this.f36584l = bArr;
        this.f36588l = i2;
        this.f36587l = i3;
    }

    public Csynchronized(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length, false);
    }

    public Csynchronized(byte[] bArr, int i) {
        this(new ByteArrayInputStream(bArr), bArr.length, true);
    }
}
