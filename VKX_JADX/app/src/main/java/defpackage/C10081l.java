package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lَؖؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10081l extends AbstractC13613l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f20555l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f20556l;

    /* JADX WARN: Illegal instructions before constructor call */
    public C10081l(Function1 function1) {
        C9958l c9958l = AbstractC7572l.yandex;
        this.f20555l = function1;
        super(c9958l);
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f20556l;
        if (i == 0) {
            this.f20556l = 1;
            AbstractC2829l.crashlytics(obj);
            Function1 function1 = this.f20555l;
            AbstractC9464l.purchase(1, function1);
            return function1.invoke(this);
        }
        if (i != 1) {
            C8339l.smaato("This coroutine had already completed");
            return null;
        }
        this.f20556l = 2;
        AbstractC2829l.crashlytics(obj);
        return obj;
    }
}
