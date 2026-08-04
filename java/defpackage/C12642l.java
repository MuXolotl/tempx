package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: lّٖۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12642l {
    public static final double admob = Math.sqrt(2.3703703703703702d);
    public final HashSet amazon;
    public final InterfaceC15879l billing;
    public final Rational crashlytics;
    public final Rational loadAd;
    public final HashMap mopub;
    public final C1577l purchase;
    public final Size yandex;

    public C12642l(InterfaceC18690l interfaceC18690l, HashSet hashSet) {
        Size sizeBilling = AbstractC18611l.billing(interfaceC18690l.adcel().firebase());
        InterfaceC15879l interfaceC15879lAdcel = interfaceC18690l.adcel();
        C1577l c1577l = new C1577l(interfaceC15879lAdcel, sizeBilling);
        this.mopub = new HashMap();
        this.yandex = sizeBilling;
        Rational rational = ((double) sizeBilling.getWidth()) / ((double) sizeBilling.getHeight()) > admob ? AbstractC14608l.crashlytics : AbstractC14608l.yandex;
        AbstractC5088l.yandex("ResolutionsMerger", "The closer aspect ratio to the sensor size (" + sizeBilling + ") is " + rational + ".");
        this.loadAd = rational;
        Rational rational2 = AbstractC14608l.yandex;
        if (rational.equals(rational2)) {
            rational2 = AbstractC14608l.crashlytics;
        } else if (!rational.equals(AbstractC14608l.crashlytics)) {
            C1759l.ads(rational, "Invalid sensor aspect-ratio: ");
            throw null;
        }
        this.crashlytics = rational2;
        this.billing = interfaceC15879lAdcel;
        this.amazon = hashSet;
        this.purchase = c1577l;
    }

    public static Rational admob(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    public static boolean amazon(Size size, Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }

    public static Rect yandex(Size size, Size size2) {
        RectF rectF;
        RectF rectF2;
        Rational rationalAdmob = admob(size2);
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rationalAdmob2 = admob(size);
        if (rationalAdmob.floatValue() == rationalAdmob2.floatValue()) {
            rectF2 = new RectF(0.0f, 0.0f, width, height);
        } else {
            if (rationalAdmob.floatValue() > rationalAdmob2.floatValue()) {
                float f = width;
                float fFloatValue = f / rationalAdmob.floatValue();
                float f2 = (height - fFloatValue) / 2.0f;
                rectF = new RectF(0.0f, f2, f, fFloatValue + f2);
            } else {
                float f3 = height;
                float fFloatValue2 = rationalAdmob.floatValue() * f3;
                float f4 = (width - fFloatValue2) / 2.0f;
                rectF = new RectF(f4, 0.0f, fFloatValue2 + f4, f3);
            }
            rectF2 = rectF;
        }
        Rect rect = new Rect();
        rectF2.round(rect);
        return rect;
    }

    public final ArrayList billing(List list, boolean z) {
        List arrayList;
        HashMap map = new HashMap();
        Rational rational = AbstractC14608l.yandex;
        map.put(rational, new ArrayList());
        Rational rational2 = AbstractC14608l.crashlytics;
        map.put(rational2, new ArrayList());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(rational);
        arrayList2.add(rational2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (size.getHeight() > 0) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        arrayList = null;
                        break;
                    }
                    Rational rational3 = (Rational) it2.next();
                    if (AbstractC14608l.yandex(size, rational3, AbstractC5513l.crashlytics)) {
                        arrayList = (List) map.get(rational3);
                        break;
                    }
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    Rational rationalAdmob = admob(size);
                    arrayList2.add(rationalAdmob);
                    map.put(rationalAdmob, arrayList);
                }
                arrayList.add(size);
            }
        }
        ArrayList<Rational> arrayList3 = new ArrayList(map.keySet());
        Collections.sort(arrayList3, new C0323l(2, admob(this.yandex)));
        ArrayList arrayList4 = new ArrayList();
        for (Rational rational4 : arrayList3) {
            if (!rational4.equals(AbstractC14608l.crashlytics) && !rational4.equals(AbstractC14608l.yandex)) {
                List list2 = (List) map.get(rational4);
                Objects.requireNonNull(list2);
                arrayList4.addAll(mopub(rational4, list2, z));
            }
        }
        return arrayList4;
    }

    public final List crashlytics(InterfaceC0048l interfaceC0048l) {
        Rational rationalAdmob;
        if (!this.amazon.contains(interfaceC0048l)) {
            C1759l.ads(interfaceC0048l, "Invalid child config: ");
            return null;
        }
        HashMap map = this.mopub;
        if (map.containsKey(interfaceC0048l)) {
            List list = (List) map.get(interfaceC0048l);
            Objects.requireNonNull(list);
            return list;
        }
        List listAdmob = this.purchase.admob(interfaceC0048l);
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Size size : (ArrayList) listAdmob) {
            Iterator it = map2.keySet().iterator();
            do {
                if (!it.hasNext()) {
                    rationalAdmob = null;
                    break;
                }
                rationalAdmob = (Rational) it.next();
                Rational rational = AbstractC14608l.yandex;
            } while (!AbstractC14608l.yandex(size, rationalAdmob, AbstractC5513l.crashlytics));
            if (rationalAdmob != null) {
                Size size2 = (Size) map2.get(rationalAdmob);
                Objects.requireNonNull(size2);
                if (size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth() || (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight())) {
                }
            } else {
                rationalAdmob = admob(size);
            }
            arrayList.add(size);
            map2.put(rationalAdmob, size);
        }
        map.put(interfaceC0048l, arrayList);
        return arrayList;
    }

    public final C6826l loadAd(InterfaceC0048l interfaceC0048l, Rect rect, int i, boolean z) {
        boolean z2;
        Size size;
        Size size2;
        Pair pairCreate;
        if (AbstractC18611l.crashlytics(i)) {
            z2 = true;
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
        } else {
            z2 = false;
        }
        if (z) {
            Size sizeBilling = AbstractC18611l.billing(rect);
            Iterator it = crashlytics(interfaceC0048l).iterator();
            while (true) {
                if (!it.hasNext()) {
                    pairCreate = Pair.create(sizeBilling, sizeBilling);
                    break;
                }
                Size size3 = (Size) it.next();
                Size sizeBilling2 = AbstractC18611l.billing(yandex(size3, sizeBilling));
                if (!amazon(sizeBilling2, sizeBilling)) {
                    pairCreate = Pair.create(size3, sizeBilling2);
                    break;
                }
            }
            size = (Size) pairCreate.first;
            size2 = (Size) pairCreate.second;
        } else {
            Size sizeBilling3 = AbstractC18611l.billing(rect);
            List listCrashlytics = crashlytics(interfaceC0048l);
            Iterator it2 = listCrashlytics.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    Iterator it3 = listCrashlytics.iterator();
                    do {
                        if (!it3.hasNext()) {
                            size = sizeBilling3;
                            break;
                        }
                        size = (Size) it3.next();
                    } while (amazon(size, sizeBilling3));
                } else {
                    Size size4 = (Size) it2.next();
                    Rational rationalAdmob = AbstractC14608l.yandex;
                    Size size5 = AbstractC5513l.crashlytics;
                    if (!AbstractC14608l.yandex(sizeBilling3, rationalAdmob, size5)) {
                        rationalAdmob = AbstractC14608l.crashlytics;
                        if (!AbstractC14608l.yandex(sizeBilling3, rationalAdmob, size5)) {
                            rationalAdmob = admob(sizeBilling3);
                        }
                    }
                    if (!purchase(rationalAdmob, size4) && !amazon(size4, sizeBilling3)) {
                        size = size4;
                        break;
                    }
                }
            }
            rect = yandex(sizeBilling3, size);
            size2 = size;
        }
        return z2 ? new C6826l(new Rect(rect.top, rect.left, rect.bottom, rect.right), new Size(size2.getHeight(), size2.getWidth()), size) : new C6826l(rect, size2, size);
    }

    public final ArrayList mopub(Rational rational, List list, boolean z) {
        ArrayList arrayList;
        ArrayList<Size> arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational2 = AbstractC14608l.yandex;
            if (AbstractC14608l.yandex(size, rational, AbstractC5513l.crashlytics)) {
                arrayList2.add(size);
            }
        }
        Collections.sort(arrayList2, new C16027l(true));
        HashSet hashSet = new HashSet(arrayList2);
        Iterator it2 = this.amazon.iterator();
        while (it2.hasNext()) {
            List<Size> listCrashlytics = crashlytics((InterfaceC0048l) it2.next());
            if (!z) {
                ArrayList arrayList3 = new ArrayList();
                for (Size size2 : listCrashlytics) {
                    if (!purchase(rational, size2)) {
                        arrayList3.add(size2);
                    }
                }
                listCrashlytics = arrayList3;
            }
            if (listCrashlytics.isEmpty()) {
                return new ArrayList();
            }
            if (listCrashlytics.isEmpty() || arrayList2.isEmpty()) {
                arrayList2 = new ArrayList();
            } else {
                ArrayList arrayList4 = new ArrayList();
                for (Size size3 : arrayList2) {
                    Iterator it3 = listCrashlytics.iterator();
                    while (it3.hasNext()) {
                        if (!amazon((Size) it3.next(), size3)) {
                            arrayList4.add(size3);
                            break;
                        }
                    }
                }
                arrayList2 = arrayList4;
            }
            if (listCrashlytics.isEmpty() || arrayList2.isEmpty()) {
                arrayList = new ArrayList();
            } else {
                ArrayList<Size> arrayList5 = arrayList2.isEmpty() ? arrayList2 : new ArrayList(new LinkedHashSet(arrayList2));
                arrayList = new ArrayList();
                for (Size size4 : arrayList5) {
                    Iterator it4 = listCrashlytics.iterator();
                    do {
                        if (!it4.hasNext()) {
                            arrayList.add(size4);
                            break;
                        }
                    } while (!amazon((Size) it4.next(), size4));
                }
                if (!arrayList.isEmpty()) {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
            hashSet.retainAll(arrayList);
        }
        ArrayList arrayList6 = new ArrayList();
        for (Size size5 : arrayList2) {
            if (!hashSet.contains(size5)) {
                arrayList6.add(size5);
            }
        }
        return arrayList6;
    }

    public final boolean purchase(Rational rational, Size size) {
        Rational rational2 = this.loadAd;
        if (rational2.equals(rational)) {
            return false;
        }
        Rational rational3 = AbstractC14608l.yandex;
        Size size2 = AbstractC5513l.crashlytics;
        if (AbstractC14608l.yandex(size, rational, size2)) {
            return false;
        }
        float fFloatValue = rational2.floatValue();
        float fFloatValue2 = rational.floatValue();
        Rational rationalAdmob = AbstractC14608l.yandex;
        if (!AbstractC14608l.yandex(size, rationalAdmob, size2)) {
            rationalAdmob = AbstractC14608l.crashlytics;
            if (!AbstractC14608l.yandex(size, rationalAdmob, size2)) {
                rationalAdmob = admob(size);
            }
        }
        float fFloatValue3 = rationalAdmob.floatValue();
        if (fFloatValue == fFloatValue2 || fFloatValue2 == fFloatValue3) {
            return false;
        }
        if (fFloatValue > fFloatValue2) {
            return fFloatValue2 < fFloatValue3;
        }
        return fFloatValue2 > fFloatValue3;
    }
}
