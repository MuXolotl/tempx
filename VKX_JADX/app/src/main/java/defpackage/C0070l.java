package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lَؑؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0070l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC8028l f973l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f974l;

    public /* synthetic */ C0070l(AbstractC8028l abstractC8028l, int i) {
        this.f974l = i;
        this.f973l = abstractC8028l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f974l;
        AbstractC8028l abstractC8028l = this.f973l;
        switch (i) {
            case 0:
                C18186l c18186l = C18186l.remoteconfig;
                InterfaceC7637l.yandex.getClass();
                C1490l c1490l = C1490l.f3722l;
                List list = c18186l.yandex;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                boolean zYandex = c18186l.yandex(C18186l.smaato);
                EnumC11300l enumC11300l = EnumC11300l.f22779l;
                if (zYandex) {
                    Iterator it = abstractC8028l.admob(c18186l, c1490l).iterator();
                    while (it.hasNext()) {
                        AbstractC3324l.crashlytics(linkedHashSet, abstractC8028l.purchase((C3498l) it.next(), enumC11300l));
                    }
                }
                if (c18186l.yandex(C18186l.subs) && !list.contains(C18510l.yandex)) {
                    Iterator it2 = abstractC8028l.subs(c18186l, c1490l).iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.addAll(abstractC8028l.yandex((C3498l) it2.next(), enumC11300l));
                    }
                }
                if (c18186l.yandex(C18186l.isPro) && !list.contains(C18510l.yandex)) {
                    Iterator it3 = abstractC8028l.metrica().iterator();
                    while (it3.hasNext()) {
                        linkedHashSet.addAll(abstractC8028l.billing((C3498l) it3.next(), enumC11300l));
                    }
                }
                return AbstractC16901l.m4213const(linkedHashSet);
            case 1:
                return abstractC8028l.firebase();
            case 2:
                return abstractC8028l.subs(C18186l.startapp, null);
            case 3:
                C13772l c13772l = C18186l.crashlytics;
                return abstractC8028l.metrica();
            default:
                return abstractC8028l.admob(C18186l.metrica, null);
        }
    }
}
