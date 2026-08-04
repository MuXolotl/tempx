package defpackage;

import j$.util.DesugarCollections;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: lّۣۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12952l {
    public static final ArrayList purchase;
    public final int loadAd;
    public final List yandex;
    public final ThreadLocal crashlytics = new ThreadLocal();
    public final LinkedHashMap amazon = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList(5);
        purchase = arrayList;
        arrayList.add(AbstractC8320l.yandex);
        arrayList.add(C5079l.crashlytics);
        arrayList.add(C5011l.purchase);
        arrayList.add(C5011l.amazon);
        arrayList.add(AbstractC1623l.yandex);
        arrayList.add(C16787l.amazon);
    }

    public C12952l(C7375l c7375l) {
        ArrayList arrayList = c7375l.loadAd;
        int size = arrayList.size();
        ArrayList arrayList2 = purchase;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size);
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        this.yandex = DesugarCollections.unmodifiableList(arrayList3);
        this.loadAd = c7375l.yandex;
    }

    public final C7375l crashlytics() {
        int i = 0;
        C7375l c7375l = new C7375l(0);
        while (true) {
            List list = this.yandex;
            ArrayList arrayList = c7375l.loadAd;
            int i2 = this.loadAd;
            if (i >= i2) {
                int size = list.size() - purchase.size();
                while (i2 < size) {
                    InterfaceC5644l interfaceC5644l = (InterfaceC5644l) list.get(i2);
                    if (interfaceC5644l == null) {
                        C8339l.metrica("factory == null");
                        return null;
                    }
                    arrayList.add(interfaceC5644l);
                    i2++;
                }
                return c7375l;
            }
            InterfaceC5644l interfaceC5644l2 = (InterfaceC5644l) list.get(i);
            if (interfaceC5644l2 == null) {
                C8339l.metrica("factory == null");
                return null;
            }
            int i3 = c7375l.yandex;
            c7375l.yandex = i3 + 1;
            arrayList.add(i3, interfaceC5644l2);
            i++;
        }
    }

    public final AbstractC7188l loadAd(Type type, Set set, String str) {
        AbstractC7188l abstractC7188l = null;
        if (type == null) {
            C6541l.subs("type == null");
            return null;
        }
        if (set == null) {
            C6541l.subs("annotations == null");
            return null;
        }
        Type typeYandex = AbstractC7694l.yandex(type);
        if (typeYandex instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) typeYandex;
            if (wildcardType.getLowerBounds().length == 0) {
                Type[] upperBounds = wildcardType.getUpperBounds();
                if (upperBounds.length != 1) {
                    C11983l.crashlytics();
                    return null;
                }
                typeYandex = upperBounds[0];
            }
        }
        Object objAsList = set.isEmpty() ? typeYandex : Arrays.asList(typeYandex, set);
        synchronized (this.amazon) {
            try {
                AbstractC7188l abstractC7188l2 = (AbstractC7188l) this.amazon.get(objAsList);
                if (abstractC7188l2 != null) {
                    return abstractC7188l2;
                }
                C11464l c11464l = (C11464l) this.crashlytics.get();
                if (c11464l == null) {
                    c11464l = new C11464l(this);
                    this.crashlytics.set(c11464l);
                }
                ArrayDeque arrayDeque = c11464l.loadAd;
                ArrayList arrayList = c11464l.yandex;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        C15945l c15945l = new C15945l(typeYandex, str, objAsList);
                        arrayList.add(c15945l);
                        arrayDeque.add(c15945l);
                        break;
                    }
                    C15945l c15945l2 = (C15945l) arrayList.get(i);
                    if (c15945l2.crashlytics.equals(objAsList)) {
                        arrayDeque.add(c15945l2);
                        abstractC7188l = c15945l2.amazon;
                        if (abstractC7188l != null) {
                            break;
                        }
                        abstractC7188l = c15945l2;
                        break;
                    }
                    i++;
                }
                try {
                    if (abstractC7188l != null) {
                        c11464l.loadAd(false);
                        return abstractC7188l;
                    }
                    try {
                        int size2 = this.yandex.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            AbstractC7188l abstractC7188lYandex = ((InterfaceC5644l) this.yandex.get(i2)).yandex(typeYandex, set, this);
                            if (abstractC7188lYandex != null) {
                                ((C15945l) c11464l.loadAd.getLast()).amazon = abstractC7188lYandex;
                                c11464l.loadAd(true);
                                return abstractC7188lYandex;
                            }
                        }
                        throw new IllegalArgumentException("No JsonAdapter for " + AbstractC7694l.admob(typeYandex, set));
                    } catch (IllegalArgumentException e) {
                        throw c11464l.yandex(e);
                    }
                } catch (Throwable th) {
                    c11464l.loadAd(false);
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final AbstractC7188l yandex(Type type) {
        return loadAd(type, AbstractC7694l.yandex, null);
    }
}
