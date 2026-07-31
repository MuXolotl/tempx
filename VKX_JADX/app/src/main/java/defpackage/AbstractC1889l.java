package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؓٗٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1889l {
    public static final C15578l yandex = new C15578l(-8422107, false, new C5974l(10));

    public static boolean admob(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    public static final C14329l amazon(List list, ArrayList arrayList, ArrayList arrayList2, C14329l c14329l) {
        List list2 = c14329l.yandex;
        InterfaceC6097l interfaceC6097l = (InterfaceC6097l) AbstractC16901l.m4217extends(list2);
        C10227l c10227lAdmob = AbstractC14055l.admob();
        c10227lAdmob.addAll(list);
        if (arrayList == null) {
            c10227lAdmob.addAll(list2);
        } else if (interfaceC6097l instanceof C6994l) {
            c10227lAdmob.add(new C6994l(AbstractC16901l.m4232new(arrayList, ((C6994l) interfaceC6097l).yandex)));
            int iSmaato = AbstractC14055l.smaato(list2);
            int i = 1;
            if (1 <= iSmaato) {
                while (true) {
                    c10227lAdmob.add(list2.get(i));
                    if (i == iSmaato) {
                        break;
                    }
                    i++;
                }
            }
        } else {
            c10227lAdmob.add(new C6994l(arrayList));
            c10227lAdmob.addAll(list2);
        }
        c10227lAdmob.addAll(arrayList2);
        return new C14329l(AbstractC14055l.purchase(c10227lAdmob), c14329l.loadAd);
    }

    public static C9998l billing(C11338l c11338l, int i, ArrayList arrayList, C9998l c9998l) {
        int i2;
        int i3 = i == 0 ? c11338l.f22874while : c11338l.f22853implements;
        if (i3 != -1 && (c9998l == null || i3 != c9998l.loadAd)) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                C9998l c9998l2 = (C9998l) arrayList.get(i4);
                if (c9998l2.loadAd == i3) {
                    if (c9998l != null) {
                        c9998l.crashlytics(i, c9998l2);
                        arrayList.remove(c9998l);
                    }
                    c9998l = c9998l2;
                    break;
                }
            }
        } else if (i3 != -1) {
            return c9998l;
        }
        if (c9998l == null) {
            if (c11338l instanceof C0051l) {
                C0051l c0051l = (C0051l) c11338l;
                int i5 = 0;
                while (true) {
                    if (i5 >= c0051l.f937l) {
                        i2 = -1;
                        break;
                    }
                    C11338l c11338l2 = c0051l.f938return[i5];
                    if ((i == 0 && (i2 = c11338l2.f22874while) != -1) || (i == 1 && (i2 = c11338l2.f22853implements) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        C9998l c9998l3 = (C9998l) arrayList.get(i6);
                        if (c9998l3.loadAd == i2) {
                            c9998l = c9998l3;
                            break;
                        }
                    }
                }
            }
            if (c9998l == null) {
                c9998l = new C9998l();
                c9998l.yandex = new ArrayList();
                c9998l.amazon = null;
                c9998l.purchase = -1;
                int i7 = C9998l.billing;
                C9998l.billing = i7 + 1;
                c9998l.loadAd = i7;
                c9998l.crashlytics = i;
            }
            arrayList.add(c9998l);
        }
        ArrayList arrayList2 = c9998l.yandex;
        if (arrayList2.contains(c11338l)) {
            return c9998l;
        }
        arrayList2.add(c11338l);
        if (c11338l instanceof C10526l) {
            C10526l c10526l = (C10526l) c11338l;
            c10526l.f21417l.loadAd(c10526l.f21416l == 0 ? 1 : 0, c9998l, arrayList);
        }
        int i8 = c9998l.loadAd;
        if (i == 0) {
            c11338l.f22874while = i8;
            c11338l.f22867synchronized.loadAd(i, c9998l, arrayList);
            c11338l.f22873volatile.loadAd(i, c9998l, arrayList);
        } else {
            c11338l.f22853implements = i8;
            c11338l.f22864strictfp.loadAd(i, c9998l, arrayList);
            c11338l.f22860private.loadAd(i, c9998l, arrayList);
            c11338l.f22857native.loadAd(i, c9998l, arrayList);
        }
        c11338l.f22869throw.loadAd(i, c9998l, arrayList);
        return c9998l;
    }

    public static final void crashlytics(ArrayList arrayList, C10700l c10700l) {
        if (arrayList.isEmpty()) {
            return;
        }
        C10227l c10227lAdmob = AbstractC14055l.admob();
        Iterator it = new C3862l(arrayList).iterator();
        while (true) {
            ListIterator listIterator = (ListIterator) ((C8772l) it).f18067l;
            if (!listIterator.hasPrevious()) {
                c10700l.f21708l = purchase(new C14329l(AbstractC14055l.purchase(c10227lAdmob), C2580l.f5619l), (C14329l) c10700l.f21708l);
                arrayList.clear();
                return;
            }
            c10227lAdmob.addAll((List) listIterator.previous());
        }
    }

    public static final C14329l loadAd(List list) {
        C10700l c10700l = new C10700l();
        C2580l c2580l = C2580l.f5619l;
        c10700l.f21708l = new C14329l(c2580l, c2580l);
        ArrayList arrayList = new ArrayList();
        Iterator it = new C8892l(1, list).iterator();
        while (true) {
            ListIterator listIterator = (ListIterator) ((C8772l) it).f18067l;
            if (!listIterator.hasPrevious()) {
                crashlytics(arrayList, c10700l);
                return (C14329l) c10700l.f21708l;
            }
            C14329l c14329l = (C14329l) listIterator.previous();
            if (c14329l.loadAd.isEmpty()) {
                arrayList.add(c14329l.yandex);
            } else {
                crashlytics(arrayList, c10700l);
                c10700l.f21708l = purchase(c14329l, (C14329l) c10700l.f21708l);
            }
        }
    }

    public static C5900l mopub(C5900l c5900l, String[] strArr, Map map) {
        int i = 0;
        if (c5900l == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (C5900l) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C5900l c5900l2 = new C5900l();
                int length = strArr.length;
                while (i < length) {
                    c5900l2.yandex((C5900l) map.get(strArr[i]));
                    i++;
                }
                return c5900l2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                c5900l.yandex((C5900l) map.get(strArr[0]));
                return c5900l;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    c5900l.yandex((C5900l) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return c5900l;
    }

    public static final C14329l purchase(C14329l c14329l, C14329l c14329l2) {
        List list;
        List listSingletonList;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = null;
        for (InterfaceC6097l interfaceC6097l : c14329l.yandex) {
            if (interfaceC6097l instanceof C6994l) {
                if (arrayList3 != null) {
                    arrayList3.addAll(((C6994l) interfaceC6097l).yandex);
                } else {
                    arrayList3 = new ArrayList(((C6994l) interfaceC6097l).yandex);
                }
            } else if (interfaceC6097l instanceof C2531l) {
                arrayList2.add(interfaceC6097l);
            } else {
                if (arrayList3 != null) {
                    arrayList.add(new C6994l(arrayList3));
                    arrayList.addAll(arrayList2);
                    arrayList2.clear();
                    arrayList3 = null;
                }
                arrayList.add(interfaceC6097l);
            }
        }
        List list2 = c14329l.loadAd;
        ArrayList arrayList4 = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            C14329l c14329lPurchase = purchase((C14329l) it.next(), c14329l2);
            if (c14329lPurchase.yandex.isEmpty()) {
                listSingletonList = c14329lPurchase.loadAd;
                if (listSingletonList.isEmpty()) {
                    listSingletonList = Collections.singletonList(c14329lPurchase);
                }
            } else {
                listSingletonList = Collections.singletonList(c14329lPurchase);
            }
            AbstractC3984l.license(arrayList4, listSingletonList);
        }
        boolean zIsEmpty = arrayList4.isEmpty();
        List list3 = arrayList4;
        if (zIsEmpty) {
            if (!c14329l2.yandex.isEmpty()) {
                return amazon(arrayList, arrayList3, arrayList2, c14329l2);
            }
            list = c14329l2.loadAd;
        }
        if ((arrayList3 != null || arrayList.isEmpty()) && (list3 == null || !list3.isEmpty())) {
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                if (AbstractC16901l.m4217extends(((C14329l) it2.next()).yandex) instanceof C6994l) {
                    ArrayList arrayList5 = new ArrayList(AbstractC14055l.billing(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList5.add(amazon(C2580l.f5619l, arrayList3, arrayList2, (C14329l) it3.next()));
                    }
                    return new C14329l(arrayList, arrayList5);
                }
            }
        }
        if (arrayList3 != null) {
            arrayList.add(new C6994l(arrayList3));
        }
        arrayList.addAll(arrayList2);
        return new C14329l(arrayList, list3);
    }

    public static final void yandex(InterfaceC12001l interfaceC12001l, C9224l c9224l, C15578l c15578l, C6956l c6956l, int i, int i2) {
        int i3;
        int i4;
        c6956l.m2133new(227045628);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else {
            i3 = (c6956l.billing(interfaceC12001l) ? 4 : 2) | i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (c6956l.billing(c9224l) ? 32 : 16);
        }
        if ((i4 & 147) == 146 && c6956l.isVip()) {
            c6956l.m2124else();
        } else {
            if (i5 != 0) {
                interfaceC12001l = C9885l.yandex;
            }
            if (i6 != 0) {
                c9224l = C9224l.crashlytics;
            }
            c6956l.m2125final(1849434622);
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = C10546l.f21458l;
                c6956l.m2147try(objM2132native);
            }
            c6956l.startapp(false);
            Function0 function0 = (Function0) ((InterfaceC5059l) objM2132native);
            c6956l.m2125final(-683746039);
            c6956l.m2125final(-548224868);
            if (!(c6956l.yandex instanceof C2416l)) {
                AbstractC8238l.amazon();
                throw null;
            }
            c6956l.m2131interface();
            if (c6956l.f14603switch) {
                c6956l.firebase(function0);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC12001l, new C3755l(5));
            AbstractC8182l.billing(c6956l, c9224l, new C3755l(6));
            c15578l.invoke(c6956l, 6);
            c6956l.startapp(true);
            c6956l.startapp(false);
            c6956l.startapp(false);
        }
        InterfaceC12001l interfaceC12001l2 = interfaceC12001l;
        C9224l c9224l2 = c9224l;
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4810l(i, i2, 4, interfaceC12001l2, c9224l2, c15578l);
        }
    }
}
