package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؘْ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5658l extends AbstractC0283l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f12013l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f12014l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC14029l f12015l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5658l(InterfaceC14029l interfaceC14029l, InterfaceC12932l interfaceC12932l, Function2 function2, InterfaceC14029l interfaceC14029l2) {
        super(interfaceC14029l, interfaceC12932l);
        this.f12013l = function2;
        this.f12015l = interfaceC14029l2;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f12014l;
        if (i == 0) {
            this.f12014l = 1;
            AbstractC2829l.crashlytics(obj);
            Function2 function2 = this.f12013l;
            AbstractC9464l.purchase(2, function2);
            return function2.invoke(this.f12015l, this);
        }
        if (i != 1) {
            C8339l.smaato("This coroutine had already completed");
            return null;
        }
        this.f12014l = 2;
        AbstractC2829l.crashlytics(obj);
        return obj;
    }
}
