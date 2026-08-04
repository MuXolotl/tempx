package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l٘ۡٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18274l implements InterfaceC16588l {
    public static final InterfaceC18035l crashlytics;
    public static final InterfaceC16588l loadAd;
    public static final C18274l yandex = new C18274l();

    static {
        InterfaceC16588l interfaceC16588lSerializer = C5805l.Companion.serializer();
        loadAd = interfaceC16588lSerializer;
        crashlytics = interfaceC16588lSerializer.purchase();
    }

    public static void billing(InterfaceC17739l interfaceC17739l, C15062l c15062l) {
        if (!(interfaceC17739l instanceof C16044l)) {
            C6541l.firebase(AbstractC12900l.isPro("Unknown encoder type: ", interfaceC17739l));
        } else {
            loadAd.crashlytics(interfaceC17739l, new C5805l(c15062l));
        }
    }

    @Override // defpackage.InterfaceC16588l
    public final /* bridge */ /* synthetic */ void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        billing(interfaceC17739l, (C15062l) obj);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        int length;
        int length2;
        int length3;
        long j;
        long j2;
        C3662l c3662l;
        if (!(interfaceC10726l instanceof InterfaceC17487l)) {
            C6541l.firebase(AbstractC12900l.subs("Unknown decoder type: ", interfaceC10726l));
            return null;
        }
        C5805l c5805l = (C5805l) loadAd.loadAd(interfaceC10726l);
        c5805l.getClass();
        C18316l c18316l = C15062l.Companion;
        String str = c5805l.yandex;
        c18316l.getClass();
        C14660l c14660l = C3662l.crashlytics;
        if (str.length() == 0) {
            throw new NumberFormatException();
        }
        Matcher matcher = Pattern.compile("^([+-])?(\\d+([.]\\d*)?|[.]\\d+)([eE]([+-])?(\\d+))?$").matcher(str);
        C0711l c0711l = !matcher.matches() ? null : new C0711l(matcher, str);
        if (c0711l != null) {
            C7067l c7067l = c0711l.crashlytics;
            C1204l c1204lAd = c7067l.ad(1);
            String str2 = c1204lAd != null ? c1204lAd.yandex : null;
            boolean z = str2 != null && str2.equals("-");
            C1204l c1204lAd2 = c7067l.ad(4);
            String str3 = c1204lAd2 != null ? c1204lAd2.yandex : null;
            if (str3 == null || str3.length() == 0) {
                length = 0;
            } else {
                length = Integer.parseInt(c7067l.ad(6).yandex);
                C1204l c1204lAd3 = c7067l.ad(5);
                String str4 = c1204lAd3 != null ? c1204lAd3.yandex : null;
                if (str4 != null && str4.equals("-")) {
                    length = -length;
                }
            }
            String strM1035native = c7067l.ad(2).yandex;
            int iM3321extends = AbstractC12024l.m3321extends(strM1035native, '.', 0, 6);
            if (iM3321extends != -1) {
                int i = iM3321extends + 1;
                length -= strM1035native.length() - i;
                strM1035native = strM1035native.substring(0, iM3321extends).concat(strM1035native.substring(i));
            }
            if (strM1035native.charAt(0) == '0' && strM1035native.length() > 1) {
                strM1035native = Pattern.compile("^0+").matcher(strM1035native).replaceFirst("");
                if (strM1035native.length() == 0) {
                    strM1035native = "0";
                }
            }
            if (length > 6111) {
                if (strM1035native.equals("0")) {
                    length = 6111;
                } else {
                    int i2 = length - 6111;
                    if (i2 <= 34 - strM1035native.length()) {
                        StringBuilder sbAd = AbstractC5020l.ad(strM1035native);
                        sbAd.append(AbstractC16648l.ad(i2, "0"));
                        strM1035native = sbAd.toString();
                        length = 6111;
                    }
                }
            } else if (length < -6176) {
                if (strM1035native.equals("0")) {
                    length = -6176;
                } else {
                    int i3 = (-6176) - length;
                    if (i3 < strM1035native.length()) {
                        if (Pattern.compile("^0+$").matcher(strM1035native.substring(strM1035native.length() - i3)).matches()) {
                            strM1035native = AbstractC1757l.m1035native(i3, 0, strM1035native);
                            length = -6176;
                        }
                    }
                }
            } else if (strM1035native.length() > 34 && (length3 = length + (length2 = strM1035native.length() - 34)) <= 6111) {
                if (Pattern.compile("^0+$").matcher(strM1035native.substring(strM1035native.length() - length2)).matches()) {
                    strM1035native = AbstractC1757l.m1035native(length2, 0, strM1035native);
                    length = length3;
                }
            }
            if (length > 6111 || length < -6176) {
                throw new NumberFormatException("Can't parse to Decimal128:".concat(str));
            }
            if (strM1035native.length() > 34) {
                throw new NumberFormatException("Can't parse to Decimal128:".concat(str));
            }
            C14660l c14660lPurchase = AbstractC9092l.purchase(strM1035native);
            if (length < -6176 || length > 6111) {
                C8339l.metrica("Failed requirement.");
                return null;
            }
            if (c14660lPurchase.compareTo(C3662l.crashlytics) > 0) {
                C8339l.metrica("Failed requirement.");
                return null;
            }
            if (length < 0) {
                length += 12288;
            }
            long j3 = (((long) length) << 49) | c14660lPurchase.f28673l;
            if (z) {
                j3 |= Long.MIN_VALUE;
            }
            if (Long.compare((6917529027641081856L & j3) ^ Long.MIN_VALUE, -4611686018427387904L) > 0) {
                long j4 = (8646911284551352320L & j3) ^ Long.MIN_VALUE;
                if ((Long.compare(j4, -2305843009213693952L) >= 0) & (Long.compare(j4, -1152921504606846976L) <= 0)) {
                    if (Long.compare((2305702271725338624L & j3) ^ Long.MIN_VALUE, -8363325245515366400L) <= 0) {
                        j2 = 869194728082505728L;
                        j3 += j2;
                    } else {
                        j = 860187528827764736L;
                        j3 -= j;
                    }
                }
            } else if (Long.compare((9222809086901354496L & j3) ^ Long.MIN_VALUE, -5783184871497138176L) <= 0) {
                j2 = 3476778912330022912L;
                j3 += j2;
            } else {
                j = 3440750115311058944L;
                j3 -= j;
            }
            c3662l = new C3662l(j3, c14660lPurchase.f28672l);
        } else if (str.equalsIgnoreCase("Inf") || str.equalsIgnoreCase("Infinity") || str.equalsIgnoreCase("+Inf") || str.equalsIgnoreCase("+Infinity")) {
            c3662l = C3662l.amazon;
        } else if (str.equalsIgnoreCase("-Inf") || str.equalsIgnoreCase("-Infinity")) {
            c3662l = C3662l.purchase;
        } else if (str.equalsIgnoreCase("NaN")) {
            c3662l = C3662l.mopub;
        } else {
            if (!str.equalsIgnoreCase("-NaN")) {
                throw new NumberFormatException("Can't parse to Decimal128:".concat(str));
            }
            c3662l = C3662l.billing;
        }
        return new C15062l(c3662l);
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return crashlytics;
    }
}
