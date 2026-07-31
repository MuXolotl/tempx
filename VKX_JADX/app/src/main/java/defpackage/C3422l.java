package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: lٌٖؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3422l implements Closeable {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C11911l f7274l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C16367l f7275l = new C16367l(2);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C7504l f7276l = AbstractC10999l.mopub(C1732l.f4136l, AbstractC11463l.loadAd, 0, new C6658l(this, (InterfaceC14029l) null, 1), 2);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final List f7277l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C13991l f7278l;

    static {
        InterfaceC13012l interfaceC13012lYandex;
        InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(C3422l.class);
        try {
            interfaceC13012lYandex = AbstractC18202l.yandex(C3422l.class);
        } catch (Throwable unused) {
            interfaceC13012lYandex = null;
        }
        f7274l = new C11911l("HttpCookies", new C11310l(interfaceC1388lLoadAd, interfaceC13012lYandex));
    }

    public C3422l(C13991l c13991l, List list) {
        this.f7278l = c13991l;
        this.f7277l = list;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object billing(C2540l c2540l, AbstractC0283l abstractC0283l) {
        C17547l c17547l;
        if (abstractC0283l instanceof C17547l) {
            c17547l = (C17547l) abstractC0283l;
            int i = c17547l.f34165l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c17547l.f34165l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c17547l = new C17547l(this, abstractC0283l);
            }
        } else {
            c17547l = new C17547l(this, abstractC0283l);
        }
        Object obj = c17547l.f34166l;
        int i2 = c17547l.f34165l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            c17547l.f34167l = c2540l;
            c17547l.f34165l = 1;
            if (this.f7276l.mo2158switch(c17547l) != enumC9342l) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC2829l.crashlytics(obj);
                return obj;
            }
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        c2540l = c17547l.f34167l;
        AbstractC2829l.crashlytics(obj);
        c17547l.f34167l = null;
        c17547l.f34165l = 2;
        Serializable serializableMopub = this.f7278l.mopub(c2540l, c17547l);
        return serializableMopub == enumC9342l ? enumC9342l : serializableMopub;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7278l.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object mopub(AbstractC10022l abstractC10022l, AbstractC0283l abstractC0283l) {
        C2499l c2499l;
        int i;
        Iterable iterable;
        Iterator it;
        C2540l c2540l;
        int i2;
        Map.Entry entry;
        EnumC3116l enumC3116lValueOf;
        CharSequence charSequenceSubSequence;
        String str;
        Object c18435l;
        boolean z;
        String strAmazon;
        List listSingletonList;
        int i3;
        if (abstractC0283l instanceof C2499l) {
            c2499l = (C2499l) abstractC0283l;
            int i4 = c2499l.f5300l;
            if ((i4 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c2499l.f5300l = i4 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c2499l = new C2499l(this, abstractC0283l);
            }
        } else {
            c2499l = new C2499l(this, abstractC0283l);
        }
        Object obj = c2499l.f5296l;
        int i5 = c2499l.f5300l;
        Integer num = null;
        if (i5 == 0) {
            AbstractC2829l.crashlytics(obj);
            C2540l url = AbstractC3474l.mopub(abstractC10022l).getUrl();
            List<String> listAdvert = abstractC10022l.yandex().advert("Set-Cookie");
            if (listAdvert != null) {
                for (String str2 : listAdvert) {
                    InterfaceC6272l interfaceC6272l = AbstractC5799l.yandex;
                    StringBuilder sbIsVip = AbstractC5020l.isVip("Received cookie ", str2, " in response for ");
                    InterfaceC1814l interfaceC1814l = abstractC10022l.loadAd().f27846l;
                    if (interfaceC1814l == null) {
                        interfaceC1814l = null;
                    }
                    sbIsVip.append(interfaceC1814l.getUrl());
                    interfaceC6272l.vip(sbIsVip.toString());
                }
            }
            List<String> listAdvert2 = abstractC10022l.yandex().advert("Set-Cookie");
            int i6 = 0;
            if (listAdvert2 != null) {
                ArrayList arrayList = new ArrayList();
                for (String str3 : listAdvert2) {
                    int iM3321extends = AbstractC12024l.m3321extends(str3, ',', i6, 6);
                    if (iM3321extends == -1) {
                        listSingletonList = Collections.singletonList(str3);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        int iM3321extends2 = AbstractC12024l.m3321extends(str3, '=', iM3321extends, 4);
                        char c = ';';
                        int iM3321extends3 = AbstractC12024l.m3321extends(str3, ';', iM3321extends, 4);
                        while (true) {
                            if (i6 >= str3.length() || iM3321extends <= 0) {
                                if (i6 >= str3.length()) {
                                    break;
                                }
                                arrayList2.add(str3.substring(i6));
                                break;
                            }
                            if (iM3321extends2 < iM3321extends) {
                                iM3321extends2 = AbstractC12024l.m3321extends(str3, '=', iM3321extends, 4);
                            }
                            int iM3321extends4 = AbstractC12024l.m3321extends(str3, ',', iM3321extends + 1, 4);
                            while (true) {
                                int i7 = iM3321extends4;
                                i3 = iM3321extends;
                                iM3321extends = i7;
                                if (iM3321extends < 0 || iM3321extends >= iM3321extends2) {
                                    break;
                                }
                                iM3321extends4 = AbstractC12024l.m3321extends(str3, ',', iM3321extends + 1, 4);
                            }
                            if (iM3321extends3 < i3) {
                                iM3321extends3 = AbstractC12024l.m3321extends(str3, c, i3, 4);
                            }
                            if (iM3321extends2 < 0) {
                                arrayList2.add(str3.substring(i6));
                                break;
                            }
                            if (iM3321extends3 == -1 || iM3321extends3 > iM3321extends2) {
                                arrayList2.add(str3.substring(i6, i3));
                                i6 = i3 + 1;
                            }
                            c = ';';
                        }
                        listSingletonList = arrayList2;
                    }
                    AbstractC3984l.license(arrayList, listSingletonList);
                    num = num;
                    i6 = 0;
                }
                Integer num2 = num;
                ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Map mapYandex = AbstractC5754l.yandex((String) it2.next(), false);
                    Iterator it3 = mapYandex.entrySet().iterator();
                    do {
                        if (!it3.hasNext()) {
                            C1759l.firebase("Collection contains no element matching the predicate.");
                            return num2;
                        }
                        entry = (Map.Entry) it3.next();
                    } while (AbstractC16648l.isVip((String) entry.getKey(), "$", false));
                    String str4 = (String) mapYandex.get("$x-enc");
                    if (str4 == null || (enumC3116lValueOf = EnumC3116l.valueOf(str4)) == null) {
                        enumC3116lValueOf = EnumC3116l.f6659l;
                    }
                    EnumC3116l enumC3116l = enumC3116lValueOf;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC2200l.firebase(mapYandex.size()));
                    for (Map.Entry entry2 : mapYandex.entrySet()) {
                        linkedHashMap.put(AbstractC7236l.admob((String) entry2.getKey()), entry2.getValue());
                    }
                    String str5 = (String) entry.getKey();
                    String strM3342super = (String) entry.getValue();
                    int iOrdinal = enumC3116l.ordinal();
                    if (iOrdinal == 0 || iOrdinal == 1) {
                        int length = strM3342super.length();
                        int i8 = 0;
                        while (true) {
                            if (i8 >= length) {
                                charSequenceSubSequence = "";
                                break;
                            }
                            if (!AbstractC8576l.remoteconfig(strM3342super.charAt(i8))) {
                                charSequenceSubSequence = strM3342super.subSequence(i8, strM3342super.length());
                                break;
                            }
                            i8++;
                        }
                        if (AbstractC16648l.isVip(charSequenceSubSequence.toString(), "\"", false) && AbstractC16648l.Signature(AbstractC12024l.m3331l(strM3342super).toString(), "\"", false)) {
                            strM3342super = AbstractC12024l.m3342super(AbstractC12024l.m3330l(strM3342super).toString());
                        }
                        str = strM3342super;
                    } else {
                        if (iOrdinal == 2) {
                            z = false;
                            strAmazon = AbstractC2208l.amazon(0, 0, 11, strM3342super);
                        } else {
                            if (iOrdinal != 3) {
                                C18725l.billing();
                                return num2;
                            }
                            z = false;
                            strAmazon = AbstractC16648l.ads(C7714l.yandex(C7714l.billing, strM3342super, 0, 6));
                        }
                        str = strAmazon;
                    }
                    String str6 = (String) linkedHashMap.get("max-age");
                    Integer numValueOf = str6 != null ? Integer.valueOf((int) AbstractC8576l.mopub(Long.parseLong(str6), 0L, 2147483647L)) : num2;
                    try {
                        String str7 = (String) linkedHashMap.get("expires");
                        c18435l = str7 != null ? AbstractC13894l.yandex(str7) : num2;
                    } catch (Throwable th) {
                        c18435l = new C18435l(th);
                    }
                    if (c18435l instanceof C18435l) {
                        c18435l = num2;
                    }
                    C8485l c8485l = (C8485l) c18435l;
                    String str8 = (String) linkedHashMap.get("domain");
                    String str9 = (String) linkedHashMap.get("path");
                    boolean zContainsKey = linkedHashMap.containsKey("secure");
                    boolean zContainsKey2 = linkedHashMap.containsKey("httponly");
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry3 : mapYandex.entrySet()) {
                        String str10 = (String) entry3.getKey();
                        if (!AbstractC5754l.yandex.contains(AbstractC7236l.admob(str10)) && !str10.equals(entry.getKey())) {
                            linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                        }
                    }
                    arrayList3.add(new C13325l(str5, str, enumC3116l, numValueOf, c8485l, str8, str9, zContainsKey, zContainsKey2, linkedHashMap2));
                }
                i = 0;
                iterable = arrayList3;
            } else {
                i = 0;
                iterable = C2580l.f5619l;
            }
            it = iterable.iterator();
            c2540l = url;
            i2 = i;
        } else {
            if (i5 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = c2499l.f5301l;
            it = c2499l.f5298l;
            c2540l = c2499l.f5299l;
            AbstractC2829l.crashlytics(obj);
        }
        while (it.hasNext()) {
            C13325l c13325l = (C13325l) it.next();
            c2499l.f5299l = c2540l;
            c2499l.f5298l = it;
            c2499l.f5301l = i2;
            c2499l.f5300l = 1;
            Object objYandex = this.f7278l.yandex(c2540l, c13325l, c2499l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objYandex == enumC9342l) {
                return enumC9342l;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object vip(C6806l c6806l, AbstractC0283l abstractC0283l) throws IOException {
        C12483l c12483l;
        if (abstractC0283l instanceof C12483l) {
            c12483l = (C12483l) abstractC0283l;
            int i = c12483l.f24618l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c12483l.f24618l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c12483l = new C12483l(this, abstractC0283l);
            }
        } else {
            c12483l = new C12483l(this, abstractC0283l);
        }
        Object objBilling = c12483l.f24619l;
        int i2 = c12483l.f24618l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objBilling);
            C13056l c13056l = c6806l.yandex;
            C13056l c13056l2 = new C13056l();
            AbstractC10433l.smaato(c13056l2, c13056l);
            C2540l c2540lLoadAd = c13056l2.loadAd();
            c12483l.f24620l = c6806l;
            c12483l.f24618l = 1;
            objBilling = billing(c2540lLoadAd, c12483l);
            Object obj = EnumC9342l.f19165l;
            if (objBilling == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c6806l = c12483l.f24620l;
            AbstractC2829l.crashlytics(objBilling);
        }
        List list = (List) objBilling;
        if (list.isEmpty()) {
            c6806l.crashlytics.m205l("Cookie");
        } else {
            InterfaceC6272l interfaceC6272l = AbstractC5799l.yandex;
            String strM4210case = AbstractC16901l.m4210case(list, "; ", null, null, C8947l.f18427l, 30);
            c6806l.crashlytics.m223l("Cookie", strM4210case);
            InterfaceC6272l interfaceC6272l2 = AbstractC5799l.yandex;
            StringBuilder sbIsVip = AbstractC5020l.isVip("Sending cookie ", strM4210case, " for ");
            sbIsVip.append(c6806l.yandex);
            interfaceC6272l2.vip(sbIsVip.toString());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object yandex(C6806l c6806l, AbstractC0283l abstractC0283l) {
        C15454l c15454l;
        int i;
        Iterator it;
        C2540l c2540l;
        int i2;
        if (abstractC0283l instanceof C15454l) {
            c15454l = (C15454l) abstractC0283l;
            int i3 = c15454l.f30212l;
            if ((i3 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c15454l.f30212l = i3 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c15454l = new C15454l(this, abstractC0283l);
            }
        } else {
            c15454l = new C15454l(this, abstractC0283l);
        }
        Object obj = c15454l.f30211l;
        int i4 = c15454l.f30212l;
        ArrayList arrayList = null;
        if (i4 == 0) {
            AbstractC2829l.crashlytics(obj);
            C13056l c13056l = c6806l.yandex;
            C13056l c13056l2 = new C13056l();
            AbstractC10433l.smaato(c13056l2, c13056l);
            C2540l c2540lLoadAd = c13056l2.loadAd();
            String strM217l = c6806l.crashlytics.m217l("Cookie");
            if (strM217l != null) {
                InterfaceC6272l interfaceC6272l = AbstractC5799l.yandex;
                StringBuilder sbIsVip = AbstractC5020l.isVip("Saving cookie ", strM217l, " for ");
                sbIsVip.append(c6806l.yandex);
                interfaceC6272l.vip(sbIsVip.toString());
                Map mapYandex = AbstractC5754l.yandex(strM217l, true);
                arrayList = new ArrayList(mapYandex.size());
                for (Map.Entry entry : mapYandex.entrySet()) {
                    arrayList.add(new C13325l((String) entry.getKey(), (String) entry.getValue(), EnumC3116l.f6659l, null, null, null, null, false, false, C14054l.f27396l));
                }
            }
            if (arrayList != null) {
                i = 0;
                it = arrayList.iterator();
                c2540l = c2540lLoadAd;
                i2 = 0;
            }
            return Unit.INSTANCE;
        }
        if (i4 != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i2 = c15454l.f30210l;
        i = c15454l.f30216l;
        it = c15454l.f30213l;
        c2540l = c15454l.f30214l;
        AbstractC2829l.crashlytics(obj);
        while (it.hasNext()) {
            C13325l c13325l = (C13325l) it.next();
            c15454l.f30214l = c2540l;
            c15454l.f30213l = it;
            c15454l.f30216l = i;
            c15454l.f30210l = i2;
            c15454l.f30212l = 1;
            Object objYandex = this.f7278l.yandex(c2540l, c13325l, c15454l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objYandex == enumC9342l) {
                return enumC9342l;
            }
        }
        return Unit.INSTANCE;
    }
}
