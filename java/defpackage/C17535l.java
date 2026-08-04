package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٗۥٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17535l {
    public final AbstractMap loadAd;
    public final /* synthetic */ int yandex;

    public C17535l(int i) {
        this.yandex = i;
        switch (i) {
            case 1:
                this.loadAd = new HashMap();
                break;
            default:
                this.loadAd = new ConcurrentHashMap();
                break;
        }
    }

    public final List amazon() {
        return AbstractC16901l.m4213const(purchase().keySet());
    }

    public final Object billing(C11911l c11911l) {
        return purchase().get(c11911l);
    }

    public final Object crashlytics(C11911l c11911l) {
        Object objBilling = billing(c11911l);
        if (objBilling != null) {
            return objBilling;
        }
        C11983l.ad(c11911l, "No instance for key ");
        return null;
    }

    public final boolean loadAd(C11911l c11911l) {
        return purchase().containsKey(c11911l);
    }

    public final void mopub(C11911l c11911l, Object obj) {
        purchase().put(c11911l, obj);
    }

    public final Map purchase() {
        switch (this.yandex) {
            case 0:
                return (ConcurrentHashMap) this.loadAd;
            default:
                return (HashMap) this.loadAd;
        }
    }

    public final Object yandex(C11911l c11911l, Function0 function0) {
        int i = this.yandex;
        AbstractMap abstractMap = this.loadAd;
        switch (i) {
            case 0:
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) abstractMap;
                Object obj = concurrentHashMap.get(c11911l);
                if (obj != null) {
                    return obj;
                }
                Object objInvoke = function0.invoke();
                Object objPutIfAbsent = concurrentHashMap.putIfAbsent(c11911l, objInvoke);
                return objPutIfAbsent == null ? objInvoke : objPutIfAbsent;
            default:
                HashMap map = (HashMap) abstractMap;
                Object obj2 = map.get(c11911l);
                if (obj2 != null) {
                    return obj2;
                }
                Object objInvoke2 = function0.invoke();
                Object objPut = map.put(c11911l, objInvoke2);
                return objPut == null ? objInvoke2 : objPut;
        }
    }
}
