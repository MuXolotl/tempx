package defpackage;

import java.io.Serializable;
import java.util.HashSet;

/* JADX INFO: renamed from: lؓؗۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1652l {
    public Object amazon;
    public Serializable billing;
    public int crashlytics;
    public int loadAd;
    public Object mopub;
    public Serializable purchase;
    public String yandex = null;

    public C1652l(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.amazon = hashSet;
        this.purchase = new HashSet();
        this.loadAd = 0;
        this.crashlytics = 0;
        this.billing = new HashSet();
        hashSet.add(C12638l.yandex(cls));
        for (Class cls2 : clsArr) {
            AbstractC11064l.loadAd(cls2, "Null interface");
            ((HashSet) this.amazon).add(C12638l.yandex(cls2));
        }
    }

    public void crashlytics(int i) {
        if (this.loadAd == 0) {
            this.loadAd = i;
        } else {
            C8339l.smaato("Instantiation type has already been set.");
        }
    }

    public C4652l loadAd() {
        if (((InterfaceC15244l) this.mopub) != null) {
            return new C4652l(this.yandex, new HashSet((HashSet) this.amazon), new HashSet((HashSet) this.purchase), this.loadAd, this.crashlytics, (InterfaceC15244l) this.mopub, (HashSet) this.billing);
        }
        C8339l.smaato("Missing required property: factory.");
        return null;
    }

    public void yandex(C12186l c12186l) {
        if (((HashSet) this.amazon).contains(c12186l.yandex)) {
            C8339l.metrica("Components are not allowed to depend on interfaces they themselves provide.");
        } else {
            ((HashSet) this.purchase).add(c12186l);
        }
    }
}
