package defpackage;

import java.io.EOFException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: lٜؗؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5011l extends AbstractC7188l {
    public static final C13850l amazon = new C13850l(0);
    public static final C13850l purchase = new C13850l(3);
    public final Object crashlytics;
    public final Object loadAd;
    public final /* synthetic */ int yandex = 0;

    public C5011l(C12952l c12952l, Type type, Type type2) {
        this.loadAd = c12952l.yandex(type);
        this.crashlytics = c12952l.yandex(type2);
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        int i = this.yandex;
        Object obj2 = this.loadAd;
        switch (i) {
            case 0:
                c3631l.billing();
                int length = Array.getLength(obj);
                for (int i2 = 0; i2 < length; i2++) {
                    ((AbstractC7188l) obj2).billing(c3631l, Array.get(obj, i2));
                }
                c3631l.vip(1, 2, ']');
                return;
            case 1:
                c3631l.mopub();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    if (entry.getKey() == null) {
                        C11467l.subscription("Map key is null at ".concat(c3631l.ads()));
                        return;
                    }
                    int iM1364package = c3631l.m1364package();
                    if (iM1364package != 5 && iM1364package != 3) {
                        C8339l.smaato("Nesting problem.");
                        return;
                    } else {
                        c3631l.f7577l = true;
                        ((AbstractC7188l) obj2).billing(c3631l, entry.getKey());
                        ((AbstractC7188l) this.crashlytics).billing(c3631l, entry.getValue());
                    }
                }
                c3631l.adcel();
                return;
            default:
                throw new IllegalArgumentException("Expected one of " + ((C16394l) obj2).amazon + " but found " + obj + ", a " + obj.getClass() + ". Register this subtype.");
        }
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        int i = this.yandex;
        Object obj = this.loadAd;
        Object obj2 = this.crashlytics;
        switch (i) {
            case 0:
                ArrayList arrayList = new ArrayList();
                c0396l.yandex();
                while (c0396l.m504package()) {
                    arrayList.add(((AbstractC7188l) obj).loadAd(c0396l));
                }
                c0396l.adcel();
                Object objNewInstance = Array.newInstance((Class<?>) obj2, arrayList.size());
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    Array.set(objNewInstance, i2, arrayList.get(i2));
                }
                return objNewInstance;
            case 1:
                C11500l c11500l = new C11500l();
                c0396l.billing();
                while (c0396l.m504package()) {
                    if (c0396l.m504package()) {
                        c0396l.f1508l = c0396l.m507switch();
                        c0396l.f1504l = 11;
                    }
                    Object objLoadAd = ((AbstractC7188l) obj).loadAd(c0396l);
                    Object objLoadAd2 = ((AbstractC7188l) obj2).loadAd(c0396l);
                    Object objPut = c11500l.put(objLoadAd, objLoadAd2);
                    if (objPut != null) {
                        StringBuilder sb = new StringBuilder("Map key '");
                        sb.append(objLoadAd);
                        String strInmobi = c0396l.inmobi();
                        sb.append("' has multiple values at path ");
                        sb.append(strInmobi);
                        sb.append(": ");
                        sb.append(objPut);
                        sb.append(" and ");
                        sb.append(objLoadAd2);
                        throw new C6451l(sb.toString(), 8, (byte) 0);
                    }
                }
                c0396l.ads();
                return c11500l;
            default:
                c0396l.m501l();
                return obj2;
        }
    }

    public String toString() {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                return ((AbstractC7188l) obj) + ".array()";
            case 1:
                return "JsonAdapter(" + ((AbstractC7188l) obj) + "=" + ((AbstractC7188l) this.crashlytics) + ")";
            default:
                return super.toString();
        }
    }

    public C5011l(C16394l c16394l, Object obj) {
        this.loadAd = c16394l;
        this.crashlytics = obj;
    }

    public C5011l(Class cls, AbstractC7188l abstractC7188l) {
        this.crashlytics = cls;
        this.loadAd = abstractC7188l;
    }
}
