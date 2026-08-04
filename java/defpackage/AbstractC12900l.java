package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: renamed from: lٌّ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC12900l {
    public static void Signature(BouncyCastleProvider bouncyCastleProvider, Cfor cfor) {
        bouncyCastleProvider.addKeyInfoConverter(cfor, new C7979l(C7979l.yandex));
    }

    public static /* synthetic */ String ad(int i) {
        switch (i) {
            case 1:
                return "END_OF_DOCUMENT";
            case 2:
                return "DOUBLE";
            case 3:
                return "STRING";
            case 4:
                return "DOCUMENT";
            case 5:
                return "ARRAY";
            case 6:
                return "BINARY";
            case 7:
                return "UNDEFINED";
            case 8:
                return "OBJECT_ID";
            case 9:
                return "BOOLEAN";
            case 10:
                return "DATE_TIME";
            case 11:
                return "NULL";
            case 12:
                return "REGULAR_EXPRESSION";
            case 13:
                return "DB_POINTER";
            case 14:
                return "JAVASCRIPT";
            case 15:
                return "SYMBOL";
            case 16:
                return "JAVASCRIPT_WITH_SCOPE";
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return "INT32";
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return "TIMESTAMP";
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return "INT64";
            case 20:
                return "DECIMAL128";
            case 21:
                return "MIN_KEY";
            case 22:
                return "MAX_KEY";
            default:
                return "null";
        }
    }

    public static void adcel(Cfor cfor, String str, String str2, String str3, String str4) {
        cfor.premium(str);
        cfor.premium(str2);
        cfor.premium(str3);
        cfor.premium(str4);
    }

    public static String admob(Exception exc, StringBuilder sb) {
        sb.append(exc.getMessage());
        return sb.toString();
    }

    public static void ads(C6956l c6956l, boolean z, boolean z2, boolean z3) {
        c6956l.startapp(z);
        c6956l.startapp(z2);
        c6956l.startapp(z3);
    }

    public static /* synthetic */ String advert(int i) {
        if (i == 1) {
            return "SUSPEND";
        }
        if (i != 2) {
            return i != 3 ? "null" : "DROP_LATEST";
        }
        return "DROP_OLDEST";
    }

    public static int amazon(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    public static C6451l billing(int i, C6956l c6956l, boolean z) {
        c6956l.m2123default(i);
        c6956l.startapp(z);
        return new C6451l(11);
    }

    public static String firebase(String str, String str2) {
        return str + str2;
    }

    public static String isPro(String str, InterfaceC17739l interfaceC17739l) {
        return str + interfaceC17739l;
    }

    public static StringBuilder license(Cfor cfor, String str, String str2, StringBuilder sb, ConfigurableProvider configurableProvider) {
        sb.append(cfor);
        configurableProvider.addAlgorithm(sb.toString(), str);
        return new StringBuilder(str2);
    }

    public static void loadAd(InterfaceC0240l interfaceC0240l, InterfaceC0684l interfaceC0684l) {
        if (interfaceC0684l instanceof C15802l) {
            interfaceC0240l.loadAd(((C15802l) interfaceC0684l).f31025l);
        }
    }

    public static HashMap metrica(Class cls, C15317l c15317l) {
        HashMap map = new HashMap();
        map.put(cls, c15317l);
        return map;
    }

    public static String mopub(C6956l c6956l, int i, int i2, C6956l c6956l2, boolean z) {
        c6956l.m2123default(i);
        String strPurchase = AbstractC11999l.purchase(c6956l2, i2);
        c6956l.startapp(z);
        return strPurchase;
    }

    public static void pro(BouncyCastleProvider bouncyCastleProvider, Cfor cfor) {
        bouncyCastleProvider.addKeyInfoConverter(cfor, new C2595l(6));
    }

    public static int purchase(C2209l c2209l, int i, int i2) {
        return (c2209l.hashCode() + i) * i2;
    }

    public static StringBuilder remoteconfig(Cfor cfor, String str, String str2, StringBuilder sb, ConfigurableProvider configurableProvider) {
        sb.append(cfor);
        configurableProvider.addAlgorithm(sb.toString(), str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        return sb2;
    }

    public static String smaato(StringBuilder sb, long j, char c) {
        sb.append(j);
        sb.append(c);
        return sb.toString();
    }

    public static Map startapp(HashMap map) {
        return DesugarCollections.unmodifiableMap(new HashMap(map));
    }

    public static String subs(String str, InterfaceC10726l interfaceC10726l) {
        return str + interfaceC10726l;
    }

    public static void subscription(String str, int i, String str2) {
        AbstractC6427l.vip(str2, str + i);
    }

    public static void tapsense(StringBuilder sb, int i, String str, int i2, String str2) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
    }

    public static StringBuilder vip(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.addAlgorithm(str, str2);
        return new StringBuilder(str3);
    }

    public static Object yandex(List list, AbstractC0283l abstractC0283l) {
        return AbstractC10999l.firebase(AbstractC11463l.yandex, new C16177l(0, null, list), abstractC0283l);
    }
}
