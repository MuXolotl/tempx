package defpackage;

/* JADX INFO: renamed from: lِٜٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC15025l extends AbstractC7238l {
    public final AbstractC14384l firebase;

    public AbstractC15025l(AbstractC14384l abstractC14384l) {
        this.firebase = abstractC14384l;
    }

    @Override // defpackage.AbstractC7238l
    public final long Signature(long j, Object obj) {
        return j;
    }

    @Override // defpackage.AbstractC14384l
    public final C2427l admob() {
        return this.firebase.admob();
    }

    public abstract void isVip(AbstractC10759l abstractC10759l);

    @Override // defpackage.AbstractC7238l
    public final int license(int i, Object obj) {
        return i;
    }

    @Override // defpackage.AbstractC14384l
    public final AbstractC10759l mopub() {
        return this.firebase.mopub();
    }

    public void premium() {
        signatures();
    }

    @Override // defpackage.AbstractC7238l
    public final void pro(Object obj, AbstractC14384l abstractC14384l, AbstractC10759l abstractC10759l) {
        isVip(abstractC10759l);
    }

    public final void signatures() {
        ad(null, this.firebase);
    }

    @Override // defpackage.AbstractC14384l
    public final void smaato(C7713l c7713l) {
        this.isPro = c7713l;
        this.subs = AbstractC15323l.ads(null);
        premium();
    }

    @Override // defpackage.AbstractC14384l
    public final boolean subs() {
        return this.firebase.subs();
    }

    @Override // defpackage.AbstractC14384l
    public void subscription(C2427l c2427l) {
        this.firebase.subscription(c2427l);
    }

    @Override // defpackage.AbstractC7238l
    public final C5019l tapsense(Object obj, C5019l c5019l) {
        return advert(c5019l);
    }

    public C5019l advert(C5019l c5019l) {
        return c5019l;
    }
}
