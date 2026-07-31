package defpackage;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lؚٔؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14691l extends AbstractC13151l {
    public final Map amazon;
    public final InterfaceC1220l crashlytics;
    public final List loadAd;
    public final LinkedHashMap purchase;
    public final InterfaceC1388l yandex;

    public C14691l(String str, InterfaceC1388l interfaceC1388l, InterfaceC1388l[] interfaceC1388lArr, InterfaceC16588l[] interfaceC16588lArr) {
        this.yandex = interfaceC1388l;
        this.loadAd = C2580l.f5619l;
        this.crashlytics = AbstractC9968l.crashlytics(2, new C8652l(str, this, 13));
        if (interfaceC1388lArr.length != interfaceC16588lArr.length) {
            C4875l.smaato(interfaceC1388l.license(), " should be marked @Serializable", "All subclasses of sealed class ");
            throw null;
        }
        Map mapSubscription = AbstractC8676l.subscription(AbstractC8669l.m2396abstract(interfaceC1388lArr, interfaceC16588lArr));
        this.amazon = mapSubscription;
        Set<Map.Entry> setEntrySet = mapSubscription.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : setEntrySet) {
            String strYandex = ((InterfaceC16588l) entry.getValue()).purchase().yandex();
            Object obj = linkedHashMap.get(strYandex);
            if (obj == null) {
                linkedHashMap.containsKey(strYandex);
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                StringBuilder sb = new StringBuilder("Multiple sealed subclasses of '");
                sb.append(this.yandex);
                sb.append("' have the same serial name '");
                sb.append(strYandex);
                sb.append("': '");
                sb.append(entry2.getKey());
                Object key = entry.getKey();
                sb.append("', '");
                sb.append(key);
                sb.append('\'');
                throw new IllegalStateException(sb.toString().toString());
            }
            linkedHashMap.put(strYandex, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC2200l.firebase(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (InterfaceC16588l) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.purchase = linkedHashMap2;
    }

    @Override // defpackage.AbstractC13151l
    public final InterfaceC1388l admob() {
        return this.yandex;
    }

    @Override // defpackage.AbstractC13151l
    public final InterfaceC16588l billing(InterfaceC14988l interfaceC14988l, String str) {
        InterfaceC16588l interfaceC16588l = (InterfaceC16588l) this.purchase.get(str);
        if (interfaceC16588l != null) {
            return interfaceC16588l;
        }
        super.billing(interfaceC14988l, str);
        return null;
    }

    @Override // defpackage.AbstractC13151l
    public final InterfaceC16588l mopub(InterfaceC17739l interfaceC17739l, Object obj) {
        InterfaceC16588l interfaceC16588l;
        InterfaceC16588l interfaceC16588l2 = (InterfaceC16588l) this.amazon.get(AbstractC18202l.yandex.loadAd(obj.getClass()));
        if (interfaceC16588l2 != null) {
            interfaceC16588l = interfaceC16588l2;
        } else {
            super.mopub(interfaceC17739l, obj);
            interfaceC16588l = null;
        }
        if (interfaceC16588l != null) {
            return interfaceC16588l;
        }
        return null;
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return (InterfaceC18035l) this.crashlytics.getValue();
    }

    public C14691l(String str, InterfaceC1388l interfaceC1388l, InterfaceC1388l[] interfaceC1388lArr, InterfaceC16588l[] interfaceC16588lArr, Annotation[] annotationArr) {
        this(str, interfaceC1388l, interfaceC1388lArr, interfaceC16588lArr);
        this.loadAd = Arrays.asList(annotationArr);
    }
}
