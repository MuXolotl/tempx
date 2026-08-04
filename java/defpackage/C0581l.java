package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lؑۛؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0581l {
    public final int amazon;
    public final ArrayList billing;
    public final int crashlytics;
    public final String loadAd;
    public final ArrayList purchase = new ArrayList(1);
    public int yandex;

    public C0581l(int i, int i2, int i3, String str) {
        this.yandex = i;
        this.loadAd = str;
        this.crashlytics = i2;
        this.amazon = i3;
        InterfaceC12157l.yandex.getClass();
        List listYandex = C17744l.yandex();
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(listYandex, 10));
        Iterator it = listYandex.iterator();
        while (it.hasNext()) {
            ((C9703l) ((InterfaceC12157l) it.next())).getClass();
            arrayList.add(new C8003l());
        }
        this.billing = arrayList;
    }
}
