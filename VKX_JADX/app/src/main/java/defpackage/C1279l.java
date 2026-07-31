package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.Unit;

/* JADX INFO: renamed from: lؒۗۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1279l implements InterfaceC8180l {
    public static final C1279l yandex = new C1279l();
    public static final C11155l loadAd = new C11155l("[\\[<](\\d+):(\\d+)\\.(\\d+)[]>]");
    public static final C13047l crashlytics = AbstractC9549l.yandex(new C18334l(14));

    public static C8195l loadAd(String str) {
        Matcher matcher = loadAd.f22430l.matcher(str);
        C0711l c0711l = !matcher.find(0) ? null : new C0711l(matcher, str);
        if (c0711l == null) {
            return null;
        }
        String str2 = (String) ((C8892l) c0711l.yandex()).get(1);
        String str3 = (String) ((C8892l) c0711l.yandex()).get(2);
        String str4 = (String) ((C8892l) c0711l.yandex()).get(3);
        C6760l c6760l = C9658l.f19699l;
        Integer numSignatures = AbstractC16648l.signatures(str2);
        long jTapsense = AbstractC15918l.tapsense(numSignatures != null ? numSignatures.intValue() : 0, EnumC16636l.MINUTES);
        Integer numSignatures2 = AbstractC16648l.signatures(str3);
        long jMopub = C9658l.mopub(jTapsense, AbstractC15918l.tapsense(numSignatures2 != null ? numSignatures2.intValue() : 0, EnumC16636l.SECONDS));
        Integer numSignatures3 = AbstractC16648l.signatures(str4);
        long jMopub2 = C9658l.mopub(jMopub, AbstractC15918l.tapsense(numSignatures3 != null ? numSignatures3.intValue() : 0, EnumC16636l.MILLISECONDS));
        int iM3321extends = AbstractC12024l.m3321extends(str, str.charAt(0) == '[' ? ']' : '>', 0, 6);
        if (iM3321extends != -1) {
            str = str.substring(iM3321extends + 1, str.length());
        }
        return new C8195l(Long.valueOf(C9658l.amazon(jMopub2)), AbstractC12024l.m3330l(str).toString());
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00da  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:37:0x0105  */
    /* JADX WARN: Code duplicated, block: B:39:0x010b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0113  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC8180l
    public final Object yandex(C16864l c16864l, AbstractC18643l abstractC18643l, InterfaceC14029l interfaceC14029l) throws Throwable {
        C2984l c2984l;
        AbstractC18643l abstractC18643l2;
        AbstractC18121l abstractC18121lBilling;
        boolean zYandex;
        AbstractC18121l abstractC18121lBilling2;
        AbstractC18121l abstractC18121lBilling3;
        AbstractC18121l abstractC18121lBilling4;
        int iVip;
        Integer numBilling;
        if (interfaceC14029l instanceof C2984l) {
            c2984l = (C2984l) interfaceC14029l;
            int i = c2984l.f6488l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c2984l.f6488l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c2984l = new C2984l(this, (AbstractC0283l) interfaceC14029l);
            }
        } else {
            c2984l = new C2984l(this, (AbstractC0283l) interfaceC14029l);
        }
        Object objAdvert = c2984l.f6489l;
        int i2 = c2984l.f6488l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objAdvert);
            C6806l c6806l = new C6806l();
            AbstractC12323l.yandex(c6806l, "https://lrclib.net/api/get");
            C13056l c13056l = c6806l.yandex;
            c13056l.isPro.mo214l("track_name", abstractC18643l.getLoadAd());
            c13056l.isPro.mo214l("artist_name", abstractC18643l.getYandex());
            c13056l.isPro.mo214l("duration", String.valueOf(abstractC18643l.vip() / 1000));
            String strFirebase = abstractC18643l.firebase();
            if (strFirebase != null) {
                c13056l.isPro.mo214l("album_name", strFirebase);
            }
            Unit unit = Unit.INSTANCE;
            c6806l.crashlytics.mo214l("User-Agent", "VKX v8.14.1_pub (https://vkx.app)");
            c6806l.loadAd = C17721l.loadAd;
            C3797l c3797l = new C3797l(c6806l, c16864l, 26);
            c2984l.f6490l = abstractC18643l;
            c2984l.f6488l = 1;
            objAdvert = c3797l.advert(c2984l);
            if (objAdvert != enumC9342l) {
            }
            return enumC9342l;
        }
        if (i2 == 1) {
            abstractC18643l = c2984l.f6490l;
            AbstractC2829l.crashlytics(objAdvert);
        } else {
            if (i2 != 2) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            abstractC18643l2 = c2984l.f6490l;
            AbstractC2829l.crashlytics(objAdvert);
        }
        C13047l c13047l = crashlytics;
        c13047l.getClass();
        C18010l c18010l = (C18010l) c13047l.loadAd(C18010l.Companion.serializer(), (String) objAdvert);
        abstractC18121lBilling = AbstractC1788l.billing(c18010l, "instrumental");
        if (abstractC18121lBilling != null) {
            zYandex = AbstractC8576l.yandex(AbstractC8358l.amazon(abstractC18121lBilling), Boolean.TRUE);
        } else {
            zYandex = false;
        }
        abstractC18121lBilling2 = AbstractC1788l.billing(c18010l, "plainLyrics");
        abstractC18121lBilling3 = AbstractC1788l.billing(c18010l, "syncedLyrics");
        abstractC18121lBilling4 = AbstractC1788l.billing(c18010l, "duration");
        if (abstractC18121lBilling4 != null || (numBilling = AbstractC8358l.billing(abstractC18121lBilling4)) == null) {
            iVip = abstractC18643l2.vip();
        } else {
            iVip = numBilling.intValue() * 1000;
        }
        if (zYandex) {
            return new C6143l("Instrumental", null);
        }
        if (abstractC18121lBilling3 != null || !abstractC18121lBilling3.billing()) {
            return (abstractC18121lBilling2 == null && abstractC18121lBilling2.billing()) ? new C6143l(abstractC18121lBilling2.amazon(), null) : C6884l.INSTANCE;
        }
        String strAmazon = abstractC18121lBilling3.amazon();
        ArrayList arrayList = new ArrayList();
        List listM3316class = AbstractC12024l.m3316class(strAmazon);
        int size = listM3316class.size();
        for (int i3 = 0; i3 < size; i3++) {
            C8195l c8195lLoadAd = loadAd((String) listM3316class.get(i3));
            if (c8195lLoadAd != null) {
                Object obj = c8195lLoadAd.f17097l;
                String str = (String) AbstractC16901l.m4220for(i3 + 1, listM3316class);
                C8195l c8195lLoadAd2 = str != null ? loadAd(str) : null;
                long jLongValue = ((Number) c8195lLoadAd.f17098l).longValue();
                long jLongValue2 = c8195lLoadAd2 != null ? ((Number) c8195lLoadAd2.f17098l).longValue() : iVip;
                arrayList.add(AbstractC12024l.m3315catch((CharSequence) obj) ? new C6331l(jLongValue, jLongValue2) : new C11054l((String) obj, jLongValue, jLongValue2));
            }
        }
        return new C16016l(arrayList, null);
        AbstractC10022l abstractC10022l = (AbstractC10022l) objAdvert;
        if (!AbstractC8576l.yandex(abstractC10022l.mopub(), C2759l.f5975l)) {
            return AbstractC8576l.yandex(abstractC10022l.mopub(), C2759l.f5976l) ? C6884l.INSTANCE : C10760l.INSTANCE;
        }
        c2984l.f6490l = abstractC18643l;
        c2984l.f6488l = 2;
        objAdvert = AbstractC3474l.loadAd(abstractC10022l, AbstractC9050l.yandex, c2984l);
        if (objAdvert != enumC9342l) {
            abstractC18643l2 = abstractC18643l;
            C13047l c13047l2 = crashlytics;
            c13047l2.getClass();
            C18010l c18010l2 = (C18010l) c13047l2.loadAd(C18010l.Companion.serializer(), (String) objAdvert);
            abstractC18121lBilling = AbstractC1788l.billing(c18010l2, "instrumental");
            if (abstractC18121lBilling != null) {
                zYandex = AbstractC8576l.yandex(AbstractC8358l.amazon(abstractC18121lBilling), Boolean.TRUE);
            } else {
                zYandex = false;
            }
            abstractC18121lBilling2 = AbstractC1788l.billing(c18010l2, "plainLyrics");
            abstractC18121lBilling3 = AbstractC1788l.billing(c18010l2, "syncedLyrics");
            abstractC18121lBilling4 = AbstractC1788l.billing(c18010l2, "duration");
            if (abstractC18121lBilling4 != null) {
                iVip = abstractC18643l2.vip();
            } else {
                iVip = abstractC18643l2.vip();
            }
            if (zYandex) {
                return new C6143l("Instrumental", null);
            }
            if (abstractC18121lBilling3 != null) {
            }
            if (abstractC18121lBilling2 == null) {
            }
        }
        return enumC9342l;
    }
}
