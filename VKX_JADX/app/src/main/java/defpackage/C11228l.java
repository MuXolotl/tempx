package defpackage;

import android.util.LruCache;
import java.util.ArrayList;

/* JADX INFO: renamed from: lُٟۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11228l extends LruCache {
    public final /* synthetic */ C13985l yandex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11228l(C13985l c13985l) {
        super(20);
        this.yandex = c13985l;
    }

    @Override // android.util.LruCache
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        Integer num = (Integer) obj;
        if (z) {
            ArrayList arrayList = this.yandex.mopub;
            AbstractC1051l.subs(arrayList);
            arrayList.add(num);
        }
    }
}
