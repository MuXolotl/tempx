package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؚٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18412l extends AbstractC13613l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f35954l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f35955l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC14029l f35956l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18412l(InterfaceC14029l interfaceC14029l, InterfaceC14029l interfaceC14029l2, Function2 function2) {
        super(interfaceC14029l);
        this.f35954l = function2;
        this.f35956l = interfaceC14029l2;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f35955l;
        if (i == 0) {
            this.f35955l = 1;
            AbstractC2829l.crashlytics(obj);
            Function2 function2 = this.f35954l;
            AbstractC9464l.purchase(2, function2);
            return function2.invoke(this.f35956l, this);
        }
        if (i != 1) {
            C8339l.smaato("This coroutine had already completed");
            return null;
        }
        this.f35955l = 2;
        AbstractC2829l.crashlytics(obj);
        return obj;
    }
}
