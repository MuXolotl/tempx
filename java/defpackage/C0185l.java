package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: lًْؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0185l extends AbstractC17645l {
    public final C4067l amazon;
    public final /* synthetic */ int crashlytics;
    public final InterfaceC16588l loadAd;
    public final InterfaceC16588l yandex;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0185l(InterfaceC16588l interfaceC16588l, InterfaceC16588l interfaceC16588l2, int i) {
        this(interfaceC16588l, interfaceC16588l2, (byte) 0);
        this.crashlytics = i;
        switch (i) {
            case 1:
                this(interfaceC16588l, interfaceC16588l2, (byte) 0);
                this.amazon = new C4067l("kotlin.collections.LinkedHashMap", interfaceC16588l.purchase(), interfaceC16588l2.purchase());
                break;
            default:
                this.amazon = new C4067l("kotlin.collections.HashMap", interfaceC16588l.purchase(), interfaceC16588l2.purchase());
                break;
        }
    }

    @Override // defpackage.AbstractC17645l
    public final Iterator admob(Object obj) {
        switch (this.crashlytics) {
            case 0:
                break;
        }
        return ((Map) obj).entrySet().iterator();
    }

    @Override // defpackage.AbstractC17645l
    public final Object billing() {
        switch (this.crashlytics) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        int iSubs = subs(obj);
        InterfaceC18035l interfaceC18035lPurchase = purchase();
        InterfaceC0039l interfaceC0039lTapsense = interfaceC17739l.tapsense(interfaceC18035lPurchase, iSubs);
        Iterator itAdmob = admob(obj);
        int i = 0;
        while (itAdmob.hasNext()) {
            Map.Entry entry = (Map.Entry) itAdmob.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lTapsense;
            abstractC4072l.applovin(purchase(), i, this.yandex, key);
            i += 2;
            abstractC4072l.applovin(purchase(), i2, this.loadAd, value);
        }
        interfaceC0039lTapsense.yandex(interfaceC18035lPurchase);
    }

    @Override // defpackage.AbstractC17645l
    public final void firebase(InterfaceC14988l interfaceC14988l, int i, Object obj) {
        Map map = (Map) obj;
        Object objAds = interfaceC14988l.ads(purchase(), i, this.yandex, null);
        int iAdmob = interfaceC14988l.admob(purchase());
        if (iAdmob != i + 1) {
            C10754l.metrica(AbstractC12589l.premium(i, iAdmob, "Value must follow key in a map, index for key: ", ", returned index for value: "));
            return;
        }
        boolean zContainsKey = map.containsKey(objAds);
        InterfaceC16588l interfaceC16588l = this.loadAd;
        map.put(objAds, (!zContainsKey || (interfaceC16588l.purchase().billing() instanceof C15358l)) ? interfaceC14988l.ads(purchase(), iAdmob, interfaceC16588l, null) : interfaceC14988l.ads(purchase(), iAdmob, interfaceC16588l, AbstractC8676l.smaato(objAds, map)));
    }

    @Override // defpackage.AbstractC17645l
    public final int mopub(Object obj) {
        int size;
        switch (this.crashlytics) {
            case 0:
                size = ((HashMap) obj).size();
                break;
            default:
                size = ((LinkedHashMap) obj).size();
                break;
        }
        return size * 2;
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        switch (this.crashlytics) {
            case 0:
                break;
        }
        return this.amazon;
    }

    @Override // defpackage.AbstractC17645l
    public final Object remoteconfig(Object obj) {
        switch (this.crashlytics) {
            case 0:
                return (HashMap) obj;
            default:
                return (LinkedHashMap) obj;
        }
    }

    @Override // defpackage.AbstractC17645l
    public final Object smaato(Object obj) {
        switch (this.crashlytics) {
            case 0:
                return new HashMap((Map) null);
            default:
                return new LinkedHashMap((Map) null);
        }
    }

    @Override // defpackage.AbstractC17645l
    public final int subs(Object obj) {
        switch (this.crashlytics) {
            case 0:
                break;
        }
        return ((Map) obj).size();
    }

    public C0185l(InterfaceC16588l interfaceC16588l, InterfaceC16588l interfaceC16588l2, byte b) {
        this.yandex = interfaceC16588l;
        this.loadAd = interfaceC16588l2;
    }
}
