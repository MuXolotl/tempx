package defpackage;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: renamed from: lْۢٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13743l {
    public static final C15578l yandex = new C15578l(-1638136831, false, new C12851l(18));
    public static final C15578l loadAd = new C15578l(-665205696, false, new C12851l(19));

    public static final void admob(C0114l c0114l) {
        C2989l c2989l = AbstractC1305l.yandex;
        C14092l c14092l = EnumC4673l.f9505l;
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(c14092l, 10));
        C11521l c11521l = new C11521l(0, c14092l);
        while (c11521l.hasNext()) {
            arrayList.add(((EnumC4673l) c11521l.next()).f9507l);
        }
    }

    public static String amazon(AbstractC15257l abstractC15257l) {
        StringBuilder sb = new StringBuilder(abstractC15257l.size());
        for (int i = 0; i < abstractC15257l.size(); i++) {
            byte bAmazon = abstractC15257l.amazon(i);
            if (bAmazon == 34) {
                sb.append("\\\"");
            } else if (bAmazon == 39) {
                sb.append("\\'");
            } else if (bAmazon != 92) {
                switch (bAmazon) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bAmazon < 32 || bAmazon > 126) {
                            sb.append('\\');
                            sb.append((char) (((bAmazon >>> 6) & 3) + 48));
                            sb.append((char) (((bAmazon >>> 3) & 7) + 48));
                            sb.append((char) ((bAmazon & 7) + 48));
                        } else {
                            sb.append((char) bAmazon);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final C13698l billing(C5950l c5950l) {
        return new C13698l(C3573l.f7503l, c5950l);
    }

    public static final String crashlytics(int i) {
        return AbstractC0653l.vip(i, "appWidget-");
    }

    public static final void firebase(C0114l c0114l, AbstractC1387l abstractC1387l) {
        C14092l c14092l = EnumC18681l.f36445l;
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(c14092l, 10));
        C11521l c11521l = new C11521l(0, c14092l);
        while (c11521l.hasNext()) {
            arrayList.add(new C5950l(abstractC1387l, ((EnumC18681l) c11521l.next()).ordinal()));
        }
    }

    public static final C13698l isPro(C5950l c5950l) {
        return new C13698l(C8696l.f17901l, c5950l);
    }

    public static final C13698l loadAd(C5950l c5950l) {
        return new C13698l(C2302l.f5002l, c5950l);
    }

    public static final boolean mopub(C3445l c3445l) {
        int i = c3445l.yandex;
        return Integer.MIN_VALUE <= i && i < -1;
    }

    public static final ArrayList purchase(Bundle bundle) {
        int i = bundle.getInt("appWidgetMinHeight", 0);
        int i2 = bundle.getInt("appWidgetMaxWidth", 0);
        C2261l c2261l = null;
        C2261l c2261l2 = (i == 0 || i2 == 0) ? null : new C2261l(AbstractC9027l.yandex(i2, i));
        int i3 = bundle.getInt("appWidgetMaxHeight", 0);
        int i4 = bundle.getInt("appWidgetMinWidth", 0);
        if (i3 != 0 && i4 != 0) {
            c2261l = new C2261l(AbstractC9027l.yandex(i4, i3));
        }
        return AbstractC8669l.m2420volatile(new C2261l[]{c2261l2, c2261l});
    }

    public static final C10038l smaato(C0114l c0114l) {
        C4130l c4130l = AbstractC1305l.amazon;
        C14092l c14092l = EnumC11212l.f22574l;
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(c14092l, 10));
        C11521l c11521l = new C11521l(0, c14092l);
        while (c11521l.hasNext()) {
            arrayList.add(((EnumC11212l) c11521l.next()).f22575l);
        }
        return new C10038l(c0114l, c4130l, c14092l, arrayList, 13);
    }

    public static final C10038l subs(C0114l c0114l) {
        C4130l c4130l = AbstractC1305l.purchase;
        C14092l c14092l = EnumC9790l.f19963l;
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(c14092l, 10));
        C11521l c11521l = new C11521l(0, c14092l);
        while (c11521l.hasNext()) {
            arrayList.add(((EnumC9790l) c11521l.next()).f19968l);
        }
        return new C10038l(c0114l, c4130l, c14092l, arrayList, 13);
    }

    public static void yandex(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                C6541l.subs(AbstractC0653l.vip(i2, "at index "));
                return;
            }
        }
    }
}
