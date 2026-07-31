package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lؑؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C0065l extends AbstractC16370l {
    public int admob;
    public final C18010l billing;
    public final InterfaceC18035l mopub;
    public boolean subs;

    public /* synthetic */ C0065l(AbstractC8237l abstractC8237l, C18010l c18010l, String str, int i) {
        this(abstractC8237l, c18010l, (i & 4) != 0 ? null : str, (InterfaceC18035l) null);
    }

    @Override // defpackage.InterfaceC14988l
    public int admob(InterfaceC18035l interfaceC18035l) {
        while (this.admob < interfaceC18035l.mopub()) {
            int i = this.admob;
            this.admob = i + 1;
            String strM4160continue = m4160continue(interfaceC18035l, i);
            int i2 = this.admob - 1;
            this.subs = false;
            if (mo264class().containsKey(strM4160continue) || m265goto(interfaceC18035l, i2)) {
                if (this.purchase.mopub) {
                    boolean zFirebase = interfaceC18035l.firebase(i2);
                    InterfaceC18035l interfaceC18035lIsPro = interfaceC18035l.isPro(i2);
                    if (!zFirebase || interfaceC18035lIsPro.crashlytics() || !(((AbstractC9914l) mo264class().get(strM4160continue)) instanceof C5544l)) {
                        if (AbstractC8576l.yandex(interfaceC18035lIsPro.billing(), C2374l.amazon) && (!interfaceC18035lIsPro.crashlytics() || !(((AbstractC9914l) mo264class().get(strM4160continue)) instanceof C5544l))) {
                            AbstractC9914l abstractC9914l = (AbstractC9914l) mo264class().get(strM4160continue);
                            AbstractC18121l abstractC18121l = abstractC9914l instanceof AbstractC18121l ? (AbstractC18121l) abstractC9914l : null;
                            String strPurchase = abstractC18121l != null ? AbstractC8358l.purchase(abstractC18121l) : null;
                            if (strPurchase != null) {
                                AbstractC8237l abstractC8237l = this.crashlytics;
                                int iYandex = AbstractC3644l.yandex(interfaceC18035lIsPro, abstractC8237l, strPurchase);
                                boolean z = !abstractC8237l.yandex.purchase && interfaceC18035lIsPro.crashlytics();
                                if (iYandex != -3 || ((!zFirebase && !z) || m265goto(interfaceC18035l, i2))) {
                                }
                            }
                        }
                    }
                }
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.AbstractC16370l, defpackage.InterfaceC10726l
    public final InterfaceC14988l crashlytics(InterfaceC18035l interfaceC18035l) {
        InterfaceC18035l interfaceC18035l2 = this.mopub;
        if (interfaceC18035l != interfaceC18035l2) {
            return super.crashlytics(interfaceC18035l);
        }
        AbstractC9914l abstractC9914lM4171synchronized = m4171synchronized();
        String strYandex = interfaceC18035l2.yandex();
        boolean z = abstractC9914lM4171synchronized instanceof C18010l;
        AbstractC8237l abstractC8237l = this.crashlytics;
        if (z) {
            return new C0065l(abstractC8237l, (C18010l) abstractC9914lM4171synchronized, this.amazon, interfaceC18035l2);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        C2336l c2336l = AbstractC18202l.yandex;
        sb.append(c2336l.loadAd(C18010l.class).license());
        sb.append(", but had ");
        sb.append(c2336l.loadAd(abstractC9914lM4171synchronized.getClass()).license());
        throw new C5114l(AbstractC2238l.crashlytics(-1, AbstractC0653l.ads(sb, " as the serialized body of ", strYandex), m4169static(), null, abstractC8237l.yandex.smaato ? AbstractC2238l.mopub(abstractC9914lM4171synchronized.toString(), -1).toString() : null));
    }

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public final boolean m265goto(InterfaceC18035l interfaceC18035l, int i) {
        boolean z = (this.crashlytics.yandex.purchase || interfaceC18035l.firebase(i) || !interfaceC18035l.isPro(i).crashlytics()) ? false : true;
        this.subs = z;
        return z;
    }

    @Override // defpackage.AbstractC16370l
    /* JADX INFO: renamed from: new, reason: not valid java name and merged with bridge method [inline-methods] */
    public C18010l mo264class() {
        return this.billing;
    }

    @Override // defpackage.AbstractC16370l
    /* JADX INFO: renamed from: package, reason: not valid java name */
    public AbstractC9914l mo267package(String str) {
        return (AbstractC9914l) AbstractC8676l.smaato(str, mo264class());
    }

    @Override // defpackage.AbstractC16370l, defpackage.InterfaceC10726l
    public final boolean pro() {
        return !this.subs && super.pro();
    }

    @Override // defpackage.AbstractC16370l
    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public String mo268switch(InterfaceC18035l interfaceC18035l, int i) {
        AbstractC8237l abstractC8237l = this.crashlytics;
        AbstractC3644l.amazon(abstractC8237l, interfaceC18035l);
        String strAdmob = interfaceC18035l.admob(i);
        if (this.purchase.isPro && !mo264class().f35200l.keySet().contains(strAdmob)) {
            C3585l c3585l = abstractC8237l.crashlytics;
            C12242l c12242l = new C12242l(interfaceC18035l, abstractC8237l, 25);
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c3585l.f7511l;
            Map map = (Map) concurrentHashMap.get(interfaceC18035l);
            Object obj = null;
            C11140l c11140l = AbstractC3644l.yandex;
            Object objInvoke = map != null ? map.get(c11140l) : null;
            if (objInvoke == null) {
                objInvoke = null;
            }
            if (objInvoke == null) {
                objInvoke = c12242l.invoke();
                Object concurrentHashMap2 = concurrentHashMap.get(interfaceC18035l);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(interfaceC18035l, concurrentHashMap2);
                }
                ((Map) concurrentHashMap2).put(c11140l, objInvoke);
            }
            Map map2 = (Map) objInvoke;
            for (Object obj2 : mo264class().f35200l.keySet()) {
                Integer num = (Integer) map2.get((String) obj2);
                if (num != null && num.intValue() == i) {
                    obj = obj2;
                    break;
                }
            }
            String str = (String) obj;
            if (str != null) {
                return str;
            }
        }
        return strAdmob;
    }

    @Override // defpackage.AbstractC16370l, defpackage.InterfaceC14988l
    public void yandex(InterfaceC18035l interfaceC18035l) {
        Set setMopub;
        AbstractC8237l abstractC8237l = this.crashlytics;
        if (AbstractC3644l.crashlytics(abstractC8237l, interfaceC18035l) || (interfaceC18035l.billing() instanceof C0196l)) {
            return;
        }
        AbstractC3644l.amazon(abstractC8237l, interfaceC18035l);
        if (this.purchase.isPro) {
            Set setCrashlytics = AbstractC16164l.crashlytics(interfaceC18035l);
            Map map = (Map) ((ConcurrentHashMap) abstractC8237l.crashlytics.f7511l).get(interfaceC18035l);
            Object obj = map != null ? map.get(AbstractC3644l.yandex) : null;
            if (obj == null) {
                obj = null;
            }
            Map map2 = (Map) obj;
            Set setKeySet = map2 != null ? map2.keySet() : null;
            if (setKeySet == null) {
                setKeySet = C5746l.f12138l;
            }
            setMopub = AbstractC9905l.mopub(setCrashlytics, setKeySet);
        } else {
            setMopub = AbstractC16164l.crashlytics(interfaceC18035l);
        }
        for (String str : mo264class().f35200l.keySet()) {
            if (!setMopub.contains(str) && !AbstractC8576l.yandex(str, this.amazon)) {
                throw new C5114l(AbstractC2238l.crashlytics(-1, AbstractC14814l.smaato('\'', "Encountered an unknown key '", str), m4169static(), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.", abstractC8237l.yandex.smaato ? AbstractC2238l.mopub(mo264class().toString(), -1).toString() : null));
            }
        }
    }

    public C0065l(AbstractC8237l abstractC8237l, C18010l c18010l, String str, InterfaceC18035l interfaceC18035l) {
        super(abstractC8237l, str);
        this.billing = c18010l;
        this.mopub = interfaceC18035l;
    }
}
