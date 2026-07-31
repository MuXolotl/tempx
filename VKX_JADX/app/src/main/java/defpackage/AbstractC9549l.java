package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍٓ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9549l {
    public static String purchase = "vk.com";
    public static final int[] yandex = {1, 10, 100, 1000, ModuleDescriptor.MODULE_VERSION, 100000, 1000000, 10000000, 100000000, 1000000000};
    public static final int[] loadAd = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
    public static final int[] crashlytics = {3, 6};
    public static final int[] amazon = {1, 2, 4, 5, 7, 8};

    public static final String admob(CharSequence charSequence, int i) {
        if (charSequence.length() <= i) {
            return charSequence.toString();
        }
        return charSequence.subSequence(0, i).toString() + "...";
    }

    public static final C18396l billing(CharSequence charSequence, String str) {
        StringBuilder sbAdvert = AbstractC5020l.advert(str, " when parsing an Instant from \"");
        sbAdvert.append(admob(charSequence, 64));
        sbAdvert.append('\"');
        return new C18396l(sbAdvert.toString(), charSequence, 0);
    }

    public static int crashlytics(long j) {
        return (int) ((j - (((long) ((int) (58728449 * j))) * 8380417)) >>> 32);
    }

    public static final void loadAd(StringBuilder sb, StringBuilder sb2, int i) {
        if (i < 10) {
            sb.append('0');
        }
        sb2.append(i);
    }

    public static final int mopub(CharSequence charSequence, int i) {
        return (charSequence.charAt(i + 1) - '0') + ((charSequence.charAt(i) - '0') * 10);
    }

    public static final C18396l purchase(CharSequence charSequence, String str, int i, Function1 function1) {
        char cCharAt = charSequence.charAt(i);
        if (((Boolean) function1.invoke(Character.valueOf(cCharAt))).booleanValue()) {
            return null;
        }
        return billing(charSequence, "Expected " + str + ", but got '" + cCharAt + "' at position " + i);
    }

    public static C13047l yandex(Function1 function1) {
        C15913l c15913l = AbstractC8237l.amazon;
        C4105l c4105l = new C4105l();
        C17752l c17752l = c15913l.yandex;
        c4105l.yandex = c17752l.yandex;
        boolean z = c17752l.purchase;
        c4105l.loadAd = c17752l.loadAd;
        c4105l.crashlytics = c17752l.crashlytics;
        String str = c17752l.billing;
        c4105l.amazon = c17752l.mopub;
        String str2 = c17752l.admob;
        int i = c17752l.firebase;
        boolean z2 = c17752l.isPro;
        c4105l.purchase = c17752l.subs;
        c4105l.billing = c17752l.amazon;
        C13975l c13975l = c15913l.loadAd;
        boolean z3 = c17752l.smaato;
        function1.invoke(c4105l);
        if (AbstractC8576l.yandex(str, "    ")) {
            return new C13047l(new C17752l(c4105l.yandex, c4105l.loadAd, c4105l.crashlytics, c4105l.billing, z, str, c4105l.amazon, str2, c4105l.purchase, z2, i, z3), c13975l);
        }
        C8339l.metrica("Indent should not be specified when default printing mode is used");
        return null;
    }

    public abstract Object amazon();
}
