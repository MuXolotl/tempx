package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٔۘٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15121l extends AbstractC16915l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C10700l f29665l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f29666l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15121l(C10700l c10700l, int i) {
        super(1);
        this.f29666l = i;
        this.f29665l = c10700l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.f29666l;
        C10700l c10700l = this.f29665l;
        switch (i) {
            case 0:
                c10700l.f21708l = (C6543l) obj;
                return Boolean.TRUE;
            case 1:
                AbstractC17886l abstractC17886l = (AbstractC17886l) obj;
                Object obj2 = c10700l.f21708l;
                if (obj2 == null && abstractC17886l.f34840l) {
                    c10700l.f21708l = abstractC17886l;
                } else if (obj2 != null) {
                    abstractC17886l.getClass();
                }
                return Boolean.TRUE;
            default:
                Object obj3 = (InterfaceC11189l) obj;
                if (((AbstractC14971l) obj3).f29454l.f29462l) {
                    c10700l.f21708l = obj3;
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
