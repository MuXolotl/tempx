package defpackage;

import androidx.recyclerview.widget.subs;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؒؗۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0857l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC11519l f2510l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f2511l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f2512l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0857l(AbstractC11519l abstractC11519l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f2511l = i;
        this.f2510l = abstractC11519l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        C14451l c14451l;
        int i = this.f2511l;
        AbstractC11519l abstractC11519l = this.f2510l;
        Object obj2 = this.f2512l;
        switch (i) {
            case 0:
                C1725l c1725l = (C1725l) obj2;
                AbstractC2829l.crashlytics(obj);
                subs subsVar = abstractC11519l.f23165l;
                if (subsVar == null) {
                    subsVar = null;
                }
                c14451l = subsVar instanceof C14451l ? (C14451l) subsVar : null;
                if (c14451l != null) {
                    c14451l.m3856package(c1725l);
                }
                break;
            default:
                C14759l c14759l = (C14759l) obj2;
                AbstractC2829l.crashlytics(obj);
                subs subsVar2 = abstractC11519l.f23165l;
                if (subsVar2 == null) {
                    subsVar2 = null;
                }
                c14451l = subsVar2 instanceof C14451l ? (C14451l) subsVar2 : null;
                if (c14451l != null) {
                    c14451l.m3857throws(c14759l);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f2511l;
        AbstractC11519l abstractC11519l = this.f2510l;
        switch (i) {
            case 0:
                C0857l c0857l = new C0857l(abstractC11519l, interfaceC14029l, 0);
                c0857l.f2512l = obj;
                return c0857l;
            default:
                C0857l c0857l2 = new C0857l(abstractC11519l, interfaceC14029l, 1);
                c0857l2.f2512l = obj;
                return c0857l2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2511l) {
            case 0:
                return ((C0857l) ads((InterfaceC14029l) obj2, (C1725l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C0857l) ads((InterfaceC14029l) obj2, (C14759l) obj)).Signature(Unit.INSTANCE);
        }
    }
}
