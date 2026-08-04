package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lُۗۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11266l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f22700l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C11644l f22701l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f22702l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f22703l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11266l(C11644l c11644l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f22702l = i;
        this.f22701l = c11644l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        InterfaceC13012l interfaceC13012lYandex;
        int i = this.f22702l;
        C11644l c11644l = this.f22701l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        InterfaceC14029l interfaceC14029l = null;
        switch (i) {
            case 0:
                C14585l c14585l = (C14585l) this.f22700l;
                int i2 = this.f22703l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C17239l c17239l = c14585l.yandex;
                    C2759l c2759l = C2759l.f5975l;
                    c11644l.getClass();
                    String strYandex = AbstractC2617l.yandex();
                    EnumC12598l enumC12598l = EnumC12598l.AndroidTv;
                    C3844l c3844l = C3844l.f7950l;
                    C13654l c13654l = new C13654l(strYandex, enumC12598l, "8.14.1_pub", 100136, c3844l);
                    List list = (List) c11644l.f23357l;
                    ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C15814l) it.next()).getClass();
                        arrayList.add("auth");
                    }
                    C10542l c10542l = new C10542l(1, c13654l, arrayList, c3844l);
                    ((C16796l) c17239l.adcel()).billing(c2759l);
                    InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(C10542l.class);
                    try {
                        interfaceC13012lYandex = AbstractC18202l.yandex(C10542l.class);
                    } catch (Throwable unused) {
                        interfaceC13012lYandex = null;
                    }
                    C11310l c11310l = new C11310l(interfaceC1388lLoadAd, interfaceC13012lYandex);
                    this.f22700l = null;
                    this.f22703l = 1;
                    if (c17239l.mo1554while(c10542l, c11310l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                    break;
                } else {
                    if (i2 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            default:
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) this.f22700l;
                int i3 = this.f22703l;
                if (i3 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C13624l c13624l = new C13624l(c11644l, interfaceC14029l, 23);
                    String str = AbstractC17231l.yandex;
                    List listSingletonList = Collections.singletonList(str);
                    C7566l c7566l = new C7566l();
                    c7566l.crashlytics = 0;
                    c7566l.loadAd = "0.0.0.0";
                    Unit unit = Unit.INSTANCE;
                    InterfaceC10011l[] interfaceC10011lArr = (InterfaceC10011l[]) Arrays.copyOf(new InterfaceC10011l[]{c7566l}, 1);
                    ClassLoader classLoader = AbstractC5088l.class.getClassLoader();
                    AbstractC1937l.loadAd("io.ktor.server.Application");
                    C10038l c10038l = new C10038l(classLoader, AbstractC1937l.loadAd("io.ktor.server.Application"), new C2494l(4));
                    ArrayList arrayList2 = new ArrayList();
                    Collections.singletonList(str);
                    boolean z = AbstractC4981l.yandex;
                    InterfaceC12932l interfaceC12932lMo246l = interfaceC2262l.vip().mo246l(C17218l.f33421l);
                    arrayList2.add(c13624l);
                    C13046l c13046l = new C13046l(new C18480l(c10038l, AbstractC16901l.m4213const(arrayList2), listSingletonList, z, interfaceC12932lMo246l), new C15079l(20, interfaceC10011lArr));
                    this.f22700l = null;
                    this.f22703l = 1;
                    C16552l c16552l = AbstractC11463l.yandex;
                    if (AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C14951l(c13046l, interfaceC14029l, 21), this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i3 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        switch (this.f22702l) {
            case 0:
                C11266l c11266l = new C11266l(this.f22701l, interfaceC14029l, 0);
                c11266l.f22700l = obj;
                return c11266l;
            default:
                C11266l c11266l2 = new C11266l(this.f22701l, interfaceC14029l, 1);
                c11266l2.f22700l = obj;
                return c11266l2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f22702l) {
            case 0:
                return ((C11266l) ads((InterfaceC14029l) obj2, (C14585l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C11266l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
        }
    }
}
