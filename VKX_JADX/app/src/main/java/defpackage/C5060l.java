package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lِٟؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5060l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C0787l f10331l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f10332l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f10333l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5060l(C0787l c0787l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f10332l = i;
        this.f10331l = c0787l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f10332l;
        C0787l c0787l = this.f10331l;
        Object obj2 = this.f10333l;
        switch (i) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                if (!((C10288l) obj2).yandex) {
                    c0787l.purchase();
                }
                break;
            default:
                AbstractC2829l.crashlytics(obj);
                C0787l.pro((C11533l) c0787l.license().f36317l, (C3600l) obj2);
                break;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f10332l;
        C0787l c0787l = this.f10331l;
        switch (i) {
            case 0:
                C5060l c5060l = new C5060l(c0787l, interfaceC14029l, 0);
                c5060l.f10333l = obj;
                return c5060l;
            default:
                C5060l c5060l2 = new C5060l(c0787l, interfaceC14029l, 1);
                c5060l2.f10333l = obj;
                return c5060l2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10332l) {
            case 0:
                return ((C5060l) ads((InterfaceC14029l) obj2, (C10288l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C5060l) ads((InterfaceC14029l) obj2, (C3600l) obj)).Signature(Unit.INSTANCE);
        }
    }
}
