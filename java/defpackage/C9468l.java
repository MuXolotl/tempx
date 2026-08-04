package defpackage;

/* JADX INFO: renamed from: lٍُّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C9468l extends AbstractC7271l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f19352l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f19353l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C0046l f19354l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public boolean f19355l;

    public C9468l(C0046l c0046l, AbstractC15674l[] abstractC15674lArr) {
        super(c0046l.f908l, abstractC15674lArr);
        this.f19354l = c0046l;
        this.f19352l = c0046l.f911l;
    }

    public final void amazon(int i, C7250l c7250l, Object obj, int i2) {
        int i3 = i2 * 5;
        AbstractC15674l[] abstractC15674lArr = this.f15115l;
        if (i3 <= 30) {
            int iAdmob = 1 << AbstractC7822l.admob(i, i3);
            if (c7250l.admob(iAdmob)) {
                abstractC15674lArr[i2].yandex(Integer.bitCount(c7250l.yandex) * 2, c7250l.billing(iAdmob), c7250l.amazon);
                this.f15114l = i2;
                return;
            }
            int iTapsense = c7250l.tapsense(iAdmob);
            C7250l c7250lSubscription = c7250l.subscription(iTapsense);
            abstractC15674lArr[i2].yandex(Integer.bitCount(c7250l.yandex) * 2, iTapsense, c7250l.amazon);
            amazon(i, c7250lSubscription, obj, i2 + 1);
            return;
        }
        AbstractC15674l abstractC15674l = abstractC15674lArr[i2];
        Object[] objArr = c7250l.amazon;
        abstractC15674l.yandex(objArr.length, 0, objArr);
        while (true) {
            AbstractC15674l abstractC15674l2 = abstractC15674lArr[i2];
            if (AbstractC8576l.yandex(abstractC15674l2.f30650l[abstractC15674l2.f30648l], obj)) {
                this.f15114l = i2;
                return;
            } else {
                abstractC15674lArr[i2].f30648l += 2;
            }
        }
    }

    @Override // defpackage.AbstractC7271l, java.util.Iterator
    public final Object next() {
        if (this.f19354l.f911l != this.f19352l) {
            C8339l.mopub();
            return null;
        }
        if (!this.f15113l) {
            C4875l.firebase();
            return null;
        }
        AbstractC15674l abstractC15674l = this.f15115l[this.f15114l];
        this.f19353l = abstractC15674l.f30650l[abstractC15674l.f30648l];
        this.f19355l = true;
        return super.next();
    }

    @Override // defpackage.AbstractC7271l, java.util.Iterator
    public final void remove() {
        if (!this.f19355l) {
            C18073l.admob();
            return;
        }
        boolean z = this.f15113l;
        C0046l c0046l = this.f19354l;
        if (!z) {
            AbstractC9464l.loadAd(c0046l).remove(this.f19353l);
        } else {
            if (!z) {
                C4875l.firebase();
                return;
            }
            AbstractC15674l abstractC15674l = this.f15115l[this.f15114l];
            Object obj = abstractC15674l.f30650l[abstractC15674l.f30648l];
            AbstractC9464l.loadAd(c0046l).remove(this.f19353l);
            amazon(obj != null ? obj.hashCode() : 0, c0046l.f908l, obj, 0);
        }
        this.f19353l = null;
        this.f19355l = false;
        this.f19352l = c0046l.f911l;
    }
}
