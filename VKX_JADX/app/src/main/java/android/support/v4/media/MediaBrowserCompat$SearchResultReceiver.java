package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import defpackage.C0554l;
import defpackage.C1102l;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
class MediaBrowserCompat$SearchResultReceiver extends C1102l {
    @Override // defpackage.C1102l
    public final void yandex(int i, Bundle bundle) {
        if (bundle != null) {
            bundle = C0554l.m628default(bundle);
        }
        if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
            throw null;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        parcelableArray.getClass();
        ArrayList arrayList = new ArrayList(parcelableArray.length);
        for (Parcelable parcelable : parcelableArray) {
            arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
        }
        throw null;
    }
}
