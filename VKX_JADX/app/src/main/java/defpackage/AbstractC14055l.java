package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٍَٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14055l {
    public static final float loadAd = 30.0f;
    public static final C4875l yandex = new C4875l(10);

    public static final void adcel(int i, int i2) {
        if (i2 < 0) {
            C8339l.metrica(AbstractC15560l.tapsense("fromIndex (0) is greater than toIndex (", i2, ")."));
        } else {
            if (i2 <= i) {
                return;
            }
            C18262l.adcel(AbstractC12589l.applovin(i2, i, "toIndex (", ") is greater than size (", ")."));
        }
    }

    public static C10227l admob() {
        return new C10227l(10);
    }

    public static void ads() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static int amazon(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        adcel(arrayList.size(), size);
        int i = size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int iCrashlytics = AbstractC2920l.crashlytics((Comparable) arrayList.get(i3), comparable);
            if (iCrashlytics < 0) {
                i2 = i3 + 1;
            } else {
                if (iCrashlytics <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static int billing(Iterable iterable, int i) {
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    public static ArrayList crashlytics(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C14743l(objArr, true));
    }

    public static C8934l firebase(Collection collection) {
        return new C8934l(0, collection.size() - 1, 1);
    }

    public static ArrayList isPro(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC3984l.license(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }

    public static void loadAd(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    public static ArrayList metrica(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C14743l(objArr, true));
    }

    public static void mopub(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
        jArr2[5] = jArr[5];
        jArr2[6] = jArr[6];
        jArr2[7] = jArr[7];
    }

    public static C10227l purchase(C10227l c10227l) {
        c10227l.premium();
        c10227l.f20844l = true;
        return c10227l.f20845l > 0 ? c10227l : C10227l.f20843l;
    }

    public static List remoteconfig(Object... objArr) {
        return objArr.length > 0 ? Arrays.asList(objArr) : C2580l.f5619l;
    }

    public static int smaato(List list) {
        return list.size() - 1;
    }

    public static final List startapp(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : Collections.singletonList(list.get(0));
        }
        return C2580l.f5619l;
    }

    public static InterfaceC17242l subs(C18297l c18297l, C2403l c2403l, Function1 function1, Function0 function0, int i) {
        if ((i & 2) != 0) {
            c2403l = null;
        }
        C11485l c11485l = C11485l.f23073l;
        c18297l.getClass();
        return new C6085l(new C14840l(c18297l, c2403l, c11485l, function1, function0));
    }

    public static void subscription() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static List vip(Object obj) {
        return obj != null ? Collections.singletonList(obj) : C2580l.f5619l;
    }

    public static final void yandex(String str, Function0 function0, C6956l c6956l, int i) {
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(667081938);
        int i2 = i | (c6956l2.billing(str) ? 4 : 2) | (c6956l2.admob(function0) ? 32 : 16);
        if (c6956l2.m2127for(i2 & 1, (i2 & 19) != 18)) {
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lLoadAd = AbstractC9151l.loadAd(AbstractC3605l.remoteconfig(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 8.0f), false, null, function0, 15);
            C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36040l, c6956l2, 48);
            long j = c6956l2.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lLoadAd);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l2, c5062lYandex, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i3);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l2, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
            InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(new C9247l(1.0f, true), 8.0f, 0.0f, 8.0f, 0.0f, 10);
            C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l2, 0);
            long j2 = c6956l2.f14595continue;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, interfaceC17242lStartapp);
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c1853lYandex, c6415l);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i4, c6956l2, c6415l3, c6956l2, c11192l);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l4);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC13010l.loadAd(str, AbstractC0080l.amazon(c4346l, 1.0f), ((C14370l) c6956l2.isPro(c10707l)).yandex.adcel, 0L, null, C6886l.f14420l, AbstractC1193l.loadAd, 0L, null, 0L, 2, false, 1, 0, null, c6956l, (i2 & 14) | 14155824, 24960, 241464);
            AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.in_cache), null, ((C14370l) c6956l.isPro(c10707l)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262138);
            c6956l2 = c6956l;
            c6956l2.startapp(true);
            AbstractC4597l.yandex(AbstractC15929l.crashlytics(), null, null, ((C14370l) c6956l2.isPro(c10707l)).yandex.adcel, c6956l2, 48, 4);
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3666l(str, function0, i, 17);
        }
    }
}
