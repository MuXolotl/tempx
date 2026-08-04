package defpackage;

/* JADX INFO: renamed from: lٕۦؙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16063l extends C14274l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f31466l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16063l(InterfaceC12932l interfaceC12932l, InterfaceC14029l interfaceC14029l, int i) {
        super(interfaceC14029l, interfaceC12932l);
        this.f31466l = i;
    }

    @Override // defpackage.C14750l
    public final boolean applovin(Throwable th) {
        switch (this.f31466l) {
            case 0:
                if (th instanceof C9240l) {
                    return true;
                }
                return pro(th);
            default:
                return false;
        }
    }
}
