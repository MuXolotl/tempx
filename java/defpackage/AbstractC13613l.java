package defpackage;

/* JADX INFO: renamed from: lْۘۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13613l extends AbstractC12050l {
    public AbstractC13613l(InterfaceC14029l interfaceC14029l) {
        super(interfaceC14029l);
        if (interfaceC14029l == null || interfaceC14029l.metrica() == C17218l.f33421l) {
            return;
        }
        C8339l.metrica("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // defpackage.InterfaceC14029l
    public final InterfaceC12932l metrica() {
        return C17218l.f33421l;
    }
}
