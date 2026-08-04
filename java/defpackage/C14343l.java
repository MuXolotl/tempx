package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٓۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C14343l extends C1538l implements Function3 {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C14343l f28088l = new C14343l(3, C14750l.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        C14750l c14750l = (C14750l) obj;
        C2671l c2671l = (C2671l) obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C14750l.f28822l;
        c14750l.getClass();
        do {
            obj4 = C14750l.f28822l.get(c14750l);
            if (!(obj4 instanceof InterfaceC2541l)) {
                c2671l.f5802l = Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        } while (c14750l.m3886protected(obj4) < 0);
        c2671l.f5799l = AbstractC11174l.subs(c14750l, true, new C2004l(c14750l, c2671l, 1));
        return Unit.INSTANCE;
    }
}
