package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.media.MediaCodec;
import android.util.Range;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: lُٖۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11419l extends AbstractC10078l {
    public final C14706l isPro = new C14706l(6);
    public boolean firebase = true;
    public final StringBuilder smaato = new StringBuilder();
    public boolean remoteconfig = false;
    public final ArrayList vip = new ArrayList();

    public final boolean crashlytics() {
        return this.remoteconfig && this.firebase;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0078  */
    /* JADX WARN: Code duplicated, block: B:36:0x0095  */
    /* JADX WARN: Code duplicated, block: B:38:0x0098 A[EDGE_INSN: B:38:0x0098->B:39:0x00cb BREAK  A[LOOP:0: B:16:0x0036->B:48:?]] */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x0098, please report this as an issue */
    public final C10814l loadAd() {
        Range rangeIsVip;
        if (!this.firebase) {
            C8339l.metrica("Unsupported session configuration combination");
            return null;
        }
        ArrayList arrayList = new ArrayList(this.yandex);
        C14706l c14706l = this.isPro;
        if (c14706l.f28767l) {
            Collections.sort(arrayList, new C9933l(4, c14706l));
        }
        int i = this.admob;
        int i2 = 2;
        C9598l c9598l = this.loadAd;
        if (i == 1 && arrayList.size() == 2 && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (AbstractC8576l.yandex(((C14113l) it.next()).yandex.isPro, MediaCodec.class)) {
                    HashSet hashSet = (HashSet) c9598l.f19549l;
                    if (!hashSet.isEmpty()) {
                        Iterator it2 = hashSet.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                rangeIsVip = c9598l.isVip();
                                if (rangeIsVip != null) {
                                    break;
                                }
                                if (((Number) rangeIsVip.getUpper()).intValue() >= 120) {
                                    rangeIsVip = null;
                                } else {
                                    rangeIsVip = null;
                                }
                                if (rangeIsVip != null) {
                                    break;
                                }
                                Range range = new Range(30, rangeIsVip.getUpper());
                                AbstractC5088l.yandex("HighSpeedFpsModifier", "Modified high-speed FPS range from " + rangeIsVip + " to " + range);
                                ((C5104l) c9598l.f19553l).mopub(C0665l.billing, range);
                                break;
                            }
                            if (AbstractC8576l.yandex(((AbstractC0958l) it2.next()).isPro, MediaCodec.class)) {
                                break;
                            }
                        }
                    } else {
                        rangeIsVip = c9598l.isVip();
                        if (rangeIsVip != null) {
                            break;
                        }
                        if (((Number) rangeIsVip.getUpper()).intValue() >= 120 || !AbstractC8576l.yandex(rangeIsVip.getLower(), rangeIsVip.getUpper())) {
                            rangeIsVip = null;
                        }
                        if (rangeIsVip != null) {
                            break;
                        }
                        Range range2 = new Range(30, rangeIsVip.getUpper());
                        AbstractC5088l.yandex("HighSpeedFpsModifier", "Modified high-speed FPS range from " + rangeIsVip + " to " + range2);
                        ((C5104l) c9598l.f19553l).mopub(C0665l.billing, range2);
                        break;
                    }
                }
            }
        }
        return new C10814l(arrayList, new ArrayList(this.crashlytics), new ArrayList(this.amazon), new ArrayList(this.purchase), c9598l.pro(), this.vip.isEmpty() ? null : new C12717l(i2, this), this.mopub, this.admob, this.subs);
    }

    public final void yandex(C10814l c10814l) {
        C0665l c0665l = c10814l.mopub;
        int i = c0665l.crashlytics;
        C7420l c7420l = c0665l.loadAd;
        C9598l c9598l = this.loadAd;
        if (i != -1) {
            this.remoteconfig = true;
            int i2 = c9598l.f19550l;
            List list = C10814l.isPro;
            if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
            c9598l.f19550l = i;
        }
        Range rangeYandex = c0665l.yandex();
        Range range = C5464l.admob;
        boolean zEquals = rangeYandex.equals(range);
        StringBuilder sb = this.smaato;
        if (!zEquals) {
            if (c9598l.isVip().equals(range)) {
                ((C5104l) c9598l.f19553l).mopub(C0665l.billing, rangeYandex);
            } else if (!c9598l.isVip().equals(rangeYandex)) {
                this.firebase = false;
                String str = "Different ExpectedFrameRateRange values; current = " + c9598l.isVip() + ", new = " + rangeYandex;
                AbstractC5088l.crashlytics("ValidatingBuilder", str);
                sb.append(str);
            }
        }
        C6916l c6916l = InterfaceC0048l.f918l;
        Integer num = (Integer) c7420l.smaato(c6916l, 0);
        Objects.requireNonNull(num);
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            c9598l.getClass();
            if (iIntValue != 0) {
                ((C5104l) c9598l.f19553l).mopub(c6916l, num);
            }
        }
        C6916l c6916l2 = InterfaceC0048l.f921l;
        Integer num2 = (Integer) c7420l.smaato(c6916l2, 0);
        Objects.requireNonNull(num2);
        int iIntValue2 = num2.intValue();
        if (iIntValue2 != 0) {
            c9598l.getClass();
            if (iIntValue2 != 0) {
                ((C5104l) c9598l.f19553l).mopub(c6916l2, num2);
            }
        }
        C12920l c12920l = c0665l.purchase;
        C12815l c12815l = (C12815l) c9598l.f19554l;
        HashSet hashSet = (HashSet) c9598l.f19549l;
        c12815l.yandex.putAll((Map) c12920l.yandex);
        this.crashlytics.addAll(c10814l.crashlytics);
        this.amazon.addAll(c10814l.amazon);
        c9598l.billing(c0665l.amazon);
        this.purchase.addAll(c10814l.purchase);
        InterfaceC1837l interfaceC1837l = c10814l.billing;
        if (interfaceC1837l != null) {
            this.vip.add(interfaceC1837l);
        }
        InputConfiguration inputConfiguration = c10814l.subs;
        if (inputConfiguration != null) {
            this.mopub = inputConfiguration;
        }
        ArrayList arrayList = c10814l.yandex;
        LinkedHashSet<C14113l> linkedHashSet = this.yandex;
        linkedHashSet.addAll(arrayList);
        hashSet.addAll(DesugarCollections.unmodifiableList(c0665l.yandex));
        ArrayList arrayList2 = new ArrayList();
        for (C14113l c14113l : linkedHashSet) {
            arrayList2.add(c14113l.yandex);
            Iterator it = c14113l.loadAd.iterator();
            while (it.hasNext()) {
                arrayList2.add((AbstractC0958l) it.next());
            }
        }
        if (!arrayList2.containsAll(hashSet)) {
            AbstractC5088l.yandex("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
            this.firebase = false;
            sb.append("Invalid configuration due to capture request surfaces are not a subset of surfaces");
        }
        int i3 = c10814l.admob;
        int i4 = this.admob;
        if (i3 != i4 && i3 != 0 && i4 != 0) {
            AbstractC5088l.yandex("ValidatingBuilder", "Invalid configuration due to that two non-default session types are set");
            this.firebase = false;
            sb.append("Invalid configuration due to that two non-default session types are set");
        } else if (i3 != 0) {
            this.admob = i3;
        }
        C14113l c14113l2 = c10814l.loadAd;
        if (c14113l2 != null) {
            C14113l c14113l3 = this.subs;
            if (c14113l3 == c14113l2 || c14113l3 == null) {
                this.subs = c14113l2;
            } else {
                AbstractC5088l.yandex("ValidatingBuilder", "Invalid configuration due to that two different postview output configs are set");
                this.firebase = false;
                sb.append("Invalid configuration due to that two different postview output configs are set");
            }
        }
        c9598l.license(c7420l);
    }
}
