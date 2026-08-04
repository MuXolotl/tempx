package defpackage;

import android.util.Size;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: lَؗۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4805l {
    public final C5680l amazon;
    public final C5680l crashlytics;
    public final LinkedHashMap yandex = new LinkedHashMap();
    public final TreeMap loadAd = new TreeMap(new C16027l(false));

    public C4805l(C9075l c9075l, int i) {
        C18680l c18680l = C18680l.purchase;
        Iterator it = new ArrayList(C18680l.remoteconfig).iterator();
        while (true) {
            C5680l c5680l = null;
            if (!it.hasNext()) {
                break;
            }
            C18680l c18680l2 = (C18680l) it.next();
            AbstractC5641l.purchase("Currently only support ConstantQuality", c18680l2 instanceof C18680l);
            InterfaceC15313l interfaceC15313lAmazon = c9075l.amazon(c18680l2.yandex(i));
            if (interfaceC15313lAmazon != null) {
                AbstractC5088l.yandex("CapabilitiesByQuality", "profiles = " + interfaceC15313lAmazon);
                if (!interfaceC15313lAmazon.amazon().isEmpty()) {
                    int iYandex = interfaceC15313lAmazon.yandex();
                    int iLoadAd = interfaceC15313lAmazon.loadAd();
                    List listCrashlytics = interfaceC15313lAmazon.crashlytics();
                    List listAmazon = interfaceC15313lAmazon.amazon();
                    AbstractC5641l.loadAd(!listAmazon.isEmpty(), "Should contain at least one VideoProfile.");
                    c5680l = new C5680l(iYandex, iLoadAd, DesugarCollections.unmodifiableList(new ArrayList(listCrashlytics)), DesugarCollections.unmodifiableList(new ArrayList(listAmazon)), listCrashlytics.isEmpty() ? null : (C12539l) listCrashlytics.get(0), (C6410l) listAmazon.get(0));
                }
                if (c5680l == null) {
                    AbstractC5088l.tapsense("CapabilitiesByQuality", "EncoderProfiles of quality " + c18680l2 + " has no video validated profiles.");
                } else {
                    this.loadAd.put(c5680l.billing.yandex(), c18680l2);
                    this.yandex.put(c18680l2, c5680l);
                }
            }
        }
        if (this.yandex.isEmpty()) {
            AbstractC5088l.crashlytics("CapabilitiesByQuality", "No supported EncoderProfiles");
            this.amazon = null;
            this.crashlytics = null;
        } else {
            ArrayDeque arrayDeque = new ArrayDeque(this.yandex.values());
            this.crashlytics = (C5680l) arrayDeque.peekFirst();
            this.amazon = (C5680l) arrayDeque.peekLast();
        }
    }

    public final C5680l loadAd(C18680l c18680l) {
        AbstractC5641l.loadAd(C18680l.smaato.contains(c18680l), "Unknown quality: " + c18680l);
        if (c18680l == C18680l.isPro) {
            return this.crashlytics;
        }
        return c18680l == C18680l.subs ? this.amazon : (C5680l) this.yandex.get(c18680l);
    }

    public final C5680l yandex(Size size) {
        Object value;
        Size size2 = AbstractC5513l.yandex;
        TreeMap treeMap = this.loadAd;
        Map.Entry entryCeilingEntry = treeMap.ceilingEntry(size);
        if (entryCeilingEntry != null) {
            value = entryCeilingEntry.getValue();
        } else {
            Map.Entry entryFloorEntry = treeMap.floorEntry(size);
            value = entryFloorEntry != null ? entryFloorEntry.getValue() : null;
        }
        C18680l c18680l = (C18680l) value;
        if (c18680l == null) {
            c18680l = C18680l.firebase;
        }
        AbstractC5088l.yandex("CapabilitiesByQuality", "Using supported quality of " + c18680l + " for size " + size);
        if (c18680l != C18680l.firebase) {
            C5680l c5680lLoadAd = loadAd(c18680l);
            if (c5680lLoadAd != null) {
                return c5680lLoadAd;
            }
            C8339l.subs("Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
        }
        return null;
    }
}
