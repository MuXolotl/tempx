package defpackage;

import android.graphics.Rect;
import android.util.Size;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؓۙۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2091l implements InterfaceC8927l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final InterfaceC18690l f4683l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final HashSet f4686l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final HashMap f4687l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final InterfaceC10139l f4688l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C12642l f4690l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final HashSet f4691l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final InterfaceC18690l f4692l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C12642l f4693l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final HashMap f4685l = new HashMap();

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final HashMap f4682l = new HashMap();

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final HashMap f4689l = new HashMap();

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C16815l f4684l = new C16815l(this);

    public C2091l(InterfaceC18690l interfaceC18690l, InterfaceC18690l interfaceC18690l2, HashSet hashSet, InterfaceC10139l interfaceC10139l, C18262l c18262l) {
        this.f4692l = interfaceC18690l;
        this.f4683l = interfaceC18690l2;
        this.f4688l = interfaceC10139l;
        this.f4686l = hashSet;
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AbstractC6896l abstractC6896l = (AbstractC6896l) it.next();
            map.put(abstractC6896l, abstractC6896l.metrica(interfaceC18690l.adcel(), null, abstractC6896l.mopub(true, interfaceC10139l)));
        }
        this.f4687l = map;
        HashSet hashSet2 = new HashSet(map.values());
        this.f4691l = hashSet2;
        this.f4693l = new C12642l(interfaceC18690l, hashSet2);
        if (this.f4683l != null) {
            this.f4690l = new C12642l(this.f4683l, hashSet2);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            AbstractC6896l abstractC6896l2 = (AbstractC6896l) it2.next();
            this.f4689l.put(abstractC6896l2, Boolean.FALSE);
            this.f4682l.put(abstractC6896l2, new C8599l(interfaceC18690l, this, c18262l));
        }
    }

    public static AbstractC0958l Signature(AbstractC6896l abstractC6896l) {
        List listLoadAd = abstractC6896l instanceof C9731l ? abstractC6896l.adcel.loadAd() : DesugarCollections.unmodifiableList(abstractC6896l.adcel.mopub.yandex);
        AbstractC5641l.purchase(null, listLoadAd.size() <= 1);
        if (listLoadAd.size() == 1) {
            return (AbstractC0958l) listLoadAd.get(0);
        }
        return null;
    }

    public static void tapsense(C3716l c3716l, AbstractC0958l abstractC0958l, C10814l c10814l) {
        c3716l.purchase();
        try {
            AbstractC12225l.crashlytics();
            c3716l.loadAd();
            C10500l c10500l = c3716l.smaato;
            Objects.requireNonNull(c10500l);
            c10500l.mopub(abstractC0958l, new RunnableC8594l(c10500l, 0));
        } catch (C4201l unused) {
            InterfaceC1837l interfaceC1837l = c10814l.billing;
            if (interfaceC1837l != null) {
                interfaceC1837l.yandex(c10814l);
            }
        }
    }

    public final boolean ad(AbstractC6896l abstractC6896l) {
        Boolean bool = (Boolean) this.f4689l.get(abstractC6896l);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    @Override // defpackage.InterfaceC8927l
    public final void ads(AbstractC6896l abstractC6896l) {
        AbstractC12225l.crashlytics();
        if (ad(abstractC6896l)) {
            this.f4689l.put(abstractC6896l, Boolean.FALSE);
            C3716l c3716lPro = pro(abstractC6896l);
            AbstractC12225l.crashlytics();
            c3716lPro.loadAd();
            c3716lPro.smaato.yandex();
        }
    }

    public final void advert(HashMap map, HashMap map2) {
        HashMap map3 = this.f4685l;
        map3.clear();
        map3.putAll(map);
        for (Map.Entry entry : map3.entrySet()) {
            AbstractC6896l abstractC6896l = (AbstractC6896l) entry.getKey();
            C3716l c3716l = (C3716l) entry.getValue();
            abstractC6896l.appmetrica(c3716l.amazon);
            abstractC6896l.premium(c3716l.loadAd);
            C6472l c6472lLoadAd = c3716l.mopub.loadAd();
            Size size = (Size) map2.get(abstractC6896l);
            if (size != null) {
                c6472lLoadAd.f13509l = size;
            }
            abstractC6896l.m2080package(c6472lLoadAd.yandex(), null);
            abstractC6896l.ads();
        }
    }

    @Override // defpackage.InterfaceC8927l
    public final void crashlytics(AbstractC6896l abstractC6896l) {
        AbstractC0958l abstractC0958lSignature;
        AbstractC12225l.crashlytics();
        C3716l c3716lPro = pro(abstractC6896l);
        if (ad(abstractC6896l) && (abstractC0958lSignature = Signature(abstractC6896l)) != null) {
            tapsense(c3716lPro, abstractC0958lSignature, abstractC6896l.adcel);
        }
    }

    public final HashMap license(C3716l c3716l, boolean z) {
        HashMap map = new HashMap();
        for (AbstractC6896l abstractC6896l : this.f4686l) {
            InterfaceC0048l interfaceC0048l = (InterfaceC0048l) this.f4687l.get(abstractC6896l);
            Objects.requireNonNull(interfaceC0048l);
            Size size = this.f4693l.loadAd(interfaceC0048l, c3716l.amazon, AbstractC18611l.loadAd(c3716l.loadAd), z).crashlytics;
            map.put(abstractC6896l, size);
            AbstractC5088l.yandex("VirtualCameraAdapter", "Selected child size: " + size + ", useCase: " + abstractC6896l);
        }
        return map;
    }

    @Override // defpackage.InterfaceC8927l
    public final void mopub(AbstractC6896l abstractC6896l) {
        AbstractC12225l.crashlytics();
        if (ad(abstractC6896l)) {
            C3716l c3716lPro = pro(abstractC6896l);
            AbstractC0958l abstractC0958lSignature = Signature(abstractC6896l);
            if (abstractC0958lSignature != null) {
                tapsense(c3716lPro, abstractC0958lSignature, abstractC6896l.adcel);
                return;
            }
            AbstractC12225l.crashlytics();
            c3716lPro.loadAd();
            c3716lPro.smaato.yandex();
        }
    }

    public final C3716l pro(AbstractC6896l abstractC6896l) {
        C3716l c3716l = (C3716l) this.f4685l.get(abstractC6896l);
        Objects.requireNonNull(c3716l);
        return c3716l;
    }

    @Override // defpackage.InterfaceC8927l
    public final void purchase(AbstractC6896l abstractC6896l) {
        AbstractC12225l.crashlytics();
        if (ad(abstractC6896l)) {
            return;
        }
        this.f4689l.put(abstractC6896l, Boolean.TRUE);
        AbstractC0958l abstractC0958lSignature = Signature(abstractC6896l);
        if (abstractC0958lSignature != null) {
            tapsense(pro(abstractC6896l), abstractC0958lSignature, abstractC6896l.adcel);
        }
    }

    public final C6822l subscription(AbstractC6896l abstractC6896l, C12642l c12642l, InterfaceC18690l interfaceC18690l, C3716l c3716l, int i, boolean z) {
        int i2;
        int iTapsense = interfaceC18690l.loadAd().tapsense(i);
        boolean zPurchase = AbstractC18611l.purchase(c3716l.loadAd);
        InterfaceC0048l interfaceC0048l = (InterfaceC0048l) this.f4687l.get(abstractC6896l);
        Objects.requireNonNull(interfaceC0048l);
        C6826l c6826lLoadAd = c12642l.loadAd(interfaceC0048l, c3716l.amazon, AbstractC18611l.loadAd(c3716l.loadAd), z);
        Rect rect = c6826lLoadAd.yandex;
        Size size = c6826lLoadAd.loadAd;
        int iIsPro = AbstractC18611l.isPro((c3716l.subs + interfaceC18690l.loadAd().tapsense(((InterfaceC4089l) abstractC6896l.admob).mo1483finally(0))) - iTapsense);
        boolean zVip = abstractC6896l.vip(interfaceC18690l) ^ zPurchase;
        if (abstractC6896l instanceof C0527l) {
            i2 = 1;
        } else {
            i2 = abstractC6896l instanceof C9731l ? 4 : 2;
        }
        return new C6822l(UUID.randomUUID(), i2, abstractC6896l instanceof C9731l ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 34, rect, AbstractC18611l.admob(iIsPro, size), iIsPro, zVip);
    }
}
