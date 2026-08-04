package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٌٍ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9429l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Function0 f19279l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f19280l;

    public /* synthetic */ C9429l(int i, Function0 function0) {
        this.f19280l = i;
        this.f19279l = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f19280l;
        Function0 function0 = this.f19279l;
        switch (i) {
            case 0:
                return AbstractC16901l.m4229l((Iterable) function0.invoke());
            default:
                InterfaceC7637l interfaceC7637l = (InterfaceC7637l) function0.invoke();
                return interfaceC7637l instanceof C2144l ? ((C2144l) interfaceC7637l).admob() : interfaceC7637l;
        }
    }
}
