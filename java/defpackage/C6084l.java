package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: lؘۥّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6084l {
    public static final /* synthetic */ InterfaceC13922l[] adcel = {new C0114l(C6084l.class, "_hasSetter", "get_hasSetter()Z", 0), new C0114l(C6084l.class, "_hasGetter", "get_hasGetter()Z", 0)};
    public final ArrayList admob;
    public final C8230l amazon;
    public C4258l billing;
    public final C8230l crashlytics;
    public final ArrayList firebase;
    public C4258l isPro;
    public final String loadAd;
    public final ArrayList metrica;
    public final ArrayList mopub;
    public final ArrayList purchase;
    public final ArrayList remoteconfig;
    public final LinkedHashMap smaato;
    public final ArrayList startapp;
    public C13565l subs;
    public final ArrayList vip;
    public int yandex;

    public C6084l(int i, int i2, int i3, String str) {
        this.yandex = i;
        this.loadAd = str;
        C13698l c13698lIsPro = AbstractC13743l.isPro(new C5950l(AbstractC1305l.applovin, 1));
        C13698l c13698lIsPro2 = AbstractC13743l.isPro(new C5950l(AbstractC1305l.premium, 1));
        C8230l c8230l = new C8230l(i2);
        InterfaceC13922l[] interfaceC13922lArr = adcel;
        InterfaceC13922l interfaceC13922l = interfaceC13922lArr[1];
        C8696l.f17901l.appmetrica(this, Integer.valueOf(c13698lIsPro2.f26744l | Integer.valueOf(this.yandex).intValue()));
        this.crashlytics = c8230l;
        InterfaceC13922l interfaceC13922l2 = interfaceC13922lArr[0];
        this.amazon = c13698lIsPro.m3679package(this) ? new C8230l(i3) : null;
        this.purchase = new ArrayList(0);
        this.mopub = new ArrayList(0);
        new ArrayList(0);
        this.admob = new ArrayList();
        this.firebase = new ArrayList(0);
        this.smaato = new LinkedHashMap(0);
        this.remoteconfig = new ArrayList(0);
        this.vip = new ArrayList(0);
        this.metrica = new ArrayList(0);
        InterfaceC12157l.yandex.getClass();
        List listYandex = C17744l.yandex();
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(listYandex, 10));
        Iterator it = listYandex.iterator();
        while (it.hasNext()) {
            ((C9703l) ((InterfaceC12157l) it.next())).getClass();
            arrayList.add(new C4954l());
        }
        this.startapp = arrayList;
    }
}
