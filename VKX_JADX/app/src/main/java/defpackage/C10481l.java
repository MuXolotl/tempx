package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lَٟۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10481l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f21341l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ AbstractC9694l f21342l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10481l(AbstractC9694l abstractC9694l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f21341l = i;
        this.f21342l = abstractC9694l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f21341l;
        AbstractC9694l abstractC9694l = this.f21342l;
        switch (i) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                abstractC9694l.mo782this();
                break;
            case 1:
                AbstractC2829l.crashlytics(obj);
                C8688l c8688l = C2490l.subs;
                if (!AbstractC12832l.crashlytics().loadAd.ads()) {
                    abstractC9694l.mo782this();
                }
                break;
            case 2:
                AbstractC2829l.crashlytics(obj);
                abstractC9694l.mo780l();
                break;
            default:
                AbstractC2829l.crashlytics(obj);
                abstractC9694l.mo782this();
                break;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f21341l;
        AbstractC9694l abstractC9694l = this.f21342l;
        switch (i) {
            case 0:
                return new C10481l(abstractC9694l, interfaceC14029l, 0);
            case 1:
                return new C10481l(abstractC9694l, interfaceC14029l, 1);
            case 2:
                return new C10481l(abstractC9694l, interfaceC14029l, 2);
            default:
                return new C10481l(abstractC9694l, interfaceC14029l, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21341l) {
            case 0:
                return ((C10481l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 1:
                if (obj == null) {
                    return ((C10481l) ads((InterfaceC14029l) obj2, null)).Signature(Unit.INSTANCE);
                }
                C18725l.loadAd();
                return null;
            case 2:
                return ((C10481l) ads((InterfaceC14029l) obj2, (C13865l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C10481l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
        }
    }
}
