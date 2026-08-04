package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؚٔؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7253l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C18233l f15087l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2262l f15088l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f15089l;

    public /* synthetic */ C7253l(InterfaceC2262l interfaceC2262l, C18233l c18233l, int i) {
        this.f15089l = i;
        this.f15088l = interfaceC2262l;
        this.f15087l = c18233l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f15089l;
        C18233l c18233l = this.f15087l;
        InterfaceC2262l interfaceC2262l = this.f15088l;
        switch (i) {
            case 0:
                AbstractC10999l.mopub(interfaceC2262l, null, 0, new C4897l(c18233l, ((Boolean) obj).booleanValue(), null, 0), 3);
                break;
            default:
                AbstractC10999l.mopub(interfaceC2262l, null, 0, new C4897l(c18233l, ((Boolean) obj).booleanValue(), null, 1), 3);
                break;
        }
        return Unit.INSTANCE;
    }
}
