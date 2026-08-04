package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٕؔؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C2336l {
    public InterfaceC13012l amazon(InterfaceC13012l interfaceC13012l) {
        C4795l c4795l = (C4795l) interfaceC13012l;
        InterfaceC1122l interfaceC1122lMo1616package = interfaceC13012l.mo1616package();
        List listMo1617throws = interfaceC13012l.mo1617throws();
        c4795l.getClass();
        return new C4795l(interfaceC1122lMo1616package, listMo1617throws, c4795l.f9837l | 2);
    }

    public InterfaceC9191l crashlytics(Class cls) {
        return new C17074l(cls);
    }

    public String firebase(AbstractC16915l abstractC16915l) {
        return isPro(abstractC16915l);
    }

    public String isPro(InterfaceC18660l interfaceC18660l) {
        String string = interfaceC18660l.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public InterfaceC1388l loadAd(Class cls) {
        return new C7675l(cls);
    }

    public InterfaceC13012l remoteconfig(InterfaceC1122l interfaceC1122l, List list, boolean z) {
        return new C4795l(interfaceC1122l, list, z ? 1 : 0);
    }

    public void smaato(AbstractC11726l abstractC11726l, List list) {
        C8612l c8612l = (C8612l) abstractC11726l;
        if (c8612l.f17763l == null) {
            c8612l.f17763l = list;
        } else {
            C11983l.isPro(c8612l, "' have already been initialized.", "Upper bounds of type parameter '");
        }
    }

    public AbstractC11726l vip(InterfaceC1388l interfaceC1388l) {
        return new C8612l(interfaceC1388l);
    }

    public InterfaceC1835l admob(C0544l c0544l) {
        return c0544l;
    }

    public InterfaceC2463l billing(C0114l c0114l) {
        return c0114l;
    }

    public InterfaceC2901l mopub(C0059l c0059l) {
        return c0059l;
    }

    public InterfaceC5465l purchase(C18200l c18200l) {
        return c18200l;
    }

    public InterfaceC7547l subs(C7953l c7953l) {
        return c7953l;
    }

    public InterfaceC5059l yandex(C1538l c1538l) {
        return c1538l;
    }
}
