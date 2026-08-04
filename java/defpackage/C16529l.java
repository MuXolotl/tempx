package defpackage;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: lٖٞؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16529l {
    public static final Set amazon;
    public static final C16529l billing;
    public static final String crashlytics;
    public static final C16529l purchase;
    public final String loadAd;
    public final String yandex;

    static {
        String strYandex = AbstractC1760l.yandex("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        crashlytics = strYandex;
        String strYandex2 = AbstractC1760l.yandex("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strYandex3 = AbstractC1760l.yandex("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        amazon = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(new C7017l("proto"), new C7017l("json"))));
        purchase = new C16529l(strYandex, null);
        billing = new C16529l(strYandex2, strYandex3);
    }

    public C16529l(String str, String str2) {
        this.yandex = str;
        this.loadAd = str2;
    }

    public static C16529l yandex(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            C8339l.metrica("Version marker missing from extras");
            return null;
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            C8339l.metrica("Extra is not a valid encoded LegacyFlgDestination");
            return null;
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            C8339l.metrica("Missing endpoint in CCTDestination extras");
            return null;
        }
        String str3 = strArrSplit[1];
        return new C16529l(str2, str3.isEmpty() ? null : str3);
    }
}
