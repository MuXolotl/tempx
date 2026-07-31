package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;

/* JADX INFO: renamed from: lُؗؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4626l {
    public static final C4626l yandex = new C4626l();
    public static final C1008l loadAd = AbstractC11190l.yandex(Boolean.FALSE);
    public static final C1008l crashlytics = AbstractC11190l.yandex(new C17467l(null, null, 0, 0, false));
    public static final InterfaceC9198l[] amazon = {new C13470l(0), new C7185l(), new C13470l(1), new C1476l()};

    public static boolean yandex() {
        if (((Boolean) loadAd.getValue()).booleanValue()) {
            return true;
        }
        C6782l c6782l = C6782l.yandex;
        c6782l.getClass();
        C8634l c8634l = C6782l.purchase;
        InterfaceC13922l interfaceC13922l = C6782l.loadAd[5];
        return !((Boolean) c8634l.pro(c6782l)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object amazon(long j, AbstractC0283l abstractC0283l) {
        C2323l c2323l;
        Object value;
        C17467l c17467lYandex;
        int i;
        C17467l c17467l;
        Iterator it;
        if (abstractC0283l instanceof C2323l) {
            c2323l = (C2323l) abstractC0283l;
            int i2 = c2323l.f5034l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c2323l.f5034l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c2323l = new C2323l(this, abstractC0283l);
            }
        } else {
            c2323l = new C2323l(this, abstractC0283l);
        }
        Object obj = c2323l.f5033l;
        int i3 = c2323l.f5034l;
        if (i3 == 0) {
            AbstractC2829l.crashlytics(obj);
            if (!yandex()) {
                C1008l c1008l = crashlytics;
                if (!((C17467l) c1008l.getValue()).purchase) {
                    do {
                        value = c1008l.getValue();
                        c17467lYandex = C17467l.yandex((C17467l) value, null, null, 0L, j / 1000, true, 7);
                    } while (!c1008l.firebase(value, c17467lYandex));
                    ArrayList arrayList = new ArrayList();
                    i = 0;
                    for (InterfaceC9198l interfaceC9198l : amazon) {
                        if (interfaceC9198l.loadAd(c17467lYandex)) {
                            arrayList.add(interfaceC9198l);
                        }
                    }
                    c17467l = c17467lYandex;
                    it = arrayList.iterator();
                }
            }
            return Unit.INSTANCE;
        }
        if (i3 != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i4 = c2323l.f5032l;
        long j2 = c2323l.f5036l;
        it = c2323l.f5038l;
        c17467l = c2323l.f5035l;
        AbstractC2829l.crashlytics(obj);
        i = i4;
        j = j2;
        while (it.hasNext()) {
            InterfaceC9198l interfaceC9198l2 = (InterfaceC9198l) it.next();
            c2323l.f5035l = c17467l;
            c2323l.f5038l = it;
            c2323l.f5036l = j;
            c2323l.f5032l = i;
            c2323l.f5034l = 1;
            Object objBilling = interfaceC9198l2.billing(c17467l, c2323l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objBilling == enumC9342l) {
                return enumC9342l;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object billing(C10507l c10507l, long j, EnumC8098l enumC8098l, AbstractC0283l abstractC0283l) {
        C15978l c15978l;
        C17467l c17467l;
        int i;
        C17467l c17467l2;
        Iterator it;
        long j2;
        EnumC8098l enumC8098l2;
        if (abstractC0283l instanceof C15978l) {
            c15978l = (C15978l) abstractC0283l;
            int i2 = c15978l.f31364l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c15978l.f31364l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c15978l = new C15978l(this, abstractC0283l);
            }
        } else {
            c15978l = new C15978l(this, abstractC0283l);
        }
        Object obj = c15978l.f31362l;
        int i3 = c15978l.f31364l;
        C1008l c1008l = crashlytics;
        if (i3 == 0) {
            AbstractC2829l.crashlytics(obj);
            if (!yandex()) {
                C10507l c10507l2 = c10507l;
                if (!AbstractC8576l.yandex(((C17467l) c1008l.getValue()).yandex, c10507l2)) {
                    while (true) {
                        Object value = c1008l.getValue();
                        c17467l = (C17467l) value;
                        if (c1008l.firebase(value, C17467l.yandex(c17467l, c10507l2, null, AbstractC7866l.yandex.purchase().f4736l, 0L, true, 2))) {
                            break;
                        }
                        c10507l2 = c10507l;
                    }
                    C17467l c17467lYandex = C17467l.yandex(c17467l, null, null, 0L, j / 1000, false, 23);
                    ArrayList arrayList = new ArrayList();
                    i = 0;
                    for (InterfaceC9198l interfaceC9198l : amazon) {
                        if (interfaceC9198l.loadAd(c17467lYandex) || interfaceC9198l.loadAd((C17467l) c1008l.getValue())) {
                            arrayList.add(interfaceC9198l);
                        }
                    }
                    c17467l2 = c17467lYandex;
                    it = arrayList.iterator();
                    j2 = j;
                    enumC8098l2 = enumC8098l;
                }
            }
            return Unit.INSTANCE;
        }
        if (i3 != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i4 = c15978l.f31358l;
        long j3 = c15978l.f31357l;
        Iterator it2 = c15978l.f31363l;
        c17467l2 = c15978l.f31360l;
        EnumC8098l enumC8098l3 = c15978l.f31361l;
        AbstractC2829l.crashlytics(obj);
        j2 = j3;
        it = it2;
        i = i4;
        enumC8098l2 = enumC8098l3;
        while (it.hasNext()) {
            InterfaceC9198l interfaceC9198l2 = (InterfaceC9198l) it.next();
            C17467l c17467l3 = (C17467l) c1008l.getValue();
            c15978l.f31361l = enumC8098l2;
            c15978l.f31360l = c17467l2;
            c15978l.f31363l = it;
            c15978l.f31357l = j2;
            c15978l.f31358l = i;
            c15978l.f31364l = 1;
            Object objCrashlytics = interfaceC9198l2.crashlytics(c17467l2, c17467l3, enumC8098l2, c15978l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objCrashlytics == enumC9342l) {
                return enumC9342l;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object crashlytics(long j, EnumC8376l enumC8376l, AbstractC0283l abstractC0283l) {
        C13446l c13446l;
        Object value;
        C17467l c17467l;
        int i;
        EnumC8376l enumC8376l2;
        Iterator it;
        C17467l c17467l2;
        long j2;
        if (abstractC0283l instanceof C13446l) {
            c13446l = (C13446l) abstractC0283l;
            int i2 = c13446l.f26393l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c13446l.f26393l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c13446l = new C13446l(this, abstractC0283l);
            }
        } else {
            c13446l = new C13446l(this, abstractC0283l);
        }
        Object obj = c13446l.f26391l;
        int i3 = c13446l.f26393l;
        C1008l c1008l = crashlytics;
        if (i3 == 0) {
            AbstractC2829l.crashlytics(obj);
            if (yandex()) {
                return Unit.INSTANCE;
            }
            do {
                value = c1008l.getValue();
                c17467l = (C17467l) value;
            } while (!c1008l.firebase(value, C17467l.yandex(c17467l, null, null, 0L, j / 1000, false, 23)));
            ArrayList arrayList = new ArrayList();
            i = 0;
            for (InterfaceC9198l interfaceC9198l : amazon) {
                if (interfaceC9198l.loadAd((C17467l) c1008l.getValue())) {
                    arrayList.add(interfaceC9198l);
                }
            }
            enumC8376l2 = enumC8376l;
            it = arrayList.iterator();
            c17467l2 = c17467l;
            j2 = j;
        } else {
            if (i3 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i4 = c13446l.f26387l;
            long j3 = c13446l.f26390l;
            Iterator it2 = c13446l.f26386l;
            c17467l2 = c13446l.f26392l;
            EnumC8376l enumC8376l3 = c13446l.f26389l;
            AbstractC2829l.crashlytics(obj);
            j2 = j3;
            it = it2;
            i = i4;
            enumC8376l2 = enumC8376l3;
        }
        while (it.hasNext()) {
            InterfaceC9198l interfaceC9198l2 = (InterfaceC9198l) it.next();
            C17467l c17467l3 = (C17467l) c1008l.getValue();
            c13446l.f26389l = enumC8376l2;
            c13446l.f26392l = c17467l2;
            c13446l.f26386l = it;
            c13446l.f26390l = j2;
            c13446l.f26387l = i;
            c13446l.f26393l = 1;
            Object objPurchase = interfaceC9198l2.purchase(c17467l2, c17467l3, enumC8376l2, c13446l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objPurchase == enumC9342l) {
                return enumC9342l;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object loadAd(long j, AbstractC0283l abstractC0283l) {
        C4953l c4953l;
        Object value;
        C17467l c17467lYandex;
        int i;
        C17467l c17467l;
        Iterator it;
        if (abstractC0283l instanceof C4953l) {
            c4953l = (C4953l) abstractC0283l;
            int i2 = c4953l.f10099l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c4953l.f10099l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c4953l = new C4953l(this, abstractC0283l);
            }
        } else {
            c4953l = new C4953l(this, abstractC0283l);
        }
        Object obj = c4953l.f10098l;
        int i3 = c4953l.f10099l;
        if (i3 == 0) {
            AbstractC2829l.crashlytics(obj);
            if (!yandex()) {
                C1008l c1008l = crashlytics;
                if (((C17467l) c1008l.getValue()).purchase) {
                    do {
                        value = c1008l.getValue();
                        c17467lYandex = C17467l.yandex((C17467l) value, null, null, 0L, j / 1000, false, 7);
                    } while (!c1008l.firebase(value, c17467lYandex));
                    ArrayList arrayList = new ArrayList();
                    i = 0;
                    for (InterfaceC9198l interfaceC9198l : amazon) {
                        if (interfaceC9198l.loadAd(c17467lYandex)) {
                            arrayList.add(interfaceC9198l);
                        }
                    }
                    c17467l = c17467lYandex;
                    it = arrayList.iterator();
                }
            }
            return Unit.INSTANCE;
        }
        if (i3 != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i4 = c4953l.f10097l;
        long j2 = c4953l.f10101l;
        it = c4953l.f10103l;
        c17467l = c4953l.f10100l;
        AbstractC2829l.crashlytics(obj);
        i = i4;
        j = j2;
        while (it.hasNext()) {
            InterfaceC9198l interfaceC9198l2 = (InterfaceC9198l) it.next();
            c4953l.f10100l = c17467l;
            c4953l.f10103l = it;
            c4953l.f10101l = j;
            c4953l.f10097l = i;
            c4953l.f10099l = 1;
            Object objAmazon = interfaceC9198l2.amazon(c17467l, c4953l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objAmazon == enumC9342l) {
                return enumC9342l;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object purchase(InterfaceC17817l interfaceC17817l, AbstractC0283l abstractC0283l) {
        C15682l c15682l;
        C17467l c17467l;
        Iterator it;
        int i;
        if (abstractC0283l instanceof C15682l) {
            c15682l = (C15682l) abstractC0283l;
            int i2 = c15682l.f30824l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c15682l.f30824l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c15682l = new C15682l(this, abstractC0283l);
            }
        } else {
            c15682l = new C15682l(this, abstractC0283l);
        }
        Object obj = c15682l.f30820l;
        int i3 = c15682l.f30824l;
        C1008l c1008l = crashlytics;
        if (i3 == 0) {
            AbstractC2829l.crashlytics(obj);
            if (yandex()) {
                return Unit.INSTANCE;
            }
            while (true) {
                Object value = c1008l.getValue();
                c17467l = (C17467l) value;
                InterfaceC17817l interfaceC17817l2 = interfaceC17817l;
                if (c1008l.firebase(value, C17467l.yandex(c17467l, null, interfaceC17817l2, 0L, 0L, false, 29))) {
                    break;
                }
                interfaceC17817l = interfaceC17817l2;
            }
            ArrayList arrayList = new ArrayList();
            for (InterfaceC9198l interfaceC9198l : amazon) {
                if (interfaceC9198l.loadAd(c17467l) || interfaceC9198l.loadAd((C17467l) c1008l.getValue())) {
                    arrayList.add(interfaceC9198l);
                }
            }
            it = arrayList.iterator();
            i = 0;
        } else {
            if (i3 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = c15682l.f30825l;
            it = c15682l.f30822l;
            c17467l = c15682l.f30823l;
            AbstractC2829l.crashlytics(obj);
        }
        while (it.hasNext()) {
            InterfaceC9198l interfaceC9198l2 = (InterfaceC9198l) it.next();
            C17467l c17467l2 = (C17467l) c1008l.getValue();
            c15682l.f30823l = c17467l;
            c15682l.f30822l = it;
            c15682l.f30825l = i;
            c15682l.f30824l = 1;
            Object objYandex = interfaceC9198l2.yandex(c17467l2, c15682l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objYandex == enumC9342l) {
                return enumC9342l;
            }
        }
        return Unit.INSTANCE;
    }
}
