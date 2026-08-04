package defpackage;

/* JADX INFO: renamed from: lؚ۟ٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7544l extends AbstractC8481l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC10977l f15543l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f15544l;

    public /* synthetic */ C7544l(AbstractC10977l abstractC10977l, int i) {
        this.f15544l = i;
        this.f15543l = abstractC10977l;
    }

    @Override // defpackage.AbstractC5511l
    public final int billing(int i, Object[] objArr) {
        return amazon().billing(i, objArr);
    }

    @Override // defpackage.AbstractC5511l, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.f15544l;
        AbstractC10977l abstractC10977l = this.f15543l;
        switch (i) {
            case 0:
                if (obj instanceof C4139l) {
                    C4139l c4139l = (C4139l) obj;
                    if (c4139l.yandex() > 0) {
                        if (((C8970l) abstractC10977l).f18504l.loadAd(c4139l.yandex) == c4139l.yandex()) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return ((C8970l) abstractC10977l).contains(obj);
        }
    }

    @Override // defpackage.AbstractC8481l, java.util.Collection, java.util.Set
    public int hashCode() {
        switch (this.f15544l) {
            case 0:
                return this.f15543l.hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // defpackage.AbstractC5511l
    /* JADX INFO: renamed from: remoteconfig */
    public final AbstractC10199l iterator() {
        return amazon().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.f15544l;
        AbstractC10977l abstractC10977l = this.f15543l;
        switch (i) {
            case 0:
                return abstractC10977l.vip().size();
            default:
                return ((C8970l) abstractC10977l).f18504l.crashlytics;
        }
    }

    @Override // defpackage.AbstractC5511l
    public final boolean smaato() {
        switch (this.f15544l) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // defpackage.AbstractC8481l
    public final AbstractC1186l tapsense() {
        return new C7356l(this);
    }
}
