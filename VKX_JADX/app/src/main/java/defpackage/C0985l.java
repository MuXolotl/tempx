package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lُؒۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0985l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f2709l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C9879l f2710l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0985l(C9879l c9879l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f2709l = i;
        this.f2710l = c9879l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f2709l;
        C9879l c9879l = this.f2710l;
        switch (i) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                AbstractC10999l.mopub(AbstractC11990l.firebase(c9879l.yandex), null, 0, new C1391l(c9879l, null, 0), 3);
                break;
            default:
                AbstractC2829l.crashlytics(obj);
                C9879l.billing(c9879l, c9879l.isPro().loadAd);
                break;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        switch (this.f2709l) {
            case 0:
                return new C0985l(this.f2710l, interfaceC14029l, 0);
            default:
                return new C0985l(this.f2710l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2709l) {
            case 0:
                return ((C0985l) ads((InterfaceC14029l) obj2, (C9098l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C0985l) ads((InterfaceC14029l) obj2, (C4097l) obj)).Signature(Unit.INSTANCE);
        }
    }
}
