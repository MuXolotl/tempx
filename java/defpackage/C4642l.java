package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؗؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4642l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC9694l f9444l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4642l(AbstractC9694l abstractC9694l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f9444l = abstractC9694l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        AbstractC2829l.crashlytics(obj);
        AbstractC9694l abstractC9694l = this.f9444l;
        if (abstractC9694l.mo781return().mo226l() instanceof C4842l) {
            VKXApplication.f36625l.postDelayed(new RunnableC11297l(12, abstractC9694l), 1000L);
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C4642l(this.f9444l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4642l) ads((InterfaceC14029l) obj2, (C3689l) obj)).Signature(Unit.INSTANCE);
    }
}
