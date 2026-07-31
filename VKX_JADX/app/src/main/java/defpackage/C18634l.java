package defpackage;

import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: lٖۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18634l implements InterfaceC0627l {
    public final C5664l yandex;

    public C18634l(C5664l c5664l) {
        this.yandex = c5664l;
    }

    @Override // defpackage.InterfaceC0627l
    public final InterfaceC17866l yandex(InterfaceC2413l interfaceC2413l, Map map, C15202l c15202l) throws Exception {
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((Surface) ((Map.Entry) it.next()).getValue());
        }
        if (interfaceC2413l.mo841throw(arrayList, c15202l)) {
            return new C5522l(C14054l.f27396l, AbstractC11965l.loadAd(map, this.yandex));
        }
        Log.w("CXCP", "Failed to create ConstrainedHighSpeedCaptureSession from " + interfaceC2413l + " for " + c15202l + '!');
        c15202l.yandex();
        return C7472l.f15449l;
    }
}
