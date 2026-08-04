package defpackage;

/* JADX INFO: renamed from: lًۣٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8358l {
    public static final C11474l yandex = AbstractC12155l.loadAd(C0194l.yandex, "kotlinx.serialization.json.JsonUnquotedLiteral");

    public static final AbstractC18121l admob(AbstractC9914l abstractC9914l) {
        AbstractC18121l abstractC18121l = abstractC9914l instanceof AbstractC18121l ? (AbstractC18121l) abstractC9914l : null;
        if (abstractC18121l != null) {
            return abstractC18121l;
        }
        crashlytics(abstractC9914l, "JsonPrimitive");
        throw null;
    }

    public static final Boolean amazon(AbstractC18121l abstractC18121l) {
        String strAmazon = abstractC18121l.amazon();
        String[] strArr = AbstractC4216l.yandex;
        if (strAmazon.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (strAmazon.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final Integer billing(AbstractC18121l abstractC18121l) {
        Long lValueOf;
        try {
            lValueOf = Long.valueOf(subs(abstractC18121l));
        } catch (C5114l unused) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            if (-2147483648L <= jLongValue && jLongValue <= 2147483647L) {
                return Integer.valueOf((int) jLongValue);
            }
        }
        return null;
    }

    public static final void crashlytics(AbstractC9914l abstractC9914l, String str) {
        throw new IllegalArgumentException("Element " + AbstractC18202l.yandex.loadAd(abstractC9914l.getClass()) + " is not a " + str);
    }

    public static final AbstractC18121l loadAd(String str) {
        return str == null ? C5544l.INSTANCE : new C16192l(str, true);
    }

    public static final C18010l mopub(AbstractC9914l abstractC9914l) {
        C18010l c18010l = abstractC9914l instanceof C18010l ? (C18010l) abstractC9914l : null;
        if (c18010l != null) {
            return c18010l;
        }
        crashlytics(abstractC9914l, "JsonObject");
        throw null;
    }

    public static final String purchase(AbstractC18121l abstractC18121l) {
        if (abstractC18121l instanceof C5544l) {
            return null;
        }
        return abstractC18121l.amazon();
    }

    public static final long subs(AbstractC18121l abstractC18121l) {
        C4163l c4163lYandex = AbstractC1789l.yandex(AbstractC8237l.amazon, abstractC18121l.amazon());
        String str = c4163lYandex.f8541l;
        long jSmaato = c4163lYandex.smaato();
        if (c4163lYandex.admob() == 10) {
            return jSmaato;
        }
        int i = c4163lYandex.f1972l;
        int i2 = i > 0 ? i - 1 : i;
        AbstractC0576l.tapsense(c4163lYandex, AbstractC15560l.Signature("Expected input to contain a single valid number, but got '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' after it"), i2, null, 4);
        throw null;
    }

    public static final AbstractC18121l yandex(Number number) {
        return new C16192l(number, false);
    }
}
