package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: lۣؖۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4454l {
    public C4258l admob;
    public C4258l amazon;
    public final ArrayList billing;
    public final ArrayList firebase;
    public final LinkedHashMap isPro;
    public final String loadAd;
    public final ArrayList mopub;
    public final ArrayList smaato;
    public final ArrayList subs;
    public int yandex;
    public final ArrayList crashlytics = new ArrayList(0);
    public final ArrayList purchase = new ArrayList(0);

    public C4454l(int i, String str) {
        this.yandex = i;
        this.loadAd = str;
        new ArrayList(0);
        this.billing = new ArrayList();
        this.mopub = new ArrayList();
        this.subs = new ArrayList(0);
        this.isPro = new LinkedHashMap(0);
        this.firebase = new ArrayList(0);
        InterfaceC12157l.yandex.getClass();
        List listYandex = C17744l.yandex();
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(listYandex, 10));
        Iterator it = listYandex.iterator();
        while (it.hasNext()) {
            ((C9703l) ((InterfaceC12157l) it.next())).getClass();
            arrayList.add(new C8726l());
        }
        this.smaato = arrayList;
    }
}
