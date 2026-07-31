package defpackage;

/* JADX INFO: renamed from: lؚٛؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7356l extends AbstractC1186l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C7544l f15261l;

    public C7356l(C7544l c7544l) {
        this.f15261l = c7544l;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C7544l c7544l = this.f15261l;
        switch (c7544l.f15544l) {
            case 0:
                C3528l c3528l = ((C8970l) c7544l.f15543l).f18504l;
                AbstractC12442l.smaato(i, c3528l.crashlytics);
                return new C4139l(c3528l, i);
            default:
                C3528l c3528l2 = ((C8970l) c7544l.f15543l).f18504l;
                AbstractC12442l.smaato(i, c3528l2.crashlytics);
                return c3528l2.yandex[i];
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15261l.size();
    }

    @Override // defpackage.AbstractC5511l
    public final boolean smaato() {
        return this.f15261l.smaato();
    }
}
