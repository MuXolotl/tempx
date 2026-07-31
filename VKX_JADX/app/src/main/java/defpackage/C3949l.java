package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؙؖؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3949l extends AbstractC10552l implements Function3 {

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C16994l f8127l;

    public C3949l(C16994l c16994l) {
        this.f8127l = c16994l;
    }

    @Override // defpackage.AbstractC8702l
    /* JADX INFO: renamed from: else */
    public final AbstractC2711l mo700else() {
        return this.f8127l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((C3949l) this.f8127l.f33127l.getValue()).pro(obj, obj2, obj3);
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC16956l
    public final InterfaceC13922l subs() {
        return this.f8127l;
    }
}
