package j$.util;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes2.dex */
public final class q0 extends p1 {
    public final /* synthetic */ java.util.SortedSet f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(java.util.SortedSet sortedSet, java.util.Collection collection) {
        super(collection, 21);
        this.f = sortedSet;
    }

    @Override // j$.util.p1, j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        return this.f.comparator();
    }
}
