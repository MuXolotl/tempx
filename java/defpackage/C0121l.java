package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lُؑؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0121l {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object amazon(boolean z, C14025l c14025l, AbstractC0283l abstractC0283l) throws Throwable {
        C4129l c4129l;
        if (abstractC0283l instanceof C4129l) {
            c4129l = (C4129l) abstractC0283l;
            int i = c4129l.f8490l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c4129l.f8490l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c4129l = new C4129l(abstractC0283l);
            }
        } else {
            c4129l = new C4129l(abstractC0283l);
        }
        Object obj = c4129l.f8491l;
        int i2 = c4129l.f8490l;
        InterfaceC14029l interfaceC14029l = null;
        boolean z2 = true;
        z2 = true;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            if (z) {
                C16552l c16552l = AbstractC11463l.yandex;
                ExecutorC6708l executorC6708l = ExecutorC6708l.f14063l;
                C18492l c18492l = new C18492l(c14025l, interfaceC14029l, z2 ? 1 : 0);
                c4129l.f8490l = 1;
                Object objFirebase = AbstractC10999l.firebase(executorC6708l, c18492l, c4129l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objFirebase == enumC9342l) {
                    return enumC9342l;
                }
            } else {
                z2 = false;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
        }
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object crashlytics(String str, AbstractC0283l abstractC0283l) throws Throwable {
        C5691l c5691l;
        if (abstractC0283l instanceof C5691l) {
            c5691l = (C5691l) abstractC0283l;
            int i = c5691l.f12078l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c5691l.f12078l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c5691l = new C5691l(abstractC0283l);
            }
        } else {
            c5691l = new C5691l(abstractC0283l);
        }
        Object objFirebase = c5691l.f12079l;
        int i2 = c5691l.f12078l;
        InterfaceC14029l interfaceC14029l = null;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objFirebase);
            C16552l c16552l = AbstractC11463l.yandex;
            ExecutorC6708l executorC6708l = ExecutorC6708l.f14063l;
            C9181l c9181l = new C9181l(str, interfaceC14029l, 0);
            c5691l.f12078l = 1;
            objFirebase = AbstractC10999l.firebase(executorC6708l, c9181l, c5691l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objFirebase == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objFirebase);
        }
        return objFirebase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object loadAd(C14025l c14025l, C4273l c4273l, Function1 function1, AbstractC0283l abstractC0283l) throws Throwable {
        C10341l c10341l;
        String str;
        if (abstractC0283l instanceof C10341l) {
            c10341l = (C10341l) abstractC0283l;
            int i = c10341l.f21063l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c10341l.f21063l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c10341l = new C10341l(abstractC0283l);
            }
        } else {
            c10341l = new C10341l(abstractC0283l);
        }
        Object obj = c10341l.f21066l;
        int i2 = c10341l.f21063l;
        InterfaceC14029l interfaceC14029l = null;
        int i3 = 1;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            StringBuilder sb = new StringBuilder();
            ArrayList arrayListM4238static = AbstractC16901l.m4238static(new C13053l('a', 'z'), new C13053l('0', '9'));
            C8934l c8934l = new C8934l(1, 8, 1);
            ArrayList arrayList = new ArrayList(AbstractC14055l.billing(c8934l, 10));
            Iterator it = c8934l.iterator();
            while (true) {
                C16991l c16991l = (C16991l) it;
                if (!c16991l.f33123l) {
                    break;
                }
                c16991l.nextInt();
                AbstractC8502l abstractC8502l = AbstractC4777l.f9804l;
                Character ch = (Character) AbstractC16901l.m4221goto(arrayListM4238static);
                ch.getClass();
                arrayList.add(ch);
            }
            String strAds = AbstractC0653l.ads(sb, AbstractC16901l.m4210case(arrayList, "", null, null, null, 62), ".pub");
            C6705l c6705l = (C6705l) function1.invoke(c4273l.loadAd);
            C14025l c14025lPurchase = c14025l.purchase(strAds);
            c10341l.f21065l = c4273l;
            c10341l.f21064l = strAds;
            c10341l.f21063l = 1;
            C16552l c16552l = AbstractC11463l.yandex;
            Object objFirebase = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C8568l(c14025lPurchase, c6705l, interfaceC14029l, i3), c10341l);
            Object obj2 = EnumC9342l.f19165l;
            if (objFirebase != obj2) {
                objFirebase = Unit.INSTANCE;
            }
            if (objFirebase == obj2) {
                return obj2;
            }
            str = strAds;
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str2 = c10341l.f21064l;
            c4273l = c10341l.f21065l;
            AbstractC2829l.crashlytics(obj);
            str = str2;
        }
        return new C4273l(c4273l.yandex, str, c4273l.crashlytics, c4273l.amazon, c4273l.purchase);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object yandex(int i, C14025l c14025l, C0657l c0657l, Function1 function1, Function1 function2, Function0 function0, AbstractC0283l abstractC0283l) throws Throwable {
        C3255l c3255l;
        Function1 function3;
        Function0 function4;
        String str;
        C4273l c4273l;
        C0657l c0657l2 = c0657l;
        if (abstractC0283l instanceof C3255l) {
            c3255l = (C3255l) abstractC0283l;
            int i2 = c3255l.f6954l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c3255l.f6954l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c3255l = new C3255l(abstractC0283l);
            }
        } else {
            c3255l = new C3255l(abstractC0283l);
        }
        Object obj = c3255l.f6951l;
        int i3 = c3255l.f6954l;
        InterfaceC14029l interfaceC14029l = null;
        int i4 = 1;
        if (i3 == 0) {
            AbstractC2829l.crashlytics(obj);
            String str2 = "seg" + i + ".ts";
            C6705l c6705l = (C6705l) function1.invoke(c0657l2.yandex);
            C14025l c14025lPurchase = c14025l.purchase(str2);
            c3255l.f6953l = c0657l2;
            c3255l.f6952l = function2;
            c3255l.f6955l = function0;
            c3255l.f6950l = str2;
            c3255l.f6954l = 1;
            C16552l c16552l = AbstractC11463l.yandex;
            Object objFirebase = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C8568l(c14025lPurchase, c6705l, interfaceC14029l, i4), c3255l);
            Object obj2 = EnumC9342l.f19165l;
            if (objFirebase != obj2) {
                objFirebase = Unit.INSTANCE;
            }
            if (objFirebase == obj2) {
                return obj2;
            }
            function3 = function2;
            function4 = function0;
            str = str2;
        } else {
            if (i3 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str3 = c3255l.f6950l;
            function4 = c3255l.f6955l;
            function3 = c3255l.f6952l;
            C0657l c0657l3 = c3255l.f6953l;
            AbstractC2829l.crashlytics(obj);
            str = str3;
            c0657l2 = c0657l3;
        }
        String str4 = c0657l2.yandex;
        C4273l c4273l2 = c0657l2.crashlytics;
        C11520l c11520l = c0657l2.loadAd;
        boolean z = c0657l2.purchase;
        C1790l c1790l = c0657l2.billing;
        C8379l c8379l = c0657l2.mopub;
        if (c0657l2.yandex()) {
            c4273l = (C4273l) function3.invoke(c4273l2.loadAd);
        } else {
            c4273l = new C4273l(EnumC17267l.NONE, "", null, "identity", Collections.singletonList(new Integer(1)));
        }
        C0657l c0657l4 = new C0657l(str, c11520l, c4273l, null, z, c1790l, c8379l);
        function4.invoke();
        return c0657l4;
    }
}
