package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٌ۠ۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9106l {
    public final C11362l crashlytics;
    public final C11362l loadAd;
    public final int yandex;

    public C9106l(int i, List list, List list2) {
        this.yandex = i;
        if (!(i >= 0)) {
            AbstractC14825l.yandex("Capacity must be a positive integer");
        }
        if (!(list.size() + list2.size() <= i)) {
            AbstractC14825l.yandex("Initial list of undo and redo operations have a size greater than the given capacity.");
        }
        C11362l c11362l = new C11362l();
        c11362l.addAll(list);
        this.loadAd = c11362l;
        C11362l c11362l2 = new C11362l();
        c11362l2.addAll(list2);
        this.crashlytics = c11362l2;
    }
}
