package defpackage;

import java.io.EOFException;
import java.util.ArrayList;

/* JADX INFO: renamed from: lََۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10733l {
    public static final C15578l yandex = new C15578l(-951928243, false, new C3755l(18));
    public static final C15578l loadAd = new C15578l(-1183435828, false, new C3755l(19));

    public static final byte[] admob(InterfaceC14189l interfaceC14189l, int i) {
        long j = i;
        if (j >= 0) {
            return subs(interfaceC14189l, i);
        }
        C10754l.metrica(AbstractC2812l.subscription(j, "byteCount (", ") < 0"));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007c A[EDGE_INSN: B:32:0x007c->B:64:0x0103 BREAK  A[LOOP:2: B:33:0x0080->B:43:0x00b2]] */
    public static long amazon(InterfaceC14189l interfaceC14189l, byte b, long j, int i) {
        long j2;
        StringBuilder sbSignature;
        String str;
        C2139l c2139l;
        long j3;
        long j4;
        long j5;
        long j6 = (i & 4) != 0 ? Long.MAX_VALUE : j;
        long j7 = 0;
        if (0 > j6) {
            if (j6 < 0) {
                j2 = 0;
                sbSignature = AbstractC0653l.Signature(0L, "startIndex (", ") and endIndex (");
                str = ") should be non negative";
            } else {
                j2 = 0;
                sbSignature = AbstractC0653l.Signature(0L, "startIndex (", ") is not within the range [0..endIndex(");
                str = "))";
            }
            C10754l.metrica(AbstractC15560l.ads(j6, str, sbSignature));
            return j2;
        }
        if (0 == j6) {
            return -1L;
        }
        long j8 = 0;
        while (j8 < j6 && interfaceC14189l.request(1 + j8)) {
            C18476l c18476lCrashlytics = interfaceC14189l.crashlytics();
            long jMin = Math.min(Math.min(j6, interfaceC14189l.crashlytics().f36079l), c18476lCrashlytics.f36079l);
            AbstractC17463l.crashlytics(c18476lCrashlytics.f36079l, j8, jMin);
            if (j8 == jMin || (c2139l = c18476lCrashlytics.f36081l) == null) {
                j4 = j7;
                j3 = -1;
                j5 = -1;
            } else {
                j3 = -1;
                long jLoadAd = c18476lCrashlytics.f36079l;
                String str2 = "Check failed.";
                j4 = j7;
                if (jLoadAd - j8 < j8) {
                    C2139l c2139l2 = c18476lCrashlytics.f36080l;
                    while (c2139l2 != null && jLoadAd > j8) {
                        jLoadAd -= (long) (c2139l2.crashlytics - c2139l2.loadAd);
                        if (jLoadAd <= j8) {
                            break;
                        }
                        c2139l2 = c2139l2.mopub;
                    }
                    if (jLoadAd == -1) {
                        j5 = -1;
                        break;
                    }
                    while (true) {
                        if (jMin <= jLoadAd) {
                            C8339l.smaato(str2);
                            return j4;
                        }
                        String str3 = str2;
                        int iPurchase = AbstractC2044l.purchase(c2139l2, b, Math.max((int) (j8 - jLoadAd), 0), Math.min(c2139l2.loadAd(), (int) (jMin - jLoadAd)));
                        if (iPurchase != -1) {
                            j5 = jLoadAd + ((long) iPurchase);
                            break;
                        }
                        jLoadAd += (long) c2139l2.loadAd();
                        c2139l2 = c2139l2.billing;
                        if (c2139l2 == null || jLoadAd >= jMin) {
                            j5 = -1;
                            break;
                        }
                        str2 = str3;
                    }
                } else {
                    long jLoadAd2 = j4;
                    while (c2139l != null) {
                        long j9 = ((long) (c2139l.crashlytics - c2139l.loadAd)) + jLoadAd2;
                        if (j9 > j8) {
                            break;
                        }
                        c2139l = c2139l.billing;
                        jLoadAd2 = j9;
                    }
                    if (jLoadAd2 == -1) {
                        j5 = -1;
                        break;
                    }
                    while (true) {
                        if (jMin <= jLoadAd2) {
                            C8339l.smaato("Check failed.");
                            return j4;
                        }
                        int iPurchase2 = AbstractC2044l.purchase(c2139l, b, Math.max((int) (j8 - jLoadAd2), 0), Math.min(c2139l.loadAd(), (int) (jMin - jLoadAd2)));
                        if (iPurchase2 != -1) {
                            j5 = ((long) iPurchase2) + jLoadAd2;
                            break;
                        }
                        jLoadAd2 += (long) c2139l.loadAd();
                        c2139l = c2139l.billing;
                        if (c2139l == null || jLoadAd2 >= jMin) {
                            j5 = -1;
                            break;
                        }
                    }
                }
            }
            if (j5 != j3) {
                return j5;
            }
            j8 = interfaceC14189l.crashlytics().f36079l;
            j7 = j4;
        }
        return -1L;
    }

    public static final boolean billing(long j) {
        return (j & 1) != 0;
    }

    public static final float crashlytics(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    public static final int isPro(C8034l c8034l, int i) {
        int i2;
        int[] iArr = c8034l.f16722l;
        int i3 = i + 1;
        int length = c8034l.f16721l.length - 1;
        int i4 = 0;
        while (i4 <= length) {
            i2 = (i4 + length) >>> 1;
            int i5 = iArr[i2];
            if (i5 < i3) {
                i4 = i2 + 1;
            } else {
                if (i5 <= i3) {
                    if (i2 >= 0) {
                        return i2;
                    }
                    return ~i2;
                }
                length = i2 - 1;
            }
        }
        i2 = (-i4) - 1;
        if (i2 >= 0) {
            return i2;
        }
        return ~i2;
    }

    public static final ArrayList loadAd(InterfaceC12822l interfaceC12822l) {
        C3654l c3654lMo1002return = ((AbstractC11754l) interfaceC12822l).mo1002return();
        boolean zMopub = mopub(c3654lMo1002return);
        C4588l c4588l = (C4588l) c3654lMo1002return.startapp();
        C17893l c17893l = (C17893l) c4588l.f9321l;
        ArrayList arrayList = new ArrayList(c17893l.f34846l);
        int i = c17893l.f34846l;
        for (int i2 = 0; i2 < i; i2++) {
            C3654l c3654l = (C3654l) c4588l.get(i2);
            arrayList.add(zMopub ? c3654l.remoteconfig() : c3654l.vip());
        }
        return arrayList;
    }

    public static final boolean mopub(C3654l c3654l) {
        int iInmobi = AbstractC5020l.inmobi(c3654l.f7667l.amazon);
        if (iInmobi != 0) {
            if (iInmobi != 1) {
                if (iInmobi != 2) {
                    if (iInmobi != 3) {
                        if (iInmobi != 4) {
                            C18725l.billing();
                            return false;
                        }
                        C3654l c3654lLicense = c3654l.license();
                        if (c3654lLicense != null) {
                            return mopub(c3654lLicense);
                        }
                        C8339l.metrica("no parent for idle node");
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean purchase(long j) {
        return (j & 2) != 0;
    }

    public static final byte[] subs(InterfaceC14189l interfaceC14189l, int i) throws EOFException {
        if (i == -1) {
            for (long j = 2147483647L; interfaceC14189l.crashlytics().f36079l < 2147483647L && interfaceC14189l.request(j); j *= 2) {
            }
            if (interfaceC14189l.crashlytics().f36079l >= 2147483647L) {
                throw new IllegalStateException(("Can't create an array of size " + interfaceC14189l.crashlytics().f36079l).toString());
            }
            i = (int) interfaceC14189l.crashlytics().f36079l;
        } else {
            interfaceC14189l.subscription(i);
        }
        byte[] bArr = new byte[i];
        C18476l c18476lCrashlytics = interfaceC14189l.crashlytics();
        long j2 = i;
        AbstractC17463l.crashlytics(j2, 0L, j2);
        int i2 = 0;
        while (i2 < i) {
            int iMo1455l = c18476lCrashlytics.mo1455l(i2, i, bArr);
            if (iMo1455l == -1) {
                throw new EOFException(AbstractC12589l.applovin(i, iMo1455l, "Source exhausted before reading ", " bytes. Only ", " bytes were read."));
            }
            i2 += iMo1455l;
        }
        return bArr;
    }

    public static final int yandex(long j, long j2) {
        boolean zBilling = billing(j);
        if (zBilling != billing(j2)) {
            return zBilling ? -1 : 1;
        }
        int iSignum = (int) Math.signum(crashlytics(j) - crashlytics(j2));
        if (Math.min(crashlytics(j), crashlytics(j2)) >= 0.0f && purchase(j) != purchase(j2)) {
            return purchase(j) ? -1 : 1;
        }
        return iSignum;
    }
}
