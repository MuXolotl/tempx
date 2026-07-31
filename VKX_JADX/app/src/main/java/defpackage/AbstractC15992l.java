package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lٕۡۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15992l implements InterfaceC11455l {
    public static final C13975l crashlytics;
    public final HashMap loadAd = new HashMap();
    public final boolean yandex;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        crashlytics = new C13975l(4);
    }

    public AbstractC15992l(ArrayList arrayList, boolean z) {
        this.yandex = z;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                InterfaceC11455l interfaceC11455l = (InterfaceC11455l) ((Class) it.next()).newInstance();
                for (C4421l c4421l : interfaceC11455l.yandex()) {
                    this.loadAd.put(c4421l, interfaceC11455l);
                }
            } catch (IllegalAccessException | InstantiationException unused) {
                EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
                crashlytics.getClass();
                int i = C17500l.yandex;
            }
        }
    }

    @Override // defpackage.InterfaceC11455l
    /* JADX INFO: renamed from: amazon, reason: merged with bridge method [inline-methods] */
    public final AbstractC2058l loadAd(C4421l c4421l, FilterInputStream filterInputStream, long j) throws IOException {
        long j2;
        C1109l c1109lLoadAd;
        C16045l c16045l = new C16045l(filterInputStream, 1);
        if (!Arrays.asList(yandex()).contains(c4421l)) {
            C8339l.metrica("provided GUID is not supported by this reader.");
            return null;
        }
        AbstractC2058l abstractC2058lCrashlytics = crashlytics(j, AbstractC3848l.crashlytics(c16045l), c16045l);
        synchronized (c16045l) {
            j2 = c16045l.f31436l;
        }
        long jLongValue = j2 + j + 16;
        HashSet hashSet = new HashSet();
        while (jLongValue < abstractC2058lCrashlytics.yandex.longValue() + abstractC2058lCrashlytics.crashlytics) {
            C4421l c4421lAmazon = AbstractC3848l.amazon(c16045l);
            boolean z = this.yandex && !(this.loadAd.containsKey(c4421lAmazon) && hashSet.add(c4421lAmazon));
            if (z || !this.loadAd.containsKey(c4421lAmazon)) {
                c1109lLoadAd = C0068l.loadAd.loadAd(c4421lAmazon, c16045l, jLongValue);
            } else {
                ((InterfaceC11455l) this.loadAd.get(c4421lAmazon)).getClass();
                c1109lLoadAd = ((InterfaceC11455l) this.loadAd.get(c4421lAmazon)).loadAd(c4421lAmazon, c16045l, jLongValue);
            }
            if (c1109lLoadAd == null) {
                c16045l.reset();
            } else {
                C4421l c4421l2 = c1109lLoadAd.loadAd;
                if (!z) {
                    Hashtable hashtable = abstractC2058lCrashlytics.amazon;
                    List arrayList = (List) hashtable.get(c4421l2);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        hashtable.put(c4421l2, arrayList);
                    }
                    if (!arrayList.isEmpty() && !AbstractC2058l.purchase.contains(c4421l2)) {
                        C8339l.metrica("The GUID of the given chunk indicates, that there is no more instance allowed.");
                        return null;
                    }
                    arrayList.add(c1109lLoadAd);
                }
                jLongValue = c1109lLoadAd.yandex.longValue() + c1109lLoadAd.crashlytics;
            }
        }
        return abstractC2058lCrashlytics;
    }

    public abstract AbstractC2058l crashlytics(long j, BigInteger bigInteger, C16045l c16045l);
}
