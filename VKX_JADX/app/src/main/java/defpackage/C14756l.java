package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًؚٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14756l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C17398l f28823l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f28824l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f28825l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14756l(C17398l c17398l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f28824l = i;
        this.f28823l = c17398l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f28824l;
        C17398l c17398l = this.f28823l;
        Object obj2 = this.f28825l;
        switch (i) {
            case 0:
                C1725l c1725l = (C1725l) obj2;
                AbstractC2829l.crashlytics(obj);
                Iterator it = c17398l.f33902l.values().iterator();
                while (it.hasNext()) {
                    ((C14451l) it.next()).m3856package(c1725l);
                }
                break;
            default:
                C14759l c14759l = (C14759l) obj2;
                AbstractC2829l.crashlytics(obj);
                Iterator it2 = c17398l.f33902l.values().iterator();
                while (it2.hasNext()) {
                    ((C14451l) it2.next()).m3857throws(c14759l);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f28824l;
        C17398l c17398l = this.f28823l;
        switch (i) {
            case 0:
                C14756l c14756l = new C14756l(c17398l, interfaceC14029l, 0);
                c14756l.f28825l = obj;
                return c14756l;
            default:
                C14756l c14756l2 = new C14756l(c17398l, interfaceC14029l, 1);
                c14756l2.f28825l = obj;
                return c14756l2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f28824l) {
            case 0:
                return ((C14756l) ads((InterfaceC14029l) obj2, (C1725l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C14756l) ads((InterfaceC14029l) obj2, (C14759l) obj)).Signature(Unit.INSTANCE);
        }
    }
}
