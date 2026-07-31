package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lَؙٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10136l {
    public static final C10136l crashlytics = new C10136l(Collections.EMPTY_LIST, C13811l.crashlytics);
    public final C13811l loadAd;
    public final List yandex;

    public C10136l(List list, C13811l c13811l) {
        this.yandex = DesugarCollections.unmodifiableList(new ArrayList(list));
        this.loadAd = c13811l;
    }

    public static C10136l yandex(List list, C13811l c13811l) {
        AbstractC5641l.amazon(list, "qualities cannot be null");
        AbstractC5641l.amazon(c13811l, "fallbackStrategy cannot be null");
        AbstractC5641l.loadAd(!list.isEmpty(), "qualities cannot be empty");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C18680l c18680l = (C18680l) it.next();
            AbstractC5641l.loadAd(C18680l.smaato.contains(c18680l), "qualities contain invalid quality: " + c18680l);
        }
        return new C10136l(list, c13811l);
    }

    public final String toString() {
        return "QualitySelector{preferredQualities=" + this.yandex + ", fallbackStrategy=" + this.loadAd + "}";
    }
}
