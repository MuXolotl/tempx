package defpackage;

import android.util.Size;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: lٍٚٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9656l implements InterfaceC2360l {
    public final List amazon;
    public final InterfaceC15879l crashlytics;
    public final C4835l purchase;
    public final C8688l billing = new C8688l(new C13802l(23, this));
    public final LinkedHashMap mopub = new LinkedHashMap();

    public C9656l(InterfaceC15879l interfaceC15879l, List list, C4835l c4835l) {
        this.crashlytics = interfaceC15879l;
        this.amazon = list;
        this.purchase = c4835l;
    }

    public static C6410l crashlytics(C9656l c9656l, int i, int i2, int i3) {
        return new C6410l(2, "video/avc", i3, 30, i, i2, -1, 8, 0, 0);
    }

    public final InterfaceC15313l amazon(int i) {
        int i2;
        Object next;
        int i3;
        C6410l c6410lCrashlytics;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.mopub;
        if (linkedHashMap.containsKey(numValueOf)) {
            return (InterfaceC15313l) linkedHashMap.get(Integer.valueOf(i));
        }
        Iterator it = this.amazon.iterator();
        do {
            if (!it.hasNext()) {
                i2 = i;
                next = null;
                break;
            }
            next = it.next();
            i2 = i;
        } while (((C18680l) next).yandex != i2);
        C18680l c18680l = next instanceof C18680l ? (C18680l) next : null;
        if (c18680l != null) {
            Iterator it2 = c18680l.amazon.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    c6410lCrashlytics = null;
                    break;
                }
                Size size = (Size) it2.next();
                if (((List) this.billing.getValue()).contains(size)) {
                    int width = size.getWidth();
                    int height = size.getHeight();
                    if (c18680l.equals(C18680l.admob)) {
                        i3 = 40000000;
                    } else if (c18680l.equals(C18680l.mopub)) {
                        i3 = 10000000;
                    } else if (c18680l.equals(C18680l.billing)) {
                        i3 = 4000000;
                    } else {
                        if (!c18680l.equals(C18680l.purchase)) {
                            C1759l.ads(c18680l, "Undefined bitrate for quality: ");
                            return null;
                        }
                        i3 = 2000000;
                    }
                    c6410lCrashlytics = crashlytics(this, width, height, i3);
                    InterfaceC13662l interfaceC13662lYandex = this.purchase.yandex("video/avc");
                    if (interfaceC13662lYandex != null && interfaceC13662lYandex.inmobi(width, height)) {
                        Integer num = (Integer) interfaceC13662lYandex.mo1977throw().clamp(Integer.valueOf(i3));
                        if (num == null || num.intValue() != i3) {
                            c6410lCrashlytics = crashlytics(this, width, height, num.intValue());
                        }
                    } else {
                        c6410lCrashlytics = null;
                    }
                    if (c6410lCrashlytics != null) {
                        break;
                    }
                }
            }
        } else {
            c6410lCrashlytics = null;
            break;
        }
        C9550l c9550lPurchase = c6410lCrashlytics != null ? C9550l.purchase(60, 2, Collections.singletonList(new C12539l(3, 96000, 44100, 1, 2, "audio/mp4a-latm")), Collections.singletonList(c6410lCrashlytics)) : null;
        linkedHashMap.put(Integer.valueOf(i2), c9550lPurchase);
        return c9550lPurchase;
    }

    @Override // defpackage.InterfaceC2360l
    public final InterfaceC15313l loadAd(int i) {
        return amazon(i);
    }

    @Override // defpackage.InterfaceC2360l
    public final boolean yandex(int i) {
        return amazon(i) != null;
    }
}
