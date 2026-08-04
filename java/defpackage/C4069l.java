package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lَّؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4069l {
    public final List yandex;

    public C4069l(List list) {
        this.yandex = list;
        AbstractC2371l abstractC2371l = (AbstractC2371l) AbstractC16901l.m4231native(list);
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((AbstractC2371l) it.next()).loadAd != abstractC2371l.loadAd) {
                C8339l.smaato("All outputs must have the same format!");
                throw null;
            }
        }
    }

    public final String toString() {
        return "CameraStream.Config(outputs=" + this.yandex + ", imageSourceConfig=null)";
    }
}
