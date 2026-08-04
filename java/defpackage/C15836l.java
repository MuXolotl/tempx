package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٍٕٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C15836l extends C1538l implements Function3 {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C15836l f31088l = new C15836l(3, C6132l.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C6132l c6132l = (C6132l) obj;
        C2671l c2671l = (C2671l) obj2;
        long j = c6132l.yandex;
        if (j <= 0) {
            c2671l.f5802l = Unit.INSTANCE;
        } else {
            RunnableC10311l runnableC10311l = new RunnableC10311l(c2671l, c6132l, 2);
            InterfaceC12932l interfaceC12932l = c2671l.f5801l;
            c2671l.f5799l = AbstractC8532l.admob(interfaceC12932l).yandex(j, runnableC10311l, interfaceC12932l);
        }
        return Unit.INSTANCE;
    }
}
