package defpackage;

/* JADX INFO: renamed from: lّْؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12569l extends AbstractC4829l {
    @Override // defpackage.AbstractC4829l
    public final void amazon(int i, int i2) {
        AbstractC12272l.admob().execute(new RunnableC15875l(this, i2));
    }

    @Override // defpackage.AbstractC4829l
    public final void purchase(int i) {
        AbstractC12272l.admob().execute(new RunnableC15875l(this));
    }
}
