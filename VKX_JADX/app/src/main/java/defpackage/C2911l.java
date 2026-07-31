package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؔۛ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2911l implements Function1 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6336l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C2911l f6335l = new C2911l(0);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C2911l f6334l = new C2911l(1);

    public /* synthetic */ C2911l(int i) {
        this.f6336l = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z = false;
        switch (this.f6336l) {
            case 0:
                return Collections.singletonList(C8505l.INSTANCE);
            case 1:
                List list = (List) obj;
                List list2 = list.size() > 1 ? list : null;
                return list2 != null ? AbstractC16901l.m4242synchronized(1, list2) : list;
            case 2:
                ((C14945l) obj).getClass();
                return null;
            case 3:
                EnumC6358l.f13324l.get(((Number) obj).intValue());
                return null;
            case 4:
                return InterfaceC5706l.f12087l;
            case 5:
                EnumC3503l.f7400l.get(((Number) obj).intValue());
                return null;
            case 6:
                InterfaceC0207l interfaceC0207l = (InterfaceC0207l) obj;
                if (interfaceC0207l.mo367while() == 1) {
                    InterfaceC17477l interfaceC17477l = (InterfaceC17477l) interfaceC0207l.Signature();
                    String str = C4632l.yandex;
                    if (C4632l.isPro.containsKey(AbstractC11125l.billing(interfaceC17477l))) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 7:
                return ((C16165l) obj).loadAd.invoke();
            case 8:
                EnumC10468l.f21324l.get(((Number) obj).intValue());
                return null;
            case 9:
                EnumC0972l.f2683l.get(((Number) obj).intValue());
                return null;
            case 10:
                EnumC12999l.f25472l.get(((Number) obj).intValue());
                return null;
            case 11:
                EnumC9736l.f19866l.get(((Number) obj).intValue());
                return null;
            case 12:
                return (InterfaceC0207l) obj;
            case 13:
                return (InterfaceC0207l) obj;
            case 14:
                String strConcat = "java/util/".concat("Spliterator");
                C9217l c9217l = AbstractC14490l.loadAd;
                ((C5695l) obj).loadAd(strConcat, c9217l, c9217l);
                return Unit.INSTANCE;
            case 15:
                EnumC14530l.f28448l.get(((Number) obj).intValue());
                return null;
            case 16:
                C2312l c2312l = (C2312l) obj;
                if (c2312l != null) {
                    return Boolean.valueOf(!c2312l.equals(AbstractC3333l.advert));
                }
                C8339l.metrica("Argument for @NotNull parameter 'name' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
                return null;
            default:
                EnumC12334l.f24421l.get(((Number) obj).intValue());
                return null;
        }
    }

    public /* synthetic */ C2911l(int i, Object obj) {
        this.f6336l = i;
    }
}
