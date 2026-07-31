package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٗؓؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16855l {
    public int amazon;
    public final /* synthetic */ C11045l billing;
    public int crashlytics;
    public final List[] loadAd;
    public boolean purchase;
    public final List yandex;

    public C16855l(C11045l c11045l, List list) {
        this.billing = c11045l;
        this.yandex = list;
        this.loadAd = new List[list.size()];
        if (list.isEmpty()) {
            AbstractC14825l.yandex("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
