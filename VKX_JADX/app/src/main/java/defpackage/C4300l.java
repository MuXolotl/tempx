package defpackage;

import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lٟٜؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4300l {
    public boolean crashlytics;
    public List loadAd;
    public final /* synthetic */ int yandex = 2;

    public C4300l(ArrayList arrayList, boolean z) {
        if (arrayList.isEmpty()) {
            this.loadAd = Collections.EMPTY_LIST;
        } else {
            this.loadAd = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        }
        this.crashlytics = z;
    }

    public static C4300l yandex(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null) {
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                arrayList.add(bundle2 != null ? new C13187l(bundle2) : null);
            }
        }
        return new C4300l(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    public String toString() {
        switch (this.yandex) {
            case 1:
                StringBuilder sb = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = this.loadAd;
                sb.append(Arrays.toString(list.toArray()));
                sb.append(", isValid=");
                int size = list.size();
                boolean z = false;
                for (int i = 0; i < size; i++) {
                    C13187l c13187l = (C13187l) list.get(i);
                    if (c13187l == null || !c13187l.purchase()) {
                        return AbstractC5020l.Signature(sb, z, " }");
                    }
                }
                z = true;
                return AbstractC5020l.Signature(sb, z, " }");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C4300l() {
    }

    public C4300l(List list, boolean z) {
        this.loadAd = list;
        this.crashlytics = z;
    }
}
