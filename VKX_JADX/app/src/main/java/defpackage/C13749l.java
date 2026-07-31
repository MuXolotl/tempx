package defpackage;

import android.content.SharedPreferences;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lْۢ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13749l extends AbstractC5563l implements Function3 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f26842l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f26843l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f26844l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13749l(C12825l c12825l, C11349l c11349l, InterfaceC14029l interfaceC14029l) {
        super(3, interfaceC14029l);
        this.f26843l = 2;
        this.f26844l = c12825l;
        this.f26842l = c11349l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws IOException {
        int i = 6;
        int i2 = 5;
        int i3 = 4;
        switch (this.f26843l) {
            case 0:
                C3597l c3597l = (C3597l) this.f26844l;
                C7315l c7315l = (C7315l) this.f26842l;
                AbstractC2829l.crashlytics(obj);
                return C3597l.loadAd(c3597l, null, null, null, c7315l, null, null, null, null, 131039);
            case 1:
                C3597l c3597l2 = (C3597l) this.f26844l;
                C18364l c18364l = (C18364l) this.f26842l;
                AbstractC2829l.crashlytics(obj);
                return C3597l.loadAd(c3597l2, null, c18364l, null, null, null, null, null, null, 131063);
            case 2:
                AbstractC2829l.crashlytics(obj);
                return null;
            case 3:
                AbstractC12074l abstractC12074l = (AbstractC12074l) this.f26844l;
                AbstractC2829l.crashlytics(obj);
                String string = ((C6806l) abstractC12074l.f24000l).yandex.toString();
                C16522l c16522l = new C16522l();
                C10541l c10541l = (C10541l) this.f26842l;
                C6806l c6806l = (C6806l) abstractC12074l.f24000l;
                C0090l c0090l = c6806l.crashlytics;
                C0090l c0090l2 = c16522l.yandex;
                AbstractC7720l.yandex(c0090l2, c0090l);
                C3223l c3223lM273l = c0090l2.m273l();
                c10541l.yandex.invoke(c16522l);
                for (Map.Entry entry : c3223lM273l.mopub()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    List listAdvert = c0090l2.advert(str);
                    if (listAdvert == null) {
                        c0090l2.mo199class(str, list);
                    } else if (!listAdvert.equals(list) && !str.equals("Cookie")) {
                        c0090l2.m205l(str);
                        c0090l2.mo199class(str, list);
                        c0090l2.m202l(str, listAdvert);
                    }
                }
                C2540l c2540lLoadAd = c16522l.loadAd.loadAd();
                C17289l c17289l = c2540lLoadAd.f5530l;
                C1461l c1461l = C10541l.loadAd;
                C13056l c13056l = c6806l.yandex;
                if (c13056l.amazon == null) {
                    c13056l.amazon = c17289l;
                }
                int i4 = 13;
                if (c13056l.yandex.length() <= 0) {
                    C13056l c13056l2 = new C13056l();
                    c13056l2.amazon = c17289l;
                    c13056l2.yandex = c2540lLoadAd.f5529l;
                    int i5 = c2540lLoadAd.f5528l;
                    Integer numValueOf = i5 != 0 ? Integer.valueOf(i5) : null;
                    c13056l2.purchase(numValueOf != null ? numValueOf.intValue() : c2540lLoadAd.f5537l.f33555l);
                    AbstractC11036l.admob(c13056l2, (String) c2540lLoadAd.f5534l.getValue());
                    c13056l2.purchase = (String) c2540lLoadAd.f5538l.getValue();
                    c13056l2.billing = (String) c2540lLoadAd.f5531l.getValue();
                    C10954l c10954l = new C10954l(13);
                    c10954l.m233l(AbstractC12311l.smaato(0, 6, (String) c2540lLoadAd.f5523l.getValue()));
                    c13056l2.subs = c10954l;
                    c13056l2.isPro = new C6921l(c10954l);
                    c13056l2.mopub = (String) c2540lLoadAd.f5527l.getValue();
                    c13056l2.loadAd = c2540lLoadAd.f5536l;
                    c13056l2.amazon = c13056l.amazon;
                    int i6 = c13056l.crashlytics;
                    if (i6 != 0) {
                        c13056l2.purchase(i6);
                    }
                    List listPurchase = c13056l2.admob;
                    List list2 = c13056l.admob;
                    if (!list2.isEmpty()) {
                        if (listPurchase.isEmpty() || ((CharSequence) AbstractC16901l.m4231native(list2)).length() == 0) {
                            listPurchase = list2;
                        } else {
                            C10227l c10227l = new C10227l((list2.size() + listPurchase.size()) - 1);
                            int size = listPurchase.size() - 1;
                            for (int i7 = 0; i7 < size; i7++) {
                                c10227l.add(listPurchase.get(i7));
                            }
                            c10227l.addAll(list2);
                            listPurchase = AbstractC14055l.purchase(c10227l);
                        }
                    }
                    c13056l2.admob = listPurchase;
                    if (c13056l.mopub.length() > 0) {
                        c13056l2.mopub = c13056l.mopub;
                    }
                    C10954l c10954l2 = new C10954l(13);
                    AbstractC7720l.yandex(c10954l2, c13056l2.subs);
                    InterfaceC0112l interfaceC0112l = c13056l.subs;
                    c13056l2.subs = interfaceC0112l;
                    c13056l2.isPro = new C6921l(interfaceC0112l);
                    for (Map.Entry entry2 : c10954l2.mopub()) {
                        String str2 = (String) entry2.getKey();
                        List list3 = (List) entry2.getValue();
                        if (!c13056l2.subs.contains(str2)) {
                            c13056l2.subs.mo199class(str2, list3);
                        }
                    }
                    AbstractC10433l.smaato(c13056l, c13056l2);
                }
                C17535l c17535l = c16522l.crashlytics;
                for (C11911l c11911l : c17535l.amazon()) {
                    C11911l c11911l2 = AbstractC14044l.yandex;
                    if (AbstractC8576l.yandex(c11911l, c11911l2)) {
                        Map map = (Map) c6806l.billing.yandex(c11911l2, new C3321l(i4));
                        for (Map.Entry entry3 : ((Map) c17535l.crashlytics(c11911l2)).entrySet()) {
                            InterfaceC17183l interfaceC17183l = (InterfaceC17183l) entry3.getKey();
                            Object value = entry3.getValue();
                            if (!map.containsKey(interfaceC17183l)) {
                                map.put(interfaceC17183l, value);
                            }
                        }
                    } else if (!c6806l.billing.loadAd(c11911l)) {
                        c6806l.billing.mopub(c11911l, c17535l.crashlytics(c11911l));
                    }
                }
                c6806l.crashlytics.clear();
                c6806l.crashlytics.m233l(c0090l2.m273l());
                InterfaceC6272l interfaceC6272l = AbstractC3552l.yandex;
                StringBuilder sbIsVip = AbstractC5020l.isVip("Applied DefaultRequest to ", string, ". New url: ");
                sbIsVip.append(c6806l.yandex);
                interfaceC6272l.vip(sbIsVip.toString());
                return Unit.INSTANCE;
            case 4:
                C3597l c3597l3 = (C3597l) this.f26844l;
                C1887l c1887l = (C1887l) this.f26842l;
                AbstractC2829l.crashlytics(obj);
                return C3597l.loadAd(c3597l3, null, null, c1887l, null, null, null, null, null, 131055);
            case 5:
                AbstractC18643l abstractC18643l = (AbstractC18643l) this.f26844l;
                EnumC12999l enumC12999l = (EnumC12999l) this.f26842l;
                AbstractC2829l.crashlytics(obj);
                return new C1921l(abstractC18643l, enumC12999l);
            case 6:
                C5086l c5086l = (C5086l) this.f26844l;
                EnumC17214l enumC17214l = (EnumC17214l) this.f26842l;
                AbstractC2829l.crashlytics(obj);
                int iOrdinal = enumC17214l.ordinal();
                if (iOrdinal == 0) {
                    return c5086l;
                }
                if (iOrdinal == 1) {
                    return C5086l.yandex(c5086l, AbstractC0509l.purchase(AbstractC16901l.m4240super(c5086l.crashlytics)));
                }
                if (iOrdinal == 2) {
                    return C5086l.yandex(c5086l, AbstractC0509l.purchase(AbstractC16901l.m4243this(c5086l.crashlytics, new C15696l(i3))));
                }
                if (iOrdinal == 3) {
                    return C5086l.yandex(c5086l, AbstractC0509l.purchase(AbstractC16901l.m4243this(c5086l.crashlytics, new C15696l(i))));
                }
                if (iOrdinal == 4) {
                    return C5086l.yandex(c5086l, AbstractC0509l.purchase(AbstractC16901l.m4243this(c5086l.crashlytics, new C15696l(i2))));
                }
                if (iOrdinal == 5) {
                    return C5086l.yandex(c5086l, AbstractC0509l.purchase(AbstractC16901l.m4243this(c5086l.crashlytics, new C15696l(7))));
                }
                C18725l.billing();
                return null;
            case 7:
                AbstractC2829l.crashlytics(obj);
                Throwable th = (Throwable) this.f26844l;
                Log.e("PipePresenceSrc", "Error in camera ID flow collection.", th);
                C15855l c15855l = (C15855l) this.f26842l;
                if (((AtomicBoolean) c15855l.f31107l).get()) {
                    c15855l.purchase(null, th);
                } else {
                    AbstractC15300l.loadAd(Log.d("PipePresenceSrc", "Ignoring error because monitoring is stopped."));
                }
                return Unit.INSTANCE;
            case 8:
                C17213l c17213l = (C17213l) this.f26844l;
                C16221l c16221l = (C16221l) this.f26842l;
                AbstractC2829l.crashlytics(obj);
                Set setKeySet = c16221l.yandex().keySet();
                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(setKeySet, 10));
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C16033l) it.next()).yandex);
                }
                LinkedHashMap linkedHashMapLoadAd = c17213l.loadAd();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry4 : linkedHashMapLoadAd.entrySet()) {
                    if (!arrayList.contains((String) entry4.getKey())) {
                        linkedHashMap.put(entry4.getKey(), entry4.getValue());
                    }
                }
                C16221l c16221lPurchase = c16221l.purchase();
                for (Map.Entry entry5 : linkedHashMap.entrySet()) {
                    String str3 = (String) entry5.getKey();
                    Object value2 = entry5.getValue();
                    if (value2 instanceof Boolean) {
                        c16221lPurchase.amazon(new C16033l(str3), value2);
                    } else if (value2 instanceof Float) {
                        c16221lPurchase.amazon(new C16033l(str3), value2);
                    } else if (value2 instanceof Integer) {
                        c16221lPurchase.amazon(new C16033l(str3), value2);
                    } else if (value2 instanceof Long) {
                        c16221lPurchase.amazon(new C16033l(str3), value2);
                    } else if (value2 instanceof String) {
                        c16221lPurchase.amazon(new C16033l(str3), value2);
                    } else if (value2 instanceof Set) {
                        c16221lPurchase.amazon(new C16033l(str3), (Set) value2);
                    }
                }
                return c16221lPurchase.billing();
            case 9:
                List listM4240super = (List) this.f26844l;
                EnumC17214l enumC17214l2 = (EnumC17214l) this.f26842l;
                AbstractC2829l.crashlytics(obj);
                int iOrdinal2 = enumC17214l2.ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        listM4240super = AbstractC16901l.m4240super(listM4240super);
                    } else if (iOrdinal2 == 2) {
                        listM4240super = AbstractC16901l.m4243this(listM4240super, new C15696l(16));
                    } else if (iOrdinal2 == 3) {
                        listM4240super = AbstractC16901l.m4243this(listM4240super, new C15696l(18));
                    } else if (iOrdinal2 == 4) {
                        listM4240super = AbstractC16901l.m4243this(listM4240super, new C15696l(17));
                    } else {
                        if (iOrdinal2 != 5) {
                            C18725l.billing();
                            return null;
                        }
                        listM4240super = AbstractC16901l.m4243this(listM4240super, new C15696l(19));
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(listM4240super, 10));
                Iterator it2 = listM4240super.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new C10893l((CachedTrack) it2.next()));
                }
                return AbstractC0509l.purchase(arrayList2);
            default:
                C17213l c17213l2 = (C17213l) this.f26844l;
                C18554l c18554l = (C18554l) this.f26842l;
                AbstractC2829l.crashlytics(obj);
                SharedPreferences sharedPreferences = c17213l2.yandex;
                c17213l2.yandex("now_playing_controller");
                return C18554l.loadAd(c18554l, AbstractC8576l.yandex(sharedPreferences.getString("now_playing_controller", "0"), "1"), c17213l2.crashlytics("swipe_nowplaying", true), false, c17213l2.crashlytics("interface_mpswipe", false), false, null, null, null, c17213l2.crashlytics("interface_roundednp", true), c17213l2.crashlytics("np_slide_hide_systembars", false), false, false, false, false, false, false, 261364);
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 3;
        switch (this.f26843l) {
            case 0:
                C13749l c13749l = new C13749l(i, (InterfaceC14029l) obj3, 0);
                c13749l.f26844l = (C3597l) obj;
                c13749l.f26842l = (C7315l) obj2;
                return c13749l.Signature(Unit.INSTANCE);
            case 1:
                C13749l c13749l2 = new C13749l(i, (InterfaceC14029l) obj3, 1);
                c13749l2.f26844l = (C3597l) obj;
                c13749l2.f26842l = (C18364l) obj2;
                return c13749l2.Signature(Unit.INSTANCE);
            case 2:
                new C13749l((C12825l) this.f26844l, (C11349l) this.f26842l, (InterfaceC14029l) obj3);
                AbstractC2829l.crashlytics(Unit.INSTANCE);
                return null;
            case 3:
                C13749l c13749l3 = new C13749l((C10541l) this.f26842l, (InterfaceC14029l) obj3, i);
                c13749l3.f26844l = (AbstractC12074l) obj;
                return c13749l3.Signature(Unit.INSTANCE);
            case 4:
                C13749l c13749l4 = new C13749l(i, (InterfaceC14029l) obj3, 4);
                c13749l4.f26844l = (C3597l) obj;
                c13749l4.f26842l = (C1887l) obj2;
                return c13749l4.Signature(Unit.INSTANCE);
            case 5:
                C13749l c13749l5 = new C13749l(i, (InterfaceC14029l) obj3, 5);
                c13749l5.f26844l = (AbstractC18643l) obj;
                c13749l5.f26842l = (EnumC12999l) obj2;
                return c13749l5.Signature(Unit.INSTANCE);
            case 6:
                C13749l c13749l6 = new C13749l(i, (InterfaceC14029l) obj3, 6);
                c13749l6.f26844l = (C5086l) obj;
                c13749l6.f26842l = (EnumC17214l) obj2;
                return c13749l6.Signature(Unit.INSTANCE);
            case 7:
                C13749l c13749l7 = new C13749l((C15855l) this.f26842l, (InterfaceC14029l) obj3, 7);
                c13749l7.f26844l = (Throwable) obj2;
                return c13749l7.Signature(Unit.INSTANCE);
            case 8:
                C13749l c13749l8 = new C13749l(i, (InterfaceC14029l) obj3, 8);
                c13749l8.f26844l = (C17213l) obj;
                c13749l8.f26842l = (C16221l) obj2;
                return c13749l8.Signature(Unit.INSTANCE);
            case 9:
                C13749l c13749l9 = new C13749l(i, (InterfaceC14029l) obj3, 9);
                c13749l9.f26844l = (List) obj;
                c13749l9.f26842l = (EnumC17214l) obj2;
                return c13749l9.Signature(Unit.INSTANCE);
            default:
                C13749l c13749l10 = new C13749l(i, (InterfaceC14029l) obj3, 10);
                c13749l10.f26844l = (C17213l) obj;
                c13749l10.f26842l = (C18554l) obj2;
                return c13749l10.Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13749l(int i, InterfaceC14029l interfaceC14029l, int i2) {
        super(i, interfaceC14029l);
        this.f26843l = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13749l(Object obj, InterfaceC14029l interfaceC14029l, int i) {
        super(3, interfaceC14029l);
        this.f26843l = i;
        this.f26842l = obj;
    }
}
