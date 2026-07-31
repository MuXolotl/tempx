package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: lًٌ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9095l implements InterfaceC7103l {
    public String loadAd;
    public String remoteconfig;
    public final ArrayList subscription;
    public C4258l vip;
    public int yandex;
    public final ArrayList crashlytics = new ArrayList(0);
    public final ArrayList amazon = new ArrayList(1);
    public final ArrayList purchase = new ArrayList();
    public final ArrayList billing = new ArrayList();
    public final ArrayList mopub = new ArrayList(0);
    public final ArrayList admob = new ArrayList(1);
    public final ArrayList subs = new ArrayList(0);
    public final ArrayList isPro = new ArrayList(0);
    public final ArrayList firebase = new ArrayList(0);
    public final ArrayList smaato = new ArrayList(0);
    public final ArrayList metrica = new ArrayList(0);
    public final ArrayList startapp = new ArrayList(0);
    public final ArrayList adcel = new ArrayList(0);
    public final LinkedHashMap ads = new LinkedHashMap(0);

    public C9095l() {
        InterfaceC12157l.yandex.getClass();
        List listYandex = C17744l.yandex();
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(listYandex, 10));
        Iterator it = listYandex.iterator();
        while (it.hasNext()) {
            ((C9703l) ((InterfaceC12157l) it.next())).getClass();
            arrayList.add(new C2937l());
        }
        this.subscription = arrayList;
    }

    @Override // defpackage.InterfaceC7103l
    public final ArrayList crashlytics() {
        return this.mopub;
    }

    @Override // defpackage.InterfaceC7103l
    public final ArrayList loadAd() {
        return this.purchase;
    }

    @Override // defpackage.InterfaceC7103l
    public final ArrayList yandex() {
        return this.billing;
    }
}
