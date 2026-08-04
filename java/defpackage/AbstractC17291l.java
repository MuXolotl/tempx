package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Array;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lْٗٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17291l {
    public static final C15578l yandex = new C15578l(-1609943566, false, new C11813l(16));
    public static final C15578l loadAd = new C15578l(-156161410, false, new C11813l(17));
    public static final C15578l crashlytics = new C15578l(-180454170, false, new C11813l(18));

    public static final void admob(C18476l c18476l, int i) {
        String strStartapp;
        if (i < 0 || i > 1114111) {
            StringBuilder sb = new StringBuilder("Code point value is out of Unicode codespace 0..0x10ffff: 0x");
            if (i != 0) {
                char[] cArr = AbstractC17463l.yandex;
                int i2 = 0;
                char c = cArr[0];
                char[] cArr2 = {c, c, c, c, c, c, cArr[(i >> 4) & 15], cArr[i & 15]};
                while (i2 < 8 && cArr2[i2] == '0') {
                    i2++;
                }
                strStartapp = AbstractC16648l.startapp(cArr2, i2, 8);
            } else {
                strStartapp = "0";
            }
            sb.append(strStartapp);
            sb.append(" (");
            sb.append(i);
            sb.append(')');
            throw new IllegalArgumentException(sb.toString());
        }
        if (i < 128) {
            c18476l.m4562synchronized((byte) i);
            return;
        }
        if (i < 2048) {
            C2139l c2139lInmobi = c18476l.inmobi(2);
            byte[] bArr = c2139lInmobi.yandex;
            int i3 = c2139lInmobi.crashlytics;
            bArr[i3] = (byte) ((i >> 6) | 192);
            bArr[i3 + 1] = (byte) ((i & 63) | 128);
            c2139lInmobi.crashlytics = i3 + 2;
            c18476l.f36079l += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            c18476l.m4562synchronized((byte) 63);
            return;
        }
        if (i < 65536) {
            C2139l c2139lInmobi2 = c18476l.inmobi(3);
            byte[] bArr2 = c2139lInmobi2.yandex;
            int i4 = c2139lInmobi2.crashlytics;
            bArr2[i4] = -32;
            bArr2[i4 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i4 + 2] = (byte) ((i & 63) | 128);
            c2139lInmobi2.crashlytics = i4 + 3;
            c18476l.f36079l += 3;
            return;
        }
        C2139l c2139lInmobi3 = c18476l.inmobi(4);
        byte[] bArr3 = c2139lInmobi3.yandex;
        int i5 = c2139lInmobi3.crashlytics;
        bArr3[i5] = -16;
        bArr3[i5 + 1] = -128;
        bArr3[i5 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i5 + 3] = (byte) ((i & 63) | 128);
        c2139lInmobi3.crashlytics = i5 + 4;
        c18476l.f36079l += 4;
    }

    public static final int amazon(C18476l c18476l) throws EOFException {
        int i;
        int i2;
        int i3;
        c18476l.subscription(1L);
        byte bYandex = c18476l.yandex(0L);
        if ((bYandex & 128) == 0) {
            i = bYandex & 127;
            i3 = 0;
            i2 = 1;
        } else if ((bYandex & 224) == 192) {
            i = bYandex & 31;
            i2 = 2;
            i3 = 128;
        } else if ((bYandex & 240) == 224) {
            i = bYandex & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((bYandex & 248) != 240) {
                c18476l.skip(1L);
                return 65533;
            }
            i = bYandex & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (c18476l.f36079l < j) {
            StringBuilder sbSignature = AbstractC2812l.Signature("size < ", i2, ": ");
            sbSignature.append(c18476l.f36079l);
            sbSignature.append(" (to read code point prefixed 0x");
            char[] cArr = AbstractC17463l.yandex;
            sbSignature.append(new String(new char[]{cArr[(bYandex >> 4) & 15], cArr[bYandex & 15]}));
            sbSignature.append(')');
            throw new EOFException(sbSignature.toString());
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte bYandex2 = c18476l.yandex(j2);
            if ((bYandex2 & 192) != 128) {
                c18476l.skip(j2);
                return 65533;
            }
            i = (i << 6) | (bYandex2 & 63);
        }
        c18476l.skip(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 > i || i >= 57344) && i >= i3) {
            return i;
        }
        return 65533;
    }

    public static String billing(C7615l c7615l, Integer num) {
        if (num == null) {
            return null;
        }
        try {
            if (num.intValue() == 1) {
                C10160l.yandex("0");
                Integer num2 = (Integer) ((C10861l) AbstractC14814l.amazon(c7615l, "0")).crashlytics(CameraCharacteristics.LENS_FACING);
                if (num2 != null && num2.intValue() == 1) {
                    return "1";
                }
            } else if (num.intValue() == 0) {
                C10160l.yandex("1");
                Integer num3 = (Integer) ((C10861l) AbstractC14814l.amazon(c7615l, "1")).crashlytics(CameraCharacteristics.LENS_FACING);
                if (num3 != null && num3.intValue() == 0) {
                    return "0";
                }
            }
            return null;
        } catch (C6422l unused) {
            if (!AbstractC5088l.smaato()) {
                return null;
            }
            Log.e("CXCP", "Received Do Not Disturb exception while deciding camera id to skip. Please turn off Do Not Disturb mode");
            return null;
        }
    }

    public static final String crashlytics(C18476l c18476l, long j) {
        if (j == 0) {
            return "";
        }
        C2139l c2139l = c18476l.f36081l;
        if (c2139l == null) {
            C8339l.smaato("Unreacheable");
            return null;
        }
        if (c2139l.loadAd() < j) {
            byte[] bArrAdmob = AbstractC10733l.admob(c18476l, (int) j);
            return AbstractC14460l.mopub(0, bArrAdmob.length, bArrAdmob);
        }
        byte[] bArr = c2139l.yandex;
        int i = c2139l.loadAd;
        String strMopub = AbstractC14460l.mopub(i, Math.min(c2139l.crashlytics, ((int) j) + i), bArr);
        c18476l.skip(j);
        return strMopub;
    }

    public static C7035l loadAd(InterfaceC9473l interfaceC9473l, AbstractC5921l abstractC5921l) {
        return new C7035l(interfaceC9473l, abstractC5921l, null);
    }

    public static final String mopub(InterfaceC14189l interfaceC14189l) {
        interfaceC14189l.request(Long.MAX_VALUE);
        return crashlytics(interfaceC14189l.crashlytics(), interfaceC14189l.crashlytics().f36079l);
    }

    public static C2756l purchase(AbstractC8831l abstractC8831l, Cinterface cinterface) throws IOException {
        int i;
        int i2;
        byte[] bArr;
        byte[][] bArr2;
        int i3;
        C6754l c6754l;
        int i4;
        long jSubscription;
        int i5;
        int i6;
        C3952l c3952lBilling;
        if (abstractC8831l instanceof C10075l) {
            C10075l c10075l = (C10075l) abstractC8831l;
            return new C2756l(new C10198l(InterfaceC13726l.yandex, new C18507l(AbstractC3983l.amazon(c10075l.f25990l))), new C11327l(AbstractC14024l.crashlytics(c10075l.f20551l)), (Cinterface) null, (byte[]) null);
        }
        if (abstractC8831l instanceof C11529l) {
            C10198l c10198l = new C10198l(InterfaceC13726l.loadAd);
            short[] sArrBilling = AbstractC14024l.billing(((C11529l) abstractC8831l).f23187l);
            byte[] bArr3 = new byte[sArrBilling.length * 2];
            for (int i7 = 0; i7 != sArrBilling.length; i7++) {
                short s = sArrBilling[i7];
                int i8 = i7 * 2;
                bArr3[i8] = (byte) s;
                bArr3[i8 + 1] = (byte) (s >>> 8);
            }
            return new C2756l(c10198l, new C11327l(bArr3), (Cinterface) null, (byte[]) null);
        }
        if (abstractC8831l instanceof C13291l) {
            C13291l c13291l = (C13291l) abstractC8831l;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(1);
            try {
                byteArrayOutputStream.write(c13291l.getEncoded());
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                byteArrayOutputStream2.write(0);
                byteArrayOutputStream2.write(0);
                byteArrayOutputStream2.write(0);
                byteArrayOutputStream2.write(1);
                try {
                    byteArrayOutputStream2.write(c13291l.billing().loadAd());
                    return new C2756l(new C10198l(InterfaceC0543l.f1892l), new C11327l(byteArray), cinterface, byteArrayOutputStream2.toByteArray());
                } catch (Exception e) {
                    C18073l.Signature(e.getMessage(), e);
                    return null;
                }
            } catch (Exception e2) {
                C18073l.Signature(e2.getMessage(), e2);
                return null;
            }
        }
        if (abstractC8831l instanceof C12529l) {
            C12529l c12529l = (C12529l) abstractC8831l;
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i9 = c12529l.f24686l;
            byteArrayOutputStream3.write((byte) (i9 >>> 24));
            byteArrayOutputStream3.write((byte) (i9 >>> 16));
            byteArrayOutputStream3.write((byte) (i9 >>> 8));
            byteArrayOutputStream3.write((byte) i9);
            try {
                byteArrayOutputStream3.write(c12529l.getEncoded());
                byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                int i10 = c12529l.f24686l;
                byteArrayOutputStream4.write((byte) (i10 >>> 24));
                byteArrayOutputStream4.write((byte) (i10 >>> 16));
                byteArrayOutputStream4.write((byte) (i10 >>> 8));
                byteArrayOutputStream4.write((byte) i10);
                synchronized (c12529l) {
                    c3952lBilling = ((C13291l) c12529l.f24688l.get(0)).billing();
                    if (c3952lBilling == null) {
                        throw new NullPointerException("lmsPublicKey");
                    }
                }
                try {
                    byteArrayOutputStream4.write(c3952lBilling.loadAd());
                    return new C2756l(new C10198l(InterfaceC0543l.f1892l), new C11327l(byteArray2), cinterface, byteArrayOutputStream4.toByteArray());
                } catch (Exception e3) {
                    C18073l.Signature(e3.getMessage(), e3);
                    return null;
                }
            } catch (Exception e4) {
                C18073l.Signature(e4.getMessage(), e4);
                return null;
            }
        }
        if (abstractC8831l instanceof C7400l) {
            C7400l c7400l = (C7400l) abstractC8831l;
            C10198l c10198l2 = new C10198l((Cfor) AbstractC3983l.metrica.get((C18535l) c7400l.f16541l));
            C11327l c11327l = new C11327l(c7400l.getEncoded());
            C10237l c10237l = c7400l.f15331l;
            return new C2756l(c10198l2, c11327l, cinterface, AbstractC14024l.mopub(c10237l.yandex, c10237l.loadAd));
        }
        if (abstractC8831l instanceof C2250l) {
            C2250l c2250l = (C2250l) abstractC8831l;
            C10198l c10198l3 = new C10198l((Cfor) AbstractC3983l.f8179native.get((C7951l) c2250l.f16541l));
            C11547l c11547l = c2250l.f4937l;
            byte[] bArr4 = c11547l.yandex;
            byte[] bArr5 = c11547l.loadAd;
            C1561l c1561l = c2250l.f4938l;
            return new C2756l(c10198l3, AbstractC14024l.isPro(new byte[][]{bArr4, bArr5, c1561l.yandex, c1561l.loadAd}), cinterface, (byte[]) null);
        }
        if (abstractC8831l instanceof C18116l) {
            C18116l c18116l = (C18116l) abstractC8831l;
            return new C2756l(new C10198l((Cfor) AbstractC3983l.mopub.get((C17615l) c18116l.f16541l)), new C11327l(AbstractC14024l.crashlytics(c18116l.f35412l)), cinterface, (byte[]) null);
        }
        if (!(abstractC8831l instanceof C18465l)) {
            if (abstractC8831l instanceof C5745l) {
                C5745l c5745l = (C5745l) abstractC8831l;
                C10198l c10198l4 = new C10198l(InterfaceC13726l.crashlytics, new C12115l(c5745l.f12132l.loadAd, AbstractC3983l.billing(c5745l.f25990l)));
                byte[] encoded = c5745l.getEncoded();
                C15980l c15980l = c5745l.f12132l;
                int i11 = c15980l.billing;
                int i12 = c15980l.loadAd;
                int iLoadAd = (int) AbstractC4047l.loadAd(4, encoded);
                if (!AbstractC4047l.firebase(i12, iLoadAd)) {
                    C8339l.metrica("index out of bounds");
                    return null;
                }
                byte[] bArrMopub = AbstractC4047l.mopub(4, i11, encoded);
                int i13 = 4 + i11;
                byte[] bArrMopub2 = AbstractC4047l.mopub(i13, i11, encoded);
                int i14 = i13 + i11;
                byte[] bArrMopub3 = AbstractC4047l.mopub(i14, i11, encoded);
                int i15 = i14 + i11;
                byte[] bArrMopub4 = AbstractC4047l.mopub(i15, i11, encoded);
                int i16 = i15 + i11;
                byte[] bArrMopub5 = AbstractC4047l.mopub(i16, encoded.length - i16, encoded);
                try {
                    int i17 = ((C0391l) AbstractC4047l.billing(bArrMopub5, C0391l.class)).f1490l;
                    return new C2756l(c10198l4, i17 != (1 << i12) + (-1) ? new C4438l(iLoadAd, bArrMopub, bArrMopub2, bArrMopub3, bArrMopub4, bArrMopub5, i17) : new C4438l(iLoadAd, bArrMopub, bArrMopub2, bArrMopub3, bArrMopub4, bArrMopub5), cinterface, (byte[]) null);
                } catch (ClassNotFoundException e5) {
                    C11467l.smaato(e5.getMessage(), "cannot parse BDS: ");
                    return null;
                }
            }
            if (abstractC8831l instanceof C3910l) {
                C3910l c3910l = (C3910l) abstractC8831l;
                Cfor cfor = InterfaceC13726l.amazon;
                C15509l c15509l = c3910l.f8055l;
                C10198l c10198l5 = new C10198l(cfor, new C13700l(c15509l.crashlytics, c15509l.amazon, AbstractC3983l.billing(c3910l.f25990l)));
                byte[] encoded2 = c3910l.getEncoded();
                C15509l c15509l2 = c3910l.f8055l;
                int i18 = c15509l2.loadAd.billing;
                int i19 = c15509l2.crashlytics;
                int i20 = (i19 + 7) / 8;
                long jLoadAd = (int) AbstractC4047l.loadAd(i20, encoded2);
                if (!AbstractC4047l.firebase(i19, jLoadAd)) {
                    C8339l.metrica("index out of bounds");
                    return null;
                }
                byte[] bArrMopub6 = AbstractC4047l.mopub(i20, i18, encoded2);
                int i21 = i20 + i18;
                byte[] bArrMopub7 = AbstractC4047l.mopub(i21, i18, encoded2);
                int i22 = i21 + i18;
                byte[] bArrMopub8 = AbstractC4047l.mopub(i22, i18, encoded2);
                int i23 = i22 + i18;
                byte[] bArrMopub9 = AbstractC4047l.mopub(i23, i18, encoded2);
                int i24 = i23 + i18;
                byte[] bArrMopub10 = AbstractC4047l.mopub(i24, encoded2.length - i24, encoded2);
                try {
                    long j = ((C0497l) AbstractC4047l.billing(bArrMopub10, C0497l.class)).f1805l;
                    return new C2756l(c10198l5, j != (1 << i19) - 1 ? new C15044l(jLoadAd, bArrMopub6, bArrMopub7, bArrMopub8, bArrMopub9, bArrMopub10, j) : new C15044l(jLoadAd, bArrMopub6, bArrMopub7, bArrMopub8, bArrMopub9, bArrMopub10), cinterface, (byte[]) null);
                } catch (ClassNotFoundException e6) {
                    C11467l.smaato(e6.getMessage(), "cannot parse BDSStateMap: ");
                    return null;
                }
            }
            if (abstractC8831l instanceof C15606l) {
                C15606l c15606l = (C15606l) abstractC8831l;
                return new C2756l(new C10198l((Cfor) AbstractC3983l.subs.get((C10512l) c15606l.f16541l)), new C11327l(AbstractC14024l.crashlytics(c15606l.f30459l)), cinterface, (byte[]) null);
            }
            if (abstractC8831l instanceof C2677l) {
                C2677l c2677l = (C2677l) abstractC8831l;
                return new C2756l(new C10198l((Cfor) AbstractC3983l.firebase.get((C15401l) c2677l.f16541l)), new C11327l(AbstractC14024l.crashlytics(c2677l.f5812l)), cinterface, (byte[]) null);
            }
            if (abstractC8831l instanceof C9779l) {
                C9779l c9779l = (C9779l) abstractC8831l;
                return new C2756l(new C10198l((Cfor) AbstractC3983l.adcel.get((C11258l) c9779l.f16541l)), new C11327l(AbstractC14024l.crashlytics(c9779l.f19926l)), cinterface, (byte[]) null);
            }
            if (abstractC8831l instanceof C5354l) {
                C5354l c5354l = (C5354l) abstractC8831l;
                C10198l c10198l6 = new C10198l((Cfor) AbstractC3983l.subscription.get((C1738l) c5354l.f16541l));
                C14178l c14178l = new C14178l(AbstractC14024l.crashlytics(c5354l.f11494l));
                byte[] bArrCrashlytics = AbstractC14024l.crashlytics(c5354l.f11496l);
                byte[] bArrCrashlytics2 = AbstractC14024l.crashlytics(c5354l.f11495l);
                byte[] bArrCrashlytics3 = AbstractC14024l.crashlytics(c5354l.f11497l);
                C6355l c6355l = new C6355l();
                c6355l.f13320l = 0;
                c6355l.f13319l = bArrCrashlytics;
                c6355l.f13318l = bArrCrashlytics2;
                c6355l.f13322l = bArrCrashlytics3;
                c6355l.f13321l = c14178l;
                return new C2756l(c10198l6, c6355l, cinterface, (byte[]) null);
            }
            if (abstractC8831l instanceof C16951l) {
                C16951l c16951l = (C16951l) abstractC8831l;
                C10198l c10198l7 = new C10198l((Cfor) AbstractC3983l.f8180package.get((C8719l) c16951l.f16541l));
                int i25 = c16951l.f33068l;
                if (i25 == 1) {
                    return new C2756l(c10198l7, new C9320l(false, 0, new C11327l(AbstractC14024l.crashlytics(c16951l.f33065l))), cinterface, (byte[]) null);
                }
                if (i25 == 2) {
                    return new C2756l(c10198l7, new C11327l(c16951l.getEncoded()), cinterface, (byte[]) null);
                }
                C11138l c11138l = new C11138l(new C11327l(AbstractC14024l.crashlytics(c16951l.f33065l)), new C11327l(c16951l.getEncoded()));
                c11138l.f22357l = -1;
                return new C2756l(c10198l7, c11138l, cinterface, (byte[]) null);
            }
            if (abstractC8831l instanceof C7651l) {
                C7651l c7651l = (C7651l) abstractC8831l;
                appmetrica appmetricaVar = new appmetrica((byte) 0, 0);
                appmetricaVar.purchase(new C11327l(AbstractC14024l.crashlytics(c7651l.f15747l)));
                appmetricaVar.purchase(new C11327l(AbstractC14024l.crashlytics(c7651l.f15749l)));
                appmetricaVar.purchase(new C11327l(AbstractC14024l.crashlytics(c7651l.f15748l)));
                appmetricaVar.purchase(new C11327l(AbstractC14024l.crashlytics(c7651l.f15750l)));
                C10198l c10198l8 = new C10198l((Cfor) AbstractC3983l.Signature.get((C9818l) c7651l.f16541l));
                C11138l c11138l2 = new C11138l(appmetricaVar);
                c11138l2.f22357l = -1;
                return new C2756l(c10198l8, c11138l2, cinterface, (byte[]) null);
            }
            if (abstractC8831l instanceof C3190l) {
                C3190l c3190l = (C3190l) abstractC8831l;
                appmetrica appmetricaVar2 = new appmetrica((byte) 0, 0);
                appmetricaVar2.purchase(new C11327l(AbstractC14024l.crashlytics(c3190l.f6851l)));
                appmetricaVar2.purchase(new C11327l(AbstractC14024l.crashlytics(c3190l.f6854l)));
                appmetricaVar2.purchase(new C11327l(AbstractC14024l.crashlytics(c3190l.f6853l)));
                appmetricaVar2.purchase(new C11327l(AbstractC14024l.crashlytics(c3190l.f6855l)));
                appmetricaVar2.purchase(new C11327l(AbstractC14024l.crashlytics(c3190l.f6852l)));
                C10198l c10198l9 = new C10198l((Cfor) AbstractC3983l.pro.get((C7684l) c3190l.f16541l));
                C11138l c11138l3 = new C11138l(appmetricaVar2);
                c11138l3.f22357l = -1;
                return new C2756l(c10198l9, c11138l3, cinterface);
            }
            if (abstractC8831l instanceof C15739l) {
                C15739l c15739l = (C15739l) abstractC8831l;
                C10198l c10198l10 = new C10198l((Cfor) AbstractC3983l.f8182strictfp.get((C11196l) c15739l.f16541l));
                int i26 = c15739l.f30917l;
                if (i26 == 1) {
                    return new C2756l(c10198l10, new C9320l(2, 128, 0, new C11327l(AbstractC14024l.crashlytics(c15739l.f30912l))), cinterface);
                }
                if (i26 == 2) {
                    return new C2756l(c10198l10, new C11327l(c15739l.getEncoded()), cinterface);
                }
                C11138l c11138l4 = new C11138l(new C11327l(AbstractC14024l.crashlytics(c15739l.f30912l)), new C11327l(c15739l.getEncoded()));
                c11138l4.f22357l = -1;
                return new C2756l(c10198l10, c11138l4, cinterface);
            }
            if (abstractC8831l instanceof C18301l) {
                C18301l c18301l = (C18301l) abstractC8831l;
                C10198l c10198l11 = new C10198l((Cfor) AbstractC3983l.advert.get((C18260l) c18301l.f16541l));
                C13671l c13671l = new C13671l((C18260l) c18301l.f16541l, c18301l.f35788l, c18301l.f35793l);
                return new C2756l(c10198l11, new C11327l(c18301l.getEncoded()), cinterface, AbstractC14024l.mopub(c13671l.f26695l, c13671l.f26696l));
            }
            if (abstractC8831l instanceof C12344l) {
                C12344l c12344l = (C12344l) abstractC8831l;
                return new C2756l(new C10198l((Cfor) AbstractC3983l.signatures.get(c12344l.yandex())), new C11327l(AbstractC14024l.admob(c12344l.f24438l, c12344l.f24440l, c12344l.f24439l)), cinterface);
            }
            if (abstractC8831l instanceof C10002l) {
                C10002l c10002l = (C10002l) abstractC8831l;
                return new C2756l(new C10198l((Cfor) AbstractC3983l.applovin.get(c10002l.loadAd())), new C11327l(c10002l.getEncoded()), cinterface);
            }
            if (abstractC8831l instanceof C12680l) {
                C12680l c12680l = (C12680l) abstractC8831l;
                return new C2756l(new C10198l((Cfor) AbstractC3983l.inmobi.get(c12680l.purchase())), new C11327l(c12680l.getEncoded()), cinterface);
            }
            if (abstractC8831l instanceof C6818l) {
                C6818l c6818l = (C6818l) abstractC8831l;
                return new C2756l(new C10198l((Cfor) AbstractC3983l.f8177extends.get(c6818l.crashlytics())), new C11327l(c6818l.getEncoded()), cinterface);
            }
            if (abstractC8831l instanceof C5200l) {
                C5200l c5200l = (C5200l) abstractC8831l;
                return new C2756l(new C10198l((Cfor) AbstractC3983l.f8184throw.get(c5200l.yandex())), new C11327l(c5200l.getEncoded()), cinterface);
            }
            if (abstractC8831l instanceof C5027l) {
                C5027l c5027l = (C5027l) abstractC8831l;
                return new C2756l(new C10198l((Cfor) AbstractC3983l.f8176else.get(c5027l.amazon())), new C11327l(c5027l.getEncoded()), cinterface);
            }
            C18262l.metrica("key parameters not recognized");
            return null;
        }
        C18465l c18465l = (C18465l) abstractC8831l;
        C10198l c10198l12 = new C10198l((Cfor) AbstractC3983l.remoteconfig.get((C6801l) c18465l.f16541l));
        C6754l c6754l2 = ((C6801l) c18465l.f16541l).f14237l;
        byte[] bArr6 = c18465l.f36064l;
        int i27 = c6754l2.crashlytics;
        int i28 = c6754l2.yandex;
        boolean z = c6754l2.subs;
        int i29 = c6754l2.purchase;
        byte[] bArr7 = new byte[z ? ((i28 / 8) - ((i29 - 1) / 8)) * i29 : (c6754l2.billing * i29) / 8];
        int i30 = 1 << i27;
        int i31 = 1;
        short[] sArr = new short[i30];
        int i32 = 8;
        int[] iArr = new int[i30];
        int i33 = i28 / 8;
        int i34 = i30 * 4;
        int i35 = i34 + i33;
        byte[] bArr8 = new byte[i35];
        int i36 = ((i35 - 32) - c6754l2.amazon) - i34;
        C17951l c17951l = new C17951l(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        c17951l.update((byte) 64);
        c17951l.billing(0, 32, bArr6);
        c17951l.crashlytics(0, i35, bArr8);
        for (int i37 = 0; i37 < i30; i37++) {
            iArr[i37] = AbstractC10000l.metrica((i37 * 4) + i36, bArr8);
        }
        int i38 = c6754l2.mopub;
        C2287l c2287l = c6754l2.admob;
        int i39 = c6754l2.loadAd;
        short[] sArr2 = new short[i39 + 1];
        sArr2[i39] = 1;
        int i40 = 0;
        while (i40 < i39) {
            int i41 = i40 * 2;
            short[] sArr3 = sArr2;
            sArr3[i40] = (short) (((short) ((bArr6[i41 + 40] & 255) | ((bArr6[i41 + 41] & 255) << 8))) & i38);
            i40++;
            sArr2 = sArr3;
        }
        short[] sArr4 = sArr2;
        long[] jArr = new long[i30];
        int i42 = 0;
        while (i42 < i30) {
            long[] jArr2 = jArr;
            long j2 = iArr[i42];
            jArr2[i42] = j2;
            long j3 = j2 << 31;
            jArr2[i42] = j3;
            long j4 = j3 | ((long) i42);
            jArr2[i42] = j4;
            jArr2[i42] = j4 & Long.MAX_VALUE;
            i42++;
            bArr7 = bArr7;
            jArr = jArr2;
        }
        long[] jArr3 = jArr;
        byte[] bArr9 = bArr7;
        if (i30 >= 2) {
            int i43 = 1;
            while (i43 < i30 - i43) {
                i43 += i43;
            }
            int i44 = i43;
            while (i44 > 0) {
                int i45 = 0;
                while (i45 < i30 - i44) {
                    if ((i45 & i44) == 0) {
                        int i46 = i45 + i44;
                        long j5 = jArr3[i46];
                        long j6 = jArr3[i45];
                        long j7 = (-((j5 - j6) >>> 63)) & (j6 ^ j5);
                        jArr3[i45] = j6 ^ j7;
                        jArr3[i46] = jArr3[i46] ^ j7;
                    }
                    i45++;
                    i43 = i43;
                }
                int i47 = i43;
                int i48 = 0;
                while (i43 > i44) {
                    while (i48 < i30 - i43) {
                        if ((i48 & i44) == 0) {
                            int i49 = i48 + i44;
                            long j8 = jArr3[i49];
                            i = i48;
                            int i50 = i43;
                            while (i50 > i44) {
                                int i51 = i + i50;
                                long j9 = jArr3[i51];
                                int i52 = i50;
                                long j10 = (-((j9 - j8) >>> 63)) & (j8 ^ j9);
                                j8 ^= j10;
                                jArr3[i51] = j9 ^ j10;
                                i50 = i52 >>> 1;
                                i43 = i43;
                            }
                            i2 = i43;
                            jArr3[i49] = j8;
                        } else {
                            i = i48;
                            i2 = i43;
                        }
                        i48 = i + 1;
                        i43 = i2;
                    }
                    i43 >>>= 1;
                }
                i44 >>>= 1;
                i43 = i47;
            }
        }
        int i53 = 1;
        while (true) {
            if (i53 >= i30) {
                short[] sArr5 = new short[i28];
                int i54 = 0;
                while (i54 < i30) {
                    int i55 = i54;
                    sArr[i55] = (short) (jArr3[i54] & ((long) i38));
                    i54 = i55 + 1;
                    sArr5 = sArr5;
                }
                short[] sArr6 = sArr5;
                for (int i56 = 0; i56 < i28; i56++) {
                    short s2 = sArr[i56];
                    short s3 = (short) (((s2 & 65280) >> 8) | ((s2 & 255) << 8));
                    short s4 = (short) (((s3 & 61680) >> 4) | ((s3 & 3855) << 4));
                    short s5 = (short) (((s4 & 52428) >> 2) | ((s4 & 13107) << 2));
                    short s6 = (short) (((s5 & 43690) >> 1) | ((s5 & 21845) << 1));
                    sArr6[i56] = (short) (i27 == 12 ? s6 >> 4 : s6 >> 3);
                }
                short[] sArr7 = new short[i28];
                for (int i57 = 0; i57 < i28; i57++) {
                    short s7 = sArr6[i57];
                    short sBilling = sArr4[i39];
                    for (int i58 = i39 - 1; i58 >= 0; i58--) {
                        sBilling = (short) (c2287l.billing(sBilling, s7) ^ sArr4[i58]);
                    }
                    sArr7[i57] = sBilling;
                }
                for (int i59 = 0; i59 < i28; i59++) {
                    sArr7[i59] = c2287l.purchase(sArr7[i59]);
                }
                byte b = 0;
                byte[][] bArr10 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i29, i33);
                int i60 = 0;
                while (i60 < i29) {
                    int i61 = b;
                    while (i61 < i33) {
                        bArr10[i60][i61] = b;
                        i61++;
                        b = 0;
                    }
                    i60++;
                    b = 0;
                }
                int i62 = 0;
                while (i62 < i39) {
                    for (int i63 = 0; i63 < i28; i63 += 8) {
                        int i64 = 0;
                        while (i64 < i27) {
                            short[] sArr8 = sArr7;
                            bArr10[(i62 * i27) + i64][i63 / 8] = (byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) ((sArr7[i63 + 7] >>> i64) & 1)) << 1)) | ((sArr8[i63 + 6] >>> i64) & 1))) << 1)) | ((sArr8[i63 + 5] >>> i64) & 1))) << 1)) | ((sArr8[i63 + 4] >>> i64) & 1))) << 1)) | ((sArr8[i63 + 3] >>> i64) & 1))) << 1)) | ((sArr8[i63 + 2] >>> i64) & 1))) << 1)) | ((sArr8[i63 + 1] >>> i64) & 1))) << 1)) | ((sArr8[i63] >>> i64) & 1));
                            i64++;
                            sArr7 = sArr8;
                        }
                    }
                    short[] sArr9 = sArr7;
                    for (int i65 = 0; i65 < i28; i65++) {
                        sArr9[i65] = c2287l.billing(sArr9[i65], sArr6[i65]);
                    }
                    i62++;
                    sArr7 = sArr9;
                }
                int i66 = 0;
                loop16: while (true) {
                    if (i66 >= i29) {
                        byte[][] bArr11 = bArr10;
                        if (!z) {
                            bArr = bArr9;
                            int i67 = ((i28 - i29) + 7) / 8;
                            for (int i68 = 0; i68 < i29; i68++) {
                                System.arraycopy(bArr11[i68], i29 / 8, bArr, i67 * i68, i67);
                            }
                            break;
                        }
                        int i69 = i29 % 8;
                        if (i69 != 0) {
                            bArr = bArr9;
                            int i70 = 0;
                            int i71 = 0;
                            while (i70 < i29) {
                                int i72 = (i29 - 1) / 8;
                                while (i72 < i33 - 1) {
                                    byte[] bArr12 = bArr11[i70];
                                    int i73 = (bArr12[i72] & 255) >>> i69;
                                    i72++;
                                    bArr[i71] = (byte) ((bArr12[i72] << (8 - i69)) | i73);
                                    i71++;
                                }
                                bArr[i71] = (byte) ((bArr11[i70][i72] & 255) >>> i69);
                                i70++;
                                i71++;
                            }
                            break;
                        }
                        bArr = bArr9;
                        System.arraycopy(bArr11[i62], (i29 - 1) / 8, bArr, 0, i33);
                        break;
                    }
                    int i74 = i66 >>> 3;
                    int i75 = i66 & 7;
                    if (c6754l2.isPro && i66 == (i4 = i29 - 32)) {
                        long[] jArr4 = new long[64];
                        long[] jArr5 = new long[32];
                        byte[] bArr13 = new byte[9];
                        int i76 = i4 / 8;
                        int i77 = i4 % 8;
                        if (z) {
                            bArr2 = bArr10;
                            int i78 = 0;
                            while (i78 < 32) {
                                int i79 = i78;
                                for (int i80 = 0; i80 < 9; i80++) {
                                    bArr13[i80] = bArr2[i4 + i79][i76 + i80];
                                }
                                int i81 = 0;
                                for (int i82 = i32; i81 < i82; i82 = 8) {
                                    int i83 = i81 + 1;
                                    bArr13[i81] = (byte) (((bArr13[i81] & 255) >> i77) | (bArr13[i83] << (8 - i77)));
                                    i81 = i83;
                                }
                                jArr4[i79] = AbstractC10000l.subscription(0, bArr13);
                                i78 = i79 + 1;
                                i32 = 8;
                            }
                        } else {
                            bArr2 = bArr10;
                            for (int i84 = 0; i84 < 32; i84++) {
                                jArr4[i84] = AbstractC10000l.subscription(i76, bArr2[i4 + i84]);
                            }
                        }
                        int i85 = 0;
                        int i86 = 32;
                        while (true) {
                            if (i85 < i86) {
                                int i87 = i85 + 1;
                                int i88 = i74;
                                int i89 = i4;
                                long j11 = jArr4[i85];
                                int i90 = i85;
                                int i91 = i87;
                                while (i91 < i86) {
                                    j11 |= jArr4[i91];
                                    i91++;
                                    i86 = 32;
                                }
                                long j12 = 0;
                                if (j11 == 0) {
                                    break;
                                }
                                long j13 = ~j11;
                                long j14 = 72340172838076673L;
                                for (int i92 = 0; i92 < 8; i92++) {
                                    j14 &= j13 >>> i92;
                                    j12 += j14;
                                }
                                long j15 = j12 & 578721382704613384L;
                                long j16 = j15 | (j15 >>> i31);
                                long j17 = j16 | (j16 >>> 2);
                                long j18 = j12 >>> 8;
                                long j19 = j12 + (j18 & j17);
                                long j20 = j17;
                                long j21 = j19;
                                int i93 = 2;
                                for (int i94 = 8; i93 < i94; i94 = 8) {
                                    j20 &= j20 >>> i94;
                                    j18 >>>= i94;
                                    j21 += j18 & j20;
                                    i93++;
                                }
                                int i95 = ((int) j21) & 255;
                                jArr5[i90] = i95;
                                int i96 = i87;
                                while (true) {
                                    i6 = 32;
                                    if (i96 >= 32) {
                                        break;
                                    }
                                    long j22 = jArr4[i90];
                                    jArr4[i90] = j22 ^ (jArr4[i96] & (((j22 >> i95) & 1) - 1));
                                    i96++;
                                }
                                int i97 = i87;
                                while (i97 < i6) {
                                    long j23 = jArr4[i97];
                                    int i98 = i97;
                                    jArr4[i98] = j23 ^ (jArr4[i90] & (-((j23 >> i95) & 1)));
                                    i97 = i98 + 1;
                                    i6 = 32;
                                }
                                i86 = i6;
                                i85 = i87;
                                i74 = i88;
                                i4 = i89;
                            } else {
                                i3 = i74;
                                int i99 = i4;
                                int i100 = 0;
                                while (i100 < i86) {
                                    int i101 = i100 + 1;
                                    int i102 = i101;
                                    while (i102 < 64) {
                                        int i103 = i99 + i100;
                                        short s8 = sArr[i103];
                                        int i104 = i99 + i102;
                                        int i105 = i100;
                                        int i106 = i101;
                                        long j24 = (-((((long) (((short) i102) ^ ((short) jArr5[i105]))) - 1) >>> 63)) & ((long) (s8 ^ sArr[i104]));
                                        sArr[i103] = (short) (((long) s8) ^ j24);
                                        sArr[i104] = (short) (j24 ^ ((long) sArr[i104]));
                                        i102++;
                                        c6754l2 = c6754l2;
                                        i100 = i105;
                                        i101 = i106;
                                    }
                                    i100 = i101;
                                    i86 = 32;
                                }
                                c6754l = c6754l2;
                                int i107 = 0;
                                while (i107 < i29) {
                                    if (z) {
                                        for (int i108 = 0; i108 < 9; i108++) {
                                            bArr13[i108] = bArr2[i107][i76 + i108];
                                        }
                                        int i109 = 0;
                                        while (i109 < 8) {
                                            int i110 = i109 + 1;
                                            bArr13[i109] = (byte) (((bArr13[i109] & 255) >> i77) | (bArr13[i110] << (8 - i77)));
                                            i109 = i110;
                                        }
                                        jSubscription = AbstractC10000l.subscription(0, bArr13);
                                    } else {
                                        jSubscription = AbstractC10000l.subscription(i76, bArr2[i107]);
                                    }
                                    for (int i111 = 0; i111 < 32; i111++) {
                                        int i112 = (int) jArr5[i111];
                                        long j25 = ((jSubscription >> i111) ^ (jSubscription >> i112)) & 1;
                                        jSubscription = (j25 << i111) ^ ((j25 << i112) ^ jSubscription);
                                    }
                                    if (z) {
                                        AbstractC15185l.crashlytics(jSubscription, bArr13, 0);
                                        byte[] bArr14 = bArr2[i107];
                                        int i113 = i76 + 8;
                                        int i114 = 8 - i77;
                                        bArr14[i113] = (byte) ((((bArr14[i113] & 255) >>> i77) << i77) | ((bArr13[7] & 255) >>> i114));
                                        bArr14[i76] = (byte) (((bArr13[0] & 255) << i77) | (((bArr14[i76] & 255) << i114) >>> i114));
                                        int i115 = 7;
                                        for (int i116 = i31; i115 >= i116; i116 = 1) {
                                            bArr2[i107][i76 + i115] = (byte) (((bArr13[i115 - 1] & 255) >>> i114) | ((bArr13[i115] & 255) << i77));
                                            i115--;
                                            i107 = i107;
                                        }
                                        i5 = i107;
                                    } else {
                                        i5 = i107;
                                        AbstractC15185l.crashlytics(jSubscription, bArr2[i5], i76);
                                    }
                                    i107 = i5 + 1;
                                    i31 = 1;
                                }
                            }
                        }
                    } else {
                        bArr2 = bArr10;
                        i75 = i75;
                        i3 = i74;
                        c6754l = c6754l2;
                    }
                    int i117 = i66 + 1;
                    for (int i118 = i117; i118 < i29; i118++) {
                        byte b2 = (byte) (-((byte) (((byte) (((byte) (bArr2[i66][i3] ^ bArr2[i118][i3])) >> i75)) & 1)));
                        for (int i119 = 0; i119 < i33; i119++) {
                            byte[] bArr15 = bArr2[i66];
                            bArr15[i119] = (byte) (bArr15[i119] ^ (bArr2[i118][i119] & b2));
                        }
                    }
                    if (((bArr2[i66][i3] >> i75) & 1) == 0) {
                        break;
                    }
                    for (int i120 = 0; i120 < i29; i120++) {
                        if (i120 != i66) {
                            byte b3 = (byte) (-((byte) (((byte) (bArr2[i120][i3] >> i75)) & 1)));
                            for (int i121 = 0; i121 < i33; i121++) {
                                byte[] bArr16 = bArr2[i120];
                                bArr16[i121] = (byte) (bArr16[i121] ^ (bArr2[i66][i121] & b3));
                            }
                        }
                    }
                    i66 = i117;
                    bArr10 = bArr2;
                    c6754l2 = c6754l;
                    i62 = i3;
                    i31 = 1;
                    i32 = 8;
                }
                C3967l c3967l = new C3967l(bArr);
                byte[] bArrVip = AbstractC14024l.vip(0, 32, c18465l.f36064l);
                byte[] bArrVip2 = AbstractC14024l.vip(32, 40, c18465l.f36064l);
                byte[] bArrVip3 = AbstractC14024l.vip(40, (((C6801l) c18465l.f16541l).f14238l * 2) + 40, c18465l.f36064l);
                byte[] bArr17 = c18465l.f36064l;
                byte[] bArrVip4 = AbstractC14024l.vip((((C6801l) c18465l.f16541l).f14238l * 2) + 40, bArr17.length - 32, bArr17);
                byte[] bArr18 = c18465l.f36064l;
                byte[] bArrVip5 = AbstractC14024l.vip(bArr18.length - 32, bArr18.length, bArr18);
                C11344l c11344l = new C11344l();
                c11344l.f22881l = 0;
                c11344l.f22880l = AbstractC14024l.crashlytics(bArrVip);
                c11344l.f22878l = AbstractC14024l.crashlytics(bArrVip2);
                c11344l.f22883l = AbstractC14024l.crashlytics(bArrVip3);
                c11344l.f22882l = AbstractC14024l.crashlytics(bArrVip4);
                c11344l.f22884l = AbstractC14024l.crashlytics(bArrVip5);
                c11344l.f22879l = c3967l;
                return new C2756l(c10198l12, c11344l, cinterface, (byte[]) null);
            }
            if ((jArr3[i53 - 1] >> 31) == (jArr3[i53] >> 31)) {
                break;
            }
            i53++;
        }
        bArr = bArr9;
        C3967l c3967l2 = new C3967l(bArr);
        byte[] bArrVip6 = AbstractC14024l.vip(0, 32, c18465l.f36064l);
        byte[] bArrVip7 = AbstractC14024l.vip(32, 40, c18465l.f36064l);
        byte[] bArrVip8 = AbstractC14024l.vip(40, (((C6801l) c18465l.f16541l).f14238l * 2) + 40, c18465l.f36064l);
        byte[] bArr19 = c18465l.f36064l;
        byte[] bArrVip9 = AbstractC14024l.vip((((C6801l) c18465l.f16541l).f14238l * 2) + 40, bArr19.length - 32, bArr19);
        byte[] bArr110 = c18465l.f36064l;
        byte[] bArrVip10 = AbstractC14024l.vip(bArr110.length - 32, bArr110.length, bArr110);
        C11344l c11344l2 = new C11344l();
        c11344l2.f22881l = 0;
        c11344l2.f22880l = AbstractC14024l.crashlytics(bArrVip6);
        c11344l2.f22878l = AbstractC14024l.crashlytics(bArrVip7);
        c11344l2.f22883l = AbstractC14024l.crashlytics(bArrVip8);
        c11344l2.f22882l = AbstractC14024l.crashlytics(bArrVip9);
        c11344l2.f22884l = AbstractC14024l.crashlytics(bArrVip10);
        c11344l2.f22879l = c3967l2;
        return new C2756l(c10198l12, c11344l2, cinterface, (byte[]) null);
    }

    public static final void subs(C18476l c18476l, String str, int i, int i2) {
        char cCharAt;
        long j;
        long j2;
        AbstractC17463l.crashlytics(str.length(), i, i2);
        c18476l.crashlytics();
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                C2139l c2139lInmobi = c18476l.inmobi(1);
                byte[] bArr = c2139lInmobi.yandex;
                int i3 = -i;
                int iMin = Math.min(i2, c2139lInmobi.yandex() + i);
                int i4 = i + 1;
                bArr[c2139lInmobi.crashlytics + i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[c2139lInmobi.crashlytics + i + i3] = (byte) cCharAt;
                }
                int i5 = i3 + i;
                if (i5 == 1) {
                    c2139lInmobi.crashlytics += i5;
                    c18476l.f36079l += (long) i5;
                } else {
                    if (i5 < 0 || i5 > c2139lInmobi.yandex()) {
                        StringBuilder sbSignature = AbstractC2812l.Signature("Invalid number of bytes written: ", i5, ". Should be in 0..");
                        sbSignature.append(c2139lInmobi.yandex());
                        throw new IllegalStateException(sbSignature.toString().toString());
                    }
                    if (i5 != 0) {
                        c2139lInmobi.crashlytics += i5;
                        c18476l.f36079l += (long) i5;
                    } else if (AbstractC2044l.billing(c2139lInmobi)) {
                        c18476l.adcel();
                    }
                }
            } else {
                if (cCharAt2 < 2048) {
                    C2139l c2139lInmobi2 = c18476l.inmobi(2);
                    byte[] bArr2 = c2139lInmobi2.yandex;
                    int i6 = c2139lInmobi2.crashlytics;
                    bArr2[i6] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i6 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    c2139lInmobi2.crashlytics = i6 + 2;
                    j = c18476l.f36079l;
                    j2 = 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    C2139l c2139lInmobi3 = c18476l.inmobi(3);
                    byte[] bArr3 = c2139lInmobi3.yandex;
                    int i7 = c2139lInmobi3.crashlytics;
                    bArr3[i7] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i7 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i7 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    c2139lInmobi3.crashlytics = i7 + 3;
                    j = c18476l.f36079l;
                    j2 = 3;
                } else {
                    int i8 = i + 1;
                    char cCharAt3 = i8 < i2 ? str.charAt(i8) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        c18476l.m4562synchronized((byte) 63);
                        i = i8;
                    } else {
                        int i9 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        C2139l c2139lInmobi4 = c18476l.inmobi(4);
                        byte[] bArr4 = c2139lInmobi4.yandex;
                        int i10 = c2139lInmobi4.crashlytics;
                        bArr4[i10] = (byte) ((i9 >> 18) | 240);
                        bArr4[i10 + 1] = (byte) (((i9 >> 12) & 63) | 128);
                        bArr4[i10 + 2] = (byte) (((i9 >> 6) & 63) | 128);
                        bArr4[i10 + 3] = (byte) ((i9 & 63) | 128);
                        c2139lInmobi4.crashlytics = i10 + 4;
                        c18476l.f36079l += 4;
                        i += 2;
                    }
                }
                c18476l.f36079l = j + j2;
                i++;
            }
        }
    }

    public static C16218l yandex(C14025l c14025l, AbstractC5921l abstractC5921l, String str, C11352l c11352l, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            c11352l = null;
        }
        return new C16218l(c14025l, abstractC5921l, str, c11352l);
    }
}
