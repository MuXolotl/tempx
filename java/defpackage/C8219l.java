package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًٖۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8219l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f17118l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ AbstractC14569l f17119l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8219l(AbstractC14569l abstractC14569l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f17118l = i;
        this.f17119l = abstractC14569l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f17118l;
        InterfaceC14029l interfaceC14029l = null;
        AbstractC14569l abstractC14569l = this.f17119l;
        switch (i) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                if (abstractC14569l.f28529l == null) {
                    C0261l c0261l = new C0261l();
                    C2403l c2403l = abstractC14569l.f28520l;
                    if (c2403l != null) {
                        AbstractC10999l.mopub(abstractC14569l.m3914l(), null, 0, new C12086l(c2403l, c0261l, interfaceC14029l, 1), 3);
                    }
                    abstractC14569l.f28529l = c0261l;
                }
                break;
            default:
                AbstractC2829l.crashlytics(obj);
                C0261l c0261l2 = abstractC14569l.f28529l;
                if (c0261l2 != null) {
                    C12134l c12134l = new C12134l(c0261l2);
                    C2403l c2403l2 = abstractC14569l.f28520l;
                    if (c2403l2 != null) {
                        AbstractC10999l.mopub(abstractC14569l.m3914l(), null, 0, new C12086l(c2403l2, c12134l, interfaceC14029l, 2), 3);
                    }
                    abstractC14569l.f28529l = null;
                }
                break;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f17118l;
        AbstractC14569l abstractC14569l = this.f17119l;
        switch (i) {
            case 0:
                return new C8219l(abstractC14569l, interfaceC14029l, 0);
            default:
                return new C8219l(abstractC14569l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f17118l) {
            case 0:
                break;
        }
        return ((C8219l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
