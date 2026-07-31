package defpackage;

/* JADX INFO: renamed from: l٘ٔ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17931l extends AbstractC11837l {
    @Override // defpackage.AbstractC11837l, defpackage.InterfaceC0308l
    public final void purchase(AbstractC15046l abstractC15046l) throws C16376l {
        if (abstractC15046l instanceof InterfaceC17831l) {
            this.subs.add(abstractC15046l);
            return;
        }
        throw new C16376l("Text content elements cannot contain " + abstractC15046l + " elements.");
    }
}
