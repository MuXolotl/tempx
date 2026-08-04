package defpackage;

/* JADX INFO: renamed from: lَّۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10553l extends AbstractC5555l {
    public abstract void applovin(InterfaceC0589l interfaceC0589l);

    @Override // defpackage.AbstractC5555l
    public final void isVip(int i, InterfaceC0589l interfaceC0589l) {
        applovin(interfaceC0589l);
    }

    @Override // androidx.recyclerview.widget.subs
    public final int mopub() {
        return 1;
    }

    @Override // defpackage.AbstractC5555l, androidx.recyclerview.widget.subs
    public final int subs(int i) {
        return premium();
    }
}
