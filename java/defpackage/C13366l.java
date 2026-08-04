package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lْٔؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13366l implements InterfaceC0896l {
    public final ArrayList yandex = new ArrayList();

    @Override // defpackage.InterfaceC0896l
    public final void onDestroy() {
        ArrayList arrayList = this.yandex;
        Iterator it = AbstractC16901l.m4213const(arrayList).iterator();
        while (it.hasNext()) {
            C6921l c6921lLoadAd = ((InterfaceC7901l) it.next()).loadAd();
            if (c6921lLoadAd != null) {
                c6921lLoadAd.admob();
            }
        }
        arrayList.clear();
    }
}
