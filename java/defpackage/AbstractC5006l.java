package defpackage;

import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.view.InputEvent;
import java.math.BigInteger;

/* JADX INFO: renamed from: lؗٛ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5006l {
    public static final C15578l yandex = new C15578l(1421180792, false, new C4606l(1));
    public static final C15578l loadAd = new C15578l(-682188776, false, new C4606l(2));
    public static final C15578l crashlytics = new C15578l(2100642654, false, new C4606l(3));
    public static final C15578l amazon = new C15578l(1757758845, false, new C4606l(4));
    public static final C15578l purchase = new C15578l(-155758416, false, new C4606l(5));
    public static final C15578l billing = new C15578l(-1378296532, false, new C4606l(6));

    public static boolean billing(double d) {
        return Math.getExponent(d) <= 1023;
    }

    public static String crashlytics(applovin applovinVar) {
        StringBuilder sb;
        Ccase ccaseBilling;
        if (!(applovinVar instanceof Ccase)) {
            if (AbstractC2812l.advert(applovinVar)) {
                ccaseBilling = applovinVar.billing();
            } else {
                sb = new StringBuilder("unknown object type ");
                sb.append(applovinVar.toString());
            }
            return sb.toString();
        }
        ccaseBilling = (Ccase) applovinVar;
        sb = new StringBuilder();
        yandex("", ccaseBilling, sb);
        return sb.toString();
    }

    public static void loadAd(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    public static long purchase(double d) {
        AbstractC12442l.subs(billing(d), "not a normal value");
        int exponent = Math.getExponent(d);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static void yandex(String str, Ccase ccase, StringBuilder sb) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6 = AbstractC9008l.yandex;
        sb.append(str);
        if (ccase instanceof Cvolatile) {
            sb.append("NULL");
            sb.append(str6);
            return;
        }
        int i = 0;
        if (ccase instanceof Cclass) {
            if (ccase instanceof C16472l) {
                str5 = "BER Sequence";
            } else {
                str5 = ccase instanceof C11138l ? "DER Sequence" : "Sequence";
            }
            sb.append(str5);
            sb.append(str6);
            Cclass cclass = (Cclass) ccase;
            String strConcat = str.concat("    ");
            int size = cclass.size();
            while (i < size) {
                yandex(strConcat, cclass.mo173throws(i).billing(), sb);
                i++;
            }
            return;
        }
        if (ccase instanceof Cinterface) {
            if (ccase instanceof C1894l) {
                str4 = "BER Set";
            } else {
                str4 = ccase instanceof C2930l ? "DER Set" : "Set";
            }
            sb.append(str4);
            sb.append(str6);
            applovin[] applovinVarArr = ((Cinterface) ccase).f842l;
            String strConcat2 = str.concat("    ");
            int length = applovinVarArr.length;
            while (i < length) {
                yandex(strConcat2, applovinVarArr[i].billing(), sb);
                i++;
            }
            return;
        }
        if (ccase instanceof Cfinal) {
            if (ccase instanceof C10411l) {
                str3 = "BER Tagged ";
            } else {
                str3 = ccase instanceof C9320l ? "DER Tagged " : "Tagged ";
            }
            sb.append(str3);
            Cfinal cfinal = (Cfinal) ccase;
            sb.append(AbstractC9027l.crashlytics(cfinal.f822l, cfinal.f821l));
            if (!cfinal.m187throws()) {
                sb.append(" IMPLICIT");
            }
            sb.append(str6);
            String strConcat3 = str.concat("    ");
            applovin applovinVar = cfinal.f824l;
            yandex(strConcat3, (applovinVar instanceof Cnative ? (Cnative) applovinVar : applovinVar.billing()).billing(), sb);
            return;
        }
        if (ccase instanceof Cfor) {
            sb.append("ObjectIdentifier(" + ((Cfor) ccase).inmobi() + ")" + str6);
            return;
        }
        if (ccase instanceof Cswitch) {
            sb.append("RelativeOID(" + ((Cswitch) ccase).applovin() + ")" + str6);
            return;
        }
        if (ccase instanceof signatures) {
            sb.append("Boolean(" + ((signatures) ccase).appmetrica() + ")" + str6);
            return;
        }
        if (ccase instanceof Cstrictfp) {
            sb.append("Integer(" + ((Cstrictfp) ccase).appmetrica() + ")" + str6);
            return;
        }
        if (ccase instanceof Cthrow) {
            byte[] bArr = ((Cthrow) ccase).f36593l;
            sb.append(ccase instanceof C6864l ? "BER Constructed Octet String[" : "DER Octet String[");
            sb.append(bArr.length + "]" + str6);
            return;
        }
        if (ccase instanceof advert) {
            advert advertVar = (advert) ccase;
            if (advertVar instanceof C13353l) {
                str2 = "DER Bit String[";
            } else {
                str2 = advertVar instanceof C3980l ? "DL Bit String[" : "BER Bit String[";
            }
            sb.append(str2);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(advertVar.f11l.length - 1);
            sb2.append(", ");
            sb2.append(advertVar.firebase());
            sb2.append("]");
            sb2.append(str6);
            sb.append(sb2.toString());
            return;
        }
        if (ccase instanceof C10604l) {
            sb.append("IA5String(" + AbstractC9008l.yandex(((C10604l) ccase).f21525l) + ") " + str6);
            return;
        }
        if (ccase instanceof C17283l) {
            sb.append("UTF8String(" + ((C17283l) ccase).mopub() + ") " + str6);
            return;
        }
        if (ccase instanceof C7793l) {
            sb.append("NumericString(" + AbstractC9008l.yandex(((C7793l) ccase).f16316l) + ") " + str6);
            return;
        }
        if (ccase instanceof C5876l) {
            sb.append("PrintableString(" + AbstractC9008l.yandex(((C5876l) ccase).f12376l) + ") " + str6);
            return;
        }
        if (ccase instanceof C10336l) {
            sb.append("VisibleString(" + AbstractC9008l.yandex(((C10336l) ccase).f21054l) + ") " + str6);
            return;
        }
        if (ccase instanceof C11172l) {
            sb.append("BMPString(" + ((C11172l) ccase).mopub() + ") " + str6);
            return;
        }
        if (ccase instanceof C6057l) {
            sb.append("T61String(" + AbstractC9008l.yandex(((C6057l) ccase).f12828l) + ") " + str6);
            return;
        }
        if (ccase instanceof C3569l) {
            sb.append("GraphicString(" + AbstractC9008l.yandex(((C3569l) ccase).f7498l) + ") " + str6);
            return;
        }
        if (ccase instanceof C1929l) {
            sb.append("VideotexString(" + AbstractC9008l.yandex(((C1929l) ccase).f4393l) + ") " + str6);
            return;
        }
        if (ccase instanceof Cnew) {
            sb.append("UTCTime(" + ((Cnew) ccase).premium() + ") " + str6);
            return;
        }
        if (ccase instanceof Cpackage) {
            sb.append("GeneralizedTime(" + ((Cpackage) ccase).m4578throws() + ") " + str6);
            return;
        }
        if (ccase instanceof inmobi) {
            sb.append("DER Enumerated(" + new BigInteger(((inmobi) ccase).f838l) + ")" + str6);
            return;
        }
        if (ccase instanceof Cprivate) {
            sb.append("ObjectDescriptor(" + AbstractC9008l.yandex(((Cprivate) ccase).f36538l.f7498l) + ") " + str6);
            return;
        }
        if (!(ccase instanceof C4848l)) {
            sb.append(ccase.toString() + str6);
            return;
        }
        C4848l c4848l = (C4848l) ccase;
        Cstrictfp cstrictfp = c4848l.f9894l;
        Cfor cfor = c4848l.f9895l;
        sb.append("External " + str6);
        String strConcat4 = str.concat("    ");
        if (cfor != null) {
            StringBuilder sbAdvert = AbstractC5020l.advert(strConcat4, "Direct Reference: ");
            sbAdvert.append(cfor.inmobi());
            sbAdvert.append(str6);
            sb.append(sbAdvert.toString());
        }
        if (cstrictfp != null) {
            StringBuilder sbAdvert2 = AbstractC5020l.advert(strConcat4, "Indirect Reference: ");
            sbAdvert2.append(cstrictfp.toString());
            sbAdvert2.append(str6);
            sb.append(sbAdvert2.toString());
        }
        Ccase ccase2 = c4848l.f9893l;
        if (ccase2 != null) {
            yandex(strConcat4, ccase2, sb);
        }
        StringBuilder sbAdvert3 = AbstractC5020l.advert(strConcat4, "Encoding: ");
        sbAdvert3.append(c4848l.f9897l);
        sbAdvert3.append(str6);
        sb.append(sbAdvert3.toString());
        yandex(strConcat4, c4848l.f9896l, sb);
    }

    public abstract Object admob(Uri uri, InterfaceC14029l interfaceC14029l);

    public abstract Object amazon(InterfaceC14029l interfaceC14029l);

    public abstract Object mopub(Uri uri, InputEvent inputEvent, InterfaceC14029l interfaceC14029l);
}
