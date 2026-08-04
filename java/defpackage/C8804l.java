package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: lٌٕۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8804l implements InterfaceC18129l {
    public static AbstractC7532l crashlytics(C11310l c11310l) {
        InterfaceC1388l interfaceC1388l = c11310l.yandex;
        if (!AbstractC11904l.class.isAssignableFrom(((InterfaceC13937l) interfaceC1388l).mo1730private())) {
            throw new IllegalArgumentException((c11310l + " is not assignable from Message").toString());
        }
        for (Field field : ((InterfaceC13937l) interfaceC1388l).mo1730private().getDeclaredFields()) {
            if (AbstractC7532l.class.isAssignableFrom(field.getType())) {
                return (AbstractC7532l) ((InterfaceC13937l) interfaceC1388l).mo1730private().getDeclaredField(field.getName()).get(null);
            }
        }
        C1759l.firebase("Array contains no element matching the predicate.");
        return null;
    }

    @Override // defpackage.InterfaceC18129l
    public final Object loadAd(C5254l c5254l, Charset charset, C11310l c11310l, Object obj, AbstractC0283l abstractC0283l) {
        if (obj == null) {
            C8339l.metrica("value can't be null");
            return null;
        }
        AbstractC7532l abstractC7532lCrashlytics = crashlytics(c11310l);
        C0869l c0869l = new C0869l();
        abstractC7532lCrashlytics.amazon(c0869l, obj);
        return new C15135l(c0869l.m725package(c0869l.f2526l), AbstractC14192l.amazon, 4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC18129l
    public final Object yandex(Charset charset, C11310l c11310l, InterfaceC9354l interfaceC9354l, AbstractC0283l abstractC0283l) throws Throwable {
        C14409l c14409l;
        AbstractC7532l abstractC7532l;
        if (abstractC0283l instanceof C14409l) {
            c14409l = (C14409l) abstractC0283l;
            int i = c14409l.f28218l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c14409l.f28218l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c14409l = new C14409l(this, abstractC0283l);
            }
        } else {
            c14409l = new C14409l(this, abstractC0283l);
        }
        Object obj = c14409l.f28219l;
        int i2 = c14409l.f28218l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            AbstractC7532l abstractC7532lCrashlytics = crashlytics(c11310l);
            c14409l.f28220l = abstractC7532lCrashlytics;
            c14409l.f28218l = 1;
            Object objPremium = AbstractC10310l.premium(interfaceC9354l, c14409l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objPremium == enumC9342l) {
                return enumC9342l;
            }
            abstractC7532l = abstractC7532lCrashlytics;
            obj = objPremium;
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            abstractC7532l = c14409l.f28220l;
            AbstractC2829l.crashlytics(obj);
        }
        C1503l c1503l = new C1503l(new C15900l((InterfaceC16090l) obj));
        abstractC7532l.getClass();
        return abstractC7532l.crashlytics(new C7084l(c1503l));
    }
}
