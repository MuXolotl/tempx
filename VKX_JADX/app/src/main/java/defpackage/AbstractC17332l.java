package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٗۗؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17332l {
    public static final C8896l amazon(C8896l c8896l, InterfaceC18212l interfaceC18212l, InterfaceC18212l interfaceC18212l2) {
        if (!interfaceC18212l.mopub() || !interfaceC18212l2.mopub()) {
            return C8896l.purchase;
        }
        return AbstractC7470l.isPro(interfaceC18212l2.mo2590package(AbstractC9690l.crashlytics(interfaceC18212l).startapp(c8896l.admob())), c8896l.mopub());
    }

    public static final InterfaceC17242l crashlytics(InterfaceC17242l interfaceC17242l, C10715l c10715l, Function1 function1, C5806l c5806l, Function1 function2) {
        return interfaceC17242l.premium(new C9121l(c10715l, function1, c5806l, function2));
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009f  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d0 A[RETURN] */
    public static final InterfaceC16588l loadAd(C13975l c13975l, InterfaceC13012l interfaceC13012l, boolean z) {
        InterfaceC16588l interfaceC16588lPurchase;
        InterfaceC16588l interfaceC16588lAmazon;
        C18225l c18225l;
        InterfaceC1388l interfaceC1388lBilling = AbstractC16164l.billing(interfaceC13012l);
        boolean zSignature = interfaceC13012l.Signature();
        List listMo1617throws = interfaceC13012l.mo1617throws();
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(listMo1617throws, 10));
        Iterator it = listMo1617throws.iterator();
        while (it.hasNext()) {
            InterfaceC13012l interfaceC13012l2 = ((C0861l) it.next()).loadAd;
            if (interfaceC13012l2 == null) {
                C8936l.smaato(interfaceC13012l2, "Star projections in type arguments are not allowed, but had ");
                return null;
            }
            arrayList.add(interfaceC13012l2);
        }
        if (arrayList.isEmpty()) {
            if (((InterfaceC13937l) interfaceC1388lBilling).mo1730private().isInterface()) {
                c13975l.getClass();
            }
            if (zSignature) {
                interfaceC16588lPurchase = AbstractC10944l.loadAd.purchase(interfaceC1388lBilling);
            } else {
                interfaceC16588lPurchase = AbstractC10944l.yandex.purchase(interfaceC1388lBilling);
                if (interfaceC16588lPurchase == null) {
                    interfaceC16588lPurchase = null;
                }
            }
        } else {
            c13975l.getClass();
            Object objYandex = !zSignature ? AbstractC10944l.crashlytics.yandex(interfaceC1388lBilling, arrayList) : AbstractC10944l.amazon.yandex(interfaceC1388lBilling, arrayList);
            if (objYandex instanceof C18435l) {
                objYandex = null;
            }
            interfaceC16588lPurchase = (InterfaceC16588l) objYandex;
        }
        if (interfaceC16588lPurchase != null) {
            return interfaceC16588lPurchase;
        }
        if (arrayList.isEmpty()) {
            interfaceC16588lAmazon = AbstractC7280l.billing(interfaceC1388lBilling);
            if (interfaceC16588lAmazon == null) {
                c13975l.getClass();
                if (((InterfaceC13937l) interfaceC1388lBilling).mo1730private().isInterface()) {
                    c18225l = new C18225l(interfaceC1388lBilling);
                    interfaceC16588lAmazon = c18225l;
                } else {
                    interfaceC16588lAmazon = null;
                }
            }
            if (interfaceC16588lAmazon != null) {
                if (zSignature) {
                    return AbstractC7303l.crashlytics(interfaceC16588lAmazon);
                }
                return interfaceC16588lAmazon;
            }
        } else {
            ArrayList arrayListMopub = AbstractC7280l.mopub(c13975l, arrayList, z);
            if (arrayListMopub != null) {
                interfaceC16588lAmazon = AbstractC7280l.amazon(interfaceC1388lBilling, arrayListMopub, new C3318l(0, arrayList));
                if (interfaceC16588lAmazon == null) {
                    if (((InterfaceC13937l) interfaceC1388lBilling).mo1730private().isInterface()) {
                        c18225l = new C18225l(interfaceC1388lBilling);
                        interfaceC16588lAmazon = c18225l;
                    } else {
                        interfaceC16588lAmazon = null;
                    }
                }
                if (interfaceC16588lAmazon != null) {
                    if (zSignature) {
                        return AbstractC7303l.crashlytics(interfaceC16588lAmazon);
                    }
                    return interfaceC16588lAmazon;
                }
            }
        }
        return null;
    }

    public static Object purchase(Class cls, String str, C17516l... c17516lArr) {
        int length = c17516lArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i = 0; i < c17516lArr.length; i++) {
            C17516l c17516l = c17516lArr[i];
            c17516l.getClass();
            clsArr[i] = (Class) c17516l.f34134l;
            objArr[i] = c17516lArr[i].f34133l;
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0095  */
    /* JADX WARN: Code duplicated, block: B:39:0x0098  */
    /* JADX WARN: Code duplicated, block: B:43:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0065->B:45:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0086 -> B:25:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0089 -> B:25:0x0065). Please report as a decompilation issue!!! */
    public static final Object yandex(ArrayList arrayList, C14875l c14875l, AbstractC0283l abstractC0283l) throws Throwable {
        C7818l c7818l;
        ArrayList arrayList2;
        C10700l c10700l;
        Iterator it;
        int i;
        Throwable th;
        Function1 function1;
        if (abstractC0283l instanceof C7818l) {
            c7818l = (C7818l) abstractC0283l;
            int i2 = c7818l.f16343l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c7818l.f16343l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c7818l = new C7818l(abstractC0283l);
            }
        } else {
            c7818l = new C7818l(abstractC0283l);
        }
        Object obj = c7818l.f16340l;
        int i3 = c7818l.f16343l;
        Object obj2 = EnumC9342l.f19165l;
        if (i3 != 0) {
            if (i3 == 1) {
                arrayList2 = c7818l.f16342l;
                AbstractC2829l.crashlytics(obj);
            } else {
                if (i3 != 2) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = c7818l.f16339l;
                it = c7818l.f16344l;
                c10700l = c7818l.f16341l;
                try {
                    AbstractC2829l.crashlytics(obj);
                } catch (Throwable th2) {
                    Object obj3 = c10700l.f21708l;
                    if (obj3 == null) {
                        c10700l.f21708l = th2;
                    } else {
                        AbstractC11718l.yandex((Throwable) obj3, th2);
                    }
                }
            }
            while (it.hasNext()) {
                function1 = (Function1) it.next();
                c7818l.f16342l = null;
                c7818l.f16341l = c10700l;
                c7818l.f16344l = it;
                c7818l.f16339l = i;
                c7818l.f16343l = 2;
                if (function1.invoke(c7818l) == obj2) {
                    return obj2;
                }
            }
            th = (Throwable) c10700l.f21708l;
            if (th == null) {
                return Unit.INSTANCE;
            }
            throw th;
        }
        AbstractC2829l.crashlytics(obj);
        ArrayList arrayList3 = new ArrayList();
        C11797l c11797l = new C11797l(arrayList, arrayList3, null);
        c7818l.f16342l = arrayList3;
        c7818l.f16343l = 1;
        if (c14875l.yandex(c11797l, c7818l) == obj2) {
            return obj2;
        }
        arrayList2 = arrayList3;
        c10700l = new C10700l();
        it = arrayList2.iterator();
        i = 0;
        while (it.hasNext()) {
            function1 = (Function1) it.next();
            c7818l.f16342l = null;
            c7818l.f16341l = c10700l;
            c7818l.f16344l = it;
            c7818l.f16339l = i;
            c7818l.f16343l = 2;
            if (function1.invoke(c7818l) == obj2) {
                return obj2;
            }
        }
        th = (Throwable) c10700l.f21708l;
        if (th == null) {
            return Unit.INSTANCE;
        }
        throw th;
    }
}
