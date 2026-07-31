package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٌؑٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8486l {
    public static final C11911l crashlytics;
    public static final InterfaceC6272l yandex = AbstractC1937l.loadAd("io.ktor.client.plugins.HttpCallValidator");
    public static final C18449l loadAd = new C18449l("HttpResponseValidator", C0552l.f1953l, new C17049l(13));

    static {
        InterfaceC13012l interfaceC13012lYandex;
        InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(Boolean.class);
        try {
            interfaceC13012lYandex = AbstractC18202l.yandex(Boolean.TYPE);
        } catch (Throwable unused) {
            interfaceC13012lYandex = null;
        }
        crashlytics = new C11911l("ExpectSuccessAttributeKey", new C11310l(interfaceC1388lLoadAd, interfaceC13012lYandex));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object loadAd(List list, AbstractC10022l abstractC10022l, AbstractC0283l abstractC0283l) {
        C4525l c4525l;
        Iterator it;
        int i;
        AbstractC10022l abstractC10022l2;
        if (abstractC0283l instanceof C4525l) {
            c4525l = (C4525l) abstractC0283l;
            int i2 = c4525l.f9164l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c4525l.f9164l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c4525l = new C4525l(abstractC0283l);
            }
        } else {
            c4525l = new C4525l(abstractC0283l);
        }
        Object obj = c4525l.f9163l;
        int i3 = c4525l.f9164l;
        if (i3 == 0) {
            AbstractC2829l.crashlytics(obj);
            StringBuilder sb = new StringBuilder("Validating response for request ");
            InterfaceC1814l interfaceC1814l = abstractC10022l.loadAd().f27846l;
            sb.append((interfaceC1814l != null ? interfaceC1814l : null).getUrl());
            yandex.vip(sb.toString());
            it = list.iterator();
            i = 0;
            abstractC10022l2 = abstractC10022l;
        } else {
            if (i3 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = c4525l.f9167l;
            it = c4525l.f9165l;
            AbstractC10022l abstractC10022l3 = c4525l.f9166l;
            AbstractC2829l.crashlytics(obj);
            abstractC10022l2 = abstractC10022l3;
        }
        while (it.hasNext()) {
            Function2 function2 = (Function2) it.next();
            c4525l.f9166l = abstractC10022l2;
            c4525l.f9165l = it;
            c4525l.f9167l = i;
            c4525l.f9164l = 1;
            Object objInvoke = function2.invoke(abstractC10022l2, c4525l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objInvoke == enumC9342l) {
                return enumC9342l;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Unit yandex(List list, Throwable th, InterfaceC1814l interfaceC1814l, AbstractC0283l abstractC0283l) {
        C4996l c4996l;
        Iterator it;
        if (abstractC0283l instanceof C4996l) {
            c4996l = (C4996l) abstractC0283l;
            int i = c4996l.f10227l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c4996l.f10227l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c4996l = new C4996l(abstractC0283l);
            }
        } else {
            c4996l = new C4996l(abstractC0283l);
        }
        Object obj = c4996l.f10228l;
        int i2 = c4996l.f10227l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            yandex.vip("Processing exception " + th + " for request " + interfaceC1814l.getUrl());
            it = list.iterator();
        } else {
            if (i2 != 1 && i2 != 2) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
            it = null;
        }
        if (!it.hasNext()) {
            return Unit.INSTANCE;
        }
        if (it.next() == null) {
            C18725l.billing();
            return null;
        }
        C18725l.loadAd();
        return null;
    }
}
