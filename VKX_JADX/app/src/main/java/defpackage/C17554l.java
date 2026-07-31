package defpackage;

/* JADX INFO: renamed from: lٗۦٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17554l extends AbstractC1124l {
    @Override // defpackage.AbstractC1124l
    public final AbstractC4946l mopub(InterfaceC1925l interfaceC1925l) {
        InterfaceC5291l interfaceC5291l = interfaceC1925l instanceof InterfaceC5291l ? (InterfaceC5291l) interfaceC1925l : null;
        if (interfaceC5291l == null) {
            return null;
        }
        return interfaceC5291l.mo1127synchronized().crashlytics() ? new C10636l(3, interfaceC5291l.mo1127synchronized().loadAd()) : interfaceC5291l.mo1127synchronized();
    }
}
