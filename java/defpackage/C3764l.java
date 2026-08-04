package defpackage;

import android.util.SparseBooleanArray;
import java.util.HashSet;

/* JADX INFO: renamed from: lؕۥٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3764l {
    public static final C16616l billing;
    public static final C14023l purchase;
    public final AbstractC1186l amazon;
    public final AbstractC1186l crashlytics;
    public final C16616l loadAd;
    public final C14023l yandex;

    static {
        HashSet hashSet = new HashSet();
        C13708l c13708l = C12417l.amazon;
        for (int i = 0; i < c13708l.f26765l; i++) {
            hashSet.add(new C12417l(((Integer) c13708l.get(i)).intValue()));
        }
        new C14023l(hashSet);
        HashSet hashSet2 = new HashSet();
        C13708l c13708l2 = C12417l.purchase;
        for (int i2 = 0; i2 < c13708l2.f26765l; i2++) {
            hashSet2.add(new C12417l(((Integer) c13708l2.get(i2)).intValue()));
        }
        for (int i3 = 0; i3 < c13708l.f26765l; i3++) {
            hashSet2.add(new C12417l(((Integer) c13708l.get(i3)).intValue()));
        }
        purchase = new C14023l(hashSet2);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i4 : C3316l.f7071l) {
            AbstractC12442l.subscription(!false);
            sparseBooleanArray.append(i4, true);
        }
        AbstractC12442l.subscription(!false);
        billing = new C16616l(new C4094l(sparseBooleanArray));
    }

    public C3764l(C14023l c14023l, C16616l c16616l, AbstractC1186l abstractC1186l, AbstractC1186l abstractC1186l2) {
        this.yandex = c14023l;
        this.loadAd = c16616l;
        this.crashlytics = abstractC1186l;
        this.amazon = abstractC1186l2;
    }
}
