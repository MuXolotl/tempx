package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٔۖؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C15080l extends C1538l implements Function3 {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C15080l f29610l = new C15080l(3, C14750l.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object objYandex;
        C14750l c14750l = (C14750l) obj;
        C2671l c2671l = (C2671l) obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C14750l.f28822l;
        c14750l.getClass();
        do {
            objYandex = C14750l.f28822l.get(c14750l);
            if (!(objYandex instanceof InterfaceC2541l)) {
                if (!(objYandex instanceof C2175l)) {
                    objYandex = AbstractC7114l.yandex(objYandex);
                }
                c2671l.f5802l = objYandex;
            }
            return Unit.INSTANCE;
        } while (c14750l.m3886protected(objYandex) < 0);
        c2671l.f5799l = AbstractC11174l.subs(c14750l, true, new C2004l(c14750l, c2671l, 0));
        return Unit.INSTANCE;
    }
}
