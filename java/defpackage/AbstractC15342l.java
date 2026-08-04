package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؙٔۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15342l {
    public static final C15578l yandex = new C15578l(1300237279, false, new C6971l(23));
    public static final C15578l loadAd = new C15578l(-1587358171, false, new C6971l(24));
    public static final C15578l crashlytics = new C15578l(1982178266, false, new C5407l(0));

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object admob(long j, Function2 function2, AbstractC0283l abstractC0283l) {
        C4038l c4038l;
        C10700l c10700l;
        if (abstractC0283l instanceof C4038l) {
            c4038l = (C4038l) abstractC0283l;
            int i = c4038l.f8322l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c4038l.f8322l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c4038l = new C4038l(abstractC0283l);
            }
        } else {
            c4038l = new C4038l(abstractC0283l);
        }
        Object obj = c4038l.f8320l;
        int i2 = c4038l.f8322l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            if (j > 0) {
                C10700l c10700l2 = new C10700l();
                try {
                    c4038l.f8321l = c10700l2;
                    c4038l.f8322l = 1;
                    RunnableC2923l runnableC2923l = new RunnableC2923l(j, c4038l);
                    c10700l2.f21708l = runnableC2923l;
                    Object objPurchase = purchase(runnableC2923l, function2);
                    EnumC9342l enumC9342l = EnumC9342l.f19165l;
                    return objPurchase == enumC9342l ? enumC9342l : objPurchase;
                } catch (C14749l e) {
                    e = e;
                    c10700l = c10700l2;
                }
            }
            return null;
        }
        if (i2 != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        c10700l = c4038l.f8321l;
        try {
            AbstractC2829l.crashlytics(obj);
            return obj;
        } catch (C14749l e2) {
            e = e2;
        }
        if (e.f28820l != c10700l.f21708l) {
            throw e;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object amazon(Collection collection, InterfaceC14029l interfaceC14029l) {
        C0811l c0811l;
        Iterator it;
        int i;
        if (interfaceC14029l instanceof C0811l) {
            c0811l = (C0811l) interfaceC14029l;
            int i2 = c0811l.f2428l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0811l.f2428l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c0811l = new C0811l(interfaceC14029l);
            }
        } else {
            c0811l = new C0811l(interfaceC14029l);
        }
        Object obj = c0811l.f2431l;
        int i3 = c0811l.f2428l;
        if (i3 == 0) {
            AbstractC2829l.crashlytics(obj);
            it = collection.iterator();
            i = 0;
        } else {
            if (i3 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = c0811l.f2429l;
            it = c0811l.f2430l;
            AbstractC2829l.crashlytics(obj);
        }
        while (it.hasNext()) {
            InterfaceC7042l interfaceC7042l = (InterfaceC7042l) it.next();
            c0811l.f2430l = it;
            c0811l.f2429l = i;
            c0811l.f2428l = 1;
            Object objMo2158switch = interfaceC7042l.mo2158switch(c0811l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objMo2158switch == enumC9342l) {
                return enumC9342l;
            }
        }
        return Unit.INSTANCE;
    }

    public static final Object billing(long j, Function2 function2, InterfaceC14029l interfaceC14029l) {
        if (j > 0) {
            return purchase(new RunnableC2923l(j, interfaceC14029l), function2);
        }
        throw new C14749l("Timed out immediately", null);
    }

    public static final void loadAd(C10227l c10227l, InterfaceC16243l interfaceC16243l) {
        if (interfaceC16243l instanceof C9695l) {
            c10227l.add(((C9695l) interfaceC16243l).yandex);
            return;
        }
        if (interfaceC16243l instanceof C0659l) {
            Iterator it = ((C0659l) interfaceC16243l).yandex.iterator();
            while (it.hasNext()) {
                loadAd(c10227l, (InterfaceC18384l) it.next());
            }
            return;
        }
        if (interfaceC16243l instanceof C12782l) {
            return;
        }
        if (interfaceC16243l instanceof C9182l) {
            loadAd(c10227l, ((C9182l) interfaceC16243l).yandex);
            return;
        }
        if (!(interfaceC16243l instanceof C7914l)) {
            if (interfaceC16243l instanceof C6513l) {
                loadAd(c10227l, ((C6513l) interfaceC16243l).loadAd);
                return;
            } else {
                C18725l.billing();
                return;
            }
        }
        C7914l c7914l = (C7914l) interfaceC16243l;
        loadAd(c10227l, c7914l.yandex);
        Iterator it2 = c7914l.loadAd.iterator();
        while (it2.hasNext()) {
            loadAd(c10227l, (InterfaceC16243l) it2.next());
        }
    }

    public static final Object mopub(long j, Function2 function2, InterfaceC14029l interfaceC14029l) {
        return billing(AbstractC8532l.subs(j), function2, interfaceC14029l);
    }

    public static final Object purchase(RunnableC2923l runnableC2923l, Function2 function2) {
        AbstractC11174l.subs(runnableC2923l, true, new C13288l(0, AbstractC8532l.admob(runnableC2923l.f27949l.metrica()).yandex(runnableC2923l.f6364l, runnableC2923l, runnableC2923l.f26857l)));
        return AbstractC1163l.billing(runnableC2923l, false, runnableC2923l, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object yandex(Collection collection, AbstractC0283l abstractC0283l) {
        if (collection.isEmpty()) {
            return C2580l.f5619l;
        }
        InterfaceC1142l[] interfaceC1142lArr = (InterfaceC1142l[]) collection.toArray(new InterfaceC1142l[0]);
        C11649l c11649l = new C11649l(interfaceC1142lArr);
        C2397l c2397l = new C2397l(1, AbstractC17082l.billing(abstractC0283l));
        c2397l.license();
        int length = interfaceC1142lArr.length;
        C13145l[] c13145lArr = new C13145l[length];
        for (int i = 0; i < length; i++) {
            C0462l c0462l = interfaceC1142lArr[i];
            c0462l.start();
            C13145l c13145l = new C13145l(c11649l, c2397l);
            c13145l.f25710l = AbstractC11174l.subs(c0462l, true, c13145l);
            Unit unit = Unit.INSTANCE;
            c13145lArr[i] = c13145l;
        }
        C11635l c11635l = new C11635l(c13145lArr);
        for (int i2 = 0; i2 < length; i2++) {
            C13145l c13145l2 = c13145lArr[i2];
            c13145l2.getClass();
            C13145l.f25707l.set(c13145l2, c11635l);
        }
        if (c2397l.premium()) {
            c11635l.loadAd();
        } else {
            c2397l.advert(c11635l);
        }
        return c2397l.Signature();
    }

    public abstract C8896l crashlytics();
}
